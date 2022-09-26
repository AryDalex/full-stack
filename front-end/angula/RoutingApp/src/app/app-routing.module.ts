import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ElementsCardsComponent } from './elements/elements-cards/elements-cards.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { NotFoundComponent } from './not-found/not-found.component';

const routes: Routes = [
  { path: 'home', component: HomeComponentComponent},
  { path: 'cards', component: ElementsCardsComponent},
  { path: "", redirectTo: "/home", pathMatch: "full"},
  { path: '**', component: NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
