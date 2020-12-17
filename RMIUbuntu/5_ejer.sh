cb=$(pwd)/EstresamientoFinal.jar
echo $cb
#
if [ $# == 0 ]
then
     java -Djava.rmi.server.codebase=file:$cb -jar $cb Master localhost reporta
else
     java -Djava.rmi.server.codebase=file:$cb -jar $cb Master $1 reporta
fi
