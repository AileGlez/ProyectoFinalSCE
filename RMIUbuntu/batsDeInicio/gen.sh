for i in 1 2 3 4
do
   echo $i
#   xterm -xrm 'XTerm.vt100.allowTitleOps: false' -T "MiVentana $i" &
    gnome-terminal --tab -t "uno" &
done
