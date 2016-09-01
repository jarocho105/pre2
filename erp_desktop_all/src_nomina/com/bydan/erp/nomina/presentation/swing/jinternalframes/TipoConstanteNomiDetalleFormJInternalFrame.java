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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.TipoConstanteNomiConstantesFunciones;

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
public class TipoConstanteNomiDetalleFormJInternalFrame extends TipoConstanteNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoConstanteNomi;
	
	protected JMenuBar jmenuBarDetalleTipoConstanteNomi;
	
	protected JMenu jmenuDetalleTipoConstanteNomi;
	protected JMenu jmenuDetalleArchivoTipoConstanteNomi;
	protected JMenu jmenuDetalleAccionesTipoConstanteNomi;
	protected JMenu jmenuDetalleDatosTipoConstanteNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoConstanteNomi;	
	protected GridBagConstraints gridBagConstraintsTipoConstanteNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoConstanteNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoConstanteNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoConstanteNomiSessionBean tipoconstantenomiSessionBean;
	
	

	public ConstanteNomiBeanSwingJInternalFrame constantenomiBeanSwingJInternalFrame=null;
	public ConstanteNomiBeanSwingJInternalFrame constantenomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConstanteNomi=false;
	public ConstanteNomiSessionBean constantenomiSessionBean;
	
		
	
	public TipoConstanteNomiLogic tipoconstantenomiLogic;
	
	public JScrollPane jScrollPanelDatosTipoConstanteNomi;
	public JScrollPane jScrollPanelDatosEdicionTipoConstanteNomi;
	public JScrollPane jScrollPanelDatosGeneralTipoConstanteNomi;
	
	protected JPanel jPanelCamposTipoConstanteNomi;    
	protected JPanel jPanelCamposOcultosTipoConstanteNomi;    	
	protected JPanel jPanelAccionesTipoConstanteNomi;
	protected JPanel jPanelAccionesFormularioTipoConstanteNomi;
    
	
	
	protected Integer iXPanelCamposTipoConstanteNomi=0;
	protected Integer iYPanelCamposTipoConstanteNomi=0;
	
	protected Integer iXPanelCamposOcultosTipoConstanteNomi=0;
	protected Integer iYPanelCamposOcultosTipoConstanteNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoConstanteNomi;
	public JButton jButtonModificarTipoConstanteNomi;
	public JButton jButtonActualizarTipoConstanteNomi;
    public JButton jButtonEliminarTipoConstanteNomi;
	public JButton jButtonCancelarTipoConstanteNomi;
    public JButton jButtonGuardarCambiosTipoConstanteNomi;
	public JButton jButtonGuardarCambiosTablaTipoConstanteNomi;
	protected JButton jButtonCerrarTipoConstanteNomi;
	
	
	protected JButton jButtonProcesarInformacionTipoConstanteNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoConstanteNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoConstanteNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoConstanteNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoConstanteNomi;
	protected JButton jButtonModificarToolBarTipoConstanteNomi;
	protected JButton jButtonActualizarToolBarTipoConstanteNomi;
    protected JButton jButtonEliminarToolBarTipoConstanteNomi;
	protected JButton jButtonCancelarToolBarTipoConstanteNomi;
    protected JButton jButtonGuardarCambiosToolBarTipoConstanteNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoConstanteNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoConstanteNomi;
	protected JButton jButtonCerrarToolBarTipoConstanteNomi;
	
	protected JButton jButtonProcesarInformacionToolBarTipoConstanteNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoConstanteNomi;
	protected JMenuItem jMenuItemModificarTipoConstanteNomi;
	protected JMenuItem jMenuItemActualizarTipoConstanteNomi;
    protected JMenuItem jMenuItemEliminarTipoConstanteNomi;
	protected JMenuItem jMenuItemCancelarTipoConstanteNomi;
    protected JMenuItem jMenuItemGuardarCambiosTipoConstanteNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoConstanteNomi;
	protected JMenuItem jMenuItemCerrarTipoConstanteNomi;
	protected JMenuItem jMenuItemDetalleCerrarTipoConstanteNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoConstanteNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoConstanteNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoConstanteNomi;
	protected JMenuItem jMenuItemMostrarOcultarTipoConstanteNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoConstanteNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoConstanteNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoConstanteNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoConstanteNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoConstanteNomi;
	public JLabel jLabelIdTipoConstanteNomi;
	public JTextFieldMe jTextFieldidTipoConstanteNomi;
	public JButton jButtonidTipoConstanteNomiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoConstanteNomi;
	public JLabel jLabelcodigoTipoConstanteNomi;
	public JTextField jTextFieldcodigoTipoConstanteNomi;
	public JButton jButtoncodigoTipoConstanteNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoConstanteNomi;
	public JLabel jLabelnombreTipoConstanteNomi;
	public JTextArea jTextAreanombreTipoConstanteNomi;
	public JScrollPane jscrollPanenombreTipoConstanteNomi;
	public JButton jButtonnombreTipoConstanteNomiBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoConstanteNomi;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoConstanteNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoConstanteNomi=new JPanel();
				this.jPanelAccionesFormularioTipoConstanteNomi=new JPanel();
				this.jmenuBarDetalleTipoConstanteNomi=new JMenuBar();
				this.jTtoolBarDetalleTipoConstanteNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConstanteNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoConstanteNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConstanteNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConstanteNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConstanteNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoConstanteNomi() {
		return this.jButtonActualizarToolBarTipoConstanteNomi;
	}
	
	public JButton getjButtonEliminarToolBarTipoConstanteNomi() {
		return this.jButtonEliminarToolBarTipoConstanteNomi;
	}
	
	public JButton getjButtonCancelarToolBarTipoConstanteNomi() {
		return this.jButtonCancelarToolBarTipoConstanteNomi;
	}		
	
	public JButton getjButtonProcesarInformacionTipoConstanteNomi() {
		return this.jButtonProcesarInformacionTipoConstanteNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoConstanteNomi)	{
		this.jButtonProcesarInformacionTipoConstanteNomi = jButtonProcesarInformacionTipoConstanteNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoConstanteNomi() {
		return this.jComboBoxTiposAccionesTipoConstanteNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoConstanteNomi(
			JComboBox jComboBoxTiposRelacionesTipoConstanteNomi) {
		this.jComboBoxTiposRelacionesTipoConstanteNomi = jComboBoxTiposRelacionesTipoConstanteNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoConstanteNomi(
			JComboBox jComboBoxTiposAccionesTipoConstanteNomi) {
		this.jComboBoxTiposAccionesTipoConstanteNomi = jComboBoxTiposAccionesTipoConstanteNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoConstanteNomi() {
		return this.jComboBoxTiposAccionesFormularioTipoConstanteNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoConstanteNomi(
			JComboBox jComboBoxTiposAccionesFormularioTipoConstanteNomi) {
		this.jComboBoxTiposAccionesFormularioTipoConstanteNomi = jComboBoxTiposAccionesFormularioTipoConstanteNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoconstantenomiSessionBean=new TipoConstanteNomiSessionBean();
		
		this.tipoconstantenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconstantenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoconstantenomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.constantenomiSessionBean=new ConstanteNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoConstanteNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Constante MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoConstanteNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoConstanteNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoConstanteNomi=new JButtonMe();
				this.jButtonModificarToolBarTipoConstanteNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoConstanteNomi,this.jTtoolBarDetalleTipoConstanteNomi,
							"actualizar","actualizar","Actualizar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoConstanteNomi,this.jTtoolBarDetalleTipoConstanteNomi,
							"eliminar","eliminar","Eliminar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoConstanteNomi,this.jTtoolBarDetalleTipoConstanteNomi,
							"cancelar","cancelar","Cancelar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoConstanteNomi,this.jTtoolBarDetalleTipoConstanteNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoConstanteNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoConstanteNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoConstanteNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoConstanteNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoConstanteNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoConstanteNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoConstanteNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoConstanteNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoConstanteNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoConstanteNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoConstanteNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoConstanteNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoConstanteNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoConstanteNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoConstanteNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoConstanteNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoConstanteNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoConstanteNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoConstanteNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoConstanteNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoConstanteNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoConstanteNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoConstanteNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoConstanteNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoConstanteNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoConstanteNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoConstanteNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoConstanteNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoConstanteNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoConstanteNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoConstanteNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoConstanteNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoConstanteNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoConstanteNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoConstanteNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoConstanteNomi.add(this.jMenuItemDetalleCerrarTipoConstanteNomi);
		
		this.jmenuDetalleAccionesTipoConstanteNomi.add(this.jMenuItemActualizarTipoConstanteNomi);
		this.jmenuDetalleAccionesTipoConstanteNomi.add(this.jMenuItemEliminarTipoConstanteNomi);
		this.jmenuDetalleAccionesTipoConstanteNomi.add(this.jMenuItemCancelarTipoConstanteNomi);		
		
		//this.jmenuDetalleDatosTipoConstanteNomi.add(this.jMenuItemDetalleAbrirOrderByTipoConstanteNomi);				
		this.jmenuDetalleDatosTipoConstanteNomi.add(this.jMenuItemDetalleMostarOcultarTipoConstanteNomi);				
				
		//this.jmenuDetalleAccionesTipoConstanteNomi.add(this.jMenuItemGuardarCambiosTipoConstanteNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoConstanteNomi.add(this.jmenuDetalleArchivoTipoConstanteNomi);		
		this.jmenuBarDetalleTipoConstanteNomi.add(this.jmenuDetalleAccionesTipoConstanteNomi);		
		this.jmenuBarDetalleTipoConstanteNomi.add(this.jmenuDetalleDatosTipoConstanteNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoConstanteNomi.add(this.jmenuDetalleTipoConstanteNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoConstanteNomi);				
	}
	
	
	public void inicializarElementosCamposTipoConstanteNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoConstanteNomi = new JLabelMe();
		jLabelIdTipoConstanteNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoConstanteNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoConstanteNomi.setToolTipText(TipoConstanteNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoConstanteNomi= new GridBagLayout();

		this.jPanelidTipoConstanteNomi.setLayout(this.gridaBagLayoutTipoConstanteNomi);

		jTextFieldidTipoConstanteNomi = new JTextFieldMe();
		jTextFieldidTipoConstanteNomi.setText("Id");

		jTextFieldidTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoConstanteNomi = new JLabelMe();
		this.jLabelcodigoTipoConstanteNomi.setText(""+TipoConstanteNomiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoConstanteNomi.setToolTipText("Codigo");
		this.jLabelcodigoTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoConstanteNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoConstanteNomi.setToolTipText(TipoConstanteNomiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoConstanteNomi = new GridBagLayout();
		this.jPanelcodigoTipoConstanteNomi.setLayout(this.gridaBagLayoutTipoConstanteNomi);


		jTextFieldcodigoTipoConstanteNomi= new JTextFieldMe();

		jTextFieldcodigoTipoConstanteNomi.setEnabled(false);
		jTextFieldcodigoTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoConstanteNomiBusqueda= new JButtonMe();
		this.jButtoncodigoTipoConstanteNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoConstanteNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoConstanteNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoConstanteNomiBusqueda.setText("U");
		this.jButtoncodigoTipoConstanteNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoConstanteNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoConstanteNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoConstanteNomiBusqueda"));

		if(this.tipoconstantenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoConstanteNomiBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoConstanteNomi = new JLabelMe();
		this.jLabelnombreTipoConstanteNomi.setText(""+TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoConstanteNomi.setToolTipText("Nombre");
		this.jLabelnombreTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoConstanteNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoConstanteNomi.setToolTipText(TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoConstanteNomi = new GridBagLayout();
		this.jPanelnombreTipoConstanteNomi.setLayout(this.gridaBagLayoutTipoConstanteNomi);


		jTextAreanombreTipoConstanteNomi= new JTextAreaMe();
		jTextAreanombreTipoConstanteNomi.setEnabled(false);
		jTextAreanombreTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConstanteNomi.setLineWrap(true);
		jTextAreanombreTipoConstanteNomi.setWrapStyleWord(true);
		jTextAreanombreTipoConstanteNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoConstanteNomi.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoConstanteNomi = new JScrollPane(jTextAreanombreTipoConstanteNomi);
		jscrollPanenombreTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoConstanteNomiBusqueda= new JButtonMe();
		this.jButtonnombreTipoConstanteNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoConstanteNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoConstanteNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoConstanteNomiBusqueda.setText("U");
		this.jButtonnombreTipoConstanteNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoConstanteNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoConstanteNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoConstanteNomiBusqueda"));

		if(this.tipoconstantenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoConstanteNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoConstanteNomi() {
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
		//this.jInternalFrameDetalleTipoConstanteNomi = new TipoConstanteNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Constante DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoConstanteNomi= new GridBagLayout();
		

		
		String sToolTipTipoConstanteNomi="";
		sToolTipTipoConstanteNomi=TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoConstanteNomi+="(Nomina.TipoConstanteNomi)";
		}
		
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoConstanteNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoConstanteNomi = new JButtonMe();
		this.jButtonModificarTipoConstanteNomi = new JButtonMe();
        this.jButtonActualizarTipoConstanteNomi = new JButtonMe();
        this.jButtonEliminarTipoConstanteNomi = new JButtonMe();
        this.jButtonCancelarTipoConstanteNomi = new JButtonMe();
        this.jButtonGuardarCambiosTipoConstanteNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoConstanteNomi = new JButtonMe();
		this.jButtonCerrarTipoConstanteNomi = new JButtonMe();
		
		this.jScrollPanelDatosTipoConstanteNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoConstanteNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoConstanteNomi = new JScrollPane();
				
		
		
		this.jPanelCamposTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Constante";
		
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Constantes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoConstanteNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoConstanteNomi.setName("jPanelCamposTipoConstanteNomi"); 

		this.jPanelCamposOcultosTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoConstanteNomi.setName("jPanelCamposOcultosTipoConstanteNomi"); 

        this.jPanelAccionesTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoConstanteNomi.setToolTipText("Acciones");
        this.jPanelAccionesTipoConstanteNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoConstanteNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoConstanteNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoConstanteNomi.setText("Nuevo");
		this.jButtonModificarTipoConstanteNomi.setText("Editar");
        this.jButtonActualizarTipoConstanteNomi.setText("Actualizar");
        this.jButtonEliminarTipoConstanteNomi.setText("Eliminar");
        this.jButtonCancelarTipoConstanteNomi.setText("Cancelar");
        this.jButtonGuardarCambiosTipoConstanteNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoConstanteNomi.setText("Guardar");
		this.jButtonCerrarTipoConstanteNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoConstanteNomi,"nuevo_button","Nuevo",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoConstanteNomi,"modificar_button","Editar",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoConstanteNomi,"actualizar_button","Actualizar",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoConstanteNomi,"eliminar_button","Eliminar",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoConstanteNomi,"cancelar_button","Cancelar",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoConstanteNomi,"guardarcambios_button","Guardar",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoConstanteNomi,"guardarcambiostabla_button","Guardar",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoConstanteNomi,"cerrar_button","Salir",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoConstanteNomi.setToolTipText("Nuevo"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoConstanteNomi.setToolTipText("Editar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoConstanteNomi.setToolTipText("Actualizar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoConstanteNomi.setToolTipText("Eliminar)"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoConstanteNomi.setToolTipText("Cancelar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoConstanteNomi.setToolTipText("Guardar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoConstanteNomi.setToolTipText("Guardar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoConstanteNomi.setToolTipText("Salir"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoConstanteNomi";
		inputMap = this.jButtonNuevoTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoConstanteNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoConstanteNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoConstanteNomi";
		inputMap = this.jButtonActualizarTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoConstanteNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoConstanteNomi";
		inputMap = this.jButtonEliminarTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoConstanteNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoConstanteNomi";
		inputMap = this.jButtonCancelarTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoConstanteNomi"));
		
		//CERRAR		
		sMapKey = "CerrarTipoConstanteNomi";
		inputMap = this.jButtonCerrarTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoConstanteNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoConstanteNomi";
		inputMap = this.jButtonGuardarCambiosTablaTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoConstanteNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoConstanteNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoConstanteNomi.setToolTipText("Nuevo TipoConstanteNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoConstanteNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoConstanteNomi.setToolTipText("Sin Cerrar Ventana TipoConstanteNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoConstanteNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoConstanteNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoConstanteNomi.setText("Accion");
		this.jComboBoxTiposAccionesTipoConstanteNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoConstanteNomi = new JLabelMe();
		
		this.jLabelAccionesTipoConstanteNomi.setText("Acciones");		
		this.jLabelAccionesTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoConstanteNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoConstanteNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoConstanteNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoConstanteNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConstanteNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConstanteNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoConstanteNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoConstanteNomi = new GridBagLayout();
		
		this.jPanelCamposTipoConstanteNomi.setLayout(gridaBagLayoutCamposTipoConstanteNomi);
		this.jPanelCamposOcultosTipoConstanteNomi.setLayout(gridaBagLayoutCamposOcultosTipoConstanteNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
	this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
	this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
	this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoConstanteNomi.add(jLabelIdTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);



	this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
	this.gridBagConstraintsTipoConstanteNomi.gridx = 1;
	this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
	this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoConstanteNomi.add(jTextFieldidTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);


	this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
	this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
	this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
	this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoConstanteNomi.add(jLabelcodigoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
		this.gridBagConstraintsTipoConstanteNomi.gridx = 2;
		this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
		this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoConstanteNomi.add(jButtoncodigoTipoConstanteNomiBusqueda, this.gridBagConstraintsTipoConstanteNomi);
	}

	this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
	this.gridBagConstraintsTipoConstanteNomi.gridx = 1;
	this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
	this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoConstanteNomi.add(jTextFieldcodigoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);


	this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
	this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
	this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
	this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoConstanteNomi.add(jLabelnombreTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
		this.gridBagConstraintsTipoConstanteNomi.gridx = 2;
		this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
		this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoConstanteNomi.add(jButtonnombreTipoConstanteNomiBusqueda, this.gridBagConstraintsTipoConstanteNomi);
	}

	this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
	this.gridBagConstraintsTipoConstanteNomi.gridx = 1;
	this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
	this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoConstanteNomi.add(jscrollPanenombreTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConstanteNomi.gridy = iYPanelCamposTipoConstanteNomi;
	this.gridBagConstraintsTipoConstanteNomi.gridx = iXPanelCamposTipoConstanteNomi++;
	this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConstanteNomi.add(this.jPanelidTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);



	if(iXPanelCamposTipoConstanteNomi % 1==0) {
		iXPanelCamposTipoConstanteNomi=0;
		iYPanelCamposTipoConstanteNomi++;
	}
	this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConstanteNomi.gridy = iYPanelCamposTipoConstanteNomi;
	this.gridBagConstraintsTipoConstanteNomi.gridx = iXPanelCamposTipoConstanteNomi++;
	this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConstanteNomi.add(this.jPanelcodigoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);



	if(iXPanelCamposTipoConstanteNomi % 1==0) {
		iXPanelCamposTipoConstanteNomi=0;
		iYPanelCamposTipoConstanteNomi++;
	}
	this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConstanteNomi.gridy = iYPanelCamposTipoConstanteNomi;
	this.gridBagConstraintsTipoConstanteNomi.gridx = iXPanelCamposTipoConstanteNomi++;
	this.gridBagConstraintsTipoConstanteNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConstanteNomi.add(this.jPanelnombreTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);



	if(iXPanelCamposTipoConstanteNomi % 1==0) {
		iXPanelCamposTipoConstanteNomi=0;
		iYPanelCamposTipoConstanteNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoConstanteNomi= new GridBagLayout();
		this.jPanelAccionesTipoConstanteNomi.setLayout(gridaBagLayoutAccionesTipoConstanteNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoConstanteNomi= new GridBagLayout();
		this.jPanelAccionesFormularioTipoConstanteNomi.setLayout(gridaBagLayoutAccionesFormularioTipoConstanteNomi);
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoConstanteNomi.add(this.jComboBoxTiposAccionesFormularioTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);

		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoConstanteNomi.add(this.jCheckBoxPostAccionNuevoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoConstanteNomi.add(this.jCheckBoxPostAccionSinCerrarTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoConstanteNomi.add(this.jCheckBoxPostAccionSinMensajeTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoConstanteNomi.add(this.jButtonModificarTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);							

		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
		this.gridBagConstraintsTipoConstanteNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoConstanteNomi.add(this.jButtonEliminarTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
			
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = 0;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoConstanteNomi.add(this.jButtonActualizarTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);


		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = 0;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoConstanteNomi.add(this.jButtonGuardarCambiosTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);	
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = 0;		
		this.gridBagConstraintsTipoConstanteNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoConstanteNomi.add(this.jButtonCancelarTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoConstanteNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoConstanteNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();						
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoConstanteNomi.gridx = 0;		
			//this.gridBagConstraintsTipoConstanteNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoConstanteNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoConstanteNomi.gridx =0;
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoConstanteNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoConstanteNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoConstanteNomi = new TipoConstanteNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Constante DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Constante DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Constante Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoConstanteNomiModel tipoconstantenomiModel=new TipoConstanteNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoConstanteNomiModel.TipoConstanteNomiFocusTraversalPolicy tipoconstantenomiFocusTraversalPolicy = tipoconstantenomiModel.new TipoConstanteNomiFocusTraversalPolicy(this);
			
			//tipoconstantenomiFocusTraversalPolicy.settipoconstantenomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoconstantenomiModel);
			
			
			this.jContentPaneDetalleTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoConstanteNomi = new GridBagLayout();	
			this.jContentPaneDetalleTipoConstanteNomi.setLayout(gridaBagLayoutDetalleTipoConstanteNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoConstanteNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
					
				
				this.jContentPaneDetalleTipoConstanteNomi.add(jTtoolBarDetalleTipoConstanteNomi, gridBagConstraintsTipoConstanteNomi);								
				
}
			
			this.jScrollPanelDatosEdicionTipoConstanteNomi=   new JScrollPane(jContentPaneDetalleTipoConstanteNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoConstanteNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConstanteNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConstanteNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoConstanteNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoConstanteNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConstanteNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConstanteNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
	        
			this.jContentPaneDetalleTipoConstanteNomi.add(jPanelCamposTipoConstanteNomi, gridBagConstraintsTipoConstanteNomi);
			
			
			
			
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
						&& tipoconstantenomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameConstanteNomi(this.puedeCargarPorParteConstanteNomi,false,-1);
					
					if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoConstanteNomi= new GridBagConstraints();
						this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
						this.jContentPaneDetalleTipoConstanteNomi.add(this.jTabbedPaneRelacionesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoConstanteNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameConstanteNomi(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoConstanteNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
					this.gridBagConstraintsTipoConstanteNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
					
				
					this.jContentPaneDetalleTipoConstanteNomi.add(jPanelCamposOcultosTipoConstanteNomi, gridBagConstraintsTipoConstanteNomi);
				
					this.jPanelCamposOcultosTipoConstanteNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
	        this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoConstanteNomi.add(this.jPanelAccionesFormularioTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);							
			
			
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
	        this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoConstanteNomi.add(this.jPanelAccionesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoConstanteNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoConstanteNomi=   new JScrollPane(this.jPanelCamposTipoConstanteNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoConstanteNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConstanteNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConstanteNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoConstanteNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);			
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			
			
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
			
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoConstanteNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoConstanteNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoConstanteNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameConstanteNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.constantenomiSessionBean=new ConstanteNomiSessionBean();
		this.constantenomiSessionBean.setConGuardarRelaciones(false);
		this.constantenomiSessionBean.setEsGuardarRelacionado(true);

		this.constantenomiBeanSwingJInternalFrame=null;//new ConstanteNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.constantenomiBeanSwingJInternalFramePopup=new ConstanteNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.constantenomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.constantenomiSessionBean.getEsGuardarRelacionado()) {

				ConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL=TipoConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.constantenomiSessionBean.setEsGuardarRelacionado(true);

				this.constantenomiBeanSwingJInternalFrame=new ConstanteNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.constantenomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.constantenomiBeanSwingJInternalFrame.setconstantenomiSessionBean(this.constantenomiSessionBean);

				//this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
				//this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
				//this.jContentPaneDetalleTipoConstanteNomi.add(this.constantenomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoConstanteNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoConstanteNomi.add("Constante Nomis",this.constantenomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoConstanteNomi.setComponentAt(iIndexTab,this.constantenomiBeanSwingJInternalFrame.getContentPane());
				}

				//ConstanteNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.constantenomiSessionBean.setEsGuardarRelacionado(false);
				this.constantenomiBeanSwingJInternalFrame=null;//new ConstanteNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.constantenomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConstanteNomi) {
					this.jTabbedPaneRelacionesTipoConstanteNomi.add("Constante Nomis",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarConstanteNomiBeanSwingJInternalFrame(List<TipoConstanteNomi> tipoconstantenomis,TipoConstanteNomi tipoconstantenomi,ConstanteNomiBeanSwingJInternalFrame constantenomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//constantenomiBeanSwingJInternalFrame=new ConstanteNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					constantenomiBeanSwingJInternalFrame.getConstanteNomiLogic().setConnexion(this.tipoconstantenomiLogic.getConnexion());

					constantenomiBeanSwingJInternalFrame.settipoconstantenomisForeignKey(tipoconstantenomis);
					constantenomiBeanSwingJInternalFrame.settipoconstantenomiForeignKey(tipoconstantenomi);
					constantenomiBeanSwingJInternalFrame.constantenomiSessionBean.setisBusquedaDesdeForeignKeySesionTipoConstanteNomi(true);
					constantenomiBeanSwingJInternalFrame.constantenomiSessionBean.setlidTipoConstanteNomiActual(tipoconstantenomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					constantenomiBeanSwingJInternalFrame.cargarCombosForeignKeyConstanteNomi(constantenomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					constantenomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoConstanteNomi(true);
					constantenomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					constantenomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoConstanteNomi");
					constantenomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoConstanteNomi");
					constantenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaConstanteNomi(true);
					constantenomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConstanteNomi("n",constantenomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, constantenomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					constantenomiBeanSwingJInternalFrame.setAutoscrolls(true);
					constantenomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						constantenomiBeanSwingJInternalFrame.actualizarEstadoPanelsConstanteNomi("relacionado");
					} else {
						constantenomiBeanSwingJInternalFrame.actualizarEstadoPanelsConstanteNomi("no_relacionado");
					}

					constantenomiBeanSwingJInternalFrame.getjButtonRecargarInformacionConstanteNomi().setVisible(false);

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
