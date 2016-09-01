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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.PuntajeNomiConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class PuntajeNomiDetalleFormJInternalFrame extends PuntajeNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePuntajeNomi;
	
	protected JMenuBar jmenuBarDetallePuntajeNomi;
	
	protected JMenu jmenuDetallePuntajeNomi;
	protected JMenu jmenuDetalleArchivoPuntajeNomi;
	protected JMenu jmenuDetalleAccionesPuntajeNomi;
	protected JMenu jmenuDetalleDatosPuntajeNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPuntajeNomi;	
	protected GridBagConstraints gridBagConstraintsPuntajeNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PuntajeNomiBeanSwingJInternalFrameAdditional jInternalFrameDetallePuntajeNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public PuntajeNomiSessionBean puntajenomiSessionBean;
	
	

	public FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame=null;
	public FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormatoNomi=false;
	public FormatoNomiSessionBean formatonomiSessionBean;
	
		
	
	public PuntajeNomiLogic puntajenomiLogic;
	
	public JScrollPane jScrollPanelDatosPuntajeNomi;
	public JScrollPane jScrollPanelDatosEdicionPuntajeNomi;
	public JScrollPane jScrollPanelDatosGeneralPuntajeNomi;
	
	protected JPanel jPanelCamposPuntajeNomi;    
	protected JPanel jPanelCamposOcultosPuntajeNomi;    	
	protected JPanel jPanelAccionesPuntajeNomi;
	protected JPanel jPanelAccionesFormularioPuntajeNomi;
    
	
	
	protected Integer iXPanelCamposPuntajeNomi=0;
	protected Integer iYPanelCamposPuntajeNomi=0;
	
	protected Integer iXPanelCamposOcultosPuntajeNomi=0;
	protected Integer iYPanelCamposOcultosPuntajeNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPuntajeNomi;
	public JButton jButtonModificarPuntajeNomi;
	public JButton jButtonActualizarPuntajeNomi;
    public JButton jButtonEliminarPuntajeNomi;
	public JButton jButtonCancelarPuntajeNomi;
    public JButton jButtonGuardarCambiosPuntajeNomi;
	public JButton jButtonGuardarCambiosTablaPuntajeNomi;
	protected JButton jButtonCerrarPuntajeNomi;
	
	
	protected JButton jButtonProcesarInformacionPuntajeNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPuntajeNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPuntajeNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajePuntajeNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPuntajeNomi;
	protected JButton jButtonModificarToolBarPuntajeNomi;
	protected JButton jButtonActualizarToolBarPuntajeNomi;
    protected JButton jButtonEliminarToolBarPuntajeNomi;
	protected JButton jButtonCancelarToolBarPuntajeNomi;
    protected JButton jButtonGuardarCambiosToolBarPuntajeNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarPuntajeNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarPuntajeNomi;
	protected JButton jButtonCerrarToolBarPuntajeNomi;
	
	protected JButton jButtonProcesarInformacionToolBarPuntajeNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPuntajeNomi;
	protected JMenuItem jMenuItemModificarPuntajeNomi;
	protected JMenuItem jMenuItemActualizarPuntajeNomi;
    protected JMenuItem jMenuItemEliminarPuntajeNomi;
	protected JMenuItem jMenuItemCancelarPuntajeNomi;
    protected JMenuItem jMenuItemGuardarCambiosPuntajeNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaPuntajeNomi;
	protected JMenuItem jMenuItemCerrarPuntajeNomi;
	protected JMenuItem jMenuItemDetalleCerrarPuntajeNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarPuntajeNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionPuntajeNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPuntajeNomi;
	protected JMenuItem jMenuItemMostrarOcultarPuntajeNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPuntajeNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPuntajeNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPuntajeNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPuntajeNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPuntajeNomi;
	public JLabel jLabelIdPuntajeNomi;
	public JTextFieldMe jTextFieldidPuntajeNomi;
	public JButton jButtonidPuntajeNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombrePuntajeNomi;
	public JLabel jLabelnombrePuntajeNomi;
	public JTextField jTextFieldnombrePuntajeNomi;
	public JButton jButtonnombrePuntajeNomiBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPuntajeNomi;
	
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
	
	public PuntajeNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPuntajeNomi=new JPanel();
				this.jPanelAccionesFormularioPuntajeNomi=new JPanel();
				this.jmenuBarDetallePuntajeNomi=new JMenuBar();
				this.jTtoolBarDetallePuntajeNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntajeNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PuntajeNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PuntajeNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PuntajeNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntajeNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PuntajeNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntajeNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PuntajeNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntajeNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PuntajeNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPuntajeNomi() {
		return this.jButtonActualizarToolBarPuntajeNomi;
	}
	
	public JButton getjButtonEliminarToolBarPuntajeNomi() {
		return this.jButtonEliminarToolBarPuntajeNomi;
	}
	
	public JButton getjButtonCancelarToolBarPuntajeNomi() {
		return this.jButtonCancelarToolBarPuntajeNomi;
	}		
	
	public JButton getjButtonProcesarInformacionPuntajeNomi() {
		return this.jButtonProcesarInformacionPuntajeNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPuntajeNomi)	{
		this.jButtonProcesarInformacionPuntajeNomi = jButtonProcesarInformacionPuntajeNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPuntajeNomi() {
		return this.jComboBoxTiposAccionesPuntajeNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPuntajeNomi(
			JComboBox jComboBoxTiposRelacionesPuntajeNomi) {
		this.jComboBoxTiposRelacionesPuntajeNomi = jComboBoxTiposRelacionesPuntajeNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPuntajeNomi(
			JComboBox jComboBoxTiposAccionesPuntajeNomi) {
		this.jComboBoxTiposAccionesPuntajeNomi = jComboBoxTiposAccionesPuntajeNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPuntajeNomi() {
		return this.jComboBoxTiposAccionesFormularioPuntajeNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPuntajeNomi(
			JComboBox jComboBoxTiposAccionesFormularioPuntajeNomi) {
		this.jComboBoxTiposAccionesFormularioPuntajeNomi = jComboBoxTiposAccionesFormularioPuntajeNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.puntajenomiSessionBean=new PuntajeNomiSessionBean();
		
		this.puntajenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.puntajenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.puntajenomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formatonomiSessionBean=new FormatoNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PuntajeNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PuntajeNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PuntajeNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Puntaje Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
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
	
		PuntajeNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePuntajeNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPuntajeNomi=new JButtonMe();
				this.jButtonModificarToolBarPuntajeNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPuntajeNomi,this.jTtoolBarDetallePuntajeNomi,
							"actualizar","actualizar","Actualizar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPuntajeNomi,this.jTtoolBarDetallePuntajeNomi,
							"eliminar","eliminar","Eliminar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPuntajeNomi,this.jTtoolBarDetallePuntajeNomi,
							"cancelar","cancelar","Cancelar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPuntajeNomi,this.jTtoolBarDetallePuntajeNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPuntajeNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPuntajeNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPuntajeNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePuntajeNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePuntajeNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPuntajeNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPuntajeNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPuntajeNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPuntajeNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPuntajeNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPuntajeNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPuntajeNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPuntajeNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPuntajeNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPuntajeNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPuntajeNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPuntajeNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPuntajeNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPuntajeNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPuntajeNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPuntajeNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPuntajeNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPuntajeNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPuntajeNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPuntajeNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPuntajeNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPuntajeNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPuntajeNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPuntajeNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPuntajeNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPuntajeNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPuntajeNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPuntajeNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPuntajeNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPuntajeNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPuntajeNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPuntajeNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPuntajeNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPuntajeNomi.add(this.jMenuItemDetalleCerrarPuntajeNomi);
		
		this.jmenuDetalleAccionesPuntajeNomi.add(this.jMenuItemActualizarPuntajeNomi);
		this.jmenuDetalleAccionesPuntajeNomi.add(this.jMenuItemEliminarPuntajeNomi);
		this.jmenuDetalleAccionesPuntajeNomi.add(this.jMenuItemCancelarPuntajeNomi);		
		
		//this.jmenuDetalleDatosPuntajeNomi.add(this.jMenuItemDetalleAbrirOrderByPuntajeNomi);				
		this.jmenuDetalleDatosPuntajeNomi.add(this.jMenuItemDetalleMostarOcultarPuntajeNomi);				
				
		//this.jmenuDetalleAccionesPuntajeNomi.add(this.jMenuItemGuardarCambiosPuntajeNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePuntajeNomi.add(this.jmenuDetalleArchivoPuntajeNomi);		
		this.jmenuBarDetallePuntajeNomi.add(this.jmenuDetalleAccionesPuntajeNomi);		
		this.jmenuBarDetallePuntajeNomi.add(this.jmenuDetalleDatosPuntajeNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePuntajeNomi.add(this.jmenuDetallePuntajeNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePuntajeNomi);				
	}
	
	
	public void inicializarElementosCamposPuntajeNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPuntajeNomi = new JLabelMe();
		jLabelIdPuntajeNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPuntajeNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPuntajeNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPuntajeNomi.setToolTipText(PuntajeNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPuntajeNomi= new GridBagLayout();

		this.jPanelidPuntajeNomi.setLayout(this.gridaBagLayoutPuntajeNomi);

		jTextFieldidPuntajeNomi = new JTextFieldMe();
		jTextFieldidPuntajeNomi.setText("Id");

		jTextFieldidPuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidPuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidPuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombrePuntajeNomi = new JLabelMe();
		this.jLabelnombrePuntajeNomi.setText(""+PuntajeNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePuntajeNomi.setToolTipText("Nombre");
		this.jLabelnombrePuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePuntajeNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePuntajeNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePuntajeNomi.setToolTipText(PuntajeNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPuntajeNomi = new GridBagLayout();
		this.jPanelnombrePuntajeNomi.setLayout(this.gridaBagLayoutPuntajeNomi);


		jTextFieldnombrePuntajeNomi= new JTextFieldMe();

		jTextFieldnombrePuntajeNomi.setEnabled(false);
		jTextFieldnombrePuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombrePuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombrePuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombrePuntajeNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombrePuntajeNomiBusqueda= new JButtonMe();
		this.jButtonnombrePuntajeNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePuntajeNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePuntajeNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePuntajeNomiBusqueda.setText("U");
		this.jButtonnombrePuntajeNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePuntajeNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePuntajeNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombrePuntajeNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombrePuntajeNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePuntajeNomiBusqueda"));

		if(this.puntajenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePuntajeNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPuntajeNomi() {
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
		//this.jInternalFrameDetallePuntajeNomi = new PuntajeNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Puntaje Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPuntajeNomi= new GridBagLayout();
		

		
		String sToolTipPuntajeNomi="";
		sToolTipPuntajeNomi=PuntajeNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPuntajeNomi+="(Nomina.PuntajeNomi)";
		}
		
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipPuntajeNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPuntajeNomi = new JButtonMe();
		this.jButtonModificarPuntajeNomi = new JButtonMe();
        this.jButtonActualizarPuntajeNomi = new JButtonMe();
        this.jButtonEliminarPuntajeNomi = new JButtonMe();
        this.jButtonCancelarPuntajeNomi = new JButtonMe();
        this.jButtonGuardarCambiosPuntajeNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaPuntajeNomi = new JButtonMe();
		this.jButtonCerrarPuntajeNomi = new JButtonMe();
		
		this.jScrollPanelDatosPuntajeNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionPuntajeNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralPuntajeNomi = new JScrollPane();
				
		
		
		this.jPanelCamposPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Puntaje Nomi";
		
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puntaje Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosPuntajeNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPuntajeNomi.setName("jPanelCamposPuntajeNomi"); 

		this.jPanelCamposOcultosPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPuntajeNomi.setName("jPanelCamposOcultosPuntajeNomi"); 

        this.jPanelAccionesPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPuntajeNomi.setToolTipText("Acciones");
        this.jPanelAccionesPuntajeNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPuntajeNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPuntajeNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPuntajeNomi.setText("Nuevo");
		this.jButtonModificarPuntajeNomi.setText("Editar");
        this.jButtonActualizarPuntajeNomi.setText("Actualizar");
        this.jButtonEliminarPuntajeNomi.setText("Eliminar");
        this.jButtonCancelarPuntajeNomi.setText("Cancelar");
        this.jButtonGuardarCambiosPuntajeNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaPuntajeNomi.setText("Guardar");
		this.jButtonCerrarPuntajeNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPuntajeNomi,"nuevo_button","Nuevo",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPuntajeNomi,"modificar_button","Editar",this.puntajenomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPuntajeNomi,"actualizar_button","Actualizar",this.puntajenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPuntajeNomi,"eliminar_button","Eliminar",this.puntajenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPuntajeNomi,"cancelar_button","Cancelar",this.puntajenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPuntajeNomi,"guardarcambios_button","Guardar",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPuntajeNomi,"guardarcambiostabla_button","Guardar",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPuntajeNomi,"cerrar_button","Salir",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPuntajeNomi.setToolTipText("Nuevo"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPuntajeNomi.setToolTipText("Editar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPuntajeNomi.setToolTipText("Actualizar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPuntajeNomi.setToolTipText("Eliminar)"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPuntajeNomi.setToolTipText("Cancelar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPuntajeNomi.setToolTipText("Guardar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPuntajeNomi.setToolTipText("Guardar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPuntajeNomi.setToolTipText("Salir"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPuntajeNomi";
		inputMap = this.jButtonNuevoPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPuntajeNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPuntajeNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPuntajeNomi";
		inputMap = this.jButtonActualizarPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPuntajeNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarPuntajeNomi";
		inputMap = this.jButtonEliminarPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPuntajeNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarPuntajeNomi";
		inputMap = this.jButtonCancelarPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPuntajeNomi"));
		
		//CERRAR		
		sMapKey = "CerrarPuntajeNomi";
		inputMap = this.jButtonCerrarPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPuntajeNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPuntajeNomi";
		inputMap = this.jButtonGuardarCambiosTablaPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPuntajeNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPuntajeNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPuntajeNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPuntajeNomi.setToolTipText("Nuevo PuntajeNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPuntajeNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPuntajeNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPuntajeNomi.setToolTipText("Sin Cerrar Ventana PuntajeNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePuntajeNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePuntajeNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePuntajeNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPuntajeNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPuntajeNomi.setText("Accion");
		this.jComboBoxTiposAccionesPuntajeNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPuntajeNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPuntajeNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPuntajeNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPuntajeNomi = new JLabelMe();
		
		this.jLabelAccionesPuntajeNomi.setText("Acciones");		
		this.jLabelAccionesPuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPuntajeNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPuntajeNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPuntajeNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPuntajeNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPuntajeNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuntajeNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuntajeNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPuntajeNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPuntajeNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPuntajeNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPuntajeNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPuntajeNomi = new GridBagLayout();
		
		this.jPanelCamposPuntajeNomi.setLayout(gridaBagLayoutCamposPuntajeNomi);
		this.jPanelCamposOcultosPuntajeNomi.setLayout(gridaBagLayoutCamposOcultosPuntajeNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
	this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuntajeNomi.gridy = 0;
	this.gridBagConstraintsPuntajeNomi.gridx = 0;
	this.gridBagConstraintsPuntajeNomi.ipadx = 0;
	this.gridBagConstraintsPuntajeNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPuntajeNomi.add(jLabelIdPuntajeNomi, this.gridBagConstraintsPuntajeNomi);



	this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
	this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuntajeNomi.gridy = 0;
	this.gridBagConstraintsPuntajeNomi.gridx = 1;
	this.gridBagConstraintsPuntajeNomi.ipadx = 0;
	this.gridBagConstraintsPuntajeNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPuntajeNomi.add(jTextFieldidPuntajeNomi, this.gridBagConstraintsPuntajeNomi);


	this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
	this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuntajeNomi.gridy = 0;
	this.gridBagConstraintsPuntajeNomi.gridx = 0;
	this.gridBagConstraintsPuntajeNomi.ipadx = 0;
	this.gridBagConstraintsPuntajeNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePuntajeNomi.add(jLabelnombrePuntajeNomi, this.gridBagConstraintsPuntajeNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		//this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntajeNomi.gridy = 0;
		this.gridBagConstraintsPuntajeNomi.gridx = 2;
		this.gridBagConstraintsPuntajeNomi.ipadx = 0;
		this.gridBagConstraintsPuntajeNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePuntajeNomi.add(jButtonnombrePuntajeNomiBusqueda, this.gridBagConstraintsPuntajeNomi);
	}

	this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
	this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuntajeNomi.gridy = 0;
	this.gridBagConstraintsPuntajeNomi.gridx = 1;
	this.gridBagConstraintsPuntajeNomi.ipadx = 0;
	this.gridBagConstraintsPuntajeNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePuntajeNomi.add(jTextFieldnombrePuntajeNomi, this.gridBagConstraintsPuntajeNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
	this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPuntajeNomi.gridy = iYPanelCamposPuntajeNomi;
	this.gridBagConstraintsPuntajeNomi.gridx = iXPanelCamposPuntajeNomi++;
	this.gridBagConstraintsPuntajeNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPuntajeNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPuntajeNomi.add(this.jPanelidPuntajeNomi, this.gridBagConstraintsPuntajeNomi);



	if(iXPanelCamposPuntajeNomi % 1==0) {
		iXPanelCamposPuntajeNomi=0;
		iYPanelCamposPuntajeNomi++;
	}
	this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
	this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPuntajeNomi.gridy = iYPanelCamposPuntajeNomi;
	this.gridBagConstraintsPuntajeNomi.gridx = iXPanelCamposPuntajeNomi++;
	this.gridBagConstraintsPuntajeNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPuntajeNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPuntajeNomi.add(this.jPanelnombrePuntajeNomi, this.gridBagConstraintsPuntajeNomi);



	if(iXPanelCamposPuntajeNomi % 1==0) {
		iXPanelCamposPuntajeNomi=0;
		iYPanelCamposPuntajeNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesPuntajeNomi= new GridBagLayout();
		this.jPanelAccionesPuntajeNomi.setLayout(gridaBagLayoutAccionesPuntajeNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPuntajeNomi= new GridBagLayout();
		this.jPanelAccionesFormularioPuntajeNomi.setLayout(gridaBagLayoutAccionesFormularioPuntajeNomi);
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPuntajeNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPuntajeNomi.add(this.jComboBoxTiposAccionesFormularioPuntajeNomi, this.gridBagConstraintsPuntajeNomi);

		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPuntajeNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPuntajeNomi.add(this.jCheckBoxPostAccionNuevoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.puntajenomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPuntajeNomi.add(this.jCheckBoxPostAccionSinCerrarPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.puntajenomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPuntajeNomi.add(this.jCheckBoxPostAccionSinMensajePuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = 0;
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesPuntajeNomi.add(this.jButtonModificarPuntajeNomi, this.gridBagConstraintsPuntajeNomi);							

		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = 0;
		this.gridBagConstraintsPuntajeNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesPuntajeNomi.add(this.jButtonEliminarPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
			
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = 0;		
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesPuntajeNomi.add(this.jButtonActualizarPuntajeNomi, this.gridBagConstraintsPuntajeNomi);


		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = 0;		
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesPuntajeNomi.add(this.jButtonGuardarCambiosPuntajeNomi, this.gridBagConstraintsPuntajeNomi);	
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = 0;		
		this.gridBagConstraintsPuntajeNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesPuntajeNomi.add(this.jButtonCancelarPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPuntajeNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPuntajeNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();						
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPuntajeNomi.gridx = 0;		
			//this.gridBagConstraintsPuntajeNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPuntajeNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPuntajeNomi.gridx =0;
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPuntajeNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PuntajeNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePuntajeNomi = new PuntajeNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Puntaje Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Puntaje Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Puntaje Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PuntajeNomiModel puntajenomiModel=new PuntajeNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//PuntajeNomiModel.PuntajeNomiFocusTraversalPolicy puntajenomiFocusTraversalPolicy = puntajenomiModel.new PuntajeNomiFocusTraversalPolicy(this);
			
			//puntajenomiFocusTraversalPolicy.setpuntajenomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(puntajenomiModel);
			
			
			this.jContentPaneDetallePuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePuntajeNomi = new GridBagLayout();	
			this.jContentPaneDetallePuntajeNomi.setLayout(gridaBagLayoutDetallePuntajeNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPuntajeNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
				this.gridBagConstraintsPuntajeNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPuntajeNomi.gridx = 0;
					
				
				this.jContentPaneDetallePuntajeNomi.add(jTtoolBarDetallePuntajeNomi, gridBagConstraintsPuntajeNomi);								
				
}
			
			this.jScrollPanelDatosEdicionPuntajeNomi=   new JScrollPane(jContentPaneDetallePuntajeNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPuntajeNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuntajeNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuntajeNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPuntajeNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPuntajeNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuntajeNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuntajeNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPuntajeNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPuntajeNomi.gridx = 0;
	        
			this.jContentPaneDetallePuntajeNomi.add(jPanelCamposPuntajeNomi, gridBagConstraintsPuntajeNomi);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& puntajenomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomi(this.puedeCargarPorParteFormatoNomi,false,-1);
					
					if(this.puntajenomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPuntajeNomi= new GridBagConstraints();
						this.gridBagConstraintsPuntajeNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPuntajeNomi.gridx = 0;
						this.jContentPaneDetallePuntajeNomi.add(this.jTabbedPaneRelacionesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPuntajeNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomi(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPuntajeNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
					this.gridBagConstraintsPuntajeNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPuntajeNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPuntajeNomi.gridx = 0;
					
				
					this.jContentPaneDetallePuntajeNomi.add(jPanelCamposOcultosPuntajeNomi, gridBagConstraintsPuntajeNomi);
				
					this.jPanelCamposOcultosPuntajeNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsPuntajeNomi.gridx = 0;
	        this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePuntajeNomi.add(this.jPanelAccionesFormularioPuntajeNomi, this.gridBagConstraintsPuntajeNomi);							
			
			
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
	        this.gridBagConstraintsPuntajeNomi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsPuntajeNomi.gridx = 0;
	        
			
			this.jContentPaneDetallePuntajeNomi.add(this.jPanelAccionesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPuntajeNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPuntajeNomi=   new JScrollPane(this.jPanelCamposPuntajeNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPuntajeNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuntajeNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuntajeNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPuntajeNomi.gridx = 0;
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPuntajeNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPuntajeNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPuntajeNomi, this.gridBagConstraintsPuntajeNomi);			
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPuntajeNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntajeNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			
			
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntajeNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
			
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPuntajeNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPuntajeNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionPuntajeNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormatoNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formatonomiSessionBean=new FormatoNomiSessionBean();
		this.formatonomiSessionBean.setConGuardarRelaciones(false);
		this.formatonomiSessionBean.setEsGuardarRelacionado(true);

		this.formatonomiBeanSwingJInternalFrame=null;//new FormatoNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formatonomiBeanSwingJInternalFramePopup=new FormatoNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formatonomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {

				FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL=PuntajeNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PuntajeNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formatonomiSessionBean.setEsGuardarRelacionado(true);

				this.formatonomiBeanSwingJInternalFrame=new FormatoNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formatonomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formatonomiBeanSwingJInternalFrame.setformatonomiSessionBean(this.formatonomiSessionBean);

				//this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
				//this.gridBagConstraintsPuntajeNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPuntajeNomi.gridx = 0;
				//this.jContentPaneDetallePuntajeNomi.add(this.formatonomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPuntajeNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPuntajeNomi.add("Formato Nomis",this.formatonomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPuntajeNomi.setComponentAt(iIndexTab,this.formatonomiBeanSwingJInternalFrame.getContentPane());
				}

				//FormatoNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formatonomiSessionBean.setEsGuardarRelacionado(false);
				this.formatonomiBeanSwingJInternalFrame=null;//new FormatoNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormatoNomi) {
					this.jTabbedPaneRelacionesPuntajeNomi.add("Formato Nomis",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormatoNomiBeanSwingJInternalFrame(List<PuntajeNomi> puntajenomis,PuntajeNomi puntajenomi,FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formatonomiBeanSwingJInternalFrame=new FormatoNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formatonomiBeanSwingJInternalFrame.getFormatoNomiLogic().setConnexion(this.puntajenomiLogic.getConnexion());

					formatonomiBeanSwingJInternalFrame.setpuntajenomisForeignKey(puntajenomis);
					formatonomiBeanSwingJInternalFrame.setpuntajenomiForeignKey(puntajenomi);
					formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.setisBusquedaDesdeForeignKeySesionPuntajeNomi(true);
					formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.setlidPuntajeNomiActual(puntajenomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formatonomiBeanSwingJInternalFrame.cargarCombosForeignKeyFormatoNomi(formatonomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					formatonomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaPuntajeNomi(true);
					formatonomiBeanSwingJInternalFrame.setid_puntaje_nomiFK_IdPuntajeNomi(puntajenomi.getId());

					if(!this.conCargarFormDetalle) {
						formatonomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formatonomiBeanSwingJInternalFrame.setSelectedItemCombosFramePuntajeNomiForeignKey(puntajenomi,1,false,true,true);
					formatonomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formatonomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdPuntajeNomi");
					formatonomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPuntajeNomi");
					formatonomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomi(true);
					formatonomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormatoNomi("n",formatonomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, formatonomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formatonomiBeanSwingJInternalFrame.setAutoscrolls(true);
					formatonomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formatonomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomi("relacionado");
					} else {
						formatonomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomi("no_relacionado");
					}

					formatonomiBeanSwingJInternalFrame.getjButtonRecargarInformacionFormatoNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
