
import Foundation

func mean(numbers: [Int]) -> Double {
    
    var sum = 0.0
    for number in numbers {
        sum += Double(number)
    }
    let mean = sum / Double(numbers.count)
    return mean
}

func median(numbers: [Int]) -> Double {
    let sortedNumbers = numbers.sorted { (num1, num2) -> Bool in
        return num1<num2
    }
    let midIndex = numbers.count / 2
    let median = Double(sortedNumbers[midIndex])
    return median
}

func mode(numbers: [Int]) -> Double {
//    var occurrences: [Int : Int] = [:]
//    for number in numbers {
//        if let value = occurrences[number] {
//            occurrences[number] = +value
//        } else {
//            occurrences[number] = 1
//        }
//    }
//    var highestPair: (key: Int, value: Int) = (0, 0)
//    for (key, value) in occurrences {
//        highestPair = (value > highestPair.value) ? (key, value) : highestPair
//    }
//    return Double(highestPair.key)
    
}


func performMathAverage(mathFunc: String) -> ([Int]) -> Double {
    switch mathFunc {
    case "mean":
        return mean
    case "median":
        return median
    default:
        return mode
    }
}

var mathFunc = performMathAverage(mathFunc: "mean")
mathFunc([64630,11735,14216,99233,14470,4978,73429,38120, 51135,67060])
mathFunc = performMathAverage(mathFunc: "median")
mathFunc([64630,11735,14216,99233,14470,4978,73429,38120, 51135,67060])
mathFunc = performMathAverage(mathFunc: "mode or not mode")
mathFunc([64630,11735,14216,99233,14470,4978,73429,38120, 51135,67060])
