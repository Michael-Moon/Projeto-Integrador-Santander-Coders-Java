
import { PainelLoginComponent } from '../seguranca/painel-login/painel-login.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: 'login', component: PainelLoginComponent },
  { path: 'nao-autorizado', component: PainelLoginComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SegurancaRoutingModule { }
