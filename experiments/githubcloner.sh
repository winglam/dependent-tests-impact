echo 'Enter github repository link'
read LINK 

echo 'Enter old directory name'
read DIR_NAME  #can be used as SUBJ_NAME

echo 'Enter github SHA'
read SHA

echo 'Enter new directory name'
read NEW_DIR_NAME #can be used as NEW_SUBJ_NAME (NEW_SUBJ_NAME not in setup.sh)


cd /home/user/dependent-tests-impact/experiments  #incase not already in location

#clone repository into DIR_NAME
git clone $LINK $DIR_NAME

cp -R $DIR_NAME $NEW_DIR_NAME

#checkout old revision
cd $DIR_NAME
git checkout $SHA

DT_SUBJ_ROOT=`pwd`

echo $DT_SUBJ_ROOT

#compile old subject
mvn compile
mvn test-compile
#get old libs
mvn install -fn -DskipTests dependency:copy-dependencies 


cd ../$NEW_DIR_NAME
#compile new subject
mvn compile
mvn test-compile
#get new libs
mvn install -fn -DskipTests dependency:copy-dependencies 
