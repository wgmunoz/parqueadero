import { RouterModule, Routes } from '@angular/router';
import { AllregistrosComponent } from './components/allregistros/allregistros.component';
import { NewregistroComponent} from './components/newregistro/newregistro.component';

const APP_ROUTES: Routes = [
  { path: 'allregistros', component: AllregistrosComponent },
  { path: 'newregistro', component: NewregistroComponent  },
  { path: '**', pathMatch: 'full', redirectTo: 'allregistros' }
];

export const APP_ROUTING = RouterModule.forRoot(APP_ROUTES, {useHash: true});
