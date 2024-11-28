#include<stdio.h>
#include<omp.h>
#define total_iterations 50000
#define no_of_thread 5
int main(){
	int chunk_size = total_iterations/no_of_thread;
	int tid=0;
	int a[total_iterations], b[total_iterations], c[total_iterations];

	tid = omp_get_thread_num();
	int i=0;

	#pragma omp parallel for
	for (i = tid*chunk_size; i < tid+(chunk_size*2); i++)
	{
		#pragma omp critical
		a[i] = a[i]+(b[i]*c[i]);
	}
}
