/*
 * Author: Jon Trulson <jtrulson@ics.com>
 * Copyright (c) 2017 Intel Corporation.
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

import upm_lsm303d.LSM303D;

public class LSM303D_Example
{
    public static void main(String[] args) throws InterruptedException
    {
// ! [Interesting]

        // Instantiate a LSM303D instance using default i2c bus and address
        LSM303D sensor = new LSM303D();

        while (true)
            {
                // update our values from the sensor
                sensor.update();

                upm_lsm303d.floatVector data = sensor.getAccelerometer();

                System.out.println("Accelerometer x: " + data.get(0)
                                   + " y: " + data.get(1)
                                   + " z: " + data.get(2)
                                   + " g");

                data = sensor.getMagnetometer();
                System.out.println("Magnetometer x: " + data.get(0)
                                   + " y: " + data.get(1)
                                   + " z: " + data.get(2)
                                   + " uT");

                System.out.println("Temperature: "
                                   + sensor.getTemperature());

                System.out.println();
                Thread.sleep(250);
            }

// ! [Interesting]
    }
}
