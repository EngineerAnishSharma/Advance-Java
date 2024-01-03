#include <stdio.h>

int main() {
    int n, i;
    printf("Enter the no. of processes: ");
    scanf("%d", &n);
    
    int arrival_time[n], burst_time[n], waiting_time[n], turnaround_time[n];
    
  
     for (i = 0; i < n; i++) {
        printf("Enter the arrival time for process P%d: ", i + 1);
        scanf("%d", &arrival_time[i]);
    }
    for (i = 0; i < n; i++) {
        printf("Enter the burst time for process P%d: ", i + 1);
        scanf("%d", &burst_time[i]);
    }
    
  
    int completion_time = 0;
    for (i = 0; i < n; i++) {
        if (arrival_time[i] > completion_time) {
            completion_time = arrival_time[i];
        }
        completion_time += burst_time[i];
        turnaround_time[i] = completion_time - arrival_time[i];
        waiting_time[i] = turnaround_time[i] - burst_time[i];
    }
    
   
    float total_waiting_time = 0, total_turnaround_time = 0;
    for (i = 0; i < n; i++) {
        total_waiting_time += waiting_time[i];
        total_turnaround_time += turnaround_time[i];
    }
    float average_waiting_time = total_waiting_time / n;
    float average_turnaround_time = total_turnaround_time / n;
    
   
    printf("\n\n==============================================================\n");
    printf("Inputs given by the user are:\n");
    printf("==============================================================\n\n");
    printf("Process\tAT\tBT\n");
    for (i = 0; i < n; i++) {
        printf("P%d\t%d\t%d\n", i + 1, arrival_time[i], burst_time[i]);
    }
    printf("\n============================================================\n\n");
    
    printf("Gantt Chart is as follows:\n\n");
    printf("0");
    for (i = 0; i < n; i++) {
        printf("->P%d->%d", i + 1, arrival_time[i] + turnaround_time[i]);
      
    }
    
    printf("\n\n\tTABLE\t\n");
    printf("Process\tAT\tBT\tFT\tTAT\tWT\n");
    for (i = 0; i < n; i++) {
        printf("P%d\t%d\t%d\t%d\t%.6f\t%.6f\n", i + 1, arrival_time[i], burst_time[i], arrival_time[i] + turnaround_time[i], (float)turnaround_time[i], (float)waiting_time[i]);
    }
    
    printf("\n\nAverage Turn Around Time: %.6f\n", average_turnaround_time);
    printf("Average Waiting Time: %.6f\n", average_waiting_time);
    
    return 0;
}
