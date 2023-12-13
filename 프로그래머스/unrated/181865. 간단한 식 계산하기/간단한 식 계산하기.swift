import Foundation

func solution(_ binomial:String) -> Int {
    let arr = binomial.components(separatedBy: " ").map{Int($0) ?? 0}
    
    if binomial.contains("+"){
        return arr[0] + arr[2]
    } else if binomial.contains("-"){
        return arr[0] - arr[2]
    } else if binomial.contains("*"){
        return arr[0] * arr[2]
    }
    
    return 0
}