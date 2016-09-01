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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

//import com.bydan.erp.cartera.util.SaldosVencidosProveedoresConstantesFunciones;
import com.bydan.erp.cartera.util.report.SaldosVencidosProveedoresParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.SaldosVencidosProveedoresParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.SaldosVencidosProveedoresBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

//import org.hibernate.collection.PersistentBag;

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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SaldosVencidosProveedoresBeanSwingJInternalFrame extends SaldosVencidosProveedoresJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SaldosVencidosProveedoresBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SaldosVencidosProveedores> saldosvencidosproveedoresValidator = new ClassValidator<SaldosVencidosProveedores>(SaldosVencidosProveedores.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SaldosVencidosProveedores saldosvencidosproveedores;	
	public SaldosVencidosProveedores saldosvencidosproveedoresAux;
	public SaldosVencidosProveedores saldosvencidosproveedoresAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SaldosVencidosProveedores saldosvencidosproveedoresTotales;
	public Long idSaldosVencidosProveedoresActual;
	public Long iIdNuevoSaldosVencidosProveedores=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboGrupoCliente="";

	public List<GrupoCliente> grupoclientesForeignKey;

	public List<GrupoCliente> getgrupoclientesForeignKey() {
		return grupoclientesForeignKey;
	}

	public void setgrupoclientesForeignKey(List<GrupoCliente> grupoclientesForeignKey) {
		this.grupoclientesForeignKey = grupoclientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public GrupoCliente grupoclienteForeignKey;

	public GrupoCliente getgrupoclienteForeignKey() {
		return grupoclienteForeignKey;
	}

	public void setgrupoclienteForeignKey(GrupoCliente grupoclienteForeignKey) {
		this.grupoclienteForeignKey = grupoclienteForeignKey;
	}

	public String sFinalQueryComboFactura="";

	public List<Factura> facturasForeignKey;

	public List<Factura> getfacturasForeignKey() {
		return facturasForeignKey;
	}

	public void setfacturasForeignKey(List<Factura> facturasForeignKey) {
		this.facturasForeignKey = facturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Factura facturaForeignKey;

	public Factura getfacturaForeignKey() {
		return facturaForeignKey;
	}

	public void setfacturaForeignKey(Factura facturaForeignKey) {
		this.facturaForeignKey = facturaForeignKey;
	}

	public String sFinalQueryComboMoneda="";

	public List<Moneda> monedasForeignKey;

	public List<Moneda> getmonedasForeignKey() {
		return monedasForeignKey;
	}

	public void setmonedasForeignKey(List<Moneda> monedasForeignKey) {
		this.monedasForeignKey = monedasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Moneda monedaForeignKey;

	public Moneda getmonedaForeignKey() {
		return monedaForeignKey;
	}

	public void setmonedaForeignKey(Moneda monedaForeignKey) {
		this.monedaForeignKey = monedaForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoSaldosVencidosProveedores;
	public Boolean isPermisoNuevoSaldosVencidosProveedores;
	public Boolean isPermisoActualizarSaldosVencidosProveedores;
	public Boolean isPermisoActualizarOriginalSaldosVencidosProveedores;
	public Boolean isPermisoEliminarSaldosVencidosProveedores;
	public Boolean isPermisoGuardarCambiosSaldosVencidosProveedores;
	public Boolean isPermisoConsultaSaldosVencidosProveedores;
	public Boolean isPermisoBusquedaSaldosVencidosProveedores;
	public Boolean isPermisoReporteSaldosVencidosProveedores;
	public Boolean isPermisoPaginacionMedioSaldosVencidosProveedores;
	public Boolean isPermisoPaginacionAltoSaldosVencidosProveedores;
	public Boolean isPermisoPaginacionTodoSaldosVencidosProveedores;
	public Boolean isPermisoCopiarSaldosVencidosProveedores;
	public Boolean isPermisoVerFormSaldosVencidosProveedores;
	public Boolean isPermisoDuplicarSaldosVencidosProveedores;
	public Boolean isPermisoOrdenSaldosVencidosProveedores;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public SaldosVencidosProveedoresParameterReturnGeneral saldosvencidosproveedoresReturnGeneral;
	public SaldosVencidosProveedoresParameterReturnGeneral saldosvencidosproveedoresParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSaldosVencidosProveedores=false;
	public Boolean esParaAccionDesdeFormularioSaldosVencidosProveedores=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SaldosVencidosProveedoresSessionBeanAdditional saldosvencidosproveedoresSessionBeanAdditional=null;
	
	public SaldosVencidosProveedoresSessionBeanAdditional getSaldosVencidosProveedoresSessionBeanAdditional() {
		return this.saldosvencidosproveedoresSessionBeanAdditional;
	}
	
	public void setSaldosVencidosProveedoresSessionBeanAdditional(SaldosVencidosProveedoresSessionBeanAdditional saldosvencidosproveedoresSessionBeanAdditional) {
		try {
			this.saldosvencidosproveedoresSessionBeanAdditional=saldosvencidosproveedoresSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional saldosvencidosproveedoresBeanSwingJInternalFrameAdditional=null;
	//public class SaldosVencidosProveedoresBeanSwingJInternalFrame
	
	public SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional getSaldosVencidosProveedoresBeanSwingJInternalFrameAdditional() {
		return this.saldosvencidosproveedoresBeanSwingJInternalFrameAdditional;
	}
	
	public void setSaldosVencidosProveedoresBeanSwingJInternalFrameAdditional(SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional saldosvencidosproveedoresBeanSwingJInternalFrameAdditional) {
		try {
			this.saldosvencidosproveedoresBeanSwingJInternalFrameAdditional=saldosvencidosproveedoresBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SaldosVencidosProveedoresLogic saldosvencidosproveedoresLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SaldosVencidosProveedores saldosvencidosproveedoresBean;
	public SaldosVencidosProveedoresConstantesFunciones saldosvencidosproveedoresConstantesFunciones;
	//public SaldosVencidosProveedoresParameterReturnGeneral saldosvencidosproveedoresReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public GrupoClienteLogic grupoclienteLogic;
	public FacturaLogic facturaLogic;
	public MonedaLogic monedaLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<SaldosVencidosProveedores> saldosvencidosproveedoress;	
	//public List<SaldosVencidosProveedores> saldosvencidosproveedoressEliminados;
	//public List<SaldosVencidosProveedores> saldosvencidosproveedoressAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSaldosVencidosProveedores=false;
	public Boolean isVisibilidadCeldaDuplicarSaldosVencidosProveedores=true;
	public Boolean isVisibilidadCeldaCopiarSaldosVencidosProveedores=true;
	public Boolean isVisibilidadCeldaVerFormSaldosVencidosProveedores=true;
	public Boolean isVisibilidadCeldaOrdenSaldosVencidosProveedores=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;
	public Boolean isVisibilidadCeldaModificarSaldosVencidosProveedores=false;
	public Boolean isVisibilidadCeldaActualizarSaldosVencidosProveedores=false;
	public Boolean isVisibilidadCeldaEliminarSaldosVencidosProveedores=false;
	public Boolean isVisibilidadCeldaCancelarSaldosVencidosProveedores=false;
	public Boolean isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=false;	
	
	
	public Boolean isVisibilidadBusquedaSaldosVencidosProveedores=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	public Boolean isVisibilidadFK_IdMoneda=false;
	
	public Long getiIdNuevoSaldosVencidosProveedores() {
		return this.iIdNuevoSaldosVencidosProveedores;
	}

	public void setiIdNuevoSaldosVencidosProveedores(Long iIdNuevoSaldosVencidosProveedores) {
		this.iIdNuevoSaldosVencidosProveedores = iIdNuevoSaldosVencidosProveedores;
	}
	
	public Long getidSaldosVencidosProveedoresActual() {
		return this.idSaldosVencidosProveedoresActual;
	}

	public void setidSaldosVencidosProveedoresActual(Long idSaldosVencidosProveedoresActual) {
		this.idSaldosVencidosProveedoresActual = idSaldosVencidosProveedoresActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SaldosVencidosProveedores getsaldosvencidosproveedores() {
		return this.saldosvencidosproveedores;
	}

	public void setsaldosvencidosproveedores(SaldosVencidosProveedores saldosvencidosproveedores) {
		this.saldosvencidosproveedores = saldosvencidosproveedores;
	}
	
	public SaldosVencidosProveedores getsaldosvencidosproveedoresAux() {
		return this.saldosvencidosproveedoresAux;
	}

	public void setsaldosvencidosproveedoresAux(SaldosVencidosProveedores saldosvencidosproveedoresAux) {
		this.saldosvencidosproveedoresAux = saldosvencidosproveedoresAux;
	}				
	
	public SaldosVencidosProveedores getsaldosvencidosproveedoresAnterior() {
		return this.saldosvencidosproveedoresAnterior;
	}

	public void setsaldosvencidosproveedoresAnterior(SaldosVencidosProveedores saldosvencidosproveedoresAnterior) {
		this.saldosvencidosproveedoresAnterior = saldosvencidosproveedoresAnterior;
	}	
	
	public SaldosVencidosProveedores getsaldosvencidosproveedoresTotales() {
		return this.saldosvencidosproveedoresTotales;
	}

	public void setsaldosvencidosproveedoresTotales(SaldosVencidosProveedores saldosvencidosproveedoresTotales) {
		this.saldosvencidosproveedoresTotales = saldosvencidosproveedoresTotales;
	}	
	
	public SaldosVencidosProveedores getsaldosvencidosproveedoresBean() {
		return this.saldosvencidosproveedoresBean;
	}

	public void setsaldosvencidosproveedoresBean(SaldosVencidosProveedores saldosvencidosproveedoresBean) {
		this.saldosvencidosproveedoresBean = saldosvencidosproveedoresBean;
	}	
	
	public SaldosVencidosProveedoresParameterReturnGeneral getsaldosvencidosproveedoresReturnGeneral() {
		return this.saldosvencidosproveedoresReturnGeneral;
	}

	public void setsaldosvencidosproveedoresReturnGeneral(SaldosVencidosProveedoresParameterReturnGeneral saldosvencidosproveedoresReturnGeneral) {
		this.saldosvencidosproveedoresReturnGeneral = saldosvencidosproveedoresReturnGeneral;
	}	
	
	
	public Long id_grupo_clienteBusquedaSaldosVencidosProveedores=-1L;

	public Long getid_grupo_clienteBusquedaSaldosVencidosProveedores() {
		return this.id_grupo_clienteBusquedaSaldosVencidosProveedores;
	}

	public void setid_grupo_clienteBusquedaSaldosVencidosProveedores(Long id_grupo_clienteBusquedaSaldosVencidosProveedores) {
		this.id_grupo_clienteBusquedaSaldosVencidosProveedores = id_grupo_clienteBusquedaSaldosVencidosProveedores;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_facturaFK_IdFactura=-1L;

	public Long getid_facturaFK_IdFactura() {
		return this.id_facturaFK_IdFactura;
	}

	public void setid_facturaFK_IdFactura(Long id_facturaFK_IdFactura) {
		this.id_facturaFK_IdFactura = id_facturaFK_IdFactura;
	}

	public Long id_grupo_clienteFK_IdGrupoCliente=-1L;

	public Long getid_grupo_clienteFK_IdGrupoCliente() {
		return this.id_grupo_clienteFK_IdGrupoCliente;
	}

	public void setid_grupo_clienteFK_IdGrupoCliente(Long id_grupo_clienteFK_IdGrupoCliente) {
		this.id_grupo_clienteFK_IdGrupoCliente = id_grupo_clienteFK_IdGrupoCliente;
	}

	public Long id_monedaFK_IdMoneda=-1L;

	public Long getid_monedaFK_IdMoneda() {
		return this.id_monedaFK_IdMoneda;
	}

	public void setid_monedaFK_IdMoneda(Long id_monedaFK_IdMoneda) {
		this.id_monedaFK_IdMoneda = id_monedaFK_IdMoneda;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SaldosVencidosProveedoresLogic getSaldosVencidosProveedoresLogic()	{		
		return saldosvencidosproveedoresLogic;
	}

	public void setSaldosVencidosProveedoresLogic(SaldosVencidosProveedoresLogic saldosvencidosproveedoresLogic) {
		this.saldosvencidosproveedoresLogic = saldosvencidosproveedoresLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoSaldosVencidosProveedores() {
		return isEsNuevoSaldosVencidosProveedores;
	}

	public void setIsEsNuevoSaldosVencidosProveedores(Boolean isEsNuevoSaldosVencidosProveedores) {
		this.isEsNuevoSaldosVencidosProveedores = isEsNuevoSaldosVencidosProveedores;
	}

	public Boolean getEsParaAccionDesdeFormularioSaldosVencidosProveedores() {
		return esParaAccionDesdeFormularioSaldosVencidosProveedores;
	}
	
	public void setEsParaAccionDesdeFormularioSaldosVencidosProveedores(Boolean esParaAccionDesdeFormularioSaldosVencidosProveedores) {
		this.esParaAccionDesdeFormularioSaldosVencidosProveedores = esParaAccionDesdeFormularioSaldosVencidosProveedores;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.saldosvencidosproveedoresSessionBean==null) {
				this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean();
			}

			if(!this.saldosvencidosproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(saldosvencidosproveedoresSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosGrupoClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GrupoClienteLogic grupoclienteLogic=new GrupoClienteLogic();

			//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

			if(this.saldosvencidosproveedoresSessionBean==null) {
				this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean();
			}

			if(!this.saldosvencidosproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

					grupoclienteLogic.getTodosGrupoClientesWithConnection(sFinalQuery,new Pagination());

					this.grupoclientesForeignKey=grupoclienteLogic.getGrupoClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupoCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getEntityWithConnection(saldosvencidosproveedoresSessionBean.getlidGrupoClienteActual());
					this.grupoclientesForeignKey.add(grupoclienteLogic.getGrupoCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturasForeignKey=new ArrayList<Factura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaLogic facturaLogic=new FacturaLogic();

			//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.saldosvencidosproveedoresSessionBean==null) {
				this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean();
			}

			if(!this.saldosvencidosproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

					facturaLogic.getTodosFacturasWithConnection(sFinalQuery,new Pagination());

					this.facturasForeignKey=facturaLogic.getFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(saldosvencidosproveedoresSessionBean.getlidFacturaActual());
					this.facturasForeignKey.add(facturaLogic.getFactura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosMonedasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.monedasForeignKey=new ArrayList<Moneda>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MonedaLogic monedaLogic=new MonedaLogic();

			//monedaLogic.getMonedaDataAccess().setIsForForeingKeyData(true);

			if(this.saldosvencidosproveedoresSessionBean==null) {
				this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean();
			}

			if(!this.saldosvencidosproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//monedaLogic.getMonedaDataAccess().setIsForForeingKeyData(true);

					monedaLogic.getTodosMonedasWithConnection(sFinalQuery,new Pagination());

					this.monedasForeignKey=monedaLogic.getMonedas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMoneda(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					monedaLogic.getEntityWithConnection(saldosvencidosproveedoresSessionBean.getlidMonedaActual());
					this.monedasForeignKey.add(monedaLogic.getMoneda());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.saldosvencidosproveedoresSessionBean==null) {
				this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean();
			}

			if(!this.saldosvencidosproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(saldosvencidosproveedoresSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.saldosvencidosproveedores!=null) {
						this.saldosvencidosproveedores.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
						this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSaldosVencidosProveedores.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSaldosVencidosProveedoresGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaSaldosVencidosProveedoresGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSaldosVencidosProveedoresGenerico!=null && jComboBoxid_empresaSaldosVencidosProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_empresaSaldosVencidosProveedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGrupoClienteForeignKey(Long idGrupoClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupoclienteTemp!=null) {

					if(this.saldosvencidosproveedores!=null) {
						this.saldosvencidosproveedores.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
						this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clienteSaldosVencidosProveedores.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSaldosVencidosProveedores") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores!=null) {
						jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores!=null) {
							//jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.getItemCount()>0) {
								jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualGrupoClienteForeignKeyDescripcion(Long idGrupoClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}


			sDescripcion=GrupoClienteConstantesFunciones.getGrupoClienteDescripcion(grupoclienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clienteSaldosVencidosProveedoresGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(grupoclienteTemp!=null) {
				jComboBoxid_grupo_clienteSaldosVencidosProveedoresGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clienteSaldosVencidosProveedoresGenerico!=null && jComboBoxid_grupo_clienteSaldosVencidosProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clienteSaldosVencidosProveedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFacturaForeignKey(Long idFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturaTemp!=null) {

					if(this.saldosvencidosproveedores!=null) {
						this.saldosvencidosproveedores.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
						this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaSaldosVencidosProveedores.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualFacturaForeignKeyDescripcion(Long idFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}


			sDescripcion=FacturaConstantesFunciones.getFacturaDescripcion(facturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaSaldosVencidosProveedoresGenerico)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(facturaTemp!=null) {
				jComboBoxid_facturaSaldosVencidosProveedoresGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaSaldosVencidosProveedoresGenerico!=null && jComboBoxid_facturaSaldosVencidosProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_facturaSaldosVencidosProveedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMonedaForeignKey(Long idMonedaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(monedaTemp!=null) {

					if(this.saldosvencidosproveedores!=null) {
						this.saldosvencidosproveedores.setMoneda(monedaTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
						this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.setSelectedItem(monedaTemp);
					}
				} else {
					//jComboBoxid_monedaSaldosVencidosProveedores.setSelectedItem(monedaTemp);
					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualMonedaForeignKeyDescripcion(Long idMonedaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}


			sDescripcion=MonedaConstantesFunciones.getMonedaDescripcion(monedaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMonedaForeignKeyGenerico(Long idMonedaSeleccionado,JComboBox jComboBoxid_monedaSaldosVencidosProveedoresGenerico)throws Exception
	{
		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			if(monedaTemp!=null) {
				jComboBoxid_monedaSaldosVencidosProveedoresGenerico.setSelectedItem(monedaTemp);
			} else {
				if(jComboBoxid_monedaSaldosVencidosProveedoresGenerico!=null && jComboBoxid_monedaSaldosVencidosProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_monedaSaldosVencidosProveedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.saldosvencidosproveedores!=null) {
						this.saldosvencidosproveedores.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
						this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteSaldosVencidosProveedores.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteSaldosVencidosProveedoresGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteSaldosVencidosProveedoresGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteSaldosVencidosProveedoresGenerico!=null && jComboBoxid_clienteSaldosVencidosProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_clienteSaldosVencidosProveedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SaldosVencidosProveedores saldosvencidosproveedores,JComboBox jComboBoxid_empresaSaldosVencidosProveedoresGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSaldosVencidosProveedoresGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSaldosVencidosProveedoresGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				saldosvencidosproveedores.setid_empresa(empresaAux.getId());
				saldosvencidosproveedores.setempresa_descripcion(SaldosVencidosProveedoresConstantesFunciones.getEmpresaDescripcion(empresaAux));
				saldosvencidosproveedores.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(SaldosVencidosProveedores saldosvencidosproveedores,JComboBox jComboBoxid_grupo_clienteSaldosVencidosProveedoresGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clienteSaldosVencidosProveedoresGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clienteSaldosVencidosProveedoresGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				saldosvencidosproveedores.setid_grupo_cliente(grupoclienteAux.getId());
				saldosvencidosproveedores.setgrupocliente_descripcion(SaldosVencidosProveedoresConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				saldosvencidosproveedores.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(SaldosVencidosProveedores saldosvencidosproveedores,JComboBox jComboBoxid_facturaSaldosVencidosProveedoresGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaSaldosVencidosProveedoresGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaSaldosVencidosProveedoresGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				saldosvencidosproveedores.setid_factura(facturaAux.getId());
				saldosvencidosproveedores.setfactura_descripcion(SaldosVencidosProveedoresConstantesFunciones.getFacturaDescripcion(facturaAux));
				saldosvencidosproveedores.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMonedaForeignKey(SaldosVencidosProveedores saldosvencidosproveedores,JComboBox jComboBoxid_monedaSaldosVencidosProveedoresGenerico)throws Exception
	{
		try
		{
			Moneda  monedaAux=new Moneda();

			if(jComboBoxid_monedaSaldosVencidosProveedoresGenerico==null) {
				monedaAux=(Moneda)this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.getSelectedItem();
			} else {
				monedaAux=(Moneda)jComboBoxid_monedaSaldosVencidosProveedoresGenerico.getSelectedItem();
			}

			if(monedaAux!=null && monedaAux.getId()!=null) {
				saldosvencidosproveedores.setid_moneda(monedaAux.getId());
				saldosvencidosproveedores.setmoneda_descripcion(SaldosVencidosProveedoresConstantesFunciones.getMonedaDescripcion(monedaAux));
				saldosvencidosproveedores.setMoneda(monedaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(SaldosVencidosProveedores saldosvencidosproveedores,JComboBox jComboBoxid_clienteSaldosVencidosProveedoresGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteSaldosVencidosProveedoresGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteSaldosVencidosProveedoresGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				saldosvencidosproveedores.setid_cliente(clienteAux.getId());
				saldosvencidosproveedores.setcliente_descripcion(SaldosVencidosProveedoresConstantesFunciones.getClienteDescripcion(clienteAux));
				saldosvencidosproveedores.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { 
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { 
					}

					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { 
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { 
					}

					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSaldosVencidosProveedores") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.addItem(grupocliente);
							}
						}

						if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { 
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { 
					}

					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMonedasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMoneda=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { 
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.removeAllItems();

							for(Moneda moneda:this.monedasForeignKey) {
								this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.addItem(moneda);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { 
					}

					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { 
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { 
					}

					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameGrupoClienteForeignKey(GrupoCliente grupocliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFacturaForeignKey(Factura factura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMonedaForeignKey(Moneda moneda,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.setSelectedItem(moneda);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSaldosVencidosProveedores() throws Exception {
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public SaldosVencidosProveedoresParameterReturnGeneral getSaldosVencidosProveedoresParameterGeneral() {
		return this.saldosvencidosproveedoresParameterGeneral;
	}
	
	public void setSaldosVencidosProveedoresParameterGeneral(SaldosVencidosProveedoresParameterReturnGeneral saldosvencidosproveedoresParameterGeneral) {
		this.saldosvencidosproveedoresParameterGeneral = saldosvencidosproveedoresParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoSaldosVencidosProveedores() {
		return isPermisoTodoSaldosVencidosProveedores;
	}

	public void setIsPermisoTodoSaldosVencidosProveedores(Boolean isPermisoTodoSaldosVencidosProveedores) {
		this.isPermisoTodoSaldosVencidosProveedores = isPermisoTodoSaldosVencidosProveedores;
	}

	public Boolean getIsPermisoNuevoSaldosVencidosProveedores() {
		return isPermisoNuevoSaldosVencidosProveedores;
	}

	public void setIsPermisoNuevoSaldosVencidosProveedores(Boolean isPermisoNuevoSaldosVencidosProveedores) {
		this.isPermisoNuevoSaldosVencidosProveedores = isPermisoNuevoSaldosVencidosProveedores;
	}

	public Boolean getIsPermisoActualizarSaldosVencidosProveedores() {
		return isPermisoActualizarSaldosVencidosProveedores;
	}

	public void setIsPermisoActualizarSaldosVencidosProveedores(Boolean isPermisoActualizarSaldosVencidosProveedores) {
		this.isPermisoActualizarSaldosVencidosProveedores = isPermisoActualizarSaldosVencidosProveedores;
	}

	public Boolean getIsPermisoEliminarSaldosVencidosProveedores() {
		return isPermisoEliminarSaldosVencidosProveedores;
	}

	public void setIsPermisoEliminarSaldosVencidosProveedores(Boolean isPermisoEliminarSaldosVencidosProveedores) {
		this.isPermisoEliminarSaldosVencidosProveedores = isPermisoEliminarSaldosVencidosProveedores;
	}

	public Boolean getIsPermisoGuardarCambiosSaldosVencidosProveedores() {
		return isPermisoGuardarCambiosSaldosVencidosProveedores;
	}

	public void setIsPermisoGuardarCambiosSaldosVencidosProveedores(Boolean isPermisoGuardarCambiosSaldosVencidosProveedores) {
		this.isPermisoGuardarCambiosSaldosVencidosProveedores = isPermisoGuardarCambiosSaldosVencidosProveedores;
	}
	
	public Boolean getIsPermisoConsultaSaldosVencidosProveedores() {
		return isPermisoConsultaSaldosVencidosProveedores;
	}

	public void setIsPermisoConsultaSaldosVencidosProveedores(Boolean isPermisoConsultaSaldosVencidosProveedores) {
		this.isPermisoConsultaSaldosVencidosProveedores = isPermisoConsultaSaldosVencidosProveedores;
	}

	public Boolean getIsPermisoBusquedaSaldosVencidosProveedores() {
		return isPermisoBusquedaSaldosVencidosProveedores;
	}

	public void setIsPermisoBusquedaSaldosVencidosProveedores(Boolean isPermisoBusquedaSaldosVencidosProveedores) {
		this.isPermisoBusquedaSaldosVencidosProveedores = isPermisoBusquedaSaldosVencidosProveedores;
	}

	public Boolean getIsPermisoReporteSaldosVencidosProveedores() {
		return isPermisoReporteSaldosVencidosProveedores;
	}

	public void setIsPermisoReporteSaldosVencidosProveedores(Boolean isPermisoReporteSaldosVencidosProveedores) {
		this.isPermisoReporteSaldosVencidosProveedores = isPermisoReporteSaldosVencidosProveedores;
	}
	
	public Boolean getIsPermisoPaginacionMedioSaldosVencidosProveedores() {
		return isPermisoPaginacionMedioSaldosVencidosProveedores;
	}

	public void setIsPermisoPaginacionMedioSaldosVencidosProveedores(Boolean isPermisoPaginacionMedioSaldosVencidosProveedores) {
		this.isPermisoPaginacionMedioSaldosVencidosProveedores = isPermisoPaginacionMedioSaldosVencidosProveedores;
	}
	
	public Boolean getIsPermisoPaginacionTodoSaldosVencidosProveedores() {
		return isPermisoPaginacionTodoSaldosVencidosProveedores;
	}

	public void setIsPermisoPaginacionTodoSaldosVencidosProveedores(Boolean isPermisoPaginacionTodoSaldosVencidosProveedores) {
		this.isPermisoPaginacionTodoSaldosVencidosProveedores = isPermisoPaginacionTodoSaldosVencidosProveedores;
	}
	
	public Boolean getIsPermisoPaginacionAltoSaldosVencidosProveedores() {
		return isPermisoPaginacionAltoSaldosVencidosProveedores;
	}

	public void setIsPermisoPaginacionAltoSaldosVencidosProveedores(Boolean isPermisoPaginacionAltoSaldosVencidosProveedores) {
		this.isPermisoPaginacionAltoSaldosVencidosProveedores = isPermisoPaginacionAltoSaldosVencidosProveedores;
	}
	
	public Boolean getIsPermisoCopiarSaldosVencidosProveedores() {
		return isPermisoCopiarSaldosVencidosProveedores;
	}

	public void setIsPermisoCopiarSaldosVencidosProveedores(Boolean isPermisoCopiarSaldosVencidosProveedores) {
		this.isPermisoCopiarSaldosVencidosProveedores = isPermisoCopiarSaldosVencidosProveedores;
	}
	
	public Boolean getIsPermisoVerFormSaldosVencidosProveedores() {
		return isPermisoVerFormSaldosVencidosProveedores;
	}

	public void setIsPermisoVerFormSaldosVencidosProveedores(Boolean isPermisoVerFormSaldosVencidosProveedores) {
		this.isPermisoVerFormSaldosVencidosProveedores = isPermisoVerFormSaldosVencidosProveedores;
	}
	
	public Boolean getIsPermisoDuplicarSaldosVencidosProveedores() {
		return isPermisoDuplicarSaldosVencidosProveedores;
	}

	public void setIsPermisoDuplicarSaldosVencidosProveedores(Boolean isPermisoDuplicarSaldosVencidosProveedores) {
		this.isPermisoDuplicarSaldosVencidosProveedores = isPermisoDuplicarSaldosVencidosProveedores;
	}
	
	public Boolean getIsPermisoOrdenSaldosVencidosProveedores() {
		return isPermisoOrdenSaldosVencidosProveedores;
	}

	public void setIsPermisoOrdenSaldosVencidosProveedores(Boolean isPermisoOrdenSaldosVencidosProveedores) {
		this.isPermisoOrdenSaldosVencidosProveedores = isPermisoOrdenSaldosVencidosProveedores;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoSaldosVencidosProveedores() {
		return isVisibilidadCeldaNuevoSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaNuevoSaldosVencidosProveedores(Boolean isVisibilidadCeldaNuevoSaldosVencidosProveedores) {
		this.isVisibilidadCeldaNuevoSaldosVencidosProveedores = isVisibilidadCeldaNuevoSaldosVencidosProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSaldosVencidosProveedores() {
		return isVisibilidadCeldaDuplicarSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaDuplicarSaldosVencidosProveedores(Boolean isVisibilidadCeldaDuplicarSaldosVencidosProveedores) {
		this.isVisibilidadCeldaDuplicarSaldosVencidosProveedores = isVisibilidadCeldaDuplicarSaldosVencidosProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSaldosVencidosProveedores() {
		return isVisibilidadCeldaCopiarSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaCopiarSaldosVencidosProveedores(Boolean isVisibilidadCeldaCopiarSaldosVencidosProveedores) {
		this.isVisibilidadCeldaCopiarSaldosVencidosProveedores = isVisibilidadCeldaCopiarSaldosVencidosProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSaldosVencidosProveedores() {
		return isVisibilidadCeldaVerFormSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaVerFormSaldosVencidosProveedores(Boolean isVisibilidadCeldaVerFormSaldosVencidosProveedores) {
		this.isVisibilidadCeldaVerFormSaldosVencidosProveedores = isVisibilidadCeldaVerFormSaldosVencidosProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSaldosVencidosProveedores() {
		return isVisibilidadCeldaOrdenSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaOrdenSaldosVencidosProveedores(Boolean isVisibilidadCeldaOrdenSaldosVencidosProveedores) {
		this.isVisibilidadCeldaOrdenSaldosVencidosProveedores = isVisibilidadCeldaOrdenSaldosVencidosProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores() {
		return isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores(Boolean isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores) {
		this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores = isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSaldosVencidosProveedores() {
		return isVisibilidadCeldaModificarSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaModificarSaldosVencidosProveedores(Boolean isVisibilidadCeldaModificarSaldosVencidosProveedores) {
		this.isVisibilidadCeldaModificarSaldosVencidosProveedores = isVisibilidadCeldaModificarSaldosVencidosProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSaldosVencidosProveedores() {
		return isVisibilidadCeldaActualizarSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaActualizarSaldosVencidosProveedores(Boolean isVisibilidadCeldaActualizarSaldosVencidosProveedores) {
		this.isVisibilidadCeldaActualizarSaldosVencidosProveedores = isVisibilidadCeldaActualizarSaldosVencidosProveedores;
	}

	public Boolean getIsVisibilidadCeldaEliminarSaldosVencidosProveedores() {
		return isVisibilidadCeldaEliminarSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaEliminarSaldosVencidosProveedores(Boolean isVisibilidadCeldaEliminarSaldosVencidosProveedores) {
		this.isVisibilidadCeldaEliminarSaldosVencidosProveedores = isVisibilidadCeldaEliminarSaldosVencidosProveedores;
	}

	public Boolean getIsVisibilidadCeldaCancelarSaldosVencidosProveedores() {
		return isVisibilidadCeldaCancelarSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaCancelarSaldosVencidosProveedores(Boolean isVisibilidadCeldaCancelarSaldosVencidosProveedores) {
		this.isVisibilidadCeldaCancelarSaldosVencidosProveedores = isVisibilidadCeldaCancelarSaldosVencidosProveedores;
	}

	public Boolean getIsVisibilidadCeldaGuardarSaldosVencidosProveedores() {
		return isVisibilidadCeldaGuardarSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaGuardarSaldosVencidosProveedores(Boolean isVisibilidadCeldaGuardarSaldosVencidosProveedores) {
		this.isVisibilidadCeldaGuardarSaldosVencidosProveedores = isVisibilidadCeldaGuardarSaldosVencidosProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores() {
		return isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores(Boolean isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores) {
		this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores = isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores;
	}
		
	public SaldosVencidosProveedoresSessionBean getsaldosvencidosproveedoresSessionBean() {
		return this.saldosvencidosproveedoresSessionBean;
	}
	
	public void setsaldosvencidosproveedoresSessionBean(SaldosVencidosProveedoresSessionBean saldosvencidosproveedoresSessionBean) {
		this.saldosvencidosproveedoresSessionBean=saldosvencidosproveedoresSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaSaldosVencidosProveedores() {
		return this.isVisibilidadBusquedaSaldosVencidosProveedores;
	}

	public void setisVisibilidadBusquedaSaldosVencidosProveedores(Boolean isVisibilidadBusquedaSaldosVencidosProveedores) {
		this.isVisibilidadBusquedaSaldosVencidosProveedores=isVisibilidadBusquedaSaldosVencidosProveedores;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFactura() {
		return this.isVisibilidadFK_IdFactura;
	}

	public void setisVisibilidadFK_IdFactura(Boolean isVisibilidadFK_IdFactura) {
		this.isVisibilidadFK_IdFactura=isVisibilidadFK_IdFactura;
	}

	public Boolean getisVisibilidadFK_IdGrupoCliente() {
		return this.isVisibilidadFK_IdGrupoCliente;
	}

	public void setisVisibilidadFK_IdGrupoCliente(Boolean isVisibilidadFK_IdGrupoCliente) {
		this.isVisibilidadFK_IdGrupoCliente=isVisibilidadFK_IdGrupoCliente;
	}

	public Boolean getisVisibilidadFK_IdMoneda() {
		return this.isVisibilidadFK_IdMoneda;
	}

	public void setisVisibilidadFK_IdMoneda(Boolean isVisibilidadFK_IdMoneda) {
		this.isVisibilidadFK_IdMoneda=isVisibilidadFK_IdMoneda;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(saldosvencidosproveedores,null);
				this.setActualParaGuardarGrupoClienteForeignKey(saldosvencidosproveedores,null);
				this.setActualParaGuardarFacturaForeignKey(saldosvencidosproveedores,null);
				this.setActualParaGuardarMonedaForeignKey(saldosvencidosproveedores,null);
				this.setActualParaGuardarClienteForeignKey(saldosvencidosproveedores,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(SaldosVencidosProveedores saldosvencidosproveedores,SaldosVencidosProveedores saldosvencidosproveedoresAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSaldosVencidosProveedores(saldosvencidosproveedores);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		saldosvencidosproveedoresAux.setId(saldosvencidosproveedores.getId());
		saldosvencidosproveedoresAux.setVersionRow(saldosvencidosproveedores.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(SaldosVencidosProveedores saldosvencidosproveedoresLocal) throws Exception {
		
		if(this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SaldosVencidosProveedores saldosvencidosproveedoresLocal) throws Exception {	
		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				saldosvencidosproveedoresLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				saldosvencidosproveedoresLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				saldosvencidosproveedoresLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MonedaDetalleFormJInternalFrame.class)) {
				MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrameLocal=(MonedaBeanSwingJInternalFrame) ((MonedaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				monedaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMoneda(monedaBeanSwingJInternalFrameLocal.getmoneda(),true);
				monedaBeanSwingJInternalFrameLocal.actualizarLista(monedaBeanSwingJInternalFrameLocal.moneda,this.monedasForeignKey);

				monedaBeanSwingJInternalFrameLocal.actualizarRelaciones(monedaBeanSwingJInternalFrameLocal.moneda);

				saldosvencidosproveedoresLocal.setMoneda(monedaBeanSwingJInternalFrameLocal.moneda);

				this.addItemDefectoCombosForeignKeyMoneda();
				this.cargarCombosFrameMonedasForeignKey("Formulario");
				this.setActualMonedaForeignKey(monedaBeanSwingJInternalFrameLocal.moneda.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				saldosvencidosproveedoresLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSaldosVencidosProveedoresActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = saldosvencidosproveedoresValidator.getInvalidValues(this.saldosvencidosproveedores);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SaldosVencidosProveedores saldosvencidosproveedores,List<SaldosVencidosProveedores> saldosvencidosproveedoress) throws Exception {
	}		
	
	public void actualizarSelectedLista(SaldosVencidosProveedores saldosvencidosproveedores,List<SaldosVencidosProveedores> saldosvencidosproveedoress) throws Exception {
		try	{			
			SaldosVencidosProveedoresConstantesFunciones.actualizarSelectedLista(saldosvencidosproveedores,saldosvencidosproveedoress);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SaldosVencidosProveedores> saldosvencidosproveedoressLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				saldosvencidosproveedoressLocal=this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				saldosvencidosproveedoressLocal=this.saldosvencidosproveedoress;
			}
			//ARCHITECTURE
		
			for(SaldosVencidosProveedores saldosvencidosproveedoresLocal:saldosvencidosproveedoressLocal) {
				if(this.permiteMantenimiento(saldosvencidosproveedoresLocal) && saldosvencidosproveedoresLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+SaldosVencidosProveedoresConstantesFunciones.getSaldosVencidosProveedoresLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelid_facturaSaldosVencidosProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.IDMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelid_monedaSaldosVencidosProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelid_clienteSaldosVencidosProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnumero_facturaSaldosVencidosProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelfecha_emisionSaldosVencidosProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.FECHAVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelfecha_ventaSaldosVencidosProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.NOMBREMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnombre_monedaSaldosVencidosProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelsaldoSaldosVencidosProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.SALDOEXTRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelsaldo_extraSaldosVencidosProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnombre_clienteSaldosVencidosProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosVencidosProveedoresConstantesFunciones.NOMBREGRUPOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnombre_grupo_clienteSaldosVencidosProveedores,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelid_facturaSaldosVencidosProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelid_monedaSaldosVencidosProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelid_clienteSaldosVencidosProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnumero_facturaSaldosVencidosProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelfecha_emisionSaldosVencidosProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelfecha_ventaSaldosVencidosProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnombre_monedaSaldosVencidosProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelsaldoSaldosVencidosProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelsaldo_extraSaldosVencidosProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnombre_clienteSaldosVencidosProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnombre_grupo_clienteSaldosVencidosProveedores,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoSaldosVencidosProveedores--;	
		
		
		this.saldosvencidosproveedoresAux=new SaldosVencidosProveedores();
		
		this.saldosvencidosproveedoresAux.setId(this.iIdNuevoSaldosVencidosProveedores);
		this.saldosvencidosproveedoresAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().add(this.saldosvencidosproveedoresAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.saldosvencidosproveedoress.add(this.saldosvencidosproveedoresAux);
		}
		//ARCHITECTURE
		
		this.saldosvencidosproveedores=this.saldosvencidosproveedoresAux;
		
		if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSaldosVencidosProveedores(this.saldosvencidosproveedores);
			this.setVariablesObjetoActualToFormularioForeignKeySaldosVencidosProveedores(this.saldosvencidosproveedores);
		}
				
		//this.setDefaultControlesSaldosVencidosProveedores();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySaldosVencidosProveedores();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySaldosVencidosProveedores();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySaldosVencidosProveedores();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedoresBean,this.saldosvencidosproveedores,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSaldosVencidosProveedores(this.saldosvencidosproveedoresReturnGeneral,this.saldosvencidosproveedoresBean,false);
		
		if(this.saldosvencidosproveedoresReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySaldosVencidosProveedores(this.saldosvencidosproveedoresReturnGeneral.getSaldosVencidosProveedores());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSaldosVencidosProveedores(this.saldosvencidosproveedoresReturnGeneral.getSaldosVencidosProveedores());
		}
		
		if(this.saldosvencidosproveedoresReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSaldosVencidosProveedores(this.saldosvencidosproveedoresReturnGeneral.getSaldosVencidosProveedores(),classes);//this.saldosvencidosproveedoresBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySaldosVencidosProveedores();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySaldosVencidosProveedores();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.RecargarFormSaldosVencidosProveedores(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSaldosVencidosProveedores(false);
						
			if(saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldosVencidosProveedores();
			}
			
			this.actualizarVisualTableDatosSaldosVencidosProveedores();
			
			this.jTableDatosSaldosVencidosProveedores.setRowSelectionInterval(this.getIndiceNuevoSaldosVencidosProveedores(), this.getIndiceNuevoSaldosVencidosProveedores());
			
			this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
						
			this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSaldosVencidosProveedores(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnumero_facturaSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarnumero_facturaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_emisionSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarfecha_emisionSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_ventaSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarfecha_ventaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnombre_monedaSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarnombre_monedaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldoSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarsaldoSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldo_extraSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarsaldo_extraSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_clienteSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarnombre_clienteSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarnombre_grupo_clienteSaldosVencidosProveedores);	
		//
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarid_empresaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarid_grupo_clienteSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarid_facturaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarid_monedaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.setEnabled(isHabilitar && this.saldosvencidosproveedoresConstantesFunciones.activarid_clienteSaldosVencidosProveedores);
	};
	
	public void setDefaultControlesSaldosVencidosProveedores() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSaldosVencidosProveedores(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.saldosvencidosproveedoresSessionBean.setConGuardarRelaciones(true);			
			this.saldosvencidosproveedoresSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTabbedPaneRelacionesSaldosVencidosProveedores.setVisible(true);
			
					
		} else {
			//this.saldosvencidosproveedoresSessionBean.setConGuardarRelaciones(false);			
			this.saldosvencidosproveedoresSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTabbedPaneRelacionesSaldosVencidosProveedores.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSaldosVencidosProveedores() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
				if(saldosvencidosproveedoresAux.getId().equals(this.iIdNuevoSaldosVencidosProveedores)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoress) {
				if(saldosvencidosproveedoresAux.getId().equals(this.iIdNuevoSaldosVencidosProveedores)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
				if(saldosvencidosproveedoresAux.getId().equals(saldosvencidosproveedores.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoress) {
				if(saldosvencidosproveedoresAux.getId().equals(saldosvencidosproveedores.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedoresOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
				if(saldosvencidosproveedoresAux.getSaldosVencidosProveedoresOriginal().getId().equals(saldosvencidosproveedoresOriginal.getId())) {
					existe=true;
					saldosvencidosproveedoresOriginal.setId(saldosvencidosproveedoresAux.getId());
					saldosvencidosproveedoresOriginal.setVersionRow(saldosvencidosproveedoresAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoress) {
				if(saldosvencidosproveedoresAux.getSaldosVencidosProveedoresOriginal().getId().equals(saldosvencidosproveedoresOriginal.getId())) {
					existe=true;
					saldosvencidosproveedoresOriginal.setId(saldosvencidosproveedoresAux.getId());
					saldosvencidosproveedoresOriginal.setVersionRow(saldosvencidosproveedoresAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSaldosVencidosProveedores(Boolean esParaCancelar) throws Exception {
		saldosvencidosproveedoressAux=new ArrayList<SaldosVencidosProveedores>();
		saldosvencidosproveedoresAux=new SaldosVencidosProveedores();
		
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
					if(saldosvencidosproveedoresAux.getId()<0) {
						saldosvencidosproveedoressAux.add(saldosvencidosproveedoresAux);
					}		
				}
				this.iIdNuevoSaldosVencidosProveedores=0L;
				this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().removeAll(saldosvencidosproveedoressAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoress) {
					if(saldosvencidosproveedoresAux.getId()<0) {
						saldosvencidosproveedoressAux.add(saldosvencidosproveedoresAux);
					}		
				}
				this.iIdNuevoSaldosVencidosProveedores=0L;
				this.saldosvencidosproveedoress.removeAll(saldosvencidosproveedoressAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSaldosVencidosProveedores 
					&& this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().size()>0
					) {
					saldosvencidosproveedoresAux=this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().get(this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().size() - 1);
				
					if(saldosvencidosproveedoresAux.getId()<0) {
						this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().remove(saldosvencidosproveedoresAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSaldosVencidosProveedores && this.saldosvencidosproveedoress.size()>0) {
					saldosvencidosproveedoresAux=this.saldosvencidosproveedoress.get(this.saldosvencidosproveedoress.size() - 1);
				
					if(saldosvencidosproveedoresAux.getId()<0) {
						this.saldosvencidosproveedoress.remove(saldosvencidosproveedoresAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSaldosVencidosProveedores(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(saldosvencidosproveedores.getId()<0) {
				this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().remove(this.saldosvencidosproveedores);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(saldosvencidosproveedores.getId()<0) {
				this.saldosvencidosproveedoress.remove(this.saldosvencidosproveedores);
			}
		}			
	}
	
	public void setEstadosInicialesSaldosVencidosProveedores(List<SaldosVencidosProveedores> saldosvencidosproveedoressAux) throws Exception {
		SaldosVencidosProveedoresConstantesFunciones.setEstadosInicialesSaldosVencidosProveedores(saldosvencidosproveedoressAux);
	}
	
	public void setEstadosInicialesSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedoresAux) throws Exception {
		SaldosVencidosProveedoresConstantesFunciones.setEstadosInicialesSaldosVencidosProveedores(saldosvencidosproveedoresAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSaldosVencidosProveedoresActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSaldosVencidosProveedoresActual()) {
				if(!this.isEsNuevoSaldosVencidosProveedores) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSaldosVencidosProveedores=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSaldosVencidosProveedoresActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Saldos Vencidos Proveedores ?", "MANTENIMIENTO DE Saldos Vencidos Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SaldosVencidosProveedores saldosvencidosproveedores) throws Exception {
		SaldosVencidosProveedoresConstantesFunciones.seleccionarAsignar(this.saldosvencidosproveedores,saldosvencidosproveedores);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSaldosVencidosProveedores=this.isPermisoActualizarOriginalSaldosVencidosProveedores;
			
			
			this.seleccionarAsignar(saldosvencidosproveedores);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.saldosvencidosproveedoresSessionBean.setsFuncionBusquedaRapida(this.saldosvencidosproveedoresSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSaldosVencidosProveedores) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSaldosVencidosProveedores(esParaCancelar);				
				this.cancelarNuevoSaldosVencidosProveedores(esParaCancelar);								
			}
			
			this.saldosvencidosproveedores=new SaldosVencidosProveedores();
			
			this.inicializarSaldosVencidosProveedores();
			
			this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSaldosVencidosProveedores() throws Exception {
		try {
			SaldosVencidosProveedoresConstantesFunciones.inicializarSaldosVencidosProveedores(this.saldosvencidosproveedores);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSaldosVencidosProveedoress(String sAccionBusqueda,List<SaldosVencidosProveedores> saldosvencidosproveedoressParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="SaldosVencidosProveedores"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SaldosVencidosProveedoresMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SaldosVencidosProveedoresMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SaldosVencidosProveedores"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Saldos Vencidos Proveedoreses");		
		parameters.put("busquedapor", SaldosVencidosProveedoresConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSaldosVencidosProveedores=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SaldosVencidosProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SaldosVencidosProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSaldosVencidosProveedores=new JRBeanArrayDataSource(SaldosVencidosProveedoresJInternalFrame.TraerSaldosVencidosProveedoresBeans(saldosvencidosproveedoressParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSaldosVencidosProveedores);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SaldosVencidosProveedoresConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SaldosVencidosProveedoresConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SaldosVencidosProveedoresBean.TraerSaldosVencidosProveedoresBeans(saldosvencidosproveedoressParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteSaldosVencidosProveedoress(sAccionBusqueda,sTipoArchivoReporte,saldosvencidosproveedoressParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSaldosVencidosProveedoress(sAccionBusqueda,sTipoArchivoReporte,saldosvencidosproveedoressParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedoresActionPerformed(null);
					//this.generarExcelReporteSaldosVencidosProveedoress(sAccionBusqueda,sTipoArchivoReporte,saldosvencidosproveedoressParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSaldosVencidosProveedoress(sAccionBusqueda,sTipoArchivoReporte,saldosvencidosproveedoressParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSaldosVencidosProveedoress(sAccionBusqueda,sTipoArchivoReporte,saldosvencidosproveedoressParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSaldosVencidosProveedoress(sAccionBusqueda,sTipoArchivoReporte,saldosvencidosproveedoressParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSaldosVencidosProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldosVencidosProveedores> saldosvencidosproveedoressParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosvencidosproveedores";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldosVencidosProveedoress");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSaldosVencidosProveedores("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SaldosVencidosProveedores saldosvencidosproveedores : saldosvencidosproveedoressParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SaldosVencidosProveedoresConstantesFunciones.generarExcelReporteDataSaldosVencidosProveedores("NORMAL",row,workbook,saldosvencidosproveedores,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Vencidos Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSaldosVencidosProveedores(String sTipo,Row row,Workbook workbook) {
		
		SaldosVencidosProveedoresConstantesFunciones.generarExcelReporteHeaderSaldosVencidosProveedores(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSaldosVencidosProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldosVencidosProveedores> saldosvencidosproveedoressParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosvencidosproveedores_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldosVencidosProveedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SaldosVencidosProveedores saldosvencidosproveedores : saldosvencidosproveedoressParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.getSaldosVencidosProveedoresDescripcion(saldosvencidosproveedores));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getmoneda_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getfecha_venta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getnombre_moneda());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getsaldo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getsaldo_extra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosvencidosproveedores.getnombre_grupo_cliente());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Vencidos Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSaldosVencidosProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldosVencidosProveedores> saldosvencidosproveedoressParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SaldosVencidosProveedores> saldosvencidosproveedoressRespaldo=null;
		
		classes=SaldosVencidosProveedoresConstantesFunciones.getClassesRelationshipsOfSaldosVencidosProveedores(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.saldosvencidosproveedoresLogic.setDatosCliente(this.datosCliente);
		this.saldosvencidosproveedoresLogic.setDatosDeep(this.datosDeep);
		this.saldosvencidosproveedoresLogic.setIsConDeep(true);
		
		saldosvencidosproveedoressRespaldo=this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress();
		
		this.saldosvencidosproveedoresLogic.setSaldosVencidosProveedoress(saldosvencidosproveedoressParaReportes);	
		this.saldosvencidosproveedoresLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		saldosvencidosproveedoressParaReportes=this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress();
		this.saldosvencidosproveedoresLogic.setSaldosVencidosProveedoress(saldosvencidosproveedoressRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosvencidosproveedores_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldosVencidosProveedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSaldosVencidosProveedores("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SaldosVencidosProveedores saldosvencidosproveedores : saldosvencidosproveedoressParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSaldosVencidosProveedores("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SaldosVencidosProveedoresConstantesFunciones.generarExcelReporteDataSaldosVencidosProveedores("NORMAL",row,workbook,saldosvencidosproveedores,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.getSaldosVencidosProveedoresDescripcion(saldosvencidosproveedores));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Vencidos Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSaldosVencidosProveedores() throws Exception {		
		this.startProcessSaldosVencidosProveedores(true);
	}
	
	public void startProcessSaldosVencidosProveedores(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSaldosVencidosProveedores ,this.jPanelParametrosReportesSaldosVencidosProveedores, this.jScrollPanelDatosSaldosVencidosProveedores,this.jPanelPaginacionSaldosVencidosProveedores, this.jScrollPanelDatosEdicionSaldosVencidosProveedores, this.jPanelAccionesSaldosVencidosProveedores,this.jPanelAccionesFormularioSaldosVencidosProveedores,this.jmenuBarSaldosVencidosProveedores,this.jmenuBarDetalleSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,this.jTtoolBarDetalleSaldosVencidosProveedores);		
		
		final JTabbedPane jTabbedPaneBusquedasSaldosVencidosProveedores=this.jTabbedPaneBusquedasSaldosVencidosProveedores; 
		
		final JPanel jPanelParametrosReportesSaldosVencidosProveedores=this.jPanelParametrosReportesSaldosVencidosProveedores;
		//final JScrollPane jScrollPanelDatosSaldosVencidosProveedores=this.jScrollPanelDatosSaldosVencidosProveedores;
		final JTable jTableDatosSaldosVencidosProveedores=this.jTableDatosSaldosVencidosProveedores;		
		final JPanel jPanelPaginacionSaldosVencidosProveedores=this.jPanelPaginacionSaldosVencidosProveedores;
		//final JScrollPane jScrollPanelDatosEdicionSaldosVencidosProveedores=this.jScrollPanelDatosEdicionSaldosVencidosProveedores;
		final JPanel jPanelAccionesSaldosVencidosProveedores=this.jPanelAccionesSaldosVencidosProveedores;
		
		JPanel jPanelCamposAuxiliarSaldosVencidosProveedores=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSaldosVencidosProveedores=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			jPanelCamposAuxiliarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelCamposSaldosVencidosProveedores;
			jPanelAccionesFormularioAuxiliarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelAccionesFormularioSaldosVencidosProveedores;
		}
		
		final JPanel jPanelCamposSaldosVencidosProveedores=jPanelCamposAuxiliarSaldosVencidosProveedores;
		final JPanel jPanelAccionesFormularioSaldosVencidosProveedores=jPanelAccionesFormularioAuxiliarSaldosVencidosProveedores;
		
		
		final JMenuBar jmenuBarSaldosVencidosProveedores=this.jmenuBarSaldosVencidosProveedores;
		final JToolBar jTtoolBarSaldosVencidosProveedores=this.jTtoolBarSaldosVencidosProveedores;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSaldosVencidosProveedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSaldosVencidosProveedores=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			jmenuBarDetalleAuxiliarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jmenuBarDetalleSaldosVencidosProveedores;
			jTtoolBarDetalleAuxiliarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTtoolBarDetalleSaldosVencidosProveedores;
		}
		
		final JMenuBar jmenuBarDetalleSaldosVencidosProveedores=jmenuBarDetalleAuxiliarSaldosVencidosProveedores;
		final JToolBar jTtoolBarDetalleSaldosVencidosProveedores=jTtoolBarDetalleAuxiliarSaldosVencidosProveedores;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSaldosVencidosProveedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSaldosVencidosProveedores;
			processRunnable.jTableDatos=jTableDatosSaldosVencidosProveedores;
			processRunnable.jPanelCampos=jPanelCamposSaldosVencidosProveedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionSaldosVencidosProveedores;
			processRunnable.jPanelAcciones=jPanelAccionesSaldosVencidosProveedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSaldosVencidosProveedores;
			
			
			processRunnable.jmenuBar=jmenuBarSaldosVencidosProveedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSaldosVencidosProveedores;
			processRunnable.jTtoolBar=jTtoolBarSaldosVencidosProveedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSaldosVencidosProveedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSaldosVencidosProveedores ,jPanelParametrosReportesSaldosVencidosProveedores,jTableDatosSaldosVencidosProveedores, /*jScrollPanelDatosSaldosVencidosProveedores,*/jPanelCamposSaldosVencidosProveedores,jPanelPaginacionSaldosVencidosProveedores, /*jScrollPanelDatosEdicionSaldosVencidosProveedores,*/ jPanelAccionesSaldosVencidosProveedores,jPanelAccionesFormularioSaldosVencidosProveedores,jmenuBarSaldosVencidosProveedores,jmenuBarDetalleSaldosVencidosProveedores,jTtoolBarSaldosVencidosProveedores,jTtoolBarDetalleSaldosVencidosProveedores);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSaldosVencidosProveedores ,jPanelParametrosReportesSaldosVencidosProveedores, jScrollPanelDatosSaldosVencidosProveedores,jPanelPaginacionSaldosVencidosProveedores, jScrollPanelDatosEdicionSaldosVencidosProveedores, jPanelAccionesSaldosVencidosProveedores,jPanelAccionesFormularioSaldosVencidosProveedores,jmenuBarSaldosVencidosProveedores,jmenuBarDetalleSaldosVencidosProveedores,jTtoolBarSaldosVencidosProveedores,jTtoolBarDetalleSaldosVencidosProveedores);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessSaldosVencidosProveedores() {// throws Exception 
		this.finishProcessSaldosVencidosProveedores(true);
	}
	
	public void finishProcessSaldosVencidosProveedores(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSaldosVencidosProveedores ,this.jPanelParametrosReportesSaldosVencidosProveedores, this.jScrollPanelDatosSaldosVencidosProveedores,this.jPanelPaginacionSaldosVencidosProveedores, this.jScrollPanelDatosEdicionSaldosVencidosProveedores, this.jPanelAccionesSaldosVencidosProveedores,this.jPanelAccionesFormularioSaldosVencidosProveedores,this.jmenuBarSaldosVencidosProveedores,this.jmenuBarDetalleSaldosVencidosProveedores,this.jTtoolBarSaldosVencidosProveedores,this.jTtoolBarDetalleSaldosVencidosProveedores);		
		
		final JTabbedPane jTabbedPaneBusquedasSaldosVencidosProveedores=this.jTabbedPaneBusquedasSaldosVencidosProveedores; 
		
		final JPanel jPanelParametrosReportesSaldosVencidosProveedores=this.jPanelParametrosReportesSaldosVencidosProveedores;
		//final JScrollPane jScrollPanelDatosSaldosVencidosProveedores=this.jScrollPanelDatosSaldosVencidosProveedores;
		final JTable jTableDatosSaldosVencidosProveedores=this.jTableDatosSaldosVencidosProveedores;		
		final JPanel jPanelPaginacionSaldosVencidosProveedores=this.jPanelPaginacionSaldosVencidosProveedores;
		//final JScrollPane jScrollPanelDatosEdicionSaldosVencidosProveedores=this.jScrollPanelDatosEdicionSaldosVencidosProveedores;
		final JPanel jPanelAccionesSaldosVencidosProveedores=this.jPanelAccionesSaldosVencidosProveedores;
		
		JPanel jPanelCamposAuxiliarSaldosVencidosProveedores=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSaldosVencidosProveedores=new JPanel();
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			jPanelCamposAuxiliarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelCamposSaldosVencidosProveedores;
			jPanelAccionesFormularioAuxiliarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelAccionesFormularioSaldosVencidosProveedores;
		}
		
		final JPanel jPanelCamposSaldosVencidosProveedores=jPanelCamposAuxiliarSaldosVencidosProveedores;
		final JPanel jPanelAccionesFormularioSaldosVencidosProveedores=jPanelAccionesFormularioAuxiliarSaldosVencidosProveedores;
		
		
		final JMenuBar jmenuBarSaldosVencidosProveedores=this.jmenuBarSaldosVencidosProveedores;		
		final JToolBar jTtoolBarSaldosVencidosProveedores=this.jTtoolBarSaldosVencidosProveedores;
				
		JMenuBar jmenuBarDetalleAuxiliarSaldosVencidosProveedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSaldosVencidosProveedores=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			jmenuBarDetalleAuxiliarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jmenuBarDetalleSaldosVencidosProveedores;
			jTtoolBarDetalleAuxiliarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTtoolBarDetalleSaldosVencidosProveedores;		
		}
		
		final JMenuBar jmenuBarDetalleSaldosVencidosProveedores=jmenuBarDetalleAuxiliarSaldosVencidosProveedores;
		final JToolBar jTtoolBarDetalleSaldosVencidosProveedores=jTtoolBarDetalleAuxiliarSaldosVencidosProveedores;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSaldosVencidosProveedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSaldosVencidosProveedores;
			processRunnable.jTableDatos=jTableDatosSaldosVencidosProveedores;
			processRunnable.jPanelCampos=jPanelCamposSaldosVencidosProveedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionSaldosVencidosProveedores;
			processRunnable.jPanelAcciones=jPanelAccionesSaldosVencidosProveedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSaldosVencidosProveedores;
			
			
			processRunnable.jmenuBar=jmenuBarSaldosVencidosProveedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSaldosVencidosProveedores;
			processRunnable.jTtoolBar=jTtoolBarSaldosVencidosProveedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSaldosVencidosProveedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSaldosVencidosProveedores ,jPanelParametrosReportesSaldosVencidosProveedores, jTableDatosSaldosVencidosProveedores,/*jScrollPanelDatosSaldosVencidosProveedores,*/jPanelCamposSaldosVencidosProveedores,jPanelPaginacionSaldosVencidosProveedores, /*jScrollPanelDatosEdicionSaldosVencidosProveedores,*/ jPanelAccionesSaldosVencidosProveedores,jPanelAccionesFormularioSaldosVencidosProveedores,jmenuBarSaldosVencidosProveedores,jmenuBarDetalleSaldosVencidosProveedores,jTtoolBarSaldosVencidosProveedores,jTtoolBarDetalleSaldosVencidosProveedores));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSaldosVencidosProveedores(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSaldosVencidosProveedores(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSaldosVencidosProveedores(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSaldosVencidosProveedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSaldosVencidosProveedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSaldosVencidosProveedores,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSaldosVencidosProveedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSaldosVencidosProveedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSaldosVencidosProveedores,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.saldosvencidosproveedoresConstantesFunciones.getsFinalQuerySaldosVencidosProveedores();
		String  finalQueryPaginacionTodos=this.saldosvencidosproveedoresConstantesFunciones.getsFinalQuerySaldosVencidosProveedores();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=SaldosVencidosProveedoresConstantesFunciones.getArrayColumnasGlobalesNoSaldosVencidosProveedores(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SaldosVencidosProveedoresConstantesFunciones.getArrayColumnasGlobalesSaldosVencidosProveedores(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SaldosVencidosProveedoresConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.saldosvencidosproveedoressEliminados= new ArrayList<SaldosVencidosProveedores>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSaldosVencidosProveedores();
		
				///*SaldosVencidosProveedoresSessionBean*/this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean();
			
			if(this.saldosvencidosproveedoresSessionBean==null) {
				this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=SaldosVencidosProveedoresConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SaldosVencidosProveedoresConstantesFunciones.getClassesForeignKeysOfSaldosVencidosProveedores(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/saldosvencidosproveedores."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			saldosvencidosproveedoressAux= new ArrayList<SaldosVencidosProveedores>();
			
				
			saldosvencidosproveedoresLogic.setDatosCliente(this.datosCliente);
			saldosvencidosproveedoresLogic.setDatosDeep(this.datosDeep);
			saldosvencidosproveedoresLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaSaldosVencidosProveedores")) {
				this.sDetalleReporte=SaldosVencidosProveedoresConstantesFunciones.getDetalleIndiceBusquedaSaldosVencidosProveedores(id_grupo_clienteBusquedaSaldosVencidosProveedores);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldosvencidosproveedoresLogic.getSaldosVencidosProveedoressBusquedaSaldosVencidosProveedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_grupo_clienteBusquedaSaldosVencidosProveedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldosVencidosProveedoresConstantesFunciones.getDetalleIndiceBusquedaSaldosVencidosProveedores(id_grupo_clienteBusquedaSaldosVencidosProveedores);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldosVencidosProveedoresConstantesFunciones.getDetalleIndiceBusquedaSaldosVencidosProveedores(id_grupo_clienteBusquedaSaldosVencidosProveedores);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()==null||saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldosvencidosproveedoress==null|| saldosvencidosproveedoress.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldosvencidosproveedoressAux=new ArrayList<SaldosVencidosProveedores>();
						saldosvencidosproveedoressAux.addAll(saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldosvencidosproveedoressAux=new ArrayList<SaldosVencidosProveedores>();
							saldosvencidosproveedoressAux.addAll(saldosvencidosproveedoress);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldosvencidosproveedoresLogic.getSaldosVencidosProveedoressBusquedaSaldosVencidosProveedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_grupo_clienteBusquedaSaldosVencidosProveedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldosVencidosProveedoresConstantesFunciones.getDetalleIndiceBusquedaSaldosVencidosProveedores(id_grupo_clienteBusquedaSaldosVencidosProveedores);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldosVencidosProveedoresConstantesFunciones.getDetalleIndiceBusquedaSaldosVencidosProveedores(id_grupo_clienteBusquedaSaldosVencidosProveedores);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldosVencidosProveedoress("BusquedaSaldosVencidosProveedores",saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldosVencidosProveedoress("BusquedaSaldosVencidosProveedores",saldosvencidosproveedoress);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldosvencidosproveedoresLogic.setSaldosVencidosProveedoress(new ArrayList<SaldosVencidosProveedores>());
						saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().addAll(saldosvencidosproveedoressAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldosvencidosproveedoress=new ArrayList<SaldosVencidosProveedores>();
							saldosvencidosproveedoress.addAll(saldosvencidosproveedoressAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSaldosVencidosProveedores();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSaldosVencidosProveedores();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldosvencidosproveedoress.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldosvencidosproveedoress.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SaldosVencidosProveedores saldosvencidosproveedores) {
		Boolean permite=true;
		
		if(this.saldosvencidosproveedores.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SaldosVencidosProveedoresConstantesFunciones.getOrderByListaSaldosVencidosProveedores();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SaldosVencidosProveedoresConstantesFunciones.getOrderByListaSaldosVencidosProveedores();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
				if(saldosvencidosproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					saldosvencidosproveedoresTotales=saldosvencidosproveedores;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosVencidosProveedores saldosvencidosproveedores:this.saldosvencidosproveedoress) {
				if(saldosvencidosproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					saldosvencidosproveedoresTotales=saldosvencidosproveedores;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.saldosvencidosproveedoresAux=new SaldosVencidosProveedores();
			this.saldosvencidosproveedoresAux.setsType(Constantes2.S_TOTALES);
			this.saldosvencidosproveedoresAux.setIsNew(false);
			this.saldosvencidosproveedoresAux.setIsChanged(false);
			this.saldosvencidosproveedoresAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//SaldosVencidosProveedoresConstantesFunciones.TotalizarValoresFilaSaldosVencidosProveedores(this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress(),this.saldosvencidosproveedoresAux);
				
				//this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().add(this.saldosvencidosproveedoresAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SaldosVencidosProveedoresConstantesFunciones.TotalizarValoresFilaSaldosVencidosProveedores(this.saldosvencidosproveedoress,this.saldosvencidosproveedoresAux);
				
				this.saldosvencidosproveedoress.add(this.saldosvencidosproveedoresAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		saldosvencidosproveedoresTotales=new SaldosVencidosProveedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().remove(saldosvencidosproveedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.saldosvencidosproveedoress.remove(saldosvencidosproveedoresTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		saldosvencidosproveedoresTotales=new SaldosVencidosProveedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
				if(saldosvencidosproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					saldosvencidosproveedoresTotales=saldosvencidosproveedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SaldosVencidosProveedoresConstantesFunciones.TotalizarValoresFilaSaldosVencidosProveedores(this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress(),saldosvencidosproveedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosVencidosProveedores saldosvencidosproveedores:this.saldosvencidosproveedoress) {
				if(saldosvencidosproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					saldosvencidosproveedoresTotales=saldosvencidosproveedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SaldosVencidosProveedoresConstantesFunciones.TotalizarValoresFilaSaldosVencidosProveedores(this.saldosvencidosproveedoress,saldosvencidosproveedoresTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSaldosVencidosProveedoressBusquedaSaldosVencidosProveedores()throws Exception {
		try {
			sAccionBusqueda="BusquedaSaldosVencidosProveedores";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosVencidosProveedoressFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosVencidosProveedoressFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosVencidosProveedoressFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosVencidosProveedoressFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosVencidosProveedoressFK_IdMoneda()throws Exception {
		try {
			sAccionBusqueda="FK_IdMoneda";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSaldosVencidosProveedoressBusquedaSaldosVencidosProveedores(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldosvencidosproveedoresLogic.getSaldosVencidosProveedoressBusquedaSaldosVencidosProveedores(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosVencidosProveedoressFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldosvencidosproveedoresLogic.getSaldosVencidosProveedoressFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosVencidosProveedoressFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldosvencidosproveedoresLogic.getSaldosVencidosProveedoressFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosVencidosProveedoressFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldosvencidosproveedoresLogic.getSaldosVencidosProveedoressFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosVencidosProveedoressFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldosvencidosproveedoresLogic.getSaldosVencidosProveedoressFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosVencidosProveedoressFK_IdMoneda(String sFinalQuery,Long id_moneda)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldosvencidosproveedoresLogic.getSaldosVencidosProveedoressFK_IdMoneda(sFinalQuery,this.pagination,id_moneda);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosSaldosVencidosProveedores() {
		this.isPermisoTodoSaldosVencidosProveedores=false;
		this.isPermisoNuevoSaldosVencidosProveedores=false;
		this.isPermisoActualizarSaldosVencidosProveedores=false;
		this.isPermisoActualizarOriginalSaldosVencidosProveedores=false;
		this.isPermisoEliminarSaldosVencidosProveedores=false;
		this.isPermisoGuardarCambiosSaldosVencidosProveedores=false;
		this.isPermisoConsultaSaldosVencidosProveedores=true;
		this.isPermisoBusquedaSaldosVencidosProveedores=true;
		this.isPermisoReporteSaldosVencidosProveedores=true;
		this.isPermisoOrdenSaldosVencidosProveedores=false;		
		this.isPermisoPaginacionMedioSaldosVencidosProveedores=false;		
		this.isPermisoPaginacionAltoSaldosVencidosProveedores=false;		
		this.isPermisoPaginacionTodoSaldosVencidosProveedores=false;		
		this.isPermisoCopiarSaldosVencidosProveedores=false;		
		this.isPermisoVerFormSaldosVencidosProveedores=false;		
		this.isPermisoDuplicarSaldosVencidosProveedores=false;
		this.isPermisoOrdenSaldosVencidosProveedores=false;
	}
	
	public void setPermisosUsuarioSaldosVencidosProveedores(Boolean isPermiso) {
		this.isPermisoTodoSaldosVencidosProveedores=isPermiso;
		this.isPermisoNuevoSaldosVencidosProveedores=isPermiso;
		this.isPermisoActualizarSaldosVencidosProveedores=isPermiso;
		this.isPermisoActualizarOriginalSaldosVencidosProveedores=isPermiso;
		this.isPermisoEliminarSaldosVencidosProveedores=isPermiso;
		this.isPermisoGuardarCambiosSaldosVencidosProveedores=isPermiso;
		this.isPermisoConsultaSaldosVencidosProveedores=isPermiso;
		this.isPermisoBusquedaSaldosVencidosProveedores=isPermiso;
		this.isPermisoReporteSaldosVencidosProveedores=isPermiso;
		this.isPermisoOrdenSaldosVencidosProveedores=isPermiso;		
		this.isPermisoPaginacionMedioSaldosVencidosProveedores=isPermiso;		
		this.isPermisoPaginacionAltoSaldosVencidosProveedores=isPermiso;		
		this.isPermisoPaginacionTodoSaldosVencidosProveedores=isPermiso;		
		this.isPermisoCopiarSaldosVencidosProveedores=isPermiso;		
		this.isPermisoVerFormSaldosVencidosProveedores=isPermiso;		
		this.isPermisoDuplicarSaldosVencidosProveedores=isPermiso;
		this.isPermisoOrdenSaldosVencidosProveedores=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSaldosVencidosProveedores(Boolean isPermiso) {
		//this.isPermisoTodoSaldosVencidosProveedores=isPermiso;
		this.isPermisoNuevoSaldosVencidosProveedores=isPermiso;
		this.isPermisoActualizarSaldosVencidosProveedores=isPermiso;
		this.isPermisoActualizarOriginalSaldosVencidosProveedores=isPermiso;
		this.isPermisoEliminarSaldosVencidosProveedores=isPermiso;
		this.isPermisoGuardarCambiosSaldosVencidosProveedores=isPermiso;
		//this.isPermisoConsultaSaldosVencidosProveedores=isPermiso;
		//this.isPermisoBusquedaSaldosVencidosProveedores=isPermiso;
		//this.isPermisoReporteSaldosVencidosProveedores=isPermiso;
		//this.isPermisoOrdenSaldosVencidosProveedores=isPermiso;		
		//this.isPermisoPaginacionMedioSaldosVencidosProveedores=isPermiso;		
		//this.isPermisoPaginacionAltoSaldosVencidosProveedores=isPermiso;		
		//this.isPermisoPaginacionTodoSaldosVencidosProveedores=isPermiso;		
		//this.isPermisoCopiarSaldosVencidosProveedores=isPermiso;		
		//this.isPermisoDuplicarSaldosVencidosProveedores=isPermiso;
		//this.isPermisoOrdenSaldosVencidosProveedores=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSaldosVencidosProveedoresClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SaldosVencidosProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebSaldosVencidosProveedores(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSaldosVencidosProveedoresClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSaldosVencidosProveedoresClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSaldosVencidosProveedoresClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSaldosVencidosProveedoresClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSaldosVencidosProveedores() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SaldosVencidosProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SaldosVencidosProveedoresConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSaldosVencidosProveedores=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSaldosVencidosProveedores=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSaldosVencidosProveedores=this.isPermisoActualizarSaldosVencidosProveedores;
			this.isPermisoEliminarSaldosVencidosProveedores=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSaldosVencidosProveedores=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSaldosVencidosProveedores=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSaldosVencidosProveedores=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSaldosVencidosProveedores=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSaldosVencidosProveedores=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSaldosVencidosProveedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSaldosVencidosProveedores=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSaldosVencidosProveedores=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSaldosVencidosProveedores=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSaldosVencidosProveedores=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSaldosVencidosProveedores=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSaldosVencidosProveedores=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSaldosVencidosProveedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSaldosVencidosProveedores.setToolTipText(this.jTableDatosSaldosVencidosProveedores.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSaldosVencidosProveedores(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSaldosVencidosProveedores(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SaldosVencidosProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(SaldosVencidosProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioSaldosVencidosProveedores() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeySaldosVencidosProveedoresListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.grupoclientesForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
				this.monedasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySaldosVencidosProveedoresListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SaldosVencidosProveedoresJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMonedaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyGrupoClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.grupoclientesForeignKey==null||this.grupoclientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesGrupoCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GrupoClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosGrupoClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMonedaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.monedasForeignKey==null||this.monedasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MonedaConstantesFunciones.getArrayColumnasGlobalesMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MonedaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MonedaConstantesFunciones.SFINALQUERY;

				this.cargarCombosMonedasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeySaldosVencidosProveedores()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyGrupoCliente();
			this.addItemDefectoCombosForeignKeyFactura();
			this.addItemDefectoCombosForeignKeyMoneda();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.saldosvencidosproveedoresSessionBean==null) {
				this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean();
			}

			if(!this.saldosvencidosproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyGrupoCliente()throws Exception {
		try {

			if(!this.saldosvencidosproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				GrupoCliente grupocliente=new GrupoCliente();
				GrupoClienteConstantesFunciones.setGrupoClienteDescripcion(grupocliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				grupocliente.setId(null);

				if(!GrupoClienteConstantesFunciones.ExisteEnLista(this.grupoclientesForeignKey,grupocliente,true)) {

					this.grupoclientesForeignKey.add(0,grupocliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.saldosvencidosproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				Factura factura=new Factura();
				FacturaConstantesFunciones.setFacturaDescripcion(factura,Constantes.SMENSAJE_ESCOJA_OPCION);
				factura.setId(null);

				if(!FacturaConstantesFunciones.ExisteEnLista(this.facturasForeignKey,factura,true)) {

					this.facturasForeignKey.add(0,factura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMoneda()throws Exception {
		try {

			if(!this.saldosvencidosproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {
				Moneda moneda=new Moneda();
				MonedaConstantesFunciones.setMonedaDescripcion(moneda,Constantes.SMENSAJE_ESCOJA_OPCION);
				moneda.setId(null);

				if(!MonedaConstantesFunciones.ExisteEnLista(this.monedasForeignKey,moneda,true)) {

					this.monedasForeignKey.add(0,moneda);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.saldosvencidosproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySaldosVencidosProveedores()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySaldosVencidosProveedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySaldosVencidosProveedores()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySaldosVencidosProveedores();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores)throws Exception {	
		try {
			
			this.setActualFacturaForeignKey(saldosvencidosproveedores.getid_factura(),false,"Formulario");
			this.setActualMonedaForeignKey(saldosvencidosproveedores.getid_moneda(),false,"Formulario");
			this.setActualClienteForeignKey(saldosvencidosproveedores.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySaldosVencidosProveedores()throws Exception {	
		try {
			
			this.setActualFacturaForeignKey(this.saldosvencidosproveedoresConstantesFunciones.getid_factura(),false,"Formulario");
			this.setActualMonedaForeignKey(this.saldosvencidosproveedoresConstantesFunciones.getid_moneda(),false,"Formulario");
			this.setActualClienteForeignKey(this.saldosvencidosproveedoresConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySaldosVencidosProveedores()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySaldosVencidosProveedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySaldosVencidosProveedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSaldosVencidosProveedores()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySaldosVencidosProveedores()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameGrupoClientesForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");
			this.cargarCombosFrameMonedasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySaldosVencidosProveedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMonedasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySaldosVencidosProveedores()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public SaldosVencidosProveedoresBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SaldosVencidosProveedoresBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SaldosVencidosProveedoresBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean(); 
		this.saldosvencidosproveedoresConstantesFunciones=new SaldosVencidosProveedoresConstantesFunciones(); 
		this.saldosvencidosproveedoresBean=new SaldosVencidosProveedores();//(this.saldosvencidosproveedoresConstantesFunciones); 		
		this.saldosvencidosproveedoresReturnGeneral=new SaldosVencidosProveedoresParameterReturnGeneral(); 
		
		this.saldosvencidosproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldosvencidosproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SaldosVencidosProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SaldosVencidosProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SaldosVencidosProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSaldosVencidosProveedores(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.saldosvencidosproveedoresConstantesFunciones=new SaldosVencidosProveedoresConstantesFunciones(); 
			this.saldosvencidosproveedoresBean=new SaldosVencidosProveedores();//this.saldosvencidosproveedoresConstantesFunciones); 			
			this.saldosvencidosproveedoresReturnGeneral=new SaldosVencidosProveedoresParameterReturnGeneral(); 
		
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Saldos Vencidos Proveedores Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.saldosvencidosproveedores=new SaldosVencidosProveedores();
			this.saldosvencidosproveedoress = new ArrayList<SaldosVencidosProveedores>();
			this.saldosvencidosproveedoressAux = new ArrayList<SaldosVencidosProveedores>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic=new SaldosVencidosProveedoresLogic();
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.saldosvencidosproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.saldosvencidosproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSaldosVencidosProveedores);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSaldosVencidosProveedores);	
					}
					
					if(this.jInternalFrameImportacionSaldosVencidosProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSaldosVencidosProveedores);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySaldosVencidosProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySaldosVencidosProveedores);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSaldosVencidosProveedores);
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.setVisible(false);
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores);
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setVisible(false);
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSaldosVencidosProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSaldosVencidosProveedores);
					this.jInternalFrameImportacionSaldosVencidosProveedores.setVisible(false);
					this.jInternalFrameImportacionSaldosVencidosProveedores.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySaldosVencidosProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySaldosVencidosProveedores);
					this.jInternalFrameOrderBySaldosVencidosProveedores.setVisible(false);
					this.jInternalFrameOrderBySaldosVencidosProveedores.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSaldosVencidosProveedoresActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SaldosVencidosProveedoresConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.saldosvencidosproveedoresReturnGeneral=new SaldosVencidosProveedoresParameterReturnGeneral();
			
			this.saldosvencidosproveedoresParameterGeneral=new SaldosVencidosProveedoresParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.saldosvencidosproveedoresLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(SaldosVencidosProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SaldosVencidosProveedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado(),this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SaldosVencidosProveedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado(),this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaDuplicarSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaCopiarSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaVerFormSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaOrdenSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaModificarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=false;
			
			
			this.isVisibilidadBusquedaSaldosVencidosProveedores=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			this.isVisibilidadFK_IdMoneda=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSaldosVencidosProveedores();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSaldosVencidosProveedores(false);
			
			this.setPermisosUsuarioSaldosVencidosProveedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() 
				|| (this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() && this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSaldosVencidosProveedoresClasesRelacionadas();
			}
			
			if(this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSaldosVencidosProveedoresClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSaldosVencidosProveedores();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSaldosVencidosProveedores();
			}
			
			if(!this.isPermisoBusquedaSaldosVencidosProveedores) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SaldosVencidosProveedoresConstantesFunciones.getTiposSeleccionarSaldosVencidosProveedores());
				
				this.tiposColumnasSelect=SaldosVencidosProveedoresConstantesFunciones.getTiposSeleccionarSaldosVencidosProveedores(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSaldosVencidosProveedores();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioSaldosVencidosProveedores(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioSaldosVencidosProveedores(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldosVencidosProveedores() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.grupoclienteLogic=new GrupoClienteLogic();
			this.facturaLogic=new FacturaLogic();
			this.monedaLogic=new MonedaLogic();
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				saldosvencidosproveedoresImplementable= (SaldosVencidosProveedoresImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SaldosVencidosProveedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				saldosvencidosproveedoresImplementableHome= (SaldosVencidosProveedoresImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SaldosVencidosProveedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.saldosvencidosproveedoress= new ArrayList<SaldosVencidosProveedores>();
			this.saldosvencidosproveedoressEliminados= new ArrayList<SaldosVencidosProveedores>();
						
			this.isEsNuevoSaldosVencidosProveedores=false;
			this.esParaAccionDesdeFormularioSaldosVencidosProveedores=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			this.monedasForeignKey=new ArrayList<Moneda>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySaldosVencidosProveedores(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSaldosVencidosProveedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SaldosVencidosProveedoresConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSaldosVencidosProveedores(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSaldosVencidosProveedores();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSaldosVencidosProveedores();
			}
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSaldosVencidosProveedores.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSaldosVencidosProveedores.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSaldosVencidosProveedores.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSaldosVencidosProveedores(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SaldosVencidosProveedores: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSaldosVencidosProveedores() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSaldosVencidosProveedores")) {
				iIndex=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTabbedPaneRelacionesSaldosVencidosProveedores.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTabbedPaneRelacionesSaldosVencidosProveedores.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSaldosVencidosProveedores();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeySaldosVencidosProveedores(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySaldosVencidosProveedores(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySaldosVencidosProveedores(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySaldosVencidosProveedoresListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySaldosVencidosProveedores();
		
		this.cargarCombosFrameForeignKeySaldosVencidosProveedores();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySaldosVencidosProveedores();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySaldosVencidosProveedores();
		}
	}
	
	

	public void cargarCombosForeignKeyGrupoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrupoCliente(this.grupoclientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactura(this.facturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMoneda(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMonedaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMoneda();
				this.cargarCombosFrameMonedasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMoneda(this.monedasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSaldosVencidosProveedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
			
			if(jTableDatosSaldosVencidosProveedores.getRowCount()>=1) {
				jTableDatosSaldosVencidosProveedores.removeRowSelectionInterval(0, jTableDatosSaldosVencidosProveedores.getRowCount()-1);						
			}
			
			this.isEsNuevoSaldosVencidosProveedores=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSaldosVencidosProveedores(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSaldosVencidosProveedores(true);			
			//this.saldosvencidosproveedores=new SaldosVencidosProveedores();
			//this.saldosvencidosproveedores.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldosVencidosProveedores(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosVencidosProveedores() ;
			
			if(SaldosVencidosProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldosVencidosProveedores(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.saldosvencidosproveedores);	
			this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);				
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
			if(this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SaldosVencidosProveedores: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSaldosVencidosProveedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSaldosVencidosProveedores.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSaldosVencidosProveedores.getSelectedRows().length;			
			}
			
			saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSaldosVencidosProveedores--;			
				//SaldosVencidosProveedores saldosvencidosproveedoresAux= new SaldosVencidosProveedores();			
				//saldosvencidosproveedoresAux.setId(this.iIdNuevoSaldosVencidosProveedores);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SaldosVencidosProveedores saldosvencidosproveedoresOrigen=new SaldosVencidosProveedores();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SaldosVencidosProveedores saldosvencidosproveedoresOrigen : saldosvencidosproveedoressSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							saldosvencidosproveedoresOrigen =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldosvencidosproveedoresOrigen =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSaldosVencidosProveedores();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.saldosvencidosproveedores.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSaldosVencidosProveedores(saldosvencidosproveedoresOrigen,this.saldosvencidosproveedores,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().add(this.saldosvencidosproveedoresAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedoress.add(this.saldosvencidosproveedoresAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
				
				this.jTableDatosSaldosVencidosProveedores.setRowSelectionInterval(this.getIndiceNuevoSaldosVencidosProveedores(), this.getIndiceNuevoSaldosVencidosProveedores());
				
				int iLastRow =  this.jTableDatosSaldosVencidosProveedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSaldosVencidosProveedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSaldosVencidosProveedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();									
		
			SaldosVencidosProveedores saldosvencidosproveedoresOrigen=new SaldosVencidosProveedores();
			SaldosVencidosProveedores saldosvencidosproveedoresDestino=new SaldosVencidosProveedores();
				
			saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSaldosVencidosProveedores.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || saldosvencidosproveedoressSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSaldosVencidosProveedores.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldosvencidosproveedoresOrigen =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						saldosvencidosproveedoresOrigen =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldosvencidosproveedoresDestino =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						saldosvencidosproveedoresDestino =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				saldosvencidosproveedoresOrigen =saldosvencidosproveedoressSeleccionados.get(0);
				saldosvencidosproveedoresDestino =saldosvencidosproveedoressSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSaldosVencidosProveedores(saldosvencidosproveedoresOrigen,saldosvencidosproveedoresDestino,true,false);
				
				saldosvencidosproveedoresDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(saldosvencidosproveedoresDestino,saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldosvencidosproveedoresDestino,saldosvencidosproveedoress);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
				
				//this.jTableDatosSaldosVencidosProveedores.setRowSelectionInterval(this.getIndiceNuevoSaldosVencidosProveedores(), this.getIndiceNuevoSaldosVencidosProveedores());
				
				int iLastRow =  this.jTableDatosSaldosVencidosProveedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSaldosVencidosProveedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSaldosVencidosProveedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSaldosVencidosProveedores.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSaldosVencidosProveedores.setVisible(!isVisible);
			this.jPanelPaginacionSaldosVencidosProveedores.setVisible(!isVisible);
			this.jPanelAccionesSaldosVencidosProveedores.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSaldosVencidosProveedores();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSaldosVencidosProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSaldosVencidosProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySaldosVencidosProveedores();
			
			this.abrirFrameOrderBySaldosVencidosProveedores();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySaldosVencidosProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSaldosVencidosProveedores(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSaldosVencidosProveedores);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.isMaximum()) {
					this.jInternalFrameDetalleFormSaldosVencidosProveedores.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSaldosVencidosProveedores.setSize(this.jInternalFrameDetalleFormSaldosVencidosProveedores.iWidthFormulario,this.jInternalFrameDetalleFormSaldosVencidosProveedores.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSaldosVencidosProveedores.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSaldosVencidosProveedores.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSaldosVencidosProveedores.isMaximum()) {
						this.jInternalFrameDetalleFormSaldosVencidosProveedores.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jContentPaneDetalleSaldosVencidosProveedores.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTabbedPaneRelacionesSaldosVencidosProveedores.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jContentPaneDetalleSaldosVencidosProveedores.getWidth(),SaldosVencidosProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTabbedPaneRelacionesSaldosVencidosProveedores.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jContentPaneDetalleSaldosVencidosProveedores.getWidth(),SaldosVencidosProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTabbedPaneRelacionesSaldosVencidosProveedores.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jContentPaneDetalleSaldosVencidosProveedores.getWidth(),SaldosVencidosProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSaldosVencidosProveedores.setVisible(true);
	        this.jInternalFrameDetalleFormSaldosVencidosProveedores.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySaldosVencidosProveedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySaldosVencidosProveedores==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySaldosVencidosProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosVencidosProveedores,false,this);
				} else {
					this.jInternalFrameOrderBySaldosVencidosProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosVencidosProveedores,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySaldosVencidosProveedores);
				this.jInternalFrameOrderBySaldosVencidosProveedores.setVisible(false);
				this.jInternalFrameOrderBySaldosVencidosProveedores.setSelected(false);
				
				this.jInternalFrameOrderBySaldosVencidosProveedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySaldosVencidosProveedores"));
				
				this.inicializarActualizarBindingTablaOrderBySaldosVencidosProveedores();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSaldosVencidosProveedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSaldosVencidosProveedores==null) {
				
				this.jInternalFrameImportacionSaldosVencidosProveedores=new ImportacionJInternalFrame(SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSaldosVencidosProveedores);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSaldosVencidosProveedores);
				this.jInternalFrameImportacionSaldosVencidosProveedores.setVisible(false);
				this.jInternalFrameImportacionSaldosVencidosProveedores.setSelected(false);


				this.jInternalFrameImportacionSaldosVencidosProveedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSaldosVencidosProveedores"));
				this.jInternalFrameImportacionSaldosVencidosProveedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSaldosVencidosProveedores"));
				this.jInternalFrameImportacionSaldosVencidosProveedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSaldosVencidosProveedores"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSaldosVencidosProveedores() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores==null) {
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores=new ReporteDinamicoJInternalFrame(SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSaldosVencidosProveedores);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores);
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setVisible(false);
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldosVencidosProveedores"));
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldosVencidosProveedores"));
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldosVencidosProveedores"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldosVencidosProveedores();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSaldosVencidosProveedores() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSaldosVencidosProveedores);
			
	       	this.jInternalFrameDetalleFormSaldosVencidosProveedores.setVisible(false);
	        this.jInternalFrameDetalleFormSaldosVencidosProveedores.setSelected(false);
			
			//this.jInternalFrameDetalleFormSaldosVencidosProveedores.dispose();
			//this.jInternalFrameDetalleFormSaldosVencidosProveedores=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSaldosVencidosProveedores() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setVisible(true);
	        this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSaldosVencidosProveedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSaldosVencidosProveedores.setVisible(true);
	        this.jInternalFrameImportacionSaldosVencidosProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySaldosVencidosProveedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySaldosVencidosProveedores.setVisible(true);
	        this.jInternalFrameOrderBySaldosVencidosProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySaldosVencidosProveedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySaldosVencidosProveedores.setVisible(false);
	        this.jInternalFrameOrderBySaldosVencidosProveedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSaldosVencidosProveedores() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setVisible(false);
	        this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSaldosVencidosProveedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSaldosVencidosProveedores.setVisible(false);
	        this.jInternalFrameImportacionSaldosVencidosProveedores.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSaldosVencidosProveedores(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSaldosVencidosProveedores(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSaldosVencidosProveedores(true);
			//this.isEsNuevoSaldosVencidosProveedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldosVencidosProveedores(false) ;
			
			if(saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SaldosVencidosProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldosVencidosProveedores(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosVencidosProveedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSaldosVencidosProveedoresActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSaldosVencidosProveedores(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSaldosVencidosProveedores(true);
			//this.isEsNuevoSaldosVencidosProveedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.saldosvencidosproveedores.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSaldosVencidosProveedores(false) ;
			
			if(SaldosVencidosProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldosVencidosProveedores(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosVencidosProveedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaGrupoCliente(List<GrupoCliente> grupoclientesForeignKey)throws Exception{
		TableColumn tableColumnGrupoCliente=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoclienteTableCellFk.setRowActual(intSelectedRow);
			//grupoclienteTableCellFk.setgrupoclientesForeignKeyActual(grupoclientesForeignKey);
		//}


		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.RecargarGrupoClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMoneda(List<Moneda> monedasForeignKey)throws Exception{
		TableColumn tableColumnMoneda=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA));
		TableCellEditor tableCellEditorMoneda =tableColumnMoneda.getCellEditor();

		MonedaTableCell monedaTableCellFk=(MonedaTableCell)tableCellEditorMoneda;

		if(monedaTableCellFk!=null) {
			monedaTableCellFk.setmonedasForeignKey(monedasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

		//if(intSelectedRow<=0) {
			//monedaTableCellFk.setRowActual(intSelectedRow);
			//monedaTableCellFk.setmonedasForeignKeyActual(monedasForeignKey);
		//}


		if(monedaTableCellFk!=null) {
			monedaTableCellFk.RecargarMonedasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSaldosVencidosProveedores(false);
			
			//if(!this.isEsNuevoSaldosVencidosProveedores) {								
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				
			}
			
			if(this.permiteMantenimiento(this.saldosvencidosproveedores)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSaldosVencidosProveedores=true;
					this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
					this.isEsNuevoSaldosVencidosProveedores=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSaldosVencidosProveedores=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSaldosVencidosProveedores=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSaldosVencidosProveedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldosVencidosProveedores(false);
				
				this.habilitarDeshabilitarControlesSaldosVencidosProveedores(false);
			
												
				
				if(SaldosVencidosProveedoresJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSaldosVencidosProveedores();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,saldosvencidosproveedoresSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSaldosVencidosProveedores(this.saldosvencidosproveedores,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSaldosVencidosProveedores.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,saldosvencidosproveedoresSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.saldosvencidosproveedores.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				this.saldosvencidosproveedores.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				this.saldosvencidosproveedores.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.saldosvencidosproveedores)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SaldosVencidosProveedoresModel) this.jTableDatosSaldosVencidosProveedores.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSaldosVencidosProveedores=true;
				this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
				this.isEsNuevoSaldosVencidosProveedores=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSaldosVencidosProveedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldosVencidosProveedores(false);
				
				this.habilitarDeshabilitarControlesSaldosVencidosProveedores(false);
				
				
				
				if(SaldosVencidosProveedoresJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSaldosVencidosProveedores();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSaldosVencidosProveedores.getRowCount()>=1) {
				jTableDatosSaldosVencidosProveedores.removeRowSelectionInterval(0, jTableDatosSaldosVencidosProveedores.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSaldosVencidosProveedores(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldosVencidosProveedores(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosVencidosProveedores(false) ;
			
			this.isEsNuevoSaldosVencidosProveedores=false;
			
			if(SaldosVencidosProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSaldosVencidosProveedores();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				
				//SI ES MANUAL
				if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSaldosVencidosProveedores();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSaldosVencidosProveedores--;			
			//SaldosVencidosProveedores saldosvencidosproveedoresAux= new SaldosVencidosProveedores();			
			//saldosvencidosproveedoresAux.setId(this.iIdNuevoSaldosVencidosProveedores);
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSaldosVencidosProveedores();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
			
			this.saldosvencidosproveedores.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().add(this.saldosvencidosproveedoresAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.saldosvencidosproveedoress.add(this.saldosvencidosproveedoresAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
			
			this.jTableDatosSaldosVencidosProveedores.setRowSelectionInterval(this.getIndiceNuevoSaldosVencidosProveedores(), this.getIndiceNuevoSaldosVencidosProveedores());
			
			int iLastRow =  this.jTableDatosSaldosVencidosProveedores.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSaldosVencidosProveedores.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSaldosVencidosProveedores.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosVencidosProveedores(false);
			
			//SI ES MANUAL
			if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldosVencidosProveedores();
			}
			
			//this.abrirFrameTreeSaldosVencidosProveedores();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSaldosVencidosProveedores.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSaldosVencidosProveedores.setFileImportacion(this.jInternalFrameImportacionSaldosVencidosProveedores.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSaldosVencidosProveedores.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSaldosVencidosProveedores.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSaldosVencidosProveedores.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSaldosVencidosProveedores.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();		

		saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SaldosVencidosProveedoresBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SaldosVencidosProveedoresBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteSaldosVencidosProveedoress("Todos",saldosvencidosproveedoressSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Vencidos Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Moneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Moneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Moneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Moneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreMoneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreMoneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreMoneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreMoneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoExtra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoExtra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoExtra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoExtra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGrupoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGrupoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGrupoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGrupoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA:
					sNombreCampoCategoria="id_moneda";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA:
					sNombreCampoCategoria="fecha_venta";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA:
					sNombreCampoCategoria="nombre_moneda";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA:
					sNombreCampoCategoria="saldo_extra";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoria="nombre_grupo_cliente";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA:
					sNombreCampoCategoriaValor="id_moneda";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA:
					sNombreCampoCategoriaValor="fecha_venta";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA:
					sNombreCampoCategoriaValor="nombre_moneda";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA:
					sNombreCampoCategoriaValor="saldo_extra";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoriaValor="nombre_grupo_cliente";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_moneda");
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_venta");
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_moneda");
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo");
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Extra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_extra");
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Grupo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_grupo_cliente");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();		
		
		saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosvencidosproveedores";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("SaldosVencidosProveedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getmoneda_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getfecha_venta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getnombre_moneda());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getsaldo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getsaldo_extra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
					iRow++;

					for(SaldosVencidosProveedores saldosvencidosproveedores:saldosvencidosproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosvencidosproveedores.getnombre_grupo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelSaldosVencidosProveedores(row);				
			//	iRow++;
			//}				
			
			//for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoressSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSaldosVencidosProveedores(saldosvencidosproveedoresAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Vencidos Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosVencidosProveedores(false);
			
			//SI ES MANUAL
			if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldosVencidosProveedores();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosVencidosProveedores(false);
			
			//SI ES MANUAL
			if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSaldosVencidosProveedores();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosVencidosProveedores(false);
			
			//SI ES MANUAL
			if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSaldosVencidosProveedores();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSaldosVencidosProveedores() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSaldosVencidosProveedores.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSaldosVencidosProveedores.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSaldosVencidosProveedores.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSaldosVencidosProveedores.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSaldosVencidosProveedores.setMinimumSize(dimensionMinimum);
		this.jTableDatosSaldosVencidosProveedores.setMaximumSize(dimensionMaximum);
		this.jTableDatosSaldosVencidosProveedores.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSaldosVencidosProveedores(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSaldosVencidosProveedores(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSaldosVencidosProveedores(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSaldosVencidosProveedores(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSaldosVencidosProveedores(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSaldosVencidosProveedores(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldosVencidosProveedores(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSaldosVencidosProveedores(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSaldosVencidosProveedores() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSaldosVencidosProveedores();
		
		this.inicializarActualizarBindingBotonesManualSaldosVencidosProveedores(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSaldosVencidosProveedores();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldosVencidosProveedores() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSaldosVencidosProveedores(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSaldosVencidosProveedores(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSaldosVencidosProveedores.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSaldosVencidosProveedores.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jCheckBoxPostAccionNuevoSaldosVencidosProveedores.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jCheckBoxPostAccionSinCerrarSaldosVencidosProveedores.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jCheckBoxPostAccionSinMensajeSaldosVencidosProveedores.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSaldosVencidosProveedores.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSaldosVencidosProveedores.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.jCheckBoxPostAccionNuevoSaldosVencidosProveedores.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.jCheckBoxPostAccionSinCerrarSaldosVencidosProveedores.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.jCheckBoxPostAccionSinMensajeSaldosVencidosProveedores.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSaldosVencidosProveedores.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSaldosVencidosProveedores.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSaldosVencidosProveedores.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSaldosVencidosProveedores.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSaldosVencidosProveedores.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSaldosVencidosProveedores.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSaldosVencidosProveedores(Boolean esInicializar) throws Exception {
		try	{	
			if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSaldosVencidosProveedores(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSaldosVencidosProveedores() throws Exception {
		try	{
			if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSaldosVencidosProveedores();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSaldosVencidosProveedores() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSaldosVencidosProveedores() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSaldosVencidosProveedores.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSaldosVencidosProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSaldosVencidosProveedores.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSaldosVencidosProveedores.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSaldosVencidosProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSaldosVencidosProveedores.addItem(reporte);
			}
			
			
			if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSaldosVencidosProveedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSaldosVencidosProveedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSaldosVencidosProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSaldosVencidosProveedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSaldosVencidosProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSaldosVencidosProveedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldosVencidosProveedores();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldosVencidosProveedores() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores!=null) {
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores!=null) {
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores!=null) {
				
				if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SaldosVencidosProveedoresConstantesFunciones.getTiposSeleccionarSaldosVencidosProveedores(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SaldosVencidosProveedoresConstantesFunciones.getTiposSeleccionarSaldosVencidosProveedores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SaldosVencidosProveedoresConstantesFunciones.getTiposSeleccionarSaldosVencidosProveedores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSaldosVencidosProveedores()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.getSelectedItem()!=null){this.id_grupo_clienteBusquedaSaldosVencidosProveedores=((GrupoCliente)this.jComboBoxid_grupo_clienteBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSaldosVencidosProveedores(Boolean esInicializar) throws Exception {				
		if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSaldosVencidosProveedores();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSaldosVencidosProveedores() throws Exception {
		this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySaldosVencidosProveedores() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSaldosVencidosProveedoresOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedoresOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSaldosVencidosProveedores(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=saldosvencidosproveedoress.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSaldosVencidosProveedores.setModel(new SaldosVencidosProveedoresModel(this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSaldosVencidosProveedores.setModel(new SaldosVencidosProveedoresModel(this.saldosvencidosproveedoress,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySaldosVencidosProveedores!=null && this.jInternalFrameOrderBySaldosVencidosProveedores.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySaldosVencidosProveedores();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO,saldosvencidosproveedoresConstantesFunciones.resaltarSeleccionarSaldosVencidosProveedores,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO,saldosvencidosproveedoresConstantesFunciones.resaltarSeleccionarSaldosVencidosProveedores,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_ID));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostraridSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltaridSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activaridSaldosVencidosProveedores,iSizeTabla,this,true,"idSaldosVencidosProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltaridSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activaridSaldosVencidosProveedores,this,true,"idSaldosVencidosProveedores","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_facturaSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.saldosvencidosproveedoresConstantesFunciones.resaltarid_facturaSaldosVencidosProveedores,this,this.saldosvencidosproveedoresConstantesFunciones.activarid_facturaSaldosVencidosProveedores,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.saldosvencidosproveedoresConstantesFunciones.resaltarid_facturaSaldosVencidosProveedores,this,this.saldosvencidosproveedoresConstantesFunciones.activarid_facturaSaldosVencidosProveedores,true,"id_facturaSaldosVencidosProveedores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_monedaSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MonedaTableCell(this.monedasForeignKey,this.saldosvencidosproveedoresConstantesFunciones.resaltarid_monedaSaldosVencidosProveedores,this,this.saldosvencidosproveedoresConstantesFunciones.activarid_monedaSaldosVencidosProveedores,iSizeTabla));
			tableColumn.setCellEditor(new MonedaTableCell(this.monedasForeignKey,this.saldosvencidosproveedoresConstantesFunciones.resaltarid_monedaSaldosVencidosProveedores,this,this.saldosvencidosproveedoresConstantesFunciones.activarid_monedaSaldosVencidosProveedores,true,"id_monedaSaldosVencidosProveedores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_clienteSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.saldosvencidosproveedoresConstantesFunciones.resaltarid_clienteSaldosVencidosProveedores,this,this.saldosvencidosproveedoresConstantesFunciones.activarid_clienteSaldosVencidosProveedores,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.saldosvencidosproveedoresConstantesFunciones.resaltarid_clienteSaldosVencidosProveedores,this,this.saldosvencidosproveedoresConstantesFunciones.activarid_clienteSaldosVencidosProveedores,true,"id_clienteSaldosVencidosProveedores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarnumero_facturaSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarnumero_facturaSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarnumero_facturaSaldosVencidosProveedores,iSizeTabla,this,true,"numero_facturaSaldosVencidosProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarnumero_facturaSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarnumero_facturaSaldosVencidosProveedores,this,true,"numero_facturaSaldosVencidosProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarfecha_emisionSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarfecha_emisionSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarfecha_emisionSaldosVencidosProveedores,iSizeTabla,this,true,"fecha_emisionSaldosVencidosProveedores","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarfecha_emisionSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarfecha_emisionSaldosVencidosProveedores,this,true,"fecha_emisionSaldosVencidosProveedores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarfecha_ventaSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarfecha_ventaSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarfecha_ventaSaldosVencidosProveedores,iSizeTabla,this,true,"fecha_ventaSaldosVencidosProveedores","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarfecha_ventaSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarfecha_ventaSaldosVencidosProveedores,this,true,"fecha_ventaSaldosVencidosProveedores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarnombre_monedaSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_monedaSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarnombre_monedaSaldosVencidosProveedores,iSizeTabla,this,true,"nombre_monedaSaldosVencidosProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_monedaSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarnombre_monedaSaldosVencidosProveedores,this,true,"nombre_monedaSaldosVencidosProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarsaldoSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarsaldoSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarsaldoSaldosVencidosProveedores,iSizeTabla,this,true,"saldoSaldosVencidosProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarsaldoSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarsaldoSaldosVencidosProveedores,this,true,"saldoSaldosVencidosProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarsaldo_extraSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarsaldo_extraSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarsaldo_extraSaldosVencidosProveedores,iSizeTabla,this,true,"saldo_extraSaldosVencidosProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarsaldo_extraSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarsaldo_extraSaldosVencidosProveedores,this,true,"saldo_extraSaldosVencidosProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarnombre_clienteSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_clienteSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarnombre_clienteSaldosVencidosProveedores,iSizeTabla,this,true,"nombre_clienteSaldosVencidosProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_clienteSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarnombre_clienteSaldosVencidosProveedores,this,true,"nombre_clienteSaldosVencidosProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE));

		if(this.saldosvencidosproveedoresConstantesFunciones.mostrarnombre_grupo_clienteSaldosVencidosProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_grupo_clienteSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarnombre_grupo_clienteSaldosVencidosProveedores,iSizeTabla,this,true,"nombre_grupo_clienteSaldosVencidosProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_grupo_clienteSaldosVencidosProveedores,this.saldosvencidosproveedoresConstantesFunciones.activarnombre_grupo_clienteSaldosVencidosProveedores,this,true,"nombre_grupo_clienteSaldosVencidosProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosVencidosProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSaldosVencidosProveedores.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSaldosVencidosProveedores.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSaldosVencidosProveedores.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosSaldosVencidosProveedores.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSaldosVencidosProveedores.moveColumn(this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSaldosVencidosProveedores.moveColumn(this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSaldosVencidosProveedores.moveColumn(this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSaldosVencidosProveedores.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSaldosVencidosProveedores.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSaldosVencidosProveedores,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSaldosVencidosProveedores.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSaldosVencidosProveedores.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSaldosVencidosProveedores.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							//iSize=saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=saldosvencidosproveedoress.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosSaldosVencidosProveedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSaldosVencidosProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSaldosVencidosProveedores();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoSaldosVencidosProveedores=false;
					
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
				if(this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSaldosVencidosProveedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSaldosVencidosProveedores.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.saldosvencidosproveedores.getsType().equals("DUPLICADO")
				   || this.saldosvencidosproveedores.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSaldosVencidosProveedores=true;
				
				} else {
					this.isEsNuevoSaldosVencidosProveedores=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
					if(this.saldosvencidosproveedores.getId()>=0 && !this.saldosvencidosproveedores.getIsNew()) {						
						this.isEsNuevoSaldosVencidosProveedores=false;
						
					} else {
						this.isEsNuevoSaldosVencidosProveedores=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSaldosVencidosProveedores(esRelaciones);						
				
				this.seleccionarSaldosVencidosProveedores(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.saldosvencidosproveedores.getId()<0) {
					this.isEsNuevoSaldosVencidosProveedores=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSaldosVencidosProveedores(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSaldosVencidosProveedores(evt,rowIndex);
				}	
				
				if(this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SaldosVencidosProveedores: " + this.dDif); 
					}
				}								
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSaldosVencidosProveedores(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.saldosvencidosproveedores)) {
					if(this.saldosvencidosproveedores.getId()>0) {
						this.saldosvencidosproveedores.setIsDeleted(true);
						
						this.saldosvencidosproveedoressEliminados.add(this.saldosvencidosproveedores);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().remove(this.saldosvencidosproveedores);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedoress.remove(this.saldosvencidosproveedores);				
					}
					
					
					((SaldosVencidosProveedoresModel) this.jTableDatosSaldosVencidosProveedores.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSaldosVencidosProveedores(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSaldosVencidosProveedores) {
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSaldosVencidosProveedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSaldosVencidosProveedores.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}
				
				//ARCHITECTURE
				try {
					

					//Factura
					if(!this.saldosvencidosproveedoresConstantesFunciones.cargarid_facturaSaldosVencidosProveedores || this.saldosvencidosproveedoresConstantesFunciones.event_dependid_facturaSaldosVencidosProveedores) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.saldosvencidosproveedores.getid_factura());
									//this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(saldosvencidosproveedores.getFactura()!=null) {
							this.facturasForeignKey.add(saldosvencidosproveedores.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.saldosvencidosproveedores.getid_factura(),false,"Formulario");

					//Moneda
					if(!this.saldosvencidosproveedoresConstantesFunciones.cargarid_monedaSaldosVencidosProveedores || this.saldosvencidosproveedoresConstantesFunciones.event_dependid_monedaSaldosVencidosProveedores) {
						//this.cargarCombosMonedasForeignKeyLista(" where id="+this.saldosvencidosproveedores.getid_moneda());
									//this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
						this.monedasForeignKey=new ArrayList<Moneda>();

						if(saldosvencidosproveedores.getMoneda()!=null) {
							this.monedasForeignKey.add(saldosvencidosproveedores.getMoneda());
						}

						this.addItemDefectoCombosForeignKeyMoneda();
						this.cargarCombosFrameMonedasForeignKey("Todos");
					}
					this.setActualMonedaForeignKey(this.saldosvencidosproveedores.getid_moneda(),false,"Formulario");

					//Cliente
					if(!this.saldosvencidosproveedoresConstantesFunciones.cargarid_clienteSaldosVencidosProveedores || this.saldosvencidosproveedoresConstantesFunciones.event_dependid_clienteSaldosVencidosProveedores) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.saldosvencidosproveedores.getid_cliente());
									//this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(saldosvencidosproveedores.getCliente()!=null) {
							this.clientesForeignKey.add(saldosvencidosproveedores.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.saldosvencidosproveedores.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSaldosVencidosProveedores("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSaldosVencidosProveedores(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldosVencidosProveedores() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSaldosVencidosProveedores(saldosvencidosproveedores,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSaldosVencidosProveedores(saldosvencidosproveedores);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySaldosVencidosProveedores(saldosvencidosproveedores,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySaldosVencidosProveedores(saldosvencidosproveedores);
	}
	
	public void setVariablesObjetoActualToFormularioSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.setText(saldosvencidosproveedores.getId().toString());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnumero_facturaSaldosVencidosProveedores.setText(saldosvencidosproveedores.getnumero_factura());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_emisionSaldosVencidosProveedores.setDate(saldosvencidosproveedores.getfecha_emision());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_ventaSaldosVencidosProveedores.setDate(saldosvencidosproveedores.getfecha_venta());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnombre_monedaSaldosVencidosProveedores.setText(saldosvencidosproveedores.getnombre_moneda());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldoSaldosVencidosProveedores.setText(saldosvencidosproveedores.getsaldo().toString());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldo_extraSaldosVencidosProveedores.setText(saldosvencidosproveedores.getsaldo_extra().toString());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_clienteSaldosVencidosProveedores.setText(saldosvencidosproveedores.getnombre_cliente());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setText(saldosvencidosproveedores.getnombre_grupo_cliente());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SaldosVencidosProveedores saldosvencidosproveedoresLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,saldosvencidosproveedoresLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SaldosVencidosProveedores saldosvencidosproveedoresLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				saldosvencidosproveedoresLocal=this.saldosvencidosproveedores;
			} else {
				saldosvencidosproveedoresLocal=this.saldosvencidosproveedoresAnterior;
			}
		}
		
		if(this.permiteMantenimiento(saldosvencidosproveedoresLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSaldosVencidosProveedores(saldosvencidosproveedoresLocal,true);
					
					if(saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(saldosvencidosproveedoresLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(saldosvencidosproveedoresLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(saldosvencidosproveedores,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(saldosvencidosproveedores);
	}
	
	public void setVariablesFormularioToObjetoActualSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(saldosvencidosproveedores,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.getText()==null || this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.getText()=="" || this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.getText()=="Id") {
				this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.setText("0");
			}

			if(conColumnasBase) {saldosvencidosproveedores.setId(Long.parseLong(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosVencidosProveedoresConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelIdSaldosVencidosProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosvencidosproveedores.setnumero_factura(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnumero_facturaSaldosVencidosProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnumero_facturaSaldosVencidosProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosvencidosproveedores.setfecha_emision(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_emisionSaldosVencidosProveedores.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelfecha_emisionSaldosVencidosProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosvencidosproveedores.setfecha_venta(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_ventaSaldosVencidosProveedores.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelfecha_ventaSaldosVencidosProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosvencidosproveedores.setnombre_moneda(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnombre_monedaSaldosVencidosProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnombre_monedaSaldosVencidosProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosvencidosproveedores.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldoSaldosVencidosProveedores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelsaldoSaldosVencidosProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosvencidosproveedores.setsaldo_extra(Double.parseDouble(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldo_extraSaldosVencidosProveedores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelsaldo_extraSaldosVencidosProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosvencidosproveedores.setnombre_cliente(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_clienteSaldosVencidosProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnombre_clienteSaldosVencidosProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosvencidosproveedores.setnombre_grupo_cliente(this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_grupo_clienteSaldosVencidosProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelnombre_grupo_clienteSaldosVencidosProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedoresBean,SaldosVencidosProveedores saldosvencidosproveedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && saldosvencidosproveedoresBean.getid_factura()!=null && !saldosvencidosproveedoresBean.getid_factura().equals(-1L))) {saldosvencidosproveedores.setid_factura(saldosvencidosproveedoresBean.getid_factura());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresBean.getid_moneda()!=null && !saldosvencidosproveedoresBean.getid_moneda().equals(-1L))) {saldosvencidosproveedores.setid_moneda(saldosvencidosproveedoresBean.getid_moneda());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresBean.getid_cliente()!=null && !saldosvencidosproveedoresBean.getid_cliente().equals(-1L))) {saldosvencidosproveedores.setid_cliente(saldosvencidosproveedoresBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedoresOrigen,SaldosVencidosProveedores saldosvencidosproveedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getId()!=null && !saldosvencidosproveedoresOrigen.getId().equals(0L))) {saldosvencidosproveedores.setId(saldosvencidosproveedoresOrigen.getId());}}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getid_factura()!=null && !saldosvencidosproveedoresOrigen.getid_factura().equals(-1L))) {saldosvencidosproveedores.setid_factura(saldosvencidosproveedoresOrigen.getid_factura());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getid_moneda()!=null && !saldosvencidosproveedoresOrigen.getid_moneda().equals(-1L))) {saldosvencidosproveedores.setid_moneda(saldosvencidosproveedoresOrigen.getid_moneda());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getid_cliente()!=null && !saldosvencidosproveedoresOrigen.getid_cliente().equals(-1L))) {saldosvencidosproveedores.setid_cliente(saldosvencidosproveedoresOrigen.getid_cliente());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getnumero_factura()!=null && !saldosvencidosproveedoresOrigen.getnumero_factura().equals(""))) {saldosvencidosproveedores.setnumero_factura(saldosvencidosproveedoresOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getfecha_emision()!=null && !saldosvencidosproveedoresOrigen.getfecha_emision().equals(new Date()))) {saldosvencidosproveedores.setfecha_emision(saldosvencidosproveedoresOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getfecha_venta()!=null && !saldosvencidosproveedoresOrigen.getfecha_venta().equals(new Date()))) {saldosvencidosproveedores.setfecha_venta(saldosvencidosproveedoresOrigen.getfecha_venta());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getnombre_moneda()!=null && !saldosvencidosproveedoresOrigen.getnombre_moneda().equals(""))) {saldosvencidosproveedores.setnombre_moneda(saldosvencidosproveedoresOrigen.getnombre_moneda());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getsaldo()!=null && !saldosvencidosproveedoresOrigen.getsaldo().equals(0.0))) {saldosvencidosproveedores.setsaldo(saldosvencidosproveedoresOrigen.getsaldo());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getsaldo_extra()!=null && !saldosvencidosproveedoresOrigen.getsaldo_extra().equals(0.0))) {saldosvencidosproveedores.setsaldo_extra(saldosvencidosproveedoresOrigen.getsaldo_extra());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getnombre_cliente()!=null && !saldosvencidosproveedoresOrigen.getnombre_cliente().equals(""))) {saldosvencidosproveedores.setnombre_cliente(saldosvencidosproveedoresOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresOrigen.getnombre_grupo_cliente()!=null && !saldosvencidosproveedoresOrigen.getnombre_grupo_cliente().equals(""))) {saldosvencidosproveedores.setnombre_grupo_cliente(saldosvencidosproveedoresOrigen.getnombre_grupo_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.setText(saldosvencidosproveedores.getId().toString());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnumero_facturaSaldosVencidosProveedores.setText(saldosvencidosproveedores.getnumero_factura());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_emisionSaldosVencidosProveedores.setDate(saldosvencidosproveedores.getfecha_emision());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_ventaSaldosVencidosProveedores.setDate(saldosvencidosproveedores.getfecha_venta());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnombre_monedaSaldosVencidosProveedores.setText(saldosvencidosproveedores.getnombre_moneda());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldoSaldosVencidosProveedores.setText(saldosvencidosproveedores.getsaldo().toString());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldo_extraSaldosVencidosProveedores.setText(saldosvencidosproveedores.getsaldo_extra().toString());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_clienteSaldosVencidosProveedores.setText(saldosvencidosproveedores.getnombre_cliente());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setText(saldosvencidosproveedores.getnombre_grupo_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSaldosVencidosProveedores(SaldosVencidosProveedoresBean saldosvencidosproveedoresBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.setText(saldosvencidosproveedoresBean.getId().toString());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnumero_facturaSaldosVencidosProveedores.setText(saldosvencidosproveedoresBean.getnumero_factura());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_emisionSaldosVencidosProveedores.setDate(saldosvencidosproveedoresBean.getfecha_emision());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_ventaSaldosVencidosProveedores.setDate(saldosvencidosproveedoresBean.getfecha_venta());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnombre_monedaSaldosVencidosProveedores.setText(saldosvencidosproveedoresBean.getnombre_moneda());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldoSaldosVencidosProveedores.setText(saldosvencidosproveedoresBean.getsaldo().toString());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldo_extraSaldosVencidosProveedores.setText(saldosvencidosproveedoresBean.getsaldo_extra().toString());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_clienteSaldosVencidosProveedores.setText(saldosvencidosproveedoresBean.getnombre_cliente());
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setText(saldosvencidosproveedoresBean.getnombre_grupo_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSaldosVencidosProveedores(SaldosVencidosProveedoresParameterReturnGeneral saldosvencidosproveedoresReturnGeneral,SaldosVencidosProveedoresBean saldosvencidosproveedoresBean,Boolean conDefault) throws Exception { 
		try {
			SaldosVencidosProveedores saldosvencidosproveedoresLocal=new SaldosVencidosProveedores();
			
			saldosvencidosproveedoresLocal=saldosvencidosproveedoresReturnGeneral.getSaldosVencidosProveedores();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getId()!=null && !saldosvencidosproveedoresLocal.getId().equals(0L))) {saldosvencidosproveedoresBean.setId(saldosvencidosproveedoresLocal.getId());}}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getid_factura()!=null && !saldosvencidosproveedoresLocal.getid_factura().equals(-1L))) {saldosvencidosproveedoresBean.setid_factura(saldosvencidosproveedoresLocal.getid_factura());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getid_moneda()!=null && !saldosvencidosproveedoresLocal.getid_moneda().equals(-1L))) {saldosvencidosproveedoresBean.setid_moneda(saldosvencidosproveedoresLocal.getid_moneda());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getid_cliente()!=null && !saldosvencidosproveedoresLocal.getid_cliente().equals(-1L))) {saldosvencidosproveedoresBean.setid_cliente(saldosvencidosproveedoresLocal.getid_cliente());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getnumero_factura()!=null && !saldosvencidosproveedoresLocal.getnumero_factura().equals(""))) {saldosvencidosproveedoresBean.setnumero_factura(saldosvencidosproveedoresLocal.getnumero_factura());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getfecha_emision()!=null && !saldosvencidosproveedoresLocal.getfecha_emision().equals(new Date()))) {saldosvencidosproveedoresBean.setfecha_emision(saldosvencidosproveedoresLocal.getfecha_emision());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getfecha_venta()!=null && !saldosvencidosproveedoresLocal.getfecha_venta().equals(new Date()))) {saldosvencidosproveedoresBean.setfecha_venta(saldosvencidosproveedoresLocal.getfecha_venta());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getnombre_moneda()!=null && !saldosvencidosproveedoresLocal.getnombre_moneda().equals(""))) {saldosvencidosproveedoresBean.setnombre_moneda(saldosvencidosproveedoresLocal.getnombre_moneda());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getsaldo()!=null && !saldosvencidosproveedoresLocal.getsaldo().equals(0.0))) {saldosvencidosproveedoresBean.setsaldo(saldosvencidosproveedoresLocal.getsaldo());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getsaldo_extra()!=null && !saldosvencidosproveedoresLocal.getsaldo_extra().equals(0.0))) {saldosvencidosproveedoresBean.setsaldo_extra(saldosvencidosproveedoresLocal.getsaldo_extra());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getnombre_cliente()!=null && !saldosvencidosproveedoresLocal.getnombre_cliente().equals(""))) {saldosvencidosproveedoresBean.setnombre_cliente(saldosvencidosproveedoresLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && saldosvencidosproveedoresLocal.getnombre_grupo_cliente()!=null && !saldosvencidosproveedoresLocal.getnombre_grupo_cliente().equals(""))) {saldosvencidosproveedoresBean.setnombre_grupo_cliente(saldosvencidosproveedoresLocal.getnombre_grupo_cliente());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSaldosVencidosProveedoresGenerico(Long idSaldosVencidosProveedoresSeleccionado,JComboBox jComboBoxSaldosVencidosProveedores,List<SaldosVencidosProveedores> saldosvencidosproveedoressLocal)throws Exception {
		try {
			SaldosVencidosProveedores  saldosvencidosproveedoresTemp=null;

			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoressLocal) {
				if(saldosvencidosproveedoresAux.getId()!=null && saldosvencidosproveedoresAux.getId().equals(idSaldosVencidosProveedoresSeleccionado)) {
					saldosvencidosproveedoresTemp=saldosvencidosproveedoresAux;
					break;
				}
			}

			jComboBoxSaldosVencidosProveedores.setSelectedItem(saldosvencidosproveedoresTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSaldosVencidosProveedoresGenerico(JComboBox jComboBoxSaldosVencidosProveedores,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSaldosVencidosProveedores.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSaldosVencidosProveedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSaldosVencidosProveedores.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSaldosVencidosProveedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldosvencidosproveedores=(SaldosVencidosProveedores) saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			saldosvencidosproveedores =(SaldosVencidosProveedores) saldosvencidosproveedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!saldosvencidosproveedores.getIsNew() && !saldosvencidosproveedores.getIsChanged() && !saldosvencidosproveedores.getIsDeleted()) {
				sDescripcion=saldosvencidosproveedores.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=saldosvencidosproveedores.getempresa_descripcion();
			}
		}

		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!saldosvencidosproveedores.getIsNew() && !saldosvencidosproveedores.getIsChanged() && !saldosvencidosproveedores.getIsDeleted()) {
				sDescripcion=saldosvencidosproveedores.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=saldosvencidosproveedores.getgrupocliente_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!saldosvencidosproveedores.getIsNew() && !saldosvencidosproveedores.getIsChanged() && !saldosvencidosproveedores.getIsDeleted()) {
				sDescripcion=saldosvencidosproveedores.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=saldosvencidosproveedores.getfactura_descripcion();
			}
		}

		if(sTipo.equals("Moneda")) {
			//sDescripcion=this.getActualMonedaForeignKeyDescripcion((Long)value);
			if(!saldosvencidosproveedores.getIsNew() && !saldosvencidosproveedores.getIsChanged() && !saldosvencidosproveedores.getIsDeleted()) {
				sDescripcion=saldosvencidosproveedores.getmoneda_descripcion();
			} else {
				//sDescripcion=this.getActualMonedaForeignKeyDescripcion((Long)value);
				sDescripcion=saldosvencidosproveedores.getmoneda_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!saldosvencidosproveedores.getIsNew() && !saldosvencidosproveedores.getIsChanged() && !saldosvencidosproveedores.getIsDeleted()) {
				sDescripcion=saldosvencidosproveedores.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=saldosvencidosproveedores.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SaldosVencidosProveedores saldosvencidosproveedoresRow=new SaldosVencidosProveedores();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldosvencidosproveedoresRow=(SaldosVencidosProveedores) saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			saldosvencidosproveedoresRow=(SaldosVencidosProveedores) saldosvencidosproveedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSaldosVencidosProveedores(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaNuevoSaldosVencidosProveedores && this.isPermisoNuevoSaldosVencidosProveedores));			
			this.jButtonDuplicarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaDuplicarSaldosVencidosProveedores && this.isPermisoDuplicarSaldosVencidosProveedores));			
			this.jButtonCopiarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaCopiarSaldosVencidosProveedores && this.isPermisoCopiarSaldosVencidosProveedores));
			this.jButtonVerFormSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaVerFormSaldosVencidosProveedores && this.isPermisoVerFormSaldosVencidosProveedores));
			
			this.jButtonAbrirOrderBySaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaOrdenSaldosVencidosProveedores && this.isPermisoOrdenSaldosVencidosProveedores));			
			
			this.jButtonNuevoRelacionesSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores && this.isPermisoNuevoSaldosVencidosProveedores));			
			this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaNuevoSaldosVencidosProveedores && this.isPermisoNuevoSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores));
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonModificarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaModificarSaldosVencidosProveedores && this.isPermisoActualizarSaldosVencidosProveedores));	
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonActualizarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaActualizarSaldosVencidosProveedores && this.isPermisoActualizarSaldosVencidosProveedores));	
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonEliminarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaEliminarSaldosVencidosProveedores && this.isPermisoEliminarSaldosVencidosProveedores));
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonCancelarSaldosVencidosProveedores.setVisible(this.isVisibilidadCeldaCancelarSaldosVencidosProveedores);							
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaGuardarSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores));			
			
			}
						
			this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaNuevoSaldosVencidosProveedores && this.isPermisoNuevoSaldosVencidosProveedores));						
			this.jButtonDuplicarToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaDuplicarSaldosVencidosProveedores && this.isPermisoDuplicarSaldosVencidosProveedores));						
			this.jButtonCopiarToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaCopiarSaldosVencidosProveedores && this.isPermisoCopiarSaldosVencidosProveedores));			
			this.jButtonVerFormToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaVerFormSaldosVencidosProveedores && this.isPermisoVerFormSaldosVencidosProveedores));			
			this.jButtonAbrirOrderByToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaOrdenSaldosVencidosProveedores && this.isPermisoOrdenSaldosVencidosProveedores));
			this.jButtonNuevoRelacionesToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores && this.isPermisoNuevoSaldosVencidosProveedores));			
			this.jButtonNuevoGuardarCambiosToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaNuevoSaldosVencidosProveedores && this.isPermisoNuevoSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores));			
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonModificarToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaModificarSaldosVencidosProveedores && this.isPermisoActualizarSaldosVencidosProveedores));	
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonActualizarToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaActualizarSaldosVencidosProveedores  && this.isPermisoActualizarSaldosVencidosProveedores));	
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonEliminarToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaEliminarSaldosVencidosProveedores && this.isPermisoEliminarSaldosVencidosProveedores));
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonCancelarToolBarSaldosVencidosProveedores.setVisible(this.isVisibilidadCeldaCancelarSaldosVencidosProveedores);				
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaGuardarSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaNuevoSaldosVencidosProveedores && this.isPermisoNuevoSaldosVencidosProveedores));			
			this.jMenuItemDuplicarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaDuplicarSaldosVencidosProveedores && this.isPermisoDuplicarSaldosVencidosProveedores));			
			this.jMenuItemCopiarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaCopiarSaldosVencidosProveedores && this.isPermisoCopiarSaldosVencidosProveedores));			
			this.jMenuItemVerFormSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaVerFormSaldosVencidosProveedores && this.isPermisoVerFormSaldosVencidosProveedores));			
			this.jMenuItemAbrirOrderBySaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaOrdenSaldosVencidosProveedores && this.isPermisoOrdenSaldosVencidosProveedores));			
			//this.jMenuItemMostrarOcultarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaOrdenSaldosVencidosProveedores && this.isPermisoOrdenSaldosVencidosProveedores));
			this.jMenuItemDetalleAbrirOrderBySaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaOrdenSaldosVencidosProveedores && this.isPermisoOrdenSaldosVencidosProveedores));			
			//this.jMenuItemDetalleMostrarOcultarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaOrdenSaldosVencidosProveedores && this.isPermisoOrdenSaldosVencidosProveedores));			
			this.jMenuItemNuevoRelacionesSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores && this.isPermisoNuevoSaldosVencidosProveedores));			
			this.jMenuItemNuevoGuardarCambiosSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaNuevoSaldosVencidosProveedores && this.isPermisoNuevoSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores));									
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemModificarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaModificarSaldosVencidosProveedores && this.isPermisoActualizarSaldosVencidosProveedores));	
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemActualizarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaActualizarSaldosVencidosProveedores && this.isPermisoActualizarSaldosVencidosProveedores));	
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemEliminarSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaEliminarSaldosVencidosProveedores && this.isPermisoEliminarSaldosVencidosProveedores));
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemCancelarSaldosVencidosProveedores.setVisible(this.isVisibilidadCeldaCancelarSaldosVencidosProveedores);				
			}
			
			this.jMenuItemGuardarCambiosSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaGuardarSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores));						
			this.jMenuItemGuardarCambiosTablaSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=this.jButtonNuevoSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaDuplicarSaldosVencidosProveedores=this.jButtonDuplicarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaCopiarSaldosVencidosProveedores=this.jButtonCopiarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaVerFormSaldosVencidosProveedores=this.jButtonVerFormSaldosVencidosProveedores.isVisible();
			
			this.isVisibilidadCeldaOrdenSaldosVencidosProveedores=this.jButtonAbrirOrderBySaldosVencidosProveedores.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=this.jButtonNuevoRelacionesSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaModificarSaldosVencidosProveedores=this.jButtonModificarSaldosVencidosProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonActualizarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonEliminarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonCancelarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosSaldosVencidosProveedores.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=this.jButtonNuevoToolBarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=this.jButtonNuevoRelacionesToolBarSaldosVencidosProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			this.isVisibilidadCeldaModificarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonModificarToolBarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonActualizarToolBarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonEliminarToolBarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonCancelarToolBarSaldosVencidosProveedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=this.jButtonGuardarCambiosToolBarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=this.jButtonGuardarCambiosTablaToolBarSaldosVencidosProveedores.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=this.jMenuItemNuevoSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=this.jMenuItemNuevoRelacionesSaldosVencidosProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			this.isVisibilidadCeldaModificarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemModificarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemActualizarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemEliminarSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemCancelarSaldosVencidosProveedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=this.jMenuItemGuardarCambiosSaldosVencidosProveedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=this.jMenuItemGuardarCambiosTablaSaldosVencidosProveedores.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSaldosVencidosProveedores(Boolean esInicializar) {
		if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {			
			if(this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
				//if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSaldosVencidosProveedores();
			}
			
			this.inicializarActualizarBindingBotonesManualSaldosVencidosProveedores(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSaldosVencidosProveedores() {
		this.jButtonNuevoSaldosVencidosProveedores.setVisible(this.isPermisoNuevoSaldosVencidosProveedores);			
		this.jButtonDuplicarSaldosVencidosProveedores.setVisible(this.isPermisoDuplicarSaldosVencidosProveedores);			
		this.jButtonCopiarSaldosVencidosProveedores.setVisible(this.isPermisoCopiarSaldosVencidosProveedores);			
		this.jButtonVerFormSaldosVencidosProveedores.setVisible(this.isPermisoVerFormSaldosVencidosProveedores);			
		
		this.jButtonAbrirOrderBySaldosVencidosProveedores.setVisible(this.isPermisoOrdenSaldosVencidosProveedores);					
		
		this.jButtonNuevoRelacionesSaldosVencidosProveedores.setVisible(this.isPermisoNuevoSaldosVencidosProveedores);			
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonModificarSaldosVencidosProveedores.setVisible(this.isPermisoActualizarSaldosVencidosProveedores);	
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonActualizarSaldosVencidosProveedores.setVisible(this.isPermisoActualizarSaldosVencidosProveedores);	
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonEliminarSaldosVencidosProveedores.setVisible(this.isPermisoEliminarSaldosVencidosProveedores);
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonCancelarSaldosVencidosProveedores.setVisible(this.isVisibilidadCeldaCancelarSaldosVencidosProveedores);						
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosSaldosVencidosProveedores.setVisible(this.isPermisoGuardarCambiosSaldosVencidosProveedores);							
		}
		
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.setVisible(this.isPermisoActualizarSaldosVencidosProveedores);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSaldosVencidosProveedores() {
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonModificarSaldosVencidosProveedores.setVisible(this.isPermisoActualizarSaldosVencidosProveedores);	
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonActualizarSaldosVencidosProveedores.setVisible(this.isPermisoActualizarSaldosVencidosProveedores);	
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonEliminarSaldosVencidosProveedores.setVisible(this.isPermisoEliminarSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonCancelarSaldosVencidosProveedores.setVisible(this.isVisibilidadCeldaCancelarSaldosVencidosProveedores);							
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosSaldosVencidosProveedores.setVisible((this.isVisibilidadCeldaGuardarSaldosVencidosProveedores && this.isPermisoGuardarCambiosSaldosVencidosProveedores));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSaldosVencidosProveedores() {
		if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSaldosVencidosProveedores();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSaldosVencidosProveedores() {
	}
	
	public void jTableDatosSaldosVencidosProveedoresListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSaldosVencidosProveedores(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.saldosvencidosproveedores.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSaldosVencidosProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSaldosVencidosProveedores(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosVencidosProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosVencidosProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.saldosvencidosproveedoresLogic.getConnexion());

				if(this.saldosvencidosproveedores.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.saldosvencidosproveedores.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosVencidosProveedores=(TitledBorder)this.jScrollPanelDatosSaldosVencidosProveedores.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSaldosVencidosProveedores.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.saldosvencidosproveedores.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clienteSaldosVencidosProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebSaldosVencidosProveedores(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosVencidosProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosVencidosProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.saldosvencidosproveedoresLogic.getConnexion());

				if(this.saldosvencidosproveedores.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.saldosvencidosproveedores.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosVencidosProveedores=(TitledBorder)this.jScrollPanelDatosSaldosVencidosProveedores.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderSaldosVencidosProveedores.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clienteSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.saldosvencidosproveedores.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaSaldosVencidosProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebSaldosVencidosProveedores(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosVencidosProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosVencidosProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.saldosvencidosproveedoresLogic.getConnexion());

				if(this.saldosvencidosproveedores.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.saldosvencidosproveedores.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosVencidosProveedores=(TitledBorder)this.jScrollPanelDatosSaldosVencidosProveedores.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderSaldosVencidosProveedores.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.saldosvencidosproveedores.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_monedaSaldosVencidosProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomoneda=true;

			idTienePermisomoneda=this.tienePermisosUsuarioEnPaginaWebSaldosVencidosProveedores(MonedaConstantesFunciones.CLASSNAME);

			if(idTienePermisomoneda) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosVencidosProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosVencidosProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);

				this.monedaBeanSwingJInternalFrame=new MonedaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.monedaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.monedaBeanSwingJInternalFrame.getMonedaLogic().setConnexion(this.saldosvencidosproveedoresLogic.getConnexion());

				if(this.saldosvencidosproveedores.getid_moneda()!=null) {
					this.monedaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.monedaBeanSwingJInternalFrame.setIdActual(this.saldosvencidosproveedores.getid_moneda());
					this.monedaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.monedaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.monedaBeanSwingJInternalFrame.inicializarActualizarBindingTablaMoneda();
				}

				JInternalFrameBase jinternalFrame =this.monedaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosVencidosProveedores=(TitledBorder)this.jScrollPanelDatosSaldosVencidosProveedores.getBorder();
				TitledBorder titledBordermoneda=(TitledBorder)this.monedaBeanSwingJInternalFrame.jScrollPanelDatosMoneda.getBorder();

				titledBordermoneda.setTitle(titledBorderSaldosVencidosProveedores.getTitle() + " -> Moneda");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_monedaSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getid_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_moneda = "+this.saldosvencidosproveedores.getid_moneda().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteSaldosVencidosProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebSaldosVencidosProveedores(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosVencidosProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosVencidosProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.saldosvencidosproveedoresLogic.getConnexion());

				if(this.saldosvencidosproveedores.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.saldosvencidosproveedores.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosVencidosProveedores=(TitledBorder)this.jScrollPanelDatosSaldosVencidosProveedores.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderSaldosVencidosProveedores.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.saldosvencidosproveedores.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.saldosvencidosproveedores.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.saldosvencidosproveedores.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ventaSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getfecha_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_venta = '"+Funciones2.getStringPostgresDate(this.saldosvencidosproveedores.getfecha_venta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_monedaSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getnombre_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_moneda like '%"+this.saldosvencidosproveedores.getnombre_moneda()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.saldosvencidosproveedores.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_extraSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getsaldo_extra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_extra = "+this.saldosvencidosproveedores.getsaldo_extra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.saldosvencidosproveedores.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.getsaldosvencidosproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosvencidosproveedores==null) {
						this.saldosvencidosproveedores = new SaldosVencidosProveedores();
					}

					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);
				}

				if(this.saldosvencidosproveedores.getnombre_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_grupo_cliente like '%"+this.saldosvencidosproveedores.getnombre_grupo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosVencidosProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);

			this.getSaldosVencidosProveedoressBusquedaSaldosVencidosProveedores();

			this.inicializarActualizarBindingSaldosVencidosProveedores(false);

			//if(SaldosVencidosProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);

			this.getSaldosVencidosProveedoressFK_IdCliente();

			this.inicializarActualizarBindingSaldosVencidosProveedores(false);

			//if(SaldosVencidosProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);

			this.getSaldosVencidosProveedoressFK_IdEmpresa();

			this.inicializarActualizarBindingSaldosVencidosProveedores(false);

			//if(SaldosVencidosProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);

			this.getSaldosVencidosProveedoressFK_IdFactura();

			this.inicializarActualizarBindingSaldosVencidosProveedores(false);

			//if(SaldosVencidosProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClienteSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);

			this.getSaldosVencidosProveedoressFK_IdGrupoCliente();

			this.inicializarActualizarBindingSaldosVencidosProveedores(false);

			//if(SaldosVencidosProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMonedaSaldosVencidosProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);

			this.getSaldosVencidosProveedoressFK_IdMoneda();

			this.inicializarActualizarBindingSaldosVencidosProveedores(false);

			//if(SaldosVencidosProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosvencidosproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSaldosVencidosProveedores() {
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.setVisible(false);	    			
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.dispose();
			this.jInternalFrameDetalleFormSaldosVencidosProveedores=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores!=null) {
			this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.dispose();
			this.jInternalFrameReporteDinamicoSaldosVencidosProveedores=null;
		}
		
		if(this.jInternalFrameImportacionSaldosVencidosProveedores!=null) {
			this.jInternalFrameImportacionSaldosVencidosProveedores.setVisible(false);	    			
			this.jInternalFrameImportacionSaldosVencidosProveedores.dispose();
			this.jInternalFrameImportacionSaldosVencidosProveedores=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSaldosVencidosProveedores();
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
			
			if(sTipo.equals("NuevoSaldosVencidosProveedores")) {
				jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSaldosVencidosProveedores")) {
				jButtonDuplicarSaldosVencidosProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSaldosVencidosProveedores")) {
				jButtonCopiarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormSaldosVencidosProveedores")) {
				jButtonVerFormSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSaldosVencidosProveedores")) {
				jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSaldosVencidosProveedores")) {
				jButtonDuplicarSaldosVencidosProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSaldosVencidosProveedores")) {
				jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSaldosVencidosProveedores")) {
				jButtonDuplicarSaldosVencidosProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSaldosVencidosProveedores")) {
				jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSaldosVencidosProveedores")) {
				jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSaldosVencidosProveedores")) {
				jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSaldosVencidosProveedores")) {
				jButtonModificarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSaldosVencidosProveedores")) {
				jButtonModificarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSaldosVencidosProveedores")) {
				jButtonModificarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSaldosVencidosProveedores")) {
				jButtonActualizarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSaldosVencidosProveedores")) {
				jButtonActualizarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSaldosVencidosProveedores")) {
				jButtonActualizarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarSaldosVencidosProveedores")) {
				jButtonEliminarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSaldosVencidosProveedores")) {
				jButtonEliminarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSaldosVencidosProveedores")) {
				jButtonEliminarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarSaldosVencidosProveedores")) {
				jButtonCancelarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSaldosVencidosProveedores")) {
				jButtonCancelarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSaldosVencidosProveedores")) {
				jButtonCancelarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarSaldosVencidosProveedores")) {
				jButtonCerrarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSaldosVencidosProveedores")) {
				jButtonCerrarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSaldosVencidosProveedores")) {
				jButtonCerrarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSaldosVencidosProveedores")) {
				jButtonMostrarOcultarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSaldosVencidosProveedores")) {
				jButtonCancelarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSaldosVencidosProveedores")) {
				jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSaldosVencidosProveedores")) {
				jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSaldosVencidosProveedores")) {
				jButtonCopiarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSaldosVencidosProveedores")) {
				jButtonVerFormSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSaldosVencidosProveedores")) {
				jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSaldosVencidosProveedores")) {
				jButtonCopiarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSaldosVencidosProveedores")) {
				jButtonVerFormSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSaldosVencidosProveedores")) {
				jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSaldosVencidosProveedores")) {
				jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSaldosVencidosProveedores")) {
				jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSaldosVencidosProveedores")) {
				jButtonRecargarInformacionSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSaldosVencidosProveedores")) {
				jButtonRecargarInformacionSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSaldosVencidosProveedores")) {
				jButtonRecargarInformacionSaldosVencidosProveedoresActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSaldosVencidosProveedores")) {
				jButtonAnterioresSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSaldosVencidosProveedores")) {
				jButtonAnterioresSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSaldosVencidosProveedores")) {
				jButtonAnterioresSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSaldosVencidosProveedores")) {
				jButtonSiguientesSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSaldosVencidosProveedores")) {
				jButtonSiguientesSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSaldosVencidosProveedores")) {
				jButtonSiguientesSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySaldosVencidosProveedores") || sTipo.equals("MenuItemDetalleAbrirOrderBySaldosVencidosProveedores")) {
				jButtonAbrirOrderBySaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSaldosVencidosProveedores") || sTipo.equals("MenuItemDetalleMostrarOcultarSaldosVencidosProveedores")) {
				jButtonMostrarOcultarSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSaldosVencidosProveedores")) {
				jButtonNuevoGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSaldosVencidosProveedores")) {
				jButtonNuevoGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSaldosVencidosProveedores")) {
				jButtonNuevoGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSaldosVencidosProveedores")) {
				jButtonCerrarReporteDinamicoSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSaldosVencidosProveedores")) {
				jButtonGenerarReporteDinamicoSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSaldosVencidosProveedores")) {
				
				jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSaldosVencidosProveedores")) {
				jButtonCerrarImportacionSaldosVencidosProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSaldosVencidosProveedores")) {
				
				jButtonGenerarImportacionSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSaldosVencidosProveedores")) {
				
				jButtonAbrirImportacionSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSaldosVencidosProveedores")) {
				jComboBoxTiposAccionesSaldosVencidosProveedoresActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSaldosVencidosProveedores")) {
				jComboBoxTiposRelacionesSaldosVencidosProveedoresActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSaldosVencidosProveedores")) {
				jComboBoxTiposAccionesSaldosVencidosProveedoresActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSaldosVencidosProveedores")) {
				
				jComboBoxTiposSeleccionarSaldosVencidosProveedoresActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSaldosVencidosProveedores")) {
				jTextFieldValorCampoGeneralSaldosVencidosProveedoresActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySaldosVencidosProveedores")) {
				jButtonAbrirOrderBySaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSaldosVencidosProveedores")) {
				jButtonAbrirOrderBySaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySaldosVencidosProveedores")) {
				jButtonCerrarOrderBySaldosVencidosProveedoresActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSaldosVencidosProveedoresBusqueda")) {
				this.jButtonidSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSaldosVencidosProveedoresUpdate")) {
				this.jButtonid_empresaSaldosVencidosProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonid_empresaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteSaldosVencidosProveedoresUpdate")) {
				this.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteSaldosVencidosProveedoresBusqueda")) {
				this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaSaldosVencidosProveedoresUpdate")) {
				this.jButtonid_facturaSaldosVencidosProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonid_facturaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_monedaSaldosVencidosProveedoresUpdate")) {
				this.jButtonid_monedaSaldosVencidosProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_monedaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonid_monedaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteSaldosVencidosProveedoresUpdate")) {
				this.jButtonid_clienteSaldosVencidosProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteSaldosVencidosProveedoresBusqueda")) {
				this.jButtonid_clienteSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonnumero_facturaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionSaldosVencidosProveedoresBusqueda")) {
				this.jButtonfecha_emisionSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ventaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonfecha_ventaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_monedaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonnombre_monedaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoSaldosVencidosProveedoresBusqueda")) {
				this.jButtonsaldoSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_extraSaldosVencidosProveedoresBusqueda")) {
				this.jButtonsaldo_extraSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteSaldosVencidosProveedoresBusqueda")) {
				this.jButtonnombre_clienteSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteSaldosVencidosProveedoresBusqueda")) {
				this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaSaldosVencidosProveedoresSaldosVencidosProveedores")) {
				this.jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedoresActionPerformed(evt);
			}
			
			;
			
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSaldosVencidosProveedores();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				


				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SaldosVencidosProveedores saldosvencidosproveedoresLocal=null;
			
			if(!this.getEsControlTabla()) {
				saldosvencidosproveedoresLocal=this.saldosvencidosproveedores;
			} else {
				saldosvencidosproveedoresLocal=this.saldosvencidosproveedoresAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
							
				
				


				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
								
						
				


				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
								
				
				


				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
							
				
				


				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
								
				
				


				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSaldosVencidosProveedores")) {
					jCheckBoxSeleccionarTodosSaldosVencidosProveedoresItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSaldosVencidosProveedores")) {
					jCheckBoxSeleccionadosSaldosVencidosProveedoresItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSaldosVencidosProveedores")) {
					
				}
				
				


				
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
												
				
				


				
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosvencidosproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosvencidosproveedores);
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosVencidosProveedores.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosVencidosProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosVencidosProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosvencidosproveedoresAnterior =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSaldosVencidosProveedores")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSaldosVencidosProveedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSaldosVencidosProveedores.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.saldosvencidosproveedores =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.saldosvencidosproveedores);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSaldosVencidosProveedores")) {
				
				}
				
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSaldosVencidosProveedores")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSaldosVencidosProveedores.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSaldosVencidosProveedores")) {
			
			}
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSaldosVencidosProveedores();
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
			if(sTipo.equals("NuevoSaldosVencidosProveedores")) {
				jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSaldosVencidosProveedores")) {
				jButtonDuplicarSaldosVencidosProveedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSaldosVencidosProveedores")) {
				jButtonCopiarSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSaldosVencidosProveedores")) {
				jButtonVerFormSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSaldosVencidosProveedores")) {
				jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSaldosVencidosProveedores")) {
				jButtonModificarSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSaldosVencidosProveedores")) {
				jButtonActualizarSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSaldosVencidosProveedores")) {
				jButtonEliminarSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSaldosVencidosProveedores")) {
				jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSaldosVencidosProveedores")) {
				jButtonCancelarSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSaldosVencidosProveedores")) {
				jButtonCerrarSaldosVencidosProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSaldosVencidosProveedores")) {
				jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSaldosVencidosProveedores")) {
				jButtonNuevoGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySaldosVencidosProveedores")) {
				jButtonAbrirOrderBySaldosVencidosProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSaldosVencidosProveedores")) {
				jButtonRecargarInformacionSaldosVencidosProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSaldosVencidosProveedores")) {
				jButtonAnterioresSaldosVencidosProveedoresActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSaldosVencidosProveedores")) {
				jButtonSiguientesSaldosVencidosProveedoresActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSaldosVencidosProveedoresBusqueda")) {
				this.jButtonidSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSaldosVencidosProveedoresUpdate")) {
				this.jButtonid_empresaSaldosVencidosProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonid_empresaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteSaldosVencidosProveedoresUpdate")) {
				this.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteSaldosVencidosProveedoresBusqueda")) {
				this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaSaldosVencidosProveedoresUpdate")) {
				this.jButtonid_facturaSaldosVencidosProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonid_facturaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_monedaSaldosVencidosProveedoresUpdate")) {
				this.jButtonid_monedaSaldosVencidosProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_monedaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonid_monedaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteSaldosVencidosProveedoresUpdate")) {
				this.jButtonid_clienteSaldosVencidosProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteSaldosVencidosProveedoresBusqueda")) {
				this.jButtonid_clienteSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonnumero_facturaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionSaldosVencidosProveedoresBusqueda")) {
				this.jButtonfecha_emisionSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ventaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonfecha_ventaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_monedaSaldosVencidosProveedoresBusqueda")) {
				this.jButtonnombre_monedaSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoSaldosVencidosProveedoresBusqueda")) {
				this.jButtonsaldoSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_extraSaldosVencidosProveedoresBusqueda")) {
				this.jButtonsaldo_extraSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteSaldosVencidosProveedoresBusqueda")) {
				this.jButtonnombre_clienteSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteSaldosVencidosProveedoresBusqueda")) {
				this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusquedaActionPerformed(evt);
			}
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSaldosVencidosProveedores();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSaldosVencidosProveedores")) {
				closingInternalFrameSaldosVencidosProveedores();
				
			} else if(sTipo.equals("jButtonCancelarSaldosVencidosProveedores")) {
				JInternalFrameBase jInternalFrameDetalleFormSaldosVencidosProveedores = (JInternalFrameBase)evt.getSource();
	            	
	            SaldosVencidosProveedoresBeanSwingJInternalFrame jInternalFrameParent=(SaldosVencidosProveedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormSaldosVencidosProveedores.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSaldosVencidosProveedoresActionPerformed(null);
			}
			
			SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.saldosvencidosproveedores,new Object(),this.saldosvencidosproveedoresParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSaldosVencidosProveedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSaldosVencidosProveedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSaldosVencidosProveedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.saldosvencidosproveedores)) {
			if(!esControlTabla) {
				if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);			
				}
				
				if(this.saldosvencidosproveedoresSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSaldosVencidosProveedores(this.saldosvencidosproveedoresReturnGeneral,this.saldosvencidosproveedoresBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.saldosvencidosproveedoresSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSaldosVencidosProveedores(classes,this.saldosvencidosproveedoresReturnGeneral,this.saldosvencidosproveedoresBean,false);
					}
						
					if(this.saldosvencidosproveedoresReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySaldosVencidosProveedores(this.saldosvencidosproveedoresReturnGeneral.getSaldosVencidosProveedores());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSaldosVencidosProveedores(this.saldosvencidosproveedoresReturnGeneral.getSaldosVencidosProveedores());	
					}
						
					if(this.saldosvencidosproveedoresReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSaldosVencidosProveedores(this.saldosvencidosproveedoresReturnGeneral.getSaldosVencidosProveedores(),classes);//this.saldosvencidosproveedoresBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSaldosVencidosProveedores(this.saldosvencidosproveedores,classes);//this.saldosvencidosproveedoresBean);									
				}
			
				if(SaldosVencidosProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSaldosVencidosProveedores(this.saldosvencidosproveedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosVencidosProveedores(this.saldosvencidosproveedores);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.saldosvencidosproveedoresAnterior!=null) {
						this.saldosvencidosproveedores=this.saldosvencidosproveedoresAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.saldosvencidosproveedoresSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.saldosvencidosproveedoresReturnGeneral.getSaldosVencidosProveedores(),saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.saldosvencidosproveedoresReturnGeneral.getSaldosVencidosProveedores(),this.saldosvencidosproveedoress);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSaldosVencidosProveedores.repaint();
				
				//((AbstractTableModel) this.jTableDatosSaldosVencidosProveedores.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSaldosVencidosProveedores();
			}
		}
	}
	
	public void actualizarVisualTableDatosSaldosVencidosProveedores() throws Exception {
		
		SaldosVencidosProveedoresModel saldosvencidosproveedoresModel=(SaldosVencidosProveedoresModel)this.jTableDatosSaldosVencidosProveedores.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldosvencidosproveedoresModel.saldosvencidosproveedoress=this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			saldosvencidosproveedoresModel.saldosvencidosproveedoress=this.saldosvencidosproveedoress;
		}
		
		
		((SaldosVencidosProveedoresModel) this.jTableDatosSaldosVencidosProveedores.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSaldosVencidosProveedores() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsaldosvencidosproveedoresAnterior(),this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsaldosvencidosproveedoresAnterior(),this.saldosvencidosproveedoress);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSaldosVencidosProveedores();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldosvencidosproveedores,new Object(),generalEntityParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SaldosVencidosProveedoresConstantesFunciones.getClassesRelationshipsOfSaldosVencidosProveedores(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SaldosVencidosProveedoresConstantesFunciones.getClassesRelationshipsFromStringsOfSaldosVencidosProveedores(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSaldosVencidosProveedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldosvencidosproveedores,new Object(),generalEntityParameterGeneral,this.saldosvencidosproveedoresReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSaldosVencidosProveedores(SaldosVencidosProveedoresBean saldosvencidosproveedoresBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSaldosVencidosProveedores(ArrayList<Classe> classes,SaldosVencidosProveedoresReturnGeneral saldosvencidosproveedoresReturnGeneral,SaldosVencidosProveedoresBean saldosvencidosproveedoresBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.saldosvencidosproveedores)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores = new SaldosVencidosProveedoresDetalleFormJInternalFrame(jDesktopPane,this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones(),this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.setVisible(false);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.setSelected(false);						
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.saldosvencidosproveedoresLogic=this.saldosvencidosproveedoresLogic;
		
		this.cargarCombosFrameForeignKeySaldosVencidosProveedores("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSaldosVencidosProveedores();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSaldosVencidosProveedores();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySaldosVencidosProveedores("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySaldosVencidosProveedores();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSaldosVencidosProveedores"));
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonModificarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"ModificarSaldosVencidosProveedores"));

		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonModificarToolBarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarSaldosVencidosProveedores"));
					
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemModificarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarSaldosVencidosProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonActualizarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"ActualizarSaldosVencidosProveedores"));
		
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonActualizarToolBarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSaldosVencidosProveedores"));
						
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemActualizarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSaldosVencidosProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonEliminarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"EliminarSaldosVencidosProveedores"));
		
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonEliminarToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarSaldosVencidosProveedores"));
								
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemEliminarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSaldosVencidosProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonCancelarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"CancelarSaldosVencidosProveedores"));
		
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonCancelarToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarSaldosVencidosProveedores"));
					
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemCancelarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSaldosVencidosProveedores"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemDetalleCerrarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSaldosVencidosProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldosVencidosProveedores"));
		
		
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldosVencidosProveedores"));
		
		
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSaldosVencidosProveedores"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonidSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_empresaSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_empresaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_facturaSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_facturaSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_facturaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_monedaSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_monedaSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_monedaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_clienteSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_clienteSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonsaldoSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"saldoSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"saldo_extraSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteSaldosVencidosProveedoresBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTabbedPaneRelacionesSaldosVencidosProveedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSaldosVencidosProveedores"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSaldosVencidosProveedores"));
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSaldosVencidosProveedores"));
		}
		
		this.jTableDatosSaldosVencidosProveedores.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSaldosVencidosProveedores"));
		
		this.jTableDatosSaldosVencidosProveedores.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSaldosVencidosProveedores"));
		
		this.jButtonNuevoSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"NuevoSaldosVencidosProveedores"));
		
		this.jButtonDuplicarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"DuplicarSaldosVencidosProveedores"));
		
		this.jButtonCopiarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"CopiarSaldosVencidosProveedores"));
		
		this.jButtonVerFormSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"VerFormSaldosVencidosProveedores"));
		
		
		this.jButtonNuevoToolBarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"NuevoToolBarSaldosVencidosProveedores"));
			
		this.jButtonDuplicarToolBarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSaldosVencidosProveedores"));
			
		this.jMenuItemNuevoSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSaldosVencidosProveedores"));
			
		this.jMenuItemDuplicarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSaldosVencidosProveedores"));		
		
		
		this.jButtonNuevoRelacionesSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSaldosVencidosProveedores"));
		
		
		this.jButtonNuevoRelacionesToolBarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSaldosVencidosProveedores"));
			
		this.jMenuItemNuevoRelacionesSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSaldosVencidosProveedores"));		
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonModificarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"ModificarSaldosVencidosProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonModificarToolBarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarSaldosVencidosProveedores"));
			
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemModificarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarSaldosVencidosProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonActualizarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"ActualizarSaldosVencidosProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonActualizarToolBarSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSaldosVencidosProveedores"));
				
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemActualizarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSaldosVencidosProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonEliminarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"EliminarSaldosVencidosProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonEliminarToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarSaldosVencidosProveedores"));
						
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemEliminarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSaldosVencidosProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonCancelarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"CancelarSaldosVencidosProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonCancelarToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarSaldosVencidosProveedores"));
			
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemCancelarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSaldosVencidosProveedores"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSaldosVencidosProveedores"));		
		
		
		this.jButtonCerrarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"CerrarSaldosVencidosProveedores"));
		
		
		this.jButtonCerrarToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"CerrarToolBarSaldosVencidosProveedores"));
			
		this.jMenuItemCerrarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSaldosVencidosProveedores"));
			
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jMenuItemDetalleCerrarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSaldosVencidosProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosSaldosVencidosProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldosVencidosProveedores"));
		}
		
		this.jButtonCopiarToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"CopiarToolBarSaldosVencidosProveedores"));
			
		this.jButtonVerFormToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"VerFormToolBarSaldosVencidosProveedores"));
		
		this.jMenuItemGuardarCambiosSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSaldosVencidosProveedores"));
			
		this.jMenuItemCopiarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSaldosVencidosProveedores"));		
		
		this.jMenuItemVerFormSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSaldosVencidosProveedores"));		
		
		
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSaldosVencidosProveedores"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSaldosVencidosProveedores"));
			
		this.jMenuItemGuardarCambiosTablaSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSaldosVencidosProveedores"));		
		
		
		
		this.jButtonRecargarInformacionSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionSaldosVencidosProveedores"));
					
		this.jButtonRecargarInformacionToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSaldosVencidosProveedores"));
		
		this.jMenuItemRecargarInformacionSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSaldosVencidosProveedores"));		
		
		
		
		this.jButtonAnterioresSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"AnterioresSaldosVencidosProveedores"));
		
		
		this.jButtonAnterioresToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSaldosVencidosProveedores"));
		
		this.jMenuItemAnterioresSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSaldosVencidosProveedores"));		
		
		
		this.jButtonSiguientesSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"SiguientesSaldosVencidosProveedores"));
		
		
		this.jButtonSiguientesToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSaldosVencidosProveedores"));
			
		this.jMenuItemSiguientesSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSaldosVencidosProveedores"));
			
		this.jMenuItemAbrirOrderBySaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySaldosVencidosProveedores"));
			
		this.jMenuItemMostrarOcultarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSaldosVencidosProveedores"));
			
		this.jMenuItemDetalleAbrirOrderBySaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySaldosVencidosProveedores"));
			
		this.jMenuItemDetalleMostarOcultarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSaldosVencidosProveedores"));		
		
		
		this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSaldosVencidosProveedores"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSaldosVencidosProveedores"));
			
		this.jMenuItemNuevoGuardarCambiosSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSaldosVencidosProveedores"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSaldosVencidosProveedores"));

		this.jCheckBoxSeleccionadosSaldosVencidosProveedores.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSaldosVencidosProveedores"));
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSaldosVencidosProveedores"));
		}
		
		
		this.jComboBoxTiposRelacionesSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"TiposRelacionesSaldosVencidosProveedores"));
			
		this.jComboBoxTiposAccionesSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesSaldosVencidosProveedores"));
					
		this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSaldosVencidosProveedores"));
			
		this.jTextFieldValorCampoGeneralSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSaldosVencidosProveedores"));		
		
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonidSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_empresaSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_empresaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_facturaSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_facturaSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_facturaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_monedaSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_monedaSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_monedaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_clienteSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_clienteSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonsaldoSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"saldoSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"saldo_extraSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteSaldosVencidosProveedoresBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"BusquedaSaldosVencidosProveedoresSaldosVencidosProveedores"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSaldosVencidosProveedores!=null) {
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldosVencidosProveedores"));
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldosVencidosProveedores"));
				this.jInternalFrameReporteDinamicoSaldosVencidosProveedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldosVencidosProveedores"));
			}
			
			//this.jButtonCerrarReporteDinamicoSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldosVencidosProveedores"));				
			//this.jButtonGenerarReporteDinamicoSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldosVencidosProveedores"));
			//this.jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldosVencidosProveedores"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSaldosVencidosProveedores!=null) {
				this.jInternalFrameImportacionSaldosVencidosProveedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSaldosVencidosProveedores"));
				this.jInternalFrameImportacionSaldosVencidosProveedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSaldosVencidosProveedores"));
				this.jInternalFrameImportacionSaldosVencidosProveedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSaldosVencidosProveedores"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"AbrirOrderBySaldosVencidosProveedores"));
			
			this.jButtonAbrirOrderByToolBarSaldosVencidosProveedores.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSaldosVencidosProveedores"));			
			
			if(this.jInternalFrameOrderBySaldosVencidosProveedores!=null) {
				this.jInternalFrameOrderBySaldosVencidosProveedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySaldosVencidosProveedores"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTabbedPaneRelacionesSaldosVencidosProveedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSaldosVencidosProveedores"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameSaldosVencidosProveedores();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSaldosVencidosProveedores = (JInternalFrameBase)event.getSource();
	            	
	            SaldosVencidosProveedoresBeanSwingJInternalFrame jInternalFrameParent=(SaldosVencidosProveedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormSaldosVencidosProveedores.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSaldosVencidosProveedoresActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSaldosVencidosProveedores.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSaldosVencidosProveedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSaldosVencidosProveedores.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSaldosVencidosProveedores.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSaldosVencidosProveedores";
		inputMap = this.jButtonNuevoSaldosVencidosProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSaldosVencidosProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSaldosVencidosProveedores";
		inputMap = this.jButtonNuevoRelacionesSaldosVencidosProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSaldosVencidosProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSaldosVencidosProveedoresActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSaldosVencidosProveedores";
		inputMap = this.jButtonModificarSaldosVencidosProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSaldosVencidosProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSaldosVencidosProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSaldosVencidosProveedores";
		inputMap = this.jButtonActualizarSaldosVencidosProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSaldosVencidosProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSaldosVencidosProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSaldosVencidosProveedores";
		inputMap = this.jButtonEliminarSaldosVencidosProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSaldosVencidosProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSaldosVencidosProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSaldosVencidosProveedores";
		inputMap = this.jButtonCancelarSaldosVencidosProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSaldosVencidosProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSaldosVencidosProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSaldosVencidosProveedores";
		inputMap = this.jButtonCerrarSaldosVencidosProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSaldosVencidosProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSaldosVencidosProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSaldosVencidosProveedores";
		inputMap = this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosSaldosVencidosProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonGuardarCambiosSaldosVencidosProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSaldosVencidosProveedores.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSaldosVencidosProveedoresItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSaldosVencidosProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSaldosVencidosProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSaldosVencidosProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSaldosVencidosProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSaldosVencidosProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonidSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_empresaSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_empresaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_facturaSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_facturaSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_facturaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_monedaSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_monedaSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_monedaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaSaldosVencidosProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_clienteSaldosVencidosProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_clienteSaldosVencidosProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonid_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonsaldoSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"saldoSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"saldo_extraSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteSaldosVencidosProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteSaldosVencidosProveedoresBusqueda"));
		
		
		this.jButtonBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores.addActionListener(new ButtonActionListener(this,"BusquedaSaldosVencidosProveedoresSaldosVencidosProveedores"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSaldosVencidosProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSaldosVencidosProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSaldosVencidosProveedoresActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSaldosVencidosProveedores.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSaldosVencidosProveedores(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
					saldosvencidosproveedoresAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoress) {
					saldosvencidosproveedoresAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSaldosVencidosProveedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
						saldosvencidosproveedoresAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoress) {
						saldosvencidosproveedoresAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoress) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSaldosVencidosProveedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSaldosVencidosProveedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSaldosVencidosProveedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSaldosVencidosProveedores.getSelectedRows();
			
			SaldosVencidosProveedores saldosvencidosproveedoresLocal=new SaldosVencidosProveedores();
			
			//this.seleccionarTodosSaldosVencidosProveedores(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldosvencidosproveedoresLocal =(SaldosVencidosProveedores) this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress().toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					saldosvencidosproveedoresLocal =(SaldosVencidosProveedores) this.saldosvencidosproveedoress.toArray()[this.jTableDatosSaldosVencidosProveedores.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				saldosvencidosproveedoresLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
						saldosvencidosproveedoresAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoress) {
						saldosvencidosproveedoresAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSaldosVencidosProveedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSaldosVencidosProveedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSaldosVencidosProveedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSaldosVencidosProveedoresItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSaldosVencidosProveedoresParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSaldosVencidosProveedoresActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSaldosVencidosProveedores.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
				
						if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							saldosvencidosproveedoresAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							saldosvencidosproveedoresAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA)) {
							existe=true;
							saldosvencidosproveedoresAux.setfecha_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA)) {
							existe=true;
							saldosvencidosproveedoresAux.setnombre_moneda(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							saldosvencidosproveedoresAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA)) {
							existe=true;
							saldosvencidosproveedoresAux.setsaldo_extra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							saldosvencidosproveedoresAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							saldosvencidosproveedoresAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoress) {
					
						if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							saldosvencidosproveedoresAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							saldosvencidosproveedoresAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA)) {
							existe=true;
							saldosvencidosproveedoresAux.setfecha_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA)) {
							existe=true;
							saldosvencidosproveedoresAux.setnombre_moneda(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							saldosvencidosproveedoresAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA)) {
							existe=true;
							saldosvencidosproveedoresAux.setsaldo_extra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							saldosvencidosproveedoresAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							saldosvencidosproveedoresAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSaldosVencidosProveedoresActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSaldosVencidosProveedores=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSaldosVencidosProveedores.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSaldosVencidosProveedores) {				
					conSplash=true;//false;										
					
					//this.startProcessSaldosVencidosProveedores(conSplash);
				
					this.generarReporteSaldosVencidosProveedoressSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSaldosVencidosProveedoressSeleccionados();
				//this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSaldosVencidosProveedoressSeleccionados(false);
				//this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSaldosVencidosProveedoressSeleccionados(true);
				//this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSaldosVencidosProveedores();
				
				this.exportarSaldosVencidosProveedoressSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSaldosVencidosProveedoress();
				//this.importarSaldosVencidosProveedoress();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSaldosVencidosProveedores();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSaldosVencidosProveedoressSeleccionados();
				//this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Saldos Vencidos Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSaldosVencidosProveedores();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSaldosVencidosProveedores)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySaldosVencidosProveedores(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Saldos Vencidos Proveedores",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setSelectedIndex(0);					
				}	
			} 			
			else if(SaldosVencidosProveedoresBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSaldosVencidosProveedores) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSaldosVencidosProveedores(conSplash);
					
						//this.actualizarParametrosGeneralSaldosVencidosProveedores();
						
						this.generarReporteProcesoAccionSaldosVencidosProveedoressSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Saldos Vencidos ProveedoresES SELECCIONADOS?", "MANTENIMIENTO DE Saldos Vencidos Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSaldosVencidosProveedores();
				
						this.actualizarParametrosGeneralSaldosVencidosProveedores();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.saldosvencidosproveedoresReturnGeneral=saldosvencidosproveedoresLogic.procesarAccionSaldosVencidosProveedoressWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress(),this.saldosvencidosproveedoresParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSaldosVencidosProveedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSaldosVencidosProveedores();
					
					SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSaldosVencidosProveedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSaldosVencidosProveedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSaldosVencidosProveedores(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSaldosVencidosProveedoresActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSaldosVencidosProveedores();
			
			if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();		
			SaldosVencidosProveedores saldosvencidosproveedores=new SaldosVencidosProveedores();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSaldosVencidosProveedores(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSaldosVencidosProveedores.getSelectedItem();
			
			
			
			
			saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
			//this.sTipoAccion;
			
			if(saldosvencidosproveedoressSeleccionados.size()==1) {
				for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoressSeleccionados) {
					saldosvencidosproveedores=saldosvencidosproveedoresAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSaldosVencidosProveedores();
			
      		//this.finishProcessSaldosVencidosProveedores(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSaldosVencidosProveedoresReturnGeneral() throws Exception {
		if(this.saldosvencidosproveedoresReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.saldosvencidosproveedoresReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.saldosvencidosproveedoresReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.saldosvencidosproveedoresReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.saldosvencidosproveedoresReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.saldosvencidosproveedoresReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSaldosVencidosProveedores(false);
		}
		
		if(this.saldosvencidosproveedoresReturnGeneral.getConRetornoLista() || this.saldosvencidosproveedoresReturnGeneral.getConRetornoObjeto()) {
			if(this.saldosvencidosproveedoresReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.saldosvencidosproveedoresLogic.setSaldosVencidosProveedoress(this.saldosvencidosproveedoresReturnGeneral.getSaldosVencidosProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingSaldosVencidosProveedores(false);
		}
	}
	
	public void actualizarParametrosGeneralSaldosVencidosProveedores() throws Exception {
		
		
	}
	
	public ArrayList<SaldosVencidosProveedores> getSaldosVencidosProveedoressSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSaldosVencidosProveedores) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress()) {
					if(saldosvencidosproveedoresAux.getIsSelected()) {
						saldosvencidosproveedoressSeleccionados.add(saldosvencidosproveedoresAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosVencidosProveedores saldosvencidosproveedoresAux:this.saldosvencidosproveedoress) {
					if(saldosvencidosproveedoresAux.getIsSelected()) {
						saldosvencidosproveedoressSeleccionados.add(saldosvencidosproveedoresAux);				
					}
				}
			}
			
			if(saldosvencidosproveedoressSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						saldosvencidosproveedoressSeleccionados.addAll(this.saldosvencidosproveedoresLogic.getSaldosVencidosProveedoress());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						saldosvencidosproveedoressSeleccionados.addAll(this.saldosvencidosproveedoress);				
					}
				}
			}
		} else {
			saldosvencidosproveedoressSeleccionados.add(this.saldosvencidosproveedores);
		}
		
		return saldosvencidosproveedoressSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteSaldosVencidosProveedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSaldosVencidosProveedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSaldosVencidosProveedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSaldosVencidosProveedoressSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSaldosVencidosProveedoressSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Saldos Vencidos Proveedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSaldosVencidosProveedoressSeleccionados() throws Exception {
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();		
		
		saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSaldosVencidosProveedoress("Todos",saldosvencidosproveedoressSeleccionados);
		
	}	
	
	public void generarReporteNormalSaldosVencidosProveedoressSeleccionados() throws Exception {
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();		
		
		saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSaldosVencidosProveedoress("Todos",saldosvencidosproveedoressSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSaldosVencidosProveedoressSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();
		
		saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSaldosVencidosProveedoress("Todos",saldosvencidosproveedoressSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSaldosVencidosProveedoressSeleccionados() throws Exception {
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSaldosVencidosProveedores();
		
		
		saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSaldosVencidosProveedores();
		
		
		//this.generarReporteSaldosVencidosProveedoress("Todos",saldosvencidosproveedoressSeleccionados ,saldosvencidosproveedoresImplementable,saldosvencidosproveedoresImplementableHome);
	}
	
	public void mostrarImportacionSaldosVencidosProveedoress() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSaldosVencidosProveedores();
		
		this.abrirFrameImportacionSaldosVencidosProveedores();		
		
			
		//this.generarReporteSaldosVencidosProveedoress("Todos",saldosvencidosproveedoressSeleccionados ,saldosvencidosproveedoresImplementable,saldosvencidosproveedoresImplementableHome);
	}
	
	public void importarSaldosVencidosProveedoress() throws Exception {		
	
	}
	
	public void exportarSaldosVencidosProveedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSaldosVencidosProveedoressSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSaldosVencidosProveedoressSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSaldosVencidosProveedoressSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Saldos Vencidos Proveedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSaldosVencidosProveedoressSeleccionados() throws Exception {
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();		
		
		saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosvencidosproveedores."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSaldosVencidosProveedores(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoressSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSaldosVencidosProveedores(saldosvencidosproveedoresAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//saldosvencidosproveedoresAux.setsDetalleGeneralEntityReporte(saldosvencidosproveedoresAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Vencidos Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSaldosVencidosProveedores(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=saldosvencidosproveedores.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getmoneda_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getfecha_venta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getnombre_moneda();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getsaldo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getsaldo_extra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosvencidosproveedores.getnombre_grupo_cliente();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSaldosVencidosProveedoressSeleccionados() throws Exception {
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();		
		
		saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosvencidosproveedores.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SaldosVencidosProveedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSaldosVencidosProveedores(row);				
				iRow++;
			}				
			
			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoressSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSaldosVencidosProveedores(saldosvencidosproveedoresAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Vencidos Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSaldosVencidosProveedoressSeleccionados() throws Exception {
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();		
		
		saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosvencidosproveedores.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("saldosvencidosproveedoress");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("saldosvencidosproveedores");
			//elementRoot.appendChild(element);
		
			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoressSeleccionados) {
				element = document.createElement("saldosvencidosproveedores");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSaldosVencidosProveedores(saldosvencidosproveedoresAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Vencidos Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSaldosVencidosProveedores(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getmoneda_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getfecha_venta());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getnombre_moneda());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getsaldo());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getsaldo_extra());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosvencidosproveedores.getnombre_grupo_cliente());				
	}
	
	public void setFilaDatosExportarXmlSaldosVencidosProveedores(SaldosVencidosProveedores saldosvencidosproveedores,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SaldosVencidosProveedoresConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(saldosvencidosproveedores.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SaldosVencidosProveedoresConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(saldosvencidosproveedores.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SaldosVencidosProveedoresConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(saldosvencidosproveedores.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementgrupocliente_descripcion = document.createElement(SaldosVencidosProveedoresConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(saldosvencidosproveedores.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementfactura_descripcion = document.createElement(SaldosVencidosProveedoresConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(saldosvencidosproveedores.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementmoneda_descripcion = document.createElement(SaldosVencidosProveedoresConstantesFunciones.IDMONEDA);
		elementmoneda_descripcion.appendChild(document.createTextNode(saldosvencidosproveedores.getmoneda_descripcion()));
		element.appendChild(elementmoneda_descripcion);

		Element elementcliente_descripcion = document.createElement(SaldosVencidosProveedoresConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(saldosvencidosproveedores.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementnumero_factura = document.createElement(SaldosVencidosProveedoresConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(saldosvencidosproveedores.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementfecha_emision = document.createElement(SaldosVencidosProveedoresConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(saldosvencidosproveedores.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_venta = document.createElement(SaldosVencidosProveedoresConstantesFunciones.FECHAVENTA);
		elementfecha_venta.appendChild(document.createTextNode(saldosvencidosproveedores.getfecha_venta().toString().trim()));
		element.appendChild(elementfecha_venta);

		Element elementnombre_moneda = document.createElement(SaldosVencidosProveedoresConstantesFunciones.NOMBREMONEDA);
		elementnombre_moneda.appendChild(document.createTextNode(saldosvencidosproveedores.getnombre_moneda().trim()));
		element.appendChild(elementnombre_moneda);

		Element elementsaldo = document.createElement(SaldosVencidosProveedoresConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(saldosvencidosproveedores.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);

		Element elementsaldo_extra = document.createElement(SaldosVencidosProveedoresConstantesFunciones.SALDOEXTRA);
		elementsaldo_extra.appendChild(document.createTextNode(saldosvencidosproveedores.getsaldo_extra().toString().trim()));
		element.appendChild(elementsaldo_extra);

		Element elementnombre_cliente = document.createElement(SaldosVencidosProveedoresConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(saldosvencidosproveedores.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementnombre_grupo_cliente = document.createElement(SaldosVencidosProveedoresConstantesFunciones.NOMBREGRUPOCLIENTE);
		elementnombre_grupo_cliente.appendChild(document.createTextNode(saldosvencidosproveedores.getnombre_grupo_cliente().trim()));
		element.appendChild(elementnombre_grupo_cliente);
	}
	
	public void generarReporteGroupGenericoSaldosVencidosProveedoressSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados=new ArrayList<SaldosVencidosProveedores>();
		
		saldosvencidosproveedoressSeleccionados=this.getSaldosVencidosProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoSaldosVencidosProveedores(saldosvencidosproveedoressSeleccionados);
		
		this.generarReporteSaldosVencidosProveedoress("Todos",saldosvencidosproveedoressSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSaldosVencidosProveedores(ArrayList<SaldosVencidosProveedores> saldosvencidosproveedoressSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SaldosVencidosProveedores saldosvencidosproveedoresAux:saldosvencidosproveedoressSeleccionados) {
				saldosvencidosproveedoresAux.setsDetalleGeneralEntityReporte(saldosvencidosproveedoresAux.toString());
			
				if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(saldosvencidosproveedoresAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(saldosvencidosproveedoresAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(saldosvencidosproveedoresAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(saldosvencidosproveedoresAux.getmoneda_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(saldosvencidosproveedoresAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(saldosvencidosproveedoresAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(saldosvencidosproveedoresAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(saldosvencidosproveedoresAux.getfecha_venta()));
				}
				 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(saldosvencidosproveedoresAux.getnombre_moneda());
				}
				 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(saldosvencidosproveedoresAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
					existe=true;
					saldosvencidosproveedoresAux.setsDescripcionGeneralEntityReporte1(saldosvencidosproveedoresAux.getnombre_grupo_cliente());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosVencidosProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSaldosVencidosProveedores(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=true;
				this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=true;
				this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=true;
			}
			
			this.isVisibilidadCeldaModificarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaModificarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaModificarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaModificarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaModificarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaModificarSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SaldosVencidosProveedoresJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=true;
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=true;
		} else {
			this.actualizarEstadoPanelsSaldosVencidosProveedores(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSaldosVencidosProveedores=false;
			//this.isVisibilidadCeldaVerFormSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaDuplicarSaldosVencidosProveedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;
		} else {
			this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(!saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;												
			}
			
			this.jButtonCerrarSaldosVencidosProveedores.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;
		}
		
		if(!this.permiteMantenimiento(this.saldosvencidosproveedores)) {
			this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=false;
			this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoSaldosVencidosProveedores=false;
		this.isVisibilidadCeldaNuevoRelacionesSaldosVencidosProveedores=false;
		this.isVisibilidadCeldaGuardarCambiosSaldosVencidosProveedores=false;
		//this.isVisibilidadCeldaModificarSaldosVencidosProveedores=true;
		this.isVisibilidadCeldaActualizarSaldosVencidosProveedores=false;
		this.isVisibilidadCeldaEliminarSaldosVencidosProveedores=false;
		//this.isVisibilidadCeldaCancelarSaldosVencidosProveedores=true;			
		this.isVisibilidadCeldaGuardarSaldosVencidosProveedores=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSaldosVencidosProveedores() {
	}
	
	public void actualizarEstadoPanelsSaldosVencidosProveedores(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosVencidosProveedores!=null) {
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosSaldosVencidosProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosVencidosProveedores!=null) {
				this.jPanelPaginacionSaldosVencidosProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosVencidosProveedores!=null) {
				this.jPanelParametrosReportesSaldosVencidosProveedores.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosVencidosProveedores!=null) {
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosSaldosVencidosProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldosVencidosProveedores!=null) {
				this.jPanelPaginacionSaldosVencidosProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldosVencidosProveedores!=null) {
				this.jPanelParametrosReportesSaldosVencidosProveedores.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosVencidosProveedores!=null) {
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosSaldosVencidosProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldosVencidosProveedores!=null) {
				this.jPanelPaginacionSaldosVencidosProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldosVencidosProveedores!=null) {
				this.jPanelParametrosReportesSaldosVencidosProveedores.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosVencidosProveedores!=null) {
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosSaldosVencidosProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldosVencidosProveedores!=null) {
				this.jPanelPaginacionSaldosVencidosProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldosVencidosProveedores!=null) {
				this.jPanelParametrosReportesSaldosVencidosProveedores.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosVencidosProveedores!=null) {
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosSaldosVencidosProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosVencidosProveedores!=null) {
				this.jPanelPaginacionSaldosVencidosProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosVencidosProveedores!=null) {
				this.jPanelParametrosReportesSaldosVencidosProveedores.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosVencidosProveedores!=null) {
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosSaldosVencidosProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosVencidosProveedores!=null) {
				this.jPanelPaginacionSaldosVencidosProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosVencidosProveedores!=null) {
				this.jPanelParametrosReportesSaldosVencidosProveedores.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosVencidosProveedores!=null) {
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosVencidosProveedores!=null) {
				this.jScrollPanelDatosSaldosVencidosProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosVencidosProveedores!=null) {
				this.jPanelPaginacionSaldosVencidosProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosVencidosProveedores!=null) {
				this.jPanelParametrosReportesSaldosVencidosProveedores.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSaldosVencidosProveedores!=null) {
					this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSaldosVencidosProveedores!=null) {
				this.jPanelParametrosReportesSaldosVencidosProveedores.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosVencidosProveedores!=null) {
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSaldosVencidosProveedores!=null) {
				this.jPanelParametrosReportesSaldosVencidosProveedores.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaSaldosVencidosProveedores=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaSaldosVencidosProveedores) {this.jTabbedPaneBusquedasSaldosVencidosProveedores.remove(jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadBusquedaSaldosVencidosProveedores=isParaGrupoCliente;
			if(!this.isVisibilidadBusquedaSaldosVencidosProveedores) {this.jTabbedPaneBusquedasSaldosVencidosProveedores.remove(jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadBusquedaSaldosVencidosProveedores=isParaFacturaNegation;
			if(!this.isVisibilidadBusquedaSaldosVencidosProveedores) {this.jTabbedPaneBusquedasSaldosVencidosProveedores.remove(jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);}
		}
		
	}

	public void setVisibilidadBusquedasParaMoneda(Boolean isParaMoneda){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMonedaNegation=!isParaMoneda;

			this.isVisibilidadBusquedaSaldosVencidosProveedores=isParaMonedaNegation;
			if(!this.isVisibilidadBusquedaSaldosVencidosProveedores) {this.jTabbedPaneBusquedasSaldosVencidosProveedores.remove(jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaSaldosVencidosProveedores=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaSaldosVencidosProveedores) {this.jTabbedPaneBusquedasSaldosVencidosProveedores.remove(jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSaldosVencidosProveedores(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSaldosVencidosProveedores() {
		this.updateBorderResaltarBusquedasFormularioSaldosVencidosProveedores();
		this.updateVisibilidadBusquedasFormularioSaldosVencidosProveedores();
		this.updateHabilitarBusquedasFormularioSaldosVencidosProveedores();
	}
	
	public void updateBorderResaltarBusquedasFormularioSaldosVencidosProveedores() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSaldosVencidosProveedores.getComponents().length>0) {
	

		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores!=null) {
			index= this.jTabbedPaneBusquedasSaldosVencidosProveedores.indexOfComponent(this.jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosVencidosProveedores.getComponent(index);
				jPanel.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSaldosVencidosProveedores() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSaldosVencidosProveedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSaldosVencidosProveedores.indexOfComponent(this.jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosVencidosProveedores.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);
			if(!this.saldosvencidosproveedoresConstantesFunciones.mostrarBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores && index>-1) {
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSaldosVencidosProveedores() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSaldosVencidosProveedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSaldosVencidosProveedores.indexOfComponent(this.jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosVencidosProveedores.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);
				this.jTabbedPaneBusquedasSaldosVencidosProveedores.setEnabledAt(index,this.saldosvencidosproveedoresConstantesFunciones.activarBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSaldosVencidosProveedores(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaSaldosVencidosProveedores")) {
			index= this.jTabbedPaneBusquedasSaldosVencidosProveedores.indexOfComponent(this.jPanelBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);

			this.jTabbedPaneBusquedasSaldosVencidosProveedores.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosVencidosProveedores.getComponent(index);

			this.saldosvencidosproveedoresConstantesFunciones.setResaltarBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores(resaltar);

			jPanel.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarBusquedaSaldosVencidosProveedoresSaldosVencidosProveedores);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSaldosVencidosProveedores.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioSaldosVencidosProveedores() throws Exception {

		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSaldosVencidosProveedores();
		this.updateVisibilidadResaltarControlesFormularioSaldosVencidosProveedores();
		this.updateHabilitarResaltarControlesFormularioSaldosVencidosProveedores();
		
	}
	
	public void updateBorderResaltarControlesFormularioSaldosVencidosProveedores() throws Exception {
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltaridSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltaridSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarid_empresaSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarid_empresaSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarid_grupo_clienteSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarid_grupo_clienteSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarid_facturaSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarid_facturaSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarid_monedaSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarid_monedaSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarid_clienteSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarid_clienteSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarnumero_facturaSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnumero_facturaSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarnumero_facturaSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarfecha_emisionSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_emisionSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarfecha_emisionSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarfecha_ventaSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_ventaSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarfecha_ventaSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_monedaSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnombre_monedaSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_monedaSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarsaldoSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldoSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarsaldoSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarsaldo_extraSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldo_extraSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarsaldo_extraSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_clienteSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_clienteSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_clienteSaldosVencidosProveedores);}
		if(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_grupo_clienteSaldosVencidosProveedores!=null && this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setBorder(this.saldosvencidosproveedoresConstantesFunciones.resaltarnombre_grupo_clienteSaldosVencidosProveedores);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSaldosVencidosProveedores() throws Exception {		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
	
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostraridSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelidSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostraridSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_empresaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelid_empresaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_empresaSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_grupo_clienteSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelid_grupo_clienteSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_grupo_clienteSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_facturaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelid_facturaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_facturaSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_monedaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelid_monedaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_monedaSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_clienteSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelid_clienteSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarid_clienteSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnumero_facturaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarnumero_facturaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelnumero_facturaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarnumero_facturaSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_emisionSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarfecha_emisionSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelfecha_emisionSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarfecha_emisionSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_ventaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarfecha_ventaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelfecha_ventaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarfecha_ventaSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnombre_monedaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarnombre_monedaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelnombre_monedaSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarnombre_monedaSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldoSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarsaldoSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelsaldoSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarsaldoSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldo_extraSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarsaldo_extraSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelsaldo_extraSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarsaldo_extraSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_clienteSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarnombre_clienteSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelnombre_clienteSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarnombre_clienteSaldosVencidosProveedores);
		//this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarnombre_grupo_clienteSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jPanelnombre_grupo_clienteSaldosVencidosProveedores.setVisible(this.saldosvencidosproveedoresConstantesFunciones.mostrarnombre_grupo_clienteSaldosVencidosProveedores);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSaldosVencidosProveedores() throws Exception {
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSaldosVencidosProveedores!=null) {
	
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jLabelidSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activaridSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_empresaSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarid_empresaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_grupo_clienteSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarid_grupo_clienteSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_facturaSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarid_facturaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_monedaSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarid_monedaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jComboBoxid_clienteSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarid_clienteSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnumero_facturaSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarnumero_facturaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_emisionSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarfecha_emisionSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jDateChooserfecha_ventaSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarfecha_ventaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldnombre_monedaSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarnombre_monedaSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldoSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarsaldoSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextFieldsaldo_extraSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarsaldo_extraSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_clienteSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarnombre_clienteSaldosVencidosProveedores);
		this.jInternalFrameDetalleFormSaldosVencidosProveedores.jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setEnabled(this.saldosvencidosproveedoresConstantesFunciones.activarnombre_grupo_clienteSaldosVencidosProveedores);
		}
	}
	
		
}