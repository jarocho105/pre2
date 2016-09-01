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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.nomina.util.TipoNovedadNomiConstantesFunciones;

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
public class TipoNovedadNomiDetalleFormJInternalFrame extends TipoNovedadNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoNovedadNomi;
	
	protected JMenuBar jmenuBarDetalleTipoNovedadNomi;
	
	protected JMenu jmenuDetalleTipoNovedadNomi;
	protected JMenu jmenuDetalleArchivoTipoNovedadNomi;
	protected JMenu jmenuDetalleAccionesTipoNovedadNomi;
	protected JMenu jmenuDetalleDatosTipoNovedadNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoNovedadNomi;	
	protected GridBagConstraints gridBagConstraintsTipoNovedadNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoNovedadNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoNovedadNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoNovedadNomiSessionBean tiponovedadnomiSessionBean;
	
	

	public NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFrame=null;
	public NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNovedadNomi=false;
	public NovedadNomiSessionBean novedadnomiSessionBean;
	
		
	
	public TipoNovedadNomiLogic tiponovedadnomiLogic;
	
	public JScrollPane jScrollPanelDatosTipoNovedadNomi;
	public JScrollPane jScrollPanelDatosEdicionTipoNovedadNomi;
	public JScrollPane jScrollPanelDatosGeneralTipoNovedadNomi;
	
	protected JPanel jPanelCamposTipoNovedadNomi;    
	protected JPanel jPanelCamposOcultosTipoNovedadNomi;    	
	protected JPanel jPanelAccionesTipoNovedadNomi;
	protected JPanel jPanelAccionesFormularioTipoNovedadNomi;
    
	
	
	protected Integer iXPanelCamposTipoNovedadNomi=0;
	protected Integer iYPanelCamposTipoNovedadNomi=0;
	
	protected Integer iXPanelCamposOcultosTipoNovedadNomi=0;
	protected Integer iYPanelCamposOcultosTipoNovedadNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoNovedadNomi;
	public JButton jButtonModificarTipoNovedadNomi;
	public JButton jButtonActualizarTipoNovedadNomi;
    public JButton jButtonEliminarTipoNovedadNomi;
	public JButton jButtonCancelarTipoNovedadNomi;
    public JButton jButtonGuardarCambiosTipoNovedadNomi;
	public JButton jButtonGuardarCambiosTablaTipoNovedadNomi;
	protected JButton jButtonCerrarTipoNovedadNomi;
	
	
	protected JButton jButtonProcesarInformacionTipoNovedadNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoNovedadNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoNovedadNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoNovedadNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoNovedadNomi;
	protected JButton jButtonModificarToolBarTipoNovedadNomi;
	protected JButton jButtonActualizarToolBarTipoNovedadNomi;
    protected JButton jButtonEliminarToolBarTipoNovedadNomi;
	protected JButton jButtonCancelarToolBarTipoNovedadNomi;
    protected JButton jButtonGuardarCambiosToolBarTipoNovedadNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoNovedadNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoNovedadNomi;
	protected JButton jButtonCerrarToolBarTipoNovedadNomi;
	
	protected JButton jButtonProcesarInformacionToolBarTipoNovedadNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoNovedadNomi;
	protected JMenuItem jMenuItemModificarTipoNovedadNomi;
	protected JMenuItem jMenuItemActualizarTipoNovedadNomi;
    protected JMenuItem jMenuItemEliminarTipoNovedadNomi;
	protected JMenuItem jMenuItemCancelarTipoNovedadNomi;
    protected JMenuItem jMenuItemGuardarCambiosTipoNovedadNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoNovedadNomi;
	protected JMenuItem jMenuItemCerrarTipoNovedadNomi;
	protected JMenuItem jMenuItemDetalleCerrarTipoNovedadNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoNovedadNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoNovedadNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoNovedadNomi;
	protected JMenuItem jMenuItemMostrarOcultarTipoNovedadNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoNovedadNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoNovedadNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoNovedadNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoNovedadNomi;
	public JLabel jLabelIdTipoNovedadNomi;
	public JTextFieldMe jTextFieldidTipoNovedadNomi;
	public JButton jButtonidTipoNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoNovedadNomi;
	public JLabel jLabelcodigoTipoNovedadNomi;
	public JTextField jTextFieldcodigoTipoNovedadNomi;
	public JButton jButtoncodigoTipoNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoNovedadNomi;
	public JLabel jLabelnombreTipoNovedadNomi;
	public JTextArea jTextAreanombreTipoNovedadNomi;
	public JScrollPane jscrollPanenombreTipoNovedadNomi;
	public JButton jButtonnombreTipoNovedadNomiBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoNovedadNomi;
	
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
	
	public TipoNovedadNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoNovedadNomi=new JPanel();
				this.jPanelAccionesFormularioTipoNovedadNomi=new JPanel();
				this.jmenuBarDetalleTipoNovedadNomi=new JMenuBar();
				this.jTtoolBarDetalleTipoNovedadNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNovedadNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoNovedadNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNovedadNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNovedadNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNovedadNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoNovedadNomi() {
		return this.jButtonActualizarToolBarTipoNovedadNomi;
	}
	
	public JButton getjButtonEliminarToolBarTipoNovedadNomi() {
		return this.jButtonEliminarToolBarTipoNovedadNomi;
	}
	
	public JButton getjButtonCancelarToolBarTipoNovedadNomi() {
		return this.jButtonCancelarToolBarTipoNovedadNomi;
	}		
	
	public JButton getjButtonProcesarInformacionTipoNovedadNomi() {
		return this.jButtonProcesarInformacionTipoNovedadNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoNovedadNomi)	{
		this.jButtonProcesarInformacionTipoNovedadNomi = jButtonProcesarInformacionTipoNovedadNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoNovedadNomi() {
		return this.jComboBoxTiposAccionesTipoNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoNovedadNomi(
			JComboBox jComboBoxTiposRelacionesTipoNovedadNomi) {
		this.jComboBoxTiposRelacionesTipoNovedadNomi = jComboBoxTiposRelacionesTipoNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoNovedadNomi(
			JComboBox jComboBoxTiposAccionesTipoNovedadNomi) {
		this.jComboBoxTiposAccionesTipoNovedadNomi = jComboBoxTiposAccionesTipoNovedadNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoNovedadNomi() {
		return this.jComboBoxTiposAccionesFormularioTipoNovedadNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoNovedadNomi(
			JComboBox jComboBoxTiposAccionesFormularioTipoNovedadNomi) {
		this.jComboBoxTiposAccionesFormularioTipoNovedadNomi = jComboBoxTiposAccionesFormularioTipoNovedadNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiponovedadnomiSessionBean=new TipoNovedadNomiSessionBean();
		
		this.tiponovedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponovedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiponovedadnomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.novedadnomiSessionBean=new NovedadNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoNovedadNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Novedad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoNovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoNovedadNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoNovedadNomi=new JButtonMe();
				this.jButtonModificarToolBarTipoNovedadNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoNovedadNomi,this.jTtoolBarDetalleTipoNovedadNomi,
							"actualizar","actualizar","Actualizar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoNovedadNomi,this.jTtoolBarDetalleTipoNovedadNomi,
							"eliminar","eliminar","Eliminar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoNovedadNomi,this.jTtoolBarDetalleTipoNovedadNomi,
							"cancelar","cancelar","Cancelar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoNovedadNomi,this.jTtoolBarDetalleTipoNovedadNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoNovedadNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoNovedadNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoNovedadNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoNovedadNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoNovedadNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoNovedadNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoNovedadNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoNovedadNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoNovedadNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoNovedadNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoNovedadNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoNovedadNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoNovedadNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoNovedadNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoNovedadNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoNovedadNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoNovedadNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoNovedadNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoNovedadNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoNovedadNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoNovedadNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoNovedadNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoNovedadNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoNovedadNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoNovedadNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoNovedadNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoNovedadNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoNovedadNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoNovedadNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoNovedadNomi.add(this.jMenuItemDetalleCerrarTipoNovedadNomi);
		
		this.jmenuDetalleAccionesTipoNovedadNomi.add(this.jMenuItemActualizarTipoNovedadNomi);
		this.jmenuDetalleAccionesTipoNovedadNomi.add(this.jMenuItemEliminarTipoNovedadNomi);
		this.jmenuDetalleAccionesTipoNovedadNomi.add(this.jMenuItemCancelarTipoNovedadNomi);		
		
		//this.jmenuDetalleDatosTipoNovedadNomi.add(this.jMenuItemDetalleAbrirOrderByTipoNovedadNomi);				
		this.jmenuDetalleDatosTipoNovedadNomi.add(this.jMenuItemDetalleMostarOcultarTipoNovedadNomi);				
				
		//this.jmenuDetalleAccionesTipoNovedadNomi.add(this.jMenuItemGuardarCambiosTipoNovedadNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoNovedadNomi.add(this.jmenuDetalleArchivoTipoNovedadNomi);		
		this.jmenuBarDetalleTipoNovedadNomi.add(this.jmenuDetalleAccionesTipoNovedadNomi);		
		this.jmenuBarDetalleTipoNovedadNomi.add(this.jmenuDetalleDatosTipoNovedadNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoNovedadNomi.add(this.jmenuDetalleTipoNovedadNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoNovedadNomi);				
	}
	
	
	public void inicializarElementosCamposTipoNovedadNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoNovedadNomi = new JLabelMe();
		jLabelIdTipoNovedadNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoNovedadNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoNovedadNomi.setToolTipText(TipoNovedadNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoNovedadNomi= new GridBagLayout();

		this.jPanelidTipoNovedadNomi.setLayout(this.gridaBagLayoutTipoNovedadNomi);

		jTextFieldidTipoNovedadNomi = new JTextFieldMe();
		jTextFieldidTipoNovedadNomi.setText("Id");

		jTextFieldidTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoNovedadNomi = new JLabelMe();
		this.jLabelcodigoTipoNovedadNomi.setText(""+TipoNovedadNomiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoNovedadNomi.setToolTipText("Codigo");
		this.jLabelcodigoTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoNovedadNomi.setToolTipText(TipoNovedadNomiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoNovedadNomi = new GridBagLayout();
		this.jPanelcodigoTipoNovedadNomi.setLayout(this.gridaBagLayoutTipoNovedadNomi);


		jTextFieldcodigoTipoNovedadNomi= new JTextFieldMe();

		jTextFieldcodigoTipoNovedadNomi.setEnabled(false);
		jTextFieldcodigoTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoNovedadNomiBusqueda= new JButtonMe();
		this.jButtoncodigoTipoNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoNovedadNomiBusqueda.setText("U");
		this.jButtoncodigoTipoNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoNovedadNomiBusqueda"));

		if(this.tiponovedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoNovedadNomiBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoNovedadNomi = new JLabelMe();
		this.jLabelnombreTipoNovedadNomi.setText(""+TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoNovedadNomi.setToolTipText("Nombre");
		this.jLabelnombreTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoNovedadNomi.setToolTipText(TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoNovedadNomi = new GridBagLayout();
		this.jPanelnombreTipoNovedadNomi.setLayout(this.gridaBagLayoutTipoNovedadNomi);


		jTextAreanombreTipoNovedadNomi= new JTextAreaMe();
		jTextAreanombreTipoNovedadNomi.setEnabled(false);
		jTextAreanombreTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNovedadNomi.setLineWrap(true);
		jTextAreanombreTipoNovedadNomi.setWrapStyleWord(true);
		jTextAreanombreTipoNovedadNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoNovedadNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoNovedadNomi = new JScrollPane(jTextAreanombreTipoNovedadNomi);
		jscrollPanenombreTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoNovedadNomiBusqueda= new JButtonMe();
		this.jButtonnombreTipoNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoNovedadNomiBusqueda.setText("U");
		this.jButtonnombreTipoNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoNovedadNomiBusqueda"));

		if(this.tiponovedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoNovedadNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoNovedadNomi() {
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
		//this.jInternalFrameDetalleTipoNovedadNomi = new TipoNovedadNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Novedad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoNovedadNomi= new GridBagLayout();
		

		
		String sToolTipTipoNovedadNomi="";
		sToolTipTipoNovedadNomi=TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoNovedadNomi+="(Nomina.TipoNovedadNomi)";
		}
		
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoNovedadNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoNovedadNomi = new JButtonMe();
		this.jButtonModificarTipoNovedadNomi = new JButtonMe();
        this.jButtonActualizarTipoNovedadNomi = new JButtonMe();
        this.jButtonEliminarTipoNovedadNomi = new JButtonMe();
        this.jButtonCancelarTipoNovedadNomi = new JButtonMe();
        this.jButtonGuardarCambiosTipoNovedadNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoNovedadNomi = new JButtonMe();
		this.jButtonCerrarTipoNovedadNomi = new JButtonMe();
		
		this.jScrollPanelDatosTipoNovedadNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoNovedadNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoNovedadNomi = new JScrollPane();
				
		
		
		this.jPanelCamposTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Novedad";
		
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Novedads" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoNovedadNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoNovedadNomi.setName("jPanelCamposTipoNovedadNomi"); 

		this.jPanelCamposOcultosTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoNovedadNomi.setName("jPanelCamposOcultosTipoNovedadNomi"); 

        this.jPanelAccionesTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoNovedadNomi.setToolTipText("Acciones");
        this.jPanelAccionesTipoNovedadNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoNovedadNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoNovedadNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoNovedadNomi.setText("Nuevo");
		this.jButtonModificarTipoNovedadNomi.setText("Editar");
        this.jButtonActualizarTipoNovedadNomi.setText("Actualizar");
        this.jButtonEliminarTipoNovedadNomi.setText("Eliminar");
        this.jButtonCancelarTipoNovedadNomi.setText("Cancelar");
        this.jButtonGuardarCambiosTipoNovedadNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoNovedadNomi.setText("Guardar");
		this.jButtonCerrarTipoNovedadNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoNovedadNomi,"nuevo_button","Nuevo",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoNovedadNomi,"modificar_button","Editar",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoNovedadNomi,"actualizar_button","Actualizar",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoNovedadNomi,"eliminar_button","Eliminar",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoNovedadNomi,"cancelar_button","Cancelar",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoNovedadNomi,"guardarcambios_button","Guardar",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoNovedadNomi,"guardarcambiostabla_button","Guardar",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoNovedadNomi,"cerrar_button","Salir",this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoNovedadNomi.setToolTipText("Nuevo"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoNovedadNomi.setToolTipText("Editar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoNovedadNomi.setToolTipText("Actualizar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoNovedadNomi.setToolTipText("Eliminar)"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoNovedadNomi.setToolTipText("Cancelar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoNovedadNomi.setToolTipText("Guardar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoNovedadNomi.setToolTipText("Guardar"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoNovedadNomi.setToolTipText("Salir"+" "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoNovedadNomi";
		inputMap = this.jButtonNuevoTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoNovedadNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoNovedadNomi";
		inputMap = this.jButtonActualizarTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoNovedadNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoNovedadNomi";
		inputMap = this.jButtonEliminarTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoNovedadNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoNovedadNomi";
		inputMap = this.jButtonCancelarTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoNovedadNomi"));
		
		//CERRAR		
		sMapKey = "CerrarTipoNovedadNomi";
		inputMap = this.jButtonCerrarTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoNovedadNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoNovedadNomi";
		inputMap = this.jButtonGuardarCambiosTablaTipoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoNovedadNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoNovedadNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoNovedadNomi.setToolTipText("Nuevo TipoNovedadNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoNovedadNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoNovedadNomi.setToolTipText("Sin Cerrar Ventana TipoNovedadNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoNovedadNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoNovedadNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoNovedadNomi.setText("Accion");
		this.jComboBoxTiposAccionesTipoNovedadNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoNovedadNomi = new JLabelMe();
		
		this.jLabelAccionesTipoNovedadNomi.setText("Acciones");		
		this.jLabelAccionesTipoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoNovedadNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoNovedadNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoNovedadNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoNovedadNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoNovedadNomi = new GridBagLayout();
		
		this.jPanelCamposTipoNovedadNomi.setLayout(gridaBagLayoutCamposTipoNovedadNomi);
		this.jPanelCamposOcultosTipoNovedadNomi.setLayout(gridaBagLayoutCamposOcultosTipoNovedadNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
	this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
	this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoNovedadNomi.add(jLabelIdTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);



	this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
	this.gridBagConstraintsTipoNovedadNomi.gridx = 1;
	this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoNovedadNomi.add(jTextFieldidTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);


	this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
	this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
	this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoNovedadNomi.add(jLabelcodigoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
		this.gridBagConstraintsTipoNovedadNomi.gridx = 2;
		this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
		this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoNovedadNomi.add(jButtoncodigoTipoNovedadNomiBusqueda, this.gridBagConstraintsTipoNovedadNomi);
	}

	this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
	this.gridBagConstraintsTipoNovedadNomi.gridx = 1;
	this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoNovedadNomi.add(jTextFieldcodigoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);


	this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
	this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
	this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoNovedadNomi.add(jLabelnombreTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
		this.gridBagConstraintsTipoNovedadNomi.gridx = 2;
		this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
		this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoNovedadNomi.add(jButtonnombreTipoNovedadNomiBusqueda, this.gridBagConstraintsTipoNovedadNomi);
	}

	this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
	this.gridBagConstraintsTipoNovedadNomi.gridx = 1;
	this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoNovedadNomi.add(jscrollPanenombreTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNovedadNomi.gridy = iYPanelCamposTipoNovedadNomi;
	this.gridBagConstraintsTipoNovedadNomi.gridx = iXPanelCamposTipoNovedadNomi++;
	this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNovedadNomi.add(this.jPanelidTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);



	if(iXPanelCamposTipoNovedadNomi % 1==0) {
		iXPanelCamposTipoNovedadNomi=0;
		iYPanelCamposTipoNovedadNomi++;
	}
	this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNovedadNomi.gridy = iYPanelCamposTipoNovedadNomi;
	this.gridBagConstraintsTipoNovedadNomi.gridx = iXPanelCamposTipoNovedadNomi++;
	this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNovedadNomi.add(this.jPanelcodigoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);



	if(iXPanelCamposTipoNovedadNomi % 1==0) {
		iXPanelCamposTipoNovedadNomi=0;
		iYPanelCamposTipoNovedadNomi++;
	}
	this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNovedadNomi.gridy = iYPanelCamposTipoNovedadNomi;
	this.gridBagConstraintsTipoNovedadNomi.gridx = iXPanelCamposTipoNovedadNomi++;
	this.gridBagConstraintsTipoNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNovedadNomi.add(this.jPanelnombreTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);



	if(iXPanelCamposTipoNovedadNomi % 1==0) {
		iXPanelCamposTipoNovedadNomi=0;
		iYPanelCamposTipoNovedadNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoNovedadNomi= new GridBagLayout();
		this.jPanelAccionesTipoNovedadNomi.setLayout(gridaBagLayoutAccionesTipoNovedadNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoNovedadNomi= new GridBagLayout();
		this.jPanelAccionesFormularioTipoNovedadNomi.setLayout(gridaBagLayoutAccionesFormularioTipoNovedadNomi);
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoNovedadNomi.add(this.jComboBoxTiposAccionesFormularioTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);

		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoNovedadNomi.add(this.jCheckBoxPostAccionNuevoTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoNovedadNomi.add(this.jCheckBoxPostAccionSinCerrarTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoNovedadNomi.add(this.jCheckBoxPostAccionSinMensajeTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoNovedadNomi.add(this.jButtonModificarTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);							

		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNovedadNomi.gridy = 0;
		this.gridBagConstraintsTipoNovedadNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoNovedadNomi.add(this.jButtonEliminarTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
			
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = 0;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoNovedadNomi.add(this.jButtonActualizarTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);


		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = 0;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoNovedadNomi.add(this.jButtonGuardarCambiosTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);	
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = 0;		
		this.gridBagConstraintsTipoNovedadNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoNovedadNomi.add(this.jButtonCancelarTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoNovedadNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoNovedadNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();						
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoNovedadNomi.gridx = 0;		
			//this.gridBagConstraintsTipoNovedadNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoNovedadNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoNovedadNomi.gridx =0;
		this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoNovedadNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoNovedadNomi = new TipoNovedadNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Novedad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Novedad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Novedad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoNovedadNomiModel tiponovedadnomiModel=new TipoNovedadNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoNovedadNomiModel.TipoNovedadNomiFocusTraversalPolicy tiponovedadnomiFocusTraversalPolicy = tiponovedadnomiModel.new TipoNovedadNomiFocusTraversalPolicy(this);
			
			//tiponovedadnomiFocusTraversalPolicy.settiponovedadnomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiponovedadnomiModel);
			
			
			this.jContentPaneDetalleTipoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoNovedadNomi = new GridBagLayout();	
			this.jContentPaneDetalleTipoNovedadNomi.setLayout(gridaBagLayoutDetalleTipoNovedadNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoNovedadNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
					
				
				this.jContentPaneDetalleTipoNovedadNomi.add(jTtoolBarDetalleTipoNovedadNomi, gridBagConstraintsTipoNovedadNomi);								
				
}
			
			this.jScrollPanelDatosEdicionTipoNovedadNomi=   new JScrollPane(jContentPaneDetalleTipoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoNovedadNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
	        
			this.jContentPaneDetalleTipoNovedadNomi.add(jPanelCamposTipoNovedadNomi, gridBagConstraintsTipoNovedadNomi);
			
			
			
			
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
						&& tiponovedadnomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameNovedadNomi(this.puedeCargarPorParteNovedadNomi,false,-1);
					
					if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoNovedadNomi= new GridBagConstraints();
						this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
						this.jContentPaneDetalleTipoNovedadNomi.add(this.jTabbedPaneRelacionesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoNovedadNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameNovedadNomi(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoNovedadNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
					this.gridBagConstraintsTipoNovedadNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
					
				
					this.jContentPaneDetalleTipoNovedadNomi.add(jPanelCamposOcultosTipoNovedadNomi, gridBagConstraintsTipoNovedadNomi);
				
					this.jPanelCamposOcultosTipoNovedadNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
	        this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoNovedadNomi.add(this.jPanelAccionesFormularioTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);							
			
			
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
	        this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoNovedadNomi.add(this.jPanelAccionesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoNovedadNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoNovedadNomi=   new JScrollPane(this.jPanelCamposTipoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
			this.gridBagConstraintsTipoNovedadNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoNovedadNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoNovedadNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);			
			
			this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoNovedadNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
			
			
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		
			
		this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoNovedadNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoNovedadNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoNovedadNomi, this.gridBagConstraintsTipoNovedadNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoNovedadNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoNovedadNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameNovedadNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.novedadnomiSessionBean=new NovedadNomiSessionBean();
		this.novedadnomiSessionBean.setConGuardarRelaciones(false);
		this.novedadnomiSessionBean.setEsGuardarRelacionado(true);

		this.novedadnomiBeanSwingJInternalFrame=null;//new NovedadNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.novedadnomiBeanSwingJInternalFramePopup=new NovedadNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.novedadnomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {

				NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL=TipoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.novedadnomiSessionBean.setEsGuardarRelacionado(true);

				this.novedadnomiBeanSwingJInternalFrame=new NovedadNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.novedadnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.novedadnomiBeanSwingJInternalFrame.setnovedadnomiSessionBean(this.novedadnomiSessionBean);

				//this.gridBagConstraintsTipoNovedadNomi = new GridBagConstraints();
				//this.gridBagConstraintsTipoNovedadNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoNovedadNomi.gridx = 0;
				//this.jContentPaneDetalleTipoNovedadNomi.add(this.novedadnomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoNovedadNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoNovedadNomi.add("Novedad Nomis",this.novedadnomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoNovedadNomi.setComponentAt(iIndexTab,this.novedadnomiBeanSwingJInternalFrame.getContentPane());
				}

				//NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.novedadnomiSessionBean.setEsGuardarRelacionado(false);
				this.novedadnomiBeanSwingJInternalFrame=null;//new NovedadNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNovedadNomi) {
					this.jTabbedPaneRelacionesTipoNovedadNomi.add("Novedad Nomis",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarNovedadNomiBeanSwingJInternalFrame(List<TipoNovedadNomi> tiponovedadnomis,TipoNovedadNomi tiponovedadnomi,NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//novedadnomiBeanSwingJInternalFrame=new NovedadNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					novedadnomiBeanSwingJInternalFrame.getNovedadNomiLogic().setConnexion(this.tiponovedadnomiLogic.getConnexion());

					novedadnomiBeanSwingJInternalFrame.settiponovedadnomisForeignKey(tiponovedadnomis);
					novedadnomiBeanSwingJInternalFrame.settiponovedadnomiForeignKey(tiponovedadnomi);
					novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setisBusquedaDesdeForeignKeySesionTipoNovedadNomi(true);
					novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setlidTipoNovedadNomiActual(tiponovedadnomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					novedadnomiBeanSwingJInternalFrame.cargarCombosForeignKeyNovedadNomi(novedadnomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					novedadnomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoNovedadNomi(true);
					novedadnomiBeanSwingJInternalFrame.setid_tipo_novedad_nomiFK_IdTipoNovedadNomi(tiponovedadnomi.getId());

					if(!this.conCargarFormDetalle) {
						novedadnomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					novedadnomiBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoNovedadNomiForeignKey(tiponovedadnomi,1,false,true,true);
					novedadnomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					novedadnomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoNovedadNomi");
					novedadnomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoNovedadNomi");
					novedadnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadNomi(true);
					novedadnomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNovedadNomi("n",novedadnomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, novedadnomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					novedadnomiBeanSwingJInternalFrame.setAutoscrolls(true);
					novedadnomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						novedadnomiBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadNomi("relacionado");
					} else {
						novedadnomiBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadNomi("no_relacionado");
					}

					novedadnomiBeanSwingJInternalFrame.getjButtonRecargarInformacionNovedadNomi().setVisible(false);

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
