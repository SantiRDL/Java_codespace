def promedioDeHoras(TEMP):
    HORAS = [0] * 24
    for i in range(24):
        suma = 0
        for j in range(7):
            suma += TEMP[i][j]
        HORAS[i] = suma / 7
    return HORAS

def promedioDeDías(TEMP):
    DIAS = [0] * 7
    for j in range(7):
        suma = 0
        for i in range(24):
            suma += TEMP[i][j]
        DIAS[j] = suma / 24
    return DIAS

def hayNegativos(TEMP):
    for i in range(24):
        for j in range(7):
            if TEMP[i][j] < 0:
                return True
    return False

# Ejemplo de uso:
TEMP = [
    [15, 16, 15, 14, 15, 16, 15],  # Hora 0
    [14, 15, 14, 13, 14, 15, 14],  # Hora 1
    # ...
    [20, 21, 20, 19, 20, 21, 20]   # Hora 23
]

print(promedioDeHoras(TEMP))
print(promedioDeDías(TEMP))
print(hayNegativos(TEMP))