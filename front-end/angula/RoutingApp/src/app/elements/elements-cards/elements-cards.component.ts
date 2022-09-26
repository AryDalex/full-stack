import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-elements-cards',
  templateUrl: './elements-cards.component.html',
  styleUrls: ['./elements-cards.component.scss']
})
export class ElementsCardsComponent implements OnInit {

  private title: string = ''; // string de pesquisa
  private data: Interface[] = [{
    id: 1,
    title: 'Tapete Rosa',
    p: 'R$100,00',
    imageUrl: 'assets/tapeteRosa.jpeg'
  },
  {
    id: 2,
    title: 'Tapete Verde',
    p: 'R$150,00',
    imageUrl: 'assets/tapeteVerde.jpg'
  },
  {
    id: 3,
    title: 'Tapete Roxo',
    p: 'R$200,00',
    imageUrl: 'assets/tapeteRoxo.jpg'
  },
  {
    id: 4,
    title: 'Tapete Amarelo',
    p: 'R$150,00',
    imageUrl: 'assets/tapeteAmarelo.jpeg'
  },
  {
    id: 5,
    title: 'Tapete Vermelho',
    p: 'R$150,00',
    imageUrl: 'assets/tapeteVermelho.jpg'
  },
  {
    id: 6,
    title: 'Tapete Laranja',
    p: 'R$120,00',
    imageUrl: 'assets/tapeteLaranja.jpg'
  }
];

  constructor() { }

  ngOnInit(): void {
  }

  // GETTERS AND SETTERS
  protected getTitle() {
    return this.title;
  }

  protected setTitle(event: any) {
    // console.log(event.target.value)
    this.title = event.target.value;
  }

  protected getData(): Interface[] {
    return this.data;
  }

}

// INTERFACES
interface Interface {
  id: number;
  title: string;
  p: string;
  imageUrl: string;
}
