echo "ejecuta el master para que (re)inicialice al servidor de disparo"
echo "uso:"
echo "3_ejem Segs_a_Disparo HOSTNAME (en caso de omitirlo se usa localhost, si se omiten asimismo los segundos usa 15)"


cb=$(pwd)/EstresamientoFinal.jar
echo $cb
#
if [ $# == 0 ]
then
     java -Djava.rmi.server.codebase=file:$cb -jar $cb Master localhost reset 15
elif [ $# == 1 ]
then
     java -Djava.rmi.server.codebase=file:$cb -jar $cb Master localhost reset $1
else
     java -Djava.rmi.server.codebase=file:$cb -jar $cb Master $2 reset $1
fi


