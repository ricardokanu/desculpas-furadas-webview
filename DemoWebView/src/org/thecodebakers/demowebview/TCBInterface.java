/*
 * Copyright (C) 2011 The Code Bakers
 * Authors: Cleuton Sampaio e Francisco Rodrigues
 * e-mail: thecodebakers@gmail.com
 * Project: http://code.google.com/p/desculpas-furadas-webview
 * Site: http://www.thecodebakers.org
 *
 * Licensed under the GNU GPL, Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://gplv3.fsf.org/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Additional term: the authors reserve the right to publish a proprietary application
 * without redistributing the source code.
 * 
 * @author Cleuton Sampaio e Francisco Rogrigues - thecodebakers@gmail.com
 */
package org.thecodebakers.demowebview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

public class TCBInterface {
    Context contexto;

    TCBInterface(Context contexto) {
        this.contexto = contexto;
    }

    public void share(String assunto, String texto) {
    	Resources res = contexto.getResources();
    	Intent sendIntent =   
            new Intent(android.content.Intent.ACTION_SEND);  
    	sendIntent.putExtra(Intent.EXTRA_TEXT,  
            texto);  
    	sendIntent.putExtra(Intent.EXTRA_SUBJECT,  
                assunto);
    	sendIntent.setType("text/plain");  
        contexto.startActivity(  
               Intent.createChooser(sendIntent,   
                  res.getString(R.string.compartilhar)));  
    }
}
