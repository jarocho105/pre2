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
import com.bydan.erp.nomina.util.ImpuestoRentaConstantesFunciones;

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
public class ImpuestoRentaDetalleFormJInternalFrame extends ImpuestoRentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleImpuestoRenta;
	
	protected JMenuBar jmenuBarDetalleImpuestoRenta;
	
	protected JMenu jmenuDetalleImpuestoRenta;
	protected JMenu jmenuDetalleArchivoImpuestoRenta;
	protected JMenu jmenuDetalleAccionesImpuestoRenta;
	protected JMenu jmenuDetalleDatosImpuestoRenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutImpuestoRenta;	
	protected GridBagConstraints gridBagConstraintsImpuestoRenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ImpuestoRentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleImpuestoRenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ImpuestoRentaSessionBean impuestorentaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ImpuestoRentaLogic impuestorentaLogic;
	
	public JScrollPane jScrollPanelDatosImpuestoRenta;
	public JScrollPane jScrollPanelDatosEdicionImpuestoRenta;
	public JScrollPane jScrollPanelDatosGeneralImpuestoRenta;
	
	protected JPanel jPanelCamposImpuestoRenta;    
	protected JPanel jPanelCamposOcultosImpuestoRenta;    	
	protected JPanel jPanelAccionesImpuestoRenta;
	protected JPanel jPanelAccionesFormularioImpuestoRenta;
    
	
	
	protected Integer iXPanelCamposImpuestoRenta=0;
	protected Integer iYPanelCamposImpuestoRenta=0;
	
	protected Integer iXPanelCamposOcultosImpuestoRenta=0;
	protected Integer iYPanelCamposOcultosImpuestoRenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoImpuestoRenta;
	public JButton jButtonModificarImpuestoRenta;
	public JButton jButtonActualizarImpuestoRenta;
    public JButton jButtonEliminarImpuestoRenta;
	public JButton jButtonCancelarImpuestoRenta;
    public JButton jButtonGuardarCambiosImpuestoRenta;
	public JButton jButtonGuardarCambiosTablaImpuestoRenta;
	protected JButton jButtonCerrarImpuestoRenta;
	
	
	protected JButton jButtonProcesarInformacionImpuestoRenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoImpuestoRenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarImpuestoRenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeImpuestoRenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarImpuestoRenta;
	protected JButton jButtonModificarToolBarImpuestoRenta;
	protected JButton jButtonActualizarToolBarImpuestoRenta;
    protected JButton jButtonEliminarToolBarImpuestoRenta;
	protected JButton jButtonCancelarToolBarImpuestoRenta;
    protected JButton jButtonGuardarCambiosToolBarImpuestoRenta;
	protected JButton jButtonGuardarCambiosTablaToolBarImpuestoRenta;
	protected JButton jButtonMostrarOcultarTablaToolBarImpuestoRenta;
	protected JButton jButtonCerrarToolBarImpuestoRenta;
	
	protected JButton jButtonProcesarInformacionToolBarImpuestoRenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoImpuestoRenta;
	protected JMenuItem jMenuItemModificarImpuestoRenta;
	protected JMenuItem jMenuItemActualizarImpuestoRenta;
    protected JMenuItem jMenuItemEliminarImpuestoRenta;
	protected JMenuItem jMenuItemCancelarImpuestoRenta;
    protected JMenuItem jMenuItemGuardarCambiosImpuestoRenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaImpuestoRenta;
	protected JMenuItem jMenuItemCerrarImpuestoRenta;
	protected JMenuItem jMenuItemDetalleCerrarImpuestoRenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarImpuestoRenta;
	
	protected JMenuItem jMenuItemProcesarInformacionImpuestoRenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosImpuestoRenta;
	protected JMenuItem jMenuItemMostrarOcultarImpuestoRenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesImpuestoRenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesImpuestoRenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioImpuestoRenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidImpuestoRenta;
	public JLabel jLabelIdImpuestoRenta;
	public JLabel jLabelidImpuestoRenta;
	public JButton jButtonidImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPaneldesdeImpuestoRenta;
	public JLabel jLabeldesdeImpuestoRenta;
	public JTextField jTextFielddesdeImpuestoRenta;
	public JButton jButtondesdeImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelhastaImpuestoRenta;
	public JLabel jLabelhastaImpuestoRenta;
	public JTextField jTextFieldhastaImpuestoRenta;
	public JButton jButtonhastaImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelimpuestoImpuestoRenta;
	public JLabel jLabelimpuestoImpuestoRenta;
	public JTextField jTextFieldimpuestoImpuestoRenta;
	public JButton jButtonimpuestoImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeImpuestoRenta;
	public JLabel jLabelporcentajeImpuestoRenta;
	public JTextField jTextFieldporcentajeImpuestoRenta;
	public JButton jButtonporcentajeImpuestoRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaImpuestoRenta;
	public JLabel jLabelid_empresaImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaImpuestoRenta;
	public JButton jButtonid_empresaImpuestoRenta= new JButtonMe();
	public JButton jButtonid_empresaImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaImpuestoRentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesImpuestoRenta;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ImpuestoRentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposImpuestoRenta=new JPanel();
				this.jPanelAccionesFormularioImpuestoRenta=new JPanel();
				this.jmenuBarDetalleImpuestoRenta=new JMenuBar();
				this.jTtoolBarDetalleImpuestoRenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoRentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ImpuestoRentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoRentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoRentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoRentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarImpuestoRenta() {
		return this.jButtonActualizarToolBarImpuestoRenta;
	}
	
	public JButton getjButtonEliminarToolBarImpuestoRenta() {
		return this.jButtonEliminarToolBarImpuestoRenta;
	}
	
	public JButton getjButtonCancelarToolBarImpuestoRenta() {
		return this.jButtonCancelarToolBarImpuestoRenta;
	}		
	
	public JButton getjButtonProcesarInformacionImpuestoRenta() {
		return this.jButtonProcesarInformacionImpuestoRenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionImpuestoRenta)	{
		this.jButtonProcesarInformacionImpuestoRenta = jButtonProcesarInformacionImpuestoRenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesImpuestoRenta() {
		return this.jComboBoxTiposAccionesImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesImpuestoRenta(
			JComboBox jComboBoxTiposRelacionesImpuestoRenta) {
		this.jComboBoxTiposRelacionesImpuestoRenta = jComboBoxTiposRelacionesImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesImpuestoRenta(
			JComboBox jComboBoxTiposAccionesImpuestoRenta) {
		this.jComboBoxTiposAccionesImpuestoRenta = jComboBoxTiposAccionesImpuestoRenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioImpuestoRenta() {
		return this.jComboBoxTiposAccionesFormularioImpuestoRenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioImpuestoRenta(
			JComboBox jComboBoxTiposAccionesFormularioImpuestoRenta) {
		this.jComboBoxTiposAccionesFormularioImpuestoRenta = jComboBoxTiposAccionesFormularioImpuestoRenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.impuestorentaSessionBean=new ImpuestoRentaSessionBean();
		
		this.impuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.impuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.impuestorentaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ImpuestoRentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Impuesto Renta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
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
	
		ImpuestoRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleImpuestoRenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarImpuestoRenta=new JButtonMe();
				this.jButtonModificarToolBarImpuestoRenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarImpuestoRenta,this.jTtoolBarDetalleImpuestoRenta,
							"actualizar","actualizar","Actualizar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarImpuestoRenta,this.jTtoolBarDetalleImpuestoRenta,
							"eliminar","eliminar","Eliminar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarImpuestoRenta,this.jTtoolBarDetalleImpuestoRenta,
							"cancelar","cancelar","Cancelar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarImpuestoRenta,this.jTtoolBarDetalleImpuestoRenta,
							"guardarcambios","guardarcambios","Guardar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleImpuestoRenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleImpuestoRenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoImpuestoRenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesImpuestoRenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosImpuestoRenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoImpuestoRenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoImpuestoRenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoImpuestoRenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarImpuestoRenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarImpuestoRenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarImpuestoRenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarImpuestoRenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarImpuestoRenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarImpuestoRenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarImpuestoRenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarImpuestoRenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarImpuestoRenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarImpuestoRenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarImpuestoRenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarImpuestoRenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosImpuestoRenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosImpuestoRenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosImpuestoRenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarImpuestoRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarImpuestoRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarImpuestoRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarImpuestoRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarImpuestoRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarImpuestoRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoImpuestoRenta.add(this.jMenuItemDetalleCerrarImpuestoRenta);
		
		this.jmenuDetalleAccionesImpuestoRenta.add(this.jMenuItemActualizarImpuestoRenta);
		this.jmenuDetalleAccionesImpuestoRenta.add(this.jMenuItemEliminarImpuestoRenta);
		this.jmenuDetalleAccionesImpuestoRenta.add(this.jMenuItemCancelarImpuestoRenta);		
		
		//this.jmenuDetalleDatosImpuestoRenta.add(this.jMenuItemDetalleAbrirOrderByImpuestoRenta);				
		this.jmenuDetalleDatosImpuestoRenta.add(this.jMenuItemDetalleMostarOcultarImpuestoRenta);				
				
		//this.jmenuDetalleAccionesImpuestoRenta.add(this.jMenuItemGuardarCambiosImpuestoRenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleImpuestoRenta.add(this.jmenuDetalleArchivoImpuestoRenta);		
		this.jmenuBarDetalleImpuestoRenta.add(this.jmenuDetalleAccionesImpuestoRenta);		
		this.jmenuBarDetalleImpuestoRenta.add(this.jmenuDetalleDatosImpuestoRenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleImpuestoRenta);				
	}
	
	
	public void inicializarElementosCamposImpuestoRenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdImpuestoRenta = new JLabelMe();
		jLabelIdImpuestoRenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidImpuestoRenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidImpuestoRenta.setToolTipText(ImpuestoRentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutImpuestoRenta= new GridBagLayout();

		this.jPanelidImpuestoRenta.setLayout(this.gridaBagLayoutImpuestoRenta);

		jLabelidImpuestoRenta = new JLabel();
		jLabelidImpuestoRenta.setText("Id");

		jLabelidImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldesdeImpuestoRenta = new JLabelMe();
		this.jLabeldesdeImpuestoRenta.setText(""+ImpuestoRentaConstantesFunciones.LABEL_DESDE+" : *");
		this.jLabeldesdeImpuestoRenta.setToolTipText("Desde");
		this.jLabeldesdeImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldesdeImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldesdeImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldesdeImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldesdeImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldesdeImpuestoRenta.setToolTipText(ImpuestoRentaConstantesFunciones.LABEL_DESDE);
		this.gridaBagLayoutImpuestoRenta = new GridBagLayout();
		this.jPaneldesdeImpuestoRenta.setLayout(this.gridaBagLayoutImpuestoRenta);


		jTextFielddesdeImpuestoRenta= new JTextFieldMe();
		jTextFielddesdeImpuestoRenta.setEnabled(false);
		jTextFielddesdeImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddesdeImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddesdeImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddesdeImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddesdeImpuestoRenta.setText("0.0");

		this.jButtondesdeImpuestoRentaBusqueda= new JButtonMe();
		this.jButtondesdeImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondesdeImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondesdeImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondesdeImpuestoRentaBusqueda.setText("U");
		this.jButtondesdeImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondesdeImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondesdeImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddesdeImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddesdeImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"desdeImpuestoRentaBusqueda"));

		if(this.impuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondesdeImpuestoRentaBusqueda.setVisible(false);		}


					
		this.jLabelhastaImpuestoRenta = new JLabelMe();
		this.jLabelhastaImpuestoRenta.setText(""+ImpuestoRentaConstantesFunciones.LABEL_HASTA+" : *");
		this.jLabelhastaImpuestoRenta.setToolTipText("Hasta");
		this.jLabelhastaImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhastaImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhastaImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhastaImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhastaImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhastaImpuestoRenta.setToolTipText(ImpuestoRentaConstantesFunciones.LABEL_HASTA);
		this.gridaBagLayoutImpuestoRenta = new GridBagLayout();
		this.jPanelhastaImpuestoRenta.setLayout(this.gridaBagLayoutImpuestoRenta);


		jTextFieldhastaImpuestoRenta= new JTextFieldMe();
		jTextFieldhastaImpuestoRenta.setEnabled(false);
		jTextFieldhastaImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhastaImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhastaImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhastaImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhastaImpuestoRenta.setText("0.0");

		this.jButtonhastaImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonhastaImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhastaImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhastaImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhastaImpuestoRentaBusqueda.setText("U");
		this.jButtonhastaImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhastaImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhastaImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhastaImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhastaImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hastaImpuestoRentaBusqueda"));

		if(this.impuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhastaImpuestoRentaBusqueda.setVisible(false);		}


					
		this.jLabelimpuestoImpuestoRenta = new JLabelMe();
		this.jLabelimpuestoImpuestoRenta.setText(""+ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO+" : *");
		this.jLabelimpuestoImpuestoRenta.setToolTipText("Impuesto");
		this.jLabelimpuestoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuestoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuestoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuestoImpuestoRenta.setToolTipText(ImpuestoRentaConstantesFunciones.LABEL_IMPUESTO);
		this.gridaBagLayoutImpuestoRenta = new GridBagLayout();
		this.jPanelimpuestoImpuestoRenta.setLayout(this.gridaBagLayoutImpuestoRenta);


		jTextFieldimpuestoImpuestoRenta= new JTextFieldMe();
		jTextFieldimpuestoImpuestoRenta.setEnabled(false);
		jTextFieldimpuestoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuestoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuestoImpuestoRenta.setText("0.0");

		this.jButtonimpuestoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonimpuestoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuestoImpuestoRentaBusqueda.setText("U");
		this.jButtonimpuestoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuestoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuestoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuestoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuestoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuestoImpuestoRentaBusqueda"));

		if(this.impuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuestoImpuestoRentaBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeImpuestoRenta = new JLabelMe();
		this.jLabelporcentajeImpuestoRenta.setText(""+ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeImpuestoRenta.setToolTipText("Porcentaje");
		this.jLabelporcentajeImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeImpuestoRenta.setToolTipText(ImpuestoRentaConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutImpuestoRenta = new GridBagLayout();
		this.jPanelporcentajeImpuestoRenta.setLayout(this.gridaBagLayoutImpuestoRenta);


		jTextFieldporcentajeImpuestoRenta= new JTextFieldMe();
		jTextFieldporcentajeImpuestoRenta.setEnabled(false);
		jTextFieldporcentajeImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeImpuestoRenta.setText("0.0");

		this.jButtonporcentajeImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonporcentajeImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeImpuestoRentaBusqueda.setText("U");
		this.jButtonporcentajeImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeImpuestoRentaBusqueda"));

		if(this.impuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeImpuestoRentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysImpuestoRenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaImpuestoRenta = new JLabelMe();
		this.jLabelid_empresaImpuestoRenta.setText(""+ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaImpuestoRenta.setToolTipText("Empresa");
		this.jLabelid_empresaImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaImpuestoRenta.setToolTipText(ImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutImpuestoRenta = new GridBagLayout();
		this.jPanelid_empresaImpuestoRenta.setLayout(this.gridaBagLayoutImpuestoRenta);


		jComboBoxid_empresaImpuestoRenta= new JComboBoxMe();
		jComboBoxid_empresaImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaImpuestoRenta.setEnabled(false);

		this.jButtonid_empresaImpuestoRenta= new JButtonMe();
		this.jButtonid_empresaImpuestoRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaImpuestoRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaImpuestoRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaImpuestoRenta.setText("Buscar");
		this.jButtonid_empresaImpuestoRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaImpuestoRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaImpuestoRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaImpuestoRenta"));

		this.jButtonid_empresaImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonid_empresaImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaImpuestoRentaBusqueda.setText("U");
		this.jButtonid_empresaImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaImpuestoRentaBusqueda"));

		if(this.impuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaImpuestoRentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaImpuestoRentaUpdate= new JButtonMe();
		this.jButtonid_empresaImpuestoRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaImpuestoRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaImpuestoRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaImpuestoRentaUpdate.setText("U");
		this.jButtonid_empresaImpuestoRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaImpuestoRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaImpuestoRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaImpuestoRentaUpdate"));



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
		//this.jInternalFrameDetalleImpuestoRenta = new ImpuestoRentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Impuesto Renta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutImpuestoRenta= new GridBagLayout();
		

		
		String sToolTipImpuestoRenta="";
		sToolTipImpuestoRenta=ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipImpuestoRenta+="(Nomina.ImpuestoRenta)";
		}
		
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipImpuestoRenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoImpuestoRenta = new JButtonMe();
		this.jButtonModificarImpuestoRenta = new JButtonMe();
        this.jButtonActualizarImpuestoRenta = new JButtonMe();
        this.jButtonEliminarImpuestoRenta = new JButtonMe();
        this.jButtonCancelarImpuestoRenta = new JButtonMe();
        this.jButtonGuardarCambiosImpuestoRenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaImpuestoRenta = new JButtonMe();
		this.jButtonCerrarImpuestoRenta = new JButtonMe();
		
		this.jScrollPanelDatosImpuestoRenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionImpuestoRenta = new JScrollPane();
		this.jScrollPanelDatosGeneralImpuestoRenta = new JScrollPane();
				
		
		
		this.jPanelCamposImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Impuesto Renta";
		
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Rentas" + this.sPath));
		} else {
			this.jScrollPanelDatosImpuestoRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposImpuestoRenta.setName("jPanelCamposImpuestoRenta"); 

		this.jPanelCamposOcultosImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosImpuestoRenta.setName("jPanelCamposOcultosImpuestoRenta"); 

        this.jPanelAccionesImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesImpuestoRenta.setToolTipText("Acciones");
        this.jPanelAccionesImpuestoRenta.setName("Acciones"); 

		this.jPanelAccionesFormularioImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioImpuestoRenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioImpuestoRenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoImpuestoRenta.setText("Nuevo");
		this.jButtonModificarImpuestoRenta.setText("Editar");
        this.jButtonActualizarImpuestoRenta.setText("Actualizar");
        this.jButtonEliminarImpuestoRenta.setText("Eliminar");
        this.jButtonCancelarImpuestoRenta.setText("Cancelar");
        this.jButtonGuardarCambiosImpuestoRenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaImpuestoRenta.setText("Guardar");
		this.jButtonCerrarImpuestoRenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoImpuestoRenta,"nuevo_button","Nuevo",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarImpuestoRenta,"modificar_button","Editar",this.impuestorentaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarImpuestoRenta,"actualizar_button","Actualizar",this.impuestorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarImpuestoRenta,"eliminar_button","Eliminar",this.impuestorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarImpuestoRenta,"cancelar_button","Cancelar",this.impuestorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosImpuestoRenta,"guardarcambios_button","Guardar",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaImpuestoRenta,"guardarcambiostabla_button","Guardar",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImpuestoRenta,"cerrar_button","Salir",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoImpuestoRenta.setToolTipText("Nuevo"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarImpuestoRenta.setToolTipText("Editar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarImpuestoRenta.setToolTipText("Actualizar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarImpuestoRenta.setToolTipText("Eliminar)"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarImpuestoRenta.setToolTipText("Cancelar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosImpuestoRenta.setToolTipText("Guardar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaImpuestoRenta.setToolTipText("Guardar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarImpuestoRenta.setToolTipText("Salir"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoImpuestoRenta";
		inputMap = this.jButtonNuevoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoImpuestoRenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarImpuestoRenta";
		inputMap = this.jButtonActualizarImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarImpuestoRenta"));
		
		//ELIMINAR
		sMapKey = "EliminarImpuestoRenta";
		inputMap = this.jButtonEliminarImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarImpuestoRenta"));
		
		//CANCELAR	
		sMapKey = "CancelarImpuestoRenta";
		inputMap = this.jButtonCancelarImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarImpuestoRenta"));
		
		//CERRAR		
		sMapKey = "CerrarImpuestoRenta";
		inputMap = this.jButtonCerrarImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarImpuestoRenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaImpuestoRenta";
		inputMap = this.jButtonGuardarCambiosTablaImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaImpuestoRenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoImpuestoRenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoImpuestoRenta.setToolTipText("Nuevo ImpuestoRenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarImpuestoRenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarImpuestoRenta.setToolTipText("Sin Cerrar Ventana ImpuestoRenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeImpuestoRenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeImpuestoRenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesImpuestoRenta.setText("Accion");
		this.jComboBoxTiposAccionesImpuestoRenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioImpuestoRenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioImpuestoRenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesImpuestoRenta = new JLabelMe();
		
		this.jLabelAccionesImpuestoRenta.setText("Acciones");		
		this.jLabelAccionesImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposImpuestoRenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysImpuestoRenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesImpuestoRenta=new JTabbedPane();
		this.jTabbedPaneRelacionesImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioImpuestoRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioImpuestoRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioImpuestoRenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposImpuestoRenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosImpuestoRenta = new GridBagLayout();
		
		this.jPanelCamposImpuestoRenta.setLayout(gridaBagLayoutCamposImpuestoRenta);
		this.jPanelCamposOcultosImpuestoRenta.setLayout(gridaBagLayoutCamposOcultosImpuestoRenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 0;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidImpuestoRenta.add(jLabelIdImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 1;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidImpuestoRenta.add(jLabelidImpuestoRenta, this.gridBagConstraintsImpuestoRenta);


	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 0;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaImpuestoRenta.add(jLabelid_empresaImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = 0;
		this.gridBagConstraintsImpuestoRenta.gridx = 2;
		this.gridBagConstraintsImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaImpuestoRenta.add(jButtonid_empresaImpuestoRentaBusqueda, this.gridBagConstraintsImpuestoRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = 0;
		this.gridBagConstraintsImpuestoRenta.gridx = 3;
		this.gridBagConstraintsImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaImpuestoRenta.add(jButtonid_empresaImpuestoRentaUpdate, this.gridBagConstraintsImpuestoRenta);
	}

	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 1;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaImpuestoRenta.add(jComboBoxid_empresaImpuestoRenta, this.gridBagConstraintsImpuestoRenta);


	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 0;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldesdeImpuestoRenta.add(jLabeldesdeImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = 0;
		this.gridBagConstraintsImpuestoRenta.gridx = 2;
		this.gridBagConstraintsImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldesdeImpuestoRenta.add(jButtondesdeImpuestoRentaBusqueda, this.gridBagConstraintsImpuestoRenta);
	}

	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 1;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldesdeImpuestoRenta.add(jTextFielddesdeImpuestoRenta, this.gridBagConstraintsImpuestoRenta);


	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 0;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhastaImpuestoRenta.add(jLabelhastaImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = 0;
		this.gridBagConstraintsImpuestoRenta.gridx = 2;
		this.gridBagConstraintsImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelhastaImpuestoRenta.add(jButtonhastaImpuestoRentaBusqueda, this.gridBagConstraintsImpuestoRenta);
	}

	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 1;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhastaImpuestoRenta.add(jTextFieldhastaImpuestoRenta, this.gridBagConstraintsImpuestoRenta);


	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 0;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuestoImpuestoRenta.add(jLabelimpuestoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = 0;
		this.gridBagConstraintsImpuestoRenta.gridx = 2;
		this.gridBagConstraintsImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuestoImpuestoRenta.add(jButtonimpuestoImpuestoRentaBusqueda, this.gridBagConstraintsImpuestoRenta);
	}

	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 1;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuestoImpuestoRenta.add(jTextFieldimpuestoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);


	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 0;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeImpuestoRenta.add(jLabelporcentajeImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = 0;
		this.gridBagConstraintsImpuestoRenta.gridx = 2;
		this.gridBagConstraintsImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeImpuestoRenta.add(jButtonporcentajeImpuestoRentaBusqueda, this.gridBagConstraintsImpuestoRenta);
	}

	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImpuestoRenta.gridy = 0;
	this.gridBagConstraintsImpuestoRenta.gridx = 1;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeImpuestoRenta.add(jTextFieldporcentajeImpuestoRenta, this.gridBagConstraintsImpuestoRenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImpuestoRenta.gridy = iYPanelCamposImpuestoRenta;
	this.gridBagConstraintsImpuestoRenta.gridx = iXPanelCamposImpuestoRenta++;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposImpuestoRenta.add(this.jPanelidImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(iXPanelCamposImpuestoRenta % 1==0) {
		iXPanelCamposImpuestoRenta=0;
		iYPanelCamposImpuestoRenta++;
	}
	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImpuestoRenta.gridy = iYPanelCamposImpuestoRenta;
	this.gridBagConstraintsImpuestoRenta.gridx = iXPanelCamposImpuestoRenta++;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposImpuestoRenta.add(this.jPaneldesdeImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(iXPanelCamposImpuestoRenta % 1==0) {
		iXPanelCamposImpuestoRenta=0;
		iYPanelCamposImpuestoRenta++;
	}
	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImpuestoRenta.gridy = iYPanelCamposImpuestoRenta;
	this.gridBagConstraintsImpuestoRenta.gridx = iXPanelCamposImpuestoRenta++;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposImpuestoRenta.add(this.jPanelhastaImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(iXPanelCamposImpuestoRenta % 1==0) {
		iXPanelCamposImpuestoRenta=0;
		iYPanelCamposImpuestoRenta++;
	}
	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImpuestoRenta.gridy = iYPanelCamposImpuestoRenta;
	this.gridBagConstraintsImpuestoRenta.gridx = iXPanelCamposImpuestoRenta++;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposImpuestoRenta.add(this.jPanelimpuestoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(iXPanelCamposImpuestoRenta % 1==0) {
		iXPanelCamposImpuestoRenta=0;
		iYPanelCamposImpuestoRenta++;
	}
	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImpuestoRenta.gridy = iYPanelCamposImpuestoRenta;
	this.gridBagConstraintsImpuestoRenta.gridx = iXPanelCamposImpuestoRenta++;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposImpuestoRenta.add(this.jPanelporcentajeImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(iXPanelCamposImpuestoRenta % 1==0) {
		iXPanelCamposImpuestoRenta=0;
		iYPanelCamposImpuestoRenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImpuestoRenta.gridy = iYPanelCamposOcultosImpuestoRenta;
	this.gridBagConstraintsImpuestoRenta.gridx = iXPanelCamposOcultosImpuestoRenta++;
	this.gridBagConstraintsImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosImpuestoRenta.add(this.jPanelid_empresaImpuestoRenta, this.gridBagConstraintsImpuestoRenta);



	if(iXPanelCamposOcultosImpuestoRenta % 1==0) {
		iXPanelCamposOcultosImpuestoRenta=0;
		iYPanelCamposOcultosImpuestoRenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesImpuestoRenta= new GridBagLayout();
		this.jPanelAccionesImpuestoRenta.setLayout(gridaBagLayoutAccionesImpuestoRenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioImpuestoRenta= new GridBagLayout();
		this.jPanelAccionesFormularioImpuestoRenta.setLayout(gridaBagLayoutAccionesFormularioImpuestoRenta);
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsImpuestoRenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioImpuestoRenta.add(this.jComboBoxTiposAccionesFormularioImpuestoRenta, this.gridBagConstraintsImpuestoRenta);

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsImpuestoRenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioImpuestoRenta.add(this.jCheckBoxPostAccionNuevoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.impuestorentaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioImpuestoRenta.add(this.jCheckBoxPostAccionSinCerrarImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.impuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioImpuestoRenta.add(this.jCheckBoxPostAccionSinMensajeImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = 0;
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesImpuestoRenta.add(this.jButtonModificarImpuestoRenta, this.gridBagConstraintsImpuestoRenta);							

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = 0;
		this.gridBagConstraintsImpuestoRenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesImpuestoRenta.add(this.jButtonEliminarImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
			
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = 0;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesImpuestoRenta.add(this.jButtonActualizarImpuestoRenta, this.gridBagConstraintsImpuestoRenta);


		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = 0;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesImpuestoRenta.add(this.jButtonGuardarCambiosImpuestoRenta, this.gridBagConstraintsImpuestoRenta);	
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = 0;		
		this.gridBagConstraintsImpuestoRenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesImpuestoRenta.add(this.jButtonCancelarImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutImpuestoRenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutImpuestoRenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();						
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsImpuestoRenta.gridx = 0;		
			//this.gridBagConstraintsImpuestoRenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsImpuestoRenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsImpuestoRenta.gridx =0;
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsImpuestoRenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleImpuestoRenta = new ImpuestoRentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Impuesto Renta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Impuesto Renta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Impuesto Renta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ImpuestoRentaModel impuestorentaModel=new ImpuestoRentaModel(this);
			
			//SI USARA CLASE INTERNA
			//ImpuestoRentaModel.ImpuestoRentaFocusTraversalPolicy impuestorentaFocusTraversalPolicy = impuestorentaModel.new ImpuestoRentaFocusTraversalPolicy(this);
			
			//impuestorentaFocusTraversalPolicy.setimpuestorentaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(impuestorentaModel);
			
			
			this.jContentPaneDetalleImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleImpuestoRenta = new GridBagLayout();	
			this.jContentPaneDetalleImpuestoRenta.setLayout(gridaBagLayoutDetalleImpuestoRenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosImpuestoRenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
				this.gridBagConstraintsImpuestoRenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsImpuestoRenta.gridx = 0;
					
				
				this.jContentPaneDetalleImpuestoRenta.add(jTtoolBarDetalleImpuestoRenta, gridBagConstraintsImpuestoRenta);								
				
}
			
			this.jScrollPanelDatosEdicionImpuestoRenta=   new JScrollPane(jContentPaneDetalleImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralImpuestoRenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsImpuestoRenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsImpuestoRenta.gridx = 0;
	        
			this.jContentPaneDetalleImpuestoRenta.add(jPanelCamposImpuestoRenta, gridBagConstraintsImpuestoRenta);
			
			
			
			
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
						&& impuestorentaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.impuestorentaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsImpuestoRenta= new GridBagConstraints();
						this.gridBagConstraintsImpuestoRenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsImpuestoRenta.gridx = 0;
						this.jContentPaneDetalleImpuestoRenta.add(this.jTabbedPaneRelacionesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesImpuestoRenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosImpuestoRenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
					this.gridBagConstraintsImpuestoRenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsImpuestoRenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsImpuestoRenta.gridx = 0;
					
				
					this.jContentPaneDetalleImpuestoRenta.add(jPanelCamposOcultosImpuestoRenta, gridBagConstraintsImpuestoRenta);
				
					this.jPanelCamposOcultosImpuestoRenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsImpuestoRenta.gridx = 0;
	        this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleImpuestoRenta.add(this.jPanelAccionesFormularioImpuestoRenta, this.gridBagConstraintsImpuestoRenta);							
			
			
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
	        this.gridBagConstraintsImpuestoRenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsImpuestoRenta.gridx = 0;
	        
			
			this.jContentPaneDetalleImpuestoRenta.add(this.jPanelAccionesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionImpuestoRenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionImpuestoRenta=   new JScrollPane(this.jPanelCamposImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsImpuestoRenta.gridx = 0;
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsImpuestoRenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsImpuestoRenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioImpuestoRenta, this.gridBagConstraintsImpuestoRenta);			
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsImpuestoRenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			
			
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
			
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoRenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralImpuestoRenta;//jContentPane;
		
		return jScrollPanelDatosEdicionImpuestoRenta;
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
