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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.EstadoCivilConstantesFunciones;

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
public class EstadoCivilDetalleFormJInternalFrame extends EstadoCivilBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoCivil;
	
	protected JMenuBar jmenuBarDetalleEstadoCivil;
	
	protected JMenu jmenuDetalleEstadoCivil;
	protected JMenu jmenuDetalleArchivoEstadoCivil;
	protected JMenu jmenuDetalleAccionesEstadoCivil;
	protected JMenu jmenuDetalleDatosEstadoCivil;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoCivil;	
	protected GridBagConstraints gridBagConstraintsEstadoCivil;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoCivilBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoCivil;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoCivilSessionBean estadocivilSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame=null;
	public CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargaFamiliar_NM=false;
	public CargaFamiliar_NMSessionBean cargafamiliar_nmSessionBean;

	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;
	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSubCliente=false;
	public SubClienteSessionBean subclienteSessionBean;

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;

	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCarteraDefecto=false;
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;

	public CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame=null;
	public CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargaFamiliar=false;
	public CargaFamiliarSessionBean cargafamiliarSessionBean;
	
		
	
	public EstadoCivilLogic estadocivilLogic;
	
	public JScrollPane jScrollPanelDatosEstadoCivil;
	public JScrollPane jScrollPanelDatosEdicionEstadoCivil;
	public JScrollPane jScrollPanelDatosGeneralEstadoCivil;
	
	protected JPanel jPanelCamposEstadoCivil;    
	protected JPanel jPanelCamposOcultosEstadoCivil;    	
	protected JPanel jPanelAccionesEstadoCivil;
	protected JPanel jPanelAccionesFormularioEstadoCivil;
    
	
	
	protected Integer iXPanelCamposEstadoCivil=0;
	protected Integer iYPanelCamposEstadoCivil=0;
	
	protected Integer iXPanelCamposOcultosEstadoCivil=0;
	protected Integer iYPanelCamposOcultosEstadoCivil=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoCivil;
	public JButton jButtonModificarEstadoCivil;
	public JButton jButtonActualizarEstadoCivil;
    public JButton jButtonEliminarEstadoCivil;
	public JButton jButtonCancelarEstadoCivil;
    public JButton jButtonGuardarCambiosEstadoCivil;
	public JButton jButtonGuardarCambiosTablaEstadoCivil;
	protected JButton jButtonCerrarEstadoCivil;
	
	
	protected JButton jButtonProcesarInformacionEstadoCivil;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoCivil;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoCivil;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoCivil;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoCivil;
	protected JButton jButtonModificarToolBarEstadoCivil;
	protected JButton jButtonActualizarToolBarEstadoCivil;
    protected JButton jButtonEliminarToolBarEstadoCivil;
	protected JButton jButtonCancelarToolBarEstadoCivil;
    protected JButton jButtonGuardarCambiosToolBarEstadoCivil;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoCivil;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoCivil;
	protected JButton jButtonCerrarToolBarEstadoCivil;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoCivil;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoCivil;
	protected JMenuItem jMenuItemModificarEstadoCivil;
	protected JMenuItem jMenuItemActualizarEstadoCivil;
    protected JMenuItem jMenuItemEliminarEstadoCivil;
	protected JMenuItem jMenuItemCancelarEstadoCivil;
    protected JMenuItem jMenuItemGuardarCambiosEstadoCivil;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoCivil;
	protected JMenuItem jMenuItemCerrarEstadoCivil;
	protected JMenuItem jMenuItemDetalleCerrarEstadoCivil;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoCivil;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoCivil;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoCivil;
	protected JMenuItem jMenuItemMostrarOcultarEstadoCivil;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoCivil;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoCivil;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoCivil;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoCivil;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoCivil;
	public JLabel jLabelIdEstadoCivil;
	public JTextFieldMe jTextFieldidEstadoCivil;
	public JButton jButtonidEstadoCivilBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoCivil;
	public JLabel jLabelcodigoEstadoCivil;
	public JTextField jTextFieldcodigoEstadoCivil;
	public JButton jButtoncodigoEstadoCivilBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoCivil;
	public JLabel jLabelnombreEstadoCivil;
	public JTextArea jTextAreanombreEstadoCivil;
	public JScrollPane jscrollPanenombreEstadoCivil;
	public JButton jButtonnombreEstadoCivilBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoCivil;
	
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
	
	public EstadoCivilDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoCivil=new JPanel();
				this.jPanelAccionesFormularioEstadoCivil=new JPanel();
				this.jmenuBarDetalleEstadoCivil=new JMenuBar();
				this.jTtoolBarDetalleEstadoCivil=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCivilDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoCivil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoCivilDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoCivil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCivilDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCivil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCivilDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCivil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCivilDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoCivil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoCivil() {
		return this.jButtonActualizarToolBarEstadoCivil;
	}
	
	public JButton getjButtonEliminarToolBarEstadoCivil() {
		return this.jButtonEliminarToolBarEstadoCivil;
	}
	
	public JButton getjButtonCancelarToolBarEstadoCivil() {
		return this.jButtonCancelarToolBarEstadoCivil;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoCivil() {
		return this.jButtonProcesarInformacionEstadoCivil;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoCivil)	{
		this.jButtonProcesarInformacionEstadoCivil = jButtonProcesarInformacionEstadoCivil;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoCivil() {
		return this.jComboBoxTiposAccionesEstadoCivil;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoCivil(
			JComboBox jComboBoxTiposRelacionesEstadoCivil) {
		this.jComboBoxTiposRelacionesEstadoCivil = jComboBoxTiposRelacionesEstadoCivil;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoCivil(
			JComboBox jComboBoxTiposAccionesEstadoCivil) {
		this.jComboBoxTiposAccionesEstadoCivil = jComboBoxTiposAccionesEstadoCivil;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoCivil() {
		return this.jComboBoxTiposAccionesFormularioEstadoCivil;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoCivil(
			JComboBox jComboBoxTiposAccionesFormularioEstadoCivil) {
		this.jComboBoxTiposAccionesFormularioEstadoCivil = jComboBoxTiposAccionesFormularioEstadoCivil;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadocivilSessionBean=new EstadoCivilSessionBean();
		
		this.estadocivilSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocivilSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadocivilSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		//this.subclienteSessionBean=new SubClienteSessionBean();
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		//this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		//this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoCivilJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Civil MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoCivilJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoCivil= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoCivil=new JButtonMe();
				this.jButtonModificarToolBarEstadoCivil=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoCivil,this.jTtoolBarDetalleEstadoCivil,
							"actualizar","actualizar","Actualizar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoCivil,this.jTtoolBarDetalleEstadoCivil,
							"eliminar","eliminar","Eliminar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoCivil,this.jTtoolBarDetalleEstadoCivil,
							"cancelar","cancelar","Cancelar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoCivil,this.jTtoolBarDetalleEstadoCivil,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoCivil,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoCivil,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoCivil,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoCivil=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoCivil=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoCivil=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoCivil=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoCivil=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoCivil= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoCivil.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoCivil,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoCivil= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoCivil.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoCivil,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoCivil= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoCivil.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoCivil,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoCivil= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoCivil.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoCivil,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoCivil= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoCivil.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoCivil,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoCivil= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoCivil.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoCivil,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoCivil= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoCivil.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoCivil,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoCivil= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoCivil.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoCivil,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoCivil= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoCivil.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoCivil,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoCivil= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoCivil.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoCivil,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoCivil.add(this.jMenuItemDetalleCerrarEstadoCivil);
		
		this.jmenuDetalleAccionesEstadoCivil.add(this.jMenuItemActualizarEstadoCivil);
		this.jmenuDetalleAccionesEstadoCivil.add(this.jMenuItemEliminarEstadoCivil);
		this.jmenuDetalleAccionesEstadoCivil.add(this.jMenuItemCancelarEstadoCivil);		
		
		//this.jmenuDetalleDatosEstadoCivil.add(this.jMenuItemDetalleAbrirOrderByEstadoCivil);				
		this.jmenuDetalleDatosEstadoCivil.add(this.jMenuItemDetalleMostarOcultarEstadoCivil);				
				
		//this.jmenuDetalleAccionesEstadoCivil.add(this.jMenuItemGuardarCambiosEstadoCivil);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoCivil.add(this.jmenuDetalleArchivoEstadoCivil);		
		this.jmenuBarDetalleEstadoCivil.add(this.jmenuDetalleAccionesEstadoCivil);		
		this.jmenuBarDetalleEstadoCivil.add(this.jmenuDetalleDatosEstadoCivil);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoCivil.add(this.jmenuDetalleEstadoCivil);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoCivil);				
	}
	
	
	public void inicializarElementosCamposEstadoCivil() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoCivil = new JLabelMe();
		jLabelIdEstadoCivil.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoCivil,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoCivil = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoCivil.setToolTipText(EstadoCivilConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoCivil= new GridBagLayout();

		this.jPanelidEstadoCivil.setLayout(this.gridaBagLayoutEstadoCivil);

		jTextFieldidEstadoCivil = new JTextFieldMe();
		jTextFieldidEstadoCivil.setText("Id");

		jTextFieldidEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoCivil = new JLabelMe();
		this.jLabelcodigoEstadoCivil.setText(""+EstadoCivilConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoCivil.setToolTipText("Codigo");
		this.jLabelcodigoEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoCivil,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoCivil=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoCivil.setToolTipText(EstadoCivilConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoCivil = new GridBagLayout();
		this.jPanelcodigoEstadoCivil.setLayout(this.gridaBagLayoutEstadoCivil);


		jTextFieldcodigoEstadoCivil= new JTextFieldMe();

		jTextFieldcodigoEstadoCivil.setEnabled(false);
		jTextFieldcodigoEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoCivil,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoCivilBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoCivilBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoCivilBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoCivilBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoCivilBusqueda.setText("U");
		this.jButtoncodigoEstadoCivilBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoCivilBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoCivilBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoCivil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoCivil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoCivilBusqueda"));

		if(this.estadocivilSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoCivilBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoCivil = new JLabelMe();
		this.jLabelnombreEstadoCivil.setText(""+EstadoCivilConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoCivil.setToolTipText("Nombre");
		this.jLabelnombreEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoCivil,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoCivil=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoCivil.setToolTipText(EstadoCivilConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoCivil = new GridBagLayout();
		this.jPanelnombreEstadoCivil.setLayout(this.gridaBagLayoutEstadoCivil);


		jTextAreanombreEstadoCivil= new JTextAreaMe();
		jTextAreanombreEstadoCivil.setEnabled(false);
		jTextAreanombreEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCivil.setLineWrap(true);
		jTextAreanombreEstadoCivil.setWrapStyleWord(true);
		jTextAreanombreEstadoCivil.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoCivil.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoCivil,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoCivil = new JScrollPane(jTextAreanombreEstadoCivil);
		jscrollPanenombreEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoCivilBusqueda= new JButtonMe();
		this.jButtonnombreEstadoCivilBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoCivilBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoCivilBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoCivilBusqueda.setText("U");
		this.jButtonnombreEstadoCivilBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoCivilBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoCivilBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoCivil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoCivil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoCivilBusqueda"));

		if(this.estadocivilSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoCivilBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoCivil() {
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
		//this.jInternalFrameDetalleEstadoCivil = new EstadoCivilBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Civil DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoCivil= new GridBagLayout();
		

		
		String sToolTipEstadoCivil="";
		sToolTipEstadoCivil=EstadoCivilConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoCivil+="(Nomina.EstadoCivil)";
		}
		
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoCivil+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoCivil = new JButtonMe();
		this.jButtonModificarEstadoCivil = new JButtonMe();
        this.jButtonActualizarEstadoCivil = new JButtonMe();
        this.jButtonEliminarEstadoCivil = new JButtonMe();
        this.jButtonCancelarEstadoCivil = new JButtonMe();
        this.jButtonGuardarCambiosEstadoCivil = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoCivil = new JButtonMe();
		this.jButtonCerrarEstadoCivil = new JButtonMe();
		
		this.jScrollPanelDatosEstadoCivil = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoCivil = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoCivil = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Civil";
		
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Civiles" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoCivil.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoCivil.setName("jPanelCamposEstadoCivil"); 

		this.jPanelCamposOcultosEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoCivil.setName("jPanelCamposOcultosEstadoCivil"); 

        this.jPanelAccionesEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoCivil.setToolTipText("Acciones");
        this.jPanelAccionesEstadoCivil.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoCivil.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoCivil.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoCivil.setText("Nuevo");
		this.jButtonModificarEstadoCivil.setText("Editar");
        this.jButtonActualizarEstadoCivil.setText("Actualizar");
        this.jButtonEliminarEstadoCivil.setText("Eliminar");
        this.jButtonCancelarEstadoCivil.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoCivil.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoCivil.setText("Guardar");
		this.jButtonCerrarEstadoCivil.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoCivil,"nuevo_button","Nuevo",this.estadocivilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoCivil,"modificar_button","Editar",this.estadocivilSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoCivil,"actualizar_button","Actualizar",this.estadocivilSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoCivil,"eliminar_button","Eliminar",this.estadocivilSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoCivil,"cancelar_button","Cancelar",this.estadocivilSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoCivil,"guardarcambios_button","Guardar",this.estadocivilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoCivil,"guardarcambiostabla_button","Guardar",this.estadocivilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoCivil,"cerrar_button","Salir",this.estadocivilSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoCivil.setToolTipText("Nuevo"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoCivil.setToolTipText("Editar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoCivil.setToolTipText("Actualizar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoCivil.setToolTipText("Eliminar)"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoCivil.setToolTipText("Cancelar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoCivil.setToolTipText("Guardar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoCivil.setToolTipText("Guardar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoCivil.setToolTipText("Salir"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoCivil";
		inputMap = this.jButtonNuevoEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoCivil.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoCivil"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoCivil";
		inputMap = this.jButtonActualizarEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoCivil"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoCivil";
		inputMap = this.jButtonEliminarEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoCivil"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoCivil";
		inputMap = this.jButtonCancelarEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoCivil"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoCivil";
		inputMap = this.jButtonCerrarEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoCivil"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoCivil";
		inputMap = this.jButtonGuardarCambiosTablaEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoCivil"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoCivil = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoCivil.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoCivil.setToolTipText("Nuevo EstadoCivil");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoCivil = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoCivil.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoCivil.setToolTipText("Sin Cerrar Ventana EstadoCivil");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoCivil = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoCivil.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoCivil.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoCivil = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoCivil.setText("Accion");
		this.jComboBoxTiposAccionesEstadoCivil.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoCivil = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoCivil.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoCivil.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoCivil = new JLabelMe();
		
		this.jLabelAccionesEstadoCivil.setText("Acciones");		
		this.jLabelAccionesEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoCivil();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoCivil();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoCivil=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoCivil,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoCivil.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCivil.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCivil.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoCivil.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoCivil.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoCivil.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoCivil = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoCivil = new GridBagLayout();
		
		this.jPanelCamposEstadoCivil.setLayout(gridaBagLayoutCamposEstadoCivil);
		this.jPanelCamposOcultosEstadoCivil.setLayout(gridaBagLayoutCamposOcultosEstadoCivil);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
	this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCivil.gridy = 0;
	this.gridBagConstraintsEstadoCivil.gridx = 0;
	this.gridBagConstraintsEstadoCivil.ipadx = 0;
	this.gridBagConstraintsEstadoCivil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoCivil.add(jLabelIdEstadoCivil, this.gridBagConstraintsEstadoCivil);



	this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
	this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCivil.gridy = 0;
	this.gridBagConstraintsEstadoCivil.gridx = 1;
	this.gridBagConstraintsEstadoCivil.ipadx = 0;
	this.gridBagConstraintsEstadoCivil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoCivil.add(jTextFieldidEstadoCivil, this.gridBagConstraintsEstadoCivil);


	this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
	this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCivil.gridy = 0;
	this.gridBagConstraintsEstadoCivil.gridx = 0;
	this.gridBagConstraintsEstadoCivil.ipadx = 0;
	this.gridBagConstraintsEstadoCivil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoCivil.add(jLabelcodigoEstadoCivil, this.gridBagConstraintsEstadoCivil);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCivil.gridy = 0;
		this.gridBagConstraintsEstadoCivil.gridx = 2;
		this.gridBagConstraintsEstadoCivil.ipadx = 0;
		this.gridBagConstraintsEstadoCivil.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoCivil.add(jButtoncodigoEstadoCivilBusqueda, this.gridBagConstraintsEstadoCivil);
	}

	this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
	this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCivil.gridy = 0;
	this.gridBagConstraintsEstadoCivil.gridx = 1;
	this.gridBagConstraintsEstadoCivil.ipadx = 0;
	this.gridBagConstraintsEstadoCivil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoCivil.add(jTextFieldcodigoEstadoCivil, this.gridBagConstraintsEstadoCivil);


	this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
	this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCivil.gridy = 0;
	this.gridBagConstraintsEstadoCivil.gridx = 0;
	this.gridBagConstraintsEstadoCivil.ipadx = 0;
	this.gridBagConstraintsEstadoCivil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoCivil.add(jLabelnombreEstadoCivil, this.gridBagConstraintsEstadoCivil);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCivil.gridy = 0;
		this.gridBagConstraintsEstadoCivil.gridx = 2;
		this.gridBagConstraintsEstadoCivil.ipadx = 0;
		this.gridBagConstraintsEstadoCivil.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoCivil.add(jButtonnombreEstadoCivilBusqueda, this.gridBagConstraintsEstadoCivil);
	}

	this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
	this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCivil.gridy = 0;
	this.gridBagConstraintsEstadoCivil.gridx = 1;
	this.gridBagConstraintsEstadoCivil.ipadx = 0;
	this.gridBagConstraintsEstadoCivil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoCivil.add(jscrollPanenombreEstadoCivil, this.gridBagConstraintsEstadoCivil);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
	this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCivil.gridy = iYPanelCamposEstadoCivil;
	this.gridBagConstraintsEstadoCivil.gridx = iXPanelCamposEstadoCivil++;
	this.gridBagConstraintsEstadoCivil.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCivil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCivil.add(this.jPanelidEstadoCivil, this.gridBagConstraintsEstadoCivil);



	if(iXPanelCamposEstadoCivil % 1==0) {
		iXPanelCamposEstadoCivil=0;
		iYPanelCamposEstadoCivil++;
	}
	this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
	this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCivil.gridy = iYPanelCamposEstadoCivil;
	this.gridBagConstraintsEstadoCivil.gridx = iXPanelCamposEstadoCivil++;
	this.gridBagConstraintsEstadoCivil.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCivil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCivil.add(this.jPanelcodigoEstadoCivil, this.gridBagConstraintsEstadoCivil);



	if(iXPanelCamposEstadoCivil % 1==0) {
		iXPanelCamposEstadoCivil=0;
		iYPanelCamposEstadoCivil++;
	}
	this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
	this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCivil.gridy = iYPanelCamposEstadoCivil;
	this.gridBagConstraintsEstadoCivil.gridx = iXPanelCamposEstadoCivil++;
	this.gridBagConstraintsEstadoCivil.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCivil.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCivil.add(this.jPanelnombreEstadoCivil, this.gridBagConstraintsEstadoCivil);



	if(iXPanelCamposEstadoCivil % 1==0) {
		iXPanelCamposEstadoCivil=0;
		iYPanelCamposEstadoCivil++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoCivil= new GridBagLayout();
		this.jPanelAccionesEstadoCivil.setLayout(gridaBagLayoutAccionesEstadoCivil);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoCivil= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoCivil.setLayout(gridaBagLayoutAccionesFormularioEstadoCivil);
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoCivil.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoCivil.add(this.jComboBoxTiposAccionesFormularioEstadoCivil, this.gridBagConstraintsEstadoCivil);

		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoCivil.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoCivil.add(this.jCheckBoxPostAccionNuevoEstadoCivil, this.gridBagConstraintsEstadoCivil);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadocivilSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoCivil.add(this.jCheckBoxPostAccionSinCerrarEstadoCivil, this.gridBagConstraintsEstadoCivil);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadocivilSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoCivil.add(this.jCheckBoxPostAccionSinMensajeEstadoCivil, this.gridBagConstraintsEstadoCivil);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = 0;
		this.gridBagConstraintsEstadoCivil.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoCivil.add(this.jButtonModificarEstadoCivil, this.gridBagConstraintsEstadoCivil);							

		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = 0;
		this.gridBagConstraintsEstadoCivil.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoCivil.add(this.jButtonEliminarEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
			
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = 0;		
		this.gridBagConstraintsEstadoCivil.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoCivil.add(this.jButtonActualizarEstadoCivil, this.gridBagConstraintsEstadoCivil);


		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = 0;		
		this.gridBagConstraintsEstadoCivil.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoCivil.add(this.jButtonGuardarCambiosEstadoCivil, this.gridBagConstraintsEstadoCivil);	
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = 0;		
		this.gridBagConstraintsEstadoCivil.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoCivil.add(this.jButtonCancelarEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoCivil = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoCivil);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();						
			this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoCivil.gridx = 0;		
			//this.gridBagConstraintsEstadoCivil.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoCivil.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoCivil.gridx =0;
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoCivil.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoCivil, this.gridBagConstraintsEstadoCivil);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoCivilJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoCivil = new EstadoCivilBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Civil DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Civil DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Civil Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoCivilModel estadocivilModel=new EstadoCivilModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoCivilModel.EstadoCivilFocusTraversalPolicy estadocivilFocusTraversalPolicy = estadocivilModel.new EstadoCivilFocusTraversalPolicy(this);
			
			//estadocivilFocusTraversalPolicy.setestadocivilJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadocivilModel);
			
			
			this.jContentPaneDetalleEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoCivil = new GridBagLayout();	
			this.jContentPaneDetalleEstadoCivil.setLayout(gridaBagLayoutDetalleEstadoCivil);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoCivil = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
				this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoCivil.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoCivil.add(jTtoolBarDetalleEstadoCivil, gridBagConstraintsEstadoCivil);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoCivil=   new JScrollPane(jContentPaneDetalleEstadoCivil,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoCivil.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCivil.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCivil.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoCivil=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoCivil.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCivil.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCivil.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoCivil.gridx = 0;
	        
			this.jContentPaneDetalleEstadoCivil.add(jPanelCamposEstadoCivil, gridBagConstraintsEstadoCivil);
			
			
			
			
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
						&& estadocivilSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(this.puedeCargarPorParteCargaFamiliar,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(this.puedeCargarPorParteCargaFamiliar_NM,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(this.puedeCargarPorParteParametroCarteraDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(this.puedeCargarPorParteSubCliente,false,-1);
					
					if(this.estadocivilSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoCivil= new GridBagConstraints();
						this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoCivil.gridx = 0;
						this.jContentPaneDetalleEstadoCivil.add(this.jTabbedPaneRelacionesEstadoCivil, this.gridBagConstraintsEstadoCivil);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoCivil.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoCivil.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
					this.gridBagConstraintsEstadoCivil.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoCivil.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoCivil.add(jPanelCamposOcultosEstadoCivil, gridBagConstraintsEstadoCivil);
				
					this.jPanelCamposOcultosEstadoCivil.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;//19;		
	        this.gridBagConstraintsEstadoCivil.gridx = 0;
	        this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoCivil.add(this.jPanelAccionesFormularioEstadoCivil, this.gridBagConstraintsEstadoCivil);							
			
			
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
	        this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones;//19;		
	        this.gridBagConstraintsEstadoCivil.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoCivil.add(this.jPanelAccionesEstadoCivil, this.gridBagConstraintsEstadoCivil);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoCivil);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoCivil=   new JScrollPane(this.jPanelCamposEstadoCivil,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoCivil.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCivil.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCivil.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCivil.gridx = 0;
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoCivil.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoCivil, this.gridBagConstraintsEstadoCivil);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCivil.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoCivil, this.gridBagConstraintsEstadoCivil);			
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCivil.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoCivil, this.gridBagConstraintsEstadoCivil);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCivil.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoCivil, this.gridBagConstraintsEstadoCivil);
			
			
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCivil.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
			
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCivil.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoCivil, this.gridBagConstraintsEstadoCivil);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoCivil;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoCivil;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCargaFamiliar(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		this.cargafamiliarSessionBean.setConGuardarRelaciones(false);
		this.cargafamiliarSessionBean.setEsGuardarRelacionado(true);

		this.cargafamiliarBeanSwingJInternalFrame=null;//new CargaFamiliarBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargafamiliarBeanSwingJInternalFramePopup=new CargaFamiliarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargafamiliarBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {

				CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargafamiliarSessionBean.setEsGuardarRelacionado(true);

				this.cargafamiliarBeanSwingJInternalFrame=new CargaFamiliarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargafamiliarBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargafamiliarBeanSwingJInternalFrame.setcargafamiliarSessionBean(this.cargafamiliarSessionBean);

				//this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
				//this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoCivil.gridx = 0;
				//this.jContentPaneDetalleEstadoCivil.add(this.cargafamiliarBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoCivil);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Carga Familiares",this.cargafamiliarBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoCivil.setComponentAt(iIndexTab,this.cargafamiliarBeanSwingJInternalFrame.getContentPane());
				}

				//CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargafamiliarSessionBean.setEsGuardarRelacionado(false);
				this.cargafamiliarBeanSwingJInternalFrame=null;//new CargaFamiliarBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargaFamiliar) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Carga Familiares",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		this.cargafamiliar_nmSessionBean.setConGuardarRelaciones(false);
		this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);

		this.cargafamiliar_nmBeanSwingJInternalFrame=null;//new CargaFamiliar_NMBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargafamiliar_nmBeanSwingJInternalFramePopup=new CargaFamiliar_NMBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargafamiliar_nmBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {

				CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);

				this.cargafamiliar_nmBeanSwingJInternalFrame=new CargaFamiliar_NMBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargafamiliar_nmBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargafamiliar_nmBeanSwingJInternalFrame.setcargafamiliar_nmSessionBean(this.cargafamiliar_nmSessionBean);

				//this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
				//this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoCivil.gridx = 0;
				//this.jContentPaneDetalleEstadoCivil.add(this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoCivil);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Carga Familiar_ N Mes",this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoCivil.setComponentAt(iIndexTab,this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
				}

				//CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(false);
				this.cargafamiliar_nmBeanSwingJInternalFrame=null;//new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargaFamiliar_NM) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Carga Familiar_ N Mes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
				//this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoCivil.gridx = 0;
				//this.jContentPaneDetalleEstadoCivil.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoCivil);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoCivil.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoSessionBean=new EmpleadoSessionBean();
		this.empleadoSessionBean.setConGuardarRelaciones(false);
		this.empleadoSessionBean.setEsGuardarRelacionado(true);

		this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
				//this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoCivil.gridx = 0;
				//this.jContentPaneDetalleEstadoCivil.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoCivil);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoCivil.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocarteradefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocarteradefectoBeanSwingJInternalFrame.setparametrocarteradefectoSessionBean(this.parametrocarteradefectoSessionBean);

				//this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
				//this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoCivil.gridx = 0;
				//this.jContentPaneDetalleEstadoCivil.add(this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoCivil);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Parametro Cartera Defectos",this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoCivil.setComponentAt(iIndexTab,this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCarteraDefecto) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Parametro Cartera Defectos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSubCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subclienteSessionBean=new SubClienteSessionBean();
		this.subclienteSessionBean.setConGuardarRelaciones(false);
		this.subclienteSessionBean.setEsGuardarRelacionado(true);

		this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {

				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;
				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.subclienteSessionBean.setEsGuardarRelacionado(true);

				this.subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.subclienteBeanSwingJInternalFrame.setsubclienteSessionBean(this.subclienteSessionBean);

				//this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
				//this.gridBagConstraintsEstadoCivil.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoCivil.gridx = 0;
				//this.jContentPaneDetalleEstadoCivil.add(this.subclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoCivil);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Sub Clientes",this.subclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoCivil.setComponentAt(iIndexTab,this.subclienteBeanSwingJInternalFrame.getContentPane());
				}

				//SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subclienteSessionBean.setEsGuardarRelacionado(false);
				this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubCliente) {
					this.jTabbedPaneRelacionesEstadoCivil.add("Sub Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<EstadoCivil> estadocivils,EstadoCivil estadocivil,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.estadocivilLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setestadocivilsForeignKey(estadocivils);
					clienteBeanSwingJInternalFrame.setestadocivilForeignKey(estadocivil);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidEstadoCivilActual(estadocivil.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoCivil(true);
					clienteBeanSwingJInternalFrame.setid_estado_civilFK_IdEstadoCivil(estadocivil.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoCivilForeignKey(estadocivil,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoCivil");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoCivil");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCargaFamiliar_NMBeanSwingJInternalFrame(List<EstadoCivil> estadocivils,EstadoCivil estadocivil,CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargafamiliar_nmBeanSwingJInternalFrame=new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargafamiliar_nmBeanSwingJInternalFrame.getCargaFamiliar_NMLogic().setConnexion(this.estadocivilLogic.getConnexion());

					cargafamiliar_nmBeanSwingJInternalFrame.setestadocivilsForeignKey(estadocivils);
					cargafamiliar_nmBeanSwingJInternalFrame.setestadocivilForeignKey(estadocivil);
					cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
					cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setlidEstadoCivilActual(estadocivil.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargafamiliar_nmBeanSwingJInternalFrame.cargarCombosForeignKeyCargaFamiliar_NM(cargafamiliar_nmBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargafamiliar_nmBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoCivil(true);
					cargafamiliar_nmBeanSwingJInternalFrame.setid_estado_civilFK_IdEstadoCivil(estadocivil.getId());

					if(!this.conCargarFormDetalle) {
						cargafamiliar_nmBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargafamiliar_nmBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoCivilForeignKey(estadocivil,1,false,true,true);
					cargafamiliar_nmBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargafamiliar_nmBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoCivil");
					cargafamiliar_nmBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoCivil");
					cargafamiliar_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar_NM(true);
					cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargaFamiliar_NM("n",cargafamiliar_nmBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargafamiliar_nmBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargafamiliar_nmBeanSwingJInternalFrame.setAutoscrolls(true);
					cargafamiliar_nmBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("relacionado");
					} else {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("no_relacionado");
					}

					cargafamiliar_nmBeanSwingJInternalFrame.getjButtonRecargarInformacionCargaFamiliar_NM().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSubClienteBeanSwingJInternalFrame(List<EstadoCivil> estadocivils,EstadoCivil estadocivil,SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subclienteBeanSwingJInternalFrame.getSubClienteLogic().setConnexion(this.estadocivilLogic.getConnexion());

					subclienteBeanSwingJInternalFrame.setestadocivilsForeignKey(estadocivils);
					subclienteBeanSwingJInternalFrame.setestadocivilForeignKey(estadocivil);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setlidEstadoCivilActual(estadocivil.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					subclienteBeanSwingJInternalFrame.cargarCombosForeignKeySubCliente(subclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					subclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoCivil(true);
					subclienteBeanSwingJInternalFrame.setid_estado_civilFK_IdEstadoCivil(estadocivil.getId());

					if(!this.conCargarFormDetalle) {
						subclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					subclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoCivilForeignKey(estadocivil,1,false,true,true);
					subclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoCivil");
					subclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoCivil");
					subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(true);
					subclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSubCliente("n",subclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, subclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					subclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					subclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("relacionado");
					} else {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");
					}

					subclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionSubCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoBeanSwingJInternalFrame(List<EstadoCivil> estadocivils,EstadoCivil estadocivil,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.estadocivilLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.setestadocivilsForeignKey(estadocivils);
					empleadoBeanSwingJInternalFrame.setestadocivilForeignKey(estadocivil);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidEstadoCivilActual(estadocivil.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoCivil(true);
					empleadoBeanSwingJInternalFrame.setid_estado_civilFK_IdEstadoCivil(estadocivil.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoCivilForeignKey(estadocivil,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoCivil");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoCivil");
					empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(true);
					empleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleado("n",empleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("relacionado");
					} else {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");
					}

					empleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroCarteraDefectoBeanSwingJInternalFrame(List<EstadoCivil> estadocivils,EstadoCivil estadocivil,ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocarteradefectoBeanSwingJInternalFrame.getParametroCarteraDefectoLogic().setConnexion(this.estadocivilLogic.getConnexion());

					parametrocarteradefectoBeanSwingJInternalFrame.setestadocivilsForeignKey(estadocivils);
					parametrocarteradefectoBeanSwingJInternalFrame.setestadocivilForeignKey(estadocivil);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setlidEstadoCivilActual(estadocivil.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocarteradefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCarteraDefecto(parametrocarteradefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoCivil(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setid_estado_civilFK_IdEstadoCivil(estadocivil.getId());

					if(!this.conCargarFormDetalle) {
						parametrocarteradefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocarteradefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoCivilForeignKey(estadocivil,1,false,true,true);
					parametrocarteradefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocarteradefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoCivil");
					parametrocarteradefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoCivil");
					parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(true);
					parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCarteraDefecto("n",parametrocarteradefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocarteradefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocarteradefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("relacionado");
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");
					}

					parametrocarteradefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCarteraDefecto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCargaFamiliarBeanSwingJInternalFrame(List<EstadoCivil> estadocivils,EstadoCivil estadocivil,CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargafamiliarBeanSwingJInternalFrame=new CargaFamiliarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargafamiliarBeanSwingJInternalFrame.getCargaFamiliarLogic().setConnexion(this.estadocivilLogic.getConnexion());

					cargafamiliarBeanSwingJInternalFrame.setestadocivilsForeignKey(estadocivils);
					cargafamiliarBeanSwingJInternalFrame.setestadocivilForeignKey(estadocivil);
					cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
					cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setlidEstadoCivilActual(estadocivil.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargafamiliarBeanSwingJInternalFrame.cargarCombosForeignKeyCargaFamiliar(cargafamiliarBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargafamiliarBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoCivil(true);
					cargafamiliarBeanSwingJInternalFrame.setid_estado_civilFK_IdEstadoCivil(estadocivil.getId());

					if(!this.conCargarFormDetalle) {
						cargafamiliarBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargafamiliarBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoCivilForeignKey(estadocivil,1,false,true,true);
					cargafamiliarBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargafamiliarBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoCivil");
					cargafamiliarBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoCivil");
					cargafamiliarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar(true);
					cargafamiliarBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargaFamiliar("n",cargafamiliarBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargafamiliarBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargafamiliarBeanSwingJInternalFrame.setAutoscrolls(true);
					cargafamiliarBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("relacionado");
					} else {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("no_relacionado");
					}

					cargafamiliarBeanSwingJInternalFrame.getjButtonRecargarInformacionCargaFamiliar().setVisible(false);

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
