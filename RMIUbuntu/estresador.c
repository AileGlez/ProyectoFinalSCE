//#include "stdafx.h"
//#include <process.h>
#include <unistd.h>
#include <malloc.h>
#include <stdlib.h>

int main(int argc, char* argv[])
{
	int i, r, numprocs;

	printf("Estresador: se recibieron %d argumentos\n",argc);

	for(i = 0; i < argc; i++)
		printf("Estresador: argv[%d]:%s\n", i,argv[i]);

	char** args = (char**) malloc((argc)*sizeof(char*));
	//char** envp = (char**) 0;
	//char** args = (char**) malloc((4)*sizeof(char*));
	args[0] = "java";
	i=0;
	for( i = 1; i < argc; i++)
		args[i-1] = argv[i];

	args[argc-1]=0;

	numprocs = atoi(argv[1]);
	printf("Se han de ejecutar %d procesos\n",numprocs);
	/*
	args[0] = "java.exe";       // ojo éste es importante que esté repetido
	args[1] = argv[1];         
	args[2] = argv[2];          
	args[3] = argv[3];
	args[4] = argv[4];
	args[5] = argv[5];
	args[6] = argv[6];
        args[7] = NULL;
	args[8] = NULL;
	*/
	// para marcar el fin de los argumentos
        r = 0;
	/*
        args[0] = "java";       // ojo éste es importante que esté repetido
	args[1] = "HolaMundo";         
	args[2] = "20";          
	args[3] = NULL;
        */
	for( i = 0; i < numprocs; i++ )
	{
        //  r = _spawnvp( _P_NOWAITO , "java.exe", args );  /* el vp significa array values y path local */
	//int execve (const char *filename, const char *argv [], const char *envp[]);
             printf("%d ... iniciado\n",i);
             if(fork() == 0) 
                r = execvp("java",args);
	}
    
	if( r < 0 )
      printf("Hubo un error al ejecutar, r = %d\n",r);
    else
     printf("stress_c.exe ha terminado bien\n");
    return 0;
}



