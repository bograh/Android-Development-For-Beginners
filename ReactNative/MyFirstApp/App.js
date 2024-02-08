import { StatusBar } from 'expo-status-bar';
import { SafeAreaView, StyleSheet, Text, View } from 'react-native';

export default function App() {

  const Header = () => {
    return (
      <View style={styles.header}>
        <Text>Header App</Text>
      </View>
    )
  }

  const Boxes = () => {
    return 
  }

return (
  <SafeAreaView style={styles.container}>
    <Header />
    <StatusBar style="auto" />
  </SafeAreaView>
);
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
  },

  header: {
    width: '100%',
    height: '15%',
    backgroundColor: '#8c8c8c',
    alignItems: 'center',
    justifyContent: 'center',
  }

});
