/* 
 * Copyright 2019 Elísabet Palomino .
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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variables
        boolean valor = false;
        int numero;

        do {
            try {

                //Leer dato
                System.out.print("Inserte un número entero....: ");
                numero = SCN.nextInt();
                
                //Comprobar si es correcto
                valor = true;
                
                //Mensaje
                System.out.printf("El número introducido es...: %d%n", numero);

            } catch (Exception e) {

                //Mensaje de error
                System.out.println("Error, Valor Incorrecto");

            } finally {

                SCN.nextLine(); 
            }
        } while (!valor);

    }//main

}//class
