import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ElementsRoutingModule } from './elements-routing.module';
import { ElementsHomeComponent } from './elements-home/elements-home.component';
import { ElementsCardsComponent } from './elements-cards/elements-cards.component';


@NgModule({
  declarations: [
    ElementsHomeComponent,
    ElementsCardsComponent
  ],
  imports: [
    CommonModule,
    ElementsRoutingModule
  ]
})
export class ElementsModule { }
