import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  private title: string = 'MyFirstApp';
  private data: PADOInterface[] = [{
    id: 1,
    title: 'Teste PADO',
    imageUrl: 'assets/padoLogo.png'
  },
  {
    id: 2,
    title: 'Teste PADO',
    imageUrl: 'assets/padoLogo.png'
  },
  {
    id: 3,
    title: 'Teste PADO',
    imageUrl: 'assets/padoLogo.png'
  },
  {
    id: 4,
    title: 'Teste PADO',
    imageUrl: 'assets/padoLogo.png'
  },
  {
    id: 5,
    title: 'Teste PADO',
    imageUrl: 'assets/padoLogo.png'
  },
  {
    id: 6,
    title: 'Teste PADO',
    imageUrl: 'assets/padoLogo.png'
  }
];

  constructor(){}

  // GETTERS AND SETTERS
  protected getTitle() {
    return this.title;
  }

  protected setTitle(event: any) {
    // console.log(event.target.value)
    this.title = event.target.value;
  }

  protected getData(): PADOInterface[] {
    return this.data;
  }
}

//! INTERFACES
interface PADOInterface {
  id: number;
  title: string;
  imageUrl: string;
}


