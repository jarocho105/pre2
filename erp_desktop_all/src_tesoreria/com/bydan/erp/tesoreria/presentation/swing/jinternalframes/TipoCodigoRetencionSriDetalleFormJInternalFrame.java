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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoCodigoRetencionSriConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoCodigoRetencionSriDetalleFormJInternalFrame extends TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCodigoRetencionSri;
	
	protected JMenuBar jmenuBarDetalleTipoCodigoRetencionSri;
	
	protected JMenu jmenuDetalleTipoCodigoRetencionSri;
	protected JMenu jmenuDetalleArchivoTipoCodigoRetencionSri;
	protected JMenu jmenuDetalleAccionesTipoCodigoRetencionSri;
	protected JMenu jmenuDetalleDatosTipoCodigoRetencionSri;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCodigoRetencionSri;	
	protected GridBagConstraints gridBagConstraintsTipoCodigoRetencionSri;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCodigoRetencionSri;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoCodigoRetencionSriSessionBean tipocodigoretencionsriSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoCodigoRetencionSriLogic tipocodigoretencionsriLogic;
	
	public JScrollPane jScrollPanelDatosTipoCodigoRetencionSri;
	public JScrollPane jScrollPanelDatosEdicionTipoCodigoRetencionSri;
	public JScrollPane jScrollPanelDatosGeneralTipoCodigoRetencionSri;
	
	protected JPanel jPanelCamposTipoCodigoRetencionSri;    
	protected JPanel jPanelCamposOcultosTipoCodigoRetencionSri;    	
	protected JPanel jPanelAccionesTipoCodigoRetencionSri;
	protected JPanel jPanelAccionesFormularioTipoCodigoRetencionSri;
    
	
	
	protected Integer iXPanelCamposTipoCodigoRetencionSri=0;
	protected Integer iYPanelCamposTipoCodigoRetencionSri=0;
	
	protected Integer iXPanelCamposOcultosTipoCodigoRetencionSri=0;
	protected Integer iYPanelCamposOcultosTipoCodigoRetencionSri=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCodigoRetencionSri;
	public JButton jButtonModificarTipoCodigoRetencionSri;
	public JButton jButtonActualizarTipoCodigoRetencionSri;
    public JButton jButtonEliminarTipoCodigoRetencionSri;
	public JButton jButtonCancelarTipoCodigoRetencionSri;
    public JButton jButtonGuardarCambiosTipoCodigoRetencionSri;
	public JButton jButtonGuardarCambiosTablaTipoCodigoRetencionSri;
	protected JButton jButtonCerrarTipoCodigoRetencionSri;
	
	
	protected JButton jButtonProcesarInformacionTipoCodigoRetencionSri;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCodigoRetencionSri;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCodigoRetencionSri;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCodigoRetencionSri;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCodigoRetencionSri;
	protected JButton jButtonModificarToolBarTipoCodigoRetencionSri;
	protected JButton jButtonActualizarToolBarTipoCodigoRetencionSri;
    protected JButton jButtonEliminarToolBarTipoCodigoRetencionSri;
	protected JButton jButtonCancelarToolBarTipoCodigoRetencionSri;
    protected JButton jButtonGuardarCambiosToolBarTipoCodigoRetencionSri;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCodigoRetencionSri;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCodigoRetencionSri;
	protected JButton jButtonCerrarToolBarTipoCodigoRetencionSri;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCodigoRetencionSri;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemModificarTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemActualizarTipoCodigoRetencionSri;
    protected JMenuItem jMenuItemEliminarTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemCancelarTipoCodigoRetencionSri;
    protected JMenuItem jMenuItemGuardarCambiosTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemCerrarTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemDetalleCerrarTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemMostrarOcultarTipoCodigoRetencionSri;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCodigoRetencionSri;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCodigoRetencionSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCodigoRetencionSri;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCodigoRetencionSri;
	public JLabel jLabelIdTipoCodigoRetencionSri;
	public JLabel jLabelidTipoCodigoRetencionSri;
	public JButton jButtonidTipoCodigoRetencionSriBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCodigoRetencionSri;
	public JLabel jLabelcodigoTipoCodigoRetencionSri;
	public JTextField jTextFieldcodigoTipoCodigoRetencionSri;
	public JButton jButtoncodigoTipoCodigoRetencionSriBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCodigoRetencionSri;
	public JLabel jLabelnombreTipoCodigoRetencionSri;
	public JTextArea jTextAreanombreTipoCodigoRetencionSri;
	public JScrollPane jscrollPanenombreTipoCodigoRetencionSri;
	public JButton jButtonnombreTipoCodigoRetencionSriBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoCodigoRetencionSri;
	public JLabel jLabelid_paisTipoCodigoRetencionSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoCodigoRetencionSri;
	public JButton jButtonid_paisTipoCodigoRetencionSri= new JButtonMe();
	public JButton jButtonid_paisTipoCodigoRetencionSriUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoCodigoRetencionSriBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCodigoRetencionSri;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoCodigoRetencionSriDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCodigoRetencionSri=new JPanel();
				this.jPanelAccionesFormularioTipoCodigoRetencionSri=new JPanel();
				this.jmenuBarDetalleTipoCodigoRetencionSri=new JMenuBar();
				this.jTtoolBarDetalleTipoCodigoRetencionSri=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoRetencionSriDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCodigoRetencionSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCodigoRetencionSriDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCodigoRetencionSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoRetencionSriDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCodigoRetencionSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoRetencionSriDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCodigoRetencionSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoRetencionSriDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCodigoRetencionSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCodigoRetencionSri() {
		return this.jButtonActualizarToolBarTipoCodigoRetencionSri;
	}
	
	public JButton getjButtonEliminarToolBarTipoCodigoRetencionSri() {
		return this.jButtonEliminarToolBarTipoCodigoRetencionSri;
	}
	
	public JButton getjButtonCancelarToolBarTipoCodigoRetencionSri() {
		return this.jButtonCancelarToolBarTipoCodigoRetencionSri;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCodigoRetencionSri() {
		return this.jButtonProcesarInformacionTipoCodigoRetencionSri;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCodigoRetencionSri)	{
		this.jButtonProcesarInformacionTipoCodigoRetencionSri = jButtonProcesarInformacionTipoCodigoRetencionSri;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCodigoRetencionSri() {
		return this.jComboBoxTiposAccionesTipoCodigoRetencionSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCodigoRetencionSri(
			JComboBox jComboBoxTiposRelacionesTipoCodigoRetencionSri) {
		this.jComboBoxTiposRelacionesTipoCodigoRetencionSri = jComboBoxTiposRelacionesTipoCodigoRetencionSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCodigoRetencionSri(
			JComboBox jComboBoxTiposAccionesTipoCodigoRetencionSri) {
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri = jComboBoxTiposAccionesTipoCodigoRetencionSri;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCodigoRetencionSri() {
		return this.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCodigoRetencionSri(
			JComboBox jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri) {
		this.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri = jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean();
		
		this.tipocodigoretencionsriSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocodigoretencionsriSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCodigoRetencionSriJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCodigoRetencionSriJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCodigoRetencionSriJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Codigo Retencion Sri MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCodigoRetencionSriJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCodigoRetencionSri= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCodigoRetencionSri=new JButtonMe();
				this.jButtonModificarToolBarTipoCodigoRetencionSri=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCodigoRetencionSri,this.jTtoolBarDetalleTipoCodigoRetencionSri,
							"actualizar","actualizar","Actualizar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCodigoRetencionSri,this.jTtoolBarDetalleTipoCodigoRetencionSri,
							"eliminar","eliminar","Eliminar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCodigoRetencionSri,this.jTtoolBarDetalleTipoCodigoRetencionSri,
							"cancelar","cancelar","Cancelar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCodigoRetencionSri,this.jTtoolBarDetalleTipoCodigoRetencionSri,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCodigoRetencionSri=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCodigoRetencionSri=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCodigoRetencionSri=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCodigoRetencionSri=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCodigoRetencionSri=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCodigoRetencionSri= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCodigoRetencionSri.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCodigoRetencionSri,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCodigoRetencionSri= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCodigoRetencionSri.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCodigoRetencionSri,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCodigoRetencionSri= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCodigoRetencionSri.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCodigoRetencionSri,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCodigoRetencionSri= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCodigoRetencionSri.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCodigoRetencionSri,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCodigoRetencionSri= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCodigoRetencionSri.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCodigoRetencionSri,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCodigoRetencionSri= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCodigoRetencionSri.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCodigoRetencionSri,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCodigoRetencionSri= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCodigoRetencionSri.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCodigoRetencionSri,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCodigoRetencionSri= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCodigoRetencionSri.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCodigoRetencionSri,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCodigoRetencionSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCodigoRetencionSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCodigoRetencionSri,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCodigoRetencionSri.add(this.jMenuItemDetalleCerrarTipoCodigoRetencionSri);
		
		this.jmenuDetalleAccionesTipoCodigoRetencionSri.add(this.jMenuItemActualizarTipoCodigoRetencionSri);
		this.jmenuDetalleAccionesTipoCodigoRetencionSri.add(this.jMenuItemEliminarTipoCodigoRetencionSri);
		this.jmenuDetalleAccionesTipoCodigoRetencionSri.add(this.jMenuItemCancelarTipoCodigoRetencionSri);		
		
		//this.jmenuDetalleDatosTipoCodigoRetencionSri.add(this.jMenuItemDetalleAbrirOrderByTipoCodigoRetencionSri);				
		this.jmenuDetalleDatosTipoCodigoRetencionSri.add(this.jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri);				
				
		//this.jmenuDetalleAccionesTipoCodigoRetencionSri.add(this.jMenuItemGuardarCambiosTipoCodigoRetencionSri);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCodigoRetencionSri.add(this.jmenuDetalleArchivoTipoCodigoRetencionSri);		
		this.jmenuBarDetalleTipoCodigoRetencionSri.add(this.jmenuDetalleAccionesTipoCodigoRetencionSri);		
		this.jmenuBarDetalleTipoCodigoRetencionSri.add(this.jmenuDetalleDatosTipoCodigoRetencionSri);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCodigoRetencionSri);				
	}
	
	
	public void inicializarElementosCamposTipoCodigoRetencionSri() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCodigoRetencionSri = new JLabelMe();
		jLabelIdTipoCodigoRetencionSri.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCodigoRetencionSri = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCodigoRetencionSri.setToolTipText(TipoCodigoRetencionSriConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCodigoRetencionSri= new GridBagLayout();

		this.jPanelidTipoCodigoRetencionSri.setLayout(this.gridaBagLayoutTipoCodigoRetencionSri);

		jLabelidTipoCodigoRetencionSri = new JLabel();
		jLabelidTipoCodigoRetencionSri.setText("Id");

		jLabelidTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCodigoRetencionSri = new JLabelMe();
		this.jLabelcodigoTipoCodigoRetencionSri.setText(""+TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCodigoRetencionSri.setToolTipText("Codigo");
		this.jLabelcodigoTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCodigoRetencionSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCodigoRetencionSri.setToolTipText(TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCodigoRetencionSri = new GridBagLayout();
		this.jPanelcodigoTipoCodigoRetencionSri.setLayout(this.gridaBagLayoutTipoCodigoRetencionSri);


		jTextFieldcodigoTipoCodigoRetencionSri= new JTextFieldMe();

		jTextFieldcodigoTipoCodigoRetencionSri.setEnabled(false);
		jTextFieldcodigoTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCodigoRetencionSriBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCodigoRetencionSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCodigoRetencionSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCodigoRetencionSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCodigoRetencionSriBusqueda.setText("U");
		this.jButtoncodigoTipoCodigoRetencionSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCodigoRetencionSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCodigoRetencionSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCodigoRetencionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCodigoRetencionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCodigoRetencionSriBusqueda"));

		if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCodigoRetencionSriBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCodigoRetencionSri = new JLabelMe();
		this.jLabelnombreTipoCodigoRetencionSri.setText(""+TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCodigoRetencionSri.setToolTipText("Nombre");
		this.jLabelnombreTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCodigoRetencionSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCodigoRetencionSri.setToolTipText(TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCodigoRetencionSri = new GridBagLayout();
		this.jPanelnombreTipoCodigoRetencionSri.setLayout(this.gridaBagLayoutTipoCodigoRetencionSri);


		jTextAreanombreTipoCodigoRetencionSri= new JTextAreaMe();
		jTextAreanombreTipoCodigoRetencionSri.setEnabled(false);
		jTextAreanombreTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCodigoRetencionSri.setLineWrap(true);
		jTextAreanombreTipoCodigoRetencionSri.setWrapStyleWord(true);
		jTextAreanombreTipoCodigoRetencionSri.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCodigoRetencionSri.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCodigoRetencionSri = new JScrollPane(jTextAreanombreTipoCodigoRetencionSri);
		jscrollPanenombreTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCodigoRetencionSriBusqueda= new JButtonMe();
		this.jButtonnombreTipoCodigoRetencionSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCodigoRetencionSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCodigoRetencionSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCodigoRetencionSriBusqueda.setText("U");
		this.jButtonnombreTipoCodigoRetencionSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCodigoRetencionSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCodigoRetencionSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCodigoRetencionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCodigoRetencionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCodigoRetencionSriBusqueda"));

		if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCodigoRetencionSriBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCodigoRetencionSri() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoCodigoRetencionSri = new JLabelMe();
		this.jLabelid_paisTipoCodigoRetencionSri.setText(""+TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoCodigoRetencionSri.setToolTipText("Pais");
		this.jLabelid_paisTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoCodigoRetencionSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoCodigoRetencionSri.setToolTipText(TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoCodigoRetencionSri = new GridBagLayout();
		this.jPanelid_paisTipoCodigoRetencionSri.setLayout(this.gridaBagLayoutTipoCodigoRetencionSri);


		jComboBoxid_paisTipoCodigoRetencionSri= new JComboBoxMe();
		jComboBoxid_paisTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoCodigoRetencionSri= new JButtonMe();
		this.jButtonid_paisTipoCodigoRetencionSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoCodigoRetencionSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoCodigoRetencionSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoCodigoRetencionSri.setText("Buscar");
		this.jButtonid_paisTipoCodigoRetencionSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoCodigoRetencionSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoCodigoRetencionSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoCodigoRetencionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoCodigoRetencionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoCodigoRetencionSri"));

		this.jButtonid_paisTipoCodigoRetencionSriBusqueda= new JButtonMe();
		this.jButtonid_paisTipoCodigoRetencionSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoCodigoRetencionSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoCodigoRetencionSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoCodigoRetencionSriBusqueda.setText("U");
		this.jButtonid_paisTipoCodigoRetencionSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoCodigoRetencionSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoCodigoRetencionSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoCodigoRetencionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoCodigoRetencionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoCodigoRetencionSriBusqueda"));

		if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoCodigoRetencionSriBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoCodigoRetencionSriUpdate= new JButtonMe();
		this.jButtonid_paisTipoCodigoRetencionSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoCodigoRetencionSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoCodigoRetencionSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoCodigoRetencionSriUpdate.setText("U");
		this.jButtonid_paisTipoCodigoRetencionSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoCodigoRetencionSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoCodigoRetencionSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoCodigoRetencionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoCodigoRetencionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoCodigoRetencionSriUpdate"));



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
		//this.jInternalFrameDetalleTipoCodigoRetencionSri = new TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Codigo Retencion Sri DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCodigoRetencionSri= new GridBagLayout();
		

		
		String sToolTipTipoCodigoRetencionSri="";
		sToolTipTipoCodigoRetencionSri=TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCodigoRetencionSri+="(Tesoreria.TipoCodigoRetencionSri)";
		}
		
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCodigoRetencionSri+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonModificarTipoCodigoRetencionSri = new JButtonMe();
        this.jButtonActualizarTipoCodigoRetencionSri = new JButtonMe();
        this.jButtonEliminarTipoCodigoRetencionSri = new JButtonMe();
        this.jButtonCancelarTipoCodigoRetencionSri = new JButtonMe();
        this.jButtonGuardarCambiosTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonCerrarTipoCodigoRetencionSri = new JButtonMe();
		
		this.jScrollPanelDatosTipoCodigoRetencionSri = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCodigoRetencionSri = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCodigoRetencionSri = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Codigo Retencion Sri";
		
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Codigo Retencion Sris" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCodigoRetencionSri.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCodigoRetencionSri.setName("jPanelCamposTipoCodigoRetencionSri"); 

		this.jPanelCamposOcultosTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCodigoRetencionSri.setName("jPanelCamposOcultosTipoCodigoRetencionSri"); 

        this.jPanelAccionesTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCodigoRetencionSri.setToolTipText("Acciones");
        this.jPanelAccionesTipoCodigoRetencionSri.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCodigoRetencionSri.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCodigoRetencionSri.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCodigoRetencionSri.setText("Nuevo");
		this.jButtonModificarTipoCodigoRetencionSri.setText("Editar");
        this.jButtonActualizarTipoCodigoRetencionSri.setText("Actualizar");
        this.jButtonEliminarTipoCodigoRetencionSri.setText("Eliminar");
        this.jButtonCancelarTipoCodigoRetencionSri.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCodigoRetencionSri.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.setText("Guardar");
		this.jButtonCerrarTipoCodigoRetencionSri.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCodigoRetencionSri,"nuevo_button","Nuevo",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCodigoRetencionSri,"modificar_button","Editar",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCodigoRetencionSri,"actualizar_button","Actualizar",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCodigoRetencionSri,"eliminar_button","Eliminar",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCodigoRetencionSri,"cancelar_button","Cancelar",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCodigoRetencionSri,"guardarcambios_button","Guardar",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri,"guardarcambiostabla_button","Guardar",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCodigoRetencionSri,"cerrar_button","Salir",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCodigoRetencionSri.setToolTipText("Nuevo"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCodigoRetencionSri.setToolTipText("Editar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCodigoRetencionSri.setToolTipText("Actualizar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCodigoRetencionSri.setToolTipText("Eliminar)"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCodigoRetencionSri.setToolTipText("Cancelar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCodigoRetencionSri.setToolTipText("Guardar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.setToolTipText("Guardar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCodigoRetencionSri.setToolTipText("Salir"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCodigoRetencionSri";
		inputMap = this.jButtonNuevoTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCodigoRetencionSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCodigoRetencionSri"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCodigoRetencionSri";
		inputMap = this.jButtonActualizarTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCodigoRetencionSri"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCodigoRetencionSri";
		inputMap = this.jButtonEliminarTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCodigoRetencionSri"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCodigoRetencionSri";
		inputMap = this.jButtonCancelarTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCodigoRetencionSri"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCodigoRetencionSri";
		inputMap = this.jButtonCerrarTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCodigoRetencionSri"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCodigoRetencionSri";
		inputMap = this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCodigoRetencionSri"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCodigoRetencionSri = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCodigoRetencionSri.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCodigoRetencionSri.setToolTipText("Nuevo TipoCodigoRetencionSri");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCodigoRetencionSri = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCodigoRetencionSri.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCodigoRetencionSri.setToolTipText("Sin Cerrar Ventana TipoCodigoRetencionSri");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCodigoRetencionSri = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCodigoRetencionSri.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCodigoRetencionSri.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setText("Accion");
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCodigoRetencionSri = new JLabelMe();
		
		this.jLabelAccionesTipoCodigoRetencionSri.setText("Acciones");		
		this.jLabelAccionesTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCodigoRetencionSri();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCodigoRetencionSri();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCodigoRetencionSri=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCodigoRetencionSri = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCodigoRetencionSri = new GridBagLayout();
		
		this.jPanelCamposTipoCodigoRetencionSri.setLayout(gridaBagLayoutCamposTipoCodigoRetencionSri);
		this.jPanelCamposOcultosTipoCodigoRetencionSri.setLayout(gridaBagLayoutCamposOcultosTipoCodigoRetencionSri);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCodigoRetencionSri.add(jLabelIdTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);



	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 1;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCodigoRetencionSri.add(jLabelidTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);


	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoCodigoRetencionSri.add(jLabelid_paisTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		//this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 2;
		this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoCodigoRetencionSri.add(jButtonid_paisTipoCodigoRetencionSriBusqueda, this.gridBagConstraintsTipoCodigoRetencionSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		//this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 3;
		this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoCodigoRetencionSri.add(jButtonid_paisTipoCodigoRetencionSriUpdate, this.gridBagConstraintsTipoCodigoRetencionSri);
	}

	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 1;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoCodigoRetencionSri.add(jComboBoxid_paisTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);


	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCodigoRetencionSri.add(jLabelcodigoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		//this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 2;
		this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCodigoRetencionSri.add(jButtoncodigoTipoCodigoRetencionSriBusqueda, this.gridBagConstraintsTipoCodigoRetencionSri);
	}

	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 1;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCodigoRetencionSri.add(jTextFieldcodigoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);


	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCodigoRetencionSri.add(jLabelnombreTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		//this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 2;
		this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCodigoRetencionSri.add(jButtonnombreTipoCodigoRetencionSriBusqueda, this.gridBagConstraintsTipoCodigoRetencionSri);
	}

	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 1;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCodigoRetencionSri.add(jscrollPanenombreTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iYPanelCamposTipoCodigoRetencionSri;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iXPanelCamposTipoCodigoRetencionSri++;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCodigoRetencionSri.add(this.jPanelidTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);



	if(iXPanelCamposTipoCodigoRetencionSri % 1==0) {
		iXPanelCamposTipoCodigoRetencionSri=0;
		iYPanelCamposTipoCodigoRetencionSri++;
	}
	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iYPanelCamposTipoCodigoRetencionSri;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iXPanelCamposTipoCodigoRetencionSri++;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCodigoRetencionSri.add(this.jPanelid_paisTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);



	if(iXPanelCamposTipoCodigoRetencionSri % 1==0) {
		iXPanelCamposTipoCodigoRetencionSri=0;
		iYPanelCamposTipoCodigoRetencionSri++;
	}
	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iYPanelCamposTipoCodigoRetencionSri;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iXPanelCamposTipoCodigoRetencionSri++;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCodigoRetencionSri.add(this.jPanelcodigoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);



	if(iXPanelCamposTipoCodigoRetencionSri % 1==0) {
		iXPanelCamposTipoCodigoRetencionSri=0;
		iYPanelCamposTipoCodigoRetencionSri++;
	}
	this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iYPanelCamposTipoCodigoRetencionSri;
	this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iXPanelCamposTipoCodigoRetencionSri++;
	this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCodigoRetencionSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCodigoRetencionSri.add(this.jPanelnombreTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);



	if(iXPanelCamposTipoCodigoRetencionSri % 1==0) {
		iXPanelCamposTipoCodigoRetencionSri=0;
		iYPanelCamposTipoCodigoRetencionSri++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCodigoRetencionSri= new GridBagLayout();
		this.jPanelAccionesTipoCodigoRetencionSri.setLayout(gridaBagLayoutAccionesTipoCodigoRetencionSri);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCodigoRetencionSri= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCodigoRetencionSri.setLayout(gridaBagLayoutAccionesFormularioTipoCodigoRetencionSri);
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCodigoRetencionSri.add(this.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);

		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCodigoRetencionSri.add(this.jCheckBoxPostAccionNuevoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCodigoRetencionSri.add(this.jCheckBoxPostAccionSinCerrarTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCodigoRetencionSri.add(this.jCheckBoxPostAccionSinMensajeTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCodigoRetencionSri.add(this.jButtonModificarTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);							

		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCodigoRetencionSri.add(this.jButtonEliminarTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
			
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCodigoRetencionSri.add(this.jButtonActualizarTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);


		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCodigoRetencionSri.add(this.jButtonGuardarCambiosTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);	
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCodigoRetencionSri.add(this.jButtonCancelarTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCodigoRetencionSri = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCodigoRetencionSri);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();						
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;		
			//this.gridBagConstraintsTipoCodigoRetencionSri.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx =0;
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCodigoRetencionSri.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCodigoRetencionSriJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCodigoRetencionSri = new TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Codigo Retencion Sri DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Codigo Retencion Sri DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Codigo Retencion Sri Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCodigoRetencionSriModel tipocodigoretencionsriModel=new TipoCodigoRetencionSriModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCodigoRetencionSriModel.TipoCodigoRetencionSriFocusTraversalPolicy tipocodigoretencionsriFocusTraversalPolicy = tipocodigoretencionsriModel.new TipoCodigoRetencionSriFocusTraversalPolicy(this);
			
			//tipocodigoretencionsriFocusTraversalPolicy.settipocodigoretencionsriJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocodigoretencionsriModel);
			
			
			this.jContentPaneDetalleTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCodigoRetencionSri = new GridBagLayout();	
			this.jContentPaneDetalleTipoCodigoRetencionSri.setLayout(gridaBagLayoutDetalleTipoCodigoRetencionSri);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCodigoRetencionSri = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
				this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCodigoRetencionSri.add(jTtoolBarDetalleTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCodigoRetencionSri=   new JScrollPane(jContentPaneDetalleTipoCodigoRetencionSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCodigoRetencionSri=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
	        
			this.jContentPaneDetalleTipoCodigoRetencionSri.add(jPanelCamposTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);
			
			
			
			
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
						&& tipocodigoretencionsriSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCodigoRetencionSri= new GridBagConstraints();
						this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
						this.jContentPaneDetalleTipoCodigoRetencionSri.add(this.jTabbedPaneRelacionesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCodigoRetencionSri.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCodigoRetencionSri.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
					this.gridBagConstraintsTipoCodigoRetencionSri.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCodigoRetencionSri.add(jPanelCamposOcultosTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);
				
					this.jPanelCamposOcultosTipoCodigoRetencionSri.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
	        this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCodigoRetencionSri.add(this.jPanelAccionesFormularioTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);							
			
			
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
	        this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCodigoRetencionSri.add(this.jPanelAccionesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCodigoRetencionSri);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCodigoRetencionSri=   new JScrollPane(this.jPanelCamposTipoCodigoRetencionSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCodigoRetencionSri.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);			
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			
			
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
			
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCodigoRetencionSri;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCodigoRetencionSri;
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
