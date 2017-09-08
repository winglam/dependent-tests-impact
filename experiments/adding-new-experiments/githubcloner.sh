#echo 'Enter (in specified order) github repository link, old directory name, new directory name, old github SHA, new github SHA'

#example call
#./githubcloner.sh github_link old_directory_name new_directory_name old_github_SHA new_github_SHA

cd /home/user/dependent-tests-impact/experiments

#clone repository into old_directory_name
git clone $1 $2
#make copy of repository into new_directory_name
cp -R $2 $3
#checkout old revision
cd $2
git checkout $4
#compile old subject
mvn compile
mvn test-compile
##get old libs
#mvn install -fn -DskipTests dependency:copy-dependencies 
#
#checkout new revision
cd ../$3
git checkout $5
#compile new subject
mvn compile
mvn test-compile
##get new libs
#mvn install -fn -DskipTests dependency:copy-dependencies 
