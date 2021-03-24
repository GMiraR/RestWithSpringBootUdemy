package br.com.springstudies.restwithspringbootudemy;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    @RequestMapping(value="/sum/{firstNumber}/{secondNumber}", method= RequestMethod.GET)
    public Double sum(@PathVariable(value="firstNumber") String firstNumber, @PathVariable(value="secondNumber") String secondNumber) throws Exception {

        if (!(DoubleConverter.isNumeric(firstNumber)) || !(DoubleConverter.isNumeric(secondNumber))){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }

        Double sum = DoubleConverter.convertToDouble(firstNumber) + DoubleConverter.convertToDouble(secondNumber);

        return sum;
    }


    @RequestMapping(value="/subtraction/{firstNumber}/{secondNumber}", method= RequestMethod.GET)
    public Double subtraction(@PathVariable(value="firstNumber") String firstNumber, @PathVariable(value="secondNumber") String secondNumber) throws Exception {

        if (!(DoubleConverter.isNumeric(firstNumber)) || !(DoubleConverter.isNumeric(secondNumber))){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }

        Double subtraction = DoubleConverter.convertToDouble(firstNumber) - DoubleConverter.convertToDouble(secondNumber);

        return subtraction;
    }

    @RequestMapping(value="/mult/{firstNumber}/{secondNumber}", method= RequestMethod.GET)
    public Double multiplication(@PathVariable(value="firstNumber") String firstNumber, @PathVariable(value="secondNumber") String secondNumber) throws Exception {

        if (!(DoubleConverter.isNumeric(firstNumber)) || !(DoubleConverter.isNumeric(secondNumber))){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }

        Double mult = DoubleConverter.convertToDouble(firstNumber) * DoubleConverter.convertToDouble(secondNumber);

        return mult;
    }

    @RequestMapping(value="/div/{firstNumber}/{secondNumber}", method= RequestMethod.GET)
    public Double division(@PathVariable(value="firstNumber") String firstNumber, @PathVariable(value="secondNumber") String secondNumber) throws Exception {

        if (!(DoubleConverter.isNumeric(firstNumber)) || !(DoubleConverter.isNumeric(secondNumber))){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }

        Double div = DoubleConverter.convertToDouble(firstNumber) / DoubleConverter.convertToDouble(secondNumber);

        return div;
    }

    @RequestMapping(value="/mean/{firstNumber}/{secondNumber}", method= RequestMethod.GET)
    public Double mean(@PathVariable(value="firstNumber") String firstNumber, @PathVariable(value="secondNumber") String secondNumber) throws Exception {

        if (!(DoubleConverter.isNumeric(firstNumber)) || !(DoubleConverter.isNumeric(secondNumber))){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }

        Double mean = (DoubleConverter.convertToDouble(firstNumber) + DoubleConverter.convertToDouble(secondNumber)) / 2;

        return mean;
    }

    @RequestMapping(value="/sqrt/{num}", method= RequestMethod.GET)
    public Double squareRoot(@PathVariable(value="num") String num) throws Exception {

        if (!(DoubleConverter.isNumeric(num))){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }

        Double sqrtNum = Math.sqrt((DoubleConverter.convertToDouble(num)));

        return sqrtNum;
    }





}
