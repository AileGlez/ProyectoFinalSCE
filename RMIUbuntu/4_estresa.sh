echo "ejecuta el estresador para sembrar los clientes"
echo "uso:"
echo "4_estresa NumCltes NumSolicitudesPorClte HOSTNAME (en caso de omitirlo se usa localhost, si se omiten los clientes usa 15 y el localhost)"

cb=$(pwd)/EstresamientoFinal.jar
echo $cb
if [ $# == 0 ] 
then
     ./estresador 20 -Djava.rmi.server.codebase=file:$cb -jar $cb Cliente localhost 200
elif [ $# == 1 ]
then
    ./estresador $1 -Djava.rmi.server.codebase=file:$cb -jar $cb Cliente localhost 200
elif [ $# == 2 ]
then
     ./estresador $1 -Djava.rmi.server.codebase=file:$cb -jar $cb Cliente localhost $2 
else
     ./estresador $1 -Djava.rmi.server.codebase=file:$cb -jar $cb Cliente $3 $2
fi
