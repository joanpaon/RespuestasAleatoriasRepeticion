/* 
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Referencias
        final char LETRA_MIN = 'A';
        final char LETRA_MAX = 'Z';
        final int NUMERO_LETRAS = 8;
        
        // Objeto Random
        Random rnd = new Random();

        // Mensaje
        System.out.print("Password ...: ");
        
        // Bucle
        for (int i = 0; i < NUMERO_LETRAS; i++) {
            // Genera la letra
            char c = (char) (rnd.nextInt(LETRA_MAX - LETRA_MIN + 1) + LETRA_MIN);

            // Mensaje de salida
            System.out.print(c);
        }
        
        // Cambio de linea
        System.out.println();
    }
}
