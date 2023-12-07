import pygame

pygame.init()
Width = 1400
Height = 800
screen = pygame.display.set_mode((Width, Height), True)
running = True
pygame.RESIZABLE = True

while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        if event.type == pygame.RESIZABLE:
            Width = pygame.display.get_display_size()[0][0]
            Height = pygame.display.get_display_size()[0][1]
            screen = pygame.display.set_mode((Width, Height))


pygame.quit()
