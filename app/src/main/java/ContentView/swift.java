import SwiftUI

struct ContentView: View {

    // Student information fields
    @State private var rollNumber = ""
    @State private var name = ""
    @State private var address = ""
    @State private var gender = "Male"
    @State private var batch = ""
    @State private var course = ""

    // To show entered info
    @State private var showInfo = false

    // Gender options
    let genders = ["Male", "Female", "Other"]

    var body: some View {
        NavigationView {
            ScrollView {
                VStack(alignment: .leading, spacing: 20) {
                    TextField("Roll Number", text: $rollNumber)
                        .textFieldStyle(RoundedBorderTextFieldStyle())

                    TextField("Name", text: $name)
                        .textFieldStyle(RoundedBorderTextFieldStyle())

                    TextField("Address", text: $address)
                        .textFieldStyle(RoundedBorderTextFieldStyle())

                    Picker("Gender", selection: $gender) {
                        ForEach(genders, id: \.self) { g in
                            Text(g)
                        }
                    }
                    .pickerStyle(SegmentedPickerStyle())

                    TextField("Batch", text: $batch)
                        .textFieldStyle(RoundedBorderTextFieldStyle())

                    TextField("Course", text: $course)
                        .textFieldStyle(RoundedBorderTextFieldStyle())

                    Button(action: {
                        showInfo = true
                    }) {
                        Text("Display Information")
                                .frame(maxWidth: .infinity)
                            .padding()
                                .background(Color.blue)
                                .foregroundColor(.white)
                            .cornerRadius(10)
                    }

                    if showInfo {
                        Divider()
                                .padding(.vertical)

                        VStack(alignment: .leading, spacing: 10) {
                            Text("Roll Number: \(rollNumber)")
                            Text("Name: \(name)")
                            Text("Address: \(address)")
                            Text("Gender: \(gender)")
                            Text("Batch: \(batch)")
                            Text("Course: \(course)")
                        }
                        .padding()
                                .background(Color.gray.opacity(0.1))
                                .cornerRadius(8)
                    }

                    Spacer()
                }
                .padding()
            }
            .navigationTitle("Student Info")
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}