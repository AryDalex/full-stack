import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponentComponent } from '../home-component/home-component.component';
import { ElementsCardsComponent } from './elements-cards/elements-cards.component';

const routes: Routes = [
  { path: 'elements', component: HomeComponentComponent},
  { path: 'elements', component: ElementsCardsComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ElementsRoutingModule { }
