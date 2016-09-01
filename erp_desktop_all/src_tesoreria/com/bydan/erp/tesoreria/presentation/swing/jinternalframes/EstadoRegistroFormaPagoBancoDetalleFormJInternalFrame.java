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



import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.tesoreria.util.EstadoRegistroFormaPagoBancoConstantesFunciones;

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
public class EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame extends EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoRegistroFormaPagoBanco;
	
	protected JMenuBar jmenuBarDetalleEstadoRegistroFormaPagoBanco;
	
	protected JMenu jmenuDetalleEstadoRegistroFormaPagoBanco;
	protected JMenu jmenuDetalleArchivoEstadoRegistroFormaPagoBanco;
	protected JMenu jmenuDetalleAccionesEstadoRegistroFormaPagoBanco;
	protected JMenu jmenuDetalleDatosEstadoRegistroFormaPagoBanco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoRegistroFormaPagoBanco;	
	protected GridBagConstraints gridBagConstraintsEstadoRegistroFormaPagoBanco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoRegistroFormaPagoBanco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoRegistroFormaPagoBancoSessionBean estadoregistroformapagobancoSessionBean;
	
	

	public RegistroFormaPagoBancoBeanSwingJInternalFrame registroformapagobancoBeanSwingJInternalFrame=null;
	public RegistroFormaPagoBancoBeanSwingJInternalFrame registroformapagobancoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRegistroFormaPagoBanco=false;
	public RegistroFormaPagoBancoSessionBean registroformapagobancoSessionBean;
	
		
	
	public EstadoRegistroFormaPagoBancoLogic estadoregistroformapagobancoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoRegistroFormaPagoBanco;
	public JScrollPane jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco;
	public JScrollPane jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco;
	
	protected JPanel jPanelCamposEstadoRegistroFormaPagoBanco;    
	protected JPanel jPanelCamposOcultosEstadoRegistroFormaPagoBanco;    	
	protected JPanel jPanelAccionesEstadoRegistroFormaPagoBanco;
	protected JPanel jPanelAccionesFormularioEstadoRegistroFormaPagoBanco;
    
	
	
	protected Integer iXPanelCamposEstadoRegistroFormaPagoBanco=0;
	protected Integer iYPanelCamposEstadoRegistroFormaPagoBanco=0;
	
	protected Integer iXPanelCamposOcultosEstadoRegistroFormaPagoBanco=0;
	protected Integer iYPanelCamposOcultosEstadoRegistroFormaPagoBanco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoRegistroFormaPagoBanco;
	public JButton jButtonModificarEstadoRegistroFormaPagoBanco;
	public JButton jButtonActualizarEstadoRegistroFormaPagoBanco;
    public JButton jButtonEliminarEstadoRegistroFormaPagoBanco;
	public JButton jButtonCancelarEstadoRegistroFormaPagoBanco;
    public JButton jButtonGuardarCambiosEstadoRegistroFormaPagoBanco;
	public JButton jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco;
	protected JButton jButtonCerrarEstadoRegistroFormaPagoBanco;
	
	
	protected JButton jButtonProcesarInformacionEstadoRegistroFormaPagoBanco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoRegistroFormaPagoBanco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoRegistroFormaPagoBanco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoRegistroFormaPagoBanco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonModificarToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonActualizarToolBarEstadoRegistroFormaPagoBanco;
    protected JButton jButtonEliminarToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonCancelarToolBarEstadoRegistroFormaPagoBanco;
    protected JButton jButtonGuardarCambiosToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonCerrarToolBarEstadoRegistroFormaPagoBanco;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoRegistroFormaPagoBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemModificarEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemActualizarEstadoRegistroFormaPagoBanco;
    protected JMenuItem jMenuItemEliminarEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemCancelarEstadoRegistroFormaPagoBanco;
    protected JMenuItem jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemCerrarEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDetalleCerrarEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoRegistroFormaPagoBanco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoRegistroFormaPagoBanco;
	public JLabel jLabelIdEstadoRegistroFormaPagoBanco;
	public JTextFieldMe jTextFieldidEstadoRegistroFormaPagoBanco;
	public JButton jButtonidEstadoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoRegistroFormaPagoBanco;
	public JLabel jLabelcodigoEstadoRegistroFormaPagoBanco;
	public JTextField jTextFieldcodigoEstadoRegistroFormaPagoBanco;
	public JButton jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoRegistroFormaPagoBanco;
	public JLabel jLabelnombreEstadoRegistroFormaPagoBanco;
	public JTextArea jTextAreanombreEstadoRegistroFormaPagoBanco;
	public JScrollPane jscrollPanenombreEstadoRegistroFormaPagoBanco;
	public JButton jButtonnombreEstadoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco;
	
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
	
	public EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoRegistroFormaPagoBanco=new JPanel();
				this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco=new JPanel();
				this.jmenuBarDetalleEstadoRegistroFormaPagoBanco=new JMenuBar();
				this.jTtoolBarDetalleEstadoRegistroFormaPagoBanco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoRegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoRegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoRegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoRegistroFormaPagoBanco() {
		return this.jButtonActualizarToolBarEstadoRegistroFormaPagoBanco;
	}
	
	public JButton getjButtonEliminarToolBarEstadoRegistroFormaPagoBanco() {
		return this.jButtonEliminarToolBarEstadoRegistroFormaPagoBanco;
	}
	
	public JButton getjButtonCancelarToolBarEstadoRegistroFormaPagoBanco() {
		return this.jButtonCancelarToolBarEstadoRegistroFormaPagoBanco;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoRegistroFormaPagoBanco() {
		return this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoRegistroFormaPagoBanco)	{
		this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco = jButtonProcesarInformacionEstadoRegistroFormaPagoBanco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoRegistroFormaPagoBanco() {
		return this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco) {
		this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco = jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco) {
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco = jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco() {
		return this.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco) {
		this.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco = jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoregistroformapagobancoSessionBean=new EstadoRegistroFormaPagoBancoSessionBean();
		
		this.estadoregistroformapagobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoregistroformapagobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.registroformapagobancoSessionBean=new RegistroFormaPagoBancoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoRegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoRegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoRegistroFormaPagoBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Registro Forma Pago Banco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoRegistroFormaPagoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoRegistroFormaPagoBanco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoRegistroFormaPagoBanco=new JButtonMe();
				this.jButtonModificarToolBarEstadoRegistroFormaPagoBanco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarDetalleEstadoRegistroFormaPagoBanco,
							"actualizar","actualizar","Actualizar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarDetalleEstadoRegistroFormaPagoBanco,
							"eliminar","eliminar","Eliminar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarDetalleEstadoRegistroFormaPagoBanco,
							"cancelar","cancelar","Cancelar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarDetalleEstadoRegistroFormaPagoBanco,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoRegistroFormaPagoBanco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoRegistroFormaPagoBanco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoRegistroFormaPagoBanco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoRegistroFormaPagoBanco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoRegistroFormaPagoBanco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoRegistroFormaPagoBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoRegistroFormaPagoBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoRegistroFormaPagoBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoRegistroFormaPagoBanco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoRegistroFormaPagoBanco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoRegistroFormaPagoBanco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoRegistroFormaPagoBanco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoRegistroFormaPagoBanco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoRegistroFormaPagoBanco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoRegistroFormaPagoBanco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoRegistroFormaPagoBanco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoRegistroFormaPagoBanco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoRegistroFormaPagoBanco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoRegistroFormaPagoBanco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoRegistroFormaPagoBanco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoRegistroFormaPagoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoRegistroFormaPagoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoRegistroFormaPagoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoRegistroFormaPagoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoRegistroFormaPagoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoRegistroFormaPagoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoRegistroFormaPagoBanco.add(this.jMenuItemDetalleCerrarEstadoRegistroFormaPagoBanco);
		
		this.jmenuDetalleAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemActualizarEstadoRegistroFormaPagoBanco);
		this.jmenuDetalleAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemEliminarEstadoRegistroFormaPagoBanco);
		this.jmenuDetalleAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemCancelarEstadoRegistroFormaPagoBanco);		
		
		//this.jmenuDetalleDatosEstadoRegistroFormaPagoBanco.add(this.jMenuItemDetalleAbrirOrderByEstadoRegistroFormaPagoBanco);				
		this.jmenuDetalleDatosEstadoRegistroFormaPagoBanco.add(this.jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco);				
				
		//this.jmenuDetalleAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoRegistroFormaPagoBanco.add(this.jmenuDetalleArchivoEstadoRegistroFormaPagoBanco);		
		this.jmenuBarDetalleEstadoRegistroFormaPagoBanco.add(this.jmenuDetalleAccionesEstadoRegistroFormaPagoBanco);		
		this.jmenuBarDetalleEstadoRegistroFormaPagoBanco.add(this.jmenuDetalleDatosEstadoRegistroFormaPagoBanco);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoRegistroFormaPagoBanco.add(this.jmenuDetalleEstadoRegistroFormaPagoBanco);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoRegistroFormaPagoBanco);				
	}
	
	
	public void inicializarElementosCamposEstadoRegistroFormaPagoBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoRegistroFormaPagoBanco = new JLabelMe();
		jLabelIdEstadoRegistroFormaPagoBanco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoRegistroFormaPagoBanco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoRegistroFormaPagoBanco.setToolTipText(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoRegistroFormaPagoBanco= new GridBagLayout();

		this.jPanelidEstadoRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutEstadoRegistroFormaPagoBanco);

		jTextFieldidEstadoRegistroFormaPagoBanco = new JTextFieldMe();
		jTextFieldidEstadoRegistroFormaPagoBanco.setText("Id");

		jTextFieldidEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelcodigoEstadoRegistroFormaPagoBanco.setText(""+EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoRegistroFormaPagoBanco.setToolTipText("Codigo");
		this.jLabelcodigoEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoRegistroFormaPagoBanco.setToolTipText(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelcodigoEstadoRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutEstadoRegistroFormaPagoBanco);


		jTextFieldcodigoEstadoRegistroFormaPagoBanco= new JTextFieldMe();

		jTextFieldcodigoEstadoRegistroFormaPagoBanco.setEnabled(false);
		jTextFieldcodigoEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoRegistroFormaPagoBancoBusqueda"));

		if(this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelnombreEstadoRegistroFormaPagoBanco.setText(""+EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoRegistroFormaPagoBanco.setToolTipText("Nombre");
		this.jLabelnombreEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoRegistroFormaPagoBanco.setToolTipText(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelnombreEstadoRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutEstadoRegistroFormaPagoBanco);


		jTextAreanombreEstadoRegistroFormaPagoBanco= new JTextAreaMe();
		jTextAreanombreEstadoRegistroFormaPagoBanco.setEnabled(false);
		jTextAreanombreEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoRegistroFormaPagoBanco.setLineWrap(true);
		jTextAreanombreEstadoRegistroFormaPagoBanco.setWrapStyleWord(true);
		jTextAreanombreEstadoRegistroFormaPagoBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoRegistroFormaPagoBanco.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoRegistroFormaPagoBanco = new JScrollPane(jTextAreanombreEstadoRegistroFormaPagoBanco);
		jscrollPanenombreEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoRegistroFormaPagoBancoBusqueda"));

		if(this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoRegistroFormaPagoBanco() {
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
		//this.jInternalFrameDetalleEstadoRegistroFormaPagoBanco = new EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Registro Forma Pago Banco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoRegistroFormaPagoBanco= new GridBagLayout();
		

		
		String sToolTipEstadoRegistroFormaPagoBanco="";
		sToolTipEstadoRegistroFormaPagoBanco=EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoRegistroFormaPagoBanco+="(Tesoreria.EstadoRegistroFormaPagoBanco)";
		}
		
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoRegistroFormaPagoBanco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonModificarEstadoRegistroFormaPagoBanco = new JButtonMe();
        this.jButtonActualizarEstadoRegistroFormaPagoBanco = new JButtonMe();
        this.jButtonEliminarEstadoRegistroFormaPagoBanco = new JButtonMe();
        this.jButtonCancelarEstadoRegistroFormaPagoBanco = new JButtonMe();
        this.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonCerrarEstadoRegistroFormaPagoBanco = new JButtonMe();
		
		this.jScrollPanelDatosEstadoRegistroFormaPagoBanco = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Registro Forma Pago Banco";
		
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Registro Forma Pago Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoRegistroFormaPagoBanco.setName("jPanelCamposEstadoRegistroFormaPagoBanco"); 

		this.jPanelCamposOcultosEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoRegistroFormaPagoBanco.setName("jPanelCamposOcultosEstadoRegistroFormaPagoBanco"); 

        this.jPanelAccionesEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoRegistroFormaPagoBanco.setToolTipText("Acciones");
        this.jPanelAccionesEstadoRegistroFormaPagoBanco.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoRegistroFormaPagoBanco.setText("Nuevo");
		this.jButtonModificarEstadoRegistroFormaPagoBanco.setText("Editar");
        this.jButtonActualizarEstadoRegistroFormaPagoBanco.setText("Actualizar");
        this.jButtonEliminarEstadoRegistroFormaPagoBanco.setText("Eliminar");
        this.jButtonCancelarEstadoRegistroFormaPagoBanco.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.setText("Guardar");
		this.jButtonCerrarEstadoRegistroFormaPagoBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoRegistroFormaPagoBanco,"nuevo_button","Nuevo",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoRegistroFormaPagoBanco,"modificar_button","Editar",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoRegistroFormaPagoBanco,"actualizar_button","Actualizar",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoRegistroFormaPagoBanco,"eliminar_button","Eliminar",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoRegistroFormaPagoBanco,"cancelar_button","Cancelar",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco,"guardarcambios_button","Guardar",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco,"guardarcambiostabla_button","Guardar",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoRegistroFormaPagoBanco,"cerrar_button","Salir",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoRegistroFormaPagoBanco.setToolTipText("Nuevo"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoRegistroFormaPagoBanco.setToolTipText("Editar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoRegistroFormaPagoBanco.setToolTipText("Actualizar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoRegistroFormaPagoBanco.setToolTipText("Eliminar)"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoRegistroFormaPagoBanco.setToolTipText("Cancelar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco.setToolTipText("Guardar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.setToolTipText("Guardar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoRegistroFormaPagoBanco.setToolTipText("Salir"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonNuevoEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoRegistroFormaPagoBanco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonActualizarEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoRegistroFormaPagoBanco"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonEliminarEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoRegistroFormaPagoBanco"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonCancelarEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoRegistroFormaPagoBanco"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonCerrarEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoRegistroFormaPagoBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoRegistroFormaPagoBanco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoRegistroFormaPagoBanco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoRegistroFormaPagoBanco.setToolTipText("Nuevo EstadoRegistroFormaPagoBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoRegistroFormaPagoBanco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoRegistroFormaPagoBanco.setToolTipText("Sin Cerrar Ventana EstadoRegistroFormaPagoBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoRegistroFormaPagoBanco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoRegistroFormaPagoBanco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setText("Accion");
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoRegistroFormaPagoBanco = new JLabelMe();
		
		this.jLabelAccionesEstadoRegistroFormaPagoBanco.setText("Acciones");		
		this.jLabelAccionesEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoRegistroFormaPagoBanco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoRegistroFormaPagoBanco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoRegistroFormaPagoBanco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoRegistroFormaPagoBanco = new GridBagLayout();
		
		this.jPanelCamposEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutCamposEstadoRegistroFormaPagoBanco);
		this.jPanelCamposOcultosEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutCamposOcultosEstadoRegistroFormaPagoBanco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoRegistroFormaPagoBanco.add(jLabelIdEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);



	this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoRegistroFormaPagoBanco.add(jTextFieldidEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);


	this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoRegistroFormaPagoBanco.add(jLabelcodigoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoRegistroFormaPagoBanco.add(jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoRegistroFormaPagoBanco.add(jTextFieldcodigoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);


	this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoRegistroFormaPagoBanco.add(jLabelnombreEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoRegistroFormaPagoBanco.add(jButtonnombreEstadoRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoRegistroFormaPagoBanco.add(jscrollPanenombreEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iYPanelCamposEstadoRegistroFormaPagoBanco;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iXPanelCamposEstadoRegistroFormaPagoBanco++;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRegistroFormaPagoBanco.add(this.jPanelidEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);



	if(iXPanelCamposEstadoRegistroFormaPagoBanco % 1==0) {
		iXPanelCamposEstadoRegistroFormaPagoBanco=0;
		iYPanelCamposEstadoRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iYPanelCamposEstadoRegistroFormaPagoBanco;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iXPanelCamposEstadoRegistroFormaPagoBanco++;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRegistroFormaPagoBanco.add(this.jPanelcodigoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);



	if(iXPanelCamposEstadoRegistroFormaPagoBanco % 1==0) {
		iXPanelCamposEstadoRegistroFormaPagoBanco=0;
		iYPanelCamposEstadoRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iYPanelCamposEstadoRegistroFormaPagoBanco;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iXPanelCamposEstadoRegistroFormaPagoBanco++;
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRegistroFormaPagoBanco.add(this.jPanelnombreEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);



	if(iXPanelCamposEstadoRegistroFormaPagoBanco % 1==0) {
		iXPanelCamposEstadoRegistroFormaPagoBanco=0;
		iYPanelCamposEstadoRegistroFormaPagoBanco++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoRegistroFormaPagoBanco= new GridBagLayout();
		this.jPanelAccionesEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutAccionesEstadoRegistroFormaPagoBanco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoRegistroFormaPagoBanco= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutAccionesFormularioEstadoRegistroFormaPagoBanco);
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco.add(this.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);

		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco.add(this.jCheckBoxPostAccionNuevoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco.add(this.jCheckBoxPostAccionSinCerrarEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco.add(this.jCheckBoxPostAccionSinMensajeEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoRegistroFormaPagoBanco.add(this.jButtonModificarEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);							

		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoRegistroFormaPagoBanco.add(this.jButtonEliminarEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
			
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoRegistroFormaPagoBanco.add(this.jButtonActualizarEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);


		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoRegistroFormaPagoBanco.add(this.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);	
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoRegistroFormaPagoBanco.add(this.jButtonCancelarEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoRegistroFormaPagoBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoRegistroFormaPagoBanco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();						
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;		
			//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =0;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoRegistroFormaPagoBanco = new EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Registro Forma Pago Banco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Registro Forma Pago Banco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Registro Forma Pago Banco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoRegistroFormaPagoBancoModel estadoregistroformapagobancoModel=new EstadoRegistroFormaPagoBancoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoRegistroFormaPagoBancoModel.EstadoRegistroFormaPagoBancoFocusTraversalPolicy estadoregistroformapagobancoFocusTraversalPolicy = estadoregistroformapagobancoModel.new EstadoRegistroFormaPagoBancoFocusTraversalPolicy(this);
			
			//estadoregistroformapagobancoFocusTraversalPolicy.setestadoregistroformapagobancoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoregistroformapagobancoModel);
			
			
			this.jContentPaneDetalleEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoRegistroFormaPagoBanco = new GridBagLayout();	
			this.jContentPaneDetalleEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutDetalleEstadoRegistroFormaPagoBanco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoRegistroFormaPagoBanco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoRegistroFormaPagoBanco.add(jTtoolBarDetalleEstadoRegistroFormaPagoBanco, gridBagConstraintsEstadoRegistroFormaPagoBanco);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco=   new JScrollPane(jContentPaneDetalleEstadoRegistroFormaPagoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
	        
			this.jContentPaneDetalleEstadoRegistroFormaPagoBanco.add(jPanelCamposEstadoRegistroFormaPagoBanco, gridBagConstraintsEstadoRegistroFormaPagoBanco);
			
			
			
			
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
						&& estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameRegistroFormaPagoBanco(this.puedeCargarPorParteRegistroFormaPagoBanco,false,-1);
					
					if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoRegistroFormaPagoBanco= new GridBagConstraints();
						this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
						this.jContentPaneDetalleEstadoRegistroFormaPagoBanco.add(this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameRegistroFormaPagoBanco(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoRegistroFormaPagoBanco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
					this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoRegistroFormaPagoBanco.add(jPanelCamposOcultosEstadoRegistroFormaPagoBanco, gridBagConstraintsEstadoRegistroFormaPagoBanco);
				
					this.jPanelCamposOcultosEstadoRegistroFormaPagoBanco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
	        this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoRegistroFormaPagoBanco.add(this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);							
			
			
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
	        this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoRegistroFormaPagoBanco.add(this.jPanelAccionesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco=   new JScrollPane(this.jPanelCamposEstadoRegistroFormaPagoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);			
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			
			
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
			
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameRegistroFormaPagoBanco(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.registroformapagobancoSessionBean=new RegistroFormaPagoBancoSessionBean();
		this.registroformapagobancoSessionBean.setConGuardarRelaciones(false);
		this.registroformapagobancoSessionBean.setEsGuardarRelacionado(true);

		this.registroformapagobancoBeanSwingJInternalFrame=null;//new RegistroFormaPagoBancoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.registroformapagobancoBeanSwingJInternalFramePopup=new RegistroFormaPagoBancoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.registroformapagobancoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {

				RegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoRegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				RegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoRegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.registroformapagobancoSessionBean.setEsGuardarRelacionado(true);

				this.registroformapagobancoBeanSwingJInternalFrame=new RegistroFormaPagoBancoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.registroformapagobancoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.registroformapagobancoBeanSwingJInternalFrame.setregistroformapagobancoSessionBean(this.registroformapagobancoSessionBean);

				//this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
				//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
				//this.jContentPaneDetalleEstadoRegistroFormaPagoBanco.add(this.registroformapagobancoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoRegistroFormaPagoBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.add("Registro Forma Pago Bancos",this.registroformapagobancoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setComponentAt(iIndexTab,this.registroformapagobancoBeanSwingJInternalFrame.getContentPane());
				}

				//RegistroFormaPagoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.registroformapagobancoSessionBean.setEsGuardarRelacionado(false);
				this.registroformapagobancoBeanSwingJInternalFrame=null;//new RegistroFormaPagoBancoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRegistroFormaPagoBanco) {
					this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.add("Registro Forma Pago Bancos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarRegistroFormaPagoBancoBeanSwingJInternalFrame(List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancos,EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,RegistroFormaPagoBancoBeanSwingJInternalFrame registroformapagobancoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//registroformapagobancoBeanSwingJInternalFrame=new RegistroFormaPagoBancoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					registroformapagobancoBeanSwingJInternalFrame.getRegistroFormaPagoBancoLogic().setConnexion(this.estadoregistroformapagobancoLogic.getConnexion());

					registroformapagobancoBeanSwingJInternalFrame.setestadoregistroformapagobancosForeignKey(estadoregistroformapagobancos);
					registroformapagobancoBeanSwingJInternalFrame.setestadoregistroformapagobancoForeignKey(estadoregistroformapagobanco);
					registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoRegistroFormaPagoBanco(true);
					registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.setlidEstadoRegistroFormaPagoBancoActual(estadoregistroformapagobanco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					registroformapagobancoBeanSwingJInternalFrame.cargarCombosForeignKeyRegistroFormaPagoBanco(registroformapagobancoBeanSwingJInternalFrame.isCargarCombosDependencia);
					registroformapagobancoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoRegistroFormaPagoBanco(true);
					registroformapagobancoBeanSwingJInternalFrame.setid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBanco(estadoregistroformapagobanco.getId());

					if(!this.conCargarFormDetalle) {
						registroformapagobancoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					registroformapagobancoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoRegistroFormaPagoBancoForeignKey(estadoregistroformapagobanco,1,false,true,true);
					registroformapagobancoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					registroformapagobancoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoRegistroFormaPagoBanco");
					registroformapagobancoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoRegistroFormaPagoBanco");
					registroformapagobancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaRegistroFormaPagoBanco(true);
					registroformapagobancoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRegistroFormaPagoBanco("n",registroformapagobancoBeanSwingJInternalFrame.isGuardarCambiosEnLote, registroformapagobancoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					registroformapagobancoBeanSwingJInternalFrame.setAutoscrolls(true);
					registroformapagobancoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						registroformapagobancoBeanSwingJInternalFrame.actualizarEstadoPanelsRegistroFormaPagoBanco("relacionado");
					} else {
						registroformapagobancoBeanSwingJInternalFrame.actualizarEstadoPanelsRegistroFormaPagoBanco("no_relacionado");
					}

					registroformapagobancoBeanSwingJInternalFrame.getjButtonRecargarInformacionRegistroFormaPagoBanco().setVisible(false);

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
