echo off
echo ejecuta el estresador para sembrar los clientes
echo uso:
echo 4_estresa NumCltes NumSolicitudesPorClte tiempoEspera HOSTNAME (en caso de omitirlo se usa localhost, si se omiten los clientes usa 20 y el localhost)
echo on

set cb=%cd%\Stress_Bookstore.jar

if [%1] NEQ [] goto conclientes
estresador 20 -Djava.rmi.server.codebase=file:%cb% -jar %cb% ClienteWSPago localhost
goto fin

:conclientes

if [%2] NEQ [] goto consolicitudes
estresador %1 -Djava.rmi.server.codebase=file:%cb% -jar %cb% ClienteWSPago localhost
goto fin

:consolicitudes
if [%3] NEQ [] goto conTiempo
estresador %1 -Djava.rmi.server.codebase=file:%cb% -jar %cb% ClienteWSPago localhost %2
goto fin

:conTiempo
if [%4] NEQ [] goto conHost
estresador %1 -Djava.rmi.server.codebase=file:%cb% -jar %cb% ClienteWSPago localhost %2 %3
goto fin

:conHost
estresador %1 -Djava.rmi.server.codebase=file:///%cb% -jar %cb% ClienteWSPago %4 %2 %3


:fin