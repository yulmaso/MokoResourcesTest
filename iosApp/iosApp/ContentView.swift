import SwiftUI
import shared

extension StringResource {
    func localized() -> String {
        return NSLocalizedString(resourceId, bundle: bundle, comment: "")
    }
}

struct ContentView: View {
	var body: some View {
		Text(SharedRes.strings().app_name.localized())
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}