import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnInit {

  @Imput() title = 'teste title';
  @Imput() id = 0;
  @Imput() imageUrl = '';

  constructor() { }

  ngOnInit(): void {
  }

}
