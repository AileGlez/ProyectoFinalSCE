# -Djava.rmi.server.useCodebaseOnly=false
# java -Djava.rmi.server.useCodebaseOnly=false -Djava.rmi.server.codebase=file:///%cb% -jar %cb% Server 
# java -Djava.rmi.server.codebase=file:///%cb% -jar %cb% Server 
#
echo "inicia el servidor"
echo "uso:"
echo "1_ejes HOSTNAME (en caso de omitirlo se usa localhost)"
#
echo $#

cb=$(pwd)/EstresamientoFinal.jar
echo $cb
if [ $# == 0 ]
then
     java -cp $cb -Djava.rmi.server.useCodebaseOnly=false -Djava.rmi.server.codebase=file:$cb -jar $cb Server &
else
     java -cp $cb -Djava.rmi.server.useCodebaseOnly=false -Djava.rmi.server.codebase=file:///$cb -jar $cb Server $1 &
fi

