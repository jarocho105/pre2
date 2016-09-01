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

//import com.bydan.erp.cartera.util.CobrarControlCarterasGeneralesConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarControlCarterasGeneralesParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarControlCarterasGeneralesParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarControlCarterasGeneralesBean;
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
public class CobrarControlCarterasGeneralesBeanSwingJInternalFrame extends CobrarControlCarterasGeneralesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarControlCarterasGeneralesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralesValidator = new ClassValidator<CobrarControlCarterasGenerales>(CobrarControlCarterasGenerales.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales;	
	public CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux;
	public CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesTotales;
	public Long idCobrarControlCarterasGeneralesActual;
	public Long iIdNuevoCobrarControlCarterasGenerales=0L;
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
	
	public Boolean isPermisoTodoCobrarControlCarterasGenerales;
	public Boolean isPermisoNuevoCobrarControlCarterasGenerales;
	public Boolean isPermisoActualizarCobrarControlCarterasGenerales;
	public Boolean isPermisoActualizarOriginalCobrarControlCarterasGenerales;
	public Boolean isPermisoEliminarCobrarControlCarterasGenerales;
	public Boolean isPermisoGuardarCambiosCobrarControlCarterasGenerales;
	public Boolean isPermisoConsultaCobrarControlCarterasGenerales;
	public Boolean isPermisoBusquedaCobrarControlCarterasGenerales;
	public Boolean isPermisoReporteCobrarControlCarterasGenerales;
	public Boolean isPermisoPaginacionMedioCobrarControlCarterasGenerales;
	public Boolean isPermisoPaginacionAltoCobrarControlCarterasGenerales;
	public Boolean isPermisoPaginacionTodoCobrarControlCarterasGenerales;
	public Boolean isPermisoCopiarCobrarControlCarterasGenerales;
	public Boolean isPermisoVerFormCobrarControlCarterasGenerales;
	public Boolean isPermisoDuplicarCobrarControlCarterasGenerales;
	public Boolean isPermisoOrdenCobrarControlCarterasGenerales;
	
	
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
	
	public CobrarControlCarterasGeneralesParameterReturnGeneral cobrarcontrolcarterasgeneralesReturnGeneral;
	public CobrarControlCarterasGeneralesParameterReturnGeneral cobrarcontrolcarterasgeneralesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarControlCarterasGenerales=false;
	public Boolean esParaAccionDesdeFormularioCobrarControlCarterasGenerales=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarControlCarterasGeneralesSessionBeanAdditional cobrarcontrolcarterasgeneralesSessionBeanAdditional=null;
	
	public CobrarControlCarterasGeneralesSessionBeanAdditional getCobrarControlCarterasGeneralesSessionBeanAdditional() {
		return this.cobrarcontrolcarterasgeneralesSessionBeanAdditional;
	}
	
	public void setCobrarControlCarterasGeneralesSessionBeanAdditional(CobrarControlCarterasGeneralesSessionBeanAdditional cobrarcontrolcarterasgeneralesSessionBeanAdditional) {
		try {
			this.cobrarcontrolcarterasgeneralesSessionBeanAdditional=cobrarcontrolcarterasgeneralesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional cobrarcontrolcarterasgeneralesBeanSwingJInternalFrameAdditional=null;
	//public class CobrarControlCarterasGeneralesBeanSwingJInternalFrame
	
	public CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional getCobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional() {
		return this.cobrarcontrolcarterasgeneralesBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional(CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional cobrarcontrolcarterasgeneralesBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarcontrolcarterasgeneralesBeanSwingJInternalFrameAdditional=cobrarcontrolcarterasgeneralesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarControlCarterasGeneralesLogic cobrarcontrolcarterasgeneralesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesBean;
	public CobrarControlCarterasGeneralesConstantesFunciones cobrarcontrolcarterasgeneralesConstantesFunciones;
	//public CobrarControlCarterasGeneralesParameterReturnGeneral cobrarcontrolcarterasgeneralesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneraless;	
	//public List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessEliminados;
	//public List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales=true;
	public Boolean isVisibilidadCeldaCopiarCobrarControlCarterasGenerales=true;
	public Boolean isVisibilidadCeldaVerFormCobrarControlCarterasGenerales=true;
	public Boolean isVisibilidadCeldaOrdenCobrarControlCarterasGenerales=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;
	public Boolean isVisibilidadCeldaModificarCobrarControlCarterasGenerales=false;
	public Boolean isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=false;
	public Boolean isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=false;
	public Boolean isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=false;
	public Boolean isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarControlCarterasGenerales=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCobrarControlCarterasGenerales() {
		return this.iIdNuevoCobrarControlCarterasGenerales;
	}

	public void setiIdNuevoCobrarControlCarterasGenerales(Long iIdNuevoCobrarControlCarterasGenerales) {
		this.iIdNuevoCobrarControlCarterasGenerales = iIdNuevoCobrarControlCarterasGenerales;
	}
	
	public Long getidCobrarControlCarterasGeneralesActual() {
		return this.idCobrarControlCarterasGeneralesActual;
	}

	public void setidCobrarControlCarterasGeneralesActual(Long idCobrarControlCarterasGeneralesActual) {
		this.idCobrarControlCarterasGeneralesActual = idCobrarControlCarterasGeneralesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarControlCarterasGenerales getcobrarcontrolcarterasgenerales() {
		return this.cobrarcontrolcarterasgenerales;
	}

	public void setcobrarcontrolcarterasgenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales) {
		this.cobrarcontrolcarterasgenerales = cobrarcontrolcarterasgenerales;
	}
	
	public CobrarControlCarterasGenerales getcobrarcontrolcarterasgeneralesAux() {
		return this.cobrarcontrolcarterasgeneralesAux;
	}

	public void setcobrarcontrolcarterasgeneralesAux(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux) {
		this.cobrarcontrolcarterasgeneralesAux = cobrarcontrolcarterasgeneralesAux;
	}				
	
	public CobrarControlCarterasGenerales getcobrarcontrolcarterasgeneralesAnterior() {
		return this.cobrarcontrolcarterasgeneralesAnterior;
	}

	public void setcobrarcontrolcarterasgeneralesAnterior(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAnterior) {
		this.cobrarcontrolcarterasgeneralesAnterior = cobrarcontrolcarterasgeneralesAnterior;
	}	
	
	public CobrarControlCarterasGenerales getcobrarcontrolcarterasgeneralesTotales() {
		return this.cobrarcontrolcarterasgeneralesTotales;
	}

	public void setcobrarcontrolcarterasgeneralesTotales(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesTotales) {
		this.cobrarcontrolcarterasgeneralesTotales = cobrarcontrolcarterasgeneralesTotales;
	}	
	
	public CobrarControlCarterasGenerales getcobrarcontrolcarterasgeneralesBean() {
		return this.cobrarcontrolcarterasgeneralesBean;
	}

	public void setcobrarcontrolcarterasgeneralesBean(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesBean) {
		this.cobrarcontrolcarterasgeneralesBean = cobrarcontrolcarterasgeneralesBean;
	}	
	
	public CobrarControlCarterasGeneralesParameterReturnGeneral getcobrarcontrolcarterasgeneralesReturnGeneral() {
		return this.cobrarcontrolcarterasgeneralesReturnGeneral;
	}

	public void setcobrarcontrolcarterasgeneralesReturnGeneral(CobrarControlCarterasGeneralesParameterReturnGeneral cobrarcontrolcarterasgeneralesReturnGeneral) {
		this.cobrarcontrolcarterasgeneralesReturnGeneral = cobrarcontrolcarterasgeneralesReturnGeneral;
	}	
	
	
	public Date fecha_emision_hastaBusquedaCobrarControlCarterasGenerales=new Date();

	public Date getfecha_emision_hastaBusquedaCobrarControlCarterasGenerales() {
		return this.fecha_emision_hastaBusquedaCobrarControlCarterasGenerales;
	}

	public void setfecha_emision_hastaBusquedaCobrarControlCarterasGenerales(Date fecha_emision_hastaBusquedaCobrarControlCarterasGenerales) {
		this.fecha_emision_hastaBusquedaCobrarControlCarterasGenerales = fecha_emision_hastaBusquedaCobrarControlCarterasGenerales;
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
	
	
	public CobrarControlCarterasGeneralesLogic getCobrarControlCarterasGeneralesLogic()	{		
		return cobrarcontrolcarterasgeneralesLogic;
	}

	public void setCobrarControlCarterasGeneralesLogic(CobrarControlCarterasGeneralesLogic cobrarcontrolcarterasgeneralesLogic) {
		this.cobrarcontrolcarterasgeneralesLogic = cobrarcontrolcarterasgeneralesLogic;
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
	
	public Boolean getIsEsNuevoCobrarControlCarterasGenerales() {
		return isEsNuevoCobrarControlCarterasGenerales;
	}

	public void setIsEsNuevoCobrarControlCarterasGenerales(Boolean isEsNuevoCobrarControlCarterasGenerales) {
		this.isEsNuevoCobrarControlCarterasGenerales = isEsNuevoCobrarControlCarterasGenerales;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarControlCarterasGenerales() {
		return esParaAccionDesdeFormularioCobrarControlCarterasGenerales;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarControlCarterasGenerales(Boolean esParaAccionDesdeFormularioCobrarControlCarterasGenerales) {
		this.esParaAccionDesdeFormularioCobrarControlCarterasGenerales = esParaAccionDesdeFormularioCobrarControlCarterasGenerales;
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

			if(this.cobrarcontrolcarterasgeneralesSessionBean==null) {
				this.cobrarcontrolcarterasgeneralesSessionBean=new CobrarControlCarterasGeneralesSessionBean();
			}

			if(!this.cobrarcontrolcarterasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarcontrolcarterasgeneralesSessionBean.getlidEmpresaActual());
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

					if(this.cobrarcontrolcarterasgenerales!=null) {
						this.cobrarcontrolcarterasgenerales.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
						this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarControlCarterasGenerales.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
						if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarControlCarterasGeneralesGenerico)throws Exception
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
				jComboBoxid_empresaCobrarControlCarterasGeneralesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarControlCarterasGeneralesGenerico!=null && jComboBoxid_empresaCobrarControlCarterasGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarControlCarterasGeneralesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,JComboBox jComboBoxid_empresaCobrarControlCarterasGeneralesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarControlCarterasGeneralesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarControlCarterasGeneralesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarcontrolcarterasgenerales.setid_empresa(empresaAux.getId());
				cobrarcontrolcarterasgenerales.setempresa_descripcion(CobrarControlCarterasGeneralesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarcontrolcarterasgenerales.setEmpresa(empresaAux);			}
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

					if(!CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { 
							this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { 
					}

					if(!CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
							this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
							this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCobrarControlCarterasGenerales() throws Exception {
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
		
	public CobrarControlCarterasGeneralesParameterReturnGeneral getCobrarControlCarterasGeneralesParameterGeneral() {
		return this.cobrarcontrolcarterasgeneralesParameterGeneral;
	}
	
	public void setCobrarControlCarterasGeneralesParameterGeneral(CobrarControlCarterasGeneralesParameterReturnGeneral cobrarcontrolcarterasgeneralesParameterGeneral) {
		this.cobrarcontrolcarterasgeneralesParameterGeneral = cobrarcontrolcarterasgeneralesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarControlCarterasGenerales() {
		return isPermisoTodoCobrarControlCarterasGenerales;
	}

	public void setIsPermisoTodoCobrarControlCarterasGenerales(Boolean isPermisoTodoCobrarControlCarterasGenerales) {
		this.isPermisoTodoCobrarControlCarterasGenerales = isPermisoTodoCobrarControlCarterasGenerales;
	}

	public Boolean getIsPermisoNuevoCobrarControlCarterasGenerales() {
		return isPermisoNuevoCobrarControlCarterasGenerales;
	}

	public void setIsPermisoNuevoCobrarControlCarterasGenerales(Boolean isPermisoNuevoCobrarControlCarterasGenerales) {
		this.isPermisoNuevoCobrarControlCarterasGenerales = isPermisoNuevoCobrarControlCarterasGenerales;
	}

	public Boolean getIsPermisoActualizarCobrarControlCarterasGenerales() {
		return isPermisoActualizarCobrarControlCarterasGenerales;
	}

	public void setIsPermisoActualizarCobrarControlCarterasGenerales(Boolean isPermisoActualizarCobrarControlCarterasGenerales) {
		this.isPermisoActualizarCobrarControlCarterasGenerales = isPermisoActualizarCobrarControlCarterasGenerales;
	}

	public Boolean getIsPermisoEliminarCobrarControlCarterasGenerales() {
		return isPermisoEliminarCobrarControlCarterasGenerales;
	}

	public void setIsPermisoEliminarCobrarControlCarterasGenerales(Boolean isPermisoEliminarCobrarControlCarterasGenerales) {
		this.isPermisoEliminarCobrarControlCarterasGenerales = isPermisoEliminarCobrarControlCarterasGenerales;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarControlCarterasGenerales() {
		return isPermisoGuardarCambiosCobrarControlCarterasGenerales;
	}

	public void setIsPermisoGuardarCambiosCobrarControlCarterasGenerales(Boolean isPermisoGuardarCambiosCobrarControlCarterasGenerales) {
		this.isPermisoGuardarCambiosCobrarControlCarterasGenerales = isPermisoGuardarCambiosCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsPermisoConsultaCobrarControlCarterasGenerales() {
		return isPermisoConsultaCobrarControlCarterasGenerales;
	}

	public void setIsPermisoConsultaCobrarControlCarterasGenerales(Boolean isPermisoConsultaCobrarControlCarterasGenerales) {
		this.isPermisoConsultaCobrarControlCarterasGenerales = isPermisoConsultaCobrarControlCarterasGenerales;
	}

	public Boolean getIsPermisoBusquedaCobrarControlCarterasGenerales() {
		return isPermisoBusquedaCobrarControlCarterasGenerales;
	}

	public void setIsPermisoBusquedaCobrarControlCarterasGenerales(Boolean isPermisoBusquedaCobrarControlCarterasGenerales) {
		this.isPermisoBusquedaCobrarControlCarterasGenerales = isPermisoBusquedaCobrarControlCarterasGenerales;
	}

	public Boolean getIsPermisoReporteCobrarControlCarterasGenerales() {
		return isPermisoReporteCobrarControlCarterasGenerales;
	}

	public void setIsPermisoReporteCobrarControlCarterasGenerales(Boolean isPermisoReporteCobrarControlCarterasGenerales) {
		this.isPermisoReporteCobrarControlCarterasGenerales = isPermisoReporteCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarControlCarterasGenerales() {
		return isPermisoPaginacionMedioCobrarControlCarterasGenerales;
	}

	public void setIsPermisoPaginacionMedioCobrarControlCarterasGenerales(Boolean isPermisoPaginacionMedioCobrarControlCarterasGenerales) {
		this.isPermisoPaginacionMedioCobrarControlCarterasGenerales = isPermisoPaginacionMedioCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarControlCarterasGenerales() {
		return isPermisoPaginacionTodoCobrarControlCarterasGenerales;
	}

	public void setIsPermisoPaginacionTodoCobrarControlCarterasGenerales(Boolean isPermisoPaginacionTodoCobrarControlCarterasGenerales) {
		this.isPermisoPaginacionTodoCobrarControlCarterasGenerales = isPermisoPaginacionTodoCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarControlCarterasGenerales() {
		return isPermisoPaginacionAltoCobrarControlCarterasGenerales;
	}

	public void setIsPermisoPaginacionAltoCobrarControlCarterasGenerales(Boolean isPermisoPaginacionAltoCobrarControlCarterasGenerales) {
		this.isPermisoPaginacionAltoCobrarControlCarterasGenerales = isPermisoPaginacionAltoCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsPermisoCopiarCobrarControlCarterasGenerales() {
		return isPermisoCopiarCobrarControlCarterasGenerales;
	}

	public void setIsPermisoCopiarCobrarControlCarterasGenerales(Boolean isPermisoCopiarCobrarControlCarterasGenerales) {
		this.isPermisoCopiarCobrarControlCarterasGenerales = isPermisoCopiarCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsPermisoVerFormCobrarControlCarterasGenerales() {
		return isPermisoVerFormCobrarControlCarterasGenerales;
	}

	public void setIsPermisoVerFormCobrarControlCarterasGenerales(Boolean isPermisoVerFormCobrarControlCarterasGenerales) {
		this.isPermisoVerFormCobrarControlCarterasGenerales = isPermisoVerFormCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsPermisoDuplicarCobrarControlCarterasGenerales() {
		return isPermisoDuplicarCobrarControlCarterasGenerales;
	}

	public void setIsPermisoDuplicarCobrarControlCarterasGenerales(Boolean isPermisoDuplicarCobrarControlCarterasGenerales) {
		this.isPermisoDuplicarCobrarControlCarterasGenerales = isPermisoDuplicarCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsPermisoOrdenCobrarControlCarterasGenerales() {
		return isPermisoOrdenCobrarControlCarterasGenerales;
	}

	public void setIsPermisoOrdenCobrarControlCarterasGenerales(Boolean isPermisoOrdenCobrarControlCarterasGenerales) {
		this.isPermisoOrdenCobrarControlCarterasGenerales = isPermisoOrdenCobrarControlCarterasGenerales;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaNuevoCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaNuevoCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaNuevoCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales = isVisibilidadCeldaNuevoCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales = isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaCopiarCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaCopiarCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaCopiarCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaCopiarCobrarControlCarterasGenerales = isVisibilidadCeldaCopiarCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaVerFormCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaVerFormCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaVerFormCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaVerFormCobrarControlCarterasGenerales = isVisibilidadCeldaVerFormCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaOrdenCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaOrdenCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaOrdenCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaOrdenCobrarControlCarterasGenerales = isVisibilidadCeldaOrdenCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales = isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaModificarCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaModificarCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaModificarCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales = isVisibilidadCeldaModificarCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaActualizarCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaActualizarCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaActualizarCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales = isVisibilidadCeldaActualizarCobrarControlCarterasGenerales;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaEliminarCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaEliminarCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaEliminarCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales = isVisibilidadCeldaEliminarCobrarControlCarterasGenerales;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaCancelarCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaCancelarCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaCancelarCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales = isVisibilidadCeldaCancelarCobrarControlCarterasGenerales;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaGuardarCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaGuardarCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaGuardarCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales = isVisibilidadCeldaGuardarCobrarControlCarterasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales() {
		return isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales(Boolean isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales) {
		this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales = isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales;
	}
		
	public CobrarControlCarterasGeneralesSessionBean getcobrarcontrolcarterasgeneralesSessionBean() {
		return this.cobrarcontrolcarterasgeneralesSessionBean;
	}
	
	public void setcobrarcontrolcarterasgeneralesSessionBean(CobrarControlCarterasGeneralesSessionBean cobrarcontrolcarterasgeneralesSessionBean) {
		this.cobrarcontrolcarterasgeneralesSessionBean=cobrarcontrolcarterasgeneralesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarControlCarterasGenerales() {
		return this.isVisibilidadBusquedaCobrarControlCarterasGenerales;
	}

	public void setisVisibilidadBusquedaCobrarControlCarterasGenerales(Boolean isVisibilidadBusquedaCobrarControlCarterasGenerales) {
		this.isVisibilidadBusquedaCobrarControlCarterasGenerales=isVisibilidadBusquedaCobrarControlCarterasGenerales;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarcontrolcarterasgenerales,null);
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
	
	public void bugActualizarReferenciaActual(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarControlCarterasGenerales(cobrarcontrolcarterasgenerales);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarcontrolcarterasgeneralesAux.setId(cobrarcontrolcarterasgenerales.getId());
		cobrarcontrolcarterasgeneralesAux.setVersionRow(cobrarcontrolcarterasgenerales.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesLocal) throws Exception {
		
		if(this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesLocal) throws Exception {	
		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarcontrolcarterasgeneralesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarControlCarterasGeneralesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarcontrolcarterasgeneralesValidator.getInvalidValues(this.cobrarcontrolcarterasgenerales);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneraless) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneraless) throws Exception {
		try	{			
			CobrarControlCarterasGeneralesConstantesFunciones.actualizarSelectedLista(cobrarcontrolcarterasgenerales,cobrarcontrolcarterasgeneraless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarcontrolcarterasgeneralessLocal=this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarcontrolcarterasgeneralessLocal=this.cobrarcontrolcarterasgeneraless;
			}
			//ARCHITECTURE
		
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesLocal:cobrarcontrolcarterasgeneralessLocal) {
				if(this.permiteMantenimiento(cobrarcontrolcarterasgeneralesLocal) && cobrarcontrolcarterasgeneralesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.getCobrarControlCarterasGeneralesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_ciudadCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_zonaCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.NOMBREVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_vendedorCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelcodigoCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_completoCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.LIMITECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabellimite_creditoCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.REPRESENTANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelrepresentanteCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.DIAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldia_pagoCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnumero_comprobanteCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnumero_facturaCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.DIRECCIONDIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldireccion_direccionCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.TELEFONOTELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeltelefono_telefonoCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.FECHAEMISIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelfecha_emisioCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.FECHAVENCE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelfecha_venceCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.DIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldiasCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelsaldoCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.DEBITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldebito_mone_localCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.CREDITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelcredito_mone_localCobrarControlCarterasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarControlCarterasGeneralesConstantesFunciones.HORAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelhora_pagoCobrarControlCarterasGenerales,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_ciudadCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_zonaCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_vendedorCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelcodigoCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_completoCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabellimite_creditoCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelrepresentanteCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldia_pagoCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnumero_comprobanteCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnumero_facturaCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldireccion_direccionCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeltelefono_telefonoCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelfecha_emisioCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelfecha_venceCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldiasCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelsaldoCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldebito_mone_localCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelcredito_mone_localCobrarControlCarterasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelhora_pagoCobrarControlCarterasGenerales,"");
		
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
		this.iIdNuevoCobrarControlCarterasGenerales--;	
		
		
		this.cobrarcontrolcarterasgeneralesAux=new CobrarControlCarterasGenerales();
		
		this.cobrarcontrolcarterasgeneralesAux.setId(this.iIdNuevoCobrarControlCarterasGenerales);
		this.cobrarcontrolcarterasgeneralesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().add(this.cobrarcontrolcarterasgeneralesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarcontrolcarterasgeneraless.add(this.cobrarcontrolcarterasgeneralesAux);
		}
		//ARCHITECTURE
		
		this.cobrarcontrolcarterasgenerales=this.cobrarcontrolcarterasgeneralesAux;
		
		if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
		}
				
		//this.setDefaultControlesCobrarControlCarterasGenerales();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarControlCarterasGenerales();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarControlCarterasGenerales();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarControlCarterasGenerales();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesBean,this.cobrarcontrolcarterasgenerales,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesReturnGeneral,this.cobrarcontrolcarterasgeneralesBean,false);
		
		if(this.cobrarcontrolcarterasgeneralesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesReturnGeneral.getCobrarControlCarterasGenerales());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesReturnGeneral.getCobrarControlCarterasGenerales());
		}
		
		if(this.cobrarcontrolcarterasgeneralesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesReturnGeneral.getCobrarControlCarterasGenerales(),classes);//this.cobrarcontrolcarterasgeneralesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarControlCarterasGenerales();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarControlCarterasGenerales();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.RecargarFormCobrarControlCarterasGenerales(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
						
			if(cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarControlCarterasGenerales();
			}
			
			this.actualizarVisualTableDatosCobrarControlCarterasGenerales();
			
			this.jTableDatosCobrarControlCarterasGenerales.setRowSelectionInterval(this.getIndiceNuevoCobrarControlCarterasGenerales(), this.getIndiceNuevoCobrarControlCarterasGenerales());
			
			this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
						
			this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarControlCarterasGenerales(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarfecha_emision_hastaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_ciudadCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_ciudadCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnombre_zonaCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_zonaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_vendedorCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_vendedorCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcodigoCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarcodigoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_completoCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_completoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldlimite_creditoCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarlimite_creditoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextArearepresentanteCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarrepresentanteCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddia_pagoCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardia_pagoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnumero_comprobanteCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_facturaCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnumero_facturaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreadireccion_direccionCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardireccion_direccionCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activartelefono_telefonoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emisioCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarfecha_emisioCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_venceCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarfecha_venceCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddiasCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardiasCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldsaldoCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarsaldoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddebito_mone_localCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardebito_mone_localCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarcredito_mone_localCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jSpinnerhora_pagoCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarhora_pagoCobrarControlCarterasGenerales);	
		//
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.setEnabled(isHabilitar && this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarid_empresaCobrarControlCarterasGenerales);
	};
	
	public void setDefaultControlesCobrarControlCarterasGenerales() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarControlCarterasGenerales(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarcontrolcarterasgeneralesSessionBean.setConGuardarRelaciones(true);			
			this.cobrarcontrolcarterasgeneralesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTabbedPaneRelacionesCobrarControlCarterasGenerales.setVisible(true);
			
					
		} else {
			//this.cobrarcontrolcarterasgeneralesSessionBean.setConGuardarRelaciones(false);			
			this.cobrarcontrolcarterasgeneralesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTabbedPaneRelacionesCobrarControlCarterasGenerales.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarControlCarterasGenerales() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
				if(cobrarcontrolcarterasgeneralesAux.getId().equals(this.iIdNuevoCobrarControlCarterasGenerales)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneraless) {
				if(cobrarcontrolcarterasgeneralesAux.getId().equals(this.iIdNuevoCobrarControlCarterasGenerales)) {
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
	
	public int getIndiceActualCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
				if(cobrarcontrolcarterasgeneralesAux.getId().equals(cobrarcontrolcarterasgenerales.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneraless) {
				if(cobrarcontrolcarterasgeneralesAux.getId().equals(cobrarcontrolcarterasgenerales.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
				if(cobrarcontrolcarterasgeneralesAux.getCobrarControlCarterasGeneralesOriginal().getId().equals(cobrarcontrolcarterasgeneralesOriginal.getId())) {
					existe=true;
					cobrarcontrolcarterasgeneralesOriginal.setId(cobrarcontrolcarterasgeneralesAux.getId());
					cobrarcontrolcarterasgeneralesOriginal.setVersionRow(cobrarcontrolcarterasgeneralesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneraless) {
				if(cobrarcontrolcarterasgeneralesAux.getCobrarControlCarterasGeneralesOriginal().getId().equals(cobrarcontrolcarterasgeneralesOriginal.getId())) {
					existe=true;
					cobrarcontrolcarterasgeneralesOriginal.setId(cobrarcontrolcarterasgeneralesAux.getId());
					cobrarcontrolcarterasgeneralesOriginal.setVersionRow(cobrarcontrolcarterasgeneralesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarControlCarterasGenerales(Boolean esParaCancelar) throws Exception {
		cobrarcontrolcarterasgeneralessAux=new ArrayList<CobrarControlCarterasGenerales>();
		cobrarcontrolcarterasgeneralesAux=new CobrarControlCarterasGenerales();
		
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
					if(cobrarcontrolcarterasgeneralesAux.getId()<0) {
						cobrarcontrolcarterasgeneralessAux.add(cobrarcontrolcarterasgeneralesAux);
					}		
				}
				this.iIdNuevoCobrarControlCarterasGenerales=0L;
				this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().removeAll(cobrarcontrolcarterasgeneralessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneraless) {
					if(cobrarcontrolcarterasgeneralesAux.getId()<0) {
						cobrarcontrolcarterasgeneralessAux.add(cobrarcontrolcarterasgeneralesAux);
					}		
				}
				this.iIdNuevoCobrarControlCarterasGenerales=0L;
				this.cobrarcontrolcarterasgeneraless.removeAll(cobrarcontrolcarterasgeneralessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarControlCarterasGenerales 
					&& this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().size()>0
					) {
					cobrarcontrolcarterasgeneralesAux=this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().get(this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().size() - 1);
				
					if(cobrarcontrolcarterasgeneralesAux.getId()<0) {
						this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().remove(cobrarcontrolcarterasgeneralesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarControlCarterasGenerales && this.cobrarcontrolcarterasgeneraless.size()>0) {
					cobrarcontrolcarterasgeneralesAux=this.cobrarcontrolcarterasgeneraless.get(this.cobrarcontrolcarterasgeneraless.size() - 1);
				
					if(cobrarcontrolcarterasgeneralesAux.getId()<0) {
						this.cobrarcontrolcarterasgeneraless.remove(cobrarcontrolcarterasgeneralesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarControlCarterasGenerales(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarcontrolcarterasgenerales.getId()<0) {
				this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().remove(this.cobrarcontrolcarterasgenerales);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarcontrolcarterasgenerales.getId()<0) {
				this.cobrarcontrolcarterasgeneraless.remove(this.cobrarcontrolcarterasgenerales);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarControlCarterasGenerales(List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessAux) throws Exception {
		CobrarControlCarterasGeneralesConstantesFunciones.setEstadosInicialesCobrarControlCarterasGenerales(cobrarcontrolcarterasgeneralessAux);
	}
	
	public void setEstadosInicialesCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux) throws Exception {
		CobrarControlCarterasGeneralesConstantesFunciones.setEstadosInicialesCobrarControlCarterasGenerales(cobrarcontrolcarterasgeneralesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarControlCarterasGeneralesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarControlCarterasGeneralesActual()) {
				if(!this.isEsNuevoCobrarControlCarterasGenerales) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarControlCarterasGenerales=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarControlCarterasGeneralesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Control Carteras Generales ?", "MANTENIMIENTO DE Cobrar Control Carteras Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales) throws Exception {
		CobrarControlCarterasGeneralesConstantesFunciones.seleccionarAsignar(this.cobrarcontrolcarterasgenerales,cobrarcontrolcarterasgenerales);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarControlCarterasGenerales=this.isPermisoActualizarOriginalCobrarControlCarterasGenerales;
			
			
			this.seleccionarAsignar(cobrarcontrolcarterasgenerales);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarcontrolcarterasgeneralesSessionBean.setsFuncionBusquedaRapida(this.cobrarcontrolcarterasgeneralesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarControlCarterasGenerales) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarControlCarterasGenerales(esParaCancelar);				
				this.cancelarNuevoCobrarControlCarterasGenerales(esParaCancelar);								
			}
			
			this.cobrarcontrolcarterasgenerales=new CobrarControlCarterasGenerales();
			
			this.inicializarCobrarControlCarterasGenerales();
			
			this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarControlCarterasGenerales() throws Exception {
		try {
			CobrarControlCarterasGeneralesConstantesFunciones.inicializarCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarControlCarterasGeneraless(String sAccionBusqueda,List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarControlCarterasGenerales"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarControlCarterasGeneralesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarControlCarterasGeneralesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarControlCarterasGenerales"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Control Carteras Generaleses");		
		parameters.put("busquedapor", CobrarControlCarterasGeneralesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarControlCarterasGenerales=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarControlCarterasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarControlCarterasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarControlCarterasGenerales=new JRBeanArrayDataSource(CobrarControlCarterasGeneralesJInternalFrame.TraerCobrarControlCarterasGeneralesBeans(cobrarcontrolcarterasgeneralessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarControlCarterasGenerales);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarControlCarterasGeneralesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarControlCarterasGeneralesBean.TraerCobrarControlCarterasGeneralesBeans(cobrarcontrolcarterasgeneralessParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarControlCarterasGeneraless(sAccionBusqueda,sTipoArchivoReporte,cobrarcontrolcarterasgeneralessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarControlCarterasGeneraless(sAccionBusqueda,sTipoArchivoReporte,cobrarcontrolcarterasgeneralessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGeneralesActionPerformed(null);
					//this.generarExcelReporteCobrarControlCarterasGeneraless(sAccionBusqueda,sTipoArchivoReporte,cobrarcontrolcarterasgeneralessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarControlCarterasGeneraless(sAccionBusqueda,sTipoArchivoReporte,cobrarcontrolcarterasgeneralessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarControlCarterasGeneraless(sAccionBusqueda,sTipoArchivoReporte,cobrarcontrolcarterasgeneralessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarControlCarterasGeneraless(sAccionBusqueda,sTipoArchivoReporte,cobrarcontrolcarterasgeneralessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarControlCarterasGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarcontrolcarterasgenerales";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarControlCarterasGeneraless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarControlCarterasGenerales("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales : cobrarcontrolcarterasgeneralessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarControlCarterasGeneralesConstantesFunciones.generarExcelReporteDataCobrarControlCarterasGenerales("NORMAL",row,workbook,cobrarcontrolcarterasgenerales,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Control Carteras Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarControlCarterasGenerales(String sTipo,Row row,Workbook workbook) {
		
		CobrarControlCarterasGeneralesConstantesFunciones.generarExcelReporteHeaderCobrarControlCarterasGenerales(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarControlCarterasGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarcontrolcarterasgenerales_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarControlCarterasGeneraless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales : cobrarcontrolcarterasgeneralessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.getCobrarControlCarterasGeneralesDescripcion(cobrarcontrolcarterasgenerales));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_vendedor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getlimite_credito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getrepresentante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getdia_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getdireccion_direccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.gettelefono_telefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getfecha_emisio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getfecha_vence());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getdias());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getsaldo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getdebito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.getcredito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarcontrolcarterasgenerales.gethora_pago());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Control Carteras Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarControlCarterasGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessRespaldo=null;
		
		classes=CobrarControlCarterasGeneralesConstantesFunciones.getClassesRelationshipsOfCobrarControlCarterasGenerales(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarcontrolcarterasgeneralesLogic.setDatosCliente(this.datosCliente);
		this.cobrarcontrolcarterasgeneralesLogic.setDatosDeep(this.datosDeep);
		this.cobrarcontrolcarterasgeneralesLogic.setIsConDeep(true);
		
		cobrarcontrolcarterasgeneralessRespaldo=this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless();
		
		this.cobrarcontrolcarterasgeneralesLogic.setCobrarControlCarterasGeneraless(cobrarcontrolcarterasgeneralessParaReportes);	
		this.cobrarcontrolcarterasgeneralesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarcontrolcarterasgeneralessParaReportes=this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless();
		this.cobrarcontrolcarterasgeneralesLogic.setCobrarControlCarterasGeneraless(cobrarcontrolcarterasgeneralessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarcontrolcarterasgenerales_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarControlCarterasGeneraless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarControlCarterasGenerales("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales : cobrarcontrolcarterasgeneralessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarControlCarterasGenerales("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarControlCarterasGeneralesConstantesFunciones.generarExcelReporteDataCobrarControlCarterasGenerales("NORMAL",row,workbook,cobrarcontrolcarterasgenerales,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.getCobrarControlCarterasGeneralesDescripcion(cobrarcontrolcarterasgenerales));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Control Carteras Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarControlCarterasGenerales() throws Exception {		
		this.startProcessCobrarControlCarterasGenerales(true);
	}
	
	public void startProcessCobrarControlCarterasGenerales(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarControlCarterasGenerales ,this.jPanelParametrosReportesCobrarControlCarterasGenerales, this.jScrollPanelDatosCobrarControlCarterasGenerales,this.jPanelPaginacionCobrarControlCarterasGenerales, this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales, this.jPanelAccionesCobrarControlCarterasGenerales,this.jPanelAccionesFormularioCobrarControlCarterasGenerales,this.jmenuBarCobrarControlCarterasGenerales,this.jmenuBarDetalleCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,this.jTtoolBarDetalleCobrarControlCarterasGenerales);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarControlCarterasGenerales=this.jTabbedPaneBusquedasCobrarControlCarterasGenerales; 
		
		final JPanel jPanelParametrosReportesCobrarControlCarterasGenerales=this.jPanelParametrosReportesCobrarControlCarterasGenerales;
		//final JScrollPane jScrollPanelDatosCobrarControlCarterasGenerales=this.jScrollPanelDatosCobrarControlCarterasGenerales;
		final JTable jTableDatosCobrarControlCarterasGenerales=this.jTableDatosCobrarControlCarterasGenerales;		
		final JPanel jPanelPaginacionCobrarControlCarterasGenerales=this.jPanelPaginacionCobrarControlCarterasGenerales;
		//final JScrollPane jScrollPanelDatosEdicionCobrarControlCarterasGenerales=this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales;
		final JPanel jPanelAccionesCobrarControlCarterasGenerales=this.jPanelAccionesCobrarControlCarterasGenerales;
		
		JPanel jPanelCamposAuxiliarCobrarControlCarterasGenerales=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarControlCarterasGenerales=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			jPanelCamposAuxiliarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelCamposCobrarControlCarterasGenerales;
			jPanelAccionesFormularioAuxiliarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelAccionesFormularioCobrarControlCarterasGenerales;
		}
		
		final JPanel jPanelCamposCobrarControlCarterasGenerales=jPanelCamposAuxiliarCobrarControlCarterasGenerales;
		final JPanel jPanelAccionesFormularioCobrarControlCarterasGenerales=jPanelAccionesFormularioAuxiliarCobrarControlCarterasGenerales;
		
		
		final JMenuBar jmenuBarCobrarControlCarterasGenerales=this.jmenuBarCobrarControlCarterasGenerales;
		final JToolBar jTtoolBarCobrarControlCarterasGenerales=this.jTtoolBarCobrarControlCarterasGenerales;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarControlCarterasGenerales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarControlCarterasGenerales=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			jmenuBarDetalleAuxiliarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jmenuBarDetalleCobrarControlCarterasGenerales;
			jTtoolBarDetalleAuxiliarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTtoolBarDetalleCobrarControlCarterasGenerales;
		}
		
		final JMenuBar jmenuBarDetalleCobrarControlCarterasGenerales=jmenuBarDetalleAuxiliarCobrarControlCarterasGenerales;
		final JToolBar jTtoolBarDetalleCobrarControlCarterasGenerales=jTtoolBarDetalleAuxiliarCobrarControlCarterasGenerales;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarControlCarterasGenerales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarControlCarterasGenerales;
			processRunnable.jTableDatos=jTableDatosCobrarControlCarterasGenerales;
			processRunnable.jPanelCampos=jPanelCamposCobrarControlCarterasGenerales;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarControlCarterasGenerales;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarControlCarterasGenerales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarControlCarterasGenerales;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarControlCarterasGenerales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarControlCarterasGenerales;
			processRunnable.jTtoolBar=jTtoolBarCobrarControlCarterasGenerales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarControlCarterasGenerales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarControlCarterasGenerales ,jPanelParametrosReportesCobrarControlCarterasGenerales,jTableDatosCobrarControlCarterasGenerales, /*jScrollPanelDatosCobrarControlCarterasGenerales,*/jPanelCamposCobrarControlCarterasGenerales,jPanelPaginacionCobrarControlCarterasGenerales, /*jScrollPanelDatosEdicionCobrarControlCarterasGenerales,*/ jPanelAccionesCobrarControlCarterasGenerales,jPanelAccionesFormularioCobrarControlCarterasGenerales,jmenuBarCobrarControlCarterasGenerales,jmenuBarDetalleCobrarControlCarterasGenerales,jTtoolBarCobrarControlCarterasGenerales,jTtoolBarDetalleCobrarControlCarterasGenerales);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarControlCarterasGenerales ,jPanelParametrosReportesCobrarControlCarterasGenerales, jScrollPanelDatosCobrarControlCarterasGenerales,jPanelPaginacionCobrarControlCarterasGenerales, jScrollPanelDatosEdicionCobrarControlCarterasGenerales, jPanelAccionesCobrarControlCarterasGenerales,jPanelAccionesFormularioCobrarControlCarterasGenerales,jmenuBarCobrarControlCarterasGenerales,jmenuBarDetalleCobrarControlCarterasGenerales,jTtoolBarCobrarControlCarterasGenerales,jTtoolBarDetalleCobrarControlCarterasGenerales);
						
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
	
	public void finishProcessCobrarControlCarterasGenerales() {// throws Exception 
		this.finishProcessCobrarControlCarterasGenerales(true);
	}
	
	public void finishProcessCobrarControlCarterasGenerales(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarControlCarterasGenerales ,this.jPanelParametrosReportesCobrarControlCarterasGenerales, this.jScrollPanelDatosCobrarControlCarterasGenerales,this.jPanelPaginacionCobrarControlCarterasGenerales, this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales, this.jPanelAccionesCobrarControlCarterasGenerales,this.jPanelAccionesFormularioCobrarControlCarterasGenerales,this.jmenuBarCobrarControlCarterasGenerales,this.jmenuBarDetalleCobrarControlCarterasGenerales,this.jTtoolBarCobrarControlCarterasGenerales,this.jTtoolBarDetalleCobrarControlCarterasGenerales);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarControlCarterasGenerales=this.jTabbedPaneBusquedasCobrarControlCarterasGenerales; 
		
		final JPanel jPanelParametrosReportesCobrarControlCarterasGenerales=this.jPanelParametrosReportesCobrarControlCarterasGenerales;
		//final JScrollPane jScrollPanelDatosCobrarControlCarterasGenerales=this.jScrollPanelDatosCobrarControlCarterasGenerales;
		final JTable jTableDatosCobrarControlCarterasGenerales=this.jTableDatosCobrarControlCarterasGenerales;		
		final JPanel jPanelPaginacionCobrarControlCarterasGenerales=this.jPanelPaginacionCobrarControlCarterasGenerales;
		//final JScrollPane jScrollPanelDatosEdicionCobrarControlCarterasGenerales=this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales;
		final JPanel jPanelAccionesCobrarControlCarterasGenerales=this.jPanelAccionesCobrarControlCarterasGenerales;
		
		JPanel jPanelCamposAuxiliarCobrarControlCarterasGenerales=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarControlCarterasGenerales=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			jPanelCamposAuxiliarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelCamposCobrarControlCarterasGenerales;
			jPanelAccionesFormularioAuxiliarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelAccionesFormularioCobrarControlCarterasGenerales;
		}
		
		final JPanel jPanelCamposCobrarControlCarterasGenerales=jPanelCamposAuxiliarCobrarControlCarterasGenerales;
		final JPanel jPanelAccionesFormularioCobrarControlCarterasGenerales=jPanelAccionesFormularioAuxiliarCobrarControlCarterasGenerales;
		
		
		final JMenuBar jmenuBarCobrarControlCarterasGenerales=this.jmenuBarCobrarControlCarterasGenerales;		
		final JToolBar jTtoolBarCobrarControlCarterasGenerales=this.jTtoolBarCobrarControlCarterasGenerales;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarControlCarterasGenerales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarControlCarterasGenerales=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			jmenuBarDetalleAuxiliarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jmenuBarDetalleCobrarControlCarterasGenerales;
			jTtoolBarDetalleAuxiliarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTtoolBarDetalleCobrarControlCarterasGenerales;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarControlCarterasGenerales=jmenuBarDetalleAuxiliarCobrarControlCarterasGenerales;
		final JToolBar jTtoolBarDetalleCobrarControlCarterasGenerales=jTtoolBarDetalleAuxiliarCobrarControlCarterasGenerales;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarControlCarterasGenerales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarControlCarterasGenerales;
			processRunnable.jTableDatos=jTableDatosCobrarControlCarterasGenerales;
			processRunnable.jPanelCampos=jPanelCamposCobrarControlCarterasGenerales;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarControlCarterasGenerales;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarControlCarterasGenerales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarControlCarterasGenerales;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarControlCarterasGenerales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarControlCarterasGenerales;
			processRunnable.jTtoolBar=jTtoolBarCobrarControlCarterasGenerales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarControlCarterasGenerales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarControlCarterasGenerales ,jPanelParametrosReportesCobrarControlCarterasGenerales, jTableDatosCobrarControlCarterasGenerales,/*jScrollPanelDatosCobrarControlCarterasGenerales,*/jPanelCamposCobrarControlCarterasGenerales,jPanelPaginacionCobrarControlCarterasGenerales, /*jScrollPanelDatosEdicionCobrarControlCarterasGenerales,*/ jPanelAccionesCobrarControlCarterasGenerales,jPanelAccionesFormularioCobrarControlCarterasGenerales,jmenuBarCobrarControlCarterasGenerales,jmenuBarDetalleCobrarControlCarterasGenerales,jTtoolBarCobrarControlCarterasGenerales,jTtoolBarDetalleCobrarControlCarterasGenerales));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarControlCarterasGenerales(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarControlCarterasGenerales(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarControlCarterasGenerales(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarControlCarterasGenerales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarControlCarterasGenerales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarControlCarterasGenerales,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarControlCarterasGenerales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarControlCarterasGenerales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarControlCarterasGenerales,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarcontrolcarterasgeneralesConstantesFunciones.getsFinalQueryCobrarControlCarterasGenerales();
		String  finalQueryPaginacionTodos=this.cobrarcontrolcarterasgeneralesConstantesFunciones.getsFinalQueryCobrarControlCarterasGenerales();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarControlCarterasGeneralesConstantesFunciones.getArrayColumnasGlobalesNoCobrarControlCarterasGenerales(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarControlCarterasGeneralesConstantesFunciones.getArrayColumnasGlobalesCobrarControlCarterasGenerales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarControlCarterasGeneralesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarcontrolcarterasgeneralessEliminados= new ArrayList<CobrarControlCarterasGenerales>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarControlCarterasGenerales();
		
				///*CobrarControlCarterasGeneralesSessionBean*/this.cobrarcontrolcarterasgeneralesSessionBean=new CobrarControlCarterasGeneralesSessionBean();
			
			if(this.cobrarcontrolcarterasgeneralesSessionBean==null) {
				this.cobrarcontrolcarterasgeneralesSessionBean=new CobrarControlCarterasGeneralesSessionBean();
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
					this.iNumeroPaginacion=CobrarControlCarterasGeneralesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarControlCarterasGeneralesConstantesFunciones.getClassesForeignKeysOfCobrarControlCarterasGenerales(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarcontrolcarterasgenerales."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarcontrolcarterasgeneralessAux= new ArrayList<CobrarControlCarterasGenerales>();
			
				
			cobrarcontrolcarterasgeneralesLogic.setDatosCliente(this.datosCliente);
			cobrarcontrolcarterasgeneralesLogic.setDatosDeep(this.datosDeep);
			cobrarcontrolcarterasgeneralesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarControlCarterasGenerales")) {
				this.sDetalleReporte=CobrarControlCarterasGeneralesConstantesFunciones.getDetalleIndiceBusquedaCobrarControlCarterasGenerales(fecha_emision_hastaBusquedaCobrarControlCarterasGenerales);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneralessBusquedaCobrarControlCarterasGenerales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_hastaBusquedaCobrarControlCarterasGenerales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarControlCarterasGeneralesConstantesFunciones.getDetalleIndiceBusquedaCobrarControlCarterasGenerales(fecha_emision_hastaBusquedaCobrarControlCarterasGenerales);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarControlCarterasGeneralesConstantesFunciones.getDetalleIndiceBusquedaCobrarControlCarterasGenerales(fecha_emision_hastaBusquedaCobrarControlCarterasGenerales);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()==null||cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarcontrolcarterasgeneraless==null|| cobrarcontrolcarterasgeneraless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarcontrolcarterasgeneralessAux=new ArrayList<CobrarControlCarterasGenerales>();
						cobrarcontrolcarterasgeneralessAux.addAll(cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarcontrolcarterasgeneralessAux=new ArrayList<CobrarControlCarterasGenerales>();
							cobrarcontrolcarterasgeneralessAux.addAll(cobrarcontrolcarterasgeneraless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneralessBusquedaCobrarControlCarterasGenerales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_hastaBusquedaCobrarControlCarterasGenerales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarControlCarterasGeneralesConstantesFunciones.getDetalleIndiceBusquedaCobrarControlCarterasGenerales(fecha_emision_hastaBusquedaCobrarControlCarterasGenerales);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarControlCarterasGeneralesConstantesFunciones.getDetalleIndiceBusquedaCobrarControlCarterasGenerales(fecha_emision_hastaBusquedaCobrarControlCarterasGenerales);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarControlCarterasGeneraless("BusquedaCobrarControlCarterasGenerales",cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarControlCarterasGeneraless("BusquedaCobrarControlCarterasGenerales",cobrarcontrolcarterasgeneraless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarcontrolcarterasgeneralesLogic.setCobrarControlCarterasGeneraless(new ArrayList<CobrarControlCarterasGenerales>());
						cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().addAll(cobrarcontrolcarterasgeneralessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarcontrolcarterasgeneraless=new ArrayList<CobrarControlCarterasGenerales>();
							cobrarcontrolcarterasgeneraless.addAll(cobrarcontrolcarterasgeneralessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarControlCarterasGenerales();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarControlCarterasGenerales();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarcontrolcarterasgeneraless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarcontrolcarterasgeneraless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales) {
		Boolean permite=true;
		
		if(this.cobrarcontrolcarterasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarControlCarterasGeneralesConstantesFunciones.getOrderByListaCobrarControlCarterasGenerales();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarControlCarterasGeneralesConstantesFunciones.getOrderByListaCobrarControlCarterasGenerales();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
				if(cobrarcontrolcarterasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarcontrolcarterasgeneralesTotales=cobrarcontrolcarterasgenerales;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:this.cobrarcontrolcarterasgeneraless) {
				if(cobrarcontrolcarterasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarcontrolcarterasgeneralesTotales=cobrarcontrolcarterasgenerales;
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
			this.cobrarcontrolcarterasgeneralesAux=new CobrarControlCarterasGenerales();
			this.cobrarcontrolcarterasgeneralesAux.setsType(Constantes2.S_TOTALES);
			this.cobrarcontrolcarterasgeneralesAux.setIsNew(false);
			this.cobrarcontrolcarterasgeneralesAux.setIsChanged(false);
			this.cobrarcontrolcarterasgeneralesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarControlCarterasGeneralesConstantesFunciones.TotalizarValoresFilaCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless(),this.cobrarcontrolcarterasgeneralesAux);
				
				//this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().add(this.cobrarcontrolcarterasgeneralesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarControlCarterasGeneralesConstantesFunciones.TotalizarValoresFilaCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneraless,this.cobrarcontrolcarterasgeneralesAux);
				
				this.cobrarcontrolcarterasgeneraless.add(this.cobrarcontrolcarterasgeneralesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarcontrolcarterasgeneralesTotales=new CobrarControlCarterasGenerales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().remove(cobrarcontrolcarterasgeneralesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarcontrolcarterasgeneraless.remove(cobrarcontrolcarterasgeneralesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarcontrolcarterasgeneralesTotales=new CobrarControlCarterasGenerales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
				if(cobrarcontrolcarterasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarcontrolcarterasgeneralesTotales=cobrarcontrolcarterasgenerales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarControlCarterasGeneralesConstantesFunciones.TotalizarValoresFilaCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless(),cobrarcontrolcarterasgeneralesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:this.cobrarcontrolcarterasgeneraless) {
				if(cobrarcontrolcarterasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarcontrolcarterasgeneralesTotales=cobrarcontrolcarterasgenerales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarControlCarterasGeneralesConstantesFunciones.TotalizarValoresFilaCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneraless,cobrarcontrolcarterasgeneralesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarControlCarterasGeneralessBusquedaCobrarControlCarterasGenerales()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarControlCarterasGenerales";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarControlCarterasGeneralessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarControlCarterasGeneralessBusquedaCobrarControlCarterasGenerales(String sFinalQuery,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneralessBusquedaCobrarControlCarterasGenerales(sFinalQuery,this.pagination,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarControlCarterasGeneralessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneralessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosCobrarControlCarterasGenerales() {
		this.isPermisoTodoCobrarControlCarterasGenerales=false;
		this.isPermisoNuevoCobrarControlCarterasGenerales=false;
		this.isPermisoActualizarCobrarControlCarterasGenerales=false;
		this.isPermisoActualizarOriginalCobrarControlCarterasGenerales=false;
		this.isPermisoEliminarCobrarControlCarterasGenerales=false;
		this.isPermisoGuardarCambiosCobrarControlCarterasGenerales=false;
		this.isPermisoConsultaCobrarControlCarterasGenerales=true;
		this.isPermisoBusquedaCobrarControlCarterasGenerales=true;
		this.isPermisoReporteCobrarControlCarterasGenerales=true;
		this.isPermisoOrdenCobrarControlCarterasGenerales=false;		
		this.isPermisoPaginacionMedioCobrarControlCarterasGenerales=false;		
		this.isPermisoPaginacionAltoCobrarControlCarterasGenerales=false;		
		this.isPermisoPaginacionTodoCobrarControlCarterasGenerales=false;		
		this.isPermisoCopiarCobrarControlCarterasGenerales=false;		
		this.isPermisoVerFormCobrarControlCarterasGenerales=false;		
		this.isPermisoDuplicarCobrarControlCarterasGenerales=false;
		this.isPermisoOrdenCobrarControlCarterasGenerales=false;
	}
	
	public void setPermisosUsuarioCobrarControlCarterasGenerales(Boolean isPermiso) {
		this.isPermisoTodoCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoNuevoCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoActualizarCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoActualizarOriginalCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoEliminarCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoGuardarCambiosCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoConsultaCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoBusquedaCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoReporteCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoOrdenCobrarControlCarterasGenerales=isPermiso;		
		this.isPermisoPaginacionMedioCobrarControlCarterasGenerales=isPermiso;		
		this.isPermisoPaginacionAltoCobrarControlCarterasGenerales=isPermiso;		
		this.isPermisoPaginacionTodoCobrarControlCarterasGenerales=isPermiso;		
		this.isPermisoCopiarCobrarControlCarterasGenerales=isPermiso;		
		this.isPermisoVerFormCobrarControlCarterasGenerales=isPermiso;		
		this.isPermisoDuplicarCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoOrdenCobrarControlCarterasGenerales=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarControlCarterasGenerales(Boolean isPermiso) {
		//this.isPermisoTodoCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoNuevoCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoActualizarCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoActualizarOriginalCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoEliminarCobrarControlCarterasGenerales=isPermiso;
		this.isPermisoGuardarCambiosCobrarControlCarterasGenerales=isPermiso;
		//this.isPermisoConsultaCobrarControlCarterasGenerales=isPermiso;
		//this.isPermisoBusquedaCobrarControlCarterasGenerales=isPermiso;
		//this.isPermisoReporteCobrarControlCarterasGenerales=isPermiso;
		//this.isPermisoOrdenCobrarControlCarterasGenerales=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarControlCarterasGenerales=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarControlCarterasGenerales=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarControlCarterasGenerales=isPermiso;		
		//this.isPermisoCopiarCobrarControlCarterasGenerales=isPermiso;		
		//this.isPermisoDuplicarCobrarControlCarterasGenerales=isPermiso;
		//this.isPermisoOrdenCobrarControlCarterasGenerales=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarControlCarterasGeneralesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarControlCarterasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarControlCarterasGenerales(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarControlCarterasGeneralesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarControlCarterasGeneralesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarControlCarterasGeneralesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarControlCarterasGeneralesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarControlCarterasGenerales() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarControlCarterasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarControlCarterasGeneralesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarControlCarterasGenerales=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarControlCarterasGenerales=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarControlCarterasGenerales=this.isPermisoActualizarCobrarControlCarterasGenerales;
			this.isPermisoEliminarCobrarControlCarterasGenerales=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarControlCarterasGenerales=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarControlCarterasGenerales=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarControlCarterasGenerales=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarControlCarterasGenerales=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarControlCarterasGenerales=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarControlCarterasGenerales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarControlCarterasGenerales=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarControlCarterasGenerales=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarControlCarterasGenerales=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarControlCarterasGenerales=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarControlCarterasGenerales=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarControlCarterasGenerales=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarControlCarterasGenerales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarControlCarterasGenerales.setToolTipText(this.jTableDatosCobrarControlCarterasGenerales.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarControlCarterasGenerales(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarControlCarterasGenerales(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarControlCarterasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarControlCarterasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarControlCarterasGenerales() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarControlCarterasGeneralesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarControlCarterasGeneralesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarControlCarterasGeneralesJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarControlCarterasGenerales()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarcontrolcarterasgeneralesSessionBean==null) {
				this.cobrarcontrolcarterasgeneralesSessionBean=new CobrarControlCarterasGeneralesSessionBean();
			}

			if(!this.cobrarcontrolcarterasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyCobrarControlCarterasGenerales()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarControlCarterasGenerales(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarControlCarterasGenerales()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarControlCarterasGenerales();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarControlCarterasGenerales()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarControlCarterasGenerales()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarControlCarterasGenerales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarControlCarterasGenerales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarControlCarterasGenerales()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarControlCarterasGenerales()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarControlCarterasGenerales(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarControlCarterasGenerales()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public CobrarControlCarterasGeneralesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarControlCarterasGeneralesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarControlCarterasGeneralesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarcontrolcarterasgeneralesSessionBean=new CobrarControlCarterasGeneralesSessionBean(); 
		this.cobrarcontrolcarterasgeneralesConstantesFunciones=new CobrarControlCarterasGeneralesConstantesFunciones(); 
		this.cobrarcontrolcarterasgeneralesBean=new CobrarControlCarterasGenerales();//(this.cobrarcontrolcarterasgeneralesConstantesFunciones); 		
		this.cobrarcontrolcarterasgeneralesReturnGeneral=new CobrarControlCarterasGeneralesParameterReturnGeneral(); 
		
		this.cobrarcontrolcarterasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarcontrolcarterasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarControlCarterasGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarControlCarterasGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarControlCarterasGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarControlCarterasGenerales(true);
			
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
			
			this.cobrarcontrolcarterasgeneralesConstantesFunciones=new CobrarControlCarterasGeneralesConstantesFunciones(); 
			this.cobrarcontrolcarterasgeneralesBean=new CobrarControlCarterasGenerales();//this.cobrarcontrolcarterasgeneralesConstantesFunciones); 			
			this.cobrarcontrolcarterasgeneralesReturnGeneral=new CobrarControlCarterasGeneralesParameterReturnGeneral(); 
		
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Control Carteras Generales Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cobrarcontrolcarterasgenerales=new CobrarControlCarterasGenerales();
			this.cobrarcontrolcarterasgeneraless = new ArrayList<CobrarControlCarterasGenerales>();
			this.cobrarcontrolcarterasgeneralessAux = new ArrayList<CobrarControlCarterasGenerales>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic=new CobrarControlCarterasGeneralesLogic();
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarcontrolcarterasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarcontrolcarterasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales);	
					}
					
					if(this.jInternalFrameImportacionCobrarControlCarterasGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarControlCarterasGenerales);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarControlCarterasGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarControlCarterasGenerales);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales);
				this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setVisible(false);
				this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales);
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarControlCarterasGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarControlCarterasGenerales);
					this.jInternalFrameImportacionCobrarControlCarterasGenerales.setVisible(false);
					this.jInternalFrameImportacionCobrarControlCarterasGenerales.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarControlCarterasGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarControlCarterasGenerales);
					this.jInternalFrameOrderByCobrarControlCarterasGenerales.setVisible(false);
					this.jInternalFrameOrderByCobrarControlCarterasGenerales.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarControlCarterasGeneralesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarControlCarterasGeneralesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarcontrolcarterasgeneralesReturnGeneral=new CobrarControlCarterasGeneralesParameterReturnGeneral();
			
			this.cobrarcontrolcarterasgeneralesParameterGeneral=new CobrarControlCarterasGeneralesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarcontrolcarterasgeneralesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarControlCarterasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarControlCarterasGeneralesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado(),this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarControlCarterasGeneralesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado(),this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaCopiarCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaVerFormCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaOrdenCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=false;
			
			
			this.isVisibilidadBusquedaCobrarControlCarterasGenerales=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarControlCarterasGenerales();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarControlCarterasGenerales(false);
			
			this.setPermisosUsuarioCobrarControlCarterasGenerales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() && this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarControlCarterasGeneralesClasesRelacionadas();
			}
			
			if(this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarControlCarterasGeneralesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarControlCarterasGenerales();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarControlCarterasGenerales();
			}
			
			if(!this.isPermisoBusquedaCobrarControlCarterasGenerales) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarControlCarterasGeneralesConstantesFunciones.getTiposSeleccionarCobrarControlCarterasGenerales());
				
				this.tiposColumnasSelect=CobrarControlCarterasGeneralesConstantesFunciones.getTiposSeleccionarCobrarControlCarterasGenerales(true);
				
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
			//if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarControlCarterasGenerales();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCobrarControlCarterasGenerales(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCobrarControlCarterasGenerales(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarControlCarterasGenerales() ;
			
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
				cobrarcontrolcarterasgeneralesImplementable= (CobrarControlCarterasGeneralesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarControlCarterasGeneralesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarcontrolcarterasgeneralesImplementableHome= (CobrarControlCarterasGeneralesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarControlCarterasGeneralesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarcontrolcarterasgeneraless= new ArrayList<CobrarControlCarterasGenerales>();
			this.cobrarcontrolcarterasgeneralessEliminados= new ArrayList<CobrarControlCarterasGenerales>();
						
			this.isEsNuevoCobrarControlCarterasGenerales=false;
			this.esParaAccionDesdeFormularioCobrarControlCarterasGenerales=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarControlCarterasGenerales(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarControlCarterasGenerales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarControlCarterasGeneralesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarControlCarterasGenerales();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarControlCarterasGenerales();
			}
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarControlCarterasGenerales(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarControlCarterasGenerales: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarControlCarterasGenerales() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarControlCarterasGenerales")) {
				iIndex=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTabbedPaneRelacionesCobrarControlCarterasGenerales.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTabbedPaneRelacionesCobrarControlCarterasGenerales.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarControlCarterasGenerales();	
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
	
	public void cargarCombosForeignKeyCobrarControlCarterasGenerales(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarControlCarterasGenerales(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarControlCarterasGenerales(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarControlCarterasGeneralesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarControlCarterasGenerales();
		
		this.cargarCombosFrameForeignKeyCobrarControlCarterasGenerales();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarControlCarterasGenerales();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarControlCarterasGenerales();
		}
	}
	
	
	
	public void jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
			
			if(jTableDatosCobrarControlCarterasGenerales.getRowCount()>=1) {
				jTableDatosCobrarControlCarterasGenerales.removeRowSelectionInterval(0, jTableDatosCobrarControlCarterasGenerales.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarControlCarterasGenerales=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarControlCarterasGenerales(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarControlCarterasGenerales(true);			
			//this.cobrarcontrolcarterasgenerales=new CobrarControlCarterasGenerales();
			//this.cobrarcontrolcarterasgenerales.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarControlCarterasGenerales(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarControlCarterasGenerales() ;
			
			if(CobrarControlCarterasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarControlCarterasGenerales(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarcontrolcarterasgenerales);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);				
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
			if(this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarControlCarterasGenerales: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarControlCarterasGenerales.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarControlCarterasGenerales.getSelectedRows().length;			
			}
			
			cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarControlCarterasGenerales--;			
				//CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux= new CobrarControlCarterasGenerales();			
				//cobrarcontrolcarterasgeneralesAux.setId(this.iIdNuevoCobrarControlCarterasGenerales);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesOrigen=new CobrarControlCarterasGenerales();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesOrigen : cobrarcontrolcarterasgeneralessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarcontrolcarterasgeneralesOrigen =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarcontrolcarterasgeneralesOrigen =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarControlCarterasGenerales();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarcontrolcarterasgenerales.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarControlCarterasGenerales(cobrarcontrolcarterasgeneralesOrigen,this.cobrarcontrolcarterasgenerales,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().add(this.cobrarcontrolcarterasgeneralesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgeneraless.add(this.cobrarcontrolcarterasgeneralesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
				
				this.jTableDatosCobrarControlCarterasGenerales.setRowSelectionInterval(this.getIndiceNuevoCobrarControlCarterasGenerales(), this.getIndiceNuevoCobrarControlCarterasGenerales());
				
				int iLastRow =  this.jTableDatosCobrarControlCarterasGenerales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarControlCarterasGenerales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarControlCarterasGenerales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();									
		
			CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesOrigen=new CobrarControlCarterasGenerales();
			CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesDestino=new CobrarControlCarterasGenerales();
				
			cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarControlCarterasGenerales.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarcontrolcarterasgeneralessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarControlCarterasGenerales.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarcontrolcarterasgeneralesOrigen =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarcontrolcarterasgeneralesOrigen =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarcontrolcarterasgeneralesDestino =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarcontrolcarterasgeneralesDestino =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarcontrolcarterasgeneralesOrigen =cobrarcontrolcarterasgeneralessSeleccionados.get(0);
				cobrarcontrolcarterasgeneralesDestino =cobrarcontrolcarterasgeneralessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarControlCarterasGenerales(cobrarcontrolcarterasgeneralesOrigen,cobrarcontrolcarterasgeneralesDestino,true,false);
				
				cobrarcontrolcarterasgeneralesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarcontrolcarterasgeneralesDestino,cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarcontrolcarterasgeneralesDestino,cobrarcontrolcarterasgeneraless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
				
				//this.jTableDatosCobrarControlCarterasGenerales.setRowSelectionInterval(this.getIndiceNuevoCobrarControlCarterasGenerales(), this.getIndiceNuevoCobrarControlCarterasGenerales());
				
				int iLastRow =  this.jTableDatosCobrarControlCarterasGenerales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarControlCarterasGenerales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarControlCarterasGenerales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarControlCarterasGenerales.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarControlCarterasGenerales.setVisible(!isVisible);
			this.jPanelPaginacionCobrarControlCarterasGenerales.setVisible(!isVisible);
			this.jPanelAccionesCobrarControlCarterasGenerales.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarControlCarterasGenerales();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarControlCarterasGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarControlCarterasGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarControlCarterasGenerales();
			
			this.abrirFrameOrderByCobrarControlCarterasGenerales();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarControlCarterasGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarControlCarterasGenerales(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarControlCarterasGenerales);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setSize(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.iWidthFormulario,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jContentPaneDetalleCobrarControlCarterasGenerales.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTabbedPaneRelacionesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jContentPaneDetalleCobrarControlCarterasGenerales.getWidth(),CobrarControlCarterasGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTabbedPaneRelacionesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jContentPaneDetalleCobrarControlCarterasGenerales.getWidth(),CobrarControlCarterasGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTabbedPaneRelacionesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jContentPaneDetalleCobrarControlCarterasGenerales.getWidth(),CobrarControlCarterasGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarControlCarterasGenerales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarControlCarterasGenerales==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarControlCarterasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarControlCarterasGenerales,false,this);
				} else {
					this.jInternalFrameOrderByCobrarControlCarterasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarControlCarterasGenerales,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarControlCarterasGenerales);
				this.jInternalFrameOrderByCobrarControlCarterasGenerales.setVisible(false);
				this.jInternalFrameOrderByCobrarControlCarterasGenerales.setSelected(false);
				
				this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarControlCarterasGenerales"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarControlCarterasGenerales();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarControlCarterasGenerales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarControlCarterasGenerales==null) {
				
				this.jInternalFrameImportacionCobrarControlCarterasGenerales=new ImportacionJInternalFrame(CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarControlCarterasGenerales);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarControlCarterasGenerales);
				this.jInternalFrameImportacionCobrarControlCarterasGenerales.setVisible(false);
				this.jInternalFrameImportacionCobrarControlCarterasGenerales.setSelected(false);


				this.jInternalFrameImportacionCobrarControlCarterasGenerales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarControlCarterasGenerales"));
				this.jInternalFrameImportacionCobrarControlCarterasGenerales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarControlCarterasGenerales"));
				this.jInternalFrameImportacionCobrarControlCarterasGenerales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarControlCarterasGenerales"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarControlCarterasGenerales() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales==null) {
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales=new ReporteDinamicoJInternalFrame(CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales);
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarControlCarterasGenerales"));
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarControlCarterasGenerales"));
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarControlCarterasGenerales"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarControlCarterasGenerales();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarControlCarterasGenerales() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarControlCarterasGenerales);
			
	       	this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.dispose();
			//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarControlCarterasGenerales() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarControlCarterasGenerales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarControlCarterasGenerales.setVisible(true);
	        this.jInternalFrameImportacionCobrarControlCarterasGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarControlCarterasGenerales() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setVisible(true);
	        this.jInternalFrameOrderByCobrarControlCarterasGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarControlCarterasGenerales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarControlCarterasGenerales.setVisible(false);
	        this.jInternalFrameOrderByCobrarControlCarterasGenerales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarControlCarterasGenerales() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarControlCarterasGenerales() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarControlCarterasGenerales.setVisible(false);
	        this.jInternalFrameImportacionCobrarControlCarterasGenerales.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarControlCarterasGenerales(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarControlCarterasGenerales(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarControlCarterasGenerales(true);
			//this.isEsNuevoCobrarControlCarterasGenerales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarControlCarterasGenerales(false) ;
			
			if(cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarControlCarterasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarControlCarterasGenerales(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarControlCarterasGenerales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarControlCarterasGeneralesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarControlCarterasGenerales(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarControlCarterasGenerales(true);
			//this.isEsNuevoCobrarControlCarterasGenerales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarcontrolcarterasgenerales.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarControlCarterasGenerales(false) ;
			
			if(CobrarControlCarterasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarControlCarterasGenerales(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarControlCarterasGenerales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarControlCarterasGenerales(false);
			
			//if(!this.isEsNuevoCobrarControlCarterasGenerales) {								
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarcontrolcarterasgenerales)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarControlCarterasGenerales=true;
					this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
					this.isEsNuevoCobrarControlCarterasGenerales=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarControlCarterasGenerales=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarControlCarterasGenerales=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarControlCarterasGenerales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarControlCarterasGenerales(false);
				
				this.habilitarDeshabilitarControlesCobrarControlCarterasGenerales(false);
			
												
				
				if(CobrarControlCarterasGeneralesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarControlCarterasGenerales();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarControlCarterasGenerales.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarcontrolcarterasgenerales.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				this.cobrarcontrolcarterasgenerales.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				this.cobrarcontrolcarterasgenerales.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarcontrolcarterasgenerales)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarControlCarterasGeneralesModel) this.jTableDatosCobrarControlCarterasGenerales.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarControlCarterasGenerales=true;
				this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
				this.isEsNuevoCobrarControlCarterasGenerales=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarControlCarterasGenerales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarControlCarterasGenerales(false);
				
				this.habilitarDeshabilitarControlesCobrarControlCarterasGenerales(false);
				
				
				
				if(CobrarControlCarterasGeneralesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarControlCarterasGenerales();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarControlCarterasGenerales.getRowCount()>=1) {
				jTableDatosCobrarControlCarterasGenerales.removeRowSelectionInterval(0, jTableDatosCobrarControlCarterasGenerales.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarControlCarterasGenerales(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarControlCarterasGenerales(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarControlCarterasGenerales(false) ;
			
			this.isEsNuevoCobrarControlCarterasGenerales=false;
			
			if(CobrarControlCarterasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarControlCarterasGenerales();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				
				//SI ES MANUAL
				if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarControlCarterasGenerales();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarControlCarterasGenerales--;			
			//CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux= new CobrarControlCarterasGenerales();			
			//cobrarcontrolcarterasgeneralesAux.setId(this.iIdNuevoCobrarControlCarterasGenerales);
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarControlCarterasGenerales();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
			
			this.cobrarcontrolcarterasgenerales.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().add(this.cobrarcontrolcarterasgeneralesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarcontrolcarterasgeneraless.add(this.cobrarcontrolcarterasgeneralesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
			
			this.jTableDatosCobrarControlCarterasGenerales.setRowSelectionInterval(this.getIndiceNuevoCobrarControlCarterasGenerales(), this.getIndiceNuevoCobrarControlCarterasGenerales());
			
			int iLastRow =  this.jTableDatosCobrarControlCarterasGenerales.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarControlCarterasGenerales.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarControlCarterasGenerales.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
			
			//SI ES MANUAL
			if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarControlCarterasGenerales();
			}
			
			//this.abrirFrameTreeCobrarControlCarterasGenerales();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarControlCarterasGenerales.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarControlCarterasGenerales.setFileImportacion(this.jInternalFrameImportacionCobrarControlCarterasGenerales.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarControlCarterasGenerales.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarControlCarterasGenerales.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarControlCarterasGenerales.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarControlCarterasGenerales.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();		

		cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarControlCarterasGeneralesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarControlCarterasGeneralesBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarControlCarterasGeneraless("Todos",cobrarcontrolcarterasgeneralessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Control Carteras Generales",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreVendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreVendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreVendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreVendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_miteCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_miteCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_miteCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_miteCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_presentante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_presentante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_presentante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_presentante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionDireccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionDireccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionDireccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionDireccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoTelefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoTelefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoTelefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoTelefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmisio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmisio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmisio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmisio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVence_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVence_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVence_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVence_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_as_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_as_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_as_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_as_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raPago_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoria="nombre_vendedor";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO:
					sNombreCampoCategoria="limite_credito";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE:
					sNombreCampoCategoria="representante";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO:
					sNombreCampoCategoria="dia_pago";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoria="direccion_direccion";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoria="telefono_telefono";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO:
					sNombreCampoCategoria="fecha_emisio";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoria="fecha_vence";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS:
					sNombreCampoCategoria="dias";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoria="debito_mone_local";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoria="credito_mone_local";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO:
					sNombreCampoCategoria="hora_pago";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoriaValor="nombre_vendedor";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO:
					sNombreCampoCategoriaValor="limite_credito";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE:
					sNombreCampoCategoriaValor="representante";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO:
					sNombreCampoCategoriaValor="dia_pago";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoriaValor="direccion_direccion";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoriaValor="telefono_telefono";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO:
					sNombreCampoCategoriaValor="fecha_emisio";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoriaValor="fecha_vence";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS:
					sNombreCampoCategoriaValor="dias";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoriaValor="debito_mone_local";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoriaValor="credito_mone_local";
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO:
					sNombreCampoCategoriaValor="hora_pago";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_vendedor");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Limite Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"limite_credito");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Representante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"representante");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_pago");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_direccion");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_telefono");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emisio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emisio");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vence",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vence");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dias");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_local");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_local");
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_pago");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();		
		
		cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarcontrolcarterasgenerales";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarControlCarterasGeneraless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_vendedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getlimite_credito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getrepresentante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getdia_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getdireccion_direccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.gettelefono_telefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getfecha_emisio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getfecha_vence());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getdias());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getsaldo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getdebito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.getcredito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO);
					iRow++;

					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales:cobrarcontrolcarterasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarcontrolcarterasgenerales.gethora_pago());
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
			//	this.getFilaCabeceraExportarExcelCobrarControlCarterasGenerales(row);				
			//	iRow++;
			//}				
			
			//for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneralessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarControlCarterasGenerales(cobrarcontrolcarterasgeneralesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Control Carteras Generales",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
			
			//SI ES MANUAL
			if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarControlCarterasGenerales();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
			
			//SI ES MANUAL
			if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarControlCarterasGenerales();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
			
			//SI ES MANUAL
			if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarControlCarterasGenerales();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarControlCarterasGenerales() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarControlCarterasGenerales.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarControlCarterasGenerales.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarControlCarterasGenerales.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarControlCarterasGenerales.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarControlCarterasGenerales.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarControlCarterasGenerales.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarControlCarterasGenerales.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarControlCarterasGenerales(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarControlCarterasGenerales(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarControlCarterasGenerales(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarControlCarterasGenerales(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarControlCarterasGenerales(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarControlCarterasGenerales(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarControlCarterasGenerales(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarControlCarterasGenerales() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales();
		
		this.inicializarActualizarBindingBotonesManualCobrarControlCarterasGenerales(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarControlCarterasGenerales();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarControlCarterasGenerales() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarControlCarterasGenerales(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarControlCarterasGenerales(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jCheckBoxPostAccionNuevoCobrarControlCarterasGenerales.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jCheckBoxPostAccionSinCerrarCobrarControlCarterasGenerales.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jCheckBoxPostAccionSinMensajeCobrarControlCarterasGenerales.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarControlCarterasGenerales.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
				this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jCheckBoxPostAccionNuevoCobrarControlCarterasGenerales.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jCheckBoxPostAccionSinCerrarCobrarControlCarterasGenerales.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jCheckBoxPostAccionSinMensajeCobrarControlCarterasGenerales.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarControlCarterasGenerales.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarControlCarterasGenerales.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarControlCarterasGenerales(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarControlCarterasGenerales(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarControlCarterasGenerales() throws Exception {
		try	{
			if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarControlCarterasGenerales();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarControlCarterasGenerales() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarControlCarterasGenerales() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarControlCarterasGenerales.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarControlCarterasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarControlCarterasGenerales.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarControlCarterasGenerales.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.addItem(reporte);
			}
			
			
			if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarControlCarterasGenerales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarControlCarterasGenerales();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarControlCarterasGenerales() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales!=null) {
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales!=null) {
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CobrarControlCarterasGeneralesConstantesFunciones.getTiposSeleccionarCobrarControlCarterasGenerales(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CobrarControlCarterasGeneralesConstantesFunciones.getTiposSeleccionarCobrarControlCarterasGenerales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CobrarControlCarterasGeneralesConstantesFunciones.getTiposSeleccionarCobrarControlCarterasGenerales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarControlCarterasGenerales()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_hastaBusquedaCobrarControlCarterasGenerales=new Date(this.jDateChooserfecha_emision_hastaBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarControlCarterasGenerales(Boolean esInicializar) throws Exception {				
		if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarControlCarterasGenerales();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarControlCarterasGenerales() throws Exception {
		this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarControlCarterasGenerales() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarControlCarterasGeneralesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGeneralesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarControlCarterasGenerales(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarcontrolcarterasgeneraless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarControlCarterasGenerales.setModel(new CobrarControlCarterasGeneralesModel(this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarControlCarterasGenerales.setModel(new CobrarControlCarterasGeneralesModel(this.cobrarcontrolcarterasgeneraless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarControlCarterasGenerales!=null && this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarControlCarterasGenerales();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO,cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarSeleccionarCobrarControlCarterasGenerales,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO,cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarSeleccionarCobrarControlCarterasGenerales,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_ID));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostraridCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltaridCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activaridCobrarControlCarterasGenerales,iSizeTabla,this,true,"idCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltaridCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activaridCobrarControlCarterasGenerales,this,true,"idCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_ciudadCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_ciudadCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_ciudadCobrarControlCarterasGenerales,iSizeTabla,this,true,"nombre_ciudadCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_ciudadCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_ciudadCobrarControlCarterasGenerales,this,true,"nombre_ciudadCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_zonaCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_zonaCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_zonaCobrarControlCarterasGenerales,iSizeTabla,this,true,"nombre_zonaCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_zonaCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_zonaCobrarControlCarterasGenerales,this,true,"nombre_zonaCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_vendedorCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_vendedorCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_vendedorCobrarControlCarterasGenerales,iSizeTabla,this,true,"nombre_vendedorCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_vendedorCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_vendedorCobrarControlCarterasGenerales,this,true,"nombre_vendedorCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarcodigoCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarcodigoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarcodigoCobrarControlCarterasGenerales,iSizeTabla,this,true,"codigoCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarcodigoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarcodigoCobrarControlCarterasGenerales,this,true,"codigoCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_completoCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_completoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_completoCobrarControlCarterasGenerales,iSizeTabla,this,true,"nombre_completoCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_completoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_completoCobrarControlCarterasGenerales,this,true,"nombre_completoCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarlimite_creditoCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarlimite_creditoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarlimite_creditoCobrarControlCarterasGenerales,iSizeTabla,this,true,"limite_creditoCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarlimite_creditoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarlimite_creditoCobrarControlCarterasGenerales,this,true,"limite_creditoCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarrepresentanteCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarrepresentanteCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarrepresentanteCobrarControlCarterasGenerales,iSizeTabla,this,true,"representanteCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarrepresentanteCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarrepresentanteCobrarControlCarterasGenerales,this,true,"representanteCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardia_pagoCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardia_pagoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardia_pagoCobrarControlCarterasGenerales,iSizeTabla,this,true,"dia_pagoCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardia_pagoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardia_pagoCobrarControlCarterasGenerales,this,true,"dia_pagoCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnumero_comprobanteCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnumero_comprobanteCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnumero_comprobanteCobrarControlCarterasGenerales,iSizeTabla,this,true,"numero_comprobanteCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnumero_comprobanteCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnumero_comprobanteCobrarControlCarterasGenerales,this,true,"numero_comprobanteCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnumero_facturaCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnumero_facturaCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnumero_facturaCobrarControlCarterasGenerales,iSizeTabla,this,true,"numero_facturaCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnumero_facturaCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnumero_facturaCobrarControlCarterasGenerales,this,true,"numero_facturaCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardireccion_direccionCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardireccion_direccionCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardireccion_direccionCobrarControlCarterasGenerales,iSizeTabla,this,true,"direccion_direccionCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardireccion_direccionCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardireccion_direccionCobrarControlCarterasGenerales,this,true,"direccion_direccionCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrartelefono_telefonoCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltartelefono_telefonoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activartelefono_telefonoCobrarControlCarterasGenerales,iSizeTabla,this,true,"telefono_telefonoCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltartelefono_telefonoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activartelefono_telefonoCobrarControlCarterasGenerales,this,true,"telefono_telefonoCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarfecha_emisioCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarfecha_emisioCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarfecha_emisioCobrarControlCarterasGenerales,iSizeTabla,this,true,"fecha_emisioCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarfecha_emisioCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarfecha_emisioCobrarControlCarterasGenerales,this,true,"fecha_emisioCobrarControlCarterasGenerales","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarfecha_venceCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarfecha_venceCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarfecha_venceCobrarControlCarterasGenerales,iSizeTabla,this,true,"fecha_venceCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarfecha_venceCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarfecha_venceCobrarControlCarterasGenerales,this,true,"fecha_venceCobrarControlCarterasGenerales","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardiasCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardiasCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardiasCobrarControlCarterasGenerales,iSizeTabla,this,true,"diasCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardiasCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardiasCobrarControlCarterasGenerales,this,true,"diasCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarsaldoCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarsaldoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarsaldoCobrarControlCarterasGenerales,iSizeTabla,this,true,"saldoCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarsaldoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarsaldoCobrarControlCarterasGenerales,this,true,"saldoCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardebito_mone_localCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardebito_mone_localCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardebito_mone_localCobrarControlCarterasGenerales,iSizeTabla,this,true,"debito_mone_localCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardebito_mone_localCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardebito_mone_localCobrarControlCarterasGenerales,this,true,"debito_mone_localCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarcredito_mone_localCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarcredito_mone_localCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarcredito_mone_localCobrarControlCarterasGenerales,iSizeTabla,this,true,"credito_mone_localCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarcredito_mone_localCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarcredito_mone_localCobrarControlCarterasGenerales,this,true,"credito_mone_localCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO));

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarhora_pagoCobrarControlCarterasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarhora_pagoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarhora_pagoCobrarControlCarterasGenerales,iSizeTabla,this,true,"hora_pagoCobrarControlCarterasGenerales","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarhora_pagoCobrarControlCarterasGenerales,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarhora_pagoCobrarControlCarterasGenerales,iSizeTabla,this,true,"hora_pagoCobrarControlCarterasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarControlCarterasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarControlCarterasGenerales.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarControlCarterasGenerales.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarControlCarterasGenerales.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarControlCarterasGenerales.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarControlCarterasGenerales.moveColumn(this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarControlCarterasGenerales.moveColumn(this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarControlCarterasGenerales.moveColumn(this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarControlCarterasGenerales.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarControlCarterasGenerales.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarControlCarterasGenerales,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarControlCarterasGenerales.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarControlCarterasGenerales.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarControlCarterasGenerales.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarcontrolcarterasgeneraless.size()-1;
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
		//this.jTableDatosCobrarControlCarterasGenerales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarControlCarterasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarControlCarterasGenerales();
			
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
				
				//this.isEsNuevoCobrarControlCarterasGenerales=false;
					
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
				if(this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarControlCarterasGenerales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarcontrolcarterasgenerales.getsType().equals("DUPLICADO")
				   || this.cobrarcontrolcarterasgenerales.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarControlCarterasGenerales=true;
				
				} else {
					this.isEsNuevoCobrarControlCarterasGenerales=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarcontrolcarterasgenerales.getId()>=0 && !this.cobrarcontrolcarterasgenerales.getIsNew()) {						
						this.isEsNuevoCobrarControlCarterasGenerales=false;
						
					} else {
						this.isEsNuevoCobrarControlCarterasGenerales=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarControlCarterasGenerales(esRelaciones);						
				
				this.seleccionarCobrarControlCarterasGenerales(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarcontrolcarterasgenerales.getId()<0) {
					this.isEsNuevoCobrarControlCarterasGenerales=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarControlCarterasGenerales(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarControlCarterasGenerales(evt,rowIndex);
				}	
				
				if(this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarControlCarterasGenerales: " + this.dDif); 
					}
				}								
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarControlCarterasGenerales(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarcontrolcarterasgenerales)) {
					if(this.cobrarcontrolcarterasgenerales.getId()>0) {
						this.cobrarcontrolcarterasgenerales.setIsDeleted(true);
						
						this.cobrarcontrolcarterasgeneralessEliminados.add(this.cobrarcontrolcarterasgenerales);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().remove(this.cobrarcontrolcarterasgenerales);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgeneraless.remove(this.cobrarcontrolcarterasgenerales);				
					}
					
					
					((CobrarControlCarterasGeneralesModel) this.jTableDatosCobrarControlCarterasGenerales.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarControlCarterasGenerales(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarControlCarterasGenerales) {
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarControlCarterasGenerales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarControlCarterasGenerales(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarControlCarterasGenerales() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarControlCarterasGenerales(cobrarcontrolcarterasgenerales,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarControlCarterasGenerales(cobrarcontrolcarterasgenerales);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarControlCarterasGenerales(cobrarcontrolcarterasgenerales,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarControlCarterasGenerales(cobrarcontrolcarterasgenerales);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getId().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_ciudadCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnombre_zonaCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_vendedorCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcodigoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getcodigo());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_completoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldlimite_creditoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getlimite_credito().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextArearepresentanteCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getrepresentante());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddia_pagoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getdia_pago().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnumero_comprobante());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_facturaCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreadireccion_direccionCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.gettelefono_telefono());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emisioCobrarControlCarterasGenerales.setDate(cobrarcontrolcarterasgenerales.getfecha_emisio());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_venceCobrarControlCarterasGenerales.setDate(cobrarcontrolcarterasgenerales.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddiasCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getdias().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldsaldoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getsaldo().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddebito_mone_localCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jSpinnerhora_pagoCobrarControlCarterasGenerales.setValue(cobrarcontrolcarterasgenerales.gethora_pago());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarcontrolcarterasgeneralesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarcontrolcarterasgeneralesLocal=this.cobrarcontrolcarterasgenerales;
			} else {
				cobrarcontrolcarterasgeneralesLocal=this.cobrarcontrolcarterasgeneralesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarcontrolcarterasgeneralesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarControlCarterasGenerales(cobrarcontrolcarterasgeneralesLocal,true);
					
					if(cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarcontrolcarterasgeneralesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarcontrolcarterasgeneralesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(cobrarcontrolcarterasgenerales,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(cobrarcontrolcarterasgenerales);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(cobrarcontrolcarterasgenerales,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.getText()==null || this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.getText()=="" || this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.setText("0");
			}

			if(conColumnasBase) {cobrarcontrolcarterasgenerales.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelIdCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setnombre_ciudad(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_ciudadCobrarControlCarterasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_ciudadCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setnombre_zona(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnombre_zonaCobrarControlCarterasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_zonaCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setnombre_vendedor(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_vendedorCobrarControlCarterasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_vendedorCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setcodigo(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcodigoCobrarControlCarterasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelcodigoCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setnombre_completo(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_completoCobrarControlCarterasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnombre_completoCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setlimite_credito(Double.parseDouble(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldlimite_creditoCobrarControlCarterasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabellimite_creditoCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setrepresentante(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextArearepresentanteCobrarControlCarterasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelrepresentanteCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setdia_pago(Integer.parseInt(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddia_pagoCobrarControlCarterasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldia_pagoCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setnumero_comprobante(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnumero_comprobanteCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setnumero_factura(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_facturaCobrarControlCarterasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelnumero_facturaCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setdireccion_direccion(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreadireccion_direccionCobrarControlCarterasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldireccion_direccionCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.settelefono_telefono(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreatelefono_telefonoCobrarControlCarterasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeltelefono_telefonoCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setfecha_emisio(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emisioCobrarControlCarterasGenerales.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelfecha_emisioCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setfecha_vence(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_venceCobrarControlCarterasGenerales.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelfecha_venceCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setdias(Integer.parseInt(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddiasCobrarControlCarterasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldiasCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldsaldoCobrarControlCarterasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelsaldoCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setdebito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddebito_mone_localCobrarControlCarterasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabeldebito_mone_localCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.setcredito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcredito_mone_localCobrarControlCarterasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelcredito_mone_localCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarcontrolcarterasgenerales.sethora_pago(new Time(((Date)this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jSpinnerhora_pagoCobrarControlCarterasGenerales.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelhora_pagoCobrarControlCarterasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesBean,CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesOrigen,CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getId()!=null && !cobrarcontrolcarterasgeneralesOrigen.getId().equals(0L))) {cobrarcontrolcarterasgenerales.setId(cobrarcontrolcarterasgeneralesOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getfecha_emision_hasta()!=null && !cobrarcontrolcarterasgeneralesOrigen.getfecha_emision_hasta().equals(new Date()))) {cobrarcontrolcarterasgenerales.setfecha_emision_hasta(cobrarcontrolcarterasgeneralesOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getnombre_ciudad()!=null && !cobrarcontrolcarterasgeneralesOrigen.getnombre_ciudad().equals(""))) {cobrarcontrolcarterasgenerales.setnombre_ciudad(cobrarcontrolcarterasgeneralesOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getnombre_zona()!=null && !cobrarcontrolcarterasgeneralesOrigen.getnombre_zona().equals(""))) {cobrarcontrolcarterasgenerales.setnombre_zona(cobrarcontrolcarterasgeneralesOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getnombre_vendedor()!=null && !cobrarcontrolcarterasgeneralesOrigen.getnombre_vendedor().equals(""))) {cobrarcontrolcarterasgenerales.setnombre_vendedor(cobrarcontrolcarterasgeneralesOrigen.getnombre_vendedor());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getcodigo()!=null && !cobrarcontrolcarterasgeneralesOrigen.getcodigo().equals(""))) {cobrarcontrolcarterasgenerales.setcodigo(cobrarcontrolcarterasgeneralesOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getnombre_completo()!=null && !cobrarcontrolcarterasgeneralesOrigen.getnombre_completo().equals(""))) {cobrarcontrolcarterasgenerales.setnombre_completo(cobrarcontrolcarterasgeneralesOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getlimite_credito()!=null && !cobrarcontrolcarterasgeneralesOrigen.getlimite_credito().equals(0.0))) {cobrarcontrolcarterasgenerales.setlimite_credito(cobrarcontrolcarterasgeneralesOrigen.getlimite_credito());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getrepresentante()!=null && !cobrarcontrolcarterasgeneralesOrigen.getrepresentante().equals(""))) {cobrarcontrolcarterasgenerales.setrepresentante(cobrarcontrolcarterasgeneralesOrigen.getrepresentante());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getdia_pago()!=null && !cobrarcontrolcarterasgeneralesOrigen.getdia_pago().equals(0))) {cobrarcontrolcarterasgenerales.setdia_pago(cobrarcontrolcarterasgeneralesOrigen.getdia_pago());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getnumero_comprobante()!=null && !cobrarcontrolcarterasgeneralesOrigen.getnumero_comprobante().equals(""))) {cobrarcontrolcarterasgenerales.setnumero_comprobante(cobrarcontrolcarterasgeneralesOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getnumero_factura()!=null && !cobrarcontrolcarterasgeneralesOrigen.getnumero_factura().equals(""))) {cobrarcontrolcarterasgenerales.setnumero_factura(cobrarcontrolcarterasgeneralesOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getdireccion_direccion()!=null && !cobrarcontrolcarterasgeneralesOrigen.getdireccion_direccion().equals(""))) {cobrarcontrolcarterasgenerales.setdireccion_direccion(cobrarcontrolcarterasgeneralesOrigen.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.gettelefono_telefono()!=null && !cobrarcontrolcarterasgeneralesOrigen.gettelefono_telefono().equals(""))) {cobrarcontrolcarterasgenerales.settelefono_telefono(cobrarcontrolcarterasgeneralesOrigen.gettelefono_telefono());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getfecha_emisio()!=null && !cobrarcontrolcarterasgeneralesOrigen.getfecha_emisio().equals(new Date()))) {cobrarcontrolcarterasgenerales.setfecha_emisio(cobrarcontrolcarterasgeneralesOrigen.getfecha_emisio());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getfecha_vence()!=null && !cobrarcontrolcarterasgeneralesOrigen.getfecha_vence().equals(new Date()))) {cobrarcontrolcarterasgenerales.setfecha_vence(cobrarcontrolcarterasgeneralesOrigen.getfecha_vence());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getdias()!=null && !cobrarcontrolcarterasgeneralesOrigen.getdias().equals(0))) {cobrarcontrolcarterasgenerales.setdias(cobrarcontrolcarterasgeneralesOrigen.getdias());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getsaldo()!=null && !cobrarcontrolcarterasgeneralesOrigen.getsaldo().equals(0.0))) {cobrarcontrolcarterasgenerales.setsaldo(cobrarcontrolcarterasgeneralesOrigen.getsaldo());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getdebito_mone_local()!=null && !cobrarcontrolcarterasgeneralesOrigen.getdebito_mone_local().equals(0.0))) {cobrarcontrolcarterasgenerales.setdebito_mone_local(cobrarcontrolcarterasgeneralesOrigen.getdebito_mone_local());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.getcredito_mone_local()!=null && !cobrarcontrolcarterasgeneralesOrigen.getcredito_mone_local().equals(0.0))) {cobrarcontrolcarterasgenerales.setcredito_mone_local(cobrarcontrolcarterasgeneralesOrigen.getcredito_mone_local());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesOrigen.gethora_pago()!=null && !cobrarcontrolcarterasgeneralesOrigen.gethora_pago().equals(new Time((new Date()).getTime())))) {cobrarcontrolcarterasgenerales.sethora_pago(cobrarcontrolcarterasgeneralesOrigen.gethora_pago());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getId().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_ciudadCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnombre_zonaCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_vendedorCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcodigoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getcodigo());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_completoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldlimite_creditoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getlimite_credito().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextArearepresentanteCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getrepresentante());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddia_pagoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getdia_pago().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnumero_comprobante());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_facturaCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreadireccion_direccionCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.gettelefono_telefono());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emisioCobrarControlCarterasGenerales.setDate(cobrarcontrolcarterasgenerales.getfecha_emisio());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_venceCobrarControlCarterasGenerales.setDate(cobrarcontrolcarterasgenerales.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddiasCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getdias().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldsaldoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getsaldo().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddebito_mone_localCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgenerales.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jSpinnerhora_pagoCobrarControlCarterasGenerales.setValue(cobrarcontrolcarterasgenerales.gethora_pago());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarControlCarterasGenerales(CobrarControlCarterasGeneralesBean cobrarcontrolcarterasgeneralesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_ciudadCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnombre_zonaCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_vendedorCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcodigoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_completoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldlimite_creditoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getlimite_credito().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextArearepresentanteCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getrepresentante());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddia_pagoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getdia_pago().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_facturaCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getnumero_factura());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreadireccion_direccionCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.gettelefono_telefono());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emisioCobrarControlCarterasGenerales.setDate(cobrarcontrolcarterasgeneralesBean.getfecha_emisio());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_venceCobrarControlCarterasGenerales.setDate(cobrarcontrolcarterasgeneralesBean.getfecha_vence());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddiasCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getdias().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldsaldoCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getsaldo().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddebito_mone_localCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setText(cobrarcontrolcarterasgeneralesBean.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jSpinnerhora_pagoCobrarControlCarterasGenerales.setValue(cobrarcontrolcarterasgeneralesBean.gethora_pago());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarControlCarterasGenerales(CobrarControlCarterasGeneralesParameterReturnGeneral cobrarcontrolcarterasgeneralesReturnGeneral,CobrarControlCarterasGeneralesBean cobrarcontrolcarterasgeneralesBean,Boolean conDefault) throws Exception { 
		try {
			CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesLocal=new CobrarControlCarterasGenerales();
			
			cobrarcontrolcarterasgeneralesLocal=cobrarcontrolcarterasgeneralesReturnGeneral.getCobrarControlCarterasGenerales();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getId()!=null && !cobrarcontrolcarterasgeneralesLocal.getId().equals(0L))) {cobrarcontrolcarterasgeneralesBean.setId(cobrarcontrolcarterasgeneralesLocal.getId());}}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getnombre_ciudad()!=null && !cobrarcontrolcarterasgeneralesLocal.getnombre_ciudad().equals(""))) {cobrarcontrolcarterasgeneralesBean.setnombre_ciudad(cobrarcontrolcarterasgeneralesLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getnombre_zona()!=null && !cobrarcontrolcarterasgeneralesLocal.getnombre_zona().equals(""))) {cobrarcontrolcarterasgeneralesBean.setnombre_zona(cobrarcontrolcarterasgeneralesLocal.getnombre_zona());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getnombre_vendedor()!=null && !cobrarcontrolcarterasgeneralesLocal.getnombre_vendedor().equals(""))) {cobrarcontrolcarterasgeneralesBean.setnombre_vendedor(cobrarcontrolcarterasgeneralesLocal.getnombre_vendedor());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getcodigo()!=null && !cobrarcontrolcarterasgeneralesLocal.getcodigo().equals(""))) {cobrarcontrolcarterasgeneralesBean.setcodigo(cobrarcontrolcarterasgeneralesLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getnombre_completo()!=null && !cobrarcontrolcarterasgeneralesLocal.getnombre_completo().equals(""))) {cobrarcontrolcarterasgeneralesBean.setnombre_completo(cobrarcontrolcarterasgeneralesLocal.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getlimite_credito()!=null && !cobrarcontrolcarterasgeneralesLocal.getlimite_credito().equals(0.0))) {cobrarcontrolcarterasgeneralesBean.setlimite_credito(cobrarcontrolcarterasgeneralesLocal.getlimite_credito());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getrepresentante()!=null && !cobrarcontrolcarterasgeneralesLocal.getrepresentante().equals(""))) {cobrarcontrolcarterasgeneralesBean.setrepresentante(cobrarcontrolcarterasgeneralesLocal.getrepresentante());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getdia_pago()!=null && !cobrarcontrolcarterasgeneralesLocal.getdia_pago().equals(0))) {cobrarcontrolcarterasgeneralesBean.setdia_pago(cobrarcontrolcarterasgeneralesLocal.getdia_pago());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getnumero_comprobante()!=null && !cobrarcontrolcarterasgeneralesLocal.getnumero_comprobante().equals(""))) {cobrarcontrolcarterasgeneralesBean.setnumero_comprobante(cobrarcontrolcarterasgeneralesLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getnumero_factura()!=null && !cobrarcontrolcarterasgeneralesLocal.getnumero_factura().equals(""))) {cobrarcontrolcarterasgeneralesBean.setnumero_factura(cobrarcontrolcarterasgeneralesLocal.getnumero_factura());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getdireccion_direccion()!=null && !cobrarcontrolcarterasgeneralesLocal.getdireccion_direccion().equals(""))) {cobrarcontrolcarterasgeneralesBean.setdireccion_direccion(cobrarcontrolcarterasgeneralesLocal.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.gettelefono_telefono()!=null && !cobrarcontrolcarterasgeneralesLocal.gettelefono_telefono().equals(""))) {cobrarcontrolcarterasgeneralesBean.settelefono_telefono(cobrarcontrolcarterasgeneralesLocal.gettelefono_telefono());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getfecha_emisio()!=null && !cobrarcontrolcarterasgeneralesLocal.getfecha_emisio().equals(new Date()))) {cobrarcontrolcarterasgeneralesBean.setfecha_emisio(cobrarcontrolcarterasgeneralesLocal.getfecha_emisio());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getfecha_vence()!=null && !cobrarcontrolcarterasgeneralesLocal.getfecha_vence().equals(new Date()))) {cobrarcontrolcarterasgeneralesBean.setfecha_vence(cobrarcontrolcarterasgeneralesLocal.getfecha_vence());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getdias()!=null && !cobrarcontrolcarterasgeneralesLocal.getdias().equals(0))) {cobrarcontrolcarterasgeneralesBean.setdias(cobrarcontrolcarterasgeneralesLocal.getdias());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getsaldo()!=null && !cobrarcontrolcarterasgeneralesLocal.getsaldo().equals(0.0))) {cobrarcontrolcarterasgeneralesBean.setsaldo(cobrarcontrolcarterasgeneralesLocal.getsaldo());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getdebito_mone_local()!=null && !cobrarcontrolcarterasgeneralesLocal.getdebito_mone_local().equals(0.0))) {cobrarcontrolcarterasgeneralesBean.setdebito_mone_local(cobrarcontrolcarterasgeneralesLocal.getdebito_mone_local());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.getcredito_mone_local()!=null && !cobrarcontrolcarterasgeneralesLocal.getcredito_mone_local().equals(0.0))) {cobrarcontrolcarterasgeneralesBean.setcredito_mone_local(cobrarcontrolcarterasgeneralesLocal.getcredito_mone_local());}
			if(conDefault || (!conDefault && cobrarcontrolcarterasgeneralesLocal.gethora_pago()!=null && !cobrarcontrolcarterasgeneralesLocal.gethora_pago().equals(new Time((new Date()).getTime())))) {cobrarcontrolcarterasgeneralesBean.sethora_pago(cobrarcontrolcarterasgeneralesLocal.gethora_pago());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarControlCarterasGeneralesGenerico(Long idCobrarControlCarterasGeneralesSeleccionado,JComboBox jComboBoxCobrarControlCarterasGenerales,List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessLocal)throws Exception {
		try {
			CobrarControlCarterasGenerales  cobrarcontrolcarterasgeneralesTemp=null;

			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneralessLocal) {
				if(cobrarcontrolcarterasgeneralesAux.getId()!=null && cobrarcontrolcarterasgeneralesAux.getId().equals(idCobrarControlCarterasGeneralesSeleccionado)) {
					cobrarcontrolcarterasgeneralesTemp=cobrarcontrolcarterasgeneralesAux;
					break;
				}
			}

			jComboBoxCobrarControlCarterasGenerales.setSelectedItem(cobrarcontrolcarterasgeneralesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarControlCarterasGeneralesGenerico(JComboBox jComboBoxCobrarControlCarterasGenerales,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarControlCarterasGenerales.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarControlCarterasGenerales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarControlCarterasGenerales.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarControlCarterasGenerales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarcontrolcarterasgenerales=(CobrarControlCarterasGenerales) cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) cobrarcontrolcarterasgeneraless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarcontrolcarterasgenerales.getIsNew() && !cobrarcontrolcarterasgenerales.getIsChanged() && !cobrarcontrolcarterasgenerales.getIsDeleted()) {
				sDescripcion=cobrarcontrolcarterasgenerales.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarcontrolcarterasgenerales.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesRow=new CobrarControlCarterasGenerales();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarcontrolcarterasgeneralesRow=(CobrarControlCarterasGenerales) cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarcontrolcarterasgeneralesRow=(CobrarControlCarterasGenerales) cobrarcontrolcarterasgeneraless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarControlCarterasGenerales(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales && this.isPermisoNuevoCobrarControlCarterasGenerales));			
			this.jButtonDuplicarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales && this.isPermisoDuplicarCobrarControlCarterasGenerales));			
			this.jButtonCopiarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaCopiarCobrarControlCarterasGenerales && this.isPermisoCopiarCobrarControlCarterasGenerales));
			this.jButtonVerFormCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaVerFormCobrarControlCarterasGenerales && this.isPermisoVerFormCobrarControlCarterasGenerales));
			
			this.jButtonAbrirOrderByCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaOrdenCobrarControlCarterasGenerales && this.isPermisoOrdenCobrarControlCarterasGenerales));			
			
			this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales && this.isPermisoNuevoCobrarControlCarterasGenerales));			
			this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales && this.isPermisoNuevoCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales));
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonModificarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales && this.isPermisoActualizarCobrarControlCarterasGenerales));	
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonActualizarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales && this.isPermisoActualizarCobrarControlCarterasGenerales));	
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonEliminarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales && this.isPermisoEliminarCobrarControlCarterasGenerales));
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonCancelarCobrarControlCarterasGenerales.setVisible(this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales);							
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales && this.isPermisoNuevoCobrarControlCarterasGenerales));						
			this.jButtonDuplicarToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales && this.isPermisoDuplicarCobrarControlCarterasGenerales));						
			this.jButtonCopiarToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaCopiarCobrarControlCarterasGenerales && this.isPermisoCopiarCobrarControlCarterasGenerales));			
			this.jButtonVerFormToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaVerFormCobrarControlCarterasGenerales && this.isPermisoVerFormCobrarControlCarterasGenerales));			
			this.jButtonAbrirOrderByToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaOrdenCobrarControlCarterasGenerales && this.isPermisoOrdenCobrarControlCarterasGenerales));
			this.jButtonNuevoRelacionesToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales && this.isPermisoNuevoCobrarControlCarterasGenerales));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales && this.isPermisoNuevoCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales));			
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonModificarToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales && this.isPermisoActualizarCobrarControlCarterasGenerales));	
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonActualizarToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales  && this.isPermisoActualizarCobrarControlCarterasGenerales));	
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonEliminarToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales && this.isPermisoEliminarCobrarControlCarterasGenerales));
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonCancelarToolBarCobrarControlCarterasGenerales.setVisible(this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales);				
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales && this.isPermisoNuevoCobrarControlCarterasGenerales));			
			this.jMenuItemDuplicarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales && this.isPermisoDuplicarCobrarControlCarterasGenerales));			
			this.jMenuItemCopiarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaCopiarCobrarControlCarterasGenerales && this.isPermisoCopiarCobrarControlCarterasGenerales));			
			this.jMenuItemVerFormCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaVerFormCobrarControlCarterasGenerales && this.isPermisoVerFormCobrarControlCarterasGenerales));			
			this.jMenuItemAbrirOrderByCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaOrdenCobrarControlCarterasGenerales && this.isPermisoOrdenCobrarControlCarterasGenerales));			
			//this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaOrdenCobrarControlCarterasGenerales && this.isPermisoOrdenCobrarControlCarterasGenerales));
			this.jMenuItemDetalleAbrirOrderByCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaOrdenCobrarControlCarterasGenerales && this.isPermisoOrdenCobrarControlCarterasGenerales));			
			//this.jMenuItemDetalleMostrarOcultarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaOrdenCobrarControlCarterasGenerales && this.isPermisoOrdenCobrarControlCarterasGenerales));			
			this.jMenuItemNuevoRelacionesCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales && this.isPermisoNuevoCobrarControlCarterasGenerales));			
			this.jMenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales && this.isPermisoNuevoCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales));									
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemModificarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales && this.isPermisoActualizarCobrarControlCarterasGenerales));	
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemActualizarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales && this.isPermisoActualizarCobrarControlCarterasGenerales));	
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemEliminarCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales && this.isPermisoEliminarCobrarControlCarterasGenerales));
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemCancelarCobrarControlCarterasGenerales.setVisible(this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales);				
			}
			
			this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales));						
			this.jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=this.jButtonNuevoCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales=this.jButtonDuplicarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaCopiarCobrarControlCarterasGenerales=this.jButtonCopiarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaVerFormCobrarControlCarterasGenerales=this.jButtonVerFormCobrarControlCarterasGenerales.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarControlCarterasGenerales=this.jButtonAbrirOrderByCobrarControlCarterasGenerales.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=this.jButtonModificarCobrarControlCarterasGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonActualizarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonEliminarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonCancelarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosCobrarControlCarterasGenerales.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=this.jButtonNuevoToolBarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=this.jButtonNuevoRelacionesToolBarCobrarControlCarterasGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonModificarToolBarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonActualizarToolBarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonEliminarToolBarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonCancelarToolBarCobrarControlCarterasGenerales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=this.jButtonGuardarCambiosToolBarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=this.jButtonGuardarCambiosTablaToolBarCobrarControlCarterasGenerales.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=this.jMenuItemNuevoCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=this.jMenuItemNuevoRelacionesCobrarControlCarterasGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemModificarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemActualizarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemEliminarCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemCancelarCobrarControlCarterasGenerales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=this.jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarControlCarterasGenerales(Boolean esInicializar) {
		if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarControlCarterasGenerales();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarControlCarterasGenerales(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarControlCarterasGenerales() {
		this.jButtonNuevoCobrarControlCarterasGenerales.setVisible(this.isPermisoNuevoCobrarControlCarterasGenerales);			
		this.jButtonDuplicarCobrarControlCarterasGenerales.setVisible(this.isPermisoDuplicarCobrarControlCarterasGenerales);			
		this.jButtonCopiarCobrarControlCarterasGenerales.setVisible(this.isPermisoCopiarCobrarControlCarterasGenerales);			
		this.jButtonVerFormCobrarControlCarterasGenerales.setVisible(this.isPermisoVerFormCobrarControlCarterasGenerales);			
		
		this.jButtonAbrirOrderByCobrarControlCarterasGenerales.setVisible(this.isPermisoOrdenCobrarControlCarterasGenerales);					
		
		this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.setVisible(this.isPermisoNuevoCobrarControlCarterasGenerales);			
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonModificarCobrarControlCarterasGenerales.setVisible(this.isPermisoActualizarCobrarControlCarterasGenerales);	
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonActualizarCobrarControlCarterasGenerales.setVisible(this.isPermisoActualizarCobrarControlCarterasGenerales);	
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonEliminarCobrarControlCarterasGenerales.setVisible(this.isPermisoEliminarCobrarControlCarterasGenerales);
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonCancelarCobrarControlCarterasGenerales.setVisible(this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales);						
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosCobrarControlCarterasGenerales.setVisible(this.isPermisoGuardarCambiosCobrarControlCarterasGenerales);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.setVisible(this.isPermisoActualizarCobrarControlCarterasGenerales);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarControlCarterasGenerales() {
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonModificarCobrarControlCarterasGenerales.setVisible(this.isPermisoActualizarCobrarControlCarterasGenerales);	
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonActualizarCobrarControlCarterasGenerales.setVisible(this.isPermisoActualizarCobrarControlCarterasGenerales);	
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonEliminarCobrarControlCarterasGenerales.setVisible(this.isPermisoEliminarCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonCancelarCobrarControlCarterasGenerales.setVisible(this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales);							
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosCobrarControlCarterasGenerales.setVisible((this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales && this.isPermisoGuardarCambiosCobrarControlCarterasGenerales));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarControlCarterasGenerales() {
		if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarControlCarterasGenerales();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarControlCarterasGenerales() {
	}
	
	public void jTableDatosCobrarControlCarterasGeneralesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarControlCarterasGenerales(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarcontrolcarterasgenerales.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarControlCarterasGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarControlCarterasGenerales(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarControlCarterasGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarControlCarterasGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarcontrolcarterasgeneralesLogic.getConnexion());

				if(this.cobrarcontrolcarterasgenerales.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarcontrolcarterasgenerales.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarControlCarterasGenerales=(TitledBorder)this.jScrollPanelDatosCobrarControlCarterasGenerales.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarControlCarterasGenerales.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarcontrolcarterasgenerales.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.cobrarcontrolcarterasgenerales.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.cobrarcontrolcarterasgenerales.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.cobrarcontrolcarterasgenerales.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_vendedorCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getnombre_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_vendedor like '%"+this.cobrarcontrolcarterasgenerales.getnombre_vendedor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarcontrolcarterasgenerales.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.cobrarcontrolcarterasgenerales.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonlimite_creditoCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getlimite_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where limite_credito = "+this.cobrarcontrolcarterasgenerales.getlimite_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrepresentanteCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getrepresentante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where representante like '%"+this.cobrarcontrolcarterasgenerales.getrepresentante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_pagoCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getdia_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_pago = "+this.cobrarcontrolcarterasgenerales.getdia_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.cobrarcontrolcarterasgenerales.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.cobrarcontrolcarterasgenerales.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_direccionCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getdireccion_direccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_direccion like '%"+this.cobrarcontrolcarterasgenerales.getdireccion_direccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_telefonoCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.gettelefono_telefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_telefono like '%"+this.cobrarcontrolcarterasgenerales.gettelefono_telefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisioCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getfecha_emisio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emisio = '"+Funciones2.getStringPostgresDate(this.cobrarcontrolcarterasgenerales.getfecha_emisio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_venceCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getfecha_vence()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vence = '"+Funciones2.getStringPostgresDate(this.cobrarcontrolcarterasgenerales.getfecha_vence())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondiasCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getdias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dias = "+this.cobrarcontrolcarterasgenerales.getdias().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.cobrarcontrolcarterasgenerales.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_localCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getdebito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_local = "+this.cobrarcontrolcarterasgenerales.getdebito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_localCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.getcredito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_local = "+this.cobrarcontrolcarterasgenerales.getcredito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_pagoCobrarControlCarterasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.getcobrarcontrolcarterasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarcontrolcarterasgenerales==null) {
						this.cobrarcontrolcarterasgenerales = new CobrarControlCarterasGenerales();
					}

					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);
				}

				if(this.cobrarcontrolcarterasgenerales.gethora_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_pago = "+this.cobrarcontrolcarterasgenerales.gethora_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false,false);

			this.getCobrarControlCarterasGeneralessBusquedaCobrarControlCarterasGenerales();

			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);

			//if(CobrarControlCarterasGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarControlCarterasGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarControlCarterasGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false,false);

			this.getCobrarControlCarterasGeneralessFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);

			//if(CobrarControlCarterasGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarControlCarterasGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarcontrolcarterasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarControlCarterasGenerales() {
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.dispose();
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales!=null) {
			this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.dispose();
			this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales=null;
		}
		
		if(this.jInternalFrameImportacionCobrarControlCarterasGenerales!=null) {
			this.jInternalFrameImportacionCobrarControlCarterasGenerales.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarControlCarterasGenerales.dispose();
			this.jInternalFrameImportacionCobrarControlCarterasGenerales=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarControlCarterasGenerales();
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarControlCarterasGenerales")) {
				jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarControlCarterasGenerales")) {
				jButtonDuplicarCobrarControlCarterasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarControlCarterasGenerales")) {
				jButtonCopiarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarControlCarterasGenerales")) {
				jButtonVerFormCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarControlCarterasGenerales")) {
				jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarControlCarterasGenerales")) {
				jButtonDuplicarCobrarControlCarterasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarControlCarterasGenerales")) {
				jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarControlCarterasGenerales")) {
				jButtonDuplicarCobrarControlCarterasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarControlCarterasGenerales")) {
				jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarControlCarterasGenerales")) {
				jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarControlCarterasGenerales")) {
				jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarControlCarterasGenerales")) {
				jButtonModificarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarControlCarterasGenerales")) {
				jButtonModificarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarControlCarterasGenerales")) {
				jButtonModificarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarControlCarterasGenerales")) {
				jButtonActualizarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarControlCarterasGenerales")) {
				jButtonActualizarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarControlCarterasGenerales")) {
				jButtonActualizarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarControlCarterasGenerales")) {
				jButtonEliminarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarControlCarterasGenerales")) {
				jButtonEliminarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarControlCarterasGenerales")) {
				jButtonEliminarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarControlCarterasGenerales")) {
				jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarControlCarterasGenerales")) {
				jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarControlCarterasGenerales")) {
				jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarControlCarterasGenerales")) {
				jButtonCerrarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarControlCarterasGenerales")) {
				jButtonCerrarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarControlCarterasGenerales")) {
				jButtonCerrarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarControlCarterasGenerales")) {
				jButtonMostrarOcultarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarControlCarterasGenerales")) {
				jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarControlCarterasGenerales")) {
				jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarControlCarterasGenerales")) {
				jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarControlCarterasGenerales")) {
				jButtonCopiarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarControlCarterasGenerales")) {
				jButtonVerFormCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarControlCarterasGenerales")) {
				jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarControlCarterasGenerales")) {
				jButtonCopiarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarControlCarterasGenerales")) {
				jButtonVerFormCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarControlCarterasGenerales")) {
				jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarControlCarterasGenerales")) {
				jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarControlCarterasGenerales")) {
				jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarControlCarterasGenerales")) {
				jButtonRecargarInformacionCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarControlCarterasGenerales")) {
				jButtonRecargarInformacionCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarControlCarterasGenerales")) {
				jButtonRecargarInformacionCobrarControlCarterasGeneralesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarControlCarterasGenerales")) {
				jButtonAnterioresCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarControlCarterasGenerales")) {
				jButtonAnterioresCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarControlCarterasGenerales")) {
				jButtonAnterioresCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarControlCarterasGenerales")) {
				jButtonSiguientesCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarControlCarterasGenerales")) {
				jButtonSiguientesCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarControlCarterasGenerales")) {
				jButtonSiguientesCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarControlCarterasGenerales") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarControlCarterasGenerales")) {
				jButtonAbrirOrderByCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarControlCarterasGenerales") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarControlCarterasGenerales")) {
				jButtonMostrarOcultarCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarControlCarterasGenerales")) {
				jButtonNuevoGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarControlCarterasGenerales")) {
				jButtonNuevoGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales")) {
				jButtonNuevoGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarControlCarterasGenerales")) {
				jButtonCerrarReporteDinamicoCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarControlCarterasGenerales")) {
				jButtonGenerarReporteDinamicoCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarControlCarterasGenerales")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarControlCarterasGenerales")) {
				jButtonCerrarImportacionCobrarControlCarterasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarControlCarterasGenerales")) {
				
				jButtonGenerarImportacionCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarControlCarterasGenerales")) {
				
				jButtonAbrirImportacionCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarControlCarterasGenerales")) {
				jComboBoxTiposAccionesCobrarControlCarterasGeneralesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarControlCarterasGenerales")) {
				jComboBoxTiposRelacionesCobrarControlCarterasGeneralesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarControlCarterasGenerales")) {
				jComboBoxTiposAccionesCobrarControlCarterasGeneralesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarControlCarterasGenerales")) {
				
				jComboBoxTiposSeleccionarCobrarControlCarterasGeneralesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarControlCarterasGenerales")) {
				jTextFieldValorCampoGeneralCobrarControlCarterasGeneralesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarControlCarterasGenerales")) {
				jButtonAbrirOrderByCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarControlCarterasGenerales")) {
				jButtonAbrirOrderByCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarControlCarterasGenerales")) {
				jButtonCerrarOrderByCobrarControlCarterasGeneralesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonidCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarControlCarterasGeneralesUpdate")) {
				this.jButtonid_empresaCobrarControlCarterasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonid_empresaCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtoncodigoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnombre_completoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("limite_creditoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("representanteCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonrepresentanteCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_pagoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtondia_pagoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisioCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonfecha_venceCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diasCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtondiasCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonsaldoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_pagoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonhora_pagoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales")) {
				this.jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGeneralesActionPerformed(evt);
			}
			
			;
			
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarControlCarterasGenerales();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				


				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarcontrolcarterasgeneralesLocal=this.cobrarcontrolcarterasgenerales;
			} else {
				cobrarcontrolcarterasgeneralesLocal=this.cobrarcontrolcarterasgeneralesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
							
				
				


				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
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
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
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
			
			


			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
								
						
				


				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
								
				
				


				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
							
				
				


				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
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
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
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
			
			


			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
								
				
				


				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarControlCarterasGenerales")) {
					jCheckBoxSeleccionarTodosCobrarControlCarterasGeneralesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarControlCarterasGenerales")) {
					jCheckBoxSeleccionadosCobrarControlCarterasGeneralesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarControlCarterasGenerales")) {
					
				}
				
				


				
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
												
				
				


				
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
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
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
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
			
			


			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarcontrolcarterasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarcontrolcarterasgenerales);
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
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
				
				


				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarControlCarterasGenerales.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarControlCarterasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarControlCarterasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarcontrolcarterasgeneralesAnterior =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarControlCarterasGenerales")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarControlCarterasGeneralesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarControlCarterasGenerales.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarcontrolcarterasgenerales =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarcontrolcarterasgenerales);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarControlCarterasGenerales")) {
				
				}
				
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarControlCarterasGenerales")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarControlCarterasGenerales.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarControlCarterasGenerales")) {
			
			}
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarControlCarterasGenerales();
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarControlCarterasGenerales")) {
				jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarControlCarterasGenerales")) {
				jButtonDuplicarCobrarControlCarterasGeneralesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarControlCarterasGenerales")) {
				jButtonCopiarCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarControlCarterasGenerales")) {
				jButtonVerFormCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarControlCarterasGenerales")) {
				jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarControlCarterasGenerales")) {
				jButtonModificarCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarControlCarterasGenerales")) {
				jButtonActualizarCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarControlCarterasGenerales")) {
				jButtonEliminarCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarControlCarterasGenerales")) {
				jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarControlCarterasGenerales")) {
				jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarControlCarterasGenerales")) {
				jButtonCerrarCobrarControlCarterasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarControlCarterasGenerales")) {
				jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarControlCarterasGenerales")) {
				jButtonNuevoGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarControlCarterasGenerales")) {
				jButtonAbrirOrderByCobrarControlCarterasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarControlCarterasGenerales")) {
				jButtonRecargarInformacionCobrarControlCarterasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarControlCarterasGenerales")) {
				jButtonAnterioresCobrarControlCarterasGeneralesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarControlCarterasGenerales")) {
				jButtonSiguientesCobrarControlCarterasGeneralesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonidCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarControlCarterasGeneralesUpdate")) {
				this.jButtonid_empresaCobrarControlCarterasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonid_empresaCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtoncodigoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnombre_completoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("limite_creditoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("representanteCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonrepresentanteCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_pagoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtondia_pagoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisioCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonfecha_venceCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diasCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtondiasCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonsaldoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_pagoCobrarControlCarterasGeneralesBusqueda")) {
				this.jButtonhora_pagoCobrarControlCarterasGeneralesBusquedaActionPerformed(evt);
			}
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarControlCarterasGenerales();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarControlCarterasGenerales")) {
				closingInternalFrameCobrarControlCarterasGenerales();
				
			} else if(sTipo.equals("jButtonCancelarCobrarControlCarterasGenerales")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarControlCarterasGenerales = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarControlCarterasGeneralesBeanSwingJInternalFrame jInternalFrameParent=(CobrarControlCarterasGeneralesBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarControlCarterasGenerales.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(null);
			}
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),this.cobrarcontrolcarterasgeneralesParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarControlCarterasGenerales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarControlCarterasGenerales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarControlCarterasGenerales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarcontrolcarterasgenerales)) {
			if(!esControlTabla) {
				if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);			
				}
				
				if(this.cobrarcontrolcarterasgeneralesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesReturnGeneral,this.cobrarcontrolcarterasgeneralesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarcontrolcarterasgeneralesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarControlCarterasGenerales(classes,this.cobrarcontrolcarterasgeneralesReturnGeneral,this.cobrarcontrolcarterasgeneralesBean,false);
					}
						
					if(this.cobrarcontrolcarterasgeneralesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesReturnGeneral.getCobrarControlCarterasGenerales());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesReturnGeneral.getCobrarControlCarterasGenerales());	
					}
						
					if(this.cobrarcontrolcarterasgeneralesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgeneralesReturnGeneral.getCobrarControlCarterasGenerales(),classes);//this.cobrarcontrolcarterasgeneralesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,classes);//this.cobrarcontrolcarterasgeneralesBean);									
				}
			
				if(CobrarControlCarterasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarControlCarterasGenerales(this.cobrarcontrolcarterasgenerales);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarcontrolcarterasgeneralesAnterior!=null) {
						this.cobrarcontrolcarterasgenerales=this.cobrarcontrolcarterasgeneralesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarcontrolcarterasgeneralesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarcontrolcarterasgeneralesReturnGeneral.getCobrarControlCarterasGenerales(),cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarcontrolcarterasgeneralesReturnGeneral.getCobrarControlCarterasGenerales(),this.cobrarcontrolcarterasgeneraless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarControlCarterasGenerales.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarControlCarterasGenerales.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarControlCarterasGenerales();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarControlCarterasGenerales() throws Exception {
		
		CobrarControlCarterasGeneralesModel cobrarcontrolcarterasgeneralesModel=(CobrarControlCarterasGeneralesModel)this.jTableDatosCobrarControlCarterasGenerales.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarcontrolcarterasgeneralesModel.cobrarcontrolcarterasgeneraless=this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarcontrolcarterasgeneralesModel.cobrarcontrolcarterasgeneraless=this.cobrarcontrolcarterasgeneraless;
		}
		
		
		((CobrarControlCarterasGeneralesModel) this.jTableDatosCobrarControlCarterasGenerales.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarControlCarterasGenerales() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarcontrolcarterasgeneralesAnterior(),this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarcontrolcarterasgeneralesAnterior(),this.cobrarcontrolcarterasgeneraless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarControlCarterasGenerales();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
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
										
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),generalEntityParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarControlCarterasGeneralesConstantesFunciones.getClassesRelationshipsOfCobrarControlCarterasGenerales(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarControlCarterasGeneralesConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarControlCarterasGenerales(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarControlCarterasGenerales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarcontrolcarterasgenerales,new Object(),generalEntityParameterGeneral,this.cobrarcontrolcarterasgeneralesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarControlCarterasGenerales(CobrarControlCarterasGeneralesBean cobrarcontrolcarterasgeneralesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarControlCarterasGenerales(ArrayList<Classe> classes,CobrarControlCarterasGeneralesReturnGeneral cobrarcontrolcarterasgeneralesReturnGeneral,CobrarControlCarterasGeneralesBean cobrarcontrolcarterasgeneralesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarcontrolcarterasgenerales)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales = new CobrarControlCarterasGeneralesDetalleFormJInternalFrame(jDesktopPane,this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones(),this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setVisible(false);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.cobrarcontrolcarterasgeneralesLogic=this.cobrarcontrolcarterasgeneralesLogic;
		
		this.cargarCombosFrameForeignKeyCobrarControlCarterasGenerales("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarControlCarterasGenerales();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarControlCarterasGenerales();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarControlCarterasGenerales("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarControlCarterasGenerales();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarControlCarterasGenerales"));
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonModificarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"ModificarCobrarControlCarterasGenerales"));

		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonModificarToolBarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarControlCarterasGenerales"));
					
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemModificarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarControlCarterasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonActualizarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"ActualizarCobrarControlCarterasGenerales"));
		
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonActualizarToolBarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarControlCarterasGenerales"));
						
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemActualizarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarControlCarterasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonEliminarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"EliminarCobrarControlCarterasGenerales"));
		
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonEliminarToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarControlCarterasGenerales"));
								
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemEliminarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarControlCarterasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonCancelarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"CancelarCobrarControlCarterasGenerales"));
		
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonCancelarToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarControlCarterasGenerales"));
					
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemCancelarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarControlCarterasGenerales"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemDetalleCerrarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarControlCarterasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarControlCarterasGenerales"));
		
		
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarControlCarterasGenerales"));
		
		
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarControlCarterasGenerales"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonidCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarControlCarterasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonid_empresaCobrarControlCarterasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarControlCarterasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtoncodigoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"limite_creditoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"representanteCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"dia_pagoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisioCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondiasCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"diasCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonsaldoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"saldoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"hora_pagoCobrarControlCarterasGeneralesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTabbedPaneRelacionesCobrarControlCarterasGenerales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarControlCarterasGenerales"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarControlCarterasGenerales"));
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarControlCarterasGenerales"));
		}
		
		this.jTableDatosCobrarControlCarterasGenerales.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarControlCarterasGenerales"));
		
		this.jTableDatosCobrarControlCarterasGenerales.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarControlCarterasGenerales"));
		
		this.jButtonNuevoCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"NuevoCobrarControlCarterasGenerales"));
		
		this.jButtonDuplicarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"DuplicarCobrarControlCarterasGenerales"));
		
		this.jButtonCopiarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"CopiarCobrarControlCarterasGenerales"));
		
		this.jButtonVerFormCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"VerFormCobrarControlCarterasGenerales"));
		
		
		this.jButtonNuevoToolBarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarControlCarterasGenerales"));
			
		this.jButtonDuplicarToolBarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarControlCarterasGenerales"));
			
		this.jMenuItemNuevoCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarControlCarterasGenerales"));
			
		this.jMenuItemDuplicarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarControlCarterasGenerales"));		
		
		
		this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarControlCarterasGenerales"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarControlCarterasGenerales"));
			
		this.jMenuItemNuevoRelacionesCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarControlCarterasGenerales"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonModificarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"ModificarCobrarControlCarterasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonModificarToolBarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarControlCarterasGenerales"));
			
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemModificarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarControlCarterasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonActualizarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"ActualizarCobrarControlCarterasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonActualizarToolBarCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarControlCarterasGenerales"));
				
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemActualizarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarControlCarterasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonEliminarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"EliminarCobrarControlCarterasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonEliminarToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarControlCarterasGenerales"));
						
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemEliminarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarControlCarterasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonCancelarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"CancelarCobrarControlCarterasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonCancelarToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarControlCarterasGenerales"));
			
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemCancelarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarControlCarterasGenerales"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarControlCarterasGenerales"));		
		
		
		this.jButtonCerrarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"CerrarCobrarControlCarterasGenerales"));
		
		
		this.jButtonCerrarToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarControlCarterasGenerales"));
			
		this.jMenuItemCerrarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarControlCarterasGenerales"));
			
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jMenuItemDetalleCerrarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarControlCarterasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarControlCarterasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarControlCarterasGenerales"));
		}
		
		this.jButtonCopiarToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarControlCarterasGenerales"));
			
		this.jButtonVerFormToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarControlCarterasGenerales"));
		
		this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarControlCarterasGenerales"));
			
		this.jMenuItemCopiarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarControlCarterasGenerales"));		
		
		this.jMenuItemVerFormCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarControlCarterasGenerales"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarControlCarterasGenerales"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarControlCarterasGenerales"));
			
		this.jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarControlCarterasGenerales"));		
		
		
		
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarControlCarterasGenerales"));
					
		this.jButtonRecargarInformacionToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarControlCarterasGenerales"));
		
		this.jMenuItemRecargarInformacionCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarControlCarterasGenerales"));		
		
		
		
		this.jButtonAnterioresCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"AnterioresCobrarControlCarterasGenerales"));
		
		
		this.jButtonAnterioresToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarControlCarterasGenerales"));
		
		this.jMenuItemAnterioresCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarControlCarterasGenerales"));		
		
		
		this.jButtonSiguientesCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"SiguientesCobrarControlCarterasGenerales"));
		
		
		this.jButtonSiguientesToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarControlCarterasGenerales"));
			
		this.jMenuItemSiguientesCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarControlCarterasGenerales"));
			
		this.jMenuItemAbrirOrderByCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarControlCarterasGenerales"));
			
		this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarControlCarterasGenerales"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarControlCarterasGenerales"));
			
		this.jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarControlCarterasGenerales"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarControlCarterasGenerales"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarControlCarterasGenerales"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarControlCarterasGenerales"));

		this.jCheckBoxSeleccionadosCobrarControlCarterasGenerales.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarControlCarterasGenerales"));
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarControlCarterasGenerales"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarControlCarterasGenerales"));
			
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarControlCarterasGenerales"));
					
		this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarControlCarterasGenerales"));
			
		this.jTextFieldValorCampoGeneralCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarControlCarterasGenerales"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonidCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarControlCarterasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonid_empresaCobrarControlCarterasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarControlCarterasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtoncodigoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"limite_creditoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"representanteCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"dia_pagoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisioCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondiasCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"diasCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonsaldoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"saldoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"hora_pagoCobrarControlCarterasGeneralesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"BusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales!=null) {
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarControlCarterasGenerales"));
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarControlCarterasGenerales"));
				this.jInternalFrameReporteDinamicoCobrarControlCarterasGenerales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarControlCarterasGenerales"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarControlCarterasGenerales"));				
			//this.jButtonGenerarReporteDinamicoCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarControlCarterasGenerales"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarControlCarterasGenerales"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarControlCarterasGenerales!=null) {
				this.jInternalFrameImportacionCobrarControlCarterasGenerales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarControlCarterasGenerales"));
				this.jInternalFrameImportacionCobrarControlCarterasGenerales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarControlCarterasGenerales"));
				this.jInternalFrameImportacionCobrarControlCarterasGenerales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarControlCarterasGenerales"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarControlCarterasGenerales"));
			
			this.jButtonAbrirOrderByToolBarCobrarControlCarterasGenerales.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarControlCarterasGenerales"));			
			
			if(this.jInternalFrameOrderByCobrarControlCarterasGenerales!=null) {
				this.jInternalFrameOrderByCobrarControlCarterasGenerales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarControlCarterasGenerales"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTabbedPaneRelacionesCobrarControlCarterasGenerales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarControlCarterasGenerales"));
		
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
            		closingInternalFrameCobrarControlCarterasGenerales();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarControlCarterasGenerales = (JInternalFrameBase)event.getSource();
	            	
	            CobrarControlCarterasGeneralesBeanSwingJInternalFrame jInternalFrameParent=(CobrarControlCarterasGeneralesBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarControlCarterasGenerales.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarControlCarterasGenerales.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarControlCarterasGeneralesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarControlCarterasGenerales.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarControlCarterasGenerales.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarControlCarterasGenerales";
		inputMap = this.jButtonNuevoCobrarControlCarterasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarControlCarterasGenerales";
		inputMap = this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarControlCarterasGeneralesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarControlCarterasGenerales";
		inputMap = this.jButtonModificarCobrarControlCarterasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarControlCarterasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarControlCarterasGenerales";
		inputMap = this.jButtonActualizarCobrarControlCarterasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarControlCarterasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarControlCarterasGenerales";
		inputMap = this.jButtonEliminarCobrarControlCarterasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarControlCarterasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarControlCarterasGenerales";
		inputMap = this.jButtonCancelarCobrarControlCarterasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarControlCarterasGenerales";
		inputMap = this.jButtonCerrarCobrarControlCarterasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarControlCarterasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarControlCarterasGenerales";
		inputMap = this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosCobrarControlCarterasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonGuardarCambiosCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarControlCarterasGenerales.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarControlCarterasGeneralesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarControlCarterasGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarControlCarterasGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarControlCarterasGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarControlCarterasGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonidCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarControlCarterasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonid_empresaCobrarControlCarterasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarControlCarterasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtoncodigoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"limite_creditoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"representanteCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"dia_pagoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisioCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondiasCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"diasCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonsaldoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"saldoCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localCobrarControlCarterasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"hora_pagoCobrarControlCarterasGeneralesBusqueda"));
		
		
		this.jButtonBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales.addActionListener(new ButtonActionListener(this,"BusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarControlCarterasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarControlCarterasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarControlCarterasGeneralesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarControlCarterasGenerales.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarControlCarterasGenerales(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
					cobrarcontrolcarterasgeneralesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneraless) {
					cobrarcontrolcarterasgeneralesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarControlCarterasGeneralesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
						cobrarcontrolcarterasgeneralesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneraless) {
						cobrarcontrolcarterasgeneralesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneraless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarControlCarterasGenerales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarControlCarterasGenerales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarControlCarterasGeneralesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarControlCarterasGenerales.getSelectedRows();
			
			CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesLocal=new CobrarControlCarterasGenerales();
			
			//this.seleccionarTodosCobrarControlCarterasGenerales(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarcontrolcarterasgeneralesLocal =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless().toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarcontrolcarterasgeneralesLocal =(CobrarControlCarterasGenerales) this.cobrarcontrolcarterasgeneraless.toArray()[this.jTableDatosCobrarControlCarterasGenerales.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarcontrolcarterasgeneralesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
						cobrarcontrolcarterasgeneralesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneraless) {
						cobrarcontrolcarterasgeneralesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarControlCarterasGenerales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarControlCarterasGenerales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarControlCarterasGenerales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarControlCarterasGeneralesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarControlCarterasGeneralesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarControlCarterasGeneralesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarControlCarterasGenerales.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
				
						if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setlimite_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setrepresentante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setdia_pago(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.settelefono_telefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setfecha_emisio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setdias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.sethora_pago(Time.valueOf(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneraless) {
					
						if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setlimite_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setrepresentante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setdia_pago(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.settelefono_telefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setfecha_emisio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setdias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO)) {
							existe=true;
							cobrarcontrolcarterasgeneralesAux.sethora_pago(Time.valueOf(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarControlCarterasGeneralesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarControlCarterasGenerales=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarControlCarterasGenerales) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarControlCarterasGenerales(conSplash);
				
					this.generarReporteCobrarControlCarterasGeneralessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarControlCarterasGeneralessSeleccionados();
				//this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarControlCarterasGeneralessSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarControlCarterasGeneralessSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarControlCarterasGenerales();
				
				this.exportarCobrarControlCarterasGeneralessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarControlCarterasGeneraless();
				//this.importarCobrarControlCarterasGeneraless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarControlCarterasGenerales();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarControlCarterasGeneralessSeleccionados();
				//this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Control Carteras Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarControlCarterasGenerales();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarControlCarterasGenerales)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarControlCarterasGenerales(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Control Carteras Generales",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarControlCarterasGeneralesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarControlCarterasGenerales) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarControlCarterasGenerales(conSplash);
					
						//this.actualizarParametrosGeneralCobrarControlCarterasGenerales();
						
						this.generarReporteProcesoAccionCobrarControlCarterasGeneralessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Control Carteras GeneralesES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Control Carteras Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarControlCarterasGenerales();
				
						this.actualizarParametrosGeneralCobrarControlCarterasGenerales();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarcontrolcarterasgeneralesReturnGeneral=cobrarcontrolcarterasgeneralesLogic.procesarAccionCobrarControlCarterasGeneralessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless(),this.cobrarcontrolcarterasgeneralesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarControlCarterasGeneralesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarControlCarterasGenerales();
					
					CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarControlCarterasGeneralesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarControlCarterasGenerales(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarControlCarterasGeneralesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarControlCarterasGenerales();
			
			if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();		
			CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales=new CobrarControlCarterasGenerales();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales.getSelectedItem();
			
			
			
			
			cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarcontrolcarterasgeneralessSeleccionados.size()==1) {
				for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneralessSeleccionados) {
					cobrarcontrolcarterasgenerales=cobrarcontrolcarterasgeneralesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarControlCarterasGenerales();
			
      		//this.finishProcessCobrarControlCarterasGenerales(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarControlCarterasGeneralesReturnGeneral() throws Exception {
		if(this.cobrarcontrolcarterasgeneralesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarcontrolcarterasgeneralesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarcontrolcarterasgeneralesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarcontrolcarterasgeneralesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarcontrolcarterasgeneralesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarcontrolcarterasgeneralesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
		}
		
		if(this.cobrarcontrolcarterasgeneralesReturnGeneral.getConRetornoLista() || this.cobrarcontrolcarterasgeneralesReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarcontrolcarterasgeneralesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarcontrolcarterasgeneralesLogic.setCobrarControlCarterasGeneraless(this.cobrarcontrolcarterasgeneralesReturnGeneral.getCobrarControlCarterasGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarControlCarterasGenerales(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarControlCarterasGenerales() throws Exception {
		
		
	}
	
	public ArrayList<CobrarControlCarterasGenerales> getCobrarControlCarterasGeneralessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarControlCarterasGenerales) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless()) {
					if(cobrarcontrolcarterasgeneralesAux.getIsSelected()) {
						cobrarcontrolcarterasgeneralessSeleccionados.add(cobrarcontrolcarterasgeneralesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:this.cobrarcontrolcarterasgeneraless) {
					if(cobrarcontrolcarterasgeneralesAux.getIsSelected()) {
						cobrarcontrolcarterasgeneralessSeleccionados.add(cobrarcontrolcarterasgeneralesAux);				
					}
				}
			}
			
			if(cobrarcontrolcarterasgeneralessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarcontrolcarterasgeneralessSeleccionados.addAll(this.cobrarcontrolcarterasgeneralesLogic.getCobrarControlCarterasGeneraless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarcontrolcarterasgeneralessSeleccionados.addAll(this.cobrarcontrolcarterasgeneraless);				
					}
				}
			}
		} else {
			cobrarcontrolcarterasgeneralessSeleccionados.add(this.cobrarcontrolcarterasgenerales);
		}
		
		return cobrarcontrolcarterasgeneralessSeleccionados;
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
	
	public void generarReporteCobrarControlCarterasGeneralessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarControlCarterasGeneralessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarControlCarterasGeneralessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarControlCarterasGeneralessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarControlCarterasGeneralessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Control Carteras Generales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarControlCarterasGeneralessSeleccionados() throws Exception {
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();		
		
		cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarControlCarterasGeneraless("Todos",cobrarcontrolcarterasgeneralessSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarControlCarterasGeneralessSeleccionados() throws Exception {
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();		
		
		cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarControlCarterasGeneraless("Todos",cobrarcontrolcarterasgeneralessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarControlCarterasGeneralessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();
		
		cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarControlCarterasGeneraless("Todos",cobrarcontrolcarterasgeneralessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarControlCarterasGeneralessSeleccionados() throws Exception {
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarControlCarterasGenerales();
		
		
		cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarControlCarterasGenerales();
		
		
		//this.generarReporteCobrarControlCarterasGeneraless("Todos",cobrarcontrolcarterasgeneralessSeleccionados ,cobrarcontrolcarterasgeneralesImplementable,cobrarcontrolcarterasgeneralesImplementableHome);
	}
	
	public void mostrarImportacionCobrarControlCarterasGeneraless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarControlCarterasGenerales();
		
		this.abrirFrameImportacionCobrarControlCarterasGenerales();		
		
			
		//this.generarReporteCobrarControlCarterasGeneraless("Todos",cobrarcontrolcarterasgeneralessSeleccionados ,cobrarcontrolcarterasgeneralesImplementable,cobrarcontrolcarterasgeneralesImplementableHome);
	}
	
	public void importarCobrarControlCarterasGeneraless() throws Exception {		
	
	}
	
	public void exportarCobrarControlCarterasGeneralessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarControlCarterasGeneralessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarControlCarterasGeneralessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarControlCarterasGeneralessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Control Carteras Generales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarControlCarterasGeneralessSeleccionados() throws Exception {
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();		
		
		cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarcontrolcarterasgenerales."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarControlCarterasGenerales(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneralessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarControlCarterasGenerales(cobrarcontrolcarterasgeneralesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarcontrolcarterasgeneralesAux.setsDetalleGeneralEntityReporte(cobrarcontrolcarterasgeneralesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Control Carteras Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarControlCarterasGenerales(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarcontrolcarterasgenerales.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getnombre_vendedor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getlimite_credito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getrepresentante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getdia_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getdireccion_direccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.gettelefono_telefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getfecha_emisio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getfecha_vence().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getdias().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getsaldo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getdebito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.getcredito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarcontrolcarterasgenerales.gethora_pago().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarControlCarterasGeneralessSeleccionados() throws Exception {
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();		
		
		cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarcontrolcarterasgenerales.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarControlCarterasGeneraless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarControlCarterasGenerales(row);				
				iRow++;
			}				
			
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneralessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarControlCarterasGenerales(cobrarcontrolcarterasgeneralesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Control Carteras Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarControlCarterasGeneralessSeleccionados() throws Exception {
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();		
		
		cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarcontrolcarterasgenerales.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarcontrolcarterasgeneraless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarcontrolcarterasgenerales");
			//elementRoot.appendChild(element);
		
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneralessSeleccionados) {
				element = document.createElement("cobrarcontrolcarterasgenerales");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarControlCarterasGenerales(cobrarcontrolcarterasgeneralesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Control Carteras Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarControlCarterasGenerales(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_vendedor());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getlimite_credito());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getrepresentante());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getdia_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getdireccion_direccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.gettelefono_telefono());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getfecha_emisio());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getfecha_vence());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getdias());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getsaldo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getdebito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.getcredito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarcontrolcarterasgenerales.gethora_pago());				
	}
	
	public void setFilaDatosExportarXmlCobrarControlCarterasGenerales(CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_emision_hasta = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_ciudad = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementnombre_zona = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnombre_vendedor = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.NOMBREVENDEDOR);
		elementnombre_vendedor.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getnombre_vendedor().trim()));
		element.appendChild(elementnombre_vendedor);

		Element elementcodigo = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementlimite_credito = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.LIMITECREDITO);
		elementlimite_credito.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getlimite_credito().toString().trim()));
		element.appendChild(elementlimite_credito);

		Element elementrepresentante = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.REPRESENTANTE);
		elementrepresentante.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getrepresentante().trim()));
		element.appendChild(elementrepresentante);

		Element elementdia_pago = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.DIAPAGO);
		elementdia_pago.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getdia_pago().toString().trim()));
		element.appendChild(elementdia_pago);

		Element elementnumero_comprobante = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementnumero_factura = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementdireccion_direccion = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.DIRECCIONDIRECCION);
		elementdireccion_direccion.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getdireccion_direccion().trim()));
		element.appendChild(elementdireccion_direccion);

		Element elementtelefono_telefono = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.TELEFONOTELEFONO);
		elementtelefono_telefono.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.gettelefono_telefono().trim()));
		element.appendChild(elementtelefono_telefono);

		Element elementfecha_emisio = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.FECHAEMISIO);
		elementfecha_emisio.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getfecha_emisio().toString().trim()));
		element.appendChild(elementfecha_emisio);

		Element elementfecha_vence = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.FECHAVENCE);
		elementfecha_vence.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getfecha_vence().toString().trim()));
		element.appendChild(elementfecha_vence);

		Element elementdias = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.DIAS);
		elementdias.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getdias().toString().trim()));
		element.appendChild(elementdias);

		Element elementsaldo = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);

		Element elementdebito_mone_local = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.DEBITOMONELOCAL);
		elementdebito_mone_local.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getdebito_mone_local().toString().trim()));
		element.appendChild(elementdebito_mone_local);

		Element elementcredito_mone_local = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.CREDITOMONELOCAL);
		elementcredito_mone_local.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.getcredito_mone_local().toString().trim()));
		element.appendChild(elementcredito_mone_local);

		Element elementhora_pago = document.createElement(CobrarControlCarterasGeneralesConstantesFunciones.HORAPAGO);
		elementhora_pago.appendChild(document.createTextNode(cobrarcontrolcarterasgenerales.gethora_pago().toString().trim()));
		element.appendChild(elementhora_pago);
	}
	
	public void generarReporteGroupGenericoCobrarControlCarterasGeneralessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados=new ArrayList<CobrarControlCarterasGenerales>();
		
		cobrarcontrolcarterasgeneralessSeleccionados=this.getCobrarControlCarterasGeneralessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarControlCarterasGenerales(cobrarcontrolcarterasgeneralessSeleccionados);
		
		this.generarReporteCobrarControlCarterasGeneraless("Todos",cobrarcontrolcarterasgeneralessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarControlCarterasGenerales(ArrayList<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneralessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarControlCarterasGenerales cobrarcontrolcarterasgeneralesAux:cobrarcontrolcarterasgeneralessSeleccionados) {
				cobrarcontrolcarterasgeneralesAux.setsDetalleGeneralEntityReporte(cobrarcontrolcarterasgeneralesAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarcontrolcarterasgeneralesAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getnombre_vendedor());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getrepresentante());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getdia_pago().toString());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getdireccion_direccion());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.gettelefono_telefono());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarcontrolcarterasgeneralesAux.getfecha_emisio()));
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarcontrolcarterasgeneralesAux.getfecha_vence()));
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.getdias().toString());
				}
				 else if(sTipoSeleccionar.equals(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO)) {
					existe=true;
					cobrarcontrolcarterasgeneralesAux.setsDescripcionGeneralEntityReporte1(cobrarcontrolcarterasgeneralesAux.gethora_pago().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarControlCarterasGenerales(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarControlCarterasGeneralesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=true;
		} else {
			this.actualizarEstadoPanelsCobrarControlCarterasGenerales(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarControlCarterasGenerales=false;
			//this.isVisibilidadCeldaVerFormCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaDuplicarCobrarControlCarterasGenerales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;												
			}
			
			this.jButtonCerrarCobrarControlCarterasGenerales.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarcontrolcarterasgenerales)) {
			this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=false;
			this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarControlCarterasGenerales=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarControlCarterasGenerales=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarControlCarterasGenerales=false;
		//this.isVisibilidadCeldaModificarCobrarControlCarterasGenerales=true;
		this.isVisibilidadCeldaActualizarCobrarControlCarterasGenerales=false;
		this.isVisibilidadCeldaEliminarCobrarControlCarterasGenerales=false;
		//this.isVisibilidadCeldaCancelarCobrarControlCarterasGenerales=true;			
		this.isVisibilidadCeldaGuardarCobrarControlCarterasGenerales=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarControlCarterasGenerales() {
	}
	
	public void actualizarEstadoPanelsCobrarControlCarterasGenerales(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales!=null) {
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosCobrarControlCarterasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarControlCarterasGenerales!=null) {
				this.jPanelPaginacionCobrarControlCarterasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarControlCarterasGenerales!=null) {
				this.jPanelParametrosReportesCobrarControlCarterasGenerales.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales!=null) {
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosCobrarControlCarterasGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarControlCarterasGenerales!=null) {
				this.jPanelPaginacionCobrarControlCarterasGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarControlCarterasGenerales!=null) {
				this.jPanelParametrosReportesCobrarControlCarterasGenerales.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales!=null) {
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosCobrarControlCarterasGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarControlCarterasGenerales!=null) {
				this.jPanelPaginacionCobrarControlCarterasGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarControlCarterasGenerales!=null) {
				this.jPanelParametrosReportesCobrarControlCarterasGenerales.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales!=null) {
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosCobrarControlCarterasGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarControlCarterasGenerales!=null) {
				this.jPanelPaginacionCobrarControlCarterasGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarControlCarterasGenerales!=null) {
				this.jPanelParametrosReportesCobrarControlCarterasGenerales.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales!=null) {
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosCobrarControlCarterasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarControlCarterasGenerales!=null) {
				this.jPanelPaginacionCobrarControlCarterasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarControlCarterasGenerales!=null) {
				this.jPanelParametrosReportesCobrarControlCarterasGenerales.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales!=null) {
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosCobrarControlCarterasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarControlCarterasGenerales!=null) {
				this.jPanelPaginacionCobrarControlCarterasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarControlCarterasGenerales!=null) {
				this.jPanelParametrosReportesCobrarControlCarterasGenerales.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales!=null) {
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarControlCarterasGenerales!=null) {
				this.jScrollPanelDatosCobrarControlCarterasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarControlCarterasGenerales!=null) {
				this.jPanelPaginacionCobrarControlCarterasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarControlCarterasGenerales!=null) {
				this.jPanelParametrosReportesCobrarControlCarterasGenerales.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales!=null) {
					this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarControlCarterasGenerales!=null) {
				this.jPanelParametrosReportesCobrarControlCarterasGenerales.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales!=null) {
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarControlCarterasGenerales!=null) {
				this.jPanelParametrosReportesCobrarControlCarterasGenerales.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarControlCarterasGenerales=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarControlCarterasGenerales) {this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.remove(jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);}
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
			
			this.inicializarActualizarBindingTablaCobrarControlCarterasGenerales(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarControlCarterasGenerales() {
		this.updateBorderResaltarBusquedasFormularioCobrarControlCarterasGenerales();
		this.updateVisibilidadBusquedasFormularioCobrarControlCarterasGenerales();
		this.updateHabilitarBusquedasFormularioCobrarControlCarterasGenerales();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarControlCarterasGenerales() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.getComponents().length>0) {
	

		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales!=null) {
			index= this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.indexOfComponent(this.jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.getComponent(index);
				jPanel.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarControlCarterasGenerales() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.indexOfComponent(this.jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);
			if(!this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales && index>-1) {
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarControlCarterasGenerales() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.indexOfComponent(this.jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);
				this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setEnabledAt(index,this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarControlCarterasGenerales(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarControlCarterasGenerales")) {
			index= this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.indexOfComponent(this.jPanelBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);

			this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarControlCarterasGenerales.getComponent(index);

			this.cobrarcontrolcarterasgeneralesConstantesFunciones.setResaltarBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales(resaltar);

			jPanel.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarBusquedaCobrarControlCarterasGeneralesCobrarControlCarterasGenerales);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarControlCarterasGenerales.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarControlCarterasGenerales() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarControlCarterasGenerales();
		this.updateVisibilidadResaltarControlesFormularioCobrarControlCarterasGenerales();
		this.updateHabilitarResaltarControlesFormularioCobrarControlCarterasGenerales();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarControlCarterasGenerales() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltaridCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltaridCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarid_empresaCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarid_empresaCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarfecha_emision_hastaCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarfecha_emision_hastaCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_ciudadCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_ciudadCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_ciudadCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_zonaCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnombre_zonaCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_zonaCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_vendedorCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_vendedorCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_vendedorCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarcodigoCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcodigoCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarcodigoCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_completoCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_completoCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnombre_completoCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarlimite_creditoCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldlimite_creditoCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarlimite_creditoCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarrepresentanteCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextArearepresentanteCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarrepresentanteCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardia_pagoCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddia_pagoCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardia_pagoCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnumero_comprobanteCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnumero_comprobanteCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnumero_facturaCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_facturaCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarnumero_facturaCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardireccion_direccionCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreadireccion_direccionCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardireccion_direccionCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltartelefono_telefonoCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltartelefono_telefonoCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarfecha_emisioCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emisioCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarfecha_emisioCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarfecha_venceCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_venceCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarfecha_venceCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardiasCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddiasCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardiasCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarsaldoCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldsaldoCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarsaldoCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardebito_mone_localCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddebito_mone_localCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltardebito_mone_localCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarcredito_mone_localCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarcredito_mone_localCobrarControlCarterasGenerales);}
		if(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarhora_pagoCobrarControlCarterasGenerales!=null && this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jSpinnerhora_pagoCobrarControlCarterasGenerales.setBorder(this.cobrarcontrolcarterasgeneralesConstantesFunciones.resaltarhora_pagoCobrarControlCarterasGenerales);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarControlCarterasGenerales() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
	
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostraridCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelidCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostraridCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarid_empresaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelid_empresaCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarid_empresaCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarfecha_emision_hastaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelfecha_emision_hastaCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarfecha_emision_hastaCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_ciudadCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_ciudadCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelnombre_ciudadCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_ciudadCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnombre_zonaCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_zonaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelnombre_zonaCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_zonaCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_vendedorCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_vendedorCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelnombre_vendedorCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_vendedorCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcodigoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarcodigoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelcodigoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarcodigoCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_completoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_completoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelnombre_completoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnombre_completoCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldlimite_creditoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarlimite_creditoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanellimite_creditoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarlimite_creditoCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextArearepresentanteCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarrepresentanteCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelrepresentanteCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarrepresentanteCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddia_pagoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardia_pagoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPaneldia_pagoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardia_pagoCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnumero_comprobanteCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelnumero_comprobanteCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnumero_comprobanteCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_facturaCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnumero_facturaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelnumero_facturaCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarnumero_facturaCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreadireccion_direccionCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardireccion_direccionCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPaneldireccion_direccionCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardireccion_direccionCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrartelefono_telefonoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPaneltelefono_telefonoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrartelefono_telefonoCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emisioCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarfecha_emisioCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelfecha_emisioCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarfecha_emisioCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_venceCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarfecha_venceCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelfecha_venceCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarfecha_venceCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddiasCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardiasCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPaneldiasCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardiasCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldsaldoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarsaldoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelsaldoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarsaldoCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddebito_mone_localCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardebito_mone_localCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPaneldebito_mone_localCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrardebito_mone_localCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarcredito_mone_localCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelcredito_mone_localCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarcredito_mone_localCobrarControlCarterasGenerales);
		//this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jSpinnerhora_pagoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarhora_pagoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jPanelhora_pagoCobrarControlCarterasGenerales.setVisible(this.cobrarcontrolcarterasgeneralesConstantesFunciones.mostrarhora_pagoCobrarControlCarterasGenerales);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarControlCarterasGenerales() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarControlCarterasGenerales!=null) {
	
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jLabelidCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activaridCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jComboBoxid_empresaCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarid_empresaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarfecha_emision_hastaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_ciudadCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_ciudadCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnombre_zonaCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_zonaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_vendedorCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_vendedorCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcodigoCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarcodigoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreanombre_completoCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnombre_completoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldlimite_creditoCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarlimite_creditoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextArearepresentanteCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarrepresentanteCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddia_pagoCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardia_pagoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnumero_comprobanteCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldnumero_facturaCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarnumero_facturaCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreadireccion_direccionCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardireccion_direccionCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activartelefono_telefonoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_emisioCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarfecha_emisioCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jDateChooserfecha_venceCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarfecha_venceCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddiasCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardiasCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldsaldoCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarsaldoCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFielddebito_mone_localCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activardebito_mone_localCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarcredito_mone_localCobrarControlCarterasGenerales);
		this.jInternalFrameDetalleFormCobrarControlCarterasGenerales.jSpinnerhora_pagoCobrarControlCarterasGenerales.setEnabled(this.cobrarcontrolcarterasgeneralesConstantesFunciones.activarhora_pagoCobrarControlCarterasGenerales);
		}
	}
	
		
}