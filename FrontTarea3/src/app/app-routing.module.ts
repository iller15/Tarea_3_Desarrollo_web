import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListMotorComponent } from './list-motor/list-motor.component';
import { CreateMotorComponent } from './create-motor/create-motor.component';


const routes: Routes = [
  {path:'',redirectTo: 'customer', pathMatch: 'full'},
  {path: 'list_Motor', component: ListMotorComponent},
  {path: 'new_Motor', component: CreateMotorComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
