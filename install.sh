#!/bin/bash

BASEPATH=$(cd ..; pwd)
#MENTOR=ynikolaiko
#SRC=${MENTOR}/src/main/java
SRC=src/main/java

STUDENT=""
URL=""

while read line
do 
	IFS== read STUDENT URL <<< $line
	if [ ! -d  ${BASEPATH}/$STUDENT ]; then
		#git submodule add -f $URL $STUDENT
		git clone $URL ${BASEPATH}/${STUDENT}
		
	fi
	
	if [ ! -L ${SRC}/${STUDENT} ]; then
		student_src=`find ${BASEPATH}/${STUDENT}/. -name ${STUDENT} -print -quit`
		ln -s ${student_src} ${SRC}/${STUDENT}
	fi	
	
	[ ! -f ".gitignore" ] && touch .gitignore
	
	grep -q "${SRC}/${STUDENT}" ".gitignore" || echo "${SRC}/${STUDENT}" >> ".gitignore"
	
done < students
