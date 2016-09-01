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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.AseguradoraConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class AseguradoraDetalleFormJInternalFrame extends AseguradoraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAseguradora;
	
	protected JMenuBar jmenuBarDetalleAseguradora;
	
	protected JMenu jmenuDetalleAseguradora;
	protected JMenu jmenuDetalleArchivoAseguradora;
	protected JMenu jmenuDetalleAccionesAseguradora;
	protected JMenu jmenuDetalleDatosAseguradora;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAseguradora;	
	protected GridBagConstraints gridBagConstraintsAseguradora;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AseguradoraBeanSwingJInternalFrameAdditional jInternalFrameDetalleAseguradora;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public AseguradoraSessionBean aseguradoraSessionBean;
	
	

	public VehiculoBeanSwingJInternalFrame vehiculoBeanSwingJInternalFrame=null;
	public VehiculoBeanSwingJInternalFrame vehiculoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteVehiculo=false;
	public VehiculoSessionBean vehiculoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public AseguradoraLogic aseguradoraLogic;
	
	public JScrollPane jScrollPanelDatosAseguradora;
	public JScrollPane jScrollPanelDatosEdicionAseguradora;
	public JScrollPane jScrollPanelDatosGeneralAseguradora;
	
	protected JPanel jPanelCamposAseguradora;    
	protected JPanel jPanelCamposOcultosAseguradora;    	
	protected JPanel jPanelAccionesAseguradora;
	protected JPanel jPanelAccionesFormularioAseguradora;
    
	
	
	protected Integer iXPanelCamposAseguradora=0;
	protected Integer iYPanelCamposAseguradora=0;
	
	protected Integer iXPanelCamposOcultosAseguradora=0;
	protected Integer iYPanelCamposOcultosAseguradora=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAseguradora;
	public JButton jButtonModificarAseguradora;
	public JButton jButtonActualizarAseguradora;
    public JButton jButtonEliminarAseguradora;
	public JButton jButtonCancelarAseguradora;
    public JButton jButtonGuardarCambiosAseguradora;
	public JButton jButtonGuardarCambiosTablaAseguradora;
	protected JButton jButtonCerrarAseguradora;
	
	
	protected JButton jButtonProcesarInformacionAseguradora;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAseguradora;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAseguradora;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAseguradora;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAseguradora;
	protected JButton jButtonModificarToolBarAseguradora;
	protected JButton jButtonActualizarToolBarAseguradora;
    protected JButton jButtonEliminarToolBarAseguradora;
	protected JButton jButtonCancelarToolBarAseguradora;
    protected JButton jButtonGuardarCambiosToolBarAseguradora;
	protected JButton jButtonGuardarCambiosTablaToolBarAseguradora;
	protected JButton jButtonMostrarOcultarTablaToolBarAseguradora;
	protected JButton jButtonCerrarToolBarAseguradora;
	
	protected JButton jButtonProcesarInformacionToolBarAseguradora;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAseguradora;
	protected JMenuItem jMenuItemModificarAseguradora;
	protected JMenuItem jMenuItemActualizarAseguradora;
    protected JMenuItem jMenuItemEliminarAseguradora;
	protected JMenuItem jMenuItemCancelarAseguradora;
    protected JMenuItem jMenuItemGuardarCambiosAseguradora;
	protected JMenuItem jMenuItemGuardarCambiosTablaAseguradora;
	protected JMenuItem jMenuItemCerrarAseguradora;
	protected JMenuItem jMenuItemDetalleCerrarAseguradora;
	protected JMenuItem jMenuItemDetalleMostarOcultarAseguradora;
	
	protected JMenuItem jMenuItemProcesarInformacionAseguradora;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAseguradora;
	protected JMenuItem jMenuItemMostrarOcultarAseguradora;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAseguradora;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAseguradora;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAseguradora;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAseguradora;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAseguradora;
	public JLabel jLabelIdAseguradora;
	public JLabel jLabelidAseguradora;
	public JButton jButtonidAseguradoraBusqueda= new JButtonMe();

	public JPanel jPanelcodigoAseguradora;
	public JLabel jLabelcodigoAseguradora;
	public JTextField jTextFieldcodigoAseguradora;
	public JButton jButtoncodigoAseguradoraBusqueda= new JButtonMe();

	public JPanel jPanelnombreAseguradora;
	public JLabel jLabelnombreAseguradora;
	public JTextArea jTextAreanombreAseguradora;
	public JScrollPane jscrollPanenombreAseguradora;
	public JButton jButtonnombreAseguradoraBusqueda= new JButtonMe();

	public JPanel jPaneldireccionAseguradora;
	public JLabel jLabeldireccionAseguradora;
	public JTextArea jTextAreadireccionAseguradora;
	public JScrollPane jscrollPanedireccionAseguradora;
	public JButton jButtondireccionAseguradoraBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoAseguradora;
	public JLabel jLabeltelefonoAseguradora;
	public JTextArea jTextAreatelefonoAseguradora;
	public JScrollPane jscrollPanetelefonoAseguradora;
	public JButton jButtontelefonoAseguradoraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAseguradora;
	public JLabel jLabelid_empresaAseguradora;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAseguradora;
	public JButton jButtonid_empresaAseguradora= new JButtonMe();
	public JButton jButtonid_empresaAseguradoraUpdate= new JButtonMe();
	public JButton jButtonid_empresaAseguradoraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAseguradora;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AseguradoraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAseguradora=new JPanel();
				this.jPanelAccionesFormularioAseguradora=new JPanel();
				this.jmenuBarDetalleAseguradora=new JMenuBar();
				this.jTtoolBarDetalleAseguradora=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AseguradoraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Aseguradora No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AseguradoraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Aseguradora No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AseguradoraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Aseguradora No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AseguradoraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Aseguradora No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AseguradoraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Aseguradora No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAseguradora() {
		return this.jButtonActualizarToolBarAseguradora;
	}
	
	public JButton getjButtonEliminarToolBarAseguradora() {
		return this.jButtonEliminarToolBarAseguradora;
	}
	
	public JButton getjButtonCancelarToolBarAseguradora() {
		return this.jButtonCancelarToolBarAseguradora;
	}		
	
	public JButton getjButtonProcesarInformacionAseguradora() {
		return this.jButtonProcesarInformacionAseguradora;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAseguradora)	{
		this.jButtonProcesarInformacionAseguradora = jButtonProcesarInformacionAseguradora;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAseguradora() {
		return this.jComboBoxTiposAccionesAseguradora;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAseguradora(
			JComboBox jComboBoxTiposRelacionesAseguradora) {
		this.jComboBoxTiposRelacionesAseguradora = jComboBoxTiposRelacionesAseguradora;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAseguradora(
			JComboBox jComboBoxTiposAccionesAseguradora) {
		this.jComboBoxTiposAccionesAseguradora = jComboBoxTiposAccionesAseguradora;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAseguradora() {
		return this.jComboBoxTiposAccionesFormularioAseguradora;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAseguradora(
			JComboBox jComboBoxTiposAccionesFormularioAseguradora) {
		this.jComboBoxTiposAccionesFormularioAseguradora = jComboBoxTiposAccionesFormularioAseguradora;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.aseguradoraSessionBean=new AseguradoraSessionBean();
		
		this.aseguradoraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.aseguradoraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.aseguradoraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.vehiculoSessionBean=new VehiculoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AseguradoraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AseguradoraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AseguradoraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Aseguradora MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
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
	
		AseguradoraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAseguradora= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAseguradora=new JButtonMe();
				this.jButtonModificarToolBarAseguradora=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAseguradora,this.jTtoolBarDetalleAseguradora,
							"actualizar","actualizar","Actualizar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAseguradora,this.jTtoolBarDetalleAseguradora,
							"eliminar","eliminar","Eliminar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAseguradora,this.jTtoolBarDetalleAseguradora,
							"cancelar","cancelar","Cancelar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAseguradora,this.jTtoolBarDetalleAseguradora,
							"guardarcambios","guardarcambios","Guardar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAseguradora=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAseguradora=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAseguradora=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAseguradora=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAseguradora=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAseguradora= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAseguradora.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAseguradora,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAseguradora= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAseguradora.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAseguradora,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAseguradora= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAseguradora.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAseguradora,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAseguradora= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAseguradora.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAseguradora,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAseguradora= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAseguradora.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAseguradora,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAseguradora= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAseguradora.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAseguradora,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAseguradora= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAseguradora.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAseguradora,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAseguradora= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAseguradora.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAseguradora,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAseguradora= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAseguradora.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAseguradora,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAseguradora= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAseguradora.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAseguradora,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAseguradora.add(this.jMenuItemDetalleCerrarAseguradora);
		
		this.jmenuDetalleAccionesAseguradora.add(this.jMenuItemActualizarAseguradora);
		this.jmenuDetalleAccionesAseguradora.add(this.jMenuItemEliminarAseguradora);
		this.jmenuDetalleAccionesAseguradora.add(this.jMenuItemCancelarAseguradora);		
		
		//this.jmenuDetalleDatosAseguradora.add(this.jMenuItemDetalleAbrirOrderByAseguradora);				
		this.jmenuDetalleDatosAseguradora.add(this.jMenuItemDetalleMostarOcultarAseguradora);				
				
		//this.jmenuDetalleAccionesAseguradora.add(this.jMenuItemGuardarCambiosAseguradora);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAseguradora.add(this.jmenuDetalleArchivoAseguradora);		
		this.jmenuBarDetalleAseguradora.add(this.jmenuDetalleAccionesAseguradora);		
		this.jmenuBarDetalleAseguradora.add(this.jmenuDetalleDatosAseguradora);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleAseguradora.add(this.jmenuDetalleAseguradora);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAseguradora);				
	}
	
	
	public void inicializarElementosCamposAseguradora() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAseguradora = new JLabelMe();
		jLabelIdAseguradora.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAseguradora = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAseguradora.setToolTipText(AseguradoraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAseguradora= new GridBagLayout();

		this.jPanelidAseguradora.setLayout(this.gridaBagLayoutAseguradora);

		jLabelidAseguradora = new JLabel();
		jLabelidAseguradora.setText("Id");

		jLabelidAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoAseguradora = new JLabelMe();
		this.jLabelcodigoAseguradora.setText(""+AseguradoraConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoAseguradora.setToolTipText("Codigo");
		this.jLabelcodigoAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoAseguradora=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoAseguradora.setToolTipText(AseguradoraConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutAseguradora = new GridBagLayout();
		this.jPanelcodigoAseguradora.setLayout(this.gridaBagLayoutAseguradora);


		jTextFieldcodigoAseguradora= new JTextFieldMe();

		jTextFieldcodigoAseguradora.setEnabled(false);
		jTextFieldcodigoAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoAseguradoraBusqueda= new JButtonMe();
		this.jButtoncodigoAseguradoraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAseguradoraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAseguradoraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoAseguradoraBusqueda.setText("U");
		this.jButtoncodigoAseguradoraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoAseguradoraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoAseguradoraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoAseguradora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoAseguradora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoAseguradoraBusqueda"));

		if(this.aseguradoraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoAseguradoraBusqueda.setVisible(false);		}


					
		this.jLabelnombreAseguradora = new JLabelMe();
		this.jLabelnombreAseguradora.setText(""+AseguradoraConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreAseguradora.setToolTipText("Nombre");
		this.jLabelnombreAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreAseguradora=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreAseguradora.setToolTipText(AseguradoraConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutAseguradora = new GridBagLayout();
		this.jPanelnombreAseguradora.setLayout(this.gridaBagLayoutAseguradora);


		jTextAreanombreAseguradora= new JTextAreaMe();
		jTextAreanombreAseguradora.setEnabled(false);
		jTextAreanombreAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAseguradora.setLineWrap(true);
		jTextAreanombreAseguradora.setWrapStyleWord(true);
		jTextAreanombreAseguradora.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreAseguradora.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreAseguradora = new JScrollPane(jTextAreanombreAseguradora);
		jscrollPanenombreAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreAseguradoraBusqueda= new JButtonMe();
		this.jButtonnombreAseguradoraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAseguradoraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAseguradoraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreAseguradoraBusqueda.setText("U");
		this.jButtonnombreAseguradoraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreAseguradoraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreAseguradoraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreAseguradora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreAseguradora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreAseguradoraBusqueda"));

		if(this.aseguradoraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreAseguradoraBusqueda.setVisible(false);		}


					
		this.jLabeldireccionAseguradora = new JLabelMe();
		this.jLabeldireccionAseguradora.setText(""+AseguradoraConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionAseguradora.setToolTipText("Direccion");
		this.jLabeldireccionAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionAseguradora=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionAseguradora.setToolTipText(AseguradoraConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutAseguradora = new GridBagLayout();
		this.jPaneldireccionAseguradora.setLayout(this.gridaBagLayoutAseguradora);


		jTextAreadireccionAseguradora= new JTextAreaMe();
		jTextAreadireccionAseguradora.setEnabled(false);
		jTextAreadireccionAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionAseguradora.setLineWrap(true);
		jTextAreadireccionAseguradora.setWrapStyleWord(true);
		jTextAreadireccionAseguradora.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionAseguradora.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionAseguradora = new JScrollPane(jTextAreadireccionAseguradora);
		jscrollPanedireccionAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionAseguradoraBusqueda= new JButtonMe();
		this.jButtondireccionAseguradoraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionAseguradoraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionAseguradoraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionAseguradoraBusqueda.setText("U");
		this.jButtondireccionAseguradoraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionAseguradoraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionAseguradoraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionAseguradora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionAseguradora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionAseguradoraBusqueda"));

		if(this.aseguradoraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionAseguradoraBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoAseguradora = new JLabelMe();
		this.jLabeltelefonoAseguradora.setText(""+AseguradoraConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoAseguradora.setToolTipText("Telefono");
		this.jLabeltelefonoAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoAseguradora=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoAseguradora.setToolTipText(AseguradoraConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutAseguradora = new GridBagLayout();
		this.jPaneltelefonoAseguradora.setLayout(this.gridaBagLayoutAseguradora);


		jTextAreatelefonoAseguradora= new JTextAreaMe();
		jTextAreatelefonoAseguradora.setEnabled(false);
		jTextAreatelefonoAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoAseguradora.setLineWrap(true);
		jTextAreatelefonoAseguradora.setWrapStyleWord(true);
		jTextAreatelefonoAseguradora.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoAseguradora.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoAseguradora = new JScrollPane(jTextAreatelefonoAseguradora);
		jscrollPanetelefonoAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonoAseguradoraBusqueda= new JButtonMe();
		this.jButtontelefonoAseguradoraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoAseguradoraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoAseguradoraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoAseguradoraBusqueda.setText("U");
		this.jButtontelefonoAseguradoraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoAseguradoraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoAseguradoraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoAseguradora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoAseguradora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoAseguradoraBusqueda"));

		if(this.aseguradoraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoAseguradoraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAseguradora() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAseguradora = new JLabelMe();
		this.jLabelid_empresaAseguradora.setText(""+AseguradoraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAseguradora.setToolTipText("Empresa");
		this.jLabelid_empresaAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAseguradora=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAseguradora.setToolTipText(AseguradoraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAseguradora = new GridBagLayout();
		this.jPanelid_empresaAseguradora.setLayout(this.gridaBagLayoutAseguradora);


		jComboBoxid_empresaAseguradora= new JComboBoxMe();
		jComboBoxid_empresaAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAseguradora.setEnabled(false);

		this.jButtonid_empresaAseguradora= new JButtonMe();
		this.jButtonid_empresaAseguradora.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAseguradora.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAseguradora.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAseguradora.setText("Buscar");
		this.jButtonid_empresaAseguradora.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAseguradora.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAseguradora,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAseguradora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAseguradora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAseguradora"));

		this.jButtonid_empresaAseguradoraBusqueda= new JButtonMe();
		this.jButtonid_empresaAseguradoraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAseguradoraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAseguradoraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAseguradoraBusqueda.setText("U");
		this.jButtonid_empresaAseguradoraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAseguradoraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAseguradoraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAseguradora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAseguradora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAseguradoraBusqueda"));

		if(this.aseguradoraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAseguradoraBusqueda.setVisible(false);		}

		this.jButtonid_empresaAseguradoraUpdate= new JButtonMe();
		this.jButtonid_empresaAseguradoraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAseguradoraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAseguradoraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAseguradoraUpdate.setText("U");
		this.jButtonid_empresaAseguradoraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAseguradoraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAseguradoraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAseguradora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAseguradora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAseguradoraUpdate"));



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
		//this.jInternalFrameDetalleAseguradora = new AseguradoraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Aseguradora DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAseguradora= new GridBagLayout();
		

		
		String sToolTipAseguradora="";
		sToolTipAseguradora=AseguradoraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAseguradora+="(ActivosFijos.Aseguradora)";
		}
		
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
			sToolTipAseguradora+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAseguradora = new JButtonMe();
		this.jButtonModificarAseguradora = new JButtonMe();
        this.jButtonActualizarAseguradora = new JButtonMe();
        this.jButtonEliminarAseguradora = new JButtonMe();
        this.jButtonCancelarAseguradora = new JButtonMe();
        this.jButtonGuardarCambiosAseguradora = new JButtonMe();
		this.jButtonGuardarCambiosTablaAseguradora = new JButtonMe();
		this.jButtonCerrarAseguradora = new JButtonMe();
		
		this.jScrollPanelDatosAseguradora = new JScrollPane();   
        this.jScrollPanelDatosEdicionAseguradora = new JScrollPane();
		this.jScrollPanelDatosGeneralAseguradora = new JScrollPane();
				
		
		
		this.jPanelCamposAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Aseguradora";
		
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aseguradoras" + this.sPath));
		} else {
			this.jScrollPanelDatosAseguradora.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAseguradora.setName("jPanelCamposAseguradora"); 

		this.jPanelCamposOcultosAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAseguradora.setName("jPanelCamposOcultosAseguradora"); 

        this.jPanelAccionesAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAseguradora.setToolTipText("Acciones");
        this.jPanelAccionesAseguradora.setName("Acciones"); 

		this.jPanelAccionesFormularioAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAseguradora.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAseguradora.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAseguradora.setText("Nuevo");
		this.jButtonModificarAseguradora.setText("Editar");
        this.jButtonActualizarAseguradora.setText("Actualizar");
        this.jButtonEliminarAseguradora.setText("Eliminar");
        this.jButtonCancelarAseguradora.setText("Cancelar");
        this.jButtonGuardarCambiosAseguradora.setText("Guardar");
		this.jButtonGuardarCambiosTablaAseguradora.setText("Guardar");
		this.jButtonCerrarAseguradora.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAseguradora,"nuevo_button","Nuevo",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAseguradora,"modificar_button","Editar",this.aseguradoraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAseguradora,"actualizar_button","Actualizar",this.aseguradoraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAseguradora,"eliminar_button","Eliminar",this.aseguradoraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAseguradora,"cancelar_button","Cancelar",this.aseguradoraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAseguradora,"guardarcambios_button","Guardar",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAseguradora,"guardarcambiostabla_button","Guardar",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAseguradora,"cerrar_button","Salir",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAseguradora.setToolTipText("Nuevo"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAseguradora.setToolTipText("Editar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAseguradora.setToolTipText("Actualizar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAseguradora.setToolTipText("Eliminar)"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAseguradora.setToolTipText("Cancelar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAseguradora.setToolTipText("Guardar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAseguradora.setToolTipText("Guardar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAseguradora.setToolTipText("Salir"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAseguradora";
		inputMap = this.jButtonNuevoAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAseguradora.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAseguradora"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAseguradora";
		inputMap = this.jButtonActualizarAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAseguradora"));
		
		//ELIMINAR
		sMapKey = "EliminarAseguradora";
		inputMap = this.jButtonEliminarAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAseguradora"));
		
		//CANCELAR	
		sMapKey = "CancelarAseguradora";
		inputMap = this.jButtonCancelarAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAseguradora"));
		
		//CERRAR		
		sMapKey = "CerrarAseguradora";
		inputMap = this.jButtonCerrarAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAseguradora"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAseguradora";
		inputMap = this.jButtonGuardarCambiosTablaAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAseguradora"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAseguradora = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAseguradora.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAseguradora.setToolTipText("Nuevo Aseguradora");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAseguradora = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAseguradora.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAseguradora.setToolTipText("Sin Cerrar Ventana Aseguradora");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAseguradora = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAseguradora.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAseguradora.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAseguradora = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAseguradora.setText("Accion");
		this.jComboBoxTiposAccionesAseguradora.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAseguradora = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAseguradora.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAseguradora.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAseguradora = new JLabelMe();
		
		this.jLabelAccionesAseguradora.setText("Acciones");		
		this.jLabelAccionesAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAseguradora();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAseguradora();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAseguradora=new JTabbedPane();
		this.jTabbedPaneRelacionesAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAseguradora,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAseguradora.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAseguradora.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAseguradora.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAseguradora.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAseguradora.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAseguradora.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAseguradora = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAseguradora = new GridBagLayout();
		
		this.jPanelCamposAseguradora.setLayout(gridaBagLayoutCamposAseguradora);
		this.jPanelCamposOcultosAseguradora.setLayout(gridaBagLayoutCamposOcultosAseguradora);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 0;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAseguradora.add(jLabelIdAseguradora, this.gridBagConstraintsAseguradora);



	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 1;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAseguradora.add(jLabelidAseguradora, this.gridBagConstraintsAseguradora);


	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 0;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAseguradora.add(jLabelid_empresaAseguradora, this.gridBagConstraintsAseguradora);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		//this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = 0;
		this.gridBagConstraintsAseguradora.gridx = 2;
		this.gridBagConstraintsAseguradora.ipadx = 0;
		this.gridBagConstraintsAseguradora.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAseguradora.add(jButtonid_empresaAseguradoraBusqueda, this.gridBagConstraintsAseguradora);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		//this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = 0;
		this.gridBagConstraintsAseguradora.gridx = 3;
		this.gridBagConstraintsAseguradora.ipadx = 0;
		this.gridBagConstraintsAseguradora.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAseguradora.add(jButtonid_empresaAseguradoraUpdate, this.gridBagConstraintsAseguradora);
	}

	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 1;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAseguradora.add(jComboBoxid_empresaAseguradora, this.gridBagConstraintsAseguradora);


	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 0;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoAseguradora.add(jLabelcodigoAseguradora, this.gridBagConstraintsAseguradora);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		//this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = 0;
		this.gridBagConstraintsAseguradora.gridx = 2;
		this.gridBagConstraintsAseguradora.ipadx = 0;
		this.gridBagConstraintsAseguradora.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoAseguradora.add(jButtoncodigoAseguradoraBusqueda, this.gridBagConstraintsAseguradora);
	}

	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 1;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoAseguradora.add(jTextFieldcodigoAseguradora, this.gridBagConstraintsAseguradora);


	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 0;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreAseguradora.add(jLabelnombreAseguradora, this.gridBagConstraintsAseguradora);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		//this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = 0;
		this.gridBagConstraintsAseguradora.gridx = 2;
		this.gridBagConstraintsAseguradora.ipadx = 0;
		this.gridBagConstraintsAseguradora.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreAseguradora.add(jButtonnombreAseguradoraBusqueda, this.gridBagConstraintsAseguradora);
	}

	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 1;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreAseguradora.add(jscrollPanenombreAseguradora, this.gridBagConstraintsAseguradora);


	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 0;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionAseguradora.add(jLabeldireccionAseguradora, this.gridBagConstraintsAseguradora);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		//this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = 0;
		this.gridBagConstraintsAseguradora.gridx = 2;
		this.gridBagConstraintsAseguradora.ipadx = 0;
		this.gridBagConstraintsAseguradora.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionAseguradora.add(jButtondireccionAseguradoraBusqueda, this.gridBagConstraintsAseguradora);
	}

	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 1;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionAseguradora.add(jscrollPanedireccionAseguradora, this.gridBagConstraintsAseguradora);


	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 0;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoAseguradora.add(jLabeltelefonoAseguradora, this.gridBagConstraintsAseguradora);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		//this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = 0;
		this.gridBagConstraintsAseguradora.gridx = 2;
		this.gridBagConstraintsAseguradora.ipadx = 0;
		this.gridBagConstraintsAseguradora.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoAseguradora.add(jButtontelefonoAseguradoraBusqueda, this.gridBagConstraintsAseguradora);
	}

	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAseguradora.gridy = 0;
	this.gridBagConstraintsAseguradora.gridx = 1;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoAseguradora.add(jscrollPanetelefonoAseguradora, this.gridBagConstraintsAseguradora);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAseguradora.gridy = iYPanelCamposAseguradora;
	this.gridBagConstraintsAseguradora.gridx = iXPanelCamposAseguradora++;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAseguradora.add(this.jPanelidAseguradora, this.gridBagConstraintsAseguradora);



	if(iXPanelCamposAseguradora % 1==0) {
		iXPanelCamposAseguradora=0;
		iYPanelCamposAseguradora++;
	}
	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAseguradora.gridy = iYPanelCamposAseguradora;
	this.gridBagConstraintsAseguradora.gridx = iXPanelCamposAseguradora++;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAseguradora.add(this.jPanelcodigoAseguradora, this.gridBagConstraintsAseguradora);



	if(iXPanelCamposAseguradora % 1==0) {
		iXPanelCamposAseguradora=0;
		iYPanelCamposAseguradora++;
	}
	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAseguradora.gridy = iYPanelCamposAseguradora;
	this.gridBagConstraintsAseguradora.gridx = iXPanelCamposAseguradora++;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAseguradora.add(this.jPanelnombreAseguradora, this.gridBagConstraintsAseguradora);



	if(iXPanelCamposAseguradora % 1==0) {
		iXPanelCamposAseguradora=0;
		iYPanelCamposAseguradora++;
	}
	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAseguradora.gridy = iYPanelCamposAseguradora;
	this.gridBagConstraintsAseguradora.gridx = iXPanelCamposAseguradora++;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAseguradora.add(this.jPaneldireccionAseguradora, this.gridBagConstraintsAseguradora);



	if(iXPanelCamposAseguradora % 1==0) {
		iXPanelCamposAseguradora=0;
		iYPanelCamposAseguradora++;
	}
	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAseguradora.gridy = iYPanelCamposAseguradora;
	this.gridBagConstraintsAseguradora.gridx = iXPanelCamposAseguradora++;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAseguradora.add(this.jPaneltelefonoAseguradora, this.gridBagConstraintsAseguradora);



	if(iXPanelCamposAseguradora % 1==0) {
		iXPanelCamposAseguradora=0;
		iYPanelCamposAseguradora++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAseguradora = new GridBagConstraints();
	this.gridBagConstraintsAseguradora.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAseguradora.gridy = iYPanelCamposOcultosAseguradora;
	this.gridBagConstraintsAseguradora.gridx = iXPanelCamposOcultosAseguradora++;
	this.gridBagConstraintsAseguradora.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAseguradora.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAseguradora.add(this.jPanelid_empresaAseguradora, this.gridBagConstraintsAseguradora);



	if(iXPanelCamposOcultosAseguradora % 1==0) {
		iXPanelCamposOcultosAseguradora=0;
		iYPanelCamposOcultosAseguradora++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesAseguradora= new GridBagLayout();
		this.jPanelAccionesAseguradora.setLayout(gridaBagLayoutAccionesAseguradora);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAseguradora= new GridBagLayout();
		this.jPanelAccionesFormularioAseguradora.setLayout(gridaBagLayoutAccionesFormularioAseguradora);
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAseguradora.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAseguradora.add(this.jComboBoxTiposAccionesFormularioAseguradora, this.gridBagConstraintsAseguradora);

		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAseguradora.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAseguradora.add(this.jCheckBoxPostAccionNuevoAseguradora, this.gridBagConstraintsAseguradora);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.aseguradoraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAseguradora.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAseguradora.add(this.jCheckBoxPostAccionSinCerrarAseguradora, this.gridBagConstraintsAseguradora);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.aseguradoraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAseguradora.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAseguradora.add(this.jCheckBoxPostAccionSinMensajeAseguradora, this.gridBagConstraintsAseguradora);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = 0;
		this.gridBagConstraintsAseguradora.gridx = iPosXAccion++;
			
		this.jPanelAccionesAseguradora.add(this.jButtonModificarAseguradora, this.gridBagConstraintsAseguradora);							

		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = 0;
		this.gridBagConstraintsAseguradora.gridx =iPosXAccion++;
			
		this.jPanelAccionesAseguradora.add(this.jButtonEliminarAseguradora, this.gridBagConstraintsAseguradora);
		
			
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = 0;		
		this.gridBagConstraintsAseguradora.gridx = iPosXAccion++;
		
		this.jPanelAccionesAseguradora.add(this.jButtonActualizarAseguradora, this.gridBagConstraintsAseguradora);


		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = 0;		
		this.gridBagConstraintsAseguradora.gridx = iPosXAccion++;
		
		this.jPanelAccionesAseguradora.add(this.jButtonGuardarCambiosAseguradora, this.gridBagConstraintsAseguradora);	
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = 0;		
		this.gridBagConstraintsAseguradora.gridx =iPosXAccion++;
		
		this.jPanelAccionesAseguradora.add(this.jButtonCancelarAseguradora, this.gridBagConstraintsAseguradora);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAseguradora = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAseguradora);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAseguradora = new GridBagConstraints();						
			this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAseguradora.gridx = 0;		
			//this.gridBagConstraintsAseguradora.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAseguradora.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAseguradora.gridx =0;
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAseguradora.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAseguradora, this.gridBagConstraintsAseguradora);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AseguradoraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAseguradora = new AseguradoraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Aseguradora DATOS");
			
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
			
	        //this.setTitle("[FOR] - Aseguradora DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Aseguradora Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AseguradoraModel aseguradoraModel=new AseguradoraModel(this);
			
			//SI USARA CLASE INTERNA
			//AseguradoraModel.AseguradoraFocusTraversalPolicy aseguradoraFocusTraversalPolicy = aseguradoraModel.new AseguradoraFocusTraversalPolicy(this);
			
			//aseguradoraFocusTraversalPolicy.setaseguradoraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(aseguradoraModel);
			
			
			this.jContentPaneDetalleAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAseguradora = new GridBagLayout();	
			this.jContentPaneDetalleAseguradora.setLayout(gridaBagLayoutDetalleAseguradora);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAseguradora = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAseguradora = new GridBagConstraints();
				this.gridBagConstraintsAseguradora.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAseguradora.gridx = 0;
					
				
				this.jContentPaneDetalleAseguradora.add(jTtoolBarDetalleAseguradora, gridBagConstraintsAseguradora);								
				
}
			
			this.jScrollPanelDatosEdicionAseguradora=   new JScrollPane(jContentPaneDetalleAseguradora,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAseguradora.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAseguradora.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAseguradora.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAseguradora=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAseguradora.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAseguradora.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAseguradora.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAseguradora.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAseguradora.gridx = 0;
	        
			this.jContentPaneDetalleAseguradora.add(jPanelCamposAseguradora, gridBagConstraintsAseguradora);
			
			
			
			
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
						&& aseguradoraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameVehiculo(this.puedeCargarPorParteVehiculo,false,-1);
					
					if(this.aseguradoraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAseguradora= new GridBagConstraints();
						this.gridBagConstraintsAseguradora.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAseguradora.gridx = 0;
						this.jContentPaneDetalleAseguradora.add(this.jTabbedPaneRelacionesAseguradora, this.gridBagConstraintsAseguradora);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAseguradora.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameVehiculo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAseguradora.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAseguradora = new GridBagConstraints();
					this.gridBagConstraintsAseguradora.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAseguradora.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAseguradora.gridx = 0;
					
				
					this.jContentPaneDetalleAseguradora.add(jPanelCamposOcultosAseguradora, gridBagConstraintsAseguradora);
				
					this.jPanelCamposOcultosAseguradora.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsAseguradora.gridx = 0;
	        this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAseguradora.add(this.jPanelAccionesFormularioAseguradora, this.gridBagConstraintsAseguradora);							
			
			
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
	        this.gridBagConstraintsAseguradora.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsAseguradora.gridx = 0;
	        
			
			this.jContentPaneDetalleAseguradora.add(this.jPanelAccionesAseguradora, this.gridBagConstraintsAseguradora);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAseguradora);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAseguradora=   new JScrollPane(this.jPanelCamposAseguradora,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAseguradora.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAseguradora.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAseguradora.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAseguradora.gridx = 0;
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAseguradora.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAseguradora, this.gridBagConstraintsAseguradora);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAseguradora.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAseguradora, this.gridBagConstraintsAseguradora);			
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAseguradora.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAseguradora, this.gridBagConstraintsAseguradora);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAseguradora.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAseguradora, this.gridBagConstraintsAseguradora);
			
			
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAseguradora.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAseguradora, this.gridBagConstraintsAseguradora);
		
			
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAseguradora.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAseguradora, this.gridBagConstraintsAseguradora);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAseguradora;//jContentPane;
		
		return jScrollPanelDatosEdicionAseguradora;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameVehiculo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.vehiculoSessionBean=new VehiculoSessionBean();
		this.vehiculoSessionBean.setConGuardarRelaciones(false);
		this.vehiculoSessionBean.setEsGuardarRelacionado(true);

		this.vehiculoBeanSwingJInternalFrame=null;//new VehiculoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.vehiculoBeanSwingJInternalFramePopup=new VehiculoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.vehiculoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {

				VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL=AseguradoraJInternalFrame.STIPO_TAMANIO_GENERAL;
				VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AseguradoraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.vehiculoSessionBean.setEsGuardarRelacionado(true);

				this.vehiculoBeanSwingJInternalFrame=new VehiculoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.vehiculoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.vehiculoBeanSwingJInternalFrame.setvehiculoSessionBean(this.vehiculoSessionBean);

				//this.gridBagConstraintsAseguradora = new GridBagConstraints();
				//this.gridBagConstraintsAseguradora.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAseguradora.gridx = 0;
				//this.jContentPaneDetalleAseguradora.add(this.vehiculoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAseguradora);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAseguradora.add("Vehiculos",this.vehiculoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAseguradora.setComponentAt(iIndexTab,this.vehiculoBeanSwingJInternalFrame.getContentPane());
				}

				//VehiculoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.vehiculoSessionBean.setEsGuardarRelacionado(false);
				this.vehiculoBeanSwingJInternalFrame=null;//new VehiculoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVehiculo) {
					this.jTabbedPaneRelacionesAseguradora.add("Vehiculos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarVehiculoBeanSwingJInternalFrame(List<Aseguradora> aseguradoras,Aseguradora aseguradora,VehiculoBeanSwingJInternalFrame vehiculoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//vehiculoBeanSwingJInternalFrame=new VehiculoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					vehiculoBeanSwingJInternalFrame.getVehiculoLogic().setConnexion(this.aseguradoraLogic.getConnexion());

					vehiculoBeanSwingJInternalFrame.setaseguradorasForeignKey(aseguradoras);
					vehiculoBeanSwingJInternalFrame.setaseguradoraForeignKey(aseguradora);
					vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.setisBusquedaDesdeForeignKeySesionAseguradora(true);
					vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.setlidAseguradoraActual(aseguradora.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					vehiculoBeanSwingJInternalFrame.cargarCombosForeignKeyVehiculo(vehiculoBeanSwingJInternalFrame.isCargarCombosDependencia);
					vehiculoBeanSwingJInternalFrame.setVisibilidadBusquedasParaAseguradora(true);
					vehiculoBeanSwingJInternalFrame.setid_aseguradoraFK_IdAseguradora(aseguradora.getId());

					if(!this.conCargarFormDetalle) {
						vehiculoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					vehiculoBeanSwingJInternalFrame.setSelectedItemCombosFrameAseguradoraForeignKey(aseguradora,1,false,true,true);
					vehiculoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					vehiculoBeanSwingJInternalFrame.procesarBusqueda("FK_IdAseguradora");
					vehiculoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAseguradora");
					vehiculoBeanSwingJInternalFrame.inicializarActualizarBindingTablaVehiculo(true);
					vehiculoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesVehiculo("n",vehiculoBeanSwingJInternalFrame.isGuardarCambiosEnLote, vehiculoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					vehiculoBeanSwingJInternalFrame.setAutoscrolls(true);
					vehiculoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						vehiculoBeanSwingJInternalFrame.actualizarEstadoPanelsVehiculo("relacionado");
					} else {
						vehiculoBeanSwingJInternalFrame.actualizarEstadoPanelsVehiculo("no_relacionado");
					}

					vehiculoBeanSwingJInternalFrame.getjButtonRecargarInformacionVehiculo().setVisible(false);

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
