import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { ProductListComponent } from './products/product-list.component';
import { AlertModule } from 'ngx-bootstrap';
import { ConvertToSpacesPipe } from './shared/convert-to-spaces.pipe';
import { StarComponent } from './shared/star.component';
import { LoginComponent } from './components/login/login.component';
import { ContactComponent } from './src/main/app/app/components/contact/contact.component';

@NgModule({
  declarations: [
	AppComponent,
	ProductListComponent,
	StarComponent,
	ConvertToSpacesPipe,
	LoginComponent,
	ContactComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AlertModule.forRoot(),
    RouterModule.forRoot([ 
      { path: 'products', component: ProductListComponent },
      { path: 'login', component: LoginComponent }
    ], { useHash: true})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
