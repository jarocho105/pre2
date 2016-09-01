/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.SemestreConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class SemestreDetalleFormJInternalFrame extends SemestreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSemestre;
	
	protected JMenuBar jmenuBarDetalleSemestre;
	
	protected JMenu jmenuDetalleSemestre;
	protected JMenu jmenuDetalleArchivoSemestre;
	protected JMenu jmenuDetalleAccionesSemestre;
	protected JMenu jmenuDetalleDatosSemestre;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSemestre;	
	protected GridBagConstraints gridBagConstraintsSemestre;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SemestreBeanSwingJInternalFrameAdditional jInternalFrameDetalleSemestre;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public SemestreSessionBean semestreSessionBean;
	
	
	
		
	
	public SemestreLogic semestreLogic;
	
	public JScrollPane jScrollPanelDatosSemestre;
	public JScrollPane jScrollPanelDatosEdicionSemestre;
	public JScrollPane jScrollPanelDatosGeneralSemestre;
	
	protected JPanel jPanelCamposSemestre;    
	protected JPanel jPanelCamposOcultosSemestre;    	
	protected JPanel jPanelAccionesSemestre;
	protected JPanel jPanelAccionesFormularioSemestre;
    
	
	
	protected Integer iXPanelCamposSemestre=0;
	protected Integer iYPanelCamposSemestre=0;
	
	protected Integer iXPanelCamposOcultosSemestre=0;
	protected Integer iYPanelCamposOcultosSemestre=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSemestre;
	public JButton jButtonModificarSemestre;
	public JButton jButtonActualizarSemestre;
    public JButton jButtonEliminarSemestre;
	public JButton jButtonCancelarSemestre;
    public JButton jButtonGuardarCambiosSemestre;
	public JButton jButtonGuardarCambiosTablaSemestre;
	protected JButton jButtonCerrarSemestre;
	
	
	protected JButton jButtonProcesarInformacionSemestre;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSemestre;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSemestre;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSemestre;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSemestre;
	protected JButton jButtonModificarToolBarSemestre;
	protected JButton jButtonActualizarToolBarSemestre;
    protected JButton jButtonEliminarToolBarSemestre;
	protected JButton jButtonCancelarToolBarSemestre;
    protected JButton jButtonGuardarCambiosToolBarSemestre;
	protected JButton jButtonGuardarCambiosTablaToolBarSemestre;
	protected JButton jButtonMostrarOcultarTablaToolBarSemestre;
	protected JButton jButtonCerrarToolBarSemestre;
	
	protected JButton jButtonProcesarInformacionToolBarSemestre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSemestre;
	protected JMenuItem jMenuItemModificarSemestre;
	protected JMenuItem jMenuItemActualizarSemestre;
    protected JMenuItem jMenuItemEliminarSemestre;
	protected JMenuItem jMenuItemCancelarSemestre;
    protected JMenuItem jMenuItemGuardarCambiosSemestre;
	protected JMenuItem jMenuItemGuardarCambiosTablaSemestre;
	protected JMenuItem jMenuItemCerrarSemestre;
	protected JMenuItem jMenuItemDetalleCerrarSemestre;
	protected JMenuItem jMenuItemDetalleMostarOcultarSemestre;
	
	protected JMenuItem jMenuItemProcesarInformacionSemestre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSemestre;
	protected JMenuItem jMenuItemMostrarOcultarSemestre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSemestre;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSemestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSemestre;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSemestre;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSemestre;
	public JLabel jLabelIdSemestre;
	public JTextFieldMe jTextFieldidSemestre;
	public JButton jButtonidSemestreBusqueda= new JButtonMe();

	public JPanel jPanelnombreSemestre;
	public JLabel jLabelnombreSemestre;
	public JTextField jTextFieldnombreSemestre;
	public JButton jButtonnombreSemestreBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSemestre;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SemestreDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSemestre=new JPanel();
				this.jPanelAccionesFormularioSemestre=new JPanel();
				this.jmenuBarDetalleSemestre=new JMenuBar();
				this.jTtoolBarDetalleSemestre=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SemestreDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Semestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SemestreDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Semestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SemestreDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Semestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SemestreDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Semestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SemestreDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Semestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarSemestre() {
		return this.jButtonActualizarToolBarSemestre;
	}
	
	public JButton getjButtonEliminarToolBarSemestre() {
		return this.jButtonEliminarToolBarSemestre;
	}
	
	public JButton getjButtonCancelarToolBarSemestre() {
		return this.jButtonCancelarToolBarSemestre;
	}		
	
	public JButton getjButtonProcesarInformacionSemestre() {
		return this.jButtonProcesarInformacionSemestre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSemestre)	{
		this.jButtonProcesarInformacionSemestre = jButtonProcesarInformacionSemestre;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSemestre() {
		return this.jComboBoxTiposAccionesSemestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSemestre(
			JComboBox jComboBoxTiposRelacionesSemestre) {
		this.jComboBoxTiposRelacionesSemestre = jComboBoxTiposRelacionesSemestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSemestre(
			JComboBox jComboBoxTiposAccionesSemestre) {
		this.jComboBoxTiposAccionesSemestre = jComboBoxTiposAccionesSemestre;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSemestre() {
		return this.jComboBoxTiposAccionesFormularioSemestre;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSemestre(
			JComboBox jComboBoxTiposAccionesFormularioSemestre) {
		this.jComboBoxTiposAccionesFormularioSemestre = jComboBoxTiposAccionesFormularioSemestre;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.semestreSessionBean=new SemestreSessionBean();
		
		this.semestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.semestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.semestreSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SemestreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SemestreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SemestreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Semestre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		SemestreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSemestre= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSemestre=new JButtonMe();
				this.jButtonModificarToolBarSemestre=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSemestre,this.jTtoolBarDetalleSemestre,
							"actualizar","actualizar","Actualizar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSemestre,this.jTtoolBarDetalleSemestre,
							"eliminar","eliminar","Eliminar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSemestre,this.jTtoolBarDetalleSemestre,
							"cancelar","cancelar","Cancelar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSemestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSemestre,this.jTtoolBarDetalleSemestre,
							"guardarcambios","guardarcambios","Guardar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSemestre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSemestre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSemestre,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSemestre=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSemestre=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSemestre=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSemestre=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSemestre=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSemestre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSemestre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSemestre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSemestre= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSemestre.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSemestre,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSemestre= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSemestre.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSemestre,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSemestre= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSemestre.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSemestre,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSemestre= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSemestre.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSemestre,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSemestre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSemestre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSemestre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSemestre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSemestre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSemestre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSemestre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSemestre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSemestre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSemestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSemestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSemestre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSemestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSemestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSemestre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSemestre.add(this.jMenuItemDetalleCerrarSemestre);
		
		this.jmenuDetalleAccionesSemestre.add(this.jMenuItemActualizarSemestre);
		this.jmenuDetalleAccionesSemestre.add(this.jMenuItemEliminarSemestre);
		this.jmenuDetalleAccionesSemestre.add(this.jMenuItemCancelarSemestre);		
		
		//this.jmenuDetalleDatosSemestre.add(this.jMenuItemDetalleAbrirOrderBySemestre);				
		this.jmenuDetalleDatosSemestre.add(this.jMenuItemDetalleMostarOcultarSemestre);				
				
		//this.jmenuDetalleAccionesSemestre.add(this.jMenuItemGuardarCambiosSemestre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSemestre.add(this.jmenuDetalleArchivoSemestre);		
		this.jmenuBarDetalleSemestre.add(this.jmenuDetalleAccionesSemestre);		
		this.jmenuBarDetalleSemestre.add(this.jmenuDetalleDatosSemestre);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSemestre);				
	}
	
	
	public void inicializarElementosCamposSemestre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSemestre = new JLabelMe();
		jLabelIdSemestre.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSemestre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSemestre = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSemestre.setToolTipText(SemestreConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSemestre= new GridBagLayout();

		this.jPanelidSemestre.setLayout(this.gridaBagLayoutSemestre);

		jTextFieldidSemestre = new JTextFieldMe();
		jTextFieldidSemestre.setText("Id");

		jTextFieldidSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreSemestre = new JLabelMe();
		this.jLabelnombreSemestre.setText(""+SemestreConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSemestre.setToolTipText("Nombre");
		this.jLabelnombreSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSemestre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSemestre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSemestre.setToolTipText(SemestreConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSemestre = new GridBagLayout();
		this.jPanelnombreSemestre.setLayout(this.gridaBagLayoutSemestre);


		jTextFieldnombreSemestre= new JTextFieldMe();

		jTextFieldnombreSemestre.setEnabled(false);
		jTextFieldnombreSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreSemestre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreSemestreBusqueda= new JButtonMe();
		this.jButtonnombreSemestreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSemestreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSemestreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSemestreBusqueda.setText("U");
		this.jButtonnombreSemestreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSemestreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSemestreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreSemestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreSemestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSemestreBusqueda"));

		if(this.semestreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSemestreBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSemestre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleSemestre = new SemestreBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Semestre DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSemestre= new GridBagLayout();
		

		
		String sToolTipSemestre="";
		sToolTipSemestre=SemestreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSemestre+="(Seguridad.Semestre)";
		}
		
		if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
			sToolTipSemestre+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSemestre = new JButtonMe();
		this.jButtonModificarSemestre = new JButtonMe();
        this.jButtonActualizarSemestre = new JButtonMe();
        this.jButtonEliminarSemestre = new JButtonMe();
        this.jButtonCancelarSemestre = new JButtonMe();
        this.jButtonGuardarCambiosSemestre = new JButtonMe();
		this.jButtonGuardarCambiosTablaSemestre = new JButtonMe();
		this.jButtonCerrarSemestre = new JButtonMe();
		
		this.jScrollPanelDatosSemestre = new JScrollPane();   
        this.jScrollPanelDatosEdicionSemestre = new JScrollPane();
		this.jScrollPanelDatosGeneralSemestre = new JScrollPane();
				
		
		
		this.jPanelCamposSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Semestre";
		
		if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Semestres" + this.sPath));
		} else {
			this.jScrollPanelDatosSemestre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSemestre.setName("jPanelCamposSemestre"); 

		this.jPanelCamposOcultosSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSemestre.setName("jPanelCamposOcultosSemestre"); 

        this.jPanelAccionesSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSemestre.setToolTipText("Acciones");
        this.jPanelAccionesSemestre.setName("Acciones"); 

		this.jPanelAccionesFormularioSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSemestre.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSemestre.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSemestre, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSemestre.setText("Nuevo");
		this.jButtonModificarSemestre.setText("Editar");
        this.jButtonActualizarSemestre.setText("Actualizar");
        this.jButtonEliminarSemestre.setText("Eliminar");
        this.jButtonCancelarSemestre.setText("Cancelar");
        this.jButtonGuardarCambiosSemestre.setText("Guardar");
		this.jButtonGuardarCambiosTablaSemestre.setText("Guardar");
		this.jButtonCerrarSemestre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSemestre,"nuevo_button","Nuevo",this.semestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSemestre,"modificar_button","Editar",this.semestreSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSemestre,"actualizar_button","Actualizar",this.semestreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSemestre,"eliminar_button","Eliminar",this.semestreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSemestre,"cancelar_button","Cancelar",this.semestreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSemestre,"guardarcambios_button","Guardar",this.semestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSemestre,"guardarcambiostabla_button","Guardar",this.semestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSemestre,"cerrar_button","Salir",this.semestreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSemestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSemestre.setToolTipText("Nuevo"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSemestre.setToolTipText("Editar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSemestre.setToolTipText("Actualizar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSemestre.setToolTipText("Eliminar)"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSemestre.setToolTipText("Cancelar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSemestre.setToolTipText("Guardar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSemestre.setToolTipText("Guardar"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSemestre.setToolTipText("Salir"+" "+SemestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoSemestre";
		inputMap = this.jButtonNuevoSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSemestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSemestre"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSemestre";
		inputMap = this.jButtonActualizarSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSemestre"));
		
		//ELIMINAR
		sMapKey = "EliminarSemestre";
		inputMap = this.jButtonEliminarSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSemestre"));
		
		//CANCELAR	
		sMapKey = "CancelarSemestre";
		inputMap = this.jButtonCancelarSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSemestre"));
		
		//CERRAR		
		sMapKey = "CerrarSemestre";
		inputMap = this.jButtonCerrarSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSemestre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSemestre";
		inputMap = this.jButtonGuardarCambiosTablaSemestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSemestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSemestre"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSemestre = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSemestre.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSemestre.setToolTipText("Nuevo Semestre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSemestre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSemestre.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSemestre.setToolTipText("Sin Cerrar Ventana Semestre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSemestre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSemestre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSemestre.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSemestre.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSemestre, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSemestre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSemestre.setText("Accion");
		this.jComboBoxTiposAccionesSemestre.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSemestre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSemestre.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSemestre.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSemestre = new JLabelMe();
		
		this.jLabelAccionesSemestre.setText("Acciones");		
		this.jLabelAccionesSemestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSemestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSemestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSemestre();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSemestre();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSemestre=new JTabbedPane();
		this.jTabbedPaneRelacionesSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSemestre,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSemestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSemestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSemestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSemestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSemestre.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSemestre.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSemestre.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSemestre, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSemestre = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSemestre = new GridBagLayout();
		
		this.jPanelCamposSemestre.setLayout(gridaBagLayoutCamposSemestre);
		this.jPanelCamposOcultosSemestre.setLayout(gridaBagLayoutCamposOcultosSemestre);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSemestre = new GridBagConstraints();
	this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSemestre.gridy = 0;
	this.gridBagConstraintsSemestre.gridx = 0;
	this.gridBagConstraintsSemestre.ipadx = 0;
	this.gridBagConstraintsSemestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSemestre.add(jLabelIdSemestre, this.gridBagConstraintsSemestre);



	this.gridBagConstraintsSemestre = new GridBagConstraints();
	this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSemestre.gridy = 0;
	this.gridBagConstraintsSemestre.gridx = 1;
	this.gridBagConstraintsSemestre.ipadx = 0;
	this.gridBagConstraintsSemestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSemestre.add(jTextFieldidSemestre, this.gridBagConstraintsSemestre);


	this.gridBagConstraintsSemestre = new GridBagConstraints();
	this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSemestre.gridy = 0;
	this.gridBagConstraintsSemestre.gridx = 0;
	this.gridBagConstraintsSemestre.ipadx = 0;
	this.gridBagConstraintsSemestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSemestre.add(jLabelnombreSemestre, this.gridBagConstraintsSemestre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSemestre = new GridBagConstraints();
		//this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSemestre.gridy = 0;
		this.gridBagConstraintsSemestre.gridx = 2;
		this.gridBagConstraintsSemestre.ipadx = 0;
		this.gridBagConstraintsSemestre.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSemestre.add(jButtonnombreSemestreBusqueda, this.gridBagConstraintsSemestre);
	}

	this.gridBagConstraintsSemestre = new GridBagConstraints();
	this.gridBagConstraintsSemestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSemestre.gridy = 0;
	this.gridBagConstraintsSemestre.gridx = 1;
	this.gridBagConstraintsSemestre.ipadx = 0;
	this.gridBagConstraintsSemestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSemestre.add(jTextFieldnombreSemestre, this.gridBagConstraintsSemestre);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSemestre = new GridBagConstraints();
	this.gridBagConstraintsSemestre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSemestre.gridy = iYPanelCamposSemestre;
	this.gridBagConstraintsSemestre.gridx = iXPanelCamposSemestre++;
	this.gridBagConstraintsSemestre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSemestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSemestre.add(this.jPanelidSemestre, this.gridBagConstraintsSemestre);



	if(iXPanelCamposSemestre % 1==0) {
		iXPanelCamposSemestre=0;
		iYPanelCamposSemestre++;
	}
	this.gridBagConstraintsSemestre = new GridBagConstraints();
	this.gridBagConstraintsSemestre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSemestre.gridy = iYPanelCamposSemestre;
	this.gridBagConstraintsSemestre.gridx = iXPanelCamposSemestre++;
	this.gridBagConstraintsSemestre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSemestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSemestre.add(this.jPanelnombreSemestre, this.gridBagConstraintsSemestre);



	if(iXPanelCamposSemestre % 1==0) {
		iXPanelCamposSemestre=0;
		iYPanelCamposSemestre++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSemestre= new GridBagLayout();
		this.jPanelAccionesSemestre.setLayout(gridaBagLayoutAccionesSemestre);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSemestre= new GridBagLayout();
		this.jPanelAccionesFormularioSemestre.setLayout(gridaBagLayoutAccionesFormularioSemestre);
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSemestre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSemestre.add(this.jComboBoxTiposAccionesFormularioSemestre, this.gridBagConstraintsSemestre);

		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSemestre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSemestre.add(this.jCheckBoxPostAccionNuevoSemestre, this.gridBagConstraintsSemestre);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.semestreSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSemestre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSemestre.add(this.jCheckBoxPostAccionSinCerrarSemestre, this.gridBagConstraintsSemestre);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.semestreSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.semestreSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSemestre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSemestre.add(this.jCheckBoxPostAccionSinMensajeSemestre, this.gridBagConstraintsSemestre);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = 0;
		this.gridBagConstraintsSemestre.gridx = iPosXAccion++;
			
		this.jPanelAccionesSemestre.add(this.jButtonModificarSemestre, this.gridBagConstraintsSemestre);							

		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSemestre.gridy = 0;
		this.gridBagConstraintsSemestre.gridx =iPosXAccion++;
			
		this.jPanelAccionesSemestre.add(this.jButtonEliminarSemestre, this.gridBagConstraintsSemestre);
		
			
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = 0;		
		this.gridBagConstraintsSemestre.gridx = iPosXAccion++;
		
		this.jPanelAccionesSemestre.add(this.jButtonActualizarSemestre, this.gridBagConstraintsSemestre);


		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = 0;		
		this.gridBagConstraintsSemestre.gridx = iPosXAccion++;
		
		this.jPanelAccionesSemestre.add(this.jButtonGuardarCambiosSemestre, this.gridBagConstraintsSemestre);	
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = 0;		
		this.gridBagConstraintsSemestre.gridx =iPosXAccion++;
		
		this.jPanelAccionesSemestre.add(this.jButtonCancelarSemestre, this.gridBagConstraintsSemestre);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSemestre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSemestre);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.semestreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSemestre = new GridBagConstraints();						
			this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSemestre.gridx = 0;		
			//this.gridBagConstraintsSemestre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSemestre.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSemestre.gridx =0;
		this.gridBagConstraintsSemestre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSemestre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSemestre, this.gridBagConstraintsSemestre);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SemestreJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSemestre = new SemestreBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Semestre DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Semestre DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Semestre Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SemestreModel semestreModel=new SemestreModel(this);
			
			//SI USARA CLASE INTERNA
			//SemestreModel.SemestreFocusTraversalPolicy semestreFocusTraversalPolicy = semestreModel.new SemestreFocusTraversalPolicy(this);
			
			//semestreFocusTraversalPolicy.setsemestreJInternalFrame(this);
			
			this.setFocusTraversalPolicy(semestreModel);
			
			
			this.jContentPaneDetalleSemestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSemestre = new GridBagLayout();	
			this.jContentPaneDetalleSemestre.setLayout(gridaBagLayoutDetalleSemestre);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSemestre = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSemestre = new GridBagConstraints();
				this.gridBagConstraintsSemestre.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSemestre.gridx = 0;
					
				
				this.jContentPaneDetalleSemestre.add(jTtoolBarDetalleSemestre, gridBagConstraintsSemestre);								
				
}
			
			this.jScrollPanelDatosEdicionSemestre=   new JScrollPane(jContentPaneDetalleSemestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSemestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSemestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSemestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSemestre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSemestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSemestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSemestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSemestre.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSemestre.gridx = 0;
	        
			this.jContentPaneDetalleSemestre.add(jPanelCamposSemestre, gridBagConstraintsSemestre);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& semestreSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.semestreSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSemestre= new GridBagConstraints();
						this.gridBagConstraintsSemestre.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSemestre.gridx = 0;
						this.jContentPaneDetalleSemestre.add(this.jTabbedPaneRelacionesSemestre, this.gridBagConstraintsSemestre);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSemestre.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSemestre.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSemestre = new GridBagConstraints();
					this.gridBagConstraintsSemestre.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSemestre.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSemestre.gridx = 0;
					
				
					this.jContentPaneDetalleSemestre.add(jPanelCamposOcultosSemestre, gridBagConstraintsSemestre);
				
					this.jPanelCamposOcultosSemestre.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSemestre.gridx = 0;
	        this.gridBagConstraintsSemestre.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSemestre.add(this.jPanelAccionesFormularioSemestre, this.gridBagConstraintsSemestre);							
			
			
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
	        this.gridBagConstraintsSemestre.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSemestre.gridx = 0;
	        
			
			this.jContentPaneDetalleSemestre.add(this.jPanelAccionesSemestre, this.gridBagConstraintsSemestre);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSemestre);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSemestre=   new JScrollPane(this.jPanelCamposSemestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSemestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSemestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSemestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSemestre.gridx = 0;
			this.gridBagConstraintsSemestre.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSemestre.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSemestre.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSemestre, this.gridBagConstraintsSemestre);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSemestre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSemestre, this.gridBagConstraintsSemestre);			
			
			this.gridBagConstraintsSemestre = new GridBagConstraints();
			this.gridBagConstraintsSemestre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSemestre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSemestre, this.gridBagConstraintsSemestre);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSemestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSemestre, this.gridBagConstraintsSemestre);
			
			
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSemestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSemestre, this.gridBagConstraintsSemestre);
		
			
		this.gridBagConstraintsSemestre = new GridBagConstraints();
		this.gridBagConstraintsSemestre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSemestre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSemestre, this.gridBagConstraintsSemestre);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSemestre;//jContentPane;
		
		return jScrollPanelDatosEdicionSemestre;
    } 
	
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
