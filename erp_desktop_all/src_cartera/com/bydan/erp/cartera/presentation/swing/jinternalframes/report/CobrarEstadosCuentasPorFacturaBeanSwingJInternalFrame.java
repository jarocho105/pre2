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


import java.sql.Time;


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

//import com.bydan.erp.cartera.util.CobrarEstadosCuentasPorFacturaConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarEstadosCuentasPorFacturaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarEstadosCuentasPorFacturaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarEstadosCuentasPorFacturaBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame extends CobrarEstadosCuentasPorFacturaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturaValidator = new ClassValidator<CobrarEstadosCuentasPorFactura>(CobrarEstadosCuentasPorFactura.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura;	
	public CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux;
	public CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaTotales;
	public Long idCobrarEstadosCuentasPorFacturaActual;
	public Long iIdNuevoCobrarEstadosCuentasPorFactura=0L;
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
	
	public Boolean isPermisoTodoCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoNuevoCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoActualizarCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoActualizarOriginalCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoEliminarCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoConsultaCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoBusquedaCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoReporteCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoPaginacionMedioCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoPaginacionAltoCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoPaginacionTodoCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoCopiarCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoVerFormCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoDuplicarCobrarEstadosCuentasPorFactura;
	public Boolean isPermisoOrdenCobrarEstadosCuentasPorFactura;
	
	
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
	
	public CobrarEstadosCuentasPorFacturaParameterReturnGeneral cobrarestadoscuentasporfacturaReturnGeneral;
	public CobrarEstadosCuentasPorFacturaParameterReturnGeneral cobrarestadoscuentasporfacturaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarEstadosCuentasPorFactura=false;
	public Boolean esParaAccionDesdeFormularioCobrarEstadosCuentasPorFactura=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarEstadosCuentasPorFacturaSessionBeanAdditional cobrarestadoscuentasporfacturaSessionBeanAdditional=null;
	
	public CobrarEstadosCuentasPorFacturaSessionBeanAdditional getCobrarEstadosCuentasPorFacturaSessionBeanAdditional() {
		return this.cobrarestadoscuentasporfacturaSessionBeanAdditional;
	}
	
	public void setCobrarEstadosCuentasPorFacturaSessionBeanAdditional(CobrarEstadosCuentasPorFacturaSessionBeanAdditional cobrarestadoscuentasporfacturaSessionBeanAdditional) {
		try {
			this.cobrarestadoscuentasporfacturaSessionBeanAdditional=cobrarestadoscuentasporfacturaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional cobrarestadoscuentasporfacturaBeanSwingJInternalFrameAdditional=null;
	//public class CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame
	
	public CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional getCobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional() {
		return this.cobrarestadoscuentasporfacturaBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional(CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional cobrarestadoscuentasporfacturaBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarestadoscuentasporfacturaBeanSwingJInternalFrameAdditional=cobrarestadoscuentasporfacturaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarEstadosCuentasPorFacturaLogic cobrarestadoscuentasporfacturaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaBean;
	public CobrarEstadosCuentasPorFacturaConstantesFunciones cobrarestadoscuentasporfacturaConstantesFunciones;
	//public CobrarEstadosCuentasPorFacturaParameterReturnGeneral cobrarestadoscuentasporfacturaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturas;	
	//public List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasEliminados;
	//public List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura=true;
	public Boolean isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura=true;
	public Boolean isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura=true;
	public Boolean isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;
	public Boolean isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=false;
	public Boolean isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=false;
	public Boolean isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=false;
	public Boolean isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=false;
	public Boolean isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarEstadosCuentasPorFactura=false;
	public Boolean isVisibilidadBusquedaCobrarEstadosCuentasPorFactura2=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCobrarEstadosCuentasPorFactura() {
		return this.iIdNuevoCobrarEstadosCuentasPorFactura;
	}

	public void setiIdNuevoCobrarEstadosCuentasPorFactura(Long iIdNuevoCobrarEstadosCuentasPorFactura) {
		this.iIdNuevoCobrarEstadosCuentasPorFactura = iIdNuevoCobrarEstadosCuentasPorFactura;
	}
	
	public Long getidCobrarEstadosCuentasPorFacturaActual() {
		return this.idCobrarEstadosCuentasPorFacturaActual;
	}

	public void setidCobrarEstadosCuentasPorFacturaActual(Long idCobrarEstadosCuentasPorFacturaActual) {
		this.idCobrarEstadosCuentasPorFacturaActual = idCobrarEstadosCuentasPorFacturaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarEstadosCuentasPorFactura getcobrarestadoscuentasporfactura() {
		return this.cobrarestadoscuentasporfactura;
	}

	public void setcobrarestadoscuentasporfactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura) {
		this.cobrarestadoscuentasporfactura = cobrarestadoscuentasporfactura;
	}
	
	public CobrarEstadosCuentasPorFactura getcobrarestadoscuentasporfacturaAux() {
		return this.cobrarestadoscuentasporfacturaAux;
	}

	public void setcobrarestadoscuentasporfacturaAux(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux) {
		this.cobrarestadoscuentasporfacturaAux = cobrarestadoscuentasporfacturaAux;
	}				
	
	public CobrarEstadosCuentasPorFactura getcobrarestadoscuentasporfacturaAnterior() {
		return this.cobrarestadoscuentasporfacturaAnterior;
	}

	public void setcobrarestadoscuentasporfacturaAnterior(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAnterior) {
		this.cobrarestadoscuentasporfacturaAnterior = cobrarestadoscuentasporfacturaAnterior;
	}	
	
	public CobrarEstadosCuentasPorFactura getcobrarestadoscuentasporfacturaTotales() {
		return this.cobrarestadoscuentasporfacturaTotales;
	}

	public void setcobrarestadoscuentasporfacturaTotales(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaTotales) {
		this.cobrarestadoscuentasporfacturaTotales = cobrarestadoscuentasporfacturaTotales;
	}	
	
	public CobrarEstadosCuentasPorFactura getcobrarestadoscuentasporfacturaBean() {
		return this.cobrarestadoscuentasporfacturaBean;
	}

	public void setcobrarestadoscuentasporfacturaBean(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaBean) {
		this.cobrarestadoscuentasporfacturaBean = cobrarestadoscuentasporfacturaBean;
	}	
	
	public CobrarEstadosCuentasPorFacturaParameterReturnGeneral getcobrarestadoscuentasporfacturaReturnGeneral() {
		return this.cobrarestadoscuentasporfacturaReturnGeneral;
	}

	public void setcobrarestadoscuentasporfacturaReturnGeneral(CobrarEstadosCuentasPorFacturaParameterReturnGeneral cobrarestadoscuentasporfacturaReturnGeneral) {
		this.cobrarestadoscuentasporfacturaReturnGeneral = cobrarestadoscuentasporfacturaReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura=new Date();

	public Date getfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura() {
		return this.fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura;
	}

	public void setfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura(Date fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura) {
		this.fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura = fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura;
	}

;
	public Date fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura=new Date();

	public Date getfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura() {
		return this.fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura;
	}

	public void setfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura(Date fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura) {
		this.fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura = fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura;
	}

	public Date fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2=new Date();

	public Date getfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2() {
		return this.fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2;
	}

	public void setfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2(Date fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2) {
		this.fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2 = fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2;
	}

;
	public Date fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2=new Date();

	public Date getfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2() {
		return this.fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2;
	}

	public void setfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2(Date fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2) {
		this.fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2 = fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CobrarEstadosCuentasPorFacturaLogic getCobrarEstadosCuentasPorFacturaLogic()	{		
		return cobrarestadoscuentasporfacturaLogic;
	}

	public void setCobrarEstadosCuentasPorFacturaLogic(CobrarEstadosCuentasPorFacturaLogic cobrarestadoscuentasporfacturaLogic) {
		this.cobrarestadoscuentasporfacturaLogic = cobrarestadoscuentasporfacturaLogic;
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
	
	public Boolean getIsEsNuevoCobrarEstadosCuentasPorFactura() {
		return isEsNuevoCobrarEstadosCuentasPorFactura;
	}

	public void setIsEsNuevoCobrarEstadosCuentasPorFactura(Boolean isEsNuevoCobrarEstadosCuentasPorFactura) {
		this.isEsNuevoCobrarEstadosCuentasPorFactura = isEsNuevoCobrarEstadosCuentasPorFactura;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarEstadosCuentasPorFactura() {
		return esParaAccionDesdeFormularioCobrarEstadosCuentasPorFactura;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarEstadosCuentasPorFactura(Boolean esParaAccionDesdeFormularioCobrarEstadosCuentasPorFactura) {
		this.esParaAccionDesdeFormularioCobrarEstadosCuentasPorFactura = esParaAccionDesdeFormularioCobrarEstadosCuentasPorFactura;
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

			if(this.cobrarestadoscuentasporfacturaSessionBean==null) {
				this.cobrarestadoscuentasporfacturaSessionBean=new CobrarEstadosCuentasPorFacturaSessionBean();
			}

			if(!this.cobrarestadoscuentasporfacturaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarestadoscuentasporfacturaSessionBean.getlidEmpresaActual());
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

					if(this.cobrarestadoscuentasporfactura!=null) {
						this.cobrarestadoscuentasporfactura.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
						this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
						if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarEstadosCuentasPorFacturaGenerico)throws Exception
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
				jComboBoxid_empresaCobrarEstadosCuentasPorFacturaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarEstadosCuentasPorFacturaGenerico!=null && jComboBoxid_empresaCobrarEstadosCuentasPorFacturaGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarEstadosCuentasPorFacturaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,JComboBox jComboBoxid_empresaCobrarEstadosCuentasPorFacturaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarEstadosCuentasPorFacturaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarEstadosCuentasPorFacturaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarestadoscuentasporfactura.setid_empresa(empresaAux.getId());
				cobrarestadoscuentasporfactura.setempresa_descripcion(CobrarEstadosCuentasPorFacturaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarestadoscuentasporfactura.setEmpresa(empresaAux);			}
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

					if(!CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { 
							this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { 
					}

					if(!CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
							this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
							this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCobrarEstadosCuentasPorFactura() throws Exception {
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
		
	public CobrarEstadosCuentasPorFacturaParameterReturnGeneral getCobrarEstadosCuentasPorFacturaParameterGeneral() {
		return this.cobrarestadoscuentasporfacturaParameterGeneral;
	}
	
	public void setCobrarEstadosCuentasPorFacturaParameterGeneral(CobrarEstadosCuentasPorFacturaParameterReturnGeneral cobrarestadoscuentasporfacturaParameterGeneral) {
		this.cobrarestadoscuentasporfacturaParameterGeneral = cobrarestadoscuentasporfacturaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarEstadosCuentasPorFactura() {
		return isPermisoTodoCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoTodoCobrarEstadosCuentasPorFactura(Boolean isPermisoTodoCobrarEstadosCuentasPorFactura) {
		this.isPermisoTodoCobrarEstadosCuentasPorFactura = isPermisoTodoCobrarEstadosCuentasPorFactura;
	}

	public Boolean getIsPermisoNuevoCobrarEstadosCuentasPorFactura() {
		return isPermisoNuevoCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoNuevoCobrarEstadosCuentasPorFactura(Boolean isPermisoNuevoCobrarEstadosCuentasPorFactura) {
		this.isPermisoNuevoCobrarEstadosCuentasPorFactura = isPermisoNuevoCobrarEstadosCuentasPorFactura;
	}

	public Boolean getIsPermisoActualizarCobrarEstadosCuentasPorFactura() {
		return isPermisoActualizarCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoActualizarCobrarEstadosCuentasPorFactura(Boolean isPermisoActualizarCobrarEstadosCuentasPorFactura) {
		this.isPermisoActualizarCobrarEstadosCuentasPorFactura = isPermisoActualizarCobrarEstadosCuentasPorFactura;
	}

	public Boolean getIsPermisoEliminarCobrarEstadosCuentasPorFactura() {
		return isPermisoEliminarCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoEliminarCobrarEstadosCuentasPorFactura(Boolean isPermisoEliminarCobrarEstadosCuentasPorFactura) {
		this.isPermisoEliminarCobrarEstadosCuentasPorFactura = isPermisoEliminarCobrarEstadosCuentasPorFactura;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarEstadosCuentasPorFactura() {
		return isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoGuardarCambiosCobrarEstadosCuentasPorFactura(Boolean isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura) {
		this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura = isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsPermisoConsultaCobrarEstadosCuentasPorFactura() {
		return isPermisoConsultaCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoConsultaCobrarEstadosCuentasPorFactura(Boolean isPermisoConsultaCobrarEstadosCuentasPorFactura) {
		this.isPermisoConsultaCobrarEstadosCuentasPorFactura = isPermisoConsultaCobrarEstadosCuentasPorFactura;
	}

	public Boolean getIsPermisoBusquedaCobrarEstadosCuentasPorFactura() {
		return isPermisoBusquedaCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoBusquedaCobrarEstadosCuentasPorFactura(Boolean isPermisoBusquedaCobrarEstadosCuentasPorFactura) {
		this.isPermisoBusquedaCobrarEstadosCuentasPorFactura = isPermisoBusquedaCobrarEstadosCuentasPorFactura;
	}

	public Boolean getIsPermisoReporteCobrarEstadosCuentasPorFactura() {
		return isPermisoReporteCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoReporteCobrarEstadosCuentasPorFactura(Boolean isPermisoReporteCobrarEstadosCuentasPorFactura) {
		this.isPermisoReporteCobrarEstadosCuentasPorFactura = isPermisoReporteCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarEstadosCuentasPorFactura() {
		return isPermisoPaginacionMedioCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoPaginacionMedioCobrarEstadosCuentasPorFactura(Boolean isPermisoPaginacionMedioCobrarEstadosCuentasPorFactura) {
		this.isPermisoPaginacionMedioCobrarEstadosCuentasPorFactura = isPermisoPaginacionMedioCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarEstadosCuentasPorFactura() {
		return isPermisoPaginacionTodoCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoPaginacionTodoCobrarEstadosCuentasPorFactura(Boolean isPermisoPaginacionTodoCobrarEstadosCuentasPorFactura) {
		this.isPermisoPaginacionTodoCobrarEstadosCuentasPorFactura = isPermisoPaginacionTodoCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarEstadosCuentasPorFactura() {
		return isPermisoPaginacionAltoCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoPaginacionAltoCobrarEstadosCuentasPorFactura(Boolean isPermisoPaginacionAltoCobrarEstadosCuentasPorFactura) {
		this.isPermisoPaginacionAltoCobrarEstadosCuentasPorFactura = isPermisoPaginacionAltoCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsPermisoCopiarCobrarEstadosCuentasPorFactura() {
		return isPermisoCopiarCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoCopiarCobrarEstadosCuentasPorFactura(Boolean isPermisoCopiarCobrarEstadosCuentasPorFactura) {
		this.isPermisoCopiarCobrarEstadosCuentasPorFactura = isPermisoCopiarCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsPermisoVerFormCobrarEstadosCuentasPorFactura() {
		return isPermisoVerFormCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoVerFormCobrarEstadosCuentasPorFactura(Boolean isPermisoVerFormCobrarEstadosCuentasPorFactura) {
		this.isPermisoVerFormCobrarEstadosCuentasPorFactura = isPermisoVerFormCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsPermisoDuplicarCobrarEstadosCuentasPorFactura() {
		return isPermisoDuplicarCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoDuplicarCobrarEstadosCuentasPorFactura(Boolean isPermisoDuplicarCobrarEstadosCuentasPorFactura) {
		this.isPermisoDuplicarCobrarEstadosCuentasPorFactura = isPermisoDuplicarCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsPermisoOrdenCobrarEstadosCuentasPorFactura() {
		return isPermisoOrdenCobrarEstadosCuentasPorFactura;
	}

	public void setIsPermisoOrdenCobrarEstadosCuentasPorFactura(Boolean isPermisoOrdenCobrarEstadosCuentasPorFactura) {
		this.isPermisoOrdenCobrarEstadosCuentasPorFactura = isPermisoOrdenCobrarEstadosCuentasPorFactura;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura = isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura = isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura = isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura = isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura = isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura = isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura = isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura = isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura = isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura = isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura = isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura() {
		return isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura(Boolean isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura = isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura;
	}
		
	public CobrarEstadosCuentasPorFacturaSessionBean getcobrarestadoscuentasporfacturaSessionBean() {
		return this.cobrarestadoscuentasporfacturaSessionBean;
	}
	
	public void setcobrarestadoscuentasporfacturaSessionBean(CobrarEstadosCuentasPorFacturaSessionBean cobrarestadoscuentasporfacturaSessionBean) {
		this.cobrarestadoscuentasporfacturaSessionBean=cobrarestadoscuentasporfacturaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarEstadosCuentasPorFactura() {
		return this.isVisibilidadBusquedaCobrarEstadosCuentasPorFactura;
	}

	public void setisVisibilidadBusquedaCobrarEstadosCuentasPorFactura(Boolean isVisibilidadBusquedaCobrarEstadosCuentasPorFactura) {
		this.isVisibilidadBusquedaCobrarEstadosCuentasPorFactura=isVisibilidadBusquedaCobrarEstadosCuentasPorFactura;
	}

	public Boolean getisVisibilidadBusquedaCobrarEstadosCuentasPorFactura2() {
		return this.isVisibilidadBusquedaCobrarEstadosCuentasPorFactura2;
	}

	public void setisVisibilidadBusquedaCobrarEstadosCuentasPorFactura2(Boolean isVisibilidadBusquedaCobrarEstadosCuentasPorFactura2) {
		this.isVisibilidadBusquedaCobrarEstadosCuentasPorFactura2=isVisibilidadBusquedaCobrarEstadosCuentasPorFactura2;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarestadoscuentasporfactura,null);
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
	
	public void bugActualizarReferenciaActual(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfactura);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarestadoscuentasporfacturaAux.setId(cobrarestadoscuentasporfactura.getId());
		cobrarestadoscuentasporfacturaAux.setVersionRow(cobrarestadoscuentasporfactura.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaLocal) throws Exception {
		
		if(this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaLocal) throws Exception {	
		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarestadoscuentasporfacturaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarEstadosCuentasPorFacturaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarestadoscuentasporfacturaValidator.getInvalidValues(this.cobrarestadoscuentasporfactura);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturas) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturas) throws Exception {
		try	{			
			CobrarEstadosCuentasPorFacturaConstantesFunciones.actualizarSelectedLista(cobrarestadoscuentasporfactura,cobrarestadoscuentasporfacturas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarestadoscuentasporfacturasLocal=this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarestadoscuentasporfacturasLocal=this.cobrarestadoscuentasporfacturas;
			}
			//ARCHITECTURE
		
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaLocal:cobrarestadoscuentasporfacturasLocal) {
				if(this.permiteMantenimiento(cobrarestadoscuentasporfacturaLocal) && cobrarestadoscuentasporfacturaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.getCobrarEstadosCuentasPorFacturaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.NOMBRECUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_ciudadCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_zonaCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_completoCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelrucCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.REPRESENTANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelrepresentanteCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.DIAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeldia_pagoCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.HORAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelhora_pagoCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelobservacionCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.NOMBRETRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_transaccionCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.FECHAVENCE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelfecha_venceCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelfecha_emisionCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnumero_facturaCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.DEBITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeldebito_mone_localCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.CREDITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelcredito_mone_localCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.DIRECCIONDIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeldireccion_direccionCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.TELEFONOTELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_ciudadCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_zonaCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_completoCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelrucCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelrepresentanteCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeldia_pagoCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelhora_pagoCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelobservacionCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_transaccionCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelfecha_venceCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelfecha_emisionCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnumero_facturaCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeldebito_mone_localCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelcredito_mone_localCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeldireccion_direccionCobrarEstadosCuentasPorFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura,"");
		
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
		this.iIdNuevoCobrarEstadosCuentasPorFactura--;	
		
		
		this.cobrarestadoscuentasporfacturaAux=new CobrarEstadosCuentasPorFactura();
		
		this.cobrarestadoscuentasporfacturaAux.setId(this.iIdNuevoCobrarEstadosCuentasPorFactura);
		this.cobrarestadoscuentasporfacturaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().add(this.cobrarestadoscuentasporfacturaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarestadoscuentasporfacturas.add(this.cobrarestadoscuentasporfacturaAux);
		}
		//ARCHITECTURE
		
		this.cobrarestadoscuentasporfactura=this.cobrarestadoscuentasporfacturaAux;
		
		if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
		}
				
		//this.setDefaultControlesCobrarEstadosCuentasPorFactura();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarEstadosCuentasPorFactura();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarEstadosCuentasPorFactura();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarEstadosCuentasPorFactura();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaBean,this.cobrarestadoscuentasporfactura,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaReturnGeneral,this.cobrarestadoscuentasporfacturaBean,false);
		
		if(this.cobrarestadoscuentasporfacturaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaReturnGeneral.getCobrarEstadosCuentasPorFactura());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaReturnGeneral.getCobrarEstadosCuentasPorFactura());
		}
		
		if(this.cobrarestadoscuentasporfacturaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaReturnGeneral.getCobrarEstadosCuentasPorFactura(),classes);//this.cobrarestadoscuentasporfacturaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarEstadosCuentasPorFactura();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarEstadosCuentasPorFactura();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.RecargarFormCobrarEstadosCuentasPorFactura(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
						
			if(cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarEstadosCuentasPorFactura();
			}
			
			this.actualizarVisualTableDatosCobrarEstadosCuentasPorFactura();
			
			this.jTableDatosCobrarEstadosCuentasPorFactura.setRowSelectionInterval(this.getIndiceNuevoCobrarEstadosCuentasPorFactura(), this.getIndiceNuevoCobrarEstadosCuentasPorFactura());
			
			this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
						
			this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarEstadosCuentasPorFactura(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_emision_desdeCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_emision_hastaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_vence_desdeCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_vence_hastaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_cuenta_contableCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_ciudadCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_zonaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_completoCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldrucCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarrucCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextArearepresentanteCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarrepresentanteCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activardia_pagoCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarhora_pagoCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreaobservacionCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarobservacionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_transaccionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_venceCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_emisionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnumero_comprobanteCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnumero_facturaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activardebito_mone_localCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarcredito_mone_localCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activardireccion_direccionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activartelefono_telefonoCobrarEstadosCuentasPorFactura);	
		//
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setEnabled(isHabilitar && this.cobrarestadoscuentasporfacturaConstantesFunciones.activarid_empresaCobrarEstadosCuentasPorFactura);
	};
	
	public void setDefaultControlesCobrarEstadosCuentasPorFactura() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarEstadosCuentasPorFactura(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarestadoscuentasporfacturaSessionBean.setConGuardarRelaciones(true);			
			this.cobrarestadoscuentasporfacturaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.setVisible(true);
			
					
		} else {
			//this.cobrarestadoscuentasporfacturaSessionBean.setConGuardarRelaciones(false);			
			this.cobrarestadoscuentasporfacturaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarEstadosCuentasPorFactura() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
				if(cobrarestadoscuentasporfacturaAux.getId().equals(this.iIdNuevoCobrarEstadosCuentasPorFactura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturas) {
				if(cobrarestadoscuentasporfacturaAux.getId().equals(this.iIdNuevoCobrarEstadosCuentasPorFactura)) {
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
	
	public int getIndiceActualCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
				if(cobrarestadoscuentasporfacturaAux.getId().equals(cobrarestadoscuentasporfactura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturas) {
				if(cobrarestadoscuentasporfacturaAux.getId().equals(cobrarestadoscuentasporfactura.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
				if(cobrarestadoscuentasporfacturaAux.getCobrarEstadosCuentasPorFacturaOriginal().getId().equals(cobrarestadoscuentasporfacturaOriginal.getId())) {
					existe=true;
					cobrarestadoscuentasporfacturaOriginal.setId(cobrarestadoscuentasporfacturaAux.getId());
					cobrarestadoscuentasporfacturaOriginal.setVersionRow(cobrarestadoscuentasporfacturaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturas) {
				if(cobrarestadoscuentasporfacturaAux.getCobrarEstadosCuentasPorFacturaOriginal().getId().equals(cobrarestadoscuentasporfacturaOriginal.getId())) {
					existe=true;
					cobrarestadoscuentasporfacturaOriginal.setId(cobrarestadoscuentasporfacturaAux.getId());
					cobrarestadoscuentasporfacturaOriginal.setVersionRow(cobrarestadoscuentasporfacturaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarEstadosCuentasPorFactura(Boolean esParaCancelar) throws Exception {
		cobrarestadoscuentasporfacturasAux=new ArrayList<CobrarEstadosCuentasPorFactura>();
		cobrarestadoscuentasporfacturaAux=new CobrarEstadosCuentasPorFactura();
		
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
					if(cobrarestadoscuentasporfacturaAux.getId()<0) {
						cobrarestadoscuentasporfacturasAux.add(cobrarestadoscuentasporfacturaAux);
					}		
				}
				this.iIdNuevoCobrarEstadosCuentasPorFactura=0L;
				this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().removeAll(cobrarestadoscuentasporfacturasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturas) {
					if(cobrarestadoscuentasporfacturaAux.getId()<0) {
						cobrarestadoscuentasporfacturasAux.add(cobrarestadoscuentasporfacturaAux);
					}		
				}
				this.iIdNuevoCobrarEstadosCuentasPorFactura=0L;
				this.cobrarestadoscuentasporfacturas.removeAll(cobrarestadoscuentasporfacturasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarEstadosCuentasPorFactura 
					&& this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().size()>0
					) {
					cobrarestadoscuentasporfacturaAux=this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().get(this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().size() - 1);
				
					if(cobrarestadoscuentasporfacturaAux.getId()<0) {
						this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().remove(cobrarestadoscuentasporfacturaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarEstadosCuentasPorFactura && this.cobrarestadoscuentasporfacturas.size()>0) {
					cobrarestadoscuentasporfacturaAux=this.cobrarestadoscuentasporfacturas.get(this.cobrarestadoscuentasporfacturas.size() - 1);
				
					if(cobrarestadoscuentasporfacturaAux.getId()<0) {
						this.cobrarestadoscuentasporfacturas.remove(cobrarestadoscuentasporfacturaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarEstadosCuentasPorFactura(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarestadoscuentasporfactura.getId()<0) {
				this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().remove(this.cobrarestadoscuentasporfactura);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarestadoscuentasporfactura.getId()<0) {
				this.cobrarestadoscuentasporfacturas.remove(this.cobrarestadoscuentasporfactura);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarEstadosCuentasPorFactura(List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasAux) throws Exception {
		CobrarEstadosCuentasPorFacturaConstantesFunciones.setEstadosInicialesCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfacturasAux);
	}
	
	public void setEstadosInicialesCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux) throws Exception {
		CobrarEstadosCuentasPorFacturaConstantesFunciones.setEstadosInicialesCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfacturaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarEstadosCuentasPorFacturaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarEstadosCuentasPorFacturaActual()) {
				if(!this.isEsNuevoCobrarEstadosCuentasPorFactura) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarEstadosCuentasPorFactura=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarEstadosCuentasPorFacturaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Estados Cuentas Por Factura ?", "MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura) throws Exception {
		CobrarEstadosCuentasPorFacturaConstantesFunciones.seleccionarAsignar(this.cobrarestadoscuentasporfactura,cobrarestadoscuentasporfactura);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarEstadosCuentasPorFactura=this.isPermisoActualizarOriginalCobrarEstadosCuentasPorFactura;
			
			
			this.seleccionarAsignar(cobrarestadoscuentasporfactura);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarestadoscuentasporfacturaSessionBean.setsFuncionBusquedaRapida(this.cobrarestadoscuentasporfacturaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarEstadosCuentasPorFactura) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarEstadosCuentasPorFactura(esParaCancelar);				
				this.cancelarNuevoCobrarEstadosCuentasPorFactura(esParaCancelar);								
			}
			
			this.cobrarestadoscuentasporfactura=new CobrarEstadosCuentasPorFactura();
			
			this.inicializarCobrarEstadosCuentasPorFactura();
			
			this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarEstadosCuentasPorFactura() throws Exception {
		try {
			CobrarEstadosCuentasPorFacturaConstantesFunciones.inicializarCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarEstadosCuentasPorFacturas(String sAccionBusqueda,List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarEstadosCuentasPorFactura"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarEstadosCuentasPorFacturaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarEstadosCuentasPorFacturaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarEstadosCuentasPorFactura"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Estados Cuentas Por Facturas");		
		parameters.put("busquedapor", CobrarEstadosCuentasPorFacturaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarEstadosCuentasPorFactura=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarEstadosCuentasPorFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarEstadosCuentasPorFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarEstadosCuentasPorFactura=new JRBeanArrayDataSource(CobrarEstadosCuentasPorFacturaJInternalFrame.TraerCobrarEstadosCuentasPorFacturaBeans(cobrarestadoscuentasporfacturasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarEstadosCuentasPorFactura);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarEstadosCuentasPorFacturaBean.TraerCobrarEstadosCuentasPorFacturaBeans(cobrarestadoscuentasporfacturasParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarEstadosCuentasPorFacturas(sAccionBusqueda,sTipoArchivoReporte,cobrarestadoscuentasporfacturasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarEstadosCuentasPorFacturas(sAccionBusqueda,sTipoArchivoReporte,cobrarestadoscuentasporfacturasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFacturaActionPerformed(null);
					//this.generarExcelReporteCobrarEstadosCuentasPorFacturas(sAccionBusqueda,sTipoArchivoReporte,cobrarestadoscuentasporfacturasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarEstadosCuentasPorFacturas(sAccionBusqueda,sTipoArchivoReporte,cobrarestadoscuentasporfacturasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarEstadosCuentasPorFacturas(sAccionBusqueda,sTipoArchivoReporte,cobrarestadoscuentasporfacturasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarEstadosCuentasPorFacturas(sAccionBusqueda,sTipoArchivoReporte,cobrarestadoscuentasporfacturasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarEstadosCuentasPorFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarestadoscuentasporfactura";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarEstadosCuentasPorFacturas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarEstadosCuentasPorFactura("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura : cobrarestadoscuentasporfacturasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarEstadosCuentasPorFacturaConstantesFunciones.generarExcelReporteDataCobrarEstadosCuentasPorFactura("NORMAL",row,workbook,cobrarestadoscuentasporfactura,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarEstadosCuentasPorFactura(String sTipo,Row row,Workbook workbook) {
		
		CobrarEstadosCuentasPorFacturaConstantesFunciones.generarExcelReporteHeaderCobrarEstadosCuentasPorFactura(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarEstadosCuentasPorFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarestadoscuentasporfactura_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarEstadosCuentasPorFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura : cobrarestadoscuentasporfacturasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.getCobrarEstadosCuentasPorFacturaDescripcion(cobrarestadoscuentasporfactura));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_vence_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_vence_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_cuenta_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getrepresentante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getdia_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.gethora_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getobservacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_transaccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_vence());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getdebito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getcredito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.getdireccion_direccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarestadoscuentasporfactura.gettelefono_telefono());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarEstadosCuentasPorFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasRespaldo=null;
		
		classes=CobrarEstadosCuentasPorFacturaConstantesFunciones.getClassesRelationshipsOfCobrarEstadosCuentasPorFactura(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarestadoscuentasporfacturaLogic.setDatosCliente(this.datosCliente);
		this.cobrarestadoscuentasporfacturaLogic.setDatosDeep(this.datosDeep);
		this.cobrarestadoscuentasporfacturaLogic.setIsConDeep(true);
		
		cobrarestadoscuentasporfacturasRespaldo=this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas();
		
		this.cobrarestadoscuentasporfacturaLogic.setCobrarEstadosCuentasPorFacturas(cobrarestadoscuentasporfacturasParaReportes);	
		this.cobrarestadoscuentasporfacturaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarestadoscuentasporfacturasParaReportes=this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas();
		this.cobrarestadoscuentasporfacturaLogic.setCobrarEstadosCuentasPorFacturas(cobrarestadoscuentasporfacturasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarestadoscuentasporfactura_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarEstadosCuentasPorFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarEstadosCuentasPorFactura("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura : cobrarestadoscuentasporfacturasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarEstadosCuentasPorFactura("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarEstadosCuentasPorFacturaConstantesFunciones.generarExcelReporteDataCobrarEstadosCuentasPorFactura("NORMAL",row,workbook,cobrarestadoscuentasporfactura,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.getCobrarEstadosCuentasPorFacturaDescripcion(cobrarestadoscuentasporfactura));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarEstadosCuentasPorFactura() throws Exception {		
		this.startProcessCobrarEstadosCuentasPorFactura(true);
	}
	
	public void startProcessCobrarEstadosCuentasPorFactura(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura ,this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura, this.jScrollPanelDatosCobrarEstadosCuentasPorFactura,this.jPanelPaginacionCobrarEstadosCuentasPorFactura, this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura, this.jPanelAccionesCobrarEstadosCuentasPorFactura,this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura,this.jmenuBarCobrarEstadosCuentasPorFactura,this.jmenuBarDetalleCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarDetalleCobrarEstadosCuentasPorFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura=this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura; 
		
		final JPanel jPanelParametrosReportesCobrarEstadosCuentasPorFactura=this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura;
		//final JScrollPane jScrollPanelDatosCobrarEstadosCuentasPorFactura=this.jScrollPanelDatosCobrarEstadosCuentasPorFactura;
		final JTable jTableDatosCobrarEstadosCuentasPorFactura=this.jTableDatosCobrarEstadosCuentasPorFactura;		
		final JPanel jPanelPaginacionCobrarEstadosCuentasPorFactura=this.jPanelPaginacionCobrarEstadosCuentasPorFactura;
		//final JScrollPane jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura=this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura;
		final JPanel jPanelAccionesCobrarEstadosCuentasPorFactura=this.jPanelAccionesCobrarEstadosCuentasPorFactura;
		
		JPanel jPanelCamposAuxiliarCobrarEstadosCuentasPorFactura=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarEstadosCuentasPorFactura=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			jPanelCamposAuxiliarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelCamposCobrarEstadosCuentasPorFactura;
			jPanelAccionesFormularioAuxiliarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura;
		}
		
		final JPanel jPanelCamposCobrarEstadosCuentasPorFactura=jPanelCamposAuxiliarCobrarEstadosCuentasPorFactura;
		final JPanel jPanelAccionesFormularioCobrarEstadosCuentasPorFactura=jPanelAccionesFormularioAuxiliarCobrarEstadosCuentasPorFactura;
		
		
		final JMenuBar jmenuBarCobrarEstadosCuentasPorFactura=this.jmenuBarCobrarEstadosCuentasPorFactura;
		final JToolBar jTtoolBarCobrarEstadosCuentasPorFactura=this.jTtoolBarCobrarEstadosCuentasPorFactura;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarEstadosCuentasPorFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarEstadosCuentasPorFactura=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			jmenuBarDetalleAuxiliarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jmenuBarDetalleCobrarEstadosCuentasPorFactura;
			jTtoolBarDetalleAuxiliarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTtoolBarDetalleCobrarEstadosCuentasPorFactura;
		}
		
		final JMenuBar jmenuBarDetalleCobrarEstadosCuentasPorFactura=jmenuBarDetalleAuxiliarCobrarEstadosCuentasPorFactura;
		final JToolBar jTtoolBarDetalleCobrarEstadosCuentasPorFactura=jTtoolBarDetalleAuxiliarCobrarEstadosCuentasPorFactura;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarEstadosCuentasPorFactura;
			processRunnable.jTableDatos=jTableDatosCobrarEstadosCuentasPorFactura;
			processRunnable.jPanelCampos=jPanelCamposCobrarEstadosCuentasPorFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarEstadosCuentasPorFactura;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarEstadosCuentasPorFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarEstadosCuentasPorFactura;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarEstadosCuentasPorFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarEstadosCuentasPorFactura;
			processRunnable.jTtoolBar=jTtoolBarCobrarEstadosCuentasPorFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarEstadosCuentasPorFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura ,jPanelParametrosReportesCobrarEstadosCuentasPorFactura,jTableDatosCobrarEstadosCuentasPorFactura, /*jScrollPanelDatosCobrarEstadosCuentasPorFactura,*/jPanelCamposCobrarEstadosCuentasPorFactura,jPanelPaginacionCobrarEstadosCuentasPorFactura, /*jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura,*/ jPanelAccionesCobrarEstadosCuentasPorFactura,jPanelAccionesFormularioCobrarEstadosCuentasPorFactura,jmenuBarCobrarEstadosCuentasPorFactura,jmenuBarDetalleCobrarEstadosCuentasPorFactura,jTtoolBarCobrarEstadosCuentasPorFactura,jTtoolBarDetalleCobrarEstadosCuentasPorFactura);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura ,jPanelParametrosReportesCobrarEstadosCuentasPorFactura, jScrollPanelDatosCobrarEstadosCuentasPorFactura,jPanelPaginacionCobrarEstadosCuentasPorFactura, jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura, jPanelAccionesCobrarEstadosCuentasPorFactura,jPanelAccionesFormularioCobrarEstadosCuentasPorFactura,jmenuBarCobrarEstadosCuentasPorFactura,jmenuBarDetalleCobrarEstadosCuentasPorFactura,jTtoolBarCobrarEstadosCuentasPorFactura,jTtoolBarDetalleCobrarEstadosCuentasPorFactura);
						
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
	
	public void finishProcessCobrarEstadosCuentasPorFactura() {// throws Exception 
		this.finishProcessCobrarEstadosCuentasPorFactura(true);
	}
	
	public void finishProcessCobrarEstadosCuentasPorFactura(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura ,this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura, this.jScrollPanelDatosCobrarEstadosCuentasPorFactura,this.jPanelPaginacionCobrarEstadosCuentasPorFactura, this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura, this.jPanelAccionesCobrarEstadosCuentasPorFactura,this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura,this.jmenuBarCobrarEstadosCuentasPorFactura,this.jmenuBarDetalleCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarDetalleCobrarEstadosCuentasPorFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura=this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura; 
		
		final JPanel jPanelParametrosReportesCobrarEstadosCuentasPorFactura=this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura;
		//final JScrollPane jScrollPanelDatosCobrarEstadosCuentasPorFactura=this.jScrollPanelDatosCobrarEstadosCuentasPorFactura;
		final JTable jTableDatosCobrarEstadosCuentasPorFactura=this.jTableDatosCobrarEstadosCuentasPorFactura;		
		final JPanel jPanelPaginacionCobrarEstadosCuentasPorFactura=this.jPanelPaginacionCobrarEstadosCuentasPorFactura;
		//final JScrollPane jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura=this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura;
		final JPanel jPanelAccionesCobrarEstadosCuentasPorFactura=this.jPanelAccionesCobrarEstadosCuentasPorFactura;
		
		JPanel jPanelCamposAuxiliarCobrarEstadosCuentasPorFactura=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarEstadosCuentasPorFactura=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			jPanelCamposAuxiliarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelCamposCobrarEstadosCuentasPorFactura;
			jPanelAccionesFormularioAuxiliarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura;
		}
		
		final JPanel jPanelCamposCobrarEstadosCuentasPorFactura=jPanelCamposAuxiliarCobrarEstadosCuentasPorFactura;
		final JPanel jPanelAccionesFormularioCobrarEstadosCuentasPorFactura=jPanelAccionesFormularioAuxiliarCobrarEstadosCuentasPorFactura;
		
		
		final JMenuBar jmenuBarCobrarEstadosCuentasPorFactura=this.jmenuBarCobrarEstadosCuentasPorFactura;		
		final JToolBar jTtoolBarCobrarEstadosCuentasPorFactura=this.jTtoolBarCobrarEstadosCuentasPorFactura;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarEstadosCuentasPorFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarEstadosCuentasPorFactura=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			jmenuBarDetalleAuxiliarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jmenuBarDetalleCobrarEstadosCuentasPorFactura;
			jTtoolBarDetalleAuxiliarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTtoolBarDetalleCobrarEstadosCuentasPorFactura;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarEstadosCuentasPorFactura=jmenuBarDetalleAuxiliarCobrarEstadosCuentasPorFactura;
		final JToolBar jTtoolBarDetalleCobrarEstadosCuentasPorFactura=jTtoolBarDetalleAuxiliarCobrarEstadosCuentasPorFactura;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarEstadosCuentasPorFactura;
			processRunnable.jTableDatos=jTableDatosCobrarEstadosCuentasPorFactura;
			processRunnable.jPanelCampos=jPanelCamposCobrarEstadosCuentasPorFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarEstadosCuentasPorFactura;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarEstadosCuentasPorFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarEstadosCuentasPorFactura;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarEstadosCuentasPorFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarEstadosCuentasPorFactura;
			processRunnable.jTtoolBar=jTtoolBarCobrarEstadosCuentasPorFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarEstadosCuentasPorFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura ,jPanelParametrosReportesCobrarEstadosCuentasPorFactura, jTableDatosCobrarEstadosCuentasPorFactura,/*jScrollPanelDatosCobrarEstadosCuentasPorFactura,*/jPanelCamposCobrarEstadosCuentasPorFactura,jPanelPaginacionCobrarEstadosCuentasPorFactura, /*jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura,*/ jPanelAccionesCobrarEstadosCuentasPorFactura,jPanelAccionesFormularioCobrarEstadosCuentasPorFactura,jmenuBarCobrarEstadosCuentasPorFactura,jmenuBarDetalleCobrarEstadosCuentasPorFactura,jTtoolBarCobrarEstadosCuentasPorFactura,jTtoolBarDetalleCobrarEstadosCuentasPorFactura));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarEstadosCuentasPorFactura(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarEstadosCuentasPorFactura(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarEstadosCuentasPorFactura(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarEstadosCuentasPorFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarEstadosCuentasPorFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarEstadosCuentasPorFactura,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarEstadosCuentasPorFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarEstadosCuentasPorFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarEstadosCuentasPorFactura,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarestadoscuentasporfacturaConstantesFunciones.getsFinalQueryCobrarEstadosCuentasPorFactura();
		String  finalQueryPaginacionTodos=this.cobrarestadoscuentasporfacturaConstantesFunciones.getsFinalQueryCobrarEstadosCuentasPorFactura();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarEstadosCuentasPorFacturaConstantesFunciones.getArrayColumnasGlobalesNoCobrarEstadosCuentasPorFactura(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarEstadosCuentasPorFacturaConstantesFunciones.getArrayColumnasGlobalesCobrarEstadosCuentasPorFactura(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarEstadosCuentasPorFacturaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarestadoscuentasporfacturasEliminados= new ArrayList<CobrarEstadosCuentasPorFactura>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarEstadosCuentasPorFactura();
		
				///*CobrarEstadosCuentasPorFacturaSessionBean*/this.cobrarestadoscuentasporfacturaSessionBean=new CobrarEstadosCuentasPorFacturaSessionBean();
			
			if(this.cobrarestadoscuentasporfacturaSessionBean==null) {
				this.cobrarestadoscuentasporfacturaSessionBean=new CobrarEstadosCuentasPorFacturaSessionBean();
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
					this.iNumeroPaginacion=CobrarEstadosCuentasPorFacturaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarEstadosCuentasPorFacturaConstantesFunciones.getClassesForeignKeysOfCobrarEstadosCuentasPorFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarestadoscuentasporfactura."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarestadoscuentasporfacturasAux= new ArrayList<CobrarEstadosCuentasPorFactura>();
			
				
			cobrarestadoscuentasporfacturaLogic.setDatosCliente(this.datosCliente);
			cobrarestadoscuentasporfacturaLogic.setDatosDeep(this.datosDeep);
			cobrarestadoscuentasporfacturaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarEstadosCuentasPorFactura")) {
				this.sDetalleReporte=CobrarEstadosCuentasPorFacturaConstantesFunciones.getDetalleIndiceBusquedaCobrarEstadosCuentasPorFactura(fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura,fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura,fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarEstadosCuentasPorFacturaConstantesFunciones.getDetalleIndiceBusquedaCobrarEstadosCuentasPorFactura(fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura,fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarEstadosCuentasPorFacturaConstantesFunciones.getDetalleIndiceBusquedaCobrarEstadosCuentasPorFactura(fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura,fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()==null||cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarestadoscuentasporfacturas==null|| cobrarestadoscuentasporfacturas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarestadoscuentasporfacturasAux=new ArrayList<CobrarEstadosCuentasPorFactura>();
						cobrarestadoscuentasporfacturasAux.addAll(cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarestadoscuentasporfacturasAux=new ArrayList<CobrarEstadosCuentasPorFactura>();
							cobrarestadoscuentasporfacturasAux.addAll(cobrarestadoscuentasporfacturas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura,fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarEstadosCuentasPorFacturaConstantesFunciones.getDetalleIndiceBusquedaCobrarEstadosCuentasPorFactura(fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura,fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarEstadosCuentasPorFacturaConstantesFunciones.getDetalleIndiceBusquedaCobrarEstadosCuentasPorFactura(fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura,fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarEstadosCuentasPorFacturas("BusquedaCobrarEstadosCuentasPorFactura",cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarEstadosCuentasPorFacturas("BusquedaCobrarEstadosCuentasPorFactura",cobrarestadoscuentasporfacturas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarestadoscuentasporfacturaLogic.setCobrarEstadosCuentasPorFacturas(new ArrayList<CobrarEstadosCuentasPorFactura>());
						cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().addAll(cobrarestadoscuentasporfacturasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarestadoscuentasporfacturas=new ArrayList<CobrarEstadosCuentasPorFactura>();
							cobrarestadoscuentasporfacturas.addAll(cobrarestadoscuentasporfacturasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaCobrarEstadosCuentasPorFactura2")) {
				this.sDetalleReporte=CobrarEstadosCuentasPorFacturaConstantesFunciones.getDetalleIndiceBusquedaCobrarEstadosCuentasPorFactura2(fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2,fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura2(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2,fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarEstadosCuentasPorFacturaConstantesFunciones.getDetalleIndiceBusquedaCobrarEstadosCuentasPorFactura2(fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2,fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarEstadosCuentasPorFacturaConstantesFunciones.getDetalleIndiceBusquedaCobrarEstadosCuentasPorFactura2(fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2,fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()==null||cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarestadoscuentasporfacturas==null|| cobrarestadoscuentasporfacturas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarestadoscuentasporfacturasAux=new ArrayList<CobrarEstadosCuentasPorFactura>();
						cobrarestadoscuentasporfacturasAux.addAll(cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarestadoscuentasporfacturasAux=new ArrayList<CobrarEstadosCuentasPorFactura>();
							cobrarestadoscuentasporfacturasAux.addAll(cobrarestadoscuentasporfacturas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura2(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2,fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarEstadosCuentasPorFacturaConstantesFunciones.getDetalleIndiceBusquedaCobrarEstadosCuentasPorFactura2(fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2,fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarEstadosCuentasPorFacturaConstantesFunciones.getDetalleIndiceBusquedaCobrarEstadosCuentasPorFactura2(fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2,fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarEstadosCuentasPorFacturas("BusquedaCobrarEstadosCuentasPorFactura2",cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarEstadosCuentasPorFacturas("BusquedaCobrarEstadosCuentasPorFactura2",cobrarestadoscuentasporfacturas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarestadoscuentasporfacturaLogic.setCobrarEstadosCuentasPorFacturas(new ArrayList<CobrarEstadosCuentasPorFactura>());
						cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().addAll(cobrarestadoscuentasporfacturasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarestadoscuentasporfacturas=new ArrayList<CobrarEstadosCuentasPorFactura>();
							cobrarestadoscuentasporfacturas.addAll(cobrarestadoscuentasporfacturasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarEstadosCuentasPorFactura();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarEstadosCuentasPorFactura();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarestadoscuentasporfacturas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarestadoscuentasporfacturas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura) {
		Boolean permite=true;
		
		if(this.cobrarestadoscuentasporfactura.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarEstadosCuentasPorFacturaConstantesFunciones.getOrderByListaCobrarEstadosCuentasPorFactura();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarEstadosCuentasPorFacturaConstantesFunciones.getOrderByListaCobrarEstadosCuentasPorFactura();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
				if(cobrarestadoscuentasporfactura.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarestadoscuentasporfacturaTotales=cobrarestadoscuentasporfactura;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:this.cobrarestadoscuentasporfacturas) {
				if(cobrarestadoscuentasporfactura.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarestadoscuentasporfacturaTotales=cobrarestadoscuentasporfactura;
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
			this.cobrarestadoscuentasporfacturaAux=new CobrarEstadosCuentasPorFactura();
			this.cobrarestadoscuentasporfacturaAux.setsType(Constantes2.S_TOTALES);
			this.cobrarestadoscuentasporfacturaAux.setIsNew(false);
			this.cobrarestadoscuentasporfacturaAux.setIsChanged(false);
			this.cobrarestadoscuentasporfacturaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarEstadosCuentasPorFacturaConstantesFunciones.TotalizarValoresFilaCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas(),this.cobrarestadoscuentasporfacturaAux);
				
				//this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().add(this.cobrarestadoscuentasporfacturaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarEstadosCuentasPorFacturaConstantesFunciones.TotalizarValoresFilaCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturas,this.cobrarestadoscuentasporfacturaAux);
				
				this.cobrarestadoscuentasporfacturas.add(this.cobrarestadoscuentasporfacturaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarestadoscuentasporfacturaTotales=new CobrarEstadosCuentasPorFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().remove(cobrarestadoscuentasporfacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarestadoscuentasporfacturas.remove(cobrarestadoscuentasporfacturaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarestadoscuentasporfacturaTotales=new CobrarEstadosCuentasPorFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
				if(cobrarestadoscuentasporfactura.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarestadoscuentasporfacturaTotales=cobrarestadoscuentasporfactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarEstadosCuentasPorFacturaConstantesFunciones.TotalizarValoresFilaCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas(),cobrarestadoscuentasporfacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:this.cobrarestadoscuentasporfacturas) {
				if(cobrarestadoscuentasporfactura.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarestadoscuentasporfacturaTotales=cobrarestadoscuentasporfactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarEstadosCuentasPorFacturaConstantesFunciones.TotalizarValoresFilaCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturas,cobrarestadoscuentasporfacturaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarEstadosCuentasPorFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura2()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarEstadosCuentasPorFactura2";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarEstadosCuentasPorFacturasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura2(String sFinalQuery,Date fecha_vence_desde,Date fecha_vence_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura2(sFinalQuery,this.pagination,fecha_vence_desde,fecha_vence_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarEstadosCuentasPorFacturasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosCobrarEstadosCuentasPorFactura() {
		this.isPermisoTodoCobrarEstadosCuentasPorFactura=false;
		this.isPermisoNuevoCobrarEstadosCuentasPorFactura=false;
		this.isPermisoActualizarCobrarEstadosCuentasPorFactura=false;
		this.isPermisoActualizarOriginalCobrarEstadosCuentasPorFactura=false;
		this.isPermisoEliminarCobrarEstadosCuentasPorFactura=false;
		this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura=false;
		this.isPermisoConsultaCobrarEstadosCuentasPorFactura=true;
		this.isPermisoBusquedaCobrarEstadosCuentasPorFactura=true;
		this.isPermisoReporteCobrarEstadosCuentasPorFactura=true;
		this.isPermisoOrdenCobrarEstadosCuentasPorFactura=false;		
		this.isPermisoPaginacionMedioCobrarEstadosCuentasPorFactura=false;		
		this.isPermisoPaginacionAltoCobrarEstadosCuentasPorFactura=false;		
		this.isPermisoPaginacionTodoCobrarEstadosCuentasPorFactura=false;		
		this.isPermisoCopiarCobrarEstadosCuentasPorFactura=false;		
		this.isPermisoVerFormCobrarEstadosCuentasPorFactura=false;		
		this.isPermisoDuplicarCobrarEstadosCuentasPorFactura=false;
		this.isPermisoOrdenCobrarEstadosCuentasPorFactura=false;
	}
	
	public void setPermisosUsuarioCobrarEstadosCuentasPorFactura(Boolean isPermiso) {
		this.isPermisoTodoCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoNuevoCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoActualizarCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoActualizarOriginalCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoEliminarCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoConsultaCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoBusquedaCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoReporteCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoOrdenCobrarEstadosCuentasPorFactura=isPermiso;		
		this.isPermisoPaginacionMedioCobrarEstadosCuentasPorFactura=isPermiso;		
		this.isPermisoPaginacionAltoCobrarEstadosCuentasPorFactura=isPermiso;		
		this.isPermisoPaginacionTodoCobrarEstadosCuentasPorFactura=isPermiso;		
		this.isPermisoCopiarCobrarEstadosCuentasPorFactura=isPermiso;		
		this.isPermisoVerFormCobrarEstadosCuentasPorFactura=isPermiso;		
		this.isPermisoDuplicarCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoOrdenCobrarEstadosCuentasPorFactura=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarEstadosCuentasPorFactura(Boolean isPermiso) {
		//this.isPermisoTodoCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoNuevoCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoActualizarCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoActualizarOriginalCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoEliminarCobrarEstadosCuentasPorFactura=isPermiso;
		this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura=isPermiso;
		//this.isPermisoConsultaCobrarEstadosCuentasPorFactura=isPermiso;
		//this.isPermisoBusquedaCobrarEstadosCuentasPorFactura=isPermiso;
		//this.isPermisoReporteCobrarEstadosCuentasPorFactura=isPermiso;
		//this.isPermisoOrdenCobrarEstadosCuentasPorFactura=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarEstadosCuentasPorFactura=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarEstadosCuentasPorFactura=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarEstadosCuentasPorFactura=isPermiso;		
		//this.isPermisoCopiarCobrarEstadosCuentasPorFactura=isPermiso;		
		//this.isPermisoDuplicarCobrarEstadosCuentasPorFactura=isPermiso;
		//this.isPermisoOrdenCobrarEstadosCuentasPorFactura=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarEstadosCuentasPorFacturaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarEstadosCuentasPorFactura(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarEstadosCuentasPorFacturaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarEstadosCuentasPorFacturaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarEstadosCuentasPorFacturaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarEstadosCuentasPorFacturaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarEstadosCuentasPorFactura() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarEstadosCuentasPorFacturaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarEstadosCuentasPorFactura=this.isPermisoActualizarCobrarEstadosCuentasPorFactura;
			this.isPermisoEliminarCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarEstadosCuentasPorFactura=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarEstadosCuentasPorFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarEstadosCuentasPorFactura.setToolTipText(this.jTableDatosCobrarEstadosCuentasPorFactura.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarEstadosCuentasPorFactura(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarEstadosCuentasPorFactura(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarEstadosCuentasPorFactura() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarEstadosCuentasPorFacturaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarEstadosCuentasPorFacturaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarEstadosCuentasPorFactura()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarestadoscuentasporfacturaSessionBean==null) {
				this.cobrarestadoscuentasporfacturaSessionBean=new CobrarEstadosCuentasPorFacturaSessionBean();
			}

			if(!this.cobrarestadoscuentasporfacturaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyCobrarEstadosCuentasPorFactura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarEstadosCuentasPorFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarEstadosCuentasPorFactura()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarEstadosCuentasPorFactura();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarEstadosCuentasPorFactura()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarEstadosCuentasPorFactura()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarEstadosCuentasPorFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarEstadosCuentasPorFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarEstadosCuentasPorFactura()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarEstadosCuentasPorFactura()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarEstadosCuentasPorFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarEstadosCuentasPorFactura()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarestadoscuentasporfacturaSessionBean=new CobrarEstadosCuentasPorFacturaSessionBean(); 
		this.cobrarestadoscuentasporfacturaConstantesFunciones=new CobrarEstadosCuentasPorFacturaConstantesFunciones(); 
		this.cobrarestadoscuentasporfacturaBean=new CobrarEstadosCuentasPorFactura();//(this.cobrarestadoscuentasporfacturaConstantesFunciones); 		
		this.cobrarestadoscuentasporfacturaReturnGeneral=new CobrarEstadosCuentasPorFacturaParameterReturnGeneral(); 
		
		this.cobrarestadoscuentasporfacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarestadoscuentasporfacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarEstadosCuentasPorFactura(true);
			
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
			
			this.cobrarestadoscuentasporfacturaConstantesFunciones=new CobrarEstadosCuentasPorFacturaConstantesFunciones(); 
			this.cobrarestadoscuentasporfacturaBean=new CobrarEstadosCuentasPorFactura();//this.cobrarestadoscuentasporfacturaConstantesFunciones); 			
			this.cobrarestadoscuentasporfacturaReturnGeneral=new CobrarEstadosCuentasPorFacturaParameterReturnGeneral(); 
		
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Estados Cuentas Por Factura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cobrarestadoscuentasporfactura=new CobrarEstadosCuentasPorFactura();
			this.cobrarestadoscuentasporfacturas = new ArrayList<CobrarEstadosCuentasPorFactura>();
			this.cobrarestadoscuentasporfacturasAux = new ArrayList<CobrarEstadosCuentasPorFactura>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic=new CobrarEstadosCuentasPorFacturaLogic();
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarestadoscuentasporfacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarestadoscuentasporfacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura);	
					}
					
					if(this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura);
				this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setVisible(false);
				this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura);
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura);
					this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setVisible(false);
					this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura);
					this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setVisible(false);
					this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarEstadosCuentasPorFacturaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarEstadosCuentasPorFacturaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarestadoscuentasporfacturaReturnGeneral=new CobrarEstadosCuentasPorFacturaParameterReturnGeneral();
			
			this.cobrarestadoscuentasporfacturaParameterGeneral=new CobrarEstadosCuentasPorFacturaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarestadoscuentasporfacturaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarEstadosCuentasPorFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado(),this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarEstadosCuentasPorFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado(),this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=false;
			
			
			this.isVisibilidadBusquedaCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadBusquedaCobrarEstadosCuentasPorFactura2=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarEstadosCuentasPorFactura();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarEstadosCuentasPorFactura(false);
			
			this.setPermisosUsuarioCobrarEstadosCuentasPorFactura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() && this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarEstadosCuentasPorFacturaClasesRelacionadas();
			}
			
			if(this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarEstadosCuentasPorFacturaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarEstadosCuentasPorFactura();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarEstadosCuentasPorFactura();
			}
			
			if(!this.isPermisoBusquedaCobrarEstadosCuentasPorFactura) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarEstadosCuentasPorFacturaConstantesFunciones.getTiposSeleccionarCobrarEstadosCuentasPorFactura());
				
				this.tiposColumnasSelect=CobrarEstadosCuentasPorFacturaConstantesFunciones.getTiposSeleccionarCobrarEstadosCuentasPorFactura(true);
				
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
			//if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarEstadosCuentasPorFactura();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCobrarEstadosCuentasPorFactura(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCobrarEstadosCuentasPorFactura(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarEstadosCuentasPorFactura() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cobrarestadoscuentasporfacturaImplementable= (CobrarEstadosCuentasPorFacturaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarEstadosCuentasPorFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarestadoscuentasporfacturaImplementableHome= (CobrarEstadosCuentasPorFacturaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarEstadosCuentasPorFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarestadoscuentasporfacturas= new ArrayList<CobrarEstadosCuentasPorFactura>();
			this.cobrarestadoscuentasporfacturasEliminados= new ArrayList<CobrarEstadosCuentasPorFactura>();
						
			this.isEsNuevoCobrarEstadosCuentasPorFactura=false;
			this.esParaAccionDesdeFormularioCobrarEstadosCuentasPorFactura=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarEstadosCuentasPorFactura(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarEstadosCuentasPorFactura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarEstadosCuentasPorFacturaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarEstadosCuentasPorFactura();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarEstadosCuentasPorFactura();
			}
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarEstadosCuentasPorFactura(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarEstadosCuentasPorFactura: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarEstadosCuentasPorFactura() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarEstadosCuentasPorFactura")) {
				iIndex=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarEstadosCuentasPorFactura();	
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
	
	public void cargarCombosForeignKeyCobrarEstadosCuentasPorFactura(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarEstadosCuentasPorFactura(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarEstadosCuentasPorFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarEstadosCuentasPorFacturaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarEstadosCuentasPorFactura();
		
		this.cargarCombosFrameForeignKeyCobrarEstadosCuentasPorFactura();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarEstadosCuentasPorFactura();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarEstadosCuentasPorFactura();
		}
	}
	
	
	
	public void jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
			
			if(jTableDatosCobrarEstadosCuentasPorFactura.getRowCount()>=1) {
				jTableDatosCobrarEstadosCuentasPorFactura.removeRowSelectionInterval(0, jTableDatosCobrarEstadosCuentasPorFactura.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarEstadosCuentasPorFactura=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarEstadosCuentasPorFactura(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarEstadosCuentasPorFactura(true);			
			//this.cobrarestadoscuentasporfactura=new CobrarEstadosCuentasPorFactura();
			//this.cobrarestadoscuentasporfactura.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarEstadosCuentasPorFactura(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarEstadosCuentasPorFactura() ;
			
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarEstadosCuentasPorFactura(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarestadoscuentasporfactura);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);				
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
			if(this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarEstadosCuentasPorFactura: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRows().length;			
			}
			
			cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarEstadosCuentasPorFactura--;			
				//CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux= new CobrarEstadosCuentasPorFactura();			
				//cobrarestadoscuentasporfacturaAux.setId(this.iIdNuevoCobrarEstadosCuentasPorFactura);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaOrigen=new CobrarEstadosCuentasPorFactura();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaOrigen : cobrarestadoscuentasporfacturasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarestadoscuentasporfacturaOrigen =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarestadoscuentasporfacturaOrigen =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarEstadosCuentasPorFactura();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarestadoscuentasporfactura.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfacturaOrigen,this.cobrarestadoscuentasporfactura,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().add(this.cobrarestadoscuentasporfacturaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfacturas.add(this.cobrarestadoscuentasporfacturaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
				
				this.jTableDatosCobrarEstadosCuentasPorFactura.setRowSelectionInterval(this.getIndiceNuevoCobrarEstadosCuentasPorFactura(), this.getIndiceNuevoCobrarEstadosCuentasPorFactura());
				
				int iLastRow =  this.jTableDatosCobrarEstadosCuentasPorFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarEstadosCuentasPorFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarEstadosCuentasPorFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();									
		
			CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaOrigen=new CobrarEstadosCuentasPorFactura();
			CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaDestino=new CobrarEstadosCuentasPorFactura();
				
			cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarestadoscuentasporfacturasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarestadoscuentasporfacturaOrigen =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarestadoscuentasporfacturaOrigen =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarestadoscuentasporfacturaDestino =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarestadoscuentasporfacturaDestino =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarestadoscuentasporfacturaOrigen =cobrarestadoscuentasporfacturasSeleccionados.get(0);
				cobrarestadoscuentasporfacturaDestino =cobrarestadoscuentasporfacturasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfacturaOrigen,cobrarestadoscuentasporfacturaDestino,true,false);
				
				cobrarestadoscuentasporfacturaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarestadoscuentasporfacturaDestino,cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarestadoscuentasporfacturaDestino,cobrarestadoscuentasporfacturas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
				
				//this.jTableDatosCobrarEstadosCuentasPorFactura.setRowSelectionInterval(this.getIndiceNuevoCobrarEstadosCuentasPorFactura(), this.getIndiceNuevoCobrarEstadosCuentasPorFactura());
				
				int iLastRow =  this.jTableDatosCobrarEstadosCuentasPorFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarEstadosCuentasPorFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarEstadosCuentasPorFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setVisible(!isVisible);
			this.jPanelPaginacionCobrarEstadosCuentasPorFactura.setVisible(!isVisible);
			this.jPanelAccionesCobrarEstadosCuentasPorFactura.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarEstadosCuentasPorFactura();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarEstadosCuentasPorFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarEstadosCuentasPorFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarEstadosCuentasPorFactura();
			
			this.abrirFrameOrderByCobrarEstadosCuentasPorFactura();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarEstadosCuentasPorFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarEstadosCuentasPorFactura(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setSize(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.iWidthFormulario,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jContentPaneDetalleCobrarEstadosCuentasPorFactura.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jContentPaneDetalleCobrarEstadosCuentasPorFactura.getWidth(),CobrarEstadosCuentasPorFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jContentPaneDetalleCobrarEstadosCuentasPorFactura.getWidth(),CobrarEstadosCuentasPorFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jContentPaneDetalleCobrarEstadosCuentasPorFactura.getWidth(),CobrarEstadosCuentasPorFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarEstadosCuentasPorFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura,false,this);
				} else {
					this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura);
				this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setVisible(false);
				this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setSelected(false);
				
				this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarEstadosCuentasPorFactura"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarEstadosCuentasPorFactura();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarEstadosCuentasPorFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura==null) {
				
				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura=new ImportacionJInternalFrame(CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura);
				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setVisible(false);
				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setSelected(false);


				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarEstadosCuentasPorFactura"));
				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarEstadosCuentasPorFactura"));
				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarEstadosCuentasPorFactura"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarEstadosCuentasPorFactura() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura==null) {
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura=new ReporteDinamicoJInternalFrame(CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura);
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarEstadosCuentasPorFactura"));
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarEstadosCuentasPorFactura"));
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarEstadosCuentasPorFactura();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarEstadosCuentasPorFactura() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura);
			
	       	this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.dispose();
			//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarEstadosCuentasPorFactura() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarEstadosCuentasPorFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setVisible(true);
	        this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarEstadosCuentasPorFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setVisible(true);
	        this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarEstadosCuentasPorFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setVisible(false);
	        this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarEstadosCuentasPorFactura() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarEstadosCuentasPorFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setVisible(false);
	        this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarEstadosCuentasPorFactura(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarEstadosCuentasPorFactura(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarEstadosCuentasPorFactura(true);
			//this.isEsNuevoCobrarEstadosCuentasPorFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarEstadosCuentasPorFactura(false) ;
			
			if(cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarEstadosCuentasPorFactura(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarEstadosCuentasPorFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarEstadosCuentasPorFactura(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarEstadosCuentasPorFactura(true);
			//this.isEsNuevoCobrarEstadosCuentasPorFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarestadoscuentasporfactura.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarEstadosCuentasPorFactura(false) ;
			
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarEstadosCuentasPorFactura(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarEstadosCuentasPorFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarEstadosCuentasPorFactura(false);
			
			//if(!this.isEsNuevoCobrarEstadosCuentasPorFactura) {								
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarestadoscuentasporfactura)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarEstadosCuentasPorFactura=true;
					this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
					this.isEsNuevoCobrarEstadosCuentasPorFactura=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarEstadosCuentasPorFactura=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarEstadosCuentasPorFactura=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarEstadosCuentasPorFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarEstadosCuentasPorFactura(false);
				
				this.habilitarDeshabilitarControlesCobrarEstadosCuentasPorFactura(false);
			
												
				
				if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarEstadosCuentasPorFactura();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarEstadosCuentasPorFactura.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarestadoscuentasporfactura.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				this.cobrarestadoscuentasporfactura.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				this.cobrarestadoscuentasporfactura.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarestadoscuentasporfactura)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarEstadosCuentasPorFacturaModel) this.jTableDatosCobrarEstadosCuentasPorFactura.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarEstadosCuentasPorFactura=true;
				this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
				this.isEsNuevoCobrarEstadosCuentasPorFactura=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarEstadosCuentasPorFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarEstadosCuentasPorFactura(false);
				
				this.habilitarDeshabilitarControlesCobrarEstadosCuentasPorFactura(false);
				
				
				
				if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarEstadosCuentasPorFactura();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarEstadosCuentasPorFactura.getRowCount()>=1) {
				jTableDatosCobrarEstadosCuentasPorFactura.removeRowSelectionInterval(0, jTableDatosCobrarEstadosCuentasPorFactura.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarEstadosCuentasPorFactura(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarEstadosCuentasPorFactura(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarEstadosCuentasPorFactura(false) ;
			
			this.isEsNuevoCobrarEstadosCuentasPorFactura=false;
			
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarEstadosCuentasPorFactura();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				
				//SI ES MANUAL
				if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarEstadosCuentasPorFactura();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarEstadosCuentasPorFactura--;			
			//CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux= new CobrarEstadosCuentasPorFactura();			
			//cobrarestadoscuentasporfacturaAux.setId(this.iIdNuevoCobrarEstadosCuentasPorFactura);
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarEstadosCuentasPorFactura();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
			
			this.cobrarestadoscuentasporfactura.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().add(this.cobrarestadoscuentasporfacturaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarestadoscuentasporfacturas.add(this.cobrarestadoscuentasporfacturaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
			
			this.jTableDatosCobrarEstadosCuentasPorFactura.setRowSelectionInterval(this.getIndiceNuevoCobrarEstadosCuentasPorFactura(), this.getIndiceNuevoCobrarEstadosCuentasPorFactura());
			
			int iLastRow =  this.jTableDatosCobrarEstadosCuentasPorFactura.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarEstadosCuentasPorFactura.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarEstadosCuentasPorFactura.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
			
			//SI ES MANUAL
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarEstadosCuentasPorFactura();
			}
			
			//this.abrirFrameTreeCobrarEstadosCuentasPorFactura();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setFileImportacion(this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarEstadosCuentasPorFactura.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();		

		cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarEstadosCuentasPorFacturaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarEstadosCuentasPorFacturaBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarEstadosCuentasPorFacturas("Todos",cobrarestadoscuentasporfacturasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_presentante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_presentante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_presentante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_presentante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTransaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTransaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTransaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTransaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVence_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVence_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVence_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVence_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionDireccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionDireccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionDireccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionDireccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoTelefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoTelefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoTelefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoTelefono_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoria="nombre_cuenta_contable";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE:
					sNombreCampoCategoria="representante";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO:
					sNombreCampoCategoria="dia_pago";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO:
					sNombreCampoCategoria="hora_pago";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoria="nombre_transaccion";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoria="fecha_vence";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoria="debito_mone_local";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoria="credito_mone_local";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoria="direccion_direccion";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoria="telefono_telefono";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoriaValor="nombre_cuenta_contable";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE:
					sNombreCampoCategoriaValor="representante";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO:
					sNombreCampoCategoriaValor="dia_pago";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO:
					sNombreCampoCategoriaValor="hora_pago";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoriaValor="nombre_transaccion";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoriaValor="fecha_vence";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoriaValor="debito_mone_local";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoriaValor="credito_mone_local";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoriaValor="direccion_direccion";
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoriaValor="telefono_telefono";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Representante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"representante");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_pago");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_pago");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_transaccion");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vence",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vence");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_local");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_local");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_direccion");
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_telefono");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();		
		
		cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarestadoscuentasporfactura";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarEstadosCuentasPorFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_vence_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_vence_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getrepresentante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getdia_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.gethora_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getobservacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_transaccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_vence());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getdebito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getcredito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.getdireccion_direccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO);
					iRow++;

					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarestadoscuentasporfactura.gettelefono_telefono());
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
			//	this.getFilaCabeceraExportarExcelCobrarEstadosCuentasPorFactura(row);				
			//	iRow++;
			//}				
			
			//for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfacturaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
			
			//SI ES MANUAL
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarEstadosCuentasPorFactura();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
			
			//SI ES MANUAL
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarEstadosCuentasPorFactura();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
			
			//SI ES MANUAL
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarEstadosCuentasPorFactura();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarEstadosCuentasPorFactura() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarEstadosCuentasPorFactura.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarEstadosCuentasPorFactura.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarEstadosCuentasPorFactura.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarEstadosCuentasPorFactura.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarEstadosCuentasPorFactura.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarEstadosCuentasPorFactura.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarEstadosCuentasPorFactura.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarEstadosCuentasPorFactura(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarEstadosCuentasPorFactura(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarEstadosCuentasPorFactura(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarEstadosCuentasPorFactura(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarEstadosCuentasPorFactura(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarEstadosCuentasPorFactura(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarEstadosCuentasPorFactura() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura();
		
		this.inicializarActualizarBindingBotonesManualCobrarEstadosCuentasPorFactura(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarEstadosCuentasPorFactura();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarEstadosCuentasPorFactura() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarEstadosCuentasPorFactura(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarEstadosCuentasPorFactura(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jCheckBoxPostAccionNuevoCobrarEstadosCuentasPorFactura.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jCheckBoxPostAccionSinCerrarCobrarEstadosCuentasPorFactura.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jCheckBoxPostAccionSinMensajeCobrarEstadosCuentasPorFactura.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
				this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jCheckBoxPostAccionNuevoCobrarEstadosCuentasPorFactura.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jCheckBoxPostAccionSinCerrarCobrarEstadosCuentasPorFactura.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jCheckBoxPostAccionSinMensajeCobrarEstadosCuentasPorFactura.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarEstadosCuentasPorFactura(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarEstadosCuentasPorFactura(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarEstadosCuentasPorFactura() throws Exception {
		try	{
			if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarEstadosCuentasPorFactura();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarEstadosCuentasPorFactura() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarEstadosCuentasPorFactura() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.addItem(reporte);
			}
			
			
			if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarEstadosCuentasPorFactura();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarEstadosCuentasPorFactura() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura!=null) {
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura!=null) {
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CobrarEstadosCuentasPorFacturaConstantesFunciones.getTiposSeleccionarCobrarEstadosCuentasPorFactura(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CobrarEstadosCuentasPorFacturaConstantesFunciones.getTiposSeleccionarCobrarEstadosCuentasPorFactura(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CobrarEstadosCuentasPorFacturaConstantesFunciones.getTiposSeleccionarCobrarEstadosCuentasPorFactura(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarEstadosCuentasPorFactura()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaCobrarEstadosCuentasPorFactura=new Date(this.jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.getDate().getTime());
		this.fecha_emision_hastaBusquedaCobrarEstadosCuentasPorFactura=new Date(this.jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.getDate().getTime());
		this.fecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2=new Date(this.jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.getDate().getTime());
		this.fecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2=new Date(this.jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarEstadosCuentasPorFactura(Boolean esInicializar) throws Exception {				
		if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarEstadosCuentasPorFactura();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura() throws Exception {
		this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarEstadosCuentasPorFactura() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarEstadosCuentasPorFacturaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFacturaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarestadoscuentasporfacturas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarEstadosCuentasPorFactura.setModel(new CobrarEstadosCuentasPorFacturaModel(this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarEstadosCuentasPorFactura.setModel(new CobrarEstadosCuentasPorFacturaModel(this.cobrarestadoscuentasporfacturas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarEstadosCuentasPorFactura();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO,cobrarestadoscuentasporfacturaConstantesFunciones.resaltarSeleccionarCobrarEstadosCuentasPorFactura,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO,cobrarestadoscuentasporfacturaConstantesFunciones.resaltarSeleccionarCobrarEstadosCuentasPorFactura,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_ID));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostraridCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltaridCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activaridCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"idCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltaridCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activaridCobrarEstadosCuentasPorFactura,this,true,"idCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_cuenta_contableCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_cuenta_contableCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_cuenta_contableCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"nombre_cuenta_contableCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_cuenta_contableCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_cuenta_contableCobrarEstadosCuentasPorFactura,this,true,"nombre_cuenta_contableCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_ciudadCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_ciudadCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_ciudadCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"nombre_ciudadCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_ciudadCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_ciudadCobrarEstadosCuentasPorFactura,this,true,"nombre_ciudadCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_zonaCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_zonaCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_zonaCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"nombre_zonaCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_zonaCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_zonaCobrarEstadosCuentasPorFactura,this,true,"nombre_zonaCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_completoCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_completoCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_completoCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"nombre_completoCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_completoCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_completoCobrarEstadosCuentasPorFactura,this,true,"nombre_completoCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarrucCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarrucCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarrucCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"rucCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarrucCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarrucCobrarEstadosCuentasPorFactura,this,true,"rucCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarrepresentanteCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarrepresentanteCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarrepresentanteCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"representanteCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarrepresentanteCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarrepresentanteCobrarEstadosCuentasPorFactura,this,true,"representanteCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrardia_pagoCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardia_pagoCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activardia_pagoCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"dia_pagoCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardia_pagoCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activardia_pagoCobrarEstadosCuentasPorFactura,this,true,"dia_pagoCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarhora_pagoCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarhora_pagoCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarhora_pagoCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"hora_pagoCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarhora_pagoCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarhora_pagoCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"hora_pagoCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarobservacionCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarobservacionCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarobservacionCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"observacionCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarobservacionCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarobservacionCobrarEstadosCuentasPorFactura,this,true,"observacionCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_transaccionCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_transaccionCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_transaccionCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"nombre_transaccionCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_transaccionCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_transaccionCobrarEstadosCuentasPorFactura,this,true,"nombre_transaccionCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_venceCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_venceCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_venceCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"fecha_venceCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_venceCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_venceCobrarEstadosCuentasPorFactura,this,true,"fecha_venceCobrarEstadosCuentasPorFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_emisionCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_emisionCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_emisionCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"fecha_emisionCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_emisionCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_emisionCobrarEstadosCuentasPorFactura,this,true,"fecha_emisionCobrarEstadosCuentasPorFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnumero_comprobanteCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnumero_comprobanteCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnumero_comprobanteCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"numero_comprobanteCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnumero_comprobanteCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnumero_comprobanteCobrarEstadosCuentasPorFactura,this,true,"numero_comprobanteCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnumero_facturaCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnumero_facturaCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnumero_facturaCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"numero_facturaCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnumero_facturaCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnumero_facturaCobrarEstadosCuentasPorFactura,this,true,"numero_facturaCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrardebito_mone_localCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardebito_mone_localCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activardebito_mone_localCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"debito_mone_localCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardebito_mone_localCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activardebito_mone_localCobrarEstadosCuentasPorFactura,this,true,"debito_mone_localCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarcredito_mone_localCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarcredito_mone_localCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarcredito_mone_localCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"credito_mone_localCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarcredito_mone_localCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarcredito_mone_localCobrarEstadosCuentasPorFactura,this,true,"credito_mone_localCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrardireccion_direccionCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardireccion_direccionCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activardireccion_direccionCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"direccion_direccionCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardireccion_direccionCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activardireccion_direccionCobrarEstadosCuentasPorFactura,this,true,"direccion_direccionCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO));

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrartelefono_telefonoCobrarEstadosCuentasPorFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltartelefono_telefonoCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activartelefono_telefonoCobrarEstadosCuentasPorFactura,iSizeTabla,this,true,"telefono_telefonoCobrarEstadosCuentasPorFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltartelefono_telefonoCobrarEstadosCuentasPorFactura,this.cobrarestadoscuentasporfacturaConstantesFunciones.activartelefono_telefonoCobrarEstadosCuentasPorFactura,this,true,"telefono_telefonoCobrarEstadosCuentasPorFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarEstadosCuentasPorFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarEstadosCuentasPorFactura.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarEstadosCuentasPorFactura.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarEstadosCuentasPorFactura.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarEstadosCuentasPorFactura.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarEstadosCuentasPorFactura.moveColumn(this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarEstadosCuentasPorFactura.moveColumn(this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarEstadosCuentasPorFactura.moveColumn(this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarEstadosCuentasPorFactura.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarEstadosCuentasPorFactura.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarEstadosCuentasPorFactura,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarEstadosCuentasPorFactura.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarEstadosCuentasPorFactura.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarEstadosCuentasPorFactura.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarestadoscuentasporfacturas.size()-1;
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
		//this.jTableDatosCobrarEstadosCuentasPorFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarEstadosCuentasPorFactura();
			
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
				
				//this.isEsNuevoCobrarEstadosCuentasPorFactura=false;
					
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
				if(this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarestadoscuentasporfactura.getsType().equals("DUPLICADO")
				   || this.cobrarestadoscuentasporfactura.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarEstadosCuentasPorFactura=true;
				
				} else {
					this.isEsNuevoCobrarEstadosCuentasPorFactura=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarestadoscuentasporfactura.getId()>=0 && !this.cobrarestadoscuentasporfactura.getIsNew()) {						
						this.isEsNuevoCobrarEstadosCuentasPorFactura=false;
						
					} else {
						this.isEsNuevoCobrarEstadosCuentasPorFactura=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarEstadosCuentasPorFactura(esRelaciones);						
				
				this.seleccionarCobrarEstadosCuentasPorFactura(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarestadoscuentasporfactura.getId()<0) {
					this.isEsNuevoCobrarEstadosCuentasPorFactura=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarEstadosCuentasPorFactura(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarEstadosCuentasPorFactura(evt,rowIndex);
				}	
				
				if(this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarEstadosCuentasPorFactura: " + this.dDif); 
					}
				}								
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarEstadosCuentasPorFactura(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarestadoscuentasporfactura)) {
					if(this.cobrarestadoscuentasporfactura.getId()>0) {
						this.cobrarestadoscuentasporfactura.setIsDeleted(true);
						
						this.cobrarestadoscuentasporfacturasEliminados.add(this.cobrarestadoscuentasporfactura);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().remove(this.cobrarestadoscuentasporfactura);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfacturas.remove(this.cobrarestadoscuentasporfactura);				
					}
					
					
					((CobrarEstadosCuentasPorFacturaModel) this.jTableDatosCobrarEstadosCuentasPorFactura.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarEstadosCuentasPorFactura(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarEstadosCuentasPorFactura) {
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarEstadosCuentasPorFactura(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarEstadosCuentasPorFactura() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfactura,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfactura);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfactura,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfactura);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getId().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldrucCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getruc());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextArearepresentanteCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getrepresentante());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getdia_pago().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setValue(cobrarestadoscuentasporfactura.gethora_pago());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreaobservacionCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getobservacion());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnombre_transaccion());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setDate(cobrarestadoscuentasporfactura.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setDate(cobrarestadoscuentasporfactura.getfecha_emision());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnumero_comprobante());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.gettelefono_telefono());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarestadoscuentasporfacturaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarestadoscuentasporfacturaLocal=this.cobrarestadoscuentasporfactura;
			} else {
				cobrarestadoscuentasporfacturaLocal=this.cobrarestadoscuentasporfacturaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarestadoscuentasporfacturaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfacturaLocal,true);
					
					if(cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarestadoscuentasporfacturaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarestadoscuentasporfacturaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfactura,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfactura);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfactura,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.getText()==null || this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.getText()=="" || this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.setText("0");
			}

			if(conColumnasBase) {cobrarestadoscuentasporfactura.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelIdCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setnombre_cuenta_contable(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setnombre_ciudad(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_ciudadCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setnombre_zona(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_zonaCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setnombre_completo(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_completoCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_completoCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setruc(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldrucCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelrucCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setrepresentante(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextArearepresentanteCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelrepresentanteCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setdia_pago(Integer.parseInt(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddia_pagoCobrarEstadosCuentasPorFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeldia_pagoCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.sethora_pago(new Time(((Date)this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelhora_pagoCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setobservacion(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreaobservacionCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelobservacionCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setnombre_transaccion(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnombre_transaccionCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setfecha_vence(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelfecha_venceCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setfecha_emision(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelfecha_emisionCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setnumero_comprobante(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setnumero_factura(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelnumero_facturaCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setdebito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeldebito_mone_localCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setcredito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelcredito_mone_localCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.setdireccion_direccion(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeldireccion_direccionCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarestadoscuentasporfactura.settelefono_telefono(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaBean,CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaOrigen,CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getId()!=null && !cobrarestadoscuentasporfacturaOrigen.getId().equals(0L))) {cobrarestadoscuentasporfactura.setId(cobrarestadoscuentasporfacturaOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getfecha_emision_desde()!=null && !cobrarestadoscuentasporfacturaOrigen.getfecha_emision_desde().equals(new Date()))) {cobrarestadoscuentasporfactura.setfecha_emision_desde(cobrarestadoscuentasporfacturaOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getfecha_emision_hasta()!=null && !cobrarestadoscuentasporfacturaOrigen.getfecha_emision_hasta().equals(new Date()))) {cobrarestadoscuentasporfactura.setfecha_emision_hasta(cobrarestadoscuentasporfacturaOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getfecha_vence_desde()!=null && !cobrarestadoscuentasporfacturaOrigen.getfecha_vence_desde().equals(new Date()))) {cobrarestadoscuentasporfactura.setfecha_vence_desde(cobrarestadoscuentasporfacturaOrigen.getfecha_vence_desde());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getfecha_vence_hasta()!=null && !cobrarestadoscuentasporfacturaOrigen.getfecha_vence_hasta().equals(new Date()))) {cobrarestadoscuentasporfactura.setfecha_vence_hasta(cobrarestadoscuentasporfacturaOrigen.getfecha_vence_hasta());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getnombre_cuenta_contable()!=null && !cobrarestadoscuentasporfacturaOrigen.getnombre_cuenta_contable().equals(""))) {cobrarestadoscuentasporfactura.setnombre_cuenta_contable(cobrarestadoscuentasporfacturaOrigen.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getnombre_ciudad()!=null && !cobrarestadoscuentasporfacturaOrigen.getnombre_ciudad().equals(""))) {cobrarestadoscuentasporfactura.setnombre_ciudad(cobrarestadoscuentasporfacturaOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getnombre_zona()!=null && !cobrarestadoscuentasporfacturaOrigen.getnombre_zona().equals(""))) {cobrarestadoscuentasporfactura.setnombre_zona(cobrarestadoscuentasporfacturaOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getnombre_completo()!=null && !cobrarestadoscuentasporfacturaOrigen.getnombre_completo().equals(""))) {cobrarestadoscuentasporfactura.setnombre_completo(cobrarestadoscuentasporfacturaOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getruc()!=null && !cobrarestadoscuentasporfacturaOrigen.getruc().equals(""))) {cobrarestadoscuentasporfactura.setruc(cobrarestadoscuentasporfacturaOrigen.getruc());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getrepresentante()!=null && !cobrarestadoscuentasporfacturaOrigen.getrepresentante().equals(""))) {cobrarestadoscuentasporfactura.setrepresentante(cobrarestadoscuentasporfacturaOrigen.getrepresentante());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getdia_pago()!=null && !cobrarestadoscuentasporfacturaOrigen.getdia_pago().equals(0))) {cobrarestadoscuentasporfactura.setdia_pago(cobrarestadoscuentasporfacturaOrigen.getdia_pago());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.gethora_pago()!=null && !cobrarestadoscuentasporfacturaOrigen.gethora_pago().equals(new Time((new Date()).getTime())))) {cobrarestadoscuentasporfactura.sethora_pago(cobrarestadoscuentasporfacturaOrigen.gethora_pago());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getobservacion()!=null && !cobrarestadoscuentasporfacturaOrigen.getobservacion().equals(""))) {cobrarestadoscuentasporfactura.setobservacion(cobrarestadoscuentasporfacturaOrigen.getobservacion());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getnombre_transaccion()!=null && !cobrarestadoscuentasporfacturaOrigen.getnombre_transaccion().equals(""))) {cobrarestadoscuentasporfactura.setnombre_transaccion(cobrarestadoscuentasporfacturaOrigen.getnombre_transaccion());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getfecha_vence()!=null && !cobrarestadoscuentasporfacturaOrigen.getfecha_vence().equals(new Date()))) {cobrarestadoscuentasporfactura.setfecha_vence(cobrarestadoscuentasporfacturaOrigen.getfecha_vence());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getfecha_emision()!=null && !cobrarestadoscuentasporfacturaOrigen.getfecha_emision().equals(new Date()))) {cobrarestadoscuentasporfactura.setfecha_emision(cobrarestadoscuentasporfacturaOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getnumero_comprobante()!=null && !cobrarestadoscuentasporfacturaOrigen.getnumero_comprobante().equals(""))) {cobrarestadoscuentasporfactura.setnumero_comprobante(cobrarestadoscuentasporfacturaOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getnumero_factura()!=null && !cobrarestadoscuentasporfacturaOrigen.getnumero_factura().equals(""))) {cobrarestadoscuentasporfactura.setnumero_factura(cobrarestadoscuentasporfacturaOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getdebito_mone_local()!=null && !cobrarestadoscuentasporfacturaOrigen.getdebito_mone_local().equals(0.0))) {cobrarestadoscuentasporfactura.setdebito_mone_local(cobrarestadoscuentasporfacturaOrigen.getdebito_mone_local());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getcredito_mone_local()!=null && !cobrarestadoscuentasporfacturaOrigen.getcredito_mone_local().equals(0.0))) {cobrarestadoscuentasporfactura.setcredito_mone_local(cobrarestadoscuentasporfacturaOrigen.getcredito_mone_local());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.getdireccion_direccion()!=null && !cobrarestadoscuentasporfacturaOrigen.getdireccion_direccion().equals(""))) {cobrarestadoscuentasporfactura.setdireccion_direccion(cobrarestadoscuentasporfacturaOrigen.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaOrigen.gettelefono_telefono()!=null && !cobrarestadoscuentasporfacturaOrigen.gettelefono_telefono().equals(""))) {cobrarestadoscuentasporfactura.settelefono_telefono(cobrarestadoscuentasporfacturaOrigen.gettelefono_telefono());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getId().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldrucCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getruc());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextArearepresentanteCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getrepresentante());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getdia_pago().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setValue(cobrarestadoscuentasporfactura.gethora_pago());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreaobservacionCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getobservacion());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnombre_transaccion());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setDate(cobrarestadoscuentasporfactura.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setDate(cobrarestadoscuentasporfactura.getfecha_emision());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnumero_comprobante());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfactura.gettelefono_telefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFacturaBean cobrarestadoscuentasporfacturaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldrucCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getruc());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextArearepresentanteCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getrepresentante());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getdia_pago().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setValue(cobrarestadoscuentasporfacturaBean.gethora_pago());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreaobservacionCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getobservacion());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getnombre_transaccion());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setDate(cobrarestadoscuentasporfacturaBean.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setDate(cobrarestadoscuentasporfacturaBean.getfecha_emision());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setText(cobrarestadoscuentasporfacturaBean.gettelefono_telefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFacturaParameterReturnGeneral cobrarestadoscuentasporfacturaReturnGeneral,CobrarEstadosCuentasPorFacturaBean cobrarestadoscuentasporfacturaBean,Boolean conDefault) throws Exception { 
		try {
			CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaLocal=new CobrarEstadosCuentasPorFactura();
			
			cobrarestadoscuentasporfacturaLocal=cobrarestadoscuentasporfacturaReturnGeneral.getCobrarEstadosCuentasPorFactura();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getId()!=null && !cobrarestadoscuentasporfacturaLocal.getId().equals(0L))) {cobrarestadoscuentasporfacturaBean.setId(cobrarestadoscuentasporfacturaLocal.getId());}}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getnombre_cuenta_contable()!=null && !cobrarestadoscuentasporfacturaLocal.getnombre_cuenta_contable().equals(""))) {cobrarestadoscuentasporfacturaBean.setnombre_cuenta_contable(cobrarestadoscuentasporfacturaLocal.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getnombre_ciudad()!=null && !cobrarestadoscuentasporfacturaLocal.getnombre_ciudad().equals(""))) {cobrarestadoscuentasporfacturaBean.setnombre_ciudad(cobrarestadoscuentasporfacturaLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getnombre_zona()!=null && !cobrarestadoscuentasporfacturaLocal.getnombre_zona().equals(""))) {cobrarestadoscuentasporfacturaBean.setnombre_zona(cobrarestadoscuentasporfacturaLocal.getnombre_zona());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getnombre_completo()!=null && !cobrarestadoscuentasporfacturaLocal.getnombre_completo().equals(""))) {cobrarestadoscuentasporfacturaBean.setnombre_completo(cobrarestadoscuentasporfacturaLocal.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getruc()!=null && !cobrarestadoscuentasporfacturaLocal.getruc().equals(""))) {cobrarestadoscuentasporfacturaBean.setruc(cobrarestadoscuentasporfacturaLocal.getruc());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getrepresentante()!=null && !cobrarestadoscuentasporfacturaLocal.getrepresentante().equals(""))) {cobrarestadoscuentasporfacturaBean.setrepresentante(cobrarestadoscuentasporfacturaLocal.getrepresentante());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getdia_pago()!=null && !cobrarestadoscuentasporfacturaLocal.getdia_pago().equals(0))) {cobrarestadoscuentasporfacturaBean.setdia_pago(cobrarestadoscuentasporfacturaLocal.getdia_pago());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.gethora_pago()!=null && !cobrarestadoscuentasporfacturaLocal.gethora_pago().equals(new Time((new Date()).getTime())))) {cobrarestadoscuentasporfacturaBean.sethora_pago(cobrarestadoscuentasporfacturaLocal.gethora_pago());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getobservacion()!=null && !cobrarestadoscuentasporfacturaLocal.getobservacion().equals(""))) {cobrarestadoscuentasporfacturaBean.setobservacion(cobrarestadoscuentasporfacturaLocal.getobservacion());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getnombre_transaccion()!=null && !cobrarestadoscuentasporfacturaLocal.getnombre_transaccion().equals(""))) {cobrarestadoscuentasporfacturaBean.setnombre_transaccion(cobrarestadoscuentasporfacturaLocal.getnombre_transaccion());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getfecha_vence()!=null && !cobrarestadoscuentasporfacturaLocal.getfecha_vence().equals(new Date()))) {cobrarestadoscuentasporfacturaBean.setfecha_vence(cobrarestadoscuentasporfacturaLocal.getfecha_vence());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getfecha_emision()!=null && !cobrarestadoscuentasporfacturaLocal.getfecha_emision().equals(new Date()))) {cobrarestadoscuentasporfacturaBean.setfecha_emision(cobrarestadoscuentasporfacturaLocal.getfecha_emision());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getnumero_comprobante()!=null && !cobrarestadoscuentasporfacturaLocal.getnumero_comprobante().equals(""))) {cobrarestadoscuentasporfacturaBean.setnumero_comprobante(cobrarestadoscuentasporfacturaLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getnumero_factura()!=null && !cobrarestadoscuentasporfacturaLocal.getnumero_factura().equals(""))) {cobrarestadoscuentasporfacturaBean.setnumero_factura(cobrarestadoscuentasporfacturaLocal.getnumero_factura());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getdebito_mone_local()!=null && !cobrarestadoscuentasporfacturaLocal.getdebito_mone_local().equals(0.0))) {cobrarestadoscuentasporfacturaBean.setdebito_mone_local(cobrarestadoscuentasporfacturaLocal.getdebito_mone_local());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getcredito_mone_local()!=null && !cobrarestadoscuentasporfacturaLocal.getcredito_mone_local().equals(0.0))) {cobrarestadoscuentasporfacturaBean.setcredito_mone_local(cobrarestadoscuentasporfacturaLocal.getcredito_mone_local());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.getdireccion_direccion()!=null && !cobrarestadoscuentasporfacturaLocal.getdireccion_direccion().equals(""))) {cobrarestadoscuentasporfacturaBean.setdireccion_direccion(cobrarestadoscuentasporfacturaLocal.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarestadoscuentasporfacturaLocal.gettelefono_telefono()!=null && !cobrarestadoscuentasporfacturaLocal.gettelefono_telefono().equals(""))) {cobrarestadoscuentasporfacturaBean.settelefono_telefono(cobrarestadoscuentasporfacturaLocal.gettelefono_telefono());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarEstadosCuentasPorFacturaGenerico(Long idCobrarEstadosCuentasPorFacturaSeleccionado,JComboBox jComboBoxCobrarEstadosCuentasPorFactura,List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasLocal)throws Exception {
		try {
			CobrarEstadosCuentasPorFactura  cobrarestadoscuentasporfacturaTemp=null;

			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturasLocal) {
				if(cobrarestadoscuentasporfacturaAux.getId()!=null && cobrarestadoscuentasporfacturaAux.getId().equals(idCobrarEstadosCuentasPorFacturaSeleccionado)) {
					cobrarestadoscuentasporfacturaTemp=cobrarestadoscuentasporfacturaAux;
					break;
				}
			}

			jComboBoxCobrarEstadosCuentasPorFactura.setSelectedItem(cobrarestadoscuentasporfacturaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarEstadosCuentasPorFacturaGenerico(JComboBox jComboBoxCobrarEstadosCuentasPorFactura,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarEstadosCuentasPorFactura.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarEstadosCuentasPorFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarEstadosCuentasPorFactura.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarEstadosCuentasPorFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarestadoscuentasporfactura=(CobrarEstadosCuentasPorFactura) cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) cobrarestadoscuentasporfacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarestadoscuentasporfactura.getIsNew() && !cobrarestadoscuentasporfactura.getIsChanged() && !cobrarestadoscuentasporfactura.getIsDeleted()) {
				sDescripcion=cobrarestadoscuentasporfactura.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarestadoscuentasporfactura.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaRow=new CobrarEstadosCuentasPorFactura();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarestadoscuentasporfacturaRow=(CobrarEstadosCuentasPorFactura) cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarestadoscuentasporfacturaRow=(CobrarEstadosCuentasPorFactura) cobrarestadoscuentasporfacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarEstadosCuentasPorFactura(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura && this.isPermisoNuevoCobrarEstadosCuentasPorFactura));			
			this.jButtonDuplicarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura && this.isPermisoDuplicarCobrarEstadosCuentasPorFactura));			
			this.jButtonCopiarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura && this.isPermisoCopiarCobrarEstadosCuentasPorFactura));
			this.jButtonVerFormCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura && this.isPermisoVerFormCobrarEstadosCuentasPorFactura));
			
			this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura && this.isPermisoOrdenCobrarEstadosCuentasPorFactura));			
			
			this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura && this.isPermisoNuevoCobrarEstadosCuentasPorFactura));			
			this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura && this.isPermisoNuevoCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura));
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonModificarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura && this.isPermisoActualizarCobrarEstadosCuentasPorFactura));	
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonActualizarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura && this.isPermisoActualizarCobrarEstadosCuentasPorFactura));	
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonEliminarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura && this.isPermisoEliminarCobrarEstadosCuentasPorFactura));
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonCancelarCobrarEstadosCuentasPorFactura.setVisible(this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura);							
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura && this.isPermisoNuevoCobrarEstadosCuentasPorFactura));						
			this.jButtonDuplicarToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura && this.isPermisoDuplicarCobrarEstadosCuentasPorFactura));						
			this.jButtonCopiarToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura && this.isPermisoCopiarCobrarEstadosCuentasPorFactura));			
			this.jButtonVerFormToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura && this.isPermisoVerFormCobrarEstadosCuentasPorFactura));			
			this.jButtonAbrirOrderByToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura && this.isPermisoOrdenCobrarEstadosCuentasPorFactura));
			this.jButtonNuevoRelacionesToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura && this.isPermisoNuevoCobrarEstadosCuentasPorFactura));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura && this.isPermisoNuevoCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura));			
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonModificarToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura && this.isPermisoActualizarCobrarEstadosCuentasPorFactura));	
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonActualizarToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura  && this.isPermisoActualizarCobrarEstadosCuentasPorFactura));	
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonEliminarToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura && this.isPermisoEliminarCobrarEstadosCuentasPorFactura));
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonCancelarToolBarCobrarEstadosCuentasPorFactura.setVisible(this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura);				
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura && this.isPermisoNuevoCobrarEstadosCuentasPorFactura));			
			this.jMenuItemDuplicarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura && this.isPermisoDuplicarCobrarEstadosCuentasPorFactura));			
			this.jMenuItemCopiarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura && this.isPermisoCopiarCobrarEstadosCuentasPorFactura));			
			this.jMenuItemVerFormCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura && this.isPermisoVerFormCobrarEstadosCuentasPorFactura));			
			this.jMenuItemAbrirOrderByCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura && this.isPermisoOrdenCobrarEstadosCuentasPorFactura));			
			//this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura && this.isPermisoOrdenCobrarEstadosCuentasPorFactura));
			this.jMenuItemDetalleAbrirOrderByCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura && this.isPermisoOrdenCobrarEstadosCuentasPorFactura));			
			//this.jMenuItemDetalleMostrarOcultarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura && this.isPermisoOrdenCobrarEstadosCuentasPorFactura));			
			this.jMenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura && this.isPermisoNuevoCobrarEstadosCuentasPorFactura));			
			this.jMenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura && this.isPermisoNuevoCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura));									
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemModificarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura && this.isPermisoActualizarCobrarEstadosCuentasPorFactura));	
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemActualizarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura && this.isPermisoActualizarCobrarEstadosCuentasPorFactura));	
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemEliminarCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura && this.isPermisoEliminarCobrarEstadosCuentasPorFactura));
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemCancelarCobrarEstadosCuentasPorFactura.setVisible(this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura);				
			}
			
			this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura));						
			this.jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=this.jButtonNuevoCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura=this.jButtonDuplicarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura=this.jButtonCopiarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura=this.jButtonVerFormCobrarEstadosCuentasPorFactura.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarEstadosCuentasPorFactura=this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=this.jButtonModificarCobrarEstadosCuentasPorFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonActualizarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonEliminarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonCancelarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=this.jButtonNuevoToolBarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=this.jButtonNuevoRelacionesToolBarCobrarEstadosCuentasPorFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonModificarToolBarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonActualizarToolBarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonEliminarToolBarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonCancelarToolBarCobrarEstadosCuentasPorFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=this.jButtonGuardarCambiosToolBarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=this.jButtonGuardarCambiosTablaToolBarCobrarEstadosCuentasPorFactura.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=this.jMenuItemNuevoCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=this.jMenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemModificarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemActualizarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemEliminarCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemCancelarCobrarEstadosCuentasPorFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=this.jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarEstadosCuentasPorFactura(Boolean esInicializar) {
		if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarEstadosCuentasPorFactura();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarEstadosCuentasPorFactura(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarEstadosCuentasPorFactura() {
		this.jButtonNuevoCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoNuevoCobrarEstadosCuentasPorFactura);			
		this.jButtonDuplicarCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoDuplicarCobrarEstadosCuentasPorFactura);			
		this.jButtonCopiarCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoCopiarCobrarEstadosCuentasPorFactura);			
		this.jButtonVerFormCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoVerFormCobrarEstadosCuentasPorFactura);			
		
		this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoOrdenCobrarEstadosCuentasPorFactura);					
		
		this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoNuevoCobrarEstadosCuentasPorFactura);			
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonModificarCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoActualizarCobrarEstadosCuentasPorFactura);	
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonActualizarCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoActualizarCobrarEstadosCuentasPorFactura);	
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonEliminarCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoEliminarCobrarEstadosCuentasPorFactura);
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonCancelarCobrarEstadosCuentasPorFactura.setVisible(this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura);						
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoActualizarCobrarEstadosCuentasPorFactura);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarEstadosCuentasPorFactura() {
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonModificarCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoActualizarCobrarEstadosCuentasPorFactura);	
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonActualizarCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoActualizarCobrarEstadosCuentasPorFactura);	
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonEliminarCobrarEstadosCuentasPorFactura.setVisible(this.isPermisoEliminarCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonCancelarCobrarEstadosCuentasPorFactura.setVisible(this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura);							
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura.setVisible((this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura && this.isPermisoGuardarCambiosCobrarEstadosCuentasPorFactura));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarEstadosCuentasPorFactura() {
		if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarEstadosCuentasPorFactura();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarEstadosCuentasPorFactura() {
	}
	
	public void jTableDatosCobrarEstadosCuentasPorFacturaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarEstadosCuentasPorFactura(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarestadoscuentasporfactura.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarEstadosCuentasPorFactura(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarEstadosCuentasPorFactura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarEstadosCuentasPorFactura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarestadoscuentasporfacturaLogic.getConnexion());

				if(this.cobrarestadoscuentasporfactura.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarestadoscuentasporfactura.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarEstadosCuentasPorFactura=(TitledBorder)this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarEstadosCuentasPorFactura.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarestadoscuentasporfactura.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.cobrarestadoscuentasporfactura.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.cobrarestadoscuentasporfactura.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getfecha_vence_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vence_desde = '"+Funciones2.getStringPostgresDate(this.cobrarestadoscuentasporfactura.getfecha_vence_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getfecha_vence_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vence_hasta = '"+Funciones2.getStringPostgresDate(this.cobrarestadoscuentasporfactura.getfecha_vence_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getnombre_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable like '%"+this.cobrarestadoscuentasporfactura.getnombre_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.cobrarestadoscuentasporfactura.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.cobrarestadoscuentasporfactura.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.cobrarestadoscuentasporfactura.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.cobrarestadoscuentasporfactura.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getrepresentante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where representante like '%"+this.cobrarestadoscuentasporfactura.getrepresentante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_pagoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getdia_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_pago = "+this.cobrarestadoscuentasporfactura.getdia_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.gethora_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_pago = "+this.cobrarestadoscuentasporfactura.gethora_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.cobrarestadoscuentasporfactura.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getnombre_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_transaccion like '%"+this.cobrarestadoscuentasporfactura.getnombre_transaccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getfecha_vence()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vence = '"+Funciones2.getStringPostgresDate(this.cobrarestadoscuentasporfactura.getfecha_vence())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.cobrarestadoscuentasporfactura.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.cobrarestadoscuentasporfactura.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.cobrarestadoscuentasporfactura.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getdebito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_local = "+this.cobrarestadoscuentasporfactura.getdebito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getcredito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_local = "+this.cobrarestadoscuentasporfactura.getcredito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.getdireccion_direccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_direccion like '%"+this.cobrarestadoscuentasporfactura.getdireccion_direccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.getcobrarestadoscuentasporfactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarestadoscuentasporfactura==null) {
						this.cobrarestadoscuentasporfactura = new CobrarEstadosCuentasPorFactura();
					}

					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);
				}

				if(this.cobrarestadoscuentasporfactura.gettelefono_telefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_telefono like '%"+this.cobrarestadoscuentasporfactura.gettelefono_telefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);

			this.getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura();

			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);

			//if(CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);

			this.getCobrarEstadosCuentasPorFacturasBusquedaCobrarEstadosCuentasPorFactura2();

			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);

			//if(CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarEstadosCuentasPorFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);

			this.getCobrarEstadosCuentasPorFacturasFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);

			//if(CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarestadoscuentasporfacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarEstadosCuentasPorFactura() {
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.dispose();
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura!=null) {
			this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.dispose();
			this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura=null;
		}
		
		if(this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura!=null) {
			this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.dispose();
			this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarEstadosCuentasPorFactura();
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarEstadosCuentasPorFactura")) {
				jButtonDuplicarCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarEstadosCuentasPorFactura")) {
				jButtonCopiarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarEstadosCuentasPorFactura")) {
				jButtonVerFormCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonDuplicarCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarEstadosCuentasPorFactura")) {
				jButtonDuplicarCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarEstadosCuentasPorFactura")) {
				jButtonModificarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonModificarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarEstadosCuentasPorFactura")) {
				jButtonModificarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarEstadosCuentasPorFactura")) {
				jButtonActualizarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonActualizarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarEstadosCuentasPorFactura")) {
				jButtonActualizarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarEstadosCuentasPorFactura")) {
				jButtonEliminarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonEliminarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarEstadosCuentasPorFactura")) {
				jButtonEliminarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarEstadosCuentasPorFactura")) {
				jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarEstadosCuentasPorFactura")) {
				jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarEstadosCuentasPorFactura")) {
				jButtonCerrarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonCerrarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarEstadosCuentasPorFactura")) {
				jButtonCerrarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonMostrarOcultarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarEstadosCuentasPorFactura")) {
				jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarEstadosCuentasPorFactura")) {
				jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonCopiarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonVerFormCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarEstadosCuentasPorFactura")) {
				jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarEstadosCuentasPorFactura")) {
				jButtonCopiarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarEstadosCuentasPorFactura")) {
				jButtonVerFormCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarEstadosCuentasPorFactura")) {
				jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura")) {
				jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarEstadosCuentasPorFactura")) {
				jButtonRecargarInformacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonRecargarInformacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarEstadosCuentasPorFactura")) {
				jButtonRecargarInformacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarEstadosCuentasPorFactura")) {
				jButtonAnterioresCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonAnterioresCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarEstadosCuentasPorFactura")) {
				jButtonAnterioresCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarEstadosCuentasPorFactura")) {
				jButtonSiguientesCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonSiguientesCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarEstadosCuentasPorFactura")) {
				jButtonSiguientesCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarEstadosCuentasPorFactura") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarEstadosCuentasPorFactura")) {
				jButtonAbrirOrderByCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarEstadosCuentasPorFactura") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarEstadosCuentasPorFactura")) {
				jButtonMostrarOcultarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarEstadosCuentasPorFactura")) {
				jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarEstadosCuentasPorFactura")) {
				jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarEstadosCuentasPorFactura")) {
				jButtonCerrarImportacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarEstadosCuentasPorFactura")) {
				
				jButtonGenerarImportacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarEstadosCuentasPorFactura")) {
				
				jButtonAbrirImportacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarEstadosCuentasPorFactura")) {
				jComboBoxTiposAccionesCobrarEstadosCuentasPorFacturaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarEstadosCuentasPorFactura")) {
				jComboBoxTiposRelacionesCobrarEstadosCuentasPorFacturaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarEstadosCuentasPorFactura")) {
				jComboBoxTiposAccionesCobrarEstadosCuentasPorFacturaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarEstadosCuentasPorFactura")) {
				
				jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFacturaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarEstadosCuentasPorFactura")) {
				jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFacturaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarEstadosCuentasPorFactura")) {
				jButtonAbrirOrderByCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarEstadosCuentasPorFactura")) {
				jButtonAbrirOrderByCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarEstadosCuentasPorFactura")) {
				jButtonCerrarOrderByCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonidCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarEstadosCuentasPorFacturaUpdate")) {
				this.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonrucCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("representanteCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_pagoCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_pagoCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura")) {
				this.jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura")) {
				this.jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFacturaActionPerformed(evt);
			}
			
			;
			
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarEstadosCuentasPorFactura();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				


				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarestadoscuentasporfacturaLocal=this.cobrarestadoscuentasporfactura;
			} else {
				cobrarestadoscuentasporfacturaLocal=this.cobrarestadoscuentasporfacturaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
							
				
				


				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
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
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
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
			
			


			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
								
						
				


				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
								
				
				


				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
							
				
				


				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
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
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
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
			
			


			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
								
				
				


				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarEstadosCuentasPorFactura")) {
					jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFacturaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarEstadosCuentasPorFactura")) {
					jCheckBoxSeleccionadosCobrarEstadosCuentasPorFacturaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarEstadosCuentasPorFactura")) {
					
				}
				
				


				
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
												
				
				


				
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
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
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
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
			
			


			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarestadoscuentasporfactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarestadoscuentasporfactura);
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
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
				
				


				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarEstadosCuentasPorFactura.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarEstadosCuentasPorFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarEstadosCuentasPorFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarestadoscuentasporfacturaAnterior =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarEstadosCuentasPorFactura")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarEstadosCuentasPorFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarestadoscuentasporfactura =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarestadoscuentasporfactura);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarEstadosCuentasPorFactura")) {
				
				}
				
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarEstadosCuentasPorFactura")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarEstadosCuentasPorFactura")) {
			
			}
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarEstadosCuentasPorFactura();
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarEstadosCuentasPorFactura")) {
				jButtonDuplicarCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarEstadosCuentasPorFactura")) {
				jButtonCopiarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarEstadosCuentasPorFactura")) {
				jButtonVerFormCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarEstadosCuentasPorFactura")) {
				jButtonModificarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarEstadosCuentasPorFactura")) {
				jButtonActualizarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarEstadosCuentasPorFactura")) {
				jButtonEliminarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarEstadosCuentasPorFactura")) {
				jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarEstadosCuentasPorFactura")) {
				jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarEstadosCuentasPorFactura")) {
				jButtonCerrarCobrarEstadosCuentasPorFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarEstadosCuentasPorFactura")) {
				jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarEstadosCuentasPorFactura")) {
				jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarEstadosCuentasPorFactura")) {
				jButtonAbrirOrderByCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarEstadosCuentasPorFactura")) {
				jButtonRecargarInformacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarEstadosCuentasPorFactura")) {
				jButtonAnterioresCobrarEstadosCuentasPorFacturaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarEstadosCuentasPorFactura")) {
				jButtonSiguientesCobrarEstadosCuentasPorFacturaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonidCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarEstadosCuentasPorFacturaUpdate")) {
				this.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonrucCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("representanteCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_pagoCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_pagoCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda")) {
				this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusquedaActionPerformed(evt);
			}
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarEstadosCuentasPorFactura();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarEstadosCuentasPorFactura")) {
				closingInternalFrameCobrarEstadosCuentasPorFactura();
				
			} else if(sTipo.equals("jButtonCancelarCobrarEstadosCuentasPorFactura")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame jInternalFrameParent=(CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(null);
			}
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarestadoscuentasporfactura,new Object(),this.cobrarestadoscuentasporfacturaParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarEstadosCuentasPorFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarEstadosCuentasPorFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarEstadosCuentasPorFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarestadoscuentasporfactura)) {
			if(!esControlTabla) {
				if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);			
				}
				
				if(this.cobrarestadoscuentasporfacturaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaReturnGeneral,this.cobrarestadoscuentasporfacturaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarestadoscuentasporfacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarEstadosCuentasPorFactura(classes,this.cobrarestadoscuentasporfacturaReturnGeneral,this.cobrarestadoscuentasporfacturaBean,false);
					}
						
					if(this.cobrarestadoscuentasporfacturaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaReturnGeneral.getCobrarEstadosCuentasPorFactura());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaReturnGeneral.getCobrarEstadosCuentasPorFactura());	
					}
						
					if(this.cobrarestadoscuentasporfacturaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfacturaReturnGeneral.getCobrarEstadosCuentasPorFactura(),classes);//this.cobrarestadoscuentasporfacturaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,classes);//this.cobrarestadoscuentasporfacturaBean);									
				}
			
				if(CobrarEstadosCuentasPorFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarEstadosCuentasPorFactura(this.cobrarestadoscuentasporfactura);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarestadoscuentasporfacturaAnterior!=null) {
						this.cobrarestadoscuentasporfactura=this.cobrarestadoscuentasporfacturaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarestadoscuentasporfacturaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarestadoscuentasporfacturaReturnGeneral.getCobrarEstadosCuentasPorFactura(),cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarestadoscuentasporfacturaReturnGeneral.getCobrarEstadosCuentasPorFactura(),this.cobrarestadoscuentasporfacturas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarEstadosCuentasPorFactura.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarEstadosCuentasPorFactura.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarEstadosCuentasPorFactura();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarEstadosCuentasPorFactura() throws Exception {
		
		CobrarEstadosCuentasPorFacturaModel cobrarestadoscuentasporfacturaModel=(CobrarEstadosCuentasPorFacturaModel)this.jTableDatosCobrarEstadosCuentasPorFactura.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarestadoscuentasporfacturaModel.cobrarestadoscuentasporfacturas=this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarestadoscuentasporfacturaModel.cobrarestadoscuentasporfacturas=this.cobrarestadoscuentasporfacturas;
		}
		
		
		((CobrarEstadosCuentasPorFacturaModel) this.jTableDatosCobrarEstadosCuentasPorFactura.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarEstadosCuentasPorFactura() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarestadoscuentasporfacturaAnterior(),this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarestadoscuentasporfacturaAnterior(),this.cobrarestadoscuentasporfacturas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarEstadosCuentasPorFactura();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
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
										
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarestadoscuentasporfactura,new Object(),generalEntityParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarEstadosCuentasPorFacturaConstantesFunciones.getClassesRelationshipsOfCobrarEstadosCuentasPorFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarEstadosCuentasPorFacturaConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarEstadosCuentasPorFactura(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarEstadosCuentasPorFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarestadoscuentasporfactura,new Object(),generalEntityParameterGeneral,this.cobrarestadoscuentasporfacturaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFacturaBean cobrarestadoscuentasporfacturaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarEstadosCuentasPorFactura(ArrayList<Classe> classes,CobrarEstadosCuentasPorFacturaReturnGeneral cobrarestadoscuentasporfacturaReturnGeneral,CobrarEstadosCuentasPorFacturaBean cobrarestadoscuentasporfacturaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarestadoscuentasporfactura)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura = new CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame(jDesktopPane,this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones(),this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setVisible(false);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.cobrarestadoscuentasporfacturaLogic=this.cobrarestadoscuentasporfacturaLogic;
		
		this.cargarCombosFrameForeignKeyCobrarEstadosCuentasPorFactura("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarEstadosCuentasPorFactura();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarEstadosCuentasPorFactura();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarEstadosCuentasPorFactura("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarEstadosCuentasPorFactura();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarEstadosCuentasPorFactura"));
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonModificarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"ModificarCobrarEstadosCuentasPorFactura"));

		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonModificarToolBarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarEstadosCuentasPorFactura"));
					
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemModificarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarEstadosCuentasPorFactura"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonActualizarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"ActualizarCobrarEstadosCuentasPorFactura"));
		
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonActualizarToolBarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarEstadosCuentasPorFactura"));
						
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemActualizarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarEstadosCuentasPorFactura"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonEliminarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"EliminarCobrarEstadosCuentasPorFactura"));
		
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonEliminarToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarEstadosCuentasPorFactura"));
								
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemEliminarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarEstadosCuentasPorFactura"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonCancelarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"CancelarCobrarEstadosCuentasPorFactura"));
		
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonCancelarToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarEstadosCuentasPorFactura"));
					
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemCancelarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarEstadosCuentasPorFactura"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemDetalleCerrarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarEstadosCuentasPorFactura"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarEstadosCuentasPorFactura"));
		
		
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarEstadosCuentasPorFactura"));
		
		
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarEstadosCuentasPorFactura"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonidCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarEstadosCuentasPorFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarEstadosCuentasPorFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"representanteCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"dia_pagoCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"hora_pagoCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"observacionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarEstadosCuentasPorFactura"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarEstadosCuentasPorFactura"));
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarEstadosCuentasPorFactura"));
		}
		
		this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarEstadosCuentasPorFactura"));
		
		this.jTableDatosCobrarEstadosCuentasPorFactura.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarEstadosCuentasPorFactura"));
		
		this.jButtonNuevoCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"NuevoCobrarEstadosCuentasPorFactura"));
		
		this.jButtonDuplicarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"DuplicarCobrarEstadosCuentasPorFactura"));
		
		this.jButtonCopiarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"CopiarCobrarEstadosCuentasPorFactura"));
		
		this.jButtonVerFormCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"VerFormCobrarEstadosCuentasPorFactura"));
		
		
		this.jButtonNuevoToolBarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarEstadosCuentasPorFactura"));
			
		this.jButtonDuplicarToolBarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemNuevoCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemDuplicarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarEstadosCuentasPorFactura"));		
		
		
		this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarEstadosCuentasPorFactura"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonModificarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"ModificarCobrarEstadosCuentasPorFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonModificarToolBarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarEstadosCuentasPorFactura"));
			
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemModificarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarEstadosCuentasPorFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonActualizarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"ActualizarCobrarEstadosCuentasPorFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonActualizarToolBarCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarEstadosCuentasPorFactura"));
				
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemActualizarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarEstadosCuentasPorFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonEliminarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"EliminarCobrarEstadosCuentasPorFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonEliminarToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarEstadosCuentasPorFactura"));
						
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemEliminarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarEstadosCuentasPorFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonCancelarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"CancelarCobrarEstadosCuentasPorFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonCancelarToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarEstadosCuentasPorFactura"));
			
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemCancelarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarEstadosCuentasPorFactura"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarEstadosCuentasPorFactura"));		
		
		
		this.jButtonCerrarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"CerrarCobrarEstadosCuentasPorFactura"));
		
		
		this.jButtonCerrarToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemCerrarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarEstadosCuentasPorFactura"));
			
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jMenuItemDetalleCerrarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarEstadosCuentasPorFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarEstadosCuentasPorFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarEstadosCuentasPorFactura"));
		}
		
		this.jButtonCopiarToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarEstadosCuentasPorFactura"));
			
		this.jButtonVerFormToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarEstadosCuentasPorFactura"));
		
		this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemCopiarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarEstadosCuentasPorFactura"));		
		
		this.jMenuItemVerFormCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarEstadosCuentasPorFactura"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarEstadosCuentasPorFactura"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarEstadosCuentasPorFactura"));		
		
		
		
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarEstadosCuentasPorFactura"));
					
		this.jButtonRecargarInformacionToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarEstadosCuentasPorFactura"));
		
		this.jMenuItemRecargarInformacionCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarEstadosCuentasPorFactura"));		
		
		
		
		this.jButtonAnterioresCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"AnterioresCobrarEstadosCuentasPorFactura"));
		
		
		this.jButtonAnterioresToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarEstadosCuentasPorFactura"));
		
		this.jMenuItemAnterioresCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarEstadosCuentasPorFactura"));		
		
		
		this.jButtonSiguientesCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"SiguientesCobrarEstadosCuentasPorFactura"));
		
		
		this.jButtonSiguientesToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemSiguientesCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemAbrirOrderByCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarEstadosCuentasPorFactura"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarEstadosCuentasPorFactura"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarEstadosCuentasPorFactura"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarEstadosCuentasPorFactura"));

		this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarEstadosCuentasPorFactura"));
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarEstadosCuentasPorFactura"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarEstadosCuentasPorFactura"));
			
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarEstadosCuentasPorFactura"));
					
		this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarEstadosCuentasPorFactura"));
			
		this.jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarEstadosCuentasPorFactura"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonidCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarEstadosCuentasPorFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarEstadosCuentasPorFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"representanteCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"dia_pagoCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"hora_pagoCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"observacionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"BusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura"));

			this.jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"BusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura!=null) {
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarEstadosCuentasPorFactura"));
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarEstadosCuentasPorFactura"));
				this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarEstadosCuentasPorFactura"));				
			//this.jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarEstadosCuentasPorFactura"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura!=null) {
				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarEstadosCuentasPorFactura"));
				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarEstadosCuentasPorFactura"));
				this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarEstadosCuentasPorFactura"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarEstadosCuentasPorFactura"));
			
			this.jButtonAbrirOrderByToolBarCobrarEstadosCuentasPorFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarEstadosCuentasPorFactura"));			
			
			if(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura!=null) {
				this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarEstadosCuentasPorFactura"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarEstadosCuentasPorFactura"));
		
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
            		closingInternalFrameCobrarEstadosCuentasPorFactura();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura = (JInternalFrameBase)event.getSource();
	            	
	            CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame jInternalFrameParent=(CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarEstadosCuentasPorFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarEstadosCuentasPorFactura.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonNuevoCobrarEstadosCuentasPorFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarEstadosCuentasPorFacturaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonModificarCobrarEstadosCuentasPorFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarEstadosCuentasPorFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonActualizarCobrarEstadosCuentasPorFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarEstadosCuentasPorFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonEliminarCobrarEstadosCuentasPorFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarEstadosCuentasPorFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonCancelarCobrarEstadosCuentasPorFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonCerrarCobrarEstadosCuentasPorFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarEstadosCuentasPorFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarEstadosCuentasPorFactura";
		inputMap = this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFacturaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarEstadosCuentasPorFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonidCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarEstadosCuentasPorFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarEstadosCuentasPorFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"representanteCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"dia_pagoCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"hora_pagoCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"observacionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarEstadosCuentasPorFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda"));
		
		
		this.jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"BusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura"));

		this.jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.addActionListener(new ButtonActionListener(this,"BusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarEstadosCuentasPorFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarEstadosCuentasPorFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarEstadosCuentasPorFactura(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
					cobrarestadoscuentasporfacturaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturas) {
					cobrarestadoscuentasporfacturaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
						cobrarestadoscuentasporfacturaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturas) {
						cobrarestadoscuentasporfacturaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarEstadosCuentasPorFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarEstadosCuentasPorFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarEstadosCuentasPorFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarEstadosCuentasPorFactura.getSelectedRows();
			
			CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaLocal=new CobrarEstadosCuentasPorFactura();
			
			//this.seleccionarTodosCobrarEstadosCuentasPorFactura(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarestadoscuentasporfacturaLocal =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarestadoscuentasporfacturaLocal =(CobrarEstadosCuentasPorFactura) this.cobrarestadoscuentasporfacturas.toArray()[this.jTableDatosCobrarEstadosCuentasPorFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarestadoscuentasporfacturaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
						cobrarestadoscuentasporfacturaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturas) {
						cobrarestadoscuentasporfacturaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarEstadosCuentasPorFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarEstadosCuentasPorFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarEstadosCuentasPorFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarEstadosCuentasPorFacturaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarEstadosCuentasPorFacturaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
				
						if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_vence_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_vence_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setrepresentante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setdia_pago(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.sethora_pago(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setobservacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.settelefono_telefono(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturas) {
					
						if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_vence_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_vence_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setrepresentante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setdia_pago(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.sethora_pago(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setobservacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarestadoscuentasporfacturaAux.settelefono_telefono(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarEstadosCuentasPorFacturaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarEstadosCuentasPorFactura=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarEstadosCuentasPorFactura) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarEstadosCuentasPorFactura(conSplash);
				
					this.generarReporteCobrarEstadosCuentasPorFacturasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarEstadosCuentasPorFacturasSeleccionados();
				//this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarEstadosCuentasPorFacturasSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarEstadosCuentasPorFacturasSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarEstadosCuentasPorFactura();
				
				this.exportarCobrarEstadosCuentasPorFacturasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarEstadosCuentasPorFacturas();
				//this.importarCobrarEstadosCuentasPorFacturas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarEstadosCuentasPorFactura();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarEstadosCuentasPorFacturasSeleccionados();
				//this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarEstadosCuentasPorFactura();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarEstadosCuentasPorFactura)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarEstadosCuentasPorFactura(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarEstadosCuentasPorFactura) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarEstadosCuentasPorFactura(conSplash);
					
						//this.actualizarParametrosGeneralCobrarEstadosCuentasPorFactura();
						
						this.generarReporteProcesoAccionCobrarEstadosCuentasPorFacturasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Estados Cuentas Por FacturaS SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarEstadosCuentasPorFactura();
				
						this.actualizarParametrosGeneralCobrarEstadosCuentasPorFactura();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarestadoscuentasporfacturaReturnGeneral=cobrarestadoscuentasporfacturaLogic.procesarAccionCobrarEstadosCuentasPorFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas(),this.cobrarestadoscuentasporfacturaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarEstadosCuentasPorFacturaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarEstadosCuentasPorFactura();
					
					CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarEstadosCuentasPorFacturaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarEstadosCuentasPorFactura(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarEstadosCuentasPorFacturaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarEstadosCuentasPorFactura();
			
			if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();		
			CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura=new CobrarEstadosCuentasPorFactura();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura.getSelectedItem();
			
			
			
			
			cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarestadoscuentasporfacturasSeleccionados.size()==1) {
				for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturasSeleccionados) {
					cobrarestadoscuentasporfactura=cobrarestadoscuentasporfacturaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarEstadosCuentasPorFactura();
			
      		//this.finishProcessCobrarEstadosCuentasPorFactura(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarEstadosCuentasPorFacturaReturnGeneral() throws Exception {
		if(this.cobrarestadoscuentasporfacturaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarestadoscuentasporfacturaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarestadoscuentasporfacturaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarestadoscuentasporfacturaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarestadoscuentasporfacturaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarestadoscuentasporfacturaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
		}
		
		if(this.cobrarestadoscuentasporfacturaReturnGeneral.getConRetornoLista() || this.cobrarestadoscuentasporfacturaReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarestadoscuentasporfacturaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarestadoscuentasporfacturaLogic.setCobrarEstadosCuentasPorFacturas(this.cobrarestadoscuentasporfacturaReturnGeneral.getCobrarEstadosCuentasPorFacturas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarEstadosCuentasPorFactura(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarEstadosCuentasPorFactura() throws Exception {
		
		
	}
	
	public ArrayList<CobrarEstadosCuentasPorFactura> getCobrarEstadosCuentasPorFacturasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarEstadosCuentasPorFactura) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas()) {
					if(cobrarestadoscuentasporfacturaAux.getIsSelected()) {
						cobrarestadoscuentasporfacturasSeleccionados.add(cobrarestadoscuentasporfacturaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:this.cobrarestadoscuentasporfacturas) {
					if(cobrarestadoscuentasporfacturaAux.getIsSelected()) {
						cobrarestadoscuentasporfacturasSeleccionados.add(cobrarestadoscuentasporfacturaAux);				
					}
				}
			}
			
			if(cobrarestadoscuentasporfacturasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarestadoscuentasporfacturasSeleccionados.addAll(this.cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarestadoscuentasporfacturasSeleccionados.addAll(this.cobrarestadoscuentasporfacturas);				
					}
				}
			}
		} else {
			cobrarestadoscuentasporfacturasSeleccionados.add(this.cobrarestadoscuentasporfactura);
		}
		
		return cobrarestadoscuentasporfacturasSeleccionados;
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
	
	public void generarReporteCobrarEstadosCuentasPorFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarEstadosCuentasPorFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarEstadosCuentasPorFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarEstadosCuentasPorFacturasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarEstadosCuentasPorFacturasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Estados Cuentas Por Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarEstadosCuentasPorFacturasSeleccionados() throws Exception {
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();		
		
		cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarEstadosCuentasPorFacturas("Todos",cobrarestadoscuentasporfacturasSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarEstadosCuentasPorFacturasSeleccionados() throws Exception {
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();		
		
		cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarEstadosCuentasPorFacturas("Todos",cobrarestadoscuentasporfacturasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarEstadosCuentasPorFacturasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();
		
		cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarEstadosCuentasPorFacturas("Todos",cobrarestadoscuentasporfacturasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarEstadosCuentasPorFacturasSeleccionados() throws Exception {
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarEstadosCuentasPorFactura();
		
		
		cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarEstadosCuentasPorFactura();
		
		
		//this.generarReporteCobrarEstadosCuentasPorFacturas("Todos",cobrarestadoscuentasporfacturasSeleccionados ,cobrarestadoscuentasporfacturaImplementable,cobrarestadoscuentasporfacturaImplementableHome);
	}
	
	public void mostrarImportacionCobrarEstadosCuentasPorFacturas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarEstadosCuentasPorFactura();
		
		this.abrirFrameImportacionCobrarEstadosCuentasPorFactura();		
		
			
		//this.generarReporteCobrarEstadosCuentasPorFacturas("Todos",cobrarestadoscuentasporfacturasSeleccionados ,cobrarestadoscuentasporfacturaImplementable,cobrarestadoscuentasporfacturaImplementableHome);
	}
	
	public void importarCobrarEstadosCuentasPorFacturas() throws Exception {		
	
	}
	
	public void exportarCobrarEstadosCuentasPorFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarEstadosCuentasPorFacturasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarEstadosCuentasPorFacturasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarEstadosCuentasPorFacturasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Estados Cuentas Por Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarEstadosCuentasPorFacturasSeleccionados() throws Exception {
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();		
		
		cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarestadoscuentasporfactura."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarEstadosCuentasPorFactura(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfacturaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarestadoscuentasporfacturaAux.setsDetalleGeneralEntityReporte(cobrarestadoscuentasporfacturaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarEstadosCuentasPorFactura(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarestadoscuentasporfactura.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getfecha_vence_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getfecha_vence_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getnombre_cuenta_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getrepresentante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getdia_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.gethora_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getobservacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getnombre_transaccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getfecha_vence().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getdebito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getcredito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.getdireccion_direccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarestadoscuentasporfactura.gettelefono_telefono();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarEstadosCuentasPorFacturasSeleccionados() throws Exception {
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();		
		
		cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarestadoscuentasporfactura.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarEstadosCuentasPorFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarEstadosCuentasPorFactura(row);				
				iRow++;
			}				
			
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfacturaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarEstadosCuentasPorFacturasSeleccionados() throws Exception {
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();		
		
		cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarestadoscuentasporfactura.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarestadoscuentasporfacturas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarestadoscuentasporfactura");
			//elementRoot.appendChild(element);
		
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturasSeleccionados) {
				element = document.createElement("cobrarestadoscuentasporfactura");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfacturaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Estados Cuentas Por Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarEstadosCuentasPorFactura(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_vence_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_vence_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getrepresentante());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getdia_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.gethora_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getobservacion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getnombre_transaccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_vence());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getdebito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getcredito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.getdireccion_direccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarestadoscuentasporfactura.gettelefono_telefono());				
	}
	
	public void setFilaDatosExportarXmlCobrarEstadosCuentasPorFactura(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_emision_desde = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementfecha_vence_desde = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.FECHAVENCEDESDE);
		elementfecha_vence_desde.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getfecha_vence_desde().toString().trim()));
		element.appendChild(elementfecha_vence_desde);

		Element elementfecha_vence_hasta = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.FECHAVENCEHASTA);
		elementfecha_vence_hasta.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getfecha_vence_hasta().toString().trim()));
		element.appendChild(elementfecha_vence_hasta);

		Element elementnombre_cuenta_contable = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.NOMBRECUENTACONTABLE);
		elementnombre_cuenta_contable.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getnombre_cuenta_contable().trim()));
		element.appendChild(elementnombre_cuenta_contable);

		Element elementnombre_ciudad = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementnombre_zona = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnombre_completo = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementruc = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getruc().trim()));
		element.appendChild(elementruc);

		Element elementrepresentante = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.REPRESENTANTE);
		elementrepresentante.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getrepresentante().trim()));
		element.appendChild(elementrepresentante);

		Element elementdia_pago = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.DIAPAGO);
		elementdia_pago.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getdia_pago().toString().trim()));
		element.appendChild(elementdia_pago);

		Element elementhora_pago = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.HORAPAGO);
		elementhora_pago.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.gethora_pago().toString().trim()));
		element.appendChild(elementhora_pago);

		Element elementobservacion = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getobservacion().trim()));
		element.appendChild(elementobservacion);

		Element elementnombre_transaccion = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.NOMBRETRANSACCION);
		elementnombre_transaccion.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getnombre_transaccion().trim()));
		element.appendChild(elementnombre_transaccion);

		Element elementfecha_vence = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.FECHAVENCE);
		elementfecha_vence.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getfecha_vence().toString().trim()));
		element.appendChild(elementfecha_vence);

		Element elementfecha_emision = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnumero_comprobante = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementnumero_factura = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementdebito_mone_local = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.DEBITOMONELOCAL);
		elementdebito_mone_local.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getdebito_mone_local().toString().trim()));
		element.appendChild(elementdebito_mone_local);

		Element elementcredito_mone_local = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.CREDITOMONELOCAL);
		elementcredito_mone_local.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getcredito_mone_local().toString().trim()));
		element.appendChild(elementcredito_mone_local);

		Element elementdireccion_direccion = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.DIRECCIONDIRECCION);
		elementdireccion_direccion.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.getdireccion_direccion().trim()));
		element.appendChild(elementdireccion_direccion);

		Element elementtelefono_telefono = document.createElement(CobrarEstadosCuentasPorFacturaConstantesFunciones.TELEFONOTELEFONO);
		elementtelefono_telefono.appendChild(document.createTextNode(cobrarestadoscuentasporfactura.gettelefono_telefono().trim()));
		element.appendChild(elementtelefono_telefono);
	}
	
	public void generarReporteGroupGenericoCobrarEstadosCuentasPorFacturasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados=new ArrayList<CobrarEstadosCuentasPorFactura>();
		
		cobrarestadoscuentasporfacturasSeleccionados=this.getCobrarEstadosCuentasPorFacturasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarEstadosCuentasPorFactura(cobrarestadoscuentasporfacturasSeleccionados);
		
		this.generarReporteCobrarEstadosCuentasPorFacturas("Todos",cobrarestadoscuentasporfacturasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarEstadosCuentasPorFactura(ArrayList<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfacturaAux:cobrarestadoscuentasporfacturasSeleccionados) {
				cobrarestadoscuentasporfacturaAux.setsDetalleGeneralEntityReporte(cobrarestadoscuentasporfacturaAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarestadoscuentasporfacturaAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarestadoscuentasporfacturaAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarestadoscuentasporfacturaAux.getfecha_vence_desde()));
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarestadoscuentasporfacturaAux.getfecha_vence_hasta()));
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getnombre_cuenta_contable());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getrepresentante());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getdia_pago().toString());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.gethora_pago().toString());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getobservacion());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getnombre_transaccion());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarestadoscuentasporfacturaAux.getfecha_vence()));
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarestadoscuentasporfacturaAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.getdireccion_direccion());
				}
				 else if(sTipoSeleccionar.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
					existe=true;
					cobrarestadoscuentasporfacturaAux.setsDescripcionGeneralEntityReporte1(cobrarestadoscuentasporfacturaAux.gettelefono_telefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarEstadosCuentasPorFactura(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=true;
		} else {
			this.actualizarEstadoPanelsCobrarEstadosCuentasPorFactura(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarEstadosCuentasPorFactura=false;
			//this.isVisibilidadCeldaVerFormCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaDuplicarCobrarEstadosCuentasPorFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;												
			}
			
			this.jButtonCerrarCobrarEstadosCuentasPorFactura.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarestadoscuentasporfactura)) {
			this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=false;
			this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarEstadosCuentasPorFactura=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarEstadosCuentasPorFactura=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarEstadosCuentasPorFactura=false;
		//this.isVisibilidadCeldaModificarCobrarEstadosCuentasPorFactura=true;
		this.isVisibilidadCeldaActualizarCobrarEstadosCuentasPorFactura=false;
		this.isVisibilidadCeldaEliminarCobrarEstadosCuentasPorFactura=false;
		//this.isVisibilidadCeldaCancelarCobrarEstadosCuentasPorFactura=true;			
		this.isVisibilidadCeldaGuardarCobrarEstadosCuentasPorFactura=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarEstadosCuentasPorFactura() {
	}
	
	public void actualizarEstadoPanelsCobrarEstadosCuentasPorFactura(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura!=null) {
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelPaginacionCobrarEstadosCuentasPorFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura!=null) {
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelPaginacionCobrarEstadosCuentasPorFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura!=null) {
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelPaginacionCobrarEstadosCuentasPorFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura!=null) {
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelPaginacionCobrarEstadosCuentasPorFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura!=null) {
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelPaginacionCobrarEstadosCuentasPorFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura!=null) {
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelPaginacionCobrarEstadosCuentasPorFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura!=null) {
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura!=null) {
				this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelPaginacionCobrarEstadosCuentasPorFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura!=null) {
					this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura!=null) {
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura!=null) {
				this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarEstadosCuentasPorFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarEstadosCuentasPorFactura) {this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.remove(jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);}

			this.isVisibilidadBusquedaCobrarEstadosCuentasPorFactura2=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarEstadosCuentasPorFactura2) {this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.remove(jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);}
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
			
			this.inicializarActualizarBindingTablaCobrarEstadosCuentasPorFactura(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarEstadosCuentasPorFactura() {
		this.updateBorderResaltarBusquedasFormularioCobrarEstadosCuentasPorFactura();
		this.updateVisibilidadBusquedasFormularioCobrarEstadosCuentasPorFactura();
		this.updateHabilitarBusquedasFormularioCobrarEstadosCuentasPorFactura();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarEstadosCuentasPorFactura() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponents().length>0) {
	

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura!=null) {
			index= this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.indexOfComponent(this.jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponent(index);
				jPanel.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);
			}
		}

		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura!=null) {
			index= this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.indexOfComponent(this.jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponent(index);
				jPanel.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarEstadosCuentasPorFactura() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.indexOfComponent(this.jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);
			if(!this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura && index>-1) {
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.remove(index);
			}

			index= this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.indexOfComponent(this.jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);
			if(!this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura && index>-1) {
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarEstadosCuentasPorFactura() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.indexOfComponent(this.jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setEnabledAt(index,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);
			}

			index= this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.indexOfComponent(this.jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);
				this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setEnabledAt(index,this.cobrarestadoscuentasporfacturaConstantesFunciones.activarBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarEstadosCuentasPorFactura(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarEstadosCuentasPorFactura")) {
			index= this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.indexOfComponent(this.jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);

			this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponent(index);

			this.cobrarestadoscuentasporfacturaConstantesFunciones.setResaltarBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura(resaltar);

			jPanel.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaCobrarEstadosCuentasPorFactura2")) {
			index= this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.indexOfComponent(this.jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);

			this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.getComponent(index);

			this.cobrarestadoscuentasporfacturaConstantesFunciones.setResaltarBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura(resaltar);

			jPanel.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarEstadosCuentasPorFactura() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarEstadosCuentasPorFactura();
		this.updateVisibilidadResaltarControlesFormularioCobrarEstadosCuentasPorFactura();
		this.updateHabilitarResaltarControlesFormularioCobrarEstadosCuentasPorFactura();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarEstadosCuentasPorFactura() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltaridCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltaridCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarid_empresaCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarid_empresaCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_emision_desdeCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_emision_desdeCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_emision_hastaCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_emision_hastaCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_vence_desdeCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_vence_desdeCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_vence_hastaCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_vence_hastaCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_cuenta_contableCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_cuenta_contableCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_ciudadCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_ciudadCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_zonaCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_zonaCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_completoCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_completoCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarrucCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldrucCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarrucCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarrepresentanteCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextArearepresentanteCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarrepresentanteCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardia_pagoCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardia_pagoCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarhora_pagoCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarhora_pagoCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarobservacionCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreaobservacionCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarobservacionCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_transaccionCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnombre_transaccionCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_venceCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_venceCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_emisionCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarfecha_emisionCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnumero_comprobanteCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnumero_comprobanteCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnumero_facturaCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarnumero_facturaCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardebito_mone_localCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardebito_mone_localCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarcredito_mone_localCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltarcredito_mone_localCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardireccion_direccionCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltardireccion_direccionCobrarEstadosCuentasPorFactura);}
		if(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltartelefono_telefonoCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setBorder(this.cobrarestadoscuentasporfacturaConstantesFunciones.resaltartelefono_telefonoCobrarEstadosCuentasPorFactura);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarEstadosCuentasPorFactura() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
	
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostraridCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelidCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostraridCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarid_empresaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelid_empresaCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarid_empresaCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_emision_desdeCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelfecha_emision_desdeCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_emision_desdeCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_emision_hastaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelfecha_emision_hastaCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_emision_hastaCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_vence_desdeCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelfecha_vence_desdeCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_vence_desdeCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_vence_hastaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelfecha_vence_hastaCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_vence_hastaCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_cuenta_contableCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_cuenta_contableCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_ciudadCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelnombre_ciudadCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_ciudadCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_zonaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelnombre_zonaCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_zonaCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_completoCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelnombre_completoCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_completoCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldrucCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarrucCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelrucCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarrucCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextArearepresentanteCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarrepresentanteCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelrepresentanteCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarrepresentanteCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrardia_pagoCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPaneldia_pagoCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrardia_pagoCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarhora_pagoCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelhora_pagoCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarhora_pagoCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreaobservacionCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarobservacionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelobservacionCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarobservacionCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_transaccionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelnombre_transaccionCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnombre_transaccionCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_venceCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelfecha_venceCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_venceCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_emisionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelfecha_emisionCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarfecha_emisionCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnumero_comprobanteCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelnumero_comprobanteCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnumero_comprobanteCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnumero_facturaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelnumero_facturaCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarnumero_facturaCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrardebito_mone_localCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPaneldebito_mone_localCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrardebito_mone_localCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarcredito_mone_localCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPanelcredito_mone_localCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrarcredito_mone_localCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrardireccion_direccionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPaneldireccion_direccionCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrardireccion_direccionCobrarEstadosCuentasPorFactura);
		//this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrartelefono_telefonoCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jPaneltelefono_telefonoCobrarEstadosCuentasPorFactura.setVisible(this.cobrarestadoscuentasporfacturaConstantesFunciones.mostrartelefono_telefonoCobrarEstadosCuentasPorFactura);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarEstadosCuentasPorFactura() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura!=null) {
	
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jLabelidCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activaridCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarid_empresaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_emision_desdeCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_emision_hastaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_vence_desdeCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_vence_hastaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_cuenta_contableCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_ciudadCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_zonaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_completoCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldrucCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarrucCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextArearepresentanteCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarrepresentanteCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activardia_pagoCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarhora_pagoCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreaobservacionCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarobservacionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnombre_transaccionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_venceCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarfecha_emisionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnumero_comprobanteCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarnumero_facturaCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activardebito_mone_localCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activarcredito_mone_localCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activardireccion_direccionCobrarEstadosCuentasPorFactura);
		this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setEnabled(this.cobrarestadoscuentasporfacturaConstantesFunciones.activartelefono_telefonoCobrarEstadosCuentasPorFactura);
		}
	}
	
		
}