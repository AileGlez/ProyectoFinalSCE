echo "inicializa el servidor de disparo"
echo "uso:"
echo "2_ejesd HOSTNAME (en caso de omitirlo se usa localhost)"
#
cb=$(pwd)/EstresamientoFinal.jar
echo $cb
#
if [ $# == 0 ];
then
  java -Djava.rmi.server.codebase=file:$cb -jar $cb ServidorDeDisparo &
else
  java -Djava.rmi.server.codebase=file:$cb -jar $cb ServidorDeDisparo $1 &
fi 

