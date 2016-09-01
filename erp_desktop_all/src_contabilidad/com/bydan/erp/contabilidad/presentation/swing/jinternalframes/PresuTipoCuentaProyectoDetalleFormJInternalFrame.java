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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.PresuTipoCuentaProyectoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class PresuTipoCuentaProyectoDetalleFormJInternalFrame extends PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresuTipoCuentaProyecto;
	
	protected JMenuBar jmenuBarDetallePresuTipoCuentaProyecto;
	
	protected JMenu jmenuDetallePresuTipoCuentaProyecto;
	protected JMenu jmenuDetalleArchivoPresuTipoCuentaProyecto;
	protected JMenu jmenuDetalleAccionesPresuTipoCuentaProyecto;
	protected JMenu jmenuDetalleDatosPresuTipoCuentaProyecto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuTipoCuentaProyecto;	
	protected GridBagConstraints gridBagConstraintsPresuTipoCuentaProyecto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional jInternalFrameDetallePresuTipoCuentaProyecto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PresuTipoCuentaProyectoSessionBean presutipocuentaproyectoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public PresuTipoCuentaProyectoLogic presutipocuentaproyectoLogic;
	
	public JScrollPane jScrollPanelDatosPresuTipoCuentaProyecto;
	public JScrollPane jScrollPanelDatosEdicionPresuTipoCuentaProyecto;
	public JScrollPane jScrollPanelDatosGeneralPresuTipoCuentaProyecto;
	
	protected JPanel jPanelCamposPresuTipoCuentaProyecto;    
	protected JPanel jPanelCamposOcultosPresuTipoCuentaProyecto;    	
	protected JPanel jPanelAccionesPresuTipoCuentaProyecto;
	protected JPanel jPanelAccionesFormularioPresuTipoCuentaProyecto;
    
	
	
	protected Integer iXPanelCamposPresuTipoCuentaProyecto=0;
	protected Integer iYPanelCamposPresuTipoCuentaProyecto=0;
	
	protected Integer iXPanelCamposOcultosPresuTipoCuentaProyecto=0;
	protected Integer iYPanelCamposOcultosPresuTipoCuentaProyecto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresuTipoCuentaProyecto;
	public JButton jButtonModificarPresuTipoCuentaProyecto;
	public JButton jButtonActualizarPresuTipoCuentaProyecto;
    public JButton jButtonEliminarPresuTipoCuentaProyecto;
	public JButton jButtonCancelarPresuTipoCuentaProyecto;
    public JButton jButtonGuardarCambiosPresuTipoCuentaProyecto;
	public JButton jButtonGuardarCambiosTablaPresuTipoCuentaProyecto;
	protected JButton jButtonCerrarPresuTipoCuentaProyecto;
	
	
	protected JButton jButtonProcesarInformacionPresuTipoCuentaProyecto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresuTipoCuentaProyecto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresuTipoCuentaProyecto;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresuTipoCuentaProyecto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonModificarToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonActualizarToolBarPresuTipoCuentaProyecto;
    protected JButton jButtonEliminarToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonCancelarToolBarPresuTipoCuentaProyecto;
    protected JButton jButtonGuardarCambiosToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonGuardarCambiosTablaToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonCerrarToolBarPresuTipoCuentaProyecto;
	
	protected JButton jButtonProcesarInformacionToolBarPresuTipoCuentaProyecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemModificarPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemActualizarPresuTipoCuentaProyecto;
    protected JMenuItem jMenuItemEliminarPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemCancelarPresuTipoCuentaProyecto;
    protected JMenuItem jMenuItemGuardarCambiosPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemCerrarPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemDetalleCerrarPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto;
	
	protected JMenuItem jMenuItemProcesarInformacionPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemMostrarOcultarPresuTipoCuentaProyecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuTipoCuentaProyecto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuTipoCuentaProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuTipoCuentaProyecto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresuTipoCuentaProyecto;
	public JLabel jLabelIdPresuTipoCuentaProyecto;
	public JLabel jLabelidPresuTipoCuentaProyecto;
	public JButton jButtonidPresuTipoCuentaProyectoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPresuTipoCuentaProyecto;
	public JLabel jLabelcodigoPresuTipoCuentaProyecto;
	public JTextField jTextFieldcodigoPresuTipoCuentaProyecto;
	public JButton jButtoncodigoPresuTipoCuentaProyectoBusqueda= new JButtonMe();

	public JPanel jPanelnombrePresuTipoCuentaProyecto;
	public JLabel jLabelnombrePresuTipoCuentaProyecto;
	public JTextArea jTextAreanombrePresuTipoCuentaProyecto;
	public JScrollPane jscrollPanenombrePresuTipoCuentaProyecto;
	public JButton jButtonnombrePresuTipoCuentaProyectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresuTipoCuentaProyecto;
	public JLabel jLabelid_empresaPresuTipoCuentaProyecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresuTipoCuentaProyecto;
	public JButton jButtonid_empresaPresuTipoCuentaProyecto= new JButtonMe();
	public JButton jButtonid_empresaPresuTipoCuentaProyectoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresuTipoCuentaProyectoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresuTipoCuentaProyecto;
	
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
	
	public PresuTipoCuentaProyectoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresuTipoCuentaProyecto=new JPanel();
				this.jPanelAccionesFormularioPresuTipoCuentaProyecto=new JPanel();
				this.jmenuBarDetallePresuTipoCuentaProyecto=new JMenuBar();
				this.jTtoolBarDetallePresuTipoCuentaProyecto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoCuentaProyectoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresuTipoCuentaProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresuTipoCuentaProyectoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresuTipoCuentaProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoCuentaProyectoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTipoCuentaProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoCuentaProyectoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTipoCuentaProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoCuentaProyectoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuTipoCuentaProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresuTipoCuentaProyecto() {
		return this.jButtonActualizarToolBarPresuTipoCuentaProyecto;
	}
	
	public JButton getjButtonEliminarToolBarPresuTipoCuentaProyecto() {
		return this.jButtonEliminarToolBarPresuTipoCuentaProyecto;
	}
	
	public JButton getjButtonCancelarToolBarPresuTipoCuentaProyecto() {
		return this.jButtonCancelarToolBarPresuTipoCuentaProyecto;
	}		
	
	public JButton getjButtonProcesarInformacionPresuTipoCuentaProyecto() {
		return this.jButtonProcesarInformacionPresuTipoCuentaProyecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuTipoCuentaProyecto)	{
		this.jButtonProcesarInformacionPresuTipoCuentaProyecto = jButtonProcesarInformacionPresuTipoCuentaProyecto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuTipoCuentaProyecto() {
		return this.jComboBoxTiposAccionesPresuTipoCuentaProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuTipoCuentaProyecto(
			JComboBox jComboBoxTiposRelacionesPresuTipoCuentaProyecto) {
		this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto = jComboBoxTiposRelacionesPresuTipoCuentaProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuTipoCuentaProyecto(
			JComboBox jComboBoxTiposAccionesPresuTipoCuentaProyecto) {
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto = jComboBoxTiposAccionesPresuTipoCuentaProyecto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto() {
		return this.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto(
			JComboBox jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto) {
		this.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto = jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean();
		
		this.presutipocuentaproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presutipocuentaproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuTipoCuentaProyectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuTipoCuentaProyectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuTipoCuentaProyectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuenta Proyecto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
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
	
		PresuTipoCuentaProyectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresuTipoCuentaProyecto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresuTipoCuentaProyecto=new JButtonMe();
				this.jButtonModificarToolBarPresuTipoCuentaProyecto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresuTipoCuentaProyecto,this.jTtoolBarDetallePresuTipoCuentaProyecto,
							"actualizar","actualizar","Actualizar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresuTipoCuentaProyecto,this.jTtoolBarDetallePresuTipoCuentaProyecto,
							"eliminar","eliminar","Eliminar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresuTipoCuentaProyecto,this.jTtoolBarDetallePresuTipoCuentaProyecto,
							"cancelar","cancelar","Cancelar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresuTipoCuentaProyecto,this.jTtoolBarDetallePresuTipoCuentaProyecto,
							"guardarcambios","guardarcambios","Guardar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresuTipoCuentaProyecto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresuTipoCuentaProyecto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresuTipoCuentaProyecto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresuTipoCuentaProyecto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresuTipoCuentaProyecto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuTipoCuentaProyecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuTipoCuentaProyecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuTipoCuentaProyecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresuTipoCuentaProyecto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresuTipoCuentaProyecto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresuTipoCuentaProyecto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresuTipoCuentaProyecto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresuTipoCuentaProyecto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresuTipoCuentaProyecto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresuTipoCuentaProyecto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresuTipoCuentaProyecto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresuTipoCuentaProyecto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresuTipoCuentaProyecto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresuTipoCuentaProyecto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresuTipoCuentaProyecto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuTipoCuentaProyecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuTipoCuentaProyecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuTipoCuentaProyecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresuTipoCuentaProyecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresuTipoCuentaProyecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresuTipoCuentaProyecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresuTipoCuentaProyecto.add(this.jMenuItemDetalleCerrarPresuTipoCuentaProyecto);
		
		this.jmenuDetalleAccionesPresuTipoCuentaProyecto.add(this.jMenuItemActualizarPresuTipoCuentaProyecto);
		this.jmenuDetalleAccionesPresuTipoCuentaProyecto.add(this.jMenuItemEliminarPresuTipoCuentaProyecto);
		this.jmenuDetalleAccionesPresuTipoCuentaProyecto.add(this.jMenuItemCancelarPresuTipoCuentaProyecto);		
		
		//this.jmenuDetalleDatosPresuTipoCuentaProyecto.add(this.jMenuItemDetalleAbrirOrderByPresuTipoCuentaProyecto);				
		this.jmenuDetalleDatosPresuTipoCuentaProyecto.add(this.jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto);				
				
		//this.jmenuDetalleAccionesPresuTipoCuentaProyecto.add(this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresuTipoCuentaProyecto.add(this.jmenuDetalleArchivoPresuTipoCuentaProyecto);		
		this.jmenuBarDetallePresuTipoCuentaProyecto.add(this.jmenuDetalleAccionesPresuTipoCuentaProyecto);		
		this.jmenuBarDetallePresuTipoCuentaProyecto.add(this.jmenuDetalleDatosPresuTipoCuentaProyecto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresuTipoCuentaProyecto);				
	}
	
	
	public void inicializarElementosCamposPresuTipoCuentaProyecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresuTipoCuentaProyecto = new JLabelMe();
		jLabelIdPresuTipoCuentaProyecto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresuTipoCuentaProyecto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresuTipoCuentaProyecto.setToolTipText(PresuTipoCuentaProyectoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresuTipoCuentaProyecto= new GridBagLayout();

		this.jPanelidPresuTipoCuentaProyecto.setLayout(this.gridaBagLayoutPresuTipoCuentaProyecto);

		jLabelidPresuTipoCuentaProyecto = new JLabel();
		jLabelidPresuTipoCuentaProyecto.setText("Id");

		jLabelidPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPresuTipoCuentaProyecto = new JLabelMe();
		this.jLabelcodigoPresuTipoCuentaProyecto.setText(""+PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPresuTipoCuentaProyecto.setToolTipText("Codigo");
		this.jLabelcodigoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPresuTipoCuentaProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPresuTipoCuentaProyecto.setToolTipText(PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPresuTipoCuentaProyecto = new GridBagLayout();
		this.jPanelcodigoPresuTipoCuentaProyecto.setLayout(this.gridaBagLayoutPresuTipoCuentaProyecto);


		jTextFieldcodigoPresuTipoCuentaProyecto= new JTextFieldMe();

		jTextFieldcodigoPresuTipoCuentaProyecto.setEnabled(false);
		jTextFieldcodigoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPresuTipoCuentaProyectoBusqueda= new JButtonMe();
		this.jButtoncodigoPresuTipoCuentaProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresuTipoCuentaProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresuTipoCuentaProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPresuTipoCuentaProyectoBusqueda.setText("U");
		this.jButtoncodigoPresuTipoCuentaProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPresuTipoCuentaProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPresuTipoCuentaProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPresuTipoCuentaProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPresuTipoCuentaProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPresuTipoCuentaProyectoBusqueda"));

		if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPresuTipoCuentaProyectoBusqueda.setVisible(false);		}


					
		this.jLabelnombrePresuTipoCuentaProyecto = new JLabelMe();
		this.jLabelnombrePresuTipoCuentaProyecto.setText(""+PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePresuTipoCuentaProyecto.setToolTipText("Nombre");
		this.jLabelnombrePresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePresuTipoCuentaProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePresuTipoCuentaProyecto.setToolTipText(PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPresuTipoCuentaProyecto = new GridBagLayout();
		this.jPanelnombrePresuTipoCuentaProyecto.setLayout(this.gridaBagLayoutPresuTipoCuentaProyecto);


		jTextAreanombrePresuTipoCuentaProyecto= new JTextAreaMe();
		jTextAreanombrePresuTipoCuentaProyecto.setEnabled(false);
		jTextAreanombrePresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuTipoCuentaProyecto.setLineWrap(true);
		jTextAreanombrePresuTipoCuentaProyecto.setWrapStyleWord(true);
		jTextAreanombrePresuTipoCuentaProyecto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePresuTipoCuentaProyecto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePresuTipoCuentaProyecto = new JScrollPane(jTextAreanombrePresuTipoCuentaProyecto);
		jscrollPanenombrePresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombrePresuTipoCuentaProyectoBusqueda= new JButtonMe();
		this.jButtonnombrePresuTipoCuentaProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresuTipoCuentaProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresuTipoCuentaProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePresuTipoCuentaProyectoBusqueda.setText("U");
		this.jButtonnombrePresuTipoCuentaProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePresuTipoCuentaProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePresuTipoCuentaProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePresuTipoCuentaProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePresuTipoCuentaProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePresuTipoCuentaProyectoBusqueda"));

		if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePresuTipoCuentaProyectoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresuTipoCuentaProyecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresuTipoCuentaProyecto = new JLabelMe();
		this.jLabelid_empresaPresuTipoCuentaProyecto.setText(""+PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresuTipoCuentaProyecto.setToolTipText("Empresa");
		this.jLabelid_empresaPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresuTipoCuentaProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresuTipoCuentaProyecto.setToolTipText(PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresuTipoCuentaProyecto = new GridBagLayout();
		this.jPanelid_empresaPresuTipoCuentaProyecto.setLayout(this.gridaBagLayoutPresuTipoCuentaProyecto);


		jComboBoxid_empresaPresuTipoCuentaProyecto= new JComboBoxMe();
		jComboBoxid_empresaPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresuTipoCuentaProyecto.setEnabled(false);

		this.jButtonid_empresaPresuTipoCuentaProyecto= new JButtonMe();
		this.jButtonid_empresaPresuTipoCuentaProyecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresuTipoCuentaProyecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresuTipoCuentaProyecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresuTipoCuentaProyecto.setText("Buscar");
		this.jButtonid_empresaPresuTipoCuentaProyecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresuTipoCuentaProyecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresuTipoCuentaProyecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresuTipoCuentaProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresuTipoCuentaProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresuTipoCuentaProyecto"));

		this.jButtonid_empresaPresuTipoCuentaProyectoBusqueda= new JButtonMe();
		this.jButtonid_empresaPresuTipoCuentaProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuTipoCuentaProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuTipoCuentaProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresuTipoCuentaProyectoBusqueda.setText("U");
		this.jButtonid_empresaPresuTipoCuentaProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresuTipoCuentaProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresuTipoCuentaProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresuTipoCuentaProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresuTipoCuentaProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresuTipoCuentaProyectoBusqueda"));

		if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresuTipoCuentaProyectoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresuTipoCuentaProyectoUpdate= new JButtonMe();
		this.jButtonid_empresaPresuTipoCuentaProyectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuTipoCuentaProyectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuTipoCuentaProyectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresuTipoCuentaProyectoUpdate.setText("U");
		this.jButtonid_empresaPresuTipoCuentaProyectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresuTipoCuentaProyectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresuTipoCuentaProyectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresuTipoCuentaProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresuTipoCuentaProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresuTipoCuentaProyectoUpdate"));



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
		//this.jInternalFrameDetallePresuTipoCuentaProyecto = new PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Cuenta Proyecto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuTipoCuentaProyecto= new GridBagLayout();
		

		
		String sToolTipPresuTipoCuentaProyecto="";
		sToolTipPresuTipoCuentaProyecto=PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuTipoCuentaProyecto+="(Contabilidad.PresuTipoCuentaProyecto)";
		}
		
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuTipoCuentaProyecto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonModificarPresuTipoCuentaProyecto = new JButtonMe();
        this.jButtonActualizarPresuTipoCuentaProyecto = new JButtonMe();
        this.jButtonEliminarPresuTipoCuentaProyecto = new JButtonMe();
        this.jButtonCancelarPresuTipoCuentaProyecto = new JButtonMe();
        this.jButtonGuardarCambiosPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonCerrarPresuTipoCuentaProyecto = new JButtonMe();
		
		this.jScrollPanelDatosPresuTipoCuentaProyecto = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto = new JScrollPane();
		this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto = new JScrollPane();
				
		
		
		this.jPanelCamposPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuenta Proyecto";
		
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Proyectos" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuTipoCuentaProyecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresuTipoCuentaProyecto.setName("jPanelCamposPresuTipoCuentaProyecto"); 

		this.jPanelCamposOcultosPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresuTipoCuentaProyecto.setName("jPanelCamposOcultosPresuTipoCuentaProyecto"); 

        this.jPanelAccionesPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuTipoCuentaProyecto.setToolTipText("Acciones");
        this.jPanelAccionesPresuTipoCuentaProyecto.setName("Acciones"); 

		this.jPanelAccionesFormularioPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresuTipoCuentaProyecto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresuTipoCuentaProyecto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresuTipoCuentaProyecto.setText("Nuevo");
		this.jButtonModificarPresuTipoCuentaProyecto.setText("Editar");
        this.jButtonActualizarPresuTipoCuentaProyecto.setText("Actualizar");
        this.jButtonEliminarPresuTipoCuentaProyecto.setText("Eliminar");
        this.jButtonCancelarPresuTipoCuentaProyecto.setText("Cancelar");
        this.jButtonGuardarCambiosPresuTipoCuentaProyecto.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.setText("Guardar");
		this.jButtonCerrarPresuTipoCuentaProyecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuTipoCuentaProyecto,"nuevo_button","Nuevo",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresuTipoCuentaProyecto,"modificar_button","Editar",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresuTipoCuentaProyecto,"actualizar_button","Actualizar",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresuTipoCuentaProyecto,"eliminar_button","Eliminar",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresuTipoCuentaProyecto,"cancelar_button","Cancelar",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresuTipoCuentaProyecto,"guardarcambios_button","Guardar",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto,"guardarcambiostabla_button","Guardar",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuTipoCuentaProyecto,"cerrar_button","Salir",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresuTipoCuentaProyecto.setToolTipText("Nuevo"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresuTipoCuentaProyecto.setToolTipText("Editar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresuTipoCuentaProyecto.setToolTipText("Actualizar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresuTipoCuentaProyecto.setToolTipText("Eliminar)"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresuTipoCuentaProyecto.setToolTipText("Cancelar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresuTipoCuentaProyecto.setToolTipText("Guardar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.setToolTipText("Guardar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuTipoCuentaProyecto.setToolTipText("Salir"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuTipoCuentaProyecto";
		inputMap = this.jButtonNuevoPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuTipoCuentaProyecto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresuTipoCuentaProyecto";
		inputMap = this.jButtonActualizarPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresuTipoCuentaProyecto"));
		
		//ELIMINAR
		sMapKey = "EliminarPresuTipoCuentaProyecto";
		inputMap = this.jButtonEliminarPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresuTipoCuentaProyecto"));
		
		//CANCELAR	
		sMapKey = "CancelarPresuTipoCuentaProyecto";
		inputMap = this.jButtonCancelarPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresuTipoCuentaProyecto"));
		
		//CERRAR		
		sMapKey = "CerrarPresuTipoCuentaProyecto";
		inputMap = this.jButtonCerrarPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuTipoCuentaProyecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuTipoCuentaProyecto";
		inputMap = this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuTipoCuentaProyecto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresuTipoCuentaProyecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresuTipoCuentaProyecto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresuTipoCuentaProyecto.setToolTipText("Nuevo PresuTipoCuentaProyecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresuTipoCuentaProyecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresuTipoCuentaProyecto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresuTipoCuentaProyecto.setToolTipText("Sin Cerrar Ventana PresuTipoCuentaProyecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresuTipoCuentaProyecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresuTipoCuentaProyecto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresuTipoCuentaProyecto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setText("Accion");
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresuTipoCuentaProyecto = new JLabelMe();
		
		this.jLabelAccionesPresuTipoCuentaProyecto.setText("Acciones");		
		this.jLabelAccionesPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresuTipoCuentaProyecto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresuTipoCuentaProyecto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresuTipoCuentaProyecto=new JTabbedPane();
		this.jTabbedPaneRelacionesPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresuTipoCuentaProyecto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresuTipoCuentaProyecto = new GridBagLayout();
		
		this.jPanelCamposPresuTipoCuentaProyecto.setLayout(gridaBagLayoutCamposPresuTipoCuentaProyecto);
		this.jPanelCamposOcultosPresuTipoCuentaProyecto.setLayout(gridaBagLayoutCamposOcultosPresuTipoCuentaProyecto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresuTipoCuentaProyecto.add(jLabelIdPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);



	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 1;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresuTipoCuentaProyecto.add(jLabelidPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);


	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresuTipoCuentaProyecto.add(jLabelid_empresaPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 2;
		this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresuTipoCuentaProyecto.add(jButtonid_empresaPresuTipoCuentaProyectoBusqueda, this.gridBagConstraintsPresuTipoCuentaProyecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 3;
		this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresuTipoCuentaProyecto.add(jButtonid_empresaPresuTipoCuentaProyectoUpdate, this.gridBagConstraintsPresuTipoCuentaProyecto);
	}

	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 1;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresuTipoCuentaProyecto.add(jComboBoxid_empresaPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);


	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPresuTipoCuentaProyecto.add(jLabelcodigoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 2;
		this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPresuTipoCuentaProyecto.add(jButtoncodigoPresuTipoCuentaProyectoBusqueda, this.gridBagConstraintsPresuTipoCuentaProyecto);
	}

	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 1;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPresuTipoCuentaProyecto.add(jTextFieldcodigoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);


	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePresuTipoCuentaProyecto.add(jLabelnombrePresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 2;
		this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePresuTipoCuentaProyecto.add(jButtonnombrePresuTipoCuentaProyectoBusqueda, this.gridBagConstraintsPresuTipoCuentaProyecto);
	}

	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 1;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePresuTipoCuentaProyecto.add(jscrollPanenombrePresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iYPanelCamposPresuTipoCuentaProyecto;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iXPanelCamposPresuTipoCuentaProyecto++;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTipoCuentaProyecto.add(this.jPanelidPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);



	if(iXPanelCamposPresuTipoCuentaProyecto % 1==0) {
		iXPanelCamposPresuTipoCuentaProyecto=0;
		iYPanelCamposPresuTipoCuentaProyecto++;
	}
	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iYPanelCamposPresuTipoCuentaProyecto;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iXPanelCamposPresuTipoCuentaProyecto++;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTipoCuentaProyecto.add(this.jPanelcodigoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);



	if(iXPanelCamposPresuTipoCuentaProyecto % 1==0) {
		iXPanelCamposPresuTipoCuentaProyecto=0;
		iYPanelCamposPresuTipoCuentaProyecto++;
	}
	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iYPanelCamposPresuTipoCuentaProyecto;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iXPanelCamposPresuTipoCuentaProyecto++;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTipoCuentaProyecto.add(this.jPanelnombrePresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);



	if(iXPanelCamposPresuTipoCuentaProyecto % 1==0) {
		iXPanelCamposPresuTipoCuentaProyecto=0;
		iYPanelCamposPresuTipoCuentaProyecto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iYPanelCamposOcultosPresuTipoCuentaProyecto;
	this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iXPanelCamposOcultosPresuTipoCuentaProyecto++;
	this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTipoCuentaProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresuTipoCuentaProyecto.add(this.jPanelid_empresaPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);



	if(iXPanelCamposOcultosPresuTipoCuentaProyecto % 1==0) {
		iXPanelCamposOcultosPresuTipoCuentaProyecto=0;
		iYPanelCamposOcultosPresuTipoCuentaProyecto++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresuTipoCuentaProyecto= new GridBagLayout();
		this.jPanelAccionesPresuTipoCuentaProyecto.setLayout(gridaBagLayoutAccionesPresuTipoCuentaProyecto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresuTipoCuentaProyecto= new GridBagLayout();
		this.jPanelAccionesFormularioPresuTipoCuentaProyecto.setLayout(gridaBagLayoutAccionesFormularioPresuTipoCuentaProyecto);
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuTipoCuentaProyecto.add(this.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);

		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuTipoCuentaProyecto.add(this.jCheckBoxPostAccionNuevoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuTipoCuentaProyecto.add(this.jCheckBoxPostAccionSinCerrarPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuTipoCuentaProyecto.add(this.jCheckBoxPostAccionSinMensajePresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresuTipoCuentaProyecto.add(this.jButtonModificarPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);							

		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresuTipoCuentaProyecto.add(this.jButtonEliminarPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
			
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuTipoCuentaProyecto.add(this.jButtonActualizarPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);


		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuTipoCuentaProyecto.add(this.jButtonGuardarCambiosPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);	
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresuTipoCuentaProyecto.add(this.jButtonCancelarPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuTipoCuentaProyecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuTipoCuentaProyecto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();						
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;		
			//this.gridBagConstraintsPresuTipoCuentaProyecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuTipoCuentaProyecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresuTipoCuentaProyectoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresuTipoCuentaProyecto = new PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Cuenta Proyecto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Cuenta Proyecto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuenta Proyecto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresuTipoCuentaProyectoModel presutipocuentaproyectoModel=new PresuTipoCuentaProyectoModel(this);
			
			//SI USARA CLASE INTERNA
			//PresuTipoCuentaProyectoModel.PresuTipoCuentaProyectoFocusTraversalPolicy presutipocuentaproyectoFocusTraversalPolicy = presutipocuentaproyectoModel.new PresuTipoCuentaProyectoFocusTraversalPolicy(this);
			
			//presutipocuentaproyectoFocusTraversalPolicy.setpresutipocuentaproyectoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presutipocuentaproyectoModel);
			
			
			this.jContentPaneDetallePresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresuTipoCuentaProyecto = new GridBagLayout();	
			this.jContentPaneDetallePresuTipoCuentaProyecto.setLayout(gridaBagLayoutDetallePresuTipoCuentaProyecto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuTipoCuentaProyecto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
				this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
					
				
				this.jContentPaneDetallePresuTipoCuentaProyecto.add(jTtoolBarDetallePresuTipoCuentaProyecto, gridBagConstraintsPresuTipoCuentaProyecto);								
				
}
			
			this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto=   new JScrollPane(jContentPaneDetallePresuTipoCuentaProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
	        
			this.jContentPaneDetallePresuTipoCuentaProyecto.add(jPanelCamposPresuTipoCuentaProyecto, gridBagConstraintsPresuTipoCuentaProyecto);
			
			
			
			
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
						&& presutipocuentaproyectoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresuTipoCuentaProyecto= new GridBagConstraints();
						this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
						this.jContentPaneDetallePresuTipoCuentaProyecto.add(this.jTabbedPaneRelacionesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresuTipoCuentaProyecto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
					this.gridBagConstraintsPresuTipoCuentaProyecto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
					
				
					this.jContentPaneDetallePresuTipoCuentaProyecto.add(jPanelCamposOcultosPresuTipoCuentaProyecto, gridBagConstraintsPresuTipoCuentaProyecto);
				
					this.jPanelCamposOcultosPresuTipoCuentaProyecto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
	        this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresuTipoCuentaProyecto.add(this.jPanelAccionesFormularioPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);							
			
			
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
	        this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
	        
			
			this.jContentPaneDetallePresuTipoCuentaProyecto.add(this.jPanelAccionesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresuTipoCuentaProyecto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto=   new JScrollPane(this.jPanelCamposPresuTipoCuentaProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresuTipoCuentaProyecto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);			
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			
			
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
			
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto;//jContentPane;
		
		return jScrollPanelDatosEdicionPresuTipoCuentaProyecto;
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
