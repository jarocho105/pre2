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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.AutoriSriConstantesFunciones;
import com.bydan.erp.facturacion.util.AutoriSriParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.AutoriSriParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.AutoriSriBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class AutoriSriBeanSwingJInternalFrame extends AutoriSriJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AutoriSriBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AutoriSri> autorisriValidator = new ClassValidator<AutoriSri>(AutoriSri.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AutoriSri autorisri;	
	public AutoriSri autorisriAux;
	public AutoriSri autorisriAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AutoriSri autorisriTotales;
	public Long idAutoriSriActual;
	public Long iIdNuevoAutoriSri=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboTipoDocumentoGeneral="";

	public List<TipoDocumentoGeneral> tipodocumentogeneralsForeignKey;

	public List<TipoDocumentoGeneral> gettipodocumentogeneralsForeignKey() {
		return tipodocumentogeneralsForeignKey;
	}

	public void settipodocumentogeneralsForeignKey(List<TipoDocumentoGeneral> tipodocumentogeneralsForeignKey) {
		this.tipodocumentogeneralsForeignKey = tipodocumentogeneralsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDocumentoGeneral tipodocumentogeneralForeignKey;

	public TipoDocumentoGeneral gettipodocumentogeneralForeignKey() {
		return tipodocumentogeneralForeignKey;
	}

	public void settipodocumentogeneralForeignKey(TipoDocumentoGeneral tipodocumentogeneralForeignKey) {
		this.tipodocumentogeneralForeignKey = tipodocumentogeneralForeignKey;
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
	
	public Boolean isPermisoTodoAutoriSri;
	public Boolean isPermisoNuevoAutoriSri;
	public Boolean isPermisoActualizarAutoriSri;
	public Boolean isPermisoActualizarOriginalAutoriSri;
	public Boolean isPermisoEliminarAutoriSri;
	public Boolean isPermisoGuardarCambiosAutoriSri;
	public Boolean isPermisoConsultaAutoriSri;
	public Boolean isPermisoBusquedaAutoriSri;
	public Boolean isPermisoReporteAutoriSri;
	public Boolean isPermisoPaginacionMedioAutoriSri;
	public Boolean isPermisoPaginacionAltoAutoriSri;
	public Boolean isPermisoPaginacionTodoAutoriSri;
	public Boolean isPermisoCopiarAutoriSri;
	public Boolean isPermisoVerFormAutoriSri;
	public Boolean isPermisoDuplicarAutoriSri;
	public Boolean isPermisoOrdenAutoriSri;
	
	
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
	
	public AutoriSriParameterReturnGeneral autorisriReturnGeneral;
	public AutoriSriParameterReturnGeneral autorisriParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAutoriSri=false;
	public Boolean esParaAccionDesdeFormularioAutoriSri=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AutoriSriSessionBeanAdditional autorisriSessionBeanAdditional=null;
	
	public AutoriSriSessionBeanAdditional getAutoriSriSessionBeanAdditional() {
		return this.autorisriSessionBeanAdditional;
	}
	
	public void setAutoriSriSessionBeanAdditional(AutoriSriSessionBeanAdditional autorisriSessionBeanAdditional) {
		try {
			this.autorisriSessionBeanAdditional=autorisriSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AutoriSriBeanSwingJInternalFrameAdditional autorisriBeanSwingJInternalFrameAdditional=null;
	//public class AutoriSriBeanSwingJInternalFrame
	
	public AutoriSriBeanSwingJInternalFrameAdditional getAutoriSriBeanSwingJInternalFrameAdditional() {
		return this.autorisriBeanSwingJInternalFrameAdditional;
	}
	
	public void setAutoriSriBeanSwingJInternalFrameAdditional(AutoriSriBeanSwingJInternalFrameAdditional autorisriBeanSwingJInternalFrameAdditional) {
		try {
			this.autorisriBeanSwingJInternalFrameAdditional=autorisriBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AutoriSriLogic autorisriLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AutoriSri autorisriBean;
	public AutoriSriConstantesFunciones autorisriConstantesFunciones;
	//public AutoriSriParameterReturnGeneral autorisriReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TipoDocumentoGeneralLogic tipodocumentogeneralLogic;
	
	//PARAMETROS
	
	
	//public List<AutoriSri> autorisris;	
	//public List<AutoriSri> autorisrisEliminados;
	//public List<AutoriSri> autorisrisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAutoriSri=false;
	public Boolean isVisibilidadCeldaDuplicarAutoriSri=true;
	public Boolean isVisibilidadCeldaCopiarAutoriSri=true;
	public Boolean isVisibilidadCeldaVerFormAutoriSri=true;
	public Boolean isVisibilidadCeldaOrdenAutoriSri=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAutoriSri=false;
	public Boolean isVisibilidadCeldaModificarAutoriSri=false;
	public Boolean isVisibilidadCeldaActualizarAutoriSri=false;
	public Boolean isVisibilidadCeldaEliminarAutoriSri=false;
	public Boolean isVisibilidadCeldaCancelarAutoriSri=false;
	public Boolean isVisibilidadCeldaGuardarAutoriSri=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAutoriSri=false;	
	
	
	public Boolean isVisibilidadBusquedaPorFechaFin=false;
	public Boolean isVisibilidadBusquedaPorFechaInicio=false;
	public Boolean isVisibilidadBusquedaPorNumeroAutor=false;
	public Boolean isVisibilidadBusquedaPorNumeroSecuencial=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoDocumentoGeneral=false;
	
	public Long getiIdNuevoAutoriSri() {
		return this.iIdNuevoAutoriSri;
	}

	public void setiIdNuevoAutoriSri(Long iIdNuevoAutoriSri) {
		this.iIdNuevoAutoriSri = iIdNuevoAutoriSri;
	}
	
	public Long getidAutoriSriActual() {
		return this.idAutoriSriActual;
	}

	public void setidAutoriSriActual(Long idAutoriSriActual) {
		this.idAutoriSriActual = idAutoriSriActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AutoriSri getautorisri() {
		return this.autorisri;
	}

	public void setautorisri(AutoriSri autorisri) {
		this.autorisri = autorisri;
	}
	
	public AutoriSri getautorisriAux() {
		return this.autorisriAux;
	}

	public void setautorisriAux(AutoriSri autorisriAux) {
		this.autorisriAux = autorisriAux;
	}				
	
	public AutoriSri getautorisriAnterior() {
		return this.autorisriAnterior;
	}

	public void setautorisriAnterior(AutoriSri autorisriAnterior) {
		this.autorisriAnterior = autorisriAnterior;
	}	
	
	public AutoriSri getautorisriTotales() {
		return this.autorisriTotales;
	}

	public void setautorisriTotales(AutoriSri autorisriTotales) {
		this.autorisriTotales = autorisriTotales;
	}	
	
	public AutoriSri getautorisriBean() {
		return this.autorisriBean;
	}

	public void setautorisriBean(AutoriSri autorisriBean) {
		this.autorisriBean = autorisriBean;
	}	
	
	public AutoriSriParameterReturnGeneral getautorisriReturnGeneral() {
		return this.autorisriReturnGeneral;
	}

	public void setautorisriReturnGeneral(AutoriSriParameterReturnGeneral autorisriReturnGeneral) {
		this.autorisriReturnGeneral = autorisriReturnGeneral;
	}	
	
	
	public Date fecha_finBusquedaPorFechaFin=new Date();

	public Date getfecha_finBusquedaPorFechaFin() {
		return this.fecha_finBusquedaPorFechaFin;
	}

	public void setfecha_finBusquedaPorFechaFin(Date fecha_finBusquedaPorFechaFin) {
		this.fecha_finBusquedaPorFechaFin = fecha_finBusquedaPorFechaFin;
	}

	public Date fecha_inicioBusquedaPorFechaInicio=new Date();

	public Date getfecha_inicioBusquedaPorFechaInicio() {
		return this.fecha_inicioBusquedaPorFechaInicio;
	}

	public void setfecha_inicioBusquedaPorFechaInicio(Date fecha_inicioBusquedaPorFechaInicio) {
		this.fecha_inicioBusquedaPorFechaInicio = fecha_inicioBusquedaPorFechaInicio;
	}

	public String numero_autorBusquedaPorNumeroAutor="";

	public String getnumero_autorBusquedaPorNumeroAutor() {
		return this.numero_autorBusquedaPorNumeroAutor;
	}

	public void setnumero_autorBusquedaPorNumeroAutor(String numero_autorBusquedaPorNumeroAutor) {
		this.numero_autorBusquedaPorNumeroAutor = numero_autorBusquedaPorNumeroAutor;
	}

	public String numero_secuencialBusquedaPorNumeroSecuencial="";

	public String getnumero_secuencialBusquedaPorNumeroSecuencial() {
		return this.numero_secuencialBusquedaPorNumeroSecuencial;
	}

	public void setnumero_secuencialBusquedaPorNumeroSecuencial(String numero_secuencialBusquedaPorNumeroSecuencial) {
		this.numero_secuencialBusquedaPorNumeroSecuencial = numero_secuencialBusquedaPorNumeroSecuencial;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_documento_generalFK_IdTipoDocumentoGeneral=-1L;

	public Long getid_tipo_documento_generalFK_IdTipoDocumentoGeneral() {
		return this.id_tipo_documento_generalFK_IdTipoDocumentoGeneral;
	}

	public void setid_tipo_documento_generalFK_IdTipoDocumentoGeneral(Long id_tipo_documento_generalFK_IdTipoDocumentoGeneral) {
		this.id_tipo_documento_generalFK_IdTipoDocumentoGeneral = id_tipo_documento_generalFK_IdTipoDocumentoGeneral;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AutoriSriLogic getAutoriSriLogic()	{		
		return autorisriLogic;
	}

	public void setAutoriSriLogic(AutoriSriLogic autorisriLogic) {
		this.autorisriLogic = autorisriLogic;
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
	
	public Boolean getIsEsNuevoAutoriSri() {
		return isEsNuevoAutoriSri;
	}

	public void setIsEsNuevoAutoriSri(Boolean isEsNuevoAutoriSri) {
		this.isEsNuevoAutoriSri = isEsNuevoAutoriSri;
	}

	public Boolean getEsParaAccionDesdeFormularioAutoriSri() {
		return esParaAccionDesdeFormularioAutoriSri;
	}
	
	public void setEsParaAccionDesdeFormularioAutoriSri(Boolean esParaAccionDesdeFormularioAutoriSri) {
		this.esParaAccionDesdeFormularioAutoriSri = esParaAccionDesdeFormularioAutoriSri;
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

			if(this.autorisriSessionBean==null) {
				this.autorisriSessionBean=new AutoriSriSessionBean();
			}

			if(!this.autorisriSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(autorisriSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.autorisriSessionBean==null) {
				this.autorisriSessionBean=new AutoriSriSessionBean();
			}

			if(!this.autorisriSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(autorisriSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosTipoDocumentoGeneralsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodocumentogeneralsForeignKey=new ArrayList<TipoDocumentoGeneral>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDocumentoGeneralLogic tipodocumentogeneralLogic=new TipoDocumentoGeneralLogic();

			//tipodocumentogeneralLogic.getTipoDocumentoGeneralDataAccess().setIsForForeingKeyData(true);

			if(this.autorisriSessionBean==null) {
				this.autorisriSessionBean=new AutoriSriSessionBean();
			}

			if(!this.autorisriSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipodocumentogeneralLogic.getTipoDocumentoGeneralDataAccess().setIsForForeingKeyData(true);

					tipodocumentogeneralLogic.getTodosTipoDocumentoGeneralsWithConnection(sFinalQuery,new Pagination());

					this.tipodocumentogeneralsForeignKey=tipodocumentogeneralLogic.getTipoDocumentoGenerals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDocumentoGeneral(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentogeneralLogic.getEntityWithConnection(autorisriSessionBean.getlidTipoDocumentoGeneralActual());
					this.tipodocumentogeneralsForeignKey.add(tipodocumentogeneralLogic.getTipoDocumentoGeneral());
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

					if(this.autorisri!=null) {
						this.autorisri.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriSri!=null) {
						this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAutoriSri.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAutoriSri!=null) {
						if(this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAutoriSriGenerico)throws Exception
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
				jComboBoxid_empresaAutoriSriGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAutoriSriGenerico!=null && jComboBoxid_empresaAutoriSriGenerico.getItemCount()>0) {
					jComboBoxid_empresaAutoriSriGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.autorisri!=null) {
						this.autorisri.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriSri!=null) {
						this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalAutoriSri.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormAutoriSri!=null) {
						if(this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalAutoriSriGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalAutoriSriGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalAutoriSriGenerico!=null && jComboBoxid_sucursalAutoriSriGenerico.getItemCount()>0) {
					jComboBoxid_sucursalAutoriSriGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDocumentoGeneralForeignKey(Long idTipoDocumentoGeneralSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralTemp=null;

			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsForeignKey) {
				if(tipodocumentogeneralAux.getId()!=null && tipodocumentogeneralAux.getId().equals(idTipoDocumentoGeneralSeleccionado)) {
					tipodocumentogeneralTemp=tipodocumentogeneralAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodocumentogeneralTemp!=null) {

					if(this.autorisri!=null) {
						this.autorisri.setTipoDocumentoGeneral(tipodocumentogeneralTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriSri!=null) {
						this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.setSelectedItem(tipodocumentogeneralTemp);
					}
				} else {
					//jComboBoxid_tipo_documento_generalAutoriSri.setSelectedItem(tipodocumentogeneralTemp);
					if(this.jInternalFrameDetalleFormAutoriSri!=null) {
						if(this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoDocumentoGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodocumentogeneralTemp!=null && jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri!=null) {
						jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setSelectedItem(tipodocumentogeneralTemp);
					} else {
						if(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri!=null) {
							//jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setSelectedItem(tipodocumentogeneralTemp);
							if(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.getItemCount()>0) {
								jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setSelectedIndex(0);
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

	public String getActualTipoDocumentoGeneralForeignKeyDescripcion(Long idTipoDocumentoGeneralSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralTemp=null;

			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsForeignKey) {
				if(tipodocumentogeneralAux.getId()!=null && tipodocumentogeneralAux.getId().equals(idTipoDocumentoGeneralSeleccionado)) {
					tipodocumentogeneralTemp=tipodocumentogeneralAux;
					break;
				}
			}


			sDescripcion=TipoDocumentoGeneralConstantesFunciones.getTipoDocumentoGeneralDescripcion(tipodocumentogeneralTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDocumentoGeneralForeignKeyGenerico(Long idTipoDocumentoGeneralSeleccionado,JComboBox jComboBoxid_tipo_documento_generalAutoriSriGenerico)throws Exception
	{
		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralTemp=null;

			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsForeignKey) {
				if(tipodocumentogeneralAux.getId()!=null && tipodocumentogeneralAux.getId().equals(idTipoDocumentoGeneralSeleccionado)) {
					tipodocumentogeneralTemp=tipodocumentogeneralAux;
					break;
				}
			}

			if(tipodocumentogeneralTemp!=null) {
				jComboBoxid_tipo_documento_generalAutoriSriGenerico.setSelectedItem(tipodocumentogeneralTemp);
			} else {
				if(jComboBoxid_tipo_documento_generalAutoriSriGenerico!=null && jComboBoxid_tipo_documento_generalAutoriSriGenerico.getItemCount()>0) {
					jComboBoxid_tipo_documento_generalAutoriSriGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AutoriSri autorisri,JComboBox jComboBoxid_empresaAutoriSriGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAutoriSriGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAutoriSriGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				autorisri.setid_empresa(empresaAux.getId());
				autorisri.setempresa_descripcion(AutoriSriConstantesFunciones.getEmpresaDescripcion(empresaAux));
				autorisri.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(AutoriSri autorisri,JComboBox jComboBoxid_sucursalAutoriSriGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalAutoriSriGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalAutoriSriGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				autorisri.setid_sucursal(sucursalAux.getId());
				autorisri.setsucursal_descripcion(AutoriSriConstantesFunciones.getSucursalDescripcion(sucursalAux));
				autorisri.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDocumentoGeneralForeignKey(AutoriSri autorisri,JComboBox jComboBoxid_tipo_documento_generalAutoriSriGenerico)throws Exception
	{
		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralAux=new TipoDocumentoGeneral();

			if(jComboBoxid_tipo_documento_generalAutoriSriGenerico==null) {
				tipodocumentogeneralAux=(TipoDocumentoGeneral)this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.getSelectedItem();
			} else {
				tipodocumentogeneralAux=(TipoDocumentoGeneral)jComboBoxid_tipo_documento_generalAutoriSriGenerico.getSelectedItem();
			}

			if(tipodocumentogeneralAux!=null && tipodocumentogeneralAux.getId()!=null) {
				autorisri.setid_tipo_documento_general(tipodocumentogeneralAux.getId());
				autorisri.settipodocumentogeneral_descripcion(AutoriSriConstantesFunciones.getTipoDocumentoGeneralDescripcion(tipodocumentogeneralAux));
				autorisri.setTipoDocumentoGeneral(tipodocumentogeneralAux);			}
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

					if(!AutoriSriJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriSri!=null) { 
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriSri!=null) { 
					}

					if(!AutoriSriJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AutoriSriJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriSri!=null) { 
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriSri!=null) { 
					}

					if(!AutoriSriJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDocumentoGeneralsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDocumentoGeneral=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AutoriSriJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriSri!=null) { 
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.removeAllItems();

							for(TipoDocumentoGeneral tipodocumentogeneral:this.tipodocumentogeneralsForeignKey) {
								this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.addItem(tipodocumentogeneral);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriSri!=null) { 
					}

					if(!AutoriSriJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoDocumentoGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AutoriSriJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.removeAllItems();

							for(TipoDocumentoGeneral tipodocumentogeneral:this.tipodocumentogeneralsForeignKey) {
								this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.addItem(tipodocumentogeneral);
							}
						}

						if(!AutoriSriJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAutoriSri!=null) {
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriSri!=null) {
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAutoriSri!=null) {
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriSri!=null) {
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoDocumentoGeneralForeignKey(TipoDocumentoGeneral tipodocumentogeneral,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAutoriSri!=null) {
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.setSelectedItem(tipodocumentogeneral);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriSri!=null) {
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setSelectedItem(tipodocumentogeneral);
						} else {
							this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAutoriSri() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AutoriSriConstantesFunciones.refrescarForeignKeysDescripcionesAutoriSri(this.autorisriLogic.getAutoriSris());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AutoriSriConstantesFunciones.refrescarForeignKeysDescripcionesAutoriSri(this.autorisris);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TipoDocumentoGeneral.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//autorisriLogic.setAutoriSris(this.autorisris);
			autorisriLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
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
		
	public AutoriSriParameterReturnGeneral getAutoriSriParameterGeneral() {
		return this.autorisriParameterGeneral;
	}
	
	public void setAutoriSriParameterGeneral(AutoriSriParameterReturnGeneral autorisriParameterGeneral) {
		this.autorisriParameterGeneral = autorisriParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAutoriSri() {
		return isPermisoTodoAutoriSri;
	}

	public void setIsPermisoTodoAutoriSri(Boolean isPermisoTodoAutoriSri) {
		this.isPermisoTodoAutoriSri = isPermisoTodoAutoriSri;
	}

	public Boolean getIsPermisoNuevoAutoriSri() {
		return isPermisoNuevoAutoriSri;
	}

	public void setIsPermisoNuevoAutoriSri(Boolean isPermisoNuevoAutoriSri) {
		this.isPermisoNuevoAutoriSri = isPermisoNuevoAutoriSri;
	}

	public Boolean getIsPermisoActualizarAutoriSri() {
		return isPermisoActualizarAutoriSri;
	}

	public void setIsPermisoActualizarAutoriSri(Boolean isPermisoActualizarAutoriSri) {
		this.isPermisoActualizarAutoriSri = isPermisoActualizarAutoriSri;
	}

	public Boolean getIsPermisoEliminarAutoriSri() {
		return isPermisoEliminarAutoriSri;
	}

	public void setIsPermisoEliminarAutoriSri(Boolean isPermisoEliminarAutoriSri) {
		this.isPermisoEliminarAutoriSri = isPermisoEliminarAutoriSri;
	}

	public Boolean getIsPermisoGuardarCambiosAutoriSri() {
		return isPermisoGuardarCambiosAutoriSri;
	}

	public void setIsPermisoGuardarCambiosAutoriSri(Boolean isPermisoGuardarCambiosAutoriSri) {
		this.isPermisoGuardarCambiosAutoriSri = isPermisoGuardarCambiosAutoriSri;
	}
	
	public Boolean getIsPermisoConsultaAutoriSri() {
		return isPermisoConsultaAutoriSri;
	}

	public void setIsPermisoConsultaAutoriSri(Boolean isPermisoConsultaAutoriSri) {
		this.isPermisoConsultaAutoriSri = isPermisoConsultaAutoriSri;
	}

	public Boolean getIsPermisoBusquedaAutoriSri() {
		return isPermisoBusquedaAutoriSri;
	}

	public void setIsPermisoBusquedaAutoriSri(Boolean isPermisoBusquedaAutoriSri) {
		this.isPermisoBusquedaAutoriSri = isPermisoBusquedaAutoriSri;
	}

	public Boolean getIsPermisoReporteAutoriSri() {
		return isPermisoReporteAutoriSri;
	}

	public void setIsPermisoReporteAutoriSri(Boolean isPermisoReporteAutoriSri) {
		this.isPermisoReporteAutoriSri = isPermisoReporteAutoriSri;
	}
	
	public Boolean getIsPermisoPaginacionMedioAutoriSri() {
		return isPermisoPaginacionMedioAutoriSri;
	}

	public void setIsPermisoPaginacionMedioAutoriSri(Boolean isPermisoPaginacionMedioAutoriSri) {
		this.isPermisoPaginacionMedioAutoriSri = isPermisoPaginacionMedioAutoriSri;
	}
	
	public Boolean getIsPermisoPaginacionTodoAutoriSri() {
		return isPermisoPaginacionTodoAutoriSri;
	}

	public void setIsPermisoPaginacionTodoAutoriSri(Boolean isPermisoPaginacionTodoAutoriSri) {
		this.isPermisoPaginacionTodoAutoriSri = isPermisoPaginacionTodoAutoriSri;
	}
	
	public Boolean getIsPermisoPaginacionAltoAutoriSri() {
		return isPermisoPaginacionAltoAutoriSri;
	}

	public void setIsPermisoPaginacionAltoAutoriSri(Boolean isPermisoPaginacionAltoAutoriSri) {
		this.isPermisoPaginacionAltoAutoriSri = isPermisoPaginacionAltoAutoriSri;
	}
	
	public Boolean getIsPermisoCopiarAutoriSri() {
		return isPermisoCopiarAutoriSri;
	}

	public void setIsPermisoCopiarAutoriSri(Boolean isPermisoCopiarAutoriSri) {
		this.isPermisoCopiarAutoriSri = isPermisoCopiarAutoriSri;
	}
	
	public Boolean getIsPermisoVerFormAutoriSri() {
		return isPermisoVerFormAutoriSri;
	}

	public void setIsPermisoVerFormAutoriSri(Boolean isPermisoVerFormAutoriSri) {
		this.isPermisoVerFormAutoriSri = isPermisoVerFormAutoriSri;
	}
	
	public Boolean getIsPermisoDuplicarAutoriSri() {
		return isPermisoDuplicarAutoriSri;
	}

	public void setIsPermisoDuplicarAutoriSri(Boolean isPermisoDuplicarAutoriSri) {
		this.isPermisoDuplicarAutoriSri = isPermisoDuplicarAutoriSri;
	}
	
	public Boolean getIsPermisoOrdenAutoriSri() {
		return isPermisoOrdenAutoriSri;
	}

	public void setIsPermisoOrdenAutoriSri(Boolean isPermisoOrdenAutoriSri) {
		this.isPermisoOrdenAutoriSri = isPermisoOrdenAutoriSri;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAutoriSri() {
		return isVisibilidadCeldaNuevoAutoriSri;
	}

	public void setIsVisibilidadCeldaNuevoAutoriSri(Boolean isVisibilidadCeldaNuevoAutoriSri) {
		this.isVisibilidadCeldaNuevoAutoriSri = isVisibilidadCeldaNuevoAutoriSri;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAutoriSri() {
		return isVisibilidadCeldaDuplicarAutoriSri;
	}

	public void setIsVisibilidadCeldaDuplicarAutoriSri(Boolean isVisibilidadCeldaDuplicarAutoriSri) {
		this.isVisibilidadCeldaDuplicarAutoriSri = isVisibilidadCeldaDuplicarAutoriSri;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAutoriSri() {
		return isVisibilidadCeldaCopiarAutoriSri;
	}

	public void setIsVisibilidadCeldaCopiarAutoriSri(Boolean isVisibilidadCeldaCopiarAutoriSri) {
		this.isVisibilidadCeldaCopiarAutoriSri = isVisibilidadCeldaCopiarAutoriSri;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAutoriSri() {
		return isVisibilidadCeldaVerFormAutoriSri;
	}

	public void setIsVisibilidadCeldaVerFormAutoriSri(Boolean isVisibilidadCeldaVerFormAutoriSri) {
		this.isVisibilidadCeldaVerFormAutoriSri = isVisibilidadCeldaVerFormAutoriSri;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAutoriSri() {
		return isVisibilidadCeldaOrdenAutoriSri;
	}

	public void setIsVisibilidadCeldaOrdenAutoriSri(Boolean isVisibilidadCeldaOrdenAutoriSri) {
		this.isVisibilidadCeldaOrdenAutoriSri = isVisibilidadCeldaOrdenAutoriSri;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAutoriSri() {
		return isVisibilidadCeldaNuevoRelacionesAutoriSri;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAutoriSri(Boolean isVisibilidadCeldaNuevoRelacionesAutoriSri) {
		this.isVisibilidadCeldaNuevoRelacionesAutoriSri = isVisibilidadCeldaNuevoRelacionesAutoriSri;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAutoriSri() {
		return isVisibilidadCeldaModificarAutoriSri;
	}

	public void setIsVisibilidadCeldaModificarAutoriSri(Boolean isVisibilidadCeldaModificarAutoriSri) {
		this.isVisibilidadCeldaModificarAutoriSri = isVisibilidadCeldaModificarAutoriSri;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAutoriSri() {
		return isVisibilidadCeldaActualizarAutoriSri;
	}

	public void setIsVisibilidadCeldaActualizarAutoriSri(Boolean isVisibilidadCeldaActualizarAutoriSri) {
		this.isVisibilidadCeldaActualizarAutoriSri = isVisibilidadCeldaActualizarAutoriSri;
	}

	public Boolean getIsVisibilidadCeldaEliminarAutoriSri() {
		return isVisibilidadCeldaEliminarAutoriSri;
	}

	public void setIsVisibilidadCeldaEliminarAutoriSri(Boolean isVisibilidadCeldaEliminarAutoriSri) {
		this.isVisibilidadCeldaEliminarAutoriSri = isVisibilidadCeldaEliminarAutoriSri;
	}

	public Boolean getIsVisibilidadCeldaCancelarAutoriSri() {
		return isVisibilidadCeldaCancelarAutoriSri;
	}

	public void setIsVisibilidadCeldaCancelarAutoriSri(Boolean isVisibilidadCeldaCancelarAutoriSri) {
		this.isVisibilidadCeldaCancelarAutoriSri = isVisibilidadCeldaCancelarAutoriSri;
	}

	public Boolean getIsVisibilidadCeldaGuardarAutoriSri() {
		return isVisibilidadCeldaGuardarAutoriSri;
	}

	public void setIsVisibilidadCeldaGuardarAutoriSri(Boolean isVisibilidadCeldaGuardarAutoriSri) {
		this.isVisibilidadCeldaGuardarAutoriSri = isVisibilidadCeldaGuardarAutoriSri;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAutoriSri() {
		return isVisibilidadCeldaGuardarCambiosAutoriSri;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAutoriSri(Boolean isVisibilidadCeldaGuardarCambiosAutoriSri) {
		this.isVisibilidadCeldaGuardarCambiosAutoriSri = isVisibilidadCeldaGuardarCambiosAutoriSri;
	}
		
	public AutoriSriSessionBean getautorisriSessionBean() {
		return this.autorisriSessionBean;
	}
	
	public void setautorisriSessionBean(AutoriSriSessionBean autorisriSessionBean) {
		this.autorisriSessionBean=autorisriSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorFechaFin() {
		return this.isVisibilidadBusquedaPorFechaFin;
	}

	public void setisVisibilidadBusquedaPorFechaFin(Boolean isVisibilidadBusquedaPorFechaFin) {
		this.isVisibilidadBusquedaPorFechaFin=isVisibilidadBusquedaPorFechaFin;
	}

	public Boolean getisVisibilidadBusquedaPorFechaInicio() {
		return this.isVisibilidadBusquedaPorFechaInicio;
	}

	public void setisVisibilidadBusquedaPorFechaInicio(Boolean isVisibilidadBusquedaPorFechaInicio) {
		this.isVisibilidadBusquedaPorFechaInicio=isVisibilidadBusquedaPorFechaInicio;
	}

	public Boolean getisVisibilidadBusquedaPorNumeroAutor() {
		return this.isVisibilidadBusquedaPorNumeroAutor;
	}

	public void setisVisibilidadBusquedaPorNumeroAutor(Boolean isVisibilidadBusquedaPorNumeroAutor) {
		this.isVisibilidadBusquedaPorNumeroAutor=isVisibilidadBusquedaPorNumeroAutor;
	}

	public Boolean getisVisibilidadBusquedaPorNumeroSecuencial() {
		return this.isVisibilidadBusquedaPorNumeroSecuencial;
	}

	public void setisVisibilidadBusquedaPorNumeroSecuencial(Boolean isVisibilidadBusquedaPorNumeroSecuencial) {
		this.isVisibilidadBusquedaPorNumeroSecuencial=isVisibilidadBusquedaPorNumeroSecuencial;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoDocumentoGeneral() {
		return this.isVisibilidadFK_IdTipoDocumentoGeneral;
	}

	public void setisVisibilidadFK_IdTipoDocumentoGeneral(Boolean isVisibilidadFK_IdTipoDocumentoGeneral) {
		this.isVisibilidadFK_IdTipoDocumentoGeneral=isVisibilidadFK_IdTipoDocumentoGeneral;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAutoriSri(AutoriSri autorisri)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(autorisri,null);
				this.setActualParaGuardarSucursalForeignKey(autorisri,null);
				this.setActualParaGuardarTipoDocumentoGeneralForeignKey(autorisri,null);
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
	
	public void bugActualizarReferenciaActual(AutoriSri autorisri,AutoriSri autorisriAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAutoriSri(autorisri);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		autorisriAux.setId(autorisri.getId());
		autorisriAux.setVersionRow(autorisri.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAutoriSri();
		
			int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = autorisriValidator.getInvalidValues(this.autorisri);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			autorisriLogic.setDatosCliente(datosCliente);
			autorisriLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				autorisriAux=new  AutoriSri();
				
				autorisriAux.setIsNew(true);
				autorisriAux.setIsChanged(true);
				
				autorisriAux.setAutoriSriOriginal(this.autorisri);
				
				autorisriAux.setId(this.autorisri.getId());	
				autorisriAux.setVersionRow(this.autorisri.getVersionRow());	
				autorisriAux.setid_empresa(this.autorisri.getid_empresa());	
				autorisriAux.setid_sucursal(this.autorisri.getid_sucursal());	
				autorisriAux.setid_tipo_documento_general(this.autorisri.getid_tipo_documento_general());	
				autorisriAux.setnumero_secuencial(this.autorisri.getnumero_secuencial());	
				autorisriAux.setnumero_autor(this.autorisri.getnumero_autor());	
				autorisriAux.setfecha_inicio(this.autorisri.getfecha_inicio());	
				autorisriAux.setfecha_fin(this.autorisri.getfecha_fin());	
				autorisriAux.setesta_activo(this.autorisri.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.autorisriSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.autorisriSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(autorisriAux,autorisriLogic.getAutoriSris());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autorisriAux,autorisris);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.autorisriSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.autorisriSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriLogic.saveAutoriSris();//WithConnection
						//autorisriLogic.getSetVersionRowAutoriSris();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.autorisri,autorisriAux);
					
					this.refrescarForeignKeysDescripcionesAutoriSri();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.autorisriSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								autorisriLogic.saveAutoriSriRelaciones(autorisriAux);//WithConnection
								//autorisriLogic.getSetVersionRowAutoriSris();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.autorisri,autorisriAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.autorisriSessionBean.getEstaModoGuardarRelaciones() 
									|| this.autorisriSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(autorisriAux,autorisriLogic.getAutoriSris());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(autorisriAux,autorisris);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.autorisri,autorisriAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				autorisriAux=new  AutoriSri();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.autorisriSessionBean.getEsGuardarRelacionado() 
					|| (this.autorisriSessionBean.getEsGuardarRelacionado() && this.autorisri.getId()>=0)) {
						
					autorisriAux.setIsNew(false);
				}
				
				autorisriAux.setIsDeleted(false);
			
				autorisriAux.setId(this.autorisri.getId());	
				autorisriAux.setVersionRow(this.autorisri.getVersionRow());	
				autorisriAux.setid_empresa(this.autorisri.getid_empresa());	
				autorisriAux.setid_sucursal(this.autorisri.getid_sucursal());	
				autorisriAux.setid_tipo_documento_general(this.autorisri.getid_tipo_documento_general());	
				autorisriAux.setnumero_secuencial(this.autorisri.getnumero_secuencial());	
				autorisriAux.setnumero_autor(this.autorisri.getnumero_autor());	
				autorisriAux.setfecha_inicio(this.autorisri.getfecha_inicio());	
				autorisriAux.setfecha_fin(this.autorisri.getfecha_fin());	
				autorisriAux.setesta_activo(this.autorisri.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(autorisriAux,autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autorisriAux,autorisris);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.autorisriSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.autorisriSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriLogic.saveAutoriSris();//WithConnection
						//autorisriLogic.getSetVersionRowAutoriSris();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.autorisri,autorisriAux);
					
					this.refrescarForeignKeysDescripcionesAutoriSri();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.autorisriSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								autorisriLogic.saveAutoriSriRelaciones(autorisriAux);//WithConnection
								//autorisriLogic.getSetVersionRowAutoriSris();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.autorisri,autorisriAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.autorisriSessionBean.getEstaModoGuardarRelaciones() 
									|| this.autorisriSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(autorisriAux,autorisriLogic.getAutoriSris());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(autorisriAux,autorisris);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.autorisri,autorisriAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				autorisriAux=new  AutoriSri();
				
				autorisriAux.setIsNew(false);
				autorisriAux.setIsChanged(false);
				
				autorisriAux.setIsDeleted(true);
				
				autorisriAux.setId(this.autorisri.getId());	
				autorisriAux.setVersionRow(this.autorisri.getVersionRow());	
				autorisriAux.setid_empresa(this.autorisri.getid_empresa());	
				autorisriAux.setid_sucursal(this.autorisri.getid_sucursal());	
				autorisriAux.setid_tipo_documento_general(this.autorisri.getid_tipo_documento_general());	
				autorisriAux.setnumero_secuencial(this.autorisri.getnumero_secuencial());	
				autorisriAux.setnumero_autor(this.autorisri.getnumero_autor());	
				autorisriAux.setfecha_inicio(this.autorisri.getfecha_inicio());	
				autorisriAux.setfecha_fin(this.autorisri.getfecha_fin());	
				autorisriAux.setesta_activo(this.autorisri.getesta_activo());	
				
				if(this.autorisriSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.autorisriAux.getId()>=0) {	
						this.autorisrisEliminados.add(autorisriAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(autorisriAux,autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autorisriAux,autorisris);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.autorisriSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.autorisriSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriLogic.saveAutoriSris();//WithConnection
						//autorisriLogic.getSetVersionRowAutoriSris();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.autorisriSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								autorisriLogic.saveAutoriSriRelaciones(autorisriAux);//WithConnection
								//autorisriLogic.getSetVersionRowAutoriSris();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.autorisriSessionBean.getEstaModoGuardarRelaciones() 
								|| this.autorisriSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(autorisriAux,autorisriLogic.getAutoriSris());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(autorisriAux,autorisris);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.getAutoriSris().addAll(this.autorisrisEliminados);
					
					autorisriLogic.saveAutoriSris();//WithConnection
					//autorisriLogic.getSetVersionRowAutoriSris();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAutoriSri();
				
				this.autorisrisEliminados= new ArrayList<AutoriSri>();		
			}
			
			if(this.autorisriSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Autorizaciones Sri GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Autorizaciones Sri",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.autorisri=autorisriAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessAutoriSri();
      	}
		
	}	
	
	public void actualizarRelaciones(AutoriSri autorisriLocal) throws Exception {
		
		if(this.autorisriSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AutoriSri autorisriLocal) throws Exception {	
		if(this.autorisriSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				autorisriLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				autorisriLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDocumentoGeneralDetalleFormJInternalFrame.class)) {
				TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrameLocal=(TipoDocumentoGeneralBeanSwingJInternalFrame) ((TipoDocumentoGeneralDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodocumentogeneralBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDocumentoGeneral(tipodocumentogeneralBeanSwingJInternalFrameLocal.gettipodocumentogeneral(),true);
				tipodocumentogeneralBeanSwingJInternalFrameLocal.actualizarLista(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral,this.tipodocumentogeneralsForeignKey);

				tipodocumentogeneralBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral);

				autorisriLocal.setTipoDocumentoGeneral(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral);

				this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
				this.cargarCombosFrameTipoDocumentoGeneralsForeignKey("Formulario");
				this.setActualTipoDocumentoGeneralForeignKey(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAutoriSriActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = autorisriValidator.getInvalidValues(this.autorisri);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AutoriSri autorisri,List<AutoriSri> autorisris) throws Exception {
		try	{		
			AutoriSriConstantesFunciones.actualizarLista(autorisri,autorisris,this.autorisriSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(AutoriSri autorisri,List<AutoriSri> autorisris) throws Exception {
		try	{			
			AutoriSriConstantesFunciones.actualizarSelectedLista(autorisri,autorisris);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AutoriSri> autorisrisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				autorisrisLocal=this.autorisriLogic.getAutoriSris();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				autorisrisLocal=this.autorisris;
			}
			//ARCHITECTURE
		
			for(AutoriSri autorisriLocal:autorisrisLocal) {
				if(this.permiteMantenimiento(autorisriLocal) && autorisriLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AutoriSriConstantesFunciones.getAutoriSriLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AutoriSriConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelid_empresaAutoriSri,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriSriConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelid_sucursalAutoriSri,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriSriConstantesFunciones.IDTIPODOCUMENTOGENERAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelid_tipo_documento_generalAutoriSri,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriSriConstantesFunciones.NUMEROSECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelnumero_secuencialAutoriSri,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriSriConstantesFunciones.NUMEROAUTOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelnumero_autorAutoriSri,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriSriConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelfecha_inicioAutoriSri,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriSriConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelfecha_finAutoriSri,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriSriConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelesta_activoAutoriSri,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriSri.jLabelid_empresaAutoriSri,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriSri.jLabelid_sucursalAutoriSri,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriSri.jLabelid_tipo_documento_generalAutoriSri,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriSri.jLabelnumero_secuencialAutoriSri,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriSri.jLabelnumero_autorAutoriSri,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriSri.jLabelfecha_inicioAutoriSri,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriSri.jLabelfecha_finAutoriSri,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriSri.jLabelesta_activoAutoriSri,"");
		
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
		this.iIdNuevoAutoriSri--;	
		
		
		this.autorisriAux=new AutoriSri();
		
		this.autorisriAux.setId(this.iIdNuevoAutoriSri);
		this.autorisriAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.autorisriLogic.getAutoriSris().add(this.autorisriAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.autorisris.add(this.autorisriAux);
		}
		//ARCHITECTURE
		
		this.autorisri=this.autorisriAux;
		
		if(AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAutoriSri(this.autorisri);
			this.setVariablesObjetoActualToFormularioForeignKeyAutoriSri(this.autorisri);
		}
				
		//this.setDefaultControlesAutoriSri();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAutoriSri();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAutoriSri();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAutoriSri();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAutoriSri(this.autorisriBean,this.autorisri,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AutoriSriConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.autorisriSessionBean.getConGuardarRelaciones()) {
			classes=AutoriSriConstantesFunciones.getClassesRelationshipsOfAutoriSri(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.autorisriReturnGeneral=autorisriLogic.procesarEventosAutoriSrisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autorisriLogic.getAutoriSris(),this.autorisri,this.autorisriParameterGeneral,this.isEsNuevoAutoriSri,classes);//this.autorisriLogic.getAutoriSri()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAutoriSri(this.autorisriReturnGeneral,this.autorisriBean,false);
		
		if(this.autorisriReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAutoriSri(this.autorisriReturnGeneral.getAutoriSri());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAutoriSri(this.autorisriReturnGeneral.getAutoriSri());
		}
		
		if(this.autorisriReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAutoriSri(this.autorisriReturnGeneral.getAutoriSri(),classes);//this.autorisriBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAutoriSri();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAutoriSri();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AutoriSriBeanSwingJInternalFrameAdditional.RecargarFormAutoriSri(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAutoriSri(false);
						
			if(autorisriSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutoriSri();
			}
			
			this.actualizarVisualTableDatosAutoriSri();
			
			this.jTableDatosAutoriSri.setRowSelectionInterval(this.getIndiceNuevoAutoriSri(), this.getIndiceNuevoAutoriSri());
			
			this.seleccionarFilaTablaAutoriSriActual();
						
			this.actualizarEstadoCeldasBotonesAutoriSri("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAutoriSri(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_secuencialAutoriSri.setEnabled(isHabilitar && this.autorisriConstantesFunciones.activarnumero_secuencialAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_autorAutoriSri.setEnabled(isHabilitar && this.autorisriConstantesFunciones.activarnumero_autorAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_inicioAutoriSri.setEnabled(isHabilitar && this.autorisriConstantesFunciones.activarfecha_inicioAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_finAutoriSri.setEnabled(isHabilitar && this.autorisriConstantesFunciones.activarfecha_finAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jCheckBoxesta_activoAutoriSri.setEnabled(isHabilitar && this.autorisriConstantesFunciones.activaresta_activoAutoriSri);	
		//
		this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.setEnabled(isHabilitar && this.autorisriConstantesFunciones.activarid_empresaAutoriSri);//
		this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.setEnabled(isHabilitar && this.autorisriConstantesFunciones.activarid_sucursalAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.setEnabled(isHabilitar && this.autorisriConstantesFunciones.activarid_tipo_documento_generalAutoriSri);
	};
	
	public void setDefaultControlesAutoriSri() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAutoriSri(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.autorisriSessionBean.setConGuardarRelaciones(true);			
			this.autorisriSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAutoriSri.jTabbedPaneRelacionesAutoriSri.setVisible(true);
			
					
		} else {
			//this.autorisriSessionBean.setConGuardarRelaciones(false);			
			this.autorisriSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAutoriSri.jTabbedPaneRelacionesAutoriSri.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAutoriSri() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriSri autorisriAux:this.autorisriLogic.getAutoriSris()) {
				if(autorisriAux.getId().equals(this.iIdNuevoAutoriSri)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriSri autorisriAux:this.autorisris) {
				if(autorisriAux.getId().equals(this.iIdNuevoAutoriSri)) {
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
	
	public int getIndiceActualAutoriSri(AutoriSri autorisri,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriSri autorisriAux:this.autorisriLogic.getAutoriSris()) {
				if(autorisriAux.getId().equals(autorisri.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriSri autorisriAux:this.autorisris) {
				if(autorisriAux.getId().equals(autorisri.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAutoriSri(AutoriSri autorisriOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriSri autorisriAux:this.autorisriLogic.getAutoriSris()) {
				if(autorisriAux.getAutoriSriOriginal().getId().equals(autorisriOriginal.getId())) {
					existe=true;
					autorisriOriginal.setId(autorisriAux.getId());
					autorisriOriginal.setVersionRow(autorisriAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriSri autorisriAux:this.autorisris) {
				if(autorisriAux.getAutoriSriOriginal().getId().equals(autorisriOriginal.getId())) {
					existe=true;
					autorisriOriginal.setId(autorisriAux.getId());
					autorisriOriginal.setVersionRow(autorisriAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAutoriSri(Boolean esParaCancelar) throws Exception {
		autorisrisAux=new ArrayList<AutoriSri>();
		autorisriAux=new AutoriSri();
		
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AutoriSri autorisriAux:this.autorisriLogic.getAutoriSris()) {
					if(autorisriAux.getId()<0) {
						autorisrisAux.add(autorisriAux);
					}		
				}
				this.iIdNuevoAutoriSri=0L;
				this.autorisriLogic.getAutoriSris().removeAll(autorisrisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriSri autorisriAux:this.autorisris) {
					if(autorisriAux.getId()<0) {
						autorisrisAux.add(autorisriAux);
					}		
				}
				this.iIdNuevoAutoriSri=0L;
				this.autorisris.removeAll(autorisrisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAutoriSri 
					&& this.autorisriLogic.getAutoriSris().size()>0
					) {
					autorisriAux=this.autorisriLogic.getAutoriSris().get(this.autorisriLogic.getAutoriSris().size() - 1);
				
					if(autorisriAux.getId()<0) {
						this.autorisriLogic.getAutoriSris().remove(autorisriAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAutoriSri && this.autorisris.size()>0) {
					autorisriAux=this.autorisris.get(this.autorisris.size() - 1);
				
					if(autorisriAux.getId()<0) {
						this.autorisris.remove(autorisriAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAutoriSri(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(autorisri.getId()<0) {
				this.autorisriLogic.getAutoriSris().remove(this.autorisri);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(autorisri.getId()<0) {
				this.autorisris.remove(this.autorisri);
			}
		}			
	}
	
	public void setEstadosInicialesAutoriSri(List<AutoriSri> autorisrisAux) throws Exception {
		AutoriSriConstantesFunciones.setEstadosInicialesAutoriSri(autorisrisAux);
	}
	
	public void setEstadosInicialesAutoriSri(AutoriSri autorisriAux) throws Exception {
		AutoriSriConstantesFunciones.setEstadosInicialesAutoriSri(autorisriAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAutoriSriActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAutoriSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAutoriSriActual()) {
				if(!this.isEsNuevoAutoriSri) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAutoriSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAutoriSri=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAutoriSriActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Autorizaciones Sri ?", "MANTENIMIENTO DE Autorizaciones Sri", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAutoriSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AutoriSri autorisri) throws Exception {
		AutoriSriConstantesFunciones.seleccionarAsignar(this.autorisri,autorisri);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAutoriSri=this.isPermisoActualizarOriginalAutoriSri;
			
			
			this.seleccionarAsignar(autorisri);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AutoriSriConstantesFunciones.quitarEspaciosAutoriSri(this.autorisri,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAutoriSri("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.autorisriSessionBean.setsFuncionBusquedaRapida(this.autorisriSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAutoriSri) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAutoriSri(esParaCancelar);				
				this.cancelarNuevoAutoriSri(esParaCancelar);								
			}
			
			this.autorisri=new AutoriSri();
			
			this.inicializarAutoriSri();
			
			this.actualizarEstadoCeldasBotonesAutoriSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAutoriSri() throws Exception {
		try {
			AutoriSriConstantesFunciones.inicializarAutoriSri(this.autorisri);
			
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
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.autorisriLogic.getAutoriSris().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAutoriSris(String sAccionBusqueda,List<AutoriSri> autorisrisParaReportes) throws Exception {
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
					sPathReporteFinal="AutoriSri"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AutoriSriMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AutoriSriMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AutoriSri"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Autorizaciones Sris");		
		parameters.put("busquedapor", AutoriSriConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAutoriSri=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AutoriSriConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AutoriSriConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAutoriSri=new JRBeanArrayDataSource(AutoriSriJInternalFrame.TraerAutoriSriBeans(autorisrisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAutoriSri);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AutoriSriConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AutoriSriConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AutoriSriBean.TraerAutoriSriBeans(autorisrisParaReportes).toArray()));
							
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
				this.generarExcelReporteAutoriSris(sAccionBusqueda,sTipoArchivoReporte,autorisrisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAutoriSris(sAccionBusqueda,sTipoArchivoReporte,autorisrisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAutoriSriActionPerformed(null);
					//this.generarExcelReporteAutoriSris(sAccionBusqueda,sTipoArchivoReporte,autorisrisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAutoriSris(sAccionBusqueda,sTipoArchivoReporte,autorisrisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAutoriSris(sAccionBusqueda,sTipoArchivoReporte,autorisrisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAutoriSris(sAccionBusqueda,sTipoArchivoReporte,autorisrisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAutoriSris(String sAccionBusqueda,String sTipoArchivoReporte,List<AutoriSri> autorisrisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorisri";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutoriSris");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAutoriSri("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AutoriSri autorisri : autorisrisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AutoriSriConstantesFunciones.generarExcelReporteDataAutoriSri("NORMAL",row,workbook,autorisri,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Sri",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAutoriSri(String sTipo,Row row,Workbook workbook) {
		
		AutoriSriConstantesFunciones.generarExcelReporteHeaderAutoriSri(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAutoriSris(String sAccionBusqueda,String sTipoArchivoReporte,List<AutoriSri> autorisrisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorisri_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutoriSris");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AutoriSri autorisri : autorisrisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AutoriSriConstantesFunciones.getAutoriSriDescripcion(autorisri));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriSriConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriSriConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorisri.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriSriConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriSriConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorisri.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorisri.gettipodocumentogeneral_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorisri.getnumero_secuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorisri.getnumero_autor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriSriConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriSriConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorisri.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriSriConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriSriConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorisri.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriSriConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriSriConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(autorisri.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Sri",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAutoriSris(String sAccionBusqueda,String sTipoArchivoReporte,List<AutoriSri> autorisrisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AutoriSri> autorisrisRespaldo=null;
		
		classes=AutoriSriConstantesFunciones.getClassesRelationshipsOfAutoriSri(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.autorisriLogic.setDatosCliente(this.datosCliente);
		this.autorisriLogic.setDatosDeep(this.datosDeep);
		this.autorisriLogic.setIsConDeep(true);
		
		autorisrisRespaldo=this.autorisriLogic.getAutoriSris();
		
		this.autorisriLogic.setAutoriSris(autorisrisParaReportes);	
		this.autorisriLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		autorisrisParaReportes=this.autorisriLogic.getAutoriSris();
		this.autorisriLogic.setAutoriSris(autorisrisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorisri_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutoriSris");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAutoriSri("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AutoriSri autorisri : autorisrisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAutoriSri("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AutoriSriConstantesFunciones.generarExcelReporteDataAutoriSri("NORMAL",row,workbook,autorisri,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AutoriSriConstantesFunciones.getAutoriSriDescripcion(autorisri));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Sri",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAutoriSri.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAutoriSri() throws Exception {		
		this.startProcessAutoriSri(true);
	}
	
	public void startProcessAutoriSri(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAutoriSri ,this.jPanelParametrosReportesAutoriSri, this.jScrollPanelDatosAutoriSri,this.jPanelPaginacionAutoriSri, this.jScrollPanelDatosEdicionAutoriSri, this.jPanelAccionesAutoriSri,this.jPanelAccionesFormularioAutoriSri,this.jmenuBarAutoriSri,this.jmenuBarDetalleAutoriSri,this.jTtoolBarAutoriSri,this.jTtoolBarDetalleAutoriSri);		
		
		final JTabbedPane jTabbedPaneBusquedasAutoriSri=this.jTabbedPaneBusquedasAutoriSri; 
		
		final JPanel jPanelParametrosReportesAutoriSri=this.jPanelParametrosReportesAutoriSri;
		//final JScrollPane jScrollPanelDatosAutoriSri=this.jScrollPanelDatosAutoriSri;
		final JTable jTableDatosAutoriSri=this.jTableDatosAutoriSri;		
		final JPanel jPanelPaginacionAutoriSri=this.jPanelPaginacionAutoriSri;
		//final JScrollPane jScrollPanelDatosEdicionAutoriSri=this.jScrollPanelDatosEdicionAutoriSri;
		final JPanel jPanelAccionesAutoriSri=this.jPanelAccionesAutoriSri;
		
		JPanel jPanelCamposAuxiliarAutoriSri=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAutoriSri=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			jPanelCamposAuxiliarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jPanelCamposAutoriSri;
			jPanelAccionesFormularioAuxiliarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jPanelAccionesFormularioAutoriSri;
		}
		
		final JPanel jPanelCamposAutoriSri=jPanelCamposAuxiliarAutoriSri;
		final JPanel jPanelAccionesFormularioAutoriSri=jPanelAccionesFormularioAuxiliarAutoriSri;
		
		
		final JMenuBar jmenuBarAutoriSri=this.jmenuBarAutoriSri;
		final JToolBar jTtoolBarAutoriSri=this.jTtoolBarAutoriSri;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAutoriSri=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAutoriSri=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			jmenuBarDetalleAuxiliarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jmenuBarDetalleAutoriSri;
			jTtoolBarDetalleAuxiliarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jTtoolBarDetalleAutoriSri;
		}
		
		final JMenuBar jmenuBarDetalleAutoriSri=jmenuBarDetalleAuxiliarAutoriSri;
		final JToolBar jTtoolBarDetalleAutoriSri=jTtoolBarDetalleAuxiliarAutoriSri;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAutoriSri;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAutoriSri;
			processRunnable.jTableDatos=jTableDatosAutoriSri;
			processRunnable.jPanelCampos=jPanelCamposAutoriSri;
			processRunnable.jPanelPaginacion=jPanelPaginacionAutoriSri;
			processRunnable.jPanelAcciones=jPanelAccionesAutoriSri;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAutoriSri;
			
			
			processRunnable.jmenuBar=jmenuBarAutoriSri;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAutoriSri;
			processRunnable.jTtoolBar=jTtoolBarAutoriSri;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAutoriSri;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAutoriSri ,jPanelParametrosReportesAutoriSri,jTableDatosAutoriSri, /*jScrollPanelDatosAutoriSri,*/jPanelCamposAutoriSri,jPanelPaginacionAutoriSri, /*jScrollPanelDatosEdicionAutoriSri,*/ jPanelAccionesAutoriSri,jPanelAccionesFormularioAutoriSri,jmenuBarAutoriSri,jmenuBarDetalleAutoriSri,jTtoolBarAutoriSri,jTtoolBarDetalleAutoriSri);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAutoriSri ,jPanelParametrosReportesAutoriSri, jScrollPanelDatosAutoriSri,jPanelPaginacionAutoriSri, jScrollPanelDatosEdicionAutoriSri, jPanelAccionesAutoriSri,jPanelAccionesFormularioAutoriSri,jmenuBarAutoriSri,jmenuBarDetalleAutoriSri,jTtoolBarAutoriSri,jTtoolBarDetalleAutoriSri);
						
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
	
	public void finishProcessAutoriSri() {// throws Exception 
		this.finishProcessAutoriSri(true);
	}
	
	public void finishProcessAutoriSri(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAutoriSri ,this.jPanelParametrosReportesAutoriSri, this.jScrollPanelDatosAutoriSri,this.jPanelPaginacionAutoriSri, this.jScrollPanelDatosEdicionAutoriSri, this.jPanelAccionesAutoriSri,this.jPanelAccionesFormularioAutoriSri,this.jmenuBarAutoriSri,this.jmenuBarDetalleAutoriSri,this.jTtoolBarAutoriSri,this.jTtoolBarDetalleAutoriSri);		
		
		final JTabbedPane jTabbedPaneBusquedasAutoriSri=this.jTabbedPaneBusquedasAutoriSri; 
		
		final JPanel jPanelParametrosReportesAutoriSri=this.jPanelParametrosReportesAutoriSri;
		//final JScrollPane jScrollPanelDatosAutoriSri=this.jScrollPanelDatosAutoriSri;
		final JTable jTableDatosAutoriSri=this.jTableDatosAutoriSri;		
		final JPanel jPanelPaginacionAutoriSri=this.jPanelPaginacionAutoriSri;
		//final JScrollPane jScrollPanelDatosEdicionAutoriSri=this.jScrollPanelDatosEdicionAutoriSri;
		final JPanel jPanelAccionesAutoriSri=this.jPanelAccionesAutoriSri;
		
		JPanel jPanelCamposAuxiliarAutoriSri=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAutoriSri=new JPanel();
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			jPanelCamposAuxiliarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jPanelCamposAutoriSri;
			jPanelAccionesFormularioAuxiliarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jPanelAccionesFormularioAutoriSri;
		}
		
		final JPanel jPanelCamposAutoriSri=jPanelCamposAuxiliarAutoriSri;
		final JPanel jPanelAccionesFormularioAutoriSri=jPanelAccionesFormularioAuxiliarAutoriSri;
		
		
		final JMenuBar jmenuBarAutoriSri=this.jmenuBarAutoriSri;		
		final JToolBar jTtoolBarAutoriSri=this.jTtoolBarAutoriSri;
				
		JMenuBar jmenuBarDetalleAuxiliarAutoriSri=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAutoriSri=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			jmenuBarDetalleAuxiliarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jmenuBarDetalleAutoriSri;
			jTtoolBarDetalleAuxiliarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jTtoolBarDetalleAutoriSri;		
		}
		
		final JMenuBar jmenuBarDetalleAutoriSri=jmenuBarDetalleAuxiliarAutoriSri;
		final JToolBar jTtoolBarDetalleAutoriSri=jTtoolBarDetalleAuxiliarAutoriSri;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAutoriSri;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAutoriSri;
			processRunnable.jTableDatos=jTableDatosAutoriSri;
			processRunnable.jPanelCampos=jPanelCamposAutoriSri;
			processRunnable.jPanelPaginacion=jPanelPaginacionAutoriSri;
			processRunnable.jPanelAcciones=jPanelAccionesAutoriSri;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAutoriSri;
			
			
			processRunnable.jmenuBar=jmenuBarAutoriSri;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAutoriSri;
			processRunnable.jTtoolBar=jTtoolBarAutoriSri;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAutoriSri;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAutoriSri ,jPanelParametrosReportesAutoriSri, jTableDatosAutoriSri,/*jScrollPanelDatosAutoriSri,*/jPanelCamposAutoriSri,jPanelPaginacionAutoriSri, /*jScrollPanelDatosEdicionAutoriSri,*/ jPanelAccionesAutoriSri,jPanelAccionesFormularioAutoriSri,jmenuBarAutoriSri,jmenuBarDetalleAutoriSri,jTtoolBarAutoriSri,jTtoolBarDetalleAutoriSri));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAutoriSri(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAutoriSri(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAutoriSri(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAutoriSri(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAutoriSri,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAutoriSri,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAutoriSri(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAutoriSri,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAutoriSri,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.autorisriConstantesFunciones.getsFinalQueryAutoriSri();
		String  finalQueryPaginacionTodos=this.autorisriConstantesFunciones.getsFinalQueryAutoriSri();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AutoriSriConstantesFunciones.getArrayColumnasGlobalesNoAutoriSri(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AutoriSriConstantesFunciones.getArrayColumnasGlobalesAutoriSri(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AutoriSriConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.autorisrisEliminados= new ArrayList<AutoriSri>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAutoriSri();
		
				///*AutoriSriSessionBean*/this.autorisriSessionBean=new AutoriSriSessionBean();
			
			if(this.autorisriSessionBean==null) {
				this.autorisriSessionBean=new AutoriSriSessionBean();
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
					this.iNumeroPaginacion=AutoriSriConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AutoriSriConstantesFunciones.getClassesForeignKeysOfAutoriSri(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/autorisri."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			autorisrisAux= new ArrayList<AutoriSri>();
			
				
			autorisriLogic.setDatosCliente(this.datosCliente);
			autorisriLogic.setDatosDeep(this.datosDeep);
			autorisriLogic.setIsConDeep(true);
			
			
			autorisriLogic.getAutoriSriDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					autorisriLogic.getTodosAutoriSris(finalQueryGlobal,pagination);
					
					//autorisriLogic.getTodosAutoriSrisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(autorisriLogic.getAutoriSris()==null|| autorisriLogic.getAutoriSris().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							autorisrisAux= new ArrayList<AutoriSri>();
							autorisrisAux.addAll(autorisriLogic.getAutoriSris());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisrisAux= new ArrayList<AutoriSri>();
							autorisrisAux.addAll(autorisris);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							autorisriLogic.getTodosAutoriSris(finalQueryGlobal+"",this.pagination);												
							
							//autorisriLogic.getTodosAutoriSrisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAutoriSris("Todos",autorisriLogic.getAutoriSris() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							autorisriLogic.setAutoriSris(new ArrayList<AutoriSri>());					
							autorisriLogic.getAutoriSris().addAll(autorisrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisris=new ArrayList<AutoriSri>();
							autorisris.addAll(autorisrisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAutoriSri=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAutoriSri=this.idActual;
				
				} else if(this.idAutoriSriActual!=null && this.idAutoriSriActual!=0L) {
					idAutoriSri=idAutoriSriActual;
				}
				
					
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndicePorId(idAutoriSri);
				
				this.autorisris=new ArrayList<AutoriSri>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					autorisriLogic.getEntity(idAutoriSri);
					
					//autorisriLogic.getEntityWithConnection(idAutoriSri);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autorisriLogic.setAutoriSris(new ArrayList<AutoriSri>());
					autorisriLogic.getAutoriSris().add(autorisriLogic.getAutoriSri());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autorisris=new ArrayList<AutoriSri>();
					this.autorisris.add(autorisri);
				}
				
				if(autorisriLogic.getAutoriSri()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorFechaFin")) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorFechaFin(fecha_finBusquedaPorFechaFin);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autorisriLogic.getAutoriSrisBusquedaPorFechaFin(finalQueryGlobal,pagination,fecha_finBusquedaPorFechaFin);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorFechaFin(fecha_finBusquedaPorFechaFin);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorFechaFin(fecha_finBusquedaPorFechaFin);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autorisriLogic.getAutoriSris()==null||autorisriLogic.getAutoriSris().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autorisris==null|| autorisris.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisrisAux=new ArrayList<AutoriSri>();
						autorisrisAux.addAll(autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisrisAux=new ArrayList<AutoriSri>();
							autorisrisAux.addAll(autorisris);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autorisriLogic.getAutoriSrisBusquedaPorFechaFin(finalQueryGlobal,pagination,fecha_finBusquedaPorFechaFin);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorFechaFin(fecha_finBusquedaPorFechaFin);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorFechaFin(fecha_finBusquedaPorFechaFin);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriSris("BusquedaPorFechaFin",autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriSris("BusquedaPorFechaFin",autorisris);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriLogic.setAutoriSris(new ArrayList<AutoriSri>());
						autorisriLogic.getAutoriSris().addAll(autorisrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisris=new ArrayList<AutoriSri>();
							autorisris.addAll(autorisrisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorFechaInicio")) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autorisriLogic.getAutoriSrisBusquedaPorFechaInicio(finalQueryGlobal,pagination,fecha_inicioBusquedaPorFechaInicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autorisriLogic.getAutoriSris()==null||autorisriLogic.getAutoriSris().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autorisris==null|| autorisris.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisrisAux=new ArrayList<AutoriSri>();
						autorisrisAux.addAll(autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisrisAux=new ArrayList<AutoriSri>();
							autorisrisAux.addAll(autorisris);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autorisriLogic.getAutoriSrisBusquedaPorFechaInicio(finalQueryGlobal,pagination,fecha_inicioBusquedaPorFechaInicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriSris("BusquedaPorFechaInicio",autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriSris("BusquedaPorFechaInicio",autorisris);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriLogic.setAutoriSris(new ArrayList<AutoriSri>());
						autorisriLogic.getAutoriSris().addAll(autorisrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisris=new ArrayList<AutoriSri>();
							autorisris.addAll(autorisrisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNumeroAutor")) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorNumeroAutor(numero_autorBusquedaPorNumeroAutor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autorisriLogic.getAutoriSrisBusquedaPorNumeroAutor(finalQueryGlobal,pagination,numero_autorBusquedaPorNumeroAutor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorNumeroAutor(numero_autorBusquedaPorNumeroAutor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorNumeroAutor(numero_autorBusquedaPorNumeroAutor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autorisriLogic.getAutoriSris()==null||autorisriLogic.getAutoriSris().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autorisris==null|| autorisris.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisrisAux=new ArrayList<AutoriSri>();
						autorisrisAux.addAll(autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisrisAux=new ArrayList<AutoriSri>();
							autorisrisAux.addAll(autorisris);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autorisriLogic.getAutoriSrisBusquedaPorNumeroAutor(finalQueryGlobal,pagination,numero_autorBusquedaPorNumeroAutor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorNumeroAutor(numero_autorBusquedaPorNumeroAutor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorNumeroAutor(numero_autorBusquedaPorNumeroAutor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriSris("BusquedaPorNumeroAutor",autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriSris("BusquedaPorNumeroAutor",autorisris);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriLogic.setAutoriSris(new ArrayList<AutoriSri>());
						autorisriLogic.getAutoriSris().addAll(autorisrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisris=new ArrayList<AutoriSri>();
							autorisris.addAll(autorisrisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNumeroSecuencial")) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorNumeroSecuencial(numero_secuencialBusquedaPorNumeroSecuencial);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autorisriLogic.getAutoriSrisBusquedaPorNumeroSecuencial(finalQueryGlobal,pagination,numero_secuencialBusquedaPorNumeroSecuencial);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorNumeroSecuencial(numero_secuencialBusquedaPorNumeroSecuencial);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorNumeroSecuencial(numero_secuencialBusquedaPorNumeroSecuencial);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autorisriLogic.getAutoriSris()==null||autorisriLogic.getAutoriSris().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autorisris==null|| autorisris.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisrisAux=new ArrayList<AutoriSri>();
						autorisrisAux.addAll(autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisrisAux=new ArrayList<AutoriSri>();
							autorisrisAux.addAll(autorisris);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autorisriLogic.getAutoriSrisBusquedaPorNumeroSecuencial(finalQueryGlobal,pagination,numero_secuencialBusquedaPorNumeroSecuencial);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorNumeroSecuencial(numero_secuencialBusquedaPorNumeroSecuencial);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceBusquedaPorNumeroSecuencial(numero_secuencialBusquedaPorNumeroSecuencial);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriSris("BusquedaPorNumeroSecuencial",autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriSris("BusquedaPorNumeroSecuencial",autorisris);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriLogic.setAutoriSris(new ArrayList<AutoriSri>());
						autorisriLogic.getAutoriSris().addAll(autorisrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisris=new ArrayList<AutoriSri>();
							autorisris.addAll(autorisrisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autorisriLogic.getAutoriSrisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autorisriLogic.getAutoriSris()==null||autorisriLogic.getAutoriSris().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autorisris==null|| autorisris.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisrisAux=new ArrayList<AutoriSri>();
						autorisrisAux.addAll(autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisrisAux=new ArrayList<AutoriSri>();
							autorisrisAux.addAll(autorisris);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autorisriLogic.getAutoriSrisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriSris("FK_IdEmpresa",autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriSris("FK_IdEmpresa",autorisris);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriLogic.setAutoriSris(new ArrayList<AutoriSri>());
						autorisriLogic.getAutoriSris().addAll(autorisrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisris=new ArrayList<AutoriSri>();
							autorisris.addAll(autorisrisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autorisriLogic.getAutoriSrisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autorisriLogic.getAutoriSris()==null||autorisriLogic.getAutoriSris().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autorisris==null|| autorisris.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisrisAux=new ArrayList<AutoriSri>();
						autorisrisAux.addAll(autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisrisAux=new ArrayList<AutoriSri>();
							autorisrisAux.addAll(autorisris);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autorisriLogic.getAutoriSrisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriSris("FK_IdSucursal",autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriSris("FK_IdSucursal",autorisris);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriLogic.setAutoriSris(new ArrayList<AutoriSri>());
						autorisriLogic.getAutoriSris().addAll(autorisrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisris=new ArrayList<AutoriSri>();
							autorisris.addAll(autorisrisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoDocumentoGeneral")) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autorisriLogic.getAutoriSrisFK_IdTipoDocumentoGeneral(finalQueryGlobal,pagination,id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autorisriLogic.getAutoriSris()==null||autorisriLogic.getAutoriSris().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autorisris==null|| autorisris.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisrisAux=new ArrayList<AutoriSri>();
						autorisrisAux.addAll(autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisrisAux=new ArrayList<AutoriSri>();
							autorisrisAux.addAll(autorisris);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autorisriLogic.getAutoriSrisFK_IdTipoDocumentoGeneral(finalQueryGlobal,pagination,id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriSriConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriSris("FK_IdTipoDocumentoGeneral",autorisriLogic.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriSris("FK_IdTipoDocumentoGeneral",autorisris);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriLogic.setAutoriSris(new ArrayList<AutoriSri>());
						autorisriLogic.getAutoriSris().addAll(autorisrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisris=new ArrayList<AutoriSri>();
							autorisris.addAll(autorisrisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAutoriSri();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAutoriSri();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=autorisriLogic.getAutoriSris().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autorisris.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=autorisriLogic.getAutoriSris().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autorisris.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AutoriSri autorisri) {
		Boolean permite=true;
		
		if(this.autorisri.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AutoriSriConstantesFunciones.getOrderByListaAutoriSri();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AutoriSriConstantesFunciones.getOrderByListaAutoriSri();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriSri autorisri:autorisriLogic.getAutoriSris()) {
				if(autorisri.getsType().equals(Constantes2.S_TOTALES)) {
					autorisriTotales=autorisri;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriSri autorisri:this.autorisris) {
				if(autorisri.getsType().equals(Constantes2.S_TOTALES)) {
					autorisriTotales=autorisri;
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
			this.autorisriAux=new AutoriSri();
			this.autorisriAux.setsType(Constantes2.S_TOTALES);
			this.autorisriAux.setIsNew(false);
			this.autorisriAux.setIsChanged(false);
			this.autorisriAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AutoriSriConstantesFunciones.TotalizarValoresFilaAutoriSri(this.autorisriLogic.getAutoriSris(),this.autorisriAux);
				
				this.autorisriLogic.getAutoriSris().add(this.autorisriAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AutoriSriConstantesFunciones.TotalizarValoresFilaAutoriSri(this.autorisris,this.autorisriAux);
				
				this.autorisris.add(this.autorisriAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		autorisriTotales=new AutoriSri();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.autorisriLogic.getAutoriSris().remove(autorisriTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.autorisris.remove(autorisriTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		autorisriTotales=new AutoriSri();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriSri autorisri:autorisriLogic.getAutoriSris()) {
				if(autorisri.getsType().equals(Constantes2.S_TOTALES)) {
					autorisriTotales=autorisri;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AutoriSriConstantesFunciones.TotalizarValoresFilaAutoriSri(this.autorisriLogic.getAutoriSris(),autorisriTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriSri autorisri:this.autorisris) {
				if(autorisri.getsType().equals(Constantes2.S_TOTALES)) {
					autorisriTotales=autorisri;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AutoriSriConstantesFunciones.TotalizarValoresFilaAutoriSri(this.autorisris,autorisriTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAutoriSrisBusquedaPorFechaFin()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorFechaFin";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriSrisBusquedaPorFechaInicio()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorFechaInicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriSrisBusquedaPorNumeroAutor()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNumeroAutor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriSrisBusquedaPorNumeroSecuencial()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNumeroSecuencial";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriSrisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriSrisFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriSrisFK_IdTipoDocumentoGeneral()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDocumentoGeneral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAutoriSrisBusquedaPorFechaFin(String sFinalQuery,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autorisriLogic.getAutoriSrisBusquedaPorFechaFin(sFinalQuery,this.pagination,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriSrisBusquedaPorFechaInicio(String sFinalQuery,Date fecha_inicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autorisriLogic.getAutoriSrisBusquedaPorFechaInicio(sFinalQuery,this.pagination,fecha_inicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriSrisBusquedaPorNumeroAutor(String sFinalQuery,String numero_autor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autorisriLogic.getAutoriSrisBusquedaPorNumeroAutor(sFinalQuery,this.pagination,numero_autor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriSrisBusquedaPorNumeroSecuencial(String sFinalQuery,String numero_secuencial)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autorisriLogic.getAutoriSrisBusquedaPorNumeroSecuencial(sFinalQuery,this.pagination,numero_secuencial);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriSrisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autorisriLogic.getAutoriSrisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriSrisFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autorisriLogic.getAutoriSrisFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriSrisFK_IdTipoDocumentoGeneral(String sFinalQuery,Long id_tipo_documento_general)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autorisriLogic.getAutoriSrisFK_IdTipoDocumentoGeneral(sFinalQuery,this.pagination,id_tipo_documento_general);
				
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
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosAutoriSri() {
		this.isPermisoTodoAutoriSri=false;
		this.isPermisoNuevoAutoriSri=false;
		this.isPermisoActualizarAutoriSri=false;
		this.isPermisoActualizarOriginalAutoriSri=false;
		this.isPermisoEliminarAutoriSri=false;
		this.isPermisoGuardarCambiosAutoriSri=false;
		this.isPermisoConsultaAutoriSri=false;
		this.isPermisoBusquedaAutoriSri=false;
		this.isPermisoReporteAutoriSri=false;		
		this.isPermisoOrdenAutoriSri=false;		
		this.isPermisoPaginacionMedioAutoriSri=false;		
		this.isPermisoPaginacionAltoAutoriSri=false;
		this.isPermisoPaginacionTodoAutoriSri=false;
		this.isPermisoCopiarAutoriSri=false;		
		this.isPermisoVerFormAutoriSri=false;		
		this.isPermisoDuplicarAutoriSri=false;		
		this.isPermisoOrdenAutoriSri=false;		
	}
	
	public void setPermisosUsuarioAutoriSri(Boolean isPermiso) {
		this.isPermisoTodoAutoriSri=isPermiso;
		this.isPermisoNuevoAutoriSri=isPermiso;
		this.isPermisoActualizarAutoriSri=isPermiso;
		this.isPermisoActualizarOriginalAutoriSri=isPermiso;
		this.isPermisoEliminarAutoriSri=isPermiso;
		this.isPermisoGuardarCambiosAutoriSri=isPermiso;
		this.isPermisoConsultaAutoriSri=isPermiso;
		this.isPermisoBusquedaAutoriSri=isPermiso;
		this.isPermisoReporteAutoriSri=isPermiso;
		this.isPermisoOrdenAutoriSri=isPermiso;		
		this.isPermisoPaginacionMedioAutoriSri=isPermiso;		
		this.isPermisoPaginacionAltoAutoriSri=isPermiso;		
		this.isPermisoPaginacionTodoAutoriSri=isPermiso;		
		this.isPermisoCopiarAutoriSri=isPermiso;		
		this.isPermisoVerFormAutoriSri=isPermiso;		
		this.isPermisoDuplicarAutoriSri=isPermiso;
		this.isPermisoOrdenAutoriSri=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAutoriSri(Boolean isPermiso) {
		//this.isPermisoTodoAutoriSri=isPermiso;
		this.isPermisoNuevoAutoriSri=isPermiso;
		this.isPermisoActualizarAutoriSri=isPermiso;
		this.isPermisoActualizarOriginalAutoriSri=isPermiso;
		this.isPermisoEliminarAutoriSri=isPermiso;
		this.isPermisoGuardarCambiosAutoriSri=isPermiso;
		//this.isPermisoConsultaAutoriSri=isPermiso;
		//this.isPermisoBusquedaAutoriSri=isPermiso;
		//this.isPermisoReporteAutoriSri=isPermiso;
		//this.isPermisoOrdenAutoriSri=isPermiso;		
		//this.isPermisoPaginacionMedioAutoriSri=isPermiso;		
		//this.isPermisoPaginacionAltoAutoriSri=isPermiso;		
		//this.isPermisoPaginacionTodoAutoriSri=isPermiso;		
		//this.isPermisoCopiarAutoriSri=isPermiso;		
		//this.isPermisoDuplicarAutoriSri=isPermiso;
		//this.isPermisoOrdenAutoriSri=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAutoriSriClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AutoriSriJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAutoriSri(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAutoriSriClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAutoriSriClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAutoriSriClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAutoriSriClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAutoriSri() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AutoriSriJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.autorisriSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AutoriSriConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAutoriSri=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAutoriSri=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAutoriSri=this.isPermisoActualizarAutoriSri;
			this.isPermisoEliminarAutoriSri=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAutoriSri=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAutoriSri=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAutoriSri=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAutoriSri=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAutoriSri=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAutoriSri=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAutoriSri=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAutoriSri=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAutoriSri=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAutoriSri=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAutoriSri=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAutoriSri=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAutoriSri=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.autorisriSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAutoriSri.setToolTipText(this.jTableDatosAutoriSri.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAutoriSri(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAutoriSri(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AutoriSriJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AutoriSriJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAutoriSri() throws Exception {
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
	public void inicializarCombosForeignKeyAutoriSriListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tipodocumentogeneralsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAutoriSriListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AutoriSriJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAutoriSriListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDocumentoGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoDocumentoGeneralListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodocumentogeneralsForeignKey==null||this.tipodocumentogeneralsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDocumentoGeneralConstantesFunciones.getArrayColumnasGlobalesTipoDocumentoGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoGeneralConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDocumentoGeneralConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDocumentoGeneralsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyAutoriSriListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AutoriSriParameterReturnGeneral autorisriReturnGeneral=new AutoriSriParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.autorisriConstantesFunciones.cargarid_empresaAutoriSri)
					 || (this.esRecargarFks && this.autorisriConstantesFunciones.cargarid_empresaAutoriSri)) {

					if(!this.autorisriSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+autorisriSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.autorisriConstantesFunciones.cargarid_sucursalAutoriSri)
					 || (this.esRecargarFks && this.autorisriConstantesFunciones.cargarid_sucursalAutoriSri)) {

					if(!this.autorisriSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+autorisriSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTipoDocumentoGeneral="";

				if(((this.tipodocumentogeneralsForeignKey==null||this.tipodocumentogeneralsForeignKey.size()<=0) && this.autorisriConstantesFunciones.cargarid_tipo_documento_generalAutoriSri)
					 || (this.esRecargarFks && this.autorisriConstantesFunciones.cargarid_tipo_documento_generalAutoriSri)) {

					if(!this.autorisriSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoDocumentoGeneralConstantesFunciones.getArrayColumnasGlobalesTipoDocumentoGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoDocumentoGeneral=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoGeneralConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoDocumentoGeneral=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoDocumentoGeneral, "");
						finalQueryGlobalTipoDocumentoGeneral+=TipoDocumentoGeneralConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoDocumentoGeneralsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoDocumentoGeneral=" WHERE " + ConstantesSql.ID + "="+autorisriSessionBean.getlidTipoDocumentoGeneralActual();
					}
				} else {
					finalQueryGlobalTipoDocumentoGeneral="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				autorisriReturnGeneral=autorisriLogic.cargarCombosLoteForeignKeyAutoriSri(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTipoDocumentoGeneral);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=autorisriReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=autorisriReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTipoDocumentoGeneral.equals("NONE")) {
				this.tipodocumentogeneralsForeignKey=autorisriReturnGeneral.gettipodocumentogeneralsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAutoriSri()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.autorisriSessionBean==null) {
				this.autorisriSessionBean=new AutoriSriSessionBean();
			}

			if(!this.autorisriSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.autorisriSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoDocumentoGeneral()throws Exception {
		try {

			if(!this.autorisriSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral()) {
				TipoDocumentoGeneral tipodocumentogeneral=new TipoDocumentoGeneral();
				TipoDocumentoGeneralConstantesFunciones.setTipoDocumentoGeneralDescripcion(tipodocumentogeneral,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodocumentogeneral.setId(null);

				if(!TipoDocumentoGeneralConstantesFunciones.ExisteEnLista(this.tipodocumentogeneralsForeignKey,tipodocumentogeneral,true)) {

					this.tipodocumentogeneralsForeignKey.add(0,tipodocumentogeneral);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyAutoriSri()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAutoriSri(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAutoriSri()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.autorisri.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.autorisri.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAutoriSri();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAutoriSri(AutoriSri autorisri)throws Exception {	
		try {
			
			this.setActualTipoDocumentoGeneralForeignKey(autorisri.getid_tipo_documento_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAutoriSri(AutoriSri autorisri,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAutoriSri()throws Exception {	
		try {
			
			this.setActualTipoDocumentoGeneralForeignKey(this.autorisriConstantesFunciones.getid_tipo_documento_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAutoriSri()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAutoriSri()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAutoriSri()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAutoriSri()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAutoriSri()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTipoDocumentoGeneralsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAutoriSri(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDocumentoGeneralsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAutoriSri()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public AutoriSriBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AutoriSriBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AutoriSriBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.autorisriSessionBean=new AutoriSriSessionBean(); 
		this.autorisriConstantesFunciones=new AutoriSriConstantesFunciones(); 
		this.autorisriBean=new AutoriSri();//(this.autorisriConstantesFunciones); 		
		this.autorisriReturnGeneral=new AutoriSriParameterReturnGeneral(); 
		
		this.autorisriSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autorisriSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AutoriSriBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AutoriSriBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AutoriSriBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAutoriSri(true);
			
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
			
			this.autorisriConstantesFunciones=new AutoriSriConstantesFunciones(); 
			this.autorisriBean=new AutoriSri();//this.autorisriConstantesFunciones); 			
			this.autorisriReturnGeneral=new AutoriSriParameterReturnGeneral(); 
		
			AutoriSriBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Autorizaciones Sri Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.autorisri=new AutoriSri();
			this.autorisris = new ArrayList<AutoriSri>();
			this.autorisrisAux = new ArrayList<AutoriSri>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic=new AutoriSriLogic();
				this.autorisriLogic.getNewConnexionToDeep("");
			}
			
			//this.autorisriSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.autorisriSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAutoriSri);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAutoriSri!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAutoriSri);	
					}
					
					if(this.jInternalFrameImportacionAutoriSri!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAutoriSri);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAutoriSri!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAutoriSri);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAutoriSri!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAutoriSri);
				this.jInternalFrameDetalleFormAutoriSri.setVisible(false);
				this.jInternalFrameDetalleFormAutoriSri.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAutoriSri!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAutoriSri);
					this.jInternalFrameReporteDinamicoAutoriSri.setVisible(false);
					this.jInternalFrameReporteDinamicoAutoriSri.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAutoriSri!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAutoriSri);
					this.jInternalFrameImportacionAutoriSri.setVisible(false);
					this.jInternalFrameImportacionAutoriSri.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAutoriSri!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAutoriSri);
					this.jInternalFrameOrderByAutoriSri.setVisible(false);
					this.jInternalFrameOrderByAutoriSri.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAutoriSriActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AutoriSriConstantesFunciones.INUMEROPAGINACION;
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
			
			this.autorisriReturnGeneral=new AutoriSriParameterReturnGeneral();
			
			this.autorisriParameterGeneral=new AutoriSriParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.autorisriLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AutoriSriJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.autorisriSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AutoriSriConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.autorisriSessionBean.getEsGuardarRelacionado(),this.autorisriSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AutoriSriConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.autorisriSessionBean.getEsGuardarRelacionado(),this.autorisriSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAutoriSri=false;
			this.isVisibilidadCeldaDuplicarAutoriSri=true;
			this.isVisibilidadCeldaCopiarAutoriSri=true;
			this.isVisibilidadCeldaVerFormAutoriSri=true;
			this.isVisibilidadCeldaOrdenAutoriSri=true;
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=false;
			this.isVisibilidadCeldaModificarAutoriSri=false;
			this.isVisibilidadCeldaActualizarAutoriSri=false;
			this.isVisibilidadCeldaEliminarAutoriSri=false;
			this.isVisibilidadCeldaCancelarAutoriSri=false;
			this.isVisibilidadCeldaGuardarAutoriSri=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=false;
			
			
			this.isVisibilidadBusquedaPorFechaFin=true;
			this.isVisibilidadBusquedaPorFechaInicio=true;
			this.isVisibilidadBusquedaPorNumeroAutor=true;
			this.isVisibilidadBusquedaPorNumeroSecuencial=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoDocumentoGeneral=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAutoriSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAutoriSri();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAutoriSri(false);
			
			this.setPermisosUsuarioAutoriSri();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autorisriSessionBean.getEsGuardarRelacionado() 
				|| (this.autorisriSessionBean.getEsGuardarRelacionado() && this.autorisriSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAutoriSriClasesRelacionadas();
			}
			
			if(this.autorisriSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAutoriSriClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AutoriSriJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAutoriSri();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAutoriSri();
			}
			
			if(!this.isPermisoBusquedaAutoriSri) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAutoriSri.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAutoriSri,this.isPermisoPaginacionMedioAutoriSri,this.isPermisoPaginacionTodoAutoriSri);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AutoriSriConstantesFunciones.getTiposSeleccionarAutoriSri());
				
				this.tiposColumnasSelect=AutoriSriConstantesFunciones.getTiposSeleccionarAutoriSri(true);
				
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
			//if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAutoriSri();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioAutoriSri(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioAutoriSri(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAutoriSri() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.tipodocumentogeneralLogic=new TipoDocumentoGeneralLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				autorisriImplementable= (AutoriSriImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AutoriSriConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				autorisriImplementableHome= (AutoriSriImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AutoriSriConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.autorisris= new ArrayList<AutoriSri>();
			this.autorisrisEliminados= new ArrayList<AutoriSri>();
						
			this.isEsNuevoAutoriSri=false;
			this.esParaAccionDesdeFormularioAutoriSri=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tipodocumentogeneralsForeignKey=new ArrayList<TipoDocumentoGeneral>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAutoriSri(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAutoriSri();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AutoriSriBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AutoriSriConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAutoriSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAutoriSri(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAutoriSri!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAutoriSri();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAutoriSri();
			}
			
			AutoriSriBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAutoriSri.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAutoriSri.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAutoriSri.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAutoriSri(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AutoriSri: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAutoriSri() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAutoriSri")) {
				iIndex=this.jInternalFrameDetalleFormAutoriSri.jTabbedPaneRelacionesAutoriSri.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAutoriSri.jTabbedPaneRelacionesAutoriSri.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAutoriSri();	
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
	
	public void cargarCombosForeignKeyAutoriSri(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAutoriSri(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAutoriSri(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAutoriSriListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAutoriSri();
		
		this.cargarCombosFrameForeignKeyAutoriSri();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAutoriSri();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAutoriSri();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoDocumentoGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDocumentoGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
				this.cargarCombosFrameTipoDocumentoGeneralsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDocumentoGeneral(this.tipodocumentogeneralsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoAutoriSriActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.autorisriSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
			
			if(jTableDatosAutoriSri.getRowCount()>=1) {
				jTableDatosAutoriSri.removeRowSelectionInterval(0, jTableDatosAutoriSri.getRowCount()-1);						
			}
			
			this.isEsNuevoAutoriSri=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAutoriSri(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAutoriSri(true);			
			//this.autorisri=new AutoriSri();
			//this.autorisri.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutoriSri(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriSri() ;
			
			if(AutoriSriJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutoriSri(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.autorisri);	
			this.actualizarInformacion("INFO_PADRE",false,this.autorisri);				
			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
			if(this.autorisriSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AutoriSri: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAutoriSriActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAutoriSri.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAutoriSri.getSelectedRows().length;			
			}
			
			autorisrisSeleccionados=this.getAutoriSrisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAutoriSri--;			
				//AutoriSri autorisriAux= new AutoriSri();			
				//autorisriAux.setId(this.iIdNuevoAutoriSri);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AutoriSri autorisriOrigen=new AutoriSri();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AutoriSri autorisriOrigen : autorisrisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							autorisriOrigen =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorisriOrigen =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAutoriSri();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.autorisri.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAutoriSri(autorisriOrigen,this.autorisri,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.autorisriLogic.getAutoriSris().add(this.autorisriAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.autorisris.add(this.autorisriAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAutoriSri(false);
				
				this.jTableDatosAutoriSri.setRowSelectionInterval(this.getIndiceNuevoAutoriSri(), this.getIndiceNuevoAutoriSri());
				
				int iLastRow =  this.jTableDatosAutoriSri.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAutoriSri.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAutoriSri.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAutoriSri(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();									
		
			AutoriSri autorisriOrigen=new AutoriSri();
			AutoriSri autorisriDestino=new AutoriSri();
				
			autorisrisSeleccionados=this.getAutoriSrisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAutoriSri.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || autorisrisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAutoriSri.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriOrigen =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						autorisriOrigen =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autorisriDestino =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						autorisriDestino =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				autorisriOrigen =autorisrisSeleccionados.get(0);
				autorisriDestino =autorisrisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAutoriSri(autorisriOrigen,autorisriDestino,true,false);
				
				autorisriDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(autorisriDestino,autorisriLogic.getAutoriSris());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autorisriDestino,autorisris);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAutoriSri(false);
				
				//this.jTableDatosAutoriSri.setRowSelectionInterval(this.getIndiceNuevoAutoriSri(), this.getIndiceNuevoAutoriSri());
				
				int iLastRow =  this.jTableDatosAutoriSri.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAutoriSri.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAutoriSri.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAutoriSri(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAutoriSri.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAutoriSri.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAutoriSri.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAutoriSri.setVisible(!isVisible);
			this.jPanelPaginacionAutoriSri.setVisible(!isVisible);
			this.jPanelAccionesAutoriSri.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAutoriSri();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAutoriSri();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAutoriSri();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAutoriSri();
			
			this.abrirFrameOrderByAutoriSri();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAutoriSri();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAutoriSri(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAutoriSri);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAutoriSri.isMaximum()) {
					this.jInternalFrameDetalleFormAutoriSri.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAutoriSri.setSize(this.jInternalFrameDetalleFormAutoriSri.iWidthFormulario,this.jInternalFrameDetalleFormAutoriSri.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAutoriSri.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAutoriSri.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAutoriSri.isMaximum()) {
						this.jInternalFrameDetalleFormAutoriSri.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAutoriSri.jContentPaneDetalleAutoriSri.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAutoriSri.jTabbedPaneRelacionesAutoriSri.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAutoriSri.jContentPaneDetalleAutoriSri.getWidth(),AutoriSriConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAutoriSri.jTabbedPaneRelacionesAutoriSri.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAutoriSri.jContentPaneDetalleAutoriSri.getWidth(),AutoriSriConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAutoriSri.jTabbedPaneRelacionesAutoriSri.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAutoriSri.jContentPaneDetalleAutoriSri.getWidth(),AutoriSriConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAutoriSri.setVisible(true);
	        this.jInternalFrameDetalleFormAutoriSri.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAutoriSri() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAutoriSri==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAutoriSri=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriSri,false,this);
				} else {
					this.jInternalFrameOrderByAutoriSri=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriSri,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAutoriSri);
				this.jInternalFrameOrderByAutoriSri.setVisible(false);
				this.jInternalFrameOrderByAutoriSri.setSelected(false);
				
				this.jInternalFrameOrderByAutoriSri.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAutoriSri"));
				
				this.inicializarActualizarBindingTablaOrderByAutoriSri();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAutoriSri() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAutoriSri==null) {
				
				this.jInternalFrameImportacionAutoriSri=new ImportacionJInternalFrame(AutoriSriConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAutoriSri);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAutoriSri);
				this.jInternalFrameImportacionAutoriSri.setVisible(false);
				this.jInternalFrameImportacionAutoriSri.setSelected(false);


				this.jInternalFrameImportacionAutoriSri.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAutoriSri"));
				this.jInternalFrameImportacionAutoriSri.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAutoriSri"));
				this.jInternalFrameImportacionAutoriSri.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAutoriSri"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAutoriSri() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAutoriSri==null) {
				this.jInternalFrameReporteDinamicoAutoriSri=new ReporteDinamicoJInternalFrame(AutoriSriConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAutoriSri);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAutoriSri);
				this.jInternalFrameReporteDinamicoAutoriSri.setVisible(false);
				this.jInternalFrameReporteDinamicoAutoriSri.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAutoriSri.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutoriSri"));
				this.jInternalFrameReporteDinamicoAutoriSri.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutoriSri"));
				this.jInternalFrameReporteDinamicoAutoriSri.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutoriSri"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutoriSri();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAutoriSri() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAutoriSri);
			
	       	this.jInternalFrameDetalleFormAutoriSri.setVisible(false);
	        this.jInternalFrameDetalleFormAutoriSri.setSelected(false);
			
			//this.jInternalFrameDetalleFormAutoriSri.dispose();
			//this.jInternalFrameDetalleFormAutoriSri=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAutoriSri() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAutoriSri.setVisible(true);
	        this.jInternalFrameReporteDinamicoAutoriSri.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAutoriSri() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAutoriSri.setVisible(true);
	        this.jInternalFrameImportacionAutoriSri.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAutoriSri() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAutoriSri.setVisible(true);
	        this.jInternalFrameOrderByAutoriSri.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAutoriSri() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAutoriSri.setVisible(false);
	        this.jInternalFrameOrderByAutoriSri.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAutoriSri() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAutoriSri.setVisible(false);
	        this.jInternalFrameReporteDinamicoAutoriSri.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAutoriSri() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAutoriSri.setVisible(false);
	        this.jInternalFrameImportacionAutoriSri.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAutoriSri(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAutoriSri(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAutoriSri(true);
			//this.isEsNuevoAutoriSri=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAutoriSri("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutoriSri(false) ;
			
			if(autorisriSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AutoriSriJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutoriSri(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriSri(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAutoriSriActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAutoriSri(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAutoriSri(true);
			//this.isEsNuevoAutoriSri=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.autorisri.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAutoriSri("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAutoriSri(false) ;
			
			if(AutoriSriJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutoriSri(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriSri(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoDocumentoGeneral(List<TipoDocumentoGeneral> tipodocumentogeneralsForeignKey)throws Exception{
		TableColumn tableColumnTipoDocumentoGeneral=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL));
		TableCellEditor tableCellEditorTipoDocumentoGeneral =tableColumnTipoDocumentoGeneral.getCellEditor();

		TipoDocumentoGeneralTableCell tipodocumentogeneralTableCellFk=(TipoDocumentoGeneralTableCell)tableCellEditorTipoDocumentoGeneral;

		if(tipodocumentogeneralTableCellFk!=null) {
			tipodocumentogeneralTableCellFk.settipodocumentogeneralsForeignKey(tipodocumentogeneralsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAutoriSri.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodocumentogeneralTableCellFk.setRowActual(intSelectedRow);
			//tipodocumentogeneralTableCellFk.settipodocumentogeneralsForeignKeyActual(tipodocumentogeneralsForeignKey);
		//}


		if(tipodocumentogeneralTableCellFk!=null) {
			tipodocumentogeneralTableCellFk.RecargarTipoDocumentoGeneralsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAutoriSri(false);
			
			//if(!this.isEsNuevoAutoriSri) {								
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				
			}
			
			if(this.permiteMantenimiento(this.autorisri)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.autorisriSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAutoriSri=true;
					this.inicializarActualizarBindingTablaAutoriSri(false);
					this.isEsNuevoAutoriSri=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAutoriSri=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAutoriSri=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAutoriSri(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutoriSri(false);
				
				this.habilitarDeshabilitarControlesAutoriSri(false);
			
												
				
				if(AutoriSriJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAutoriSri();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAutoriSriActionPerformed(evt,autorisriSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAutoriSri(this.autorisri,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAutoriSri.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,autorisriSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.autorisri.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAutoriSriActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				this.autorisri.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				this.autorisri.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.autorisri)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.autorisriSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AutoriSriModel) this.jTableDatosAutoriSri.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAutoriSri=true;
				this.inicializarActualizarBindingTablaAutoriSri(false);
				this.isEsNuevoAutoriSri=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAutoriSri(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutoriSri(false);
				
				this.habilitarDeshabilitarControlesAutoriSri(false);
				
				
				
				if(AutoriSriJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAutoriSri();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAutoriSriActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAutoriSri.getRowCount()>=1) {
				jTableDatosAutoriSri.removeRowSelectionInterval(0, jTableDatosAutoriSri.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAutoriSri(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAutoriSri(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutoriSri(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriSri(false) ;
			
			this.isEsNuevoAutoriSri=false;
			
			if(AutoriSriJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAutoriSri();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAutoriSriActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAutoriSri(false);
				
				//SI ES MANUAL
				if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAutoriSri();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAutoriSriActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAutoriSri--;			
			//AutoriSri autorisriAux= new AutoriSri();			
			//autorisriAux.setId(this.iIdNuevoAutoriSri);
			
			if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAutoriSri();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
			
			this.autorisri.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.autorisriLogic.getAutoriSris().add(this.autorisriAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.autorisris.add(this.autorisriAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAutoriSri(false);
			
			this.jTableDatosAutoriSri.setRowSelectionInterval(this.getIndiceNuevoAutoriSri(), this.getIndiceNuevoAutoriSri());
			
			int iLastRow =  this.jTableDatosAutoriSri.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAutoriSri.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAutoriSri.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAutoriSri(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAutoriSriActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAutoriSri(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriSri(false);
			
			//SI ES MANUAL
			if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutoriSri();
			}
			
			//this.abrirFrameTreeAutoriSri();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAutoriSriActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Autorizaciones SriS ?", "MANTENIMIENTO DE Autorizaciones Sri", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAutoriSri.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAutoriSri();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.autorisriReturnGeneral=autorisriLogic.procesarImportacionAutoriSrisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.autorisriParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAutoriSriReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAutoriSriActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAutoriSri.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAutoriSri.setFileImportacion(this.jInternalFrameImportacionAutoriSri.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAutoriSri.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAutoriSri.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAutoriSri.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAutoriSri.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAutoriSriActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();		

		autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AutoriSriBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AutoriSriBaseDesign.jrxml";
			
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
			
			this.generarReporteAutoriSris("Todos",autorisrisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Sri",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AutoriSriConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriSriConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDocumentoGeneral_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDocumentoGeneral_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDocumentoGeneral_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDocumentoGeneral_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSecuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSecuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSecuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSecuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAutor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAutor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAutor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAutor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriSriConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriSriConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriSriConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAutoriSri.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AutoriSriConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case AutoriSriConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					sNombreCampoCategoria="id_tipo_documento_general";
					break;

				case AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					sNombreCampoCategoria="numero_secuencial";
					break;

				case AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR:
					sNombreCampoCategoria="numero_autor";
					break;

				case AutoriSriConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case AutoriSriConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case AutoriSriConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AutoriSriConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case AutoriSriConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					sNombreCampoCategoriaValor="id_tipo_documento_general";
					break;

				case AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					sNombreCampoCategoriaValor="numero_secuencial";
					break;

				case AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR:
					sNombreCampoCategoriaValor="numero_autor";
					break;

				case AutoriSriConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case AutoriSriConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case AutoriSriConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AutoriSriConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case AutoriSriConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"T. Documento General",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_documento_general");
					break;

				case AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_secuencial");
					break;

				case AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_autor");
					break;

				case AutoriSriConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case AutoriSriConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case AutoriSriConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoAutoriSriActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();		
		
		autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorisri";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AutoriSris");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AutoriSriConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriSriConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AutoriSri autorisri:autorisrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorisri.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriSriConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriSriConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(AutoriSri autorisri:autorisrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorisri.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
					iRow++;

					for(AutoriSri autorisri:autorisrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorisri.gettipodocumentogeneral_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL);
					iRow++;

					for(AutoriSri autorisri:autorisrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorisri.getnumero_secuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR);
					iRow++;

					for(AutoriSri autorisri:autorisrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorisri.getnumero_autor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriSriConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriSriConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(AutoriSri autorisri:autorisrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorisri.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriSriConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriSriConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(AutoriSri autorisri:autorisrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorisri.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriSriConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriSriConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(AutoriSri autorisri:autorisrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorisri.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelAutoriSri(row);				
			//	iRow++;
			//}				
			
			//for(AutoriSri autorisriAux:autorisrisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAutoriSri(autorisriAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Sri",JOptionPane.INFORMATION_MESSAGE);
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
				this.autorisriLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriSri(false);
			
			//SI ES MANUAL
			if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutoriSri();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAutoriSriActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriSri(false);
			
			//SI ES MANUAL
			if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAutoriSri();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAutoriSriActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriSri(false);
			
			//SI ES MANUAL
			if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAutoriSri();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAutoriSri() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAutoriSri.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAutoriSri.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAutoriSri.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAutoriSri.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAutoriSri.setMinimumSize(dimensionMinimum);
		this.jTableDatosAutoriSri.setMaximumSize(dimensionMaximum);
		this.jTableDatosAutoriSri.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAutoriSri(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAutoriSri(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAutoriSri(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAutoriSri(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAutoriSri(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAutoriSri(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAutoriSri(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAutoriSri(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AutoriSriJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAutoriSri() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAutoriSri();
		
		this.inicializarActualizarBindingBotonesManualAutoriSri(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAutoriSri();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAutoriSri() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAutoriSri(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAutoriSri(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAutoriSri.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAutoriSri.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAutoriSri.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAutoriSri!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAutoriSri.jCheckBoxPostAccionNuevoAutoriSri.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAutoriSri.jCheckBoxPostAccionSinCerrarAutoriSri.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAutoriSri.jCheckBoxPostAccionSinMensajeAutoriSri.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAutoriSri.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAutoriSri.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAutoriSri.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAutoriSri!=null) {
				this.jInternalFrameDetalleFormAutoriSri.jCheckBoxPostAccionNuevoAutoriSri.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAutoriSri.jCheckBoxPostAccionSinCerrarAutoriSri.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAutoriSri.jCheckBoxPostAccionSinMensajeAutoriSri.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAutoriSri.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAutoriSri.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAutoriSri.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAutoriSri!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAutoriSri.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAutoriSri.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAutoriSri.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAutoriSri.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAutoriSri!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAutoriSri.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAutoriSri.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAutoriSri(Boolean esInicializar) throws Exception {
		try	{	
			if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAutoriSri(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAutoriSri() throws Exception {
		try	{
			if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAutoriSri();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAutoriSri() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAutoriSri() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAutoriSri.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAutoriSri.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAutoriSri.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAutoriSri.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAutoriSri.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAutoriSri.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAutoriSri.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAutoriSri.addItem(reporte);
			}
			
			
			if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAutoriSri.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAutoriSri.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAutoriSri.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAutoriSri.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAutoriSri.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAutoriSri.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAutoriSri.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAutoriSri.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAutoriSri.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutoriSri();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutoriSri() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAutoriSri!=null) {
				this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAutoriSri!=null) {
				this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAutoriSri.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAutoriSri!=null) {
				
				if(this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAutoriSri.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAutoriSri.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAutoriSri.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAutoriSri.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAutoriSri()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_finBusquedaPorFechaFin=new Date(this.jDateChooserfecha_finBusquedaPorFechaFinAutoriSri.getDate().getTime());
		this.fecha_inicioBusquedaPorFechaInicio=new Date(this.jDateChooserfecha_inicioBusquedaPorFechaInicioAutoriSri.getDate().getTime());
		this.numero_autorBusquedaPorNumeroAutor=this.jTextFieldnumero_autorBusquedaPorNumeroAutorAutoriSri.getText();
		this.numero_secuencialBusquedaPorNumeroSecuencial=this.jTextFieldnumero_secuencialBusquedaPorNumeroSecuencialAutoriSri.getText();
		if(this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.getSelectedItem()!=null){this.id_tipo_documento_generalFK_IdTipoDocumentoGeneral=((TipoDocumentoGeneral)this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralAutoriSri.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAutoriSri(Boolean esInicializar) throws Exception {				
		if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAutoriSri();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAutoriSri() throws Exception {
		this.inicializarActualizarBindingTablaAutoriSri(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAutoriSri() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAutoriSriOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSriOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAutoriSri(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=autorisriLogic.getAutoriSris().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=autorisris.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAutoriSri.setModel(new AutoriSriModel(this.autorisriLogic.getAutoriSris(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAutoriSri.setModel(new AutoriSriModel(this.autorisris,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAutoriSri!=null && this.jInternalFrameOrderByAutoriSri.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAutoriSri();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AutoriSriConstantesFunciones.SCLASSWEBTITULO,autorisriConstantesFunciones.resaltarSeleccionarAutoriSri,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AutoriSriConstantesFunciones.SCLASSWEBTITULO,autorisriConstantesFunciones.resaltarSeleccionarAutoriSri,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,AutoriSriConstantesFunciones.LABEL_ID));

		if(this.autorisriConstantesFunciones.mostraridAutoriSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriSriConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.autorisriConstantesFunciones.resaltaridAutoriSri,this.autorisriConstantesFunciones.activaridAutoriSri,this,true,"idAutoriSri","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autorisriConstantesFunciones.resaltaridAutoriSri,this.autorisriConstantesFunciones.activaridAutoriSri,this,true,"idAutoriSri","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,AutoriSriConstantesFunciones.LABEL_IDEMPRESA));

		if(this.autorisriConstantesFunciones.mostrarid_empresaAutoriSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriSriConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.autorisriConstantesFunciones.resaltarid_empresaAutoriSri,this,this.autorisriConstantesFunciones.activarid_empresaAutoriSri));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.autorisriConstantesFunciones.resaltarid_empresaAutoriSri,this,this.autorisriConstantesFunciones.activarid_empresaAutoriSri,false,"id_empresaAutoriSri","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,AutoriSriConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.autorisriConstantesFunciones.mostrarid_sucursalAutoriSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriSriConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.autorisriConstantesFunciones.resaltarid_sucursalAutoriSri,this,this.autorisriConstantesFunciones.activarid_sucursalAutoriSri));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.autorisriConstantesFunciones.resaltarid_sucursalAutoriSri,this,this.autorisriConstantesFunciones.activarid_sucursalAutoriSri,false,"id_sucursalAutoriSri","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL));

		if(this.autorisriConstantesFunciones.mostrarid_tipo_documento_generalAutoriSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDocumentoGeneralTableCell(this.tipodocumentogeneralsForeignKey,this.autorisriConstantesFunciones.resaltarid_tipo_documento_generalAutoriSri,this,this.autorisriConstantesFunciones.activarid_tipo_documento_generalAutoriSri));
			tableColumn.setCellEditor(new TipoDocumentoGeneralTableCell(this.tipodocumentogeneralsForeignKey,this.autorisriConstantesFunciones.resaltarid_tipo_documento_generalAutoriSri,this,this.autorisriConstantesFunciones.activarid_tipo_documento_generalAutoriSri,true,"id_tipo_documento_generalAutoriSri","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL));

		if(this.autorisriConstantesFunciones.mostrarnumero_secuencialAutoriSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autorisriConstantesFunciones.resaltarnumero_secuencialAutoriSri,this.autorisriConstantesFunciones.activarnumero_secuencialAutoriSri,this,true,"numero_secuencialAutoriSri","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autorisriConstantesFunciones.resaltarnumero_secuencialAutoriSri,this.autorisriConstantesFunciones.activarnumero_secuencialAutoriSri,this,true,"numero_secuencialAutoriSri","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR));

		if(this.autorisriConstantesFunciones.mostrarnumero_autorAutoriSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autorisriConstantesFunciones.resaltarnumero_autorAutoriSri,this.autorisriConstantesFunciones.activarnumero_autorAutoriSri,this,true,"numero_autorAutoriSri","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autorisriConstantesFunciones.resaltarnumero_autorAutoriSri,this.autorisriConstantesFunciones.activarnumero_autorAutoriSri,this,true,"numero_autorAutoriSri","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,AutoriSriConstantesFunciones.LABEL_FECHAINICIO));

		if(this.autorisriConstantesFunciones.mostrarfecha_inicioAutoriSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriSriConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.autorisriConstantesFunciones.resaltarfecha_inicioAutoriSri,this.autorisriConstantesFunciones.activarfecha_inicioAutoriSri,this,true,"fecha_inicioAutoriSri","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.autorisriConstantesFunciones.resaltarfecha_inicioAutoriSri,this.autorisriConstantesFunciones.activarfecha_inicioAutoriSri,this,true,"fecha_inicioAutoriSri","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,AutoriSriConstantesFunciones.LABEL_FECHAFIN));

		if(this.autorisriConstantesFunciones.mostrarfecha_finAutoriSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriSriConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.autorisriConstantesFunciones.resaltarfecha_finAutoriSri,this.autorisriConstantesFunciones.activarfecha_finAutoriSri,this,true,"fecha_finAutoriSri","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.autorisriConstantesFunciones.resaltarfecha_finAutoriSri,this.autorisriConstantesFunciones.activarfecha_finAutoriSri,this,true,"fecha_finAutoriSri","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,AutoriSriConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.autorisriConstantesFunciones.mostraresta_activoAutoriSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriSriConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.autorisriConstantesFunciones.resaltaresta_activoAutoriSri,this.autorisriConstantesFunciones.activaresta_activoAutoriSri));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.autorisriConstantesFunciones.resaltaresta_activoAutoriSri,this.autorisriConstantesFunciones.activaresta_activoAutoriSri,this,true,"esta_activoAutoriSri","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AutoriSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.autorisriSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.autorisriSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAutoriSri.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.autorisriSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.autorisriSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAutoriSri.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAutoriSri && this.isPermisoGuardarCambiosAutoriSri) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.autorisriSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.autorisriSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAutoriSri.addColumn(tableColumn);
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
			
			this.jTableDatosAutoriSri.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAutoriSri && this.isPermisoGuardarCambiosAutoriSri) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAutoriSri && this.isPermisoGuardarCambiosAutoriSri) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAutoriSri.moveColumn(this.jTableDatosAutoriSri.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAutoriSri.moveColumn(this.jTableDatosAutoriSri.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAutoriSri.moveColumn(this.jTableDatosAutoriSri.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAutoriSri.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAutoriSri.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAutoriSri,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAutoriSri.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAutoriSri.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAutoriSri.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAutoriSri.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAutoriSri.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=autorisriLogic.getAutoriSris().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=autorisris.size()-1;
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
		//this.jTableDatosAutoriSri.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAutoriSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAutoriSri();
			
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
				
				//this.isEsNuevoAutoriSri=false;
					
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
				if(this.autorisriSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAutoriSri==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAutoriSri.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAutoriSri.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.autorisri.getsType().equals("DUPLICADO")
				   || this.autorisri.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAutoriSri=true;
				
				} else {
					this.isEsNuevoAutoriSri=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
					if(this.autorisri.getId()>=0 && !this.autorisri.getIsNew()) {						
						this.isEsNuevoAutoriSri=false;
						
					} else {
						this.isEsNuevoAutoriSri=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAutoriSri(esRelaciones);						
				
				this.seleccionarAutoriSri(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.autorisri.getId()<0) {
					this.isEsNuevoAutoriSri=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAutoriSri(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAutoriSri(evt,rowIndex);
				}	
				
				if(this.autorisriSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AutoriSri: " + this.dDif); 
					}
				}								
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAutoriSri(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.autorisri)) {
					if(this.autorisri.getId()>0) {
						this.autorisri.setIsDeleted(true);
						
						this.autorisrisEliminados.add(this.autorisri);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.autorisriLogic.getAutoriSris().remove(this.autorisri);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.autorisris.remove(this.autorisri);				
					}
					
					
					((AutoriSriModel) this.jTableDatosAutoriSri.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAutoriSri(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAutoriSri(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAutoriSri) {
			
			if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAutoriSri.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAutoriSri.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAutoriSri(this.autorisri);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.autorisriConstantesFunciones.cargarid_empresaAutoriSri || this.autorisriConstantesFunciones.event_dependid_empresaAutoriSri) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.autorisri.getid_empresa());
									//this.inicializarActualizarBindingAutoriSri(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(autorisri.getEmpresa()!=null) {
							this.empresasForeignKey.add(autorisri.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.autorisri.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.autorisriConstantesFunciones.cargarid_sucursalAutoriSri || this.autorisriConstantesFunciones.event_dependid_sucursalAutoriSri) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.autorisri.getid_sucursal());
									//this.inicializarActualizarBindingAutoriSri(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(autorisri.getSucursal()!=null) {
							this.sucursalsForeignKey.add(autorisri.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.autorisri.getid_sucursal(),false,"Formulario");

					//TipoDocumentoGeneral
					if(!this.autorisriConstantesFunciones.cargarid_tipo_documento_generalAutoriSri || this.autorisriConstantesFunciones.event_dependid_tipo_documento_generalAutoriSri) {
						//this.cargarCombosTipoDocumentoGeneralsForeignKeyLista(" where id="+this.autorisri.getid_tipo_documento_general());
									//this.inicializarActualizarBindingAutoriSri(false,false);
						this.tipodocumentogeneralsForeignKey=new ArrayList<TipoDocumentoGeneral>();

						if(autorisri.getTipoDocumentoGeneral()!=null) {
							this.tipodocumentogeneralsForeignKey.add(autorisri.getTipoDocumentoGeneral());
						}

						this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
						this.cargarCombosFrameTipoDocumentoGeneralsForeignKey("Todos");
					}
					this.setActualTipoDocumentoGeneralForeignKey(this.autorisri.getid_tipo_documento_general(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAutoriSri("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAutoriSri(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutoriSri() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAutoriSri(AutoriSri autorisri) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAutoriSri(autorisri,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAutoriSri(AutoriSri autorisri,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAutoriSri(autorisri);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAutoriSri(autorisri,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAutoriSri(autorisri);
	}
	
	public void setVariablesObjetoActualToFormularioAutoriSri(AutoriSri autorisri) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.setText(autorisri.getId().toString());
			this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_secuencialAutoriSri.setText(autorisri.getnumero_secuencial());
			this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_autorAutoriSri.setText(autorisri.getnumero_autor());
			this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_inicioAutoriSri.setDate(autorisri.getfecha_inicio());
			this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_finAutoriSri.setDate(autorisri.getfecha_fin());
			this.jInternalFrameDetalleFormAutoriSri.jCheckBoxesta_activoAutoriSri.setSelected(autorisri.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AutoriSri autorisriLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,autorisriLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AutoriSri autorisriLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				autorisriLocal=this.autorisri;
			} else {
				autorisriLocal=this.autorisriAnterior;
			}
		}
		
		if(this.permiteMantenimiento(autorisriLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAutoriSri(autorisriLocal,true);
					
					if(autorisriSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(autorisriLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.autorisriSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(autorisriLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAutoriSri(AutoriSri autorisri,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAutoriSri(autorisri,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(autorisri);
	}
	
	public void setVariablesFormularioToObjetoActualAutoriSri(AutoriSri autorisri,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAutoriSri(autorisri,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAutoriSri(AutoriSri autorisri,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.getText()==null || this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.getText()=="" || this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.getText()=="Id") {
				this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.setText("0");
			}

			if(conColumnasBase) {autorisri.setId(Long.parseLong(this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriSriConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelIdAutoriSri,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorisri.setnumero_secuencial(this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_secuencialAutoriSri.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelnumero_secuencialAutoriSri,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorisri.setnumero_autor(this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_autorAutoriSri.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelnumero_autorAutoriSri,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorisri.setfecha_inicio(this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_inicioAutoriSri.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriSriConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelfecha_inicioAutoriSri,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorisri.setfecha_fin(this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_finAutoriSri.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriSriConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelfecha_finAutoriSri,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorisri.setesta_activo(this.jInternalFrameDetalleFormAutoriSri.jCheckBoxesta_activoAutoriSri.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriSriConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriSri.jLabelesta_activoAutoriSri,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAutoriSri(AutoriSri autorisriBean,AutoriSri autorisri,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && autorisriBean.getid_tipo_documento_general()!=null && !autorisriBean.getid_tipo_documento_general().equals(-1L))) {autorisri.setid_tipo_documento_general(autorisriBean.getid_tipo_documento_general());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAutoriSri(AutoriSri autorisriOrigen,AutoriSri autorisri,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && autorisriOrigen.getId()!=null && !autorisriOrigen.getId().equals(0L))) {autorisri.setId(autorisriOrigen.getId());}}
			if(conDefault || (!conDefault && autorisriOrigen.getid_tipo_documento_general()!=null && !autorisriOrigen.getid_tipo_documento_general().equals(-1L))) {autorisri.setid_tipo_documento_general(autorisriOrigen.getid_tipo_documento_general());}
			if(conDefault || (!conDefault && autorisriOrigen.getnumero_secuencial()!=null && !autorisriOrigen.getnumero_secuencial().equals(""))) {autorisri.setnumero_secuencial(autorisriOrigen.getnumero_secuencial());}
			if(conDefault || (!conDefault && autorisriOrigen.getnumero_autor()!=null && !autorisriOrigen.getnumero_autor().equals(""))) {autorisri.setnumero_autor(autorisriOrigen.getnumero_autor());}
			if(conDefault || (!conDefault && autorisriOrigen.getfecha_inicio()!=null && !autorisriOrigen.getfecha_inicio().equals(new Date()))) {autorisri.setfecha_inicio(autorisriOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && autorisriOrigen.getfecha_fin()!=null && !autorisriOrigen.getfecha_fin().equals(new Date()))) {autorisri.setfecha_fin(autorisriOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && autorisriOrigen.getesta_activo()!=null && !autorisriOrigen.getesta_activo().equals(false))) {autorisri.setesta_activo(autorisriOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAutoriSri(AutoriSri autorisri) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.setText(autorisri.getId().toString());
			this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_secuencialAutoriSri.setText(autorisri.getnumero_secuencial());
			this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_autorAutoriSri.setText(autorisri.getnumero_autor());
			this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_inicioAutoriSri.setDate(autorisri.getfecha_inicio());
			this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_finAutoriSri.setDate(autorisri.getfecha_fin());
			this.jInternalFrameDetalleFormAutoriSri.jCheckBoxesta_activoAutoriSri.setSelected(autorisri.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAutoriSri(AutoriSriBean autorisriBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.setText(autorisriBean.getId().toString());
			this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_secuencialAutoriSri.setText(autorisriBean.getnumero_secuencial());
			this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_autorAutoriSri.setText(autorisriBean.getnumero_autor());
			this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_inicioAutoriSri.setDate(autorisriBean.getfecha_inicio());
			this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_finAutoriSri.setDate(autorisriBean.getfecha_fin());
			this.jInternalFrameDetalleFormAutoriSri.jCheckBoxesta_activoAutoriSri.setSelected(autorisriBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAutoriSri(AutoriSriParameterReturnGeneral autorisriReturnGeneral,AutoriSriBean autorisriBean,Boolean conDefault) throws Exception { 
		try {
			AutoriSri autorisriLocal=new AutoriSri();
			
			autorisriLocal=autorisriReturnGeneral.getAutoriSri();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && autorisriLocal.getId()!=null && !autorisriLocal.getId().equals(0L))) {autorisriBean.setId(autorisriLocal.getId());}}
			if(conDefault || (!conDefault && autorisriLocal.getid_tipo_documento_general()!=null && !autorisriLocal.getid_tipo_documento_general().equals(-1L))) {autorisriBean.setid_tipo_documento_general(autorisriLocal.getid_tipo_documento_general());}
			if(conDefault || (!conDefault && autorisriLocal.getnumero_secuencial()!=null && !autorisriLocal.getnumero_secuencial().equals(""))) {autorisriBean.setnumero_secuencial(autorisriLocal.getnumero_secuencial());}
			if(conDefault || (!conDefault && autorisriLocal.getnumero_autor()!=null && !autorisriLocal.getnumero_autor().equals(""))) {autorisriBean.setnumero_autor(autorisriLocal.getnumero_autor());}
			if(conDefault || (!conDefault && autorisriLocal.getfecha_inicio()!=null && !autorisriLocal.getfecha_inicio().equals(new Date()))) {autorisriBean.setfecha_inicio(autorisriLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && autorisriLocal.getfecha_fin()!=null && !autorisriLocal.getfecha_fin().equals(new Date()))) {autorisriBean.setfecha_fin(autorisriLocal.getfecha_fin());}
			if(conDefault || (!conDefault && autorisriLocal.getesta_activo()!=null && !autorisriLocal.getesta_activo().equals(false))) {autorisriBean.setesta_activo(autorisriLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAutoriSriGenerico(Long idAutoriSriSeleccionado,JComboBox jComboBoxAutoriSri,List<AutoriSri> autorisrisLocal)throws Exception {
		try {
			AutoriSri  autorisriTemp=null;

			for(AutoriSri autorisriAux:autorisrisLocal) {
				if(autorisriAux.getId()!=null && autorisriAux.getId().equals(idAutoriSriSeleccionado)) {
					autorisriTemp=autorisriAux;
					break;
				}
			}

			jComboBoxAutoriSri.setSelectedItem(autorisriTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAutoriSriGenerico(JComboBox jComboBoxAutoriSri,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAutoriSri.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAutoriSri.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAutoriSri.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAutoriSri.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autorisri=(AutoriSri) autorisriLogic.getAutoriSris().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			autorisri =(AutoriSri) autorisris.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!autorisri.getIsNew() && !autorisri.getIsChanged() && !autorisri.getIsDeleted()) {
				sDescripcion=autorisri.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=autorisri.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!autorisri.getIsNew() && !autorisri.getIsChanged() && !autorisri.getIsDeleted()) {
				sDescripcion=autorisri.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=autorisri.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TipoDocumentoGeneral")) {
			//sDescripcion=this.getActualTipoDocumentoGeneralForeignKeyDescripcion((Long)value);
			if(!autorisri.getIsNew() && !autorisri.getIsChanged() && !autorisri.getIsDeleted()) {
				sDescripcion=autorisri.gettipodocumentogeneral_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDocumentoGeneralForeignKeyDescripcion((Long)value);
				sDescripcion=autorisri.gettipodocumentogeneral_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AutoriSri autorisriRow=new AutoriSri();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autorisriRow=(AutoriSri) autorisriLogic.getAutoriSris().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			autorisriRow=(AutoriSri) autorisris.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAutoriSri(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAutoriSri.setVisible((this.isVisibilidadCeldaNuevoAutoriSri && this.isPermisoNuevoAutoriSri));			
			this.jButtonDuplicarAutoriSri.setVisible((this.isVisibilidadCeldaDuplicarAutoriSri && this.isPermisoDuplicarAutoriSri));			
			this.jButtonCopiarAutoriSri.setVisible((this.isVisibilidadCeldaCopiarAutoriSri && this.isPermisoCopiarAutoriSri));
			this.jButtonVerFormAutoriSri.setVisible((this.isVisibilidadCeldaVerFormAutoriSri && this.isPermisoVerFormAutoriSri));
			
			this.jButtonAbrirOrderByAutoriSri.setVisible((this.isVisibilidadCeldaOrdenAutoriSri && this.isPermisoOrdenAutoriSri));			
			
			this.jButtonNuevoRelacionesAutoriSri.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutoriSri && this.isPermisoNuevoAutoriSri));			
			this.jButtonNuevoGuardarCambiosAutoriSri.setVisible((this.isVisibilidadCeldaNuevoAutoriSri && this.isPermisoNuevoAutoriSri && this.isPermisoGuardarCambiosAutoriSri));
			
			if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonModificarAutoriSri.setVisible((this.isVisibilidadCeldaModificarAutoriSri && this.isPermisoActualizarAutoriSri));	
			this.jInternalFrameDetalleFormAutoriSri.jButtonActualizarAutoriSri.setVisible((this.isVisibilidadCeldaActualizarAutoriSri && this.isPermisoActualizarAutoriSri));	
			this.jInternalFrameDetalleFormAutoriSri.jButtonEliminarAutoriSri.setVisible((this.isVisibilidadCeldaEliminarAutoriSri && this.isPermisoEliminarAutoriSri));
			this.jInternalFrameDetalleFormAutoriSri.jButtonCancelarAutoriSri.setVisible(this.isVisibilidadCeldaCancelarAutoriSri);							
			this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosAutoriSri.setVisible((this.isVisibilidadCeldaGuardarAutoriSri && this.isPermisoGuardarCambiosAutoriSri));			
			
			}
						
			this.jButtonGuardarCambiosTablaAutoriSri.setVisible((this.isVisibilidadCeldaGuardarCambiosAutoriSri && this.isPermisoGuardarCambiosAutoriSri));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAutoriSri.setVisible((this.isVisibilidadCeldaNuevoAutoriSri && this.isPermisoNuevoAutoriSri));						
			this.jButtonDuplicarToolBarAutoriSri.setVisible((this.isVisibilidadCeldaDuplicarAutoriSri && this.isPermisoDuplicarAutoriSri));						
			this.jButtonCopiarToolBarAutoriSri.setVisible((this.isVisibilidadCeldaCopiarAutoriSri && this.isPermisoCopiarAutoriSri));			
			this.jButtonVerFormToolBarAutoriSri.setVisible((this.isVisibilidadCeldaVerFormAutoriSri && this.isPermisoVerFormAutoriSri));			
			this.jButtonAbrirOrderByToolBarAutoriSri.setVisible((this.isVisibilidadCeldaOrdenAutoriSri && this.isPermisoOrdenAutoriSri));
			this.jButtonNuevoRelacionesToolBarAutoriSri.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutoriSri && this.isPermisoNuevoAutoriSri));			
			this.jButtonNuevoGuardarCambiosToolBarAutoriSri.setVisible((this.isVisibilidadCeldaNuevoAutoriSri && this.isPermisoNuevoAutoriSri && this.isPermisoGuardarCambiosAutoriSri));			
			
			if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonModificarToolBarAutoriSri.setVisible((this.isVisibilidadCeldaModificarAutoriSri && this.isPermisoActualizarAutoriSri));	
			this.jInternalFrameDetalleFormAutoriSri.jButtonActualizarToolBarAutoriSri.setVisible((this.isVisibilidadCeldaActualizarAutoriSri  && this.isPermisoActualizarAutoriSri));	
			this.jInternalFrameDetalleFormAutoriSri.jButtonEliminarToolBarAutoriSri.setVisible((this.isVisibilidadCeldaEliminarAutoriSri && this.isPermisoEliminarAutoriSri));
			this.jInternalFrameDetalleFormAutoriSri.jButtonCancelarToolBarAutoriSri.setVisible(this.isVisibilidadCeldaCancelarAutoriSri);				
			this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosToolBarAutoriSri.setVisible((this.isVisibilidadCeldaGuardarAutoriSri && this.isPermisoGuardarCambiosAutoriSri));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAutoriSri.setVisible((this.isVisibilidadCeldaGuardarCambiosAutoriSri && this.isPermisoGuardarCambiosAutoriSri));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAutoriSri.setVisible((this.isVisibilidadCeldaNuevoAutoriSri && this.isPermisoNuevoAutoriSri));			
			this.jMenuItemDuplicarAutoriSri.setVisible((this.isVisibilidadCeldaDuplicarAutoriSri && this.isPermisoDuplicarAutoriSri));			
			this.jMenuItemCopiarAutoriSri.setVisible((this.isVisibilidadCeldaCopiarAutoriSri && this.isPermisoCopiarAutoriSri));			
			this.jMenuItemVerFormAutoriSri.setVisible((this.isVisibilidadCeldaVerFormAutoriSri && this.isPermisoVerFormAutoriSri));			
			this.jMenuItemAbrirOrderByAutoriSri.setVisible((this.isVisibilidadCeldaOrdenAutoriSri && this.isPermisoOrdenAutoriSri));			
			//this.jMenuItemMostrarOcultarAutoriSri.setVisible((this.isVisibilidadCeldaOrdenAutoriSri && this.isPermisoOrdenAutoriSri));
			this.jMenuItemDetalleAbrirOrderByAutoriSri.setVisible((this.isVisibilidadCeldaOrdenAutoriSri && this.isPermisoOrdenAutoriSri));			
			//this.jMenuItemDetalleMostrarOcultarAutoriSri.setVisible((this.isVisibilidadCeldaOrdenAutoriSri && this.isPermisoOrdenAutoriSri));			
			this.jMenuItemNuevoRelacionesAutoriSri.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutoriSri && this.isPermisoNuevoAutoriSri));			
			this.jMenuItemNuevoGuardarCambiosAutoriSri.setVisible((this.isVisibilidadCeldaNuevoAutoriSri && this.isPermisoNuevoAutoriSri && this.isPermisoGuardarCambiosAutoriSri));									
			
			if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			this.jInternalFrameDetalleFormAutoriSri.jMenuItemModificarAutoriSri.setVisible((this.isVisibilidadCeldaModificarAutoriSri && this.isPermisoActualizarAutoriSri));	
			this.jInternalFrameDetalleFormAutoriSri.jMenuItemActualizarAutoriSri.setVisible((this.isVisibilidadCeldaActualizarAutoriSri && this.isPermisoActualizarAutoriSri));	
			this.jInternalFrameDetalleFormAutoriSri.jMenuItemEliminarAutoriSri.setVisible((this.isVisibilidadCeldaEliminarAutoriSri && this.isPermisoEliminarAutoriSri));
			this.jInternalFrameDetalleFormAutoriSri.jMenuItemCancelarAutoriSri.setVisible(this.isVisibilidadCeldaCancelarAutoriSri);				
			}
			
			this.jMenuItemGuardarCambiosAutoriSri.setVisible((this.isVisibilidadCeldaGuardarAutoriSri && this.isPermisoGuardarCambiosAutoriSri));						
			this.jMenuItemGuardarCambiosTablaAutoriSri.setVisible((this.isVisibilidadCeldaGuardarCambiosAutoriSri && this.isPermisoGuardarCambiosAutoriSri));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAutoriSri=this.jButtonNuevoAutoriSri.isVisible();
			this.isVisibilidadCeldaDuplicarAutoriSri=this.jButtonDuplicarAutoriSri.isVisible();
			this.isVisibilidadCeldaCopiarAutoriSri=this.jButtonCopiarAutoriSri.isVisible();
			this.isVisibilidadCeldaVerFormAutoriSri=this.jButtonVerFormAutoriSri.isVisible();
			
			this.isVisibilidadCeldaOrdenAutoriSri=this.jButtonAbrirOrderByAutoriSri.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=this.jButtonNuevoRelacionesAutoriSri.isVisible();
			this.isVisibilidadCeldaModificarAutoriSri=this.jButtonModificarAutoriSri.isVisible();
			
			if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			this.isVisibilidadCeldaActualizarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jButtonActualizarAutoriSri.isVisible();
			this.isVisibilidadCeldaEliminarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jButtonEliminarAutoriSri.isVisible();
			this.isVisibilidadCeldaCancelarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jButtonCancelarAutoriSri.isVisible();
			this.isVisibilidadCeldaGuardarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosAutoriSri.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=this.jButtonGuardarCambiosTablaAutoriSri.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAutoriSri=this.jButtonNuevoToolBarAutoriSri.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=this.jButtonNuevoRelacionesToolBarAutoriSri.isVisible();
			
			if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			this.isVisibilidadCeldaModificarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jButtonModificarToolBarAutoriSri.isVisible();
			this.isVisibilidadCeldaActualizarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jButtonActualizarToolBarAutoriSri.isVisible();
			this.isVisibilidadCeldaEliminarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jButtonEliminarToolBarAutoriSri.isVisible();
			this.isVisibilidadCeldaCancelarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jButtonCancelarToolBarAutoriSri.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAutoriSri=this.jButtonGuardarCambiosToolBarAutoriSri.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=this.jButtonGuardarCambiosTablaToolBarAutoriSri.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAutoriSri=this.jMenuItemNuevoAutoriSri.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=this.jMenuItemNuevoRelacionesAutoriSri.isVisible();
			
			if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			this.isVisibilidadCeldaModificarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jMenuItemModificarAutoriSri.isVisible();
			this.isVisibilidadCeldaActualizarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jMenuItemActualizarAutoriSri.isVisible();
			this.isVisibilidadCeldaEliminarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jMenuItemEliminarAutoriSri.isVisible();
			this.isVisibilidadCeldaCancelarAutoriSri=this.jInternalFrameDetalleFormAutoriSri.jMenuItemCancelarAutoriSri.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAutoriSri=this.jMenuItemGuardarCambiosAutoriSri.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=this.jMenuItemGuardarCambiosTablaAutoriSri.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAutoriSri(Boolean esInicializar) {
		if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {			
			if(this.autorisriSessionBean.getConGuardarRelaciones()) {
				//if(this.autorisriSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAutoriSri();
			}
			
			this.inicializarActualizarBindingBotonesManualAutoriSri(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAutoriSri() {
		this.jButtonNuevoAutoriSri.setVisible(this.isPermisoNuevoAutoriSri);			
		this.jButtonDuplicarAutoriSri.setVisible(this.isPermisoDuplicarAutoriSri);			
		this.jButtonCopiarAutoriSri.setVisible(this.isPermisoCopiarAutoriSri);			
		this.jButtonVerFormAutoriSri.setVisible(this.isPermisoVerFormAutoriSri);			
		
		this.jButtonAbrirOrderByAutoriSri.setVisible(this.isPermisoOrdenAutoriSri);					
		
		this.jButtonNuevoRelacionesAutoriSri.setVisible(this.isPermisoNuevoAutoriSri);			
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonModificarAutoriSri.setVisible(this.isPermisoActualizarAutoriSri);	
			this.jInternalFrameDetalleFormAutoriSri.jButtonActualizarAutoriSri.setVisible(this.isPermisoActualizarAutoriSri);	
			this.jInternalFrameDetalleFormAutoriSri.jButtonEliminarAutoriSri.setVisible(this.isPermisoEliminarAutoriSri);
			this.jInternalFrameDetalleFormAutoriSri.jButtonCancelarAutoriSri.setVisible(this.isVisibilidadCeldaCancelarAutoriSri);						
			this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosAutoriSri.setVisible(this.isPermisoGuardarCambiosAutoriSri);							
		}
		
		this.jButtonGuardarCambiosTablaAutoriSri.setVisible(this.isPermisoActualizarAutoriSri);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAutoriSri() {
		this.jInternalFrameDetalleFormAutoriSri.jButtonModificarAutoriSri.setVisible(this.isPermisoActualizarAutoriSri);	
		this.jInternalFrameDetalleFormAutoriSri.jButtonActualizarAutoriSri.setVisible(this.isPermisoActualizarAutoriSri);	
		this.jInternalFrameDetalleFormAutoriSri.jButtonEliminarAutoriSri.setVisible(this.isPermisoEliminarAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jButtonCancelarAutoriSri.setVisible(this.isVisibilidadCeldaCancelarAutoriSri);							
		this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosAutoriSri.setVisible((this.isVisibilidadCeldaGuardarAutoriSri && this.isPermisoGuardarCambiosAutoriSri));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAutoriSri() {
		if(AutoriSriJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAutoriSri();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAutoriSri() {
	}
	
	public void jTableDatosAutoriSriListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAutoriSri(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAutoriSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorisri==null) {
						this.autorisri = new AutoriSri();
					}

					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				}

				if(this.autorisri.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.autorisri.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAutoriSriUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAutoriSri(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriSri.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriSri.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.autorisriLogic.getConnexion());

				if(this.autorisri.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.autorisri.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriSri=(TitledBorder)this.jScrollPanelDatosAutoriSri.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAutoriSri.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAutoriSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorisri==null) {
						this.autorisri = new AutoriSri();
					}

					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				}

				if(this.autorisri.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.autorisri.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalAutoriSriUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebAutoriSri(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriSri.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriSri.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.autorisriLogic.getConnexion());

				if(this.autorisri.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.autorisri.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriSri=(TitledBorder)this.jScrollPanelDatosAutoriSri.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderAutoriSri.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalAutoriSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorisri==null) {
						this.autorisri = new AutoriSri();
					}

					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				}

				if(this.autorisri.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.autorisri.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_documento_generalAutoriSriUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodocumentogeneral=true;

			idTienePermisotipodocumentogeneral=this.tienePermisosUsuarioEnPaginaWebAutoriSri(TipoDocumentoGeneralConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodocumentogeneral) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriSri.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriSri.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);

				this.tipodocumentogeneralBeanSwingJInternalFrame=new TipoDocumentoGeneralBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodocumentogeneralBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodocumentogeneralBeanSwingJInternalFrame.getTipoDocumentoGeneralLogic().setConnexion(this.autorisriLogic.getConnexion());

				if(this.autorisri.getid_tipo_documento_general()!=null) {
					this.tipodocumentogeneralBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodocumentogeneralBeanSwingJInternalFrame.setIdActual(this.autorisri.getid_tipo_documento_general());
					this.tipodocumentogeneralBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodocumentogeneralBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodocumentogeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumentoGeneral();
				}

				JInternalFrameBase jinternalFrame =this.tipodocumentogeneralBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriSri=(TitledBorder)this.jScrollPanelDatosAutoriSri.getBorder();
				TitledBorder titledBordertipodocumentogeneral=(TitledBorder)this.tipodocumentogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumentoGeneral.getBorder();

				titledBordertipodocumentogeneral.setTitle(titledBorderAutoriSri.getTitle() + " -> Tipo Documento General");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_documento_generalAutoriSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorisri==null) {
						this.autorisri = new AutoriSri();
					}

					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				}

				if(this.autorisri.getid_tipo_documento_general()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_documento_general = "+this.autorisri.getid_tipo_documento_general().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_secuencialAutoriSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorisri==null) {
						this.autorisri = new AutoriSri();
					}

					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				}

				if(this.autorisri.getnumero_secuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_secuencial like '%"+this.autorisri.getnumero_secuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_autorAutoriSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorisri==null) {
						this.autorisri = new AutoriSri();
					}

					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				}

				if(this.autorisri.getnumero_autor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_autor like '%"+this.autorisri.getnumero_autor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioAutoriSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorisri==null) {
						this.autorisri = new AutoriSri();
					}

					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				}

				if(this.autorisri.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.autorisri.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finAutoriSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorisri==null) {
						this.autorisri = new AutoriSri();
					}

					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				}

				if(this.autorisri.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.autorisri.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoAutoriSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriSri(this.getautorisri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorisri==null) {
						this.autorisri = new AutoriSri();
					}

					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);
				}

				if(this.autorisri.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.autorisri.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorFechaFinAutoriSriActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriSri(false,false);

			this.getAutoriSrisBusquedaPorFechaFin();

			this.inicializarActualizarBindingAutoriSri(false);

			//if(AutoriSriBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriSri(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorFechaInicioAutoriSriActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriSri(false,false);

			this.getAutoriSrisBusquedaPorFechaInicio();

			this.inicializarActualizarBindingAutoriSri(false);

			//if(AutoriSriBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriSri(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNumeroAutorAutoriSriActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriSri(false,false);

			this.getAutoriSrisBusquedaPorNumeroAutor();

			this.inicializarActualizarBindingAutoriSri(false);

			//if(AutoriSriBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriSri(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNumeroSecuencialAutoriSriActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriSri(false,false);

			this.getAutoriSrisBusquedaPorNumeroSecuencial();

			this.inicializarActualizarBindingAutoriSri(false);

			//if(AutoriSriBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriSri(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAutoriSriActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriSri(false,false);

			this.getAutoriSrisFK_IdEmpresa();

			this.inicializarActualizarBindingAutoriSri(false);

			//if(AutoriSriBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriSri(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalAutoriSriActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriSri(false,false);

			this.getAutoriSrisFK_IdSucursal();

			this.inicializarActualizarBindingAutoriSri(false);

			//if(AutoriSriBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriSri(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDocumentoGeneralAutoriSriActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriSri(false,false);

			this.getAutoriSrisFK_IdTipoDocumentoGeneral();

			this.inicializarActualizarBindingAutoriSri(false);

			//if(AutoriSriBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriSri(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorisriLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAutoriSri() {
		if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) {
			this.jInternalFrameDetalleFormAutoriSri.setVisible(false);	    			
			this.jInternalFrameDetalleFormAutoriSri.dispose();
			this.jInternalFrameDetalleFormAutoriSri=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAutoriSri!=null) {
			this.jInternalFrameReporteDinamicoAutoriSri.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAutoriSri.dispose();
			this.jInternalFrameReporteDinamicoAutoriSri=null;
		}
		
		if(this.jInternalFrameImportacionAutoriSri!=null) {
			this.jInternalFrameImportacionAutoriSri.setVisible(false);	    			
			this.jInternalFrameImportacionAutoriSri.dispose();
			this.jInternalFrameImportacionAutoriSri=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAutoriSri();
			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
			
			if(sTipo.equals("NuevoAutoriSri")) {
				jButtonNuevoAutoriSriActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAutoriSri")) {
				jButtonDuplicarAutoriSriActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAutoriSri")) {
				jButtonCopiarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("VerFormAutoriSri")) {
				jButtonVerFormAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAutoriSri")) {
				jButtonNuevoAutoriSriActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAutoriSri")) {
				jButtonDuplicarAutoriSriActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAutoriSri")) {
				jButtonNuevoAutoriSriActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAutoriSri")) {
				jButtonDuplicarAutoriSriActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAutoriSri")) {
				jButtonNuevoAutoriSriActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAutoriSri")) {
				jButtonNuevoAutoriSriActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAutoriSri")) {
				jButtonNuevoAutoriSriActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAutoriSri")) {
				jButtonModificarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAutoriSri")) {
				jButtonModificarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAutoriSri")) {
				jButtonModificarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAutoriSri")) {
				jButtonActualizarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAutoriSri")) {
				jButtonActualizarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAutoriSri")) {
				jButtonActualizarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("EliminarAutoriSri")) {
				jButtonEliminarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAutoriSri")) {
				jButtonEliminarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAutoriSri")) {
				jButtonEliminarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("CancelarAutoriSri")) {
				jButtonCancelarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAutoriSri")) {
				jButtonCancelarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAutoriSri")) {
				jButtonCancelarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("CerrarAutoriSri")) {
				jButtonCerrarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAutoriSri")) {
				jButtonCerrarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAutoriSri")) {
				jButtonCerrarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAutoriSri")) {
				jButtonMostrarOcultarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAutoriSri")) {
				jButtonCancelarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAutoriSri")) {
				jButtonGuardarCambiosAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAutoriSri")) {
				jButtonGuardarCambiosAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAutoriSri")) {
				jButtonCopiarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAutoriSri")) {
				jButtonVerFormAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAutoriSri")) {
				jButtonGuardarCambiosAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAutoriSri")) {
				jButtonCopiarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAutoriSri")) {
				jButtonVerFormAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAutoriSri")) {
				jButtonGuardarCambiosAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAutoriSri")) {
				jButtonGuardarCambiosAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAutoriSri")) {
				jButtonGuardarCambiosAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAutoriSri")) {
				jButtonRecargarInformacionAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAutoriSri")) {
				jButtonRecargarInformacionAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAutoriSri")) {
				jButtonRecargarInformacionAutoriSriActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAutoriSri")) {
				jButtonAnterioresAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAutoriSri")) {
				jButtonAnterioresAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAutoriSri")) {
				jButtonAnterioresAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAutoriSri")) {
				jButtonSiguientesAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAutoriSri")) {
				jButtonSiguientesAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAutoriSri")) {
				jButtonSiguientesAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAutoriSri") || sTipo.equals("MenuItemDetalleAbrirOrderByAutoriSri")) {
				jButtonAbrirOrderByAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAutoriSri") || sTipo.equals("MenuItemDetalleMostrarOcultarAutoriSri")) {
				jButtonMostrarOcultarAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAutoriSri")) {
				jButtonNuevoGuardarCambiosAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAutoriSri")) {
				jButtonNuevoGuardarCambiosAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAutoriSri")) {
				jButtonNuevoGuardarCambiosAutoriSriActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAutoriSri")) {
				jButtonCerrarReporteDinamicoAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAutoriSri")) {
				jButtonGenerarReporteDinamicoAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAutoriSri")) {
				
				jButtonGenerarExcelReporteDinamicoAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAutoriSri")) {
				jButtonCerrarImportacionAutoriSriActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAutoriSri")) {
				
				jButtonGenerarImportacionAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAutoriSri")) {
				
				jButtonAbrirImportacionAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAutoriSri")) {
				jComboBoxTiposAccionesAutoriSriActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAutoriSri")) {
				jComboBoxTiposRelacionesAutoriSriActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAutoriSri")) {
				jComboBoxTiposAccionesAutoriSriActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAutoriSri")) {
				
				jComboBoxTiposSeleccionarAutoriSriActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAutoriSri")) {
				jTextFieldValorCampoGeneralAutoriSriActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAutoriSri")) {
				jButtonAbrirOrderByAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAutoriSri")) {
				jButtonAbrirOrderByAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAutoriSri")) {
				jButtonCerrarOrderByAutoriSriActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAutoriSriBusqueda")) {
				this.jButtonidAutoriSriBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAutoriSriUpdate")) {
				this.jButtonid_empresaAutoriSriUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAutoriSriBusqueda")) {
				this.jButtonid_empresaAutoriSriBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalAutoriSriUpdate")) {
				this.jButtonid_sucursalAutoriSriUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalAutoriSriBusqueda")) {
				this.jButtonid_sucursalAutoriSriBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documento_generalAutoriSriUpdate")) {
				this.jButtonid_tipo_documento_generalAutoriSriUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documento_generalAutoriSriBusqueda")) {
				this.jButtonid_tipo_documento_generalAutoriSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialAutoriSriBusqueda")) {
				this.jButtonnumero_secuencialAutoriSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorAutoriSriBusqueda")) {
				this.jButtonnumero_autorAutoriSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioAutoriSriBusqueda")) {
				this.jButtonfecha_inicioAutoriSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finAutoriSriBusqueda")) {
				this.jButtonfecha_finAutoriSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoAutoriSriBusqueda")) {
				this.jButtonesta_activoAutoriSriBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorFechaFinAutoriSri")) {
				this.jButtonBusquedaPorFechaFinAutoriSriActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorFechaInicioAutoriSri")) {
				this.jButtonBusquedaPorFechaInicioAutoriSriActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNumeroAutorAutoriSri")) {
				this.jButtonBusquedaPorNumeroAutorAutoriSriActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNumeroSecuencialAutoriSri")) {
				this.jButtonBusquedaPorNumeroSecuencialAutoriSriActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoDocumentoGeneralAutoriSri")) {
				this.jButtonFK_IdTipoDocumentoGeneralAutoriSriActionPerformed(evt);
			}
			
			;
			
			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAutoriSri();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriSriActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				


				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AutoriSri autorisriLocal=null;
			
			if(!this.getEsControlTabla()) {
				autorisriLocal=this.autorisri;
			} else {
				autorisriLocal=this.autorisriAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
							
				
				


				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriSriActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriAnterior =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorisriAnterior =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
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
			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
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
			
			


			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriSriActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
								
						
				


				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
								
				
				


				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriSriActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriAnterior =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorisriAnterior =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriSriActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriAnterior =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorisriAnterior =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriSriActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
							
				
				


				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriSriActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisriAnterior =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.autorisriAnterior =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
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
			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
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
			
			


			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriSriActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
								
				
				


				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriSriActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriAnterior =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorisriAnterior =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriSriActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriSriActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAutoriSri")) {
					jCheckBoxSeleccionarTodosAutoriSriItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAutoriSri")) {
					jCheckBoxSeleccionadosAutoriSriItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAutoriSri")) {
					
				}
				
				


				
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
												
				
				


				
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriSriActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorisriAnterior =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.autorisriAnterior =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriSriActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
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
			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
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
			
			


			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriSriActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorisri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorisri);
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
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
				
				


				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriSri.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriSriActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorisriAnterior =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorisriAnterior =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAutoriSri")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAutoriSriListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAutoriSri.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.autorisri =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.autorisri =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.autorisri);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAutoriSri")) {
				
				}
				
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAutoriSri")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAutoriSri.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAutoriSri")) {
			
			}
			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAutoriSri();
			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
			if(sTipo.equals("NuevoAutoriSri")) {
				jButtonNuevoAutoriSriActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAutoriSri")) {
				jButtonDuplicarAutoriSriActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAutoriSri")) {
				jButtonCopiarAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAutoriSri")) {
				jButtonVerFormAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAutoriSri")) {
				jButtonNuevoAutoriSriActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAutoriSri")) {
				jButtonModificarAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAutoriSri")) {
				jButtonActualizarAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAutoriSri")) {
				jButtonEliminarAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAutoriSri")) {
				jButtonGuardarCambiosAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAutoriSri")) {
				jButtonCancelarAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAutoriSri")) {
				jButtonCerrarAutoriSriActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAutoriSri")) {
				jButtonGuardarCambiosAutoriSriActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAutoriSri")) {
				jButtonNuevoGuardarCambiosAutoriSriActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAutoriSri")) {
				jButtonAbrirOrderByAutoriSriActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAutoriSri")) {
				jButtonRecargarInformacionAutoriSriActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAutoriSri")) {
				jButtonAnterioresAutoriSriActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAutoriSri")) {
				jButtonSiguientesAutoriSriActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAutoriSriBusqueda")) {
				this.jButtonidAutoriSriBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAutoriSriUpdate")) {
				this.jButtonid_empresaAutoriSriUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAutoriSriBusqueda")) {
				this.jButtonid_empresaAutoriSriBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalAutoriSriUpdate")) {
				this.jButtonid_sucursalAutoriSriUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalAutoriSriBusqueda")) {
				this.jButtonid_sucursalAutoriSriBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documento_generalAutoriSriUpdate")) {
				this.jButtonid_tipo_documento_generalAutoriSriUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documento_generalAutoriSriBusqueda")) {
				this.jButtonid_tipo_documento_generalAutoriSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialAutoriSriBusqueda")) {
				this.jButtonnumero_secuencialAutoriSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorAutoriSriBusqueda")) {
				this.jButtonnumero_autorAutoriSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioAutoriSriBusqueda")) {
				this.jButtonfecha_inicioAutoriSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finAutoriSriBusqueda")) {
				this.jButtonfecha_finAutoriSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoAutoriSriBusqueda")) {
				this.jButtonesta_activoAutoriSriBusquedaActionPerformed(evt);
			}
			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAutoriSri();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAutoriSri")) {
				closingInternalFrameAutoriSri();
				
			} else if(sTipo.equals("jButtonCancelarAutoriSri")) {
				JInternalFrameBase jInternalFrameDetalleFormAutoriSri = (JInternalFrameBase)evt.getSource();
	            	
	            AutoriSriBeanSwingJInternalFrame jInternalFrameParent=(AutoriSriBeanSwingJInternalFrame)jInternalFrameDetalleFormAutoriSri.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAutoriSriActionPerformed(null);
			}
			
			AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.autorisri,new Object(),this.autorisriParameterGeneral,this.autorisriReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAutoriSri(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAutoriSri(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAutoriSri(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.autorisri)) {
			if(!esControlTabla) {
				if(AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);			
				}
				
				if(this.autorisriSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAutoriSri(this.autorisri,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.autorisriReturnGeneral=autorisriLogic.procesarEventosAutoriSrisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autorisriLogic.getAutoriSris(),this.autorisri,this.autorisriParameterGeneral,this.isEsNuevoAutoriSri,classes);//this.autorisriLogic.getAutoriSri()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAutoriSri(this.autorisriReturnGeneral,this.autorisriBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.autorisriSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAutoriSri(classes,this.autorisriReturnGeneral,this.autorisriBean,false);
					}
						
					if(this.autorisriReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAutoriSri(this.autorisriReturnGeneral.getAutoriSri());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAutoriSri(this.autorisriReturnGeneral.getAutoriSri());	
					}
						
					if(this.autorisriReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAutoriSri(this.autorisriReturnGeneral.getAutoriSri(),classes);//this.autorisriBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAutoriSri(this.autorisri,classes);//this.autorisriBean);									
				}
			
				if(AutoriSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAutoriSri(this.autorisri,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriSri(this.autorisri);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.autorisriAnterior!=null) {
						this.autorisri=this.autorisriAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.autorisriReturnGeneral=autorisriLogic.procesarEventosAutoriSrisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autorisriLogic.getAutoriSris(),this.autorisri,this.autorisriParameterGeneral,this.isEsNuevoAutoriSri,classes);//this.autorisriLogic.getAutoriSri()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.autorisriSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.autorisriSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.autorisriReturnGeneral.getAutoriSri(),autorisriLogic.getAutoriSris());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.autorisriReturnGeneral.getAutoriSri(),this.autorisris);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAutoriSri.repaint();
				
				//((AbstractTableModel) this.jTableDatosAutoriSri.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAutoriSri();
			}
		}
	}
	
	public void actualizarVisualTableDatosAutoriSri() throws Exception {
		
		AutoriSriModel autorisriModel=(AutoriSriModel)this.jTableDatosAutoriSri.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autorisriModel.autorisris=this.autorisriLogic.getAutoriSris();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			autorisriModel.autorisris=this.autorisris;
		}
		
		
		((AutoriSriModel) this.jTableDatosAutoriSri.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAutoriSri() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getautorisriAnterior(),this.autorisriLogic.getAutoriSris());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getautorisriAnterior(),this.autorisris);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAutoriSri();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAutoriSri(AutoriSri autorisri,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
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
										
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autorisri,new Object(),generalEntityParameterGeneral,this.autorisriReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.autorisriSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AutoriSriConstantesFunciones.getClassesRelationshipsOfAutoriSri(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AutoriSriConstantesFunciones.getClassesRelationshipsFromStringsOfAutoriSri(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAutoriSri(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AutoriSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autorisri,new Object(),generalEntityParameterGeneral,this.autorisriReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAutoriSri(AutoriSriBean autorisriBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAutoriSri(ArrayList<Classe> classes,AutoriSriReturnGeneral autorisriReturnGeneral,AutoriSriBean autorisriBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAutoriSri(AutoriSri autorisri,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.autorisri)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAutoriSri = new AutoriSriDetalleFormJInternalFrame(jDesktopPane,this.autorisriSessionBean.getConGuardarRelaciones(),this.autorisriSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.setVisible(false);
		this.jInternalFrameDetalleFormAutoriSri.setSelected(false);						
		
		this.jInternalFrameDetalleFormAutoriSri.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAutoriSri.autorisriLogic=this.autorisriLogic;
		
		this.cargarCombosFrameForeignKeyAutoriSri("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAutoriSri();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAutoriSri();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAutoriSri("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAutoriSri();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAutoriSri.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAutoriSri"));
		
		this.jInternalFrameDetalleFormAutoriSri.jButtonModificarAutoriSri.addActionListener(new ButtonActionListener(this,"ModificarAutoriSri"));

		
		this.jInternalFrameDetalleFormAutoriSri.jButtonModificarToolBarAutoriSri.addActionListener(new ButtonActionListener(this,"ModificarToolBarAutoriSri"));
					
		this.jInternalFrameDetalleFormAutoriSri.jMenuItemModificarAutoriSri.addActionListener(new ButtonActionListener(this,"MenuItemModificarAutoriSri"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriSri.jButtonActualizarAutoriSri.addActionListener (new ButtonActionListener(this,"ActualizarAutoriSri"));
		
		
		this.jInternalFrameDetalleFormAutoriSri.jButtonActualizarToolBarAutoriSri.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAutoriSri"));
						
		this.jInternalFrameDetalleFormAutoriSri.jMenuItemActualizarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAutoriSri"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriSri.jButtonEliminarAutoriSri.addActionListener (new ButtonActionListener(this,"EliminarAutoriSri"));
		
		
		this.jInternalFrameDetalleFormAutoriSri.jButtonEliminarToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"EliminarToolBarAutoriSri"));
								
		this.jInternalFrameDetalleFormAutoriSri.jMenuItemEliminarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAutoriSri"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriSri.jButtonCancelarAutoriSri.addActionListener (new ButtonActionListener(this,"CancelarAutoriSri"));
		
		
		this.jInternalFrameDetalleFormAutoriSri.jButtonCancelarToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"CancelarToolBarAutoriSri"));
					
		this.jInternalFrameDetalleFormAutoriSri.jMenuItemCancelarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAutoriSri"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAutoriSri.jMenuItemDetalleCerrarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAutoriSri"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutoriSri"));
		
		
		
		this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutoriSri"));
		
		
		
		this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAutoriSri"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonidAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"idAutoriSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_empresaAutoriSriUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutoriSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_empresaAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutoriSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_sucursalAutoriSriUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_sucursalAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_tipo_documento_generalAutoriSriUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalAutoriSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_tipo_documento_generalAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonnumero_secuencialAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonnumero_autorAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonfecha_inicioAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonfecha_finAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonesta_activoAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoAutoriSriBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAutoriSri.jTabbedPaneRelacionesAutoriSri.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAutoriSri"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAutoriSri"));
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAutoriSri"));
		}
		
		this.jTableDatosAutoriSri.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAutoriSri"));
		
		this.jTableDatosAutoriSri.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAutoriSri"));
		
		this.jButtonNuevoAutoriSri.addActionListener(new ButtonActionListener(this,"NuevoAutoriSri"));
		
		this.jButtonDuplicarAutoriSri.addActionListener(new ButtonActionListener(this,"DuplicarAutoriSri"));
		
		this.jButtonCopiarAutoriSri.addActionListener(new ButtonActionListener(this,"CopiarAutoriSri"));
		
		this.jButtonVerFormAutoriSri.addActionListener(new ButtonActionListener(this,"VerFormAutoriSri"));
		
		
		this.jButtonNuevoToolBarAutoriSri.addActionListener(new ButtonActionListener(this,"NuevoToolBarAutoriSri"));
			
		this.jButtonDuplicarToolBarAutoriSri.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAutoriSri"));
			
		this.jMenuItemNuevoAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAutoriSri"));
			
		this.jMenuItemDuplicarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAutoriSri"));		
		
		
		this.jButtonNuevoRelacionesAutoriSri.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAutoriSri"));
		
		
		this.jButtonNuevoRelacionesToolBarAutoriSri.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAutoriSri"));
			
		this.jMenuItemNuevoRelacionesAutoriSri.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAutoriSri"));		
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonModificarAutoriSri.addActionListener(new ButtonActionListener(this,"ModificarAutoriSri"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonModificarToolBarAutoriSri.addActionListener(new ButtonActionListener(this,"ModificarToolBarAutoriSri"));
			
			this.jInternalFrameDetalleFormAutoriSri.jMenuItemModificarAutoriSri.addActionListener(new ButtonActionListener(this,"MenuItemModificarAutoriSri"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAutoriSri.jButtonActualizarAutoriSri.addActionListener (new ButtonActionListener(this,"ActualizarAutoriSri"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonActualizarToolBarAutoriSri.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAutoriSri"));
				
			this.jInternalFrameDetalleFormAutoriSri.jMenuItemActualizarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAutoriSri"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonEliminarAutoriSri.addActionListener (new ButtonActionListener(this,"EliminarAutoriSri"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonEliminarToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"EliminarToolBarAutoriSri"));
						
			this.jInternalFrameDetalleFormAutoriSri.jMenuItemEliminarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAutoriSri"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonCancelarAutoriSri.addActionListener (new ButtonActionListener(this,"CancelarAutoriSri"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonCancelarToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"CancelarToolBarAutoriSri"));
			
			this.jInternalFrameDetalleFormAutoriSri.jMenuItemCancelarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAutoriSri"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAutoriSri"));		
		
		
		this.jButtonCerrarAutoriSri.addActionListener (new ButtonActionListener(this,"CerrarAutoriSri"));
		
		
		this.jButtonCerrarToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"CerrarToolBarAutoriSri"));
			
		this.jMenuItemCerrarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAutoriSri"));
			
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jMenuItemDetalleCerrarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAutoriSri"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosAutoriSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosAutoriSri"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutoriSri"));
		}
		
		this.jButtonCopiarToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"CopiarToolBarAutoriSri"));
			
		this.jButtonVerFormToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"VerFormToolBarAutoriSri"));
		
		this.jMenuItemGuardarCambiosAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAutoriSri"));
			
		this.jMenuItemCopiarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAutoriSri"));		
		
		this.jMenuItemVerFormAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAutoriSri"));		
		
		
		this.jButtonGuardarCambiosTablaAutoriSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAutoriSri"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAutoriSri"));
			
		this.jMenuItemGuardarCambiosTablaAutoriSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAutoriSri"));		
		
		
		
		this.jButtonRecargarInformacionAutoriSri.addActionListener (new ButtonActionListener(this,"RecargarInformacionAutoriSri"));
					
		this.jButtonRecargarInformacionToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAutoriSri"));
		
		this.jMenuItemRecargarInformacionAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAutoriSri"));		
		
		
		
		this.jButtonAnterioresAutoriSri.addActionListener (new ButtonActionListener(this,"AnterioresAutoriSri"));
		
		
		this.jButtonAnterioresToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAutoriSri"));
		
		this.jMenuItemAnterioresAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAutoriSri"));		
		
		
		this.jButtonSiguientesAutoriSri.addActionListener (new ButtonActionListener(this,"SiguientesAutoriSri"));
		
		
		this.jButtonSiguientesToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAutoriSri"));
			
		this.jMenuItemSiguientesAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAutoriSri"));
			
		this.jMenuItemAbrirOrderByAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAutoriSri"));
			
		this.jMenuItemMostrarOcultarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAutoriSri"));
			
		this.jMenuItemDetalleAbrirOrderByAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAutoriSri"));
			
		this.jMenuItemDetalleMostarOcultarAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAutoriSri"));		
		
		
		this.jButtonNuevoGuardarCambiosAutoriSri.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAutoriSri"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAutoriSri"));
			
		this.jMenuItemNuevoGuardarCambiosAutoriSri.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAutoriSri"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAutoriSri.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAutoriSri"));

		this.jCheckBoxSeleccionadosAutoriSri.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAutoriSri"));
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAutoriSri"));
		}
		
		
		this.jComboBoxTiposRelacionesAutoriSri.addActionListener (new ButtonActionListener(this,"TiposRelacionesAutoriSri"));
			
		this.jComboBoxTiposAccionesAutoriSri.addActionListener (new ButtonActionListener(this,"TiposAccionesAutoriSri"));
					
		this.jComboBoxTiposSeleccionarAutoriSri.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAutoriSri"));
			
		this.jTextFieldValorCampoGeneralAutoriSri.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAutoriSri"));		
		
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonidAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"idAutoriSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_empresaAutoriSriUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutoriSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_empresaAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutoriSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_sucursalAutoriSriUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_sucursalAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_tipo_documento_generalAutoriSriUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalAutoriSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_tipo_documento_generalAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonnumero_secuencialAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonnumero_autorAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonfecha_inicioAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonfecha_finAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonesta_activoAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoAutoriSriBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorFechaFinAutoriSri.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaFinAutoriSri"));

			this.jButtonBusquedaPorFechaInicioAutoriSri.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaInicioAutoriSri"));

			this.jButtonBusquedaPorNumeroAutorAutoriSri.addActionListener(new ButtonActionListener(this,"BusquedaPorNumeroAutorAutoriSri"));

			this.jButtonBusquedaPorNumeroSecuencialAutoriSri.addActionListener(new ButtonActionListener(this,"BusquedaPorNumeroSecuencialAutoriSri"));

			this.jButtonFK_IdTipoDocumentoGeneralAutoriSri.addActionListener(new ButtonActionListener(this,"FK_IdTipoDocumentoGeneralAutoriSri"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAutoriSri!=null) {
				this.jInternalFrameReporteDinamicoAutoriSri.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutoriSri"));
				this.jInternalFrameReporteDinamicoAutoriSri.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutoriSri"));
				this.jInternalFrameReporteDinamicoAutoriSri.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutoriSri"));
			}
			
			//this.jButtonCerrarReporteDinamicoAutoriSri.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutoriSri"));				
			//this.jButtonGenerarReporteDinamicoAutoriSri.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutoriSri"));
			//this.jButtonGenerarExcelReporteDinamicoAutoriSri.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutoriSri"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAutoriSri!=null) {
				this.jInternalFrameImportacionAutoriSri.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAutoriSri"));
				this.jInternalFrameImportacionAutoriSri.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAutoriSri"));
				this.jInternalFrameImportacionAutoriSri.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAutoriSri"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAutoriSri.addActionListener (new ButtonActionListener(this,"AbrirOrderByAutoriSri"));
			
			this.jButtonAbrirOrderByToolBarAutoriSri.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAutoriSri"));			
			
			if(this.jInternalFrameOrderByAutoriSri!=null) {
				this.jInternalFrameOrderByAutoriSri.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAutoriSri"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAutoriSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriSri.jTabbedPaneRelacionesAutoriSri.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAutoriSri"));
		
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
            		closingInternalFrameAutoriSri();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAutoriSri.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAutoriSri = (JInternalFrameBase)event.getSource();
	            	
	            AutoriSriBeanSwingJInternalFrame jInternalFrameParent=(AutoriSriBeanSwingJInternalFrame)jInternalFrameDetalleFormAutoriSri.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAutoriSriActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAutoriSri.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAutoriSriListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAutoriSri.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAutoriSri.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriSriActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriSriActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriSriActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAutoriSri";
		inputMap = this.jButtonNuevoAutoriSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAutoriSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAutoriSriActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriSriActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriSriActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriSriActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAutoriSri";
		inputMap = this.jButtonNuevoRelacionesAutoriSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAutoriSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAutoriSriActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAutoriSri";
		inputMap = this.jButtonModificarAutoriSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAutoriSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAutoriSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAutoriSri";
		inputMap = this.jButtonActualizarAutoriSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAutoriSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAutoriSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAutoriSri";
		inputMap = this.jButtonEliminarAutoriSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAutoriSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAutoriSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAutoriSri";
		inputMap = this.jButtonCancelarAutoriSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAutoriSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAutoriSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAutoriSri";
		inputMap = this.jButtonCerrarAutoriSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAutoriSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAutoriSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAutoriSri";
		inputMap = this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosAutoriSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAutoriSri.jButtonGuardarCambiosAutoriSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAutoriSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAutoriSri.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAutoriSriItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAutoriSri.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAutoriSriActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAutoriSri.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAutoriSriActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAutoriSri.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAutoriSriActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonidAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"idAutoriSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_empresaAutoriSriUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutoriSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_empresaAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutoriSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_sucursalAutoriSriUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_sucursalAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_tipo_documento_generalAutoriSriUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalAutoriSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonid_tipo_documento_generalAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonnumero_secuencialAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonnumero_autorAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonfecha_inicioAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonfecha_finAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finAutoriSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriSri.jButtonesta_activoAutoriSriBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoAutoriSriBusqueda"));
		
		
		this.jButtonBusquedaPorFechaFinAutoriSri.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaFinAutoriSri"));

		this.jButtonBusquedaPorFechaInicioAutoriSri.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaInicioAutoriSri"));

		this.jButtonBusquedaPorNumeroAutorAutoriSri.addActionListener(new ButtonActionListener(this,"BusquedaPorNumeroAutorAutoriSri"));

		this.jButtonBusquedaPorNumeroSecuencialAutoriSri.addActionListener(new ButtonActionListener(this,"BusquedaPorNumeroSecuencialAutoriSri"));

		this.jButtonFK_IdTipoDocumentoGeneralAutoriSri.addActionListener(new ButtonActionListener(this,"FK_IdTipoDocumentoGeneralAutoriSri"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAutoriSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAutoriSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAutoriSriActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAutoriSri.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAutoriSri(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AutoriSri autorisriAux:this.autorisriLogic.getAutoriSris()) {
					autorisriAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriSri autorisriAux:autorisris) {
					autorisriAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAutoriSriItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAutoriSri(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AutoriSri autorisriAux:this.autorisriLogic.getAutoriSris()) {
						autorisriAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutoriSri autorisriAux:autorisris) {
						autorisriAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AutoriSri autorisriAux:this.autorisriLogic.getAutoriSris()) {
					
						if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							autorisriAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutoriSri autorisriAux:autorisris) {
						
						if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							autorisriAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAutoriSri(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAutoriSri.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAutoriSri.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAutoriSriItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAutoriSri(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAutoriSri.getSelectedRows();
			
			AutoriSri autorisriLocal=new AutoriSri();
			
			//this.seleccionarTodosAutoriSri(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autorisriLocal =(AutoriSri) this.autorisriLogic.getAutoriSris().toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					autorisriLocal =(AutoriSri) this.autorisris.toArray()[this.jTableDatosAutoriSri.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				autorisriLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AutoriSri autorisriAux:this.autorisriLogic.getAutoriSris()) {
						autorisriAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutoriSri autorisriAux:autorisris) {
						autorisriAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAutoriSri(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAutoriSri.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAutoriSri.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAutoriSri,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAutoriSriItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAutoriSriParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAutoriSriActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAutoriSri(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAutoriSri.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AutoriSri autorisriAux:this.autorisriLogic.getAutoriSris()) {
				
						if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
							existe=true;
							autorisriAux.setnumero_secuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR)) {
							existe=true;
							autorisriAux.setnumero_autor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							autorisriAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							autorisriAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriSri autorisriAux:autorisris) {
					
						if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
							existe=true;
							autorisriAux.setnumero_secuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR)) {
							existe=true;
							autorisriAux.setnumero_autor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							autorisriAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							autorisriAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAutoriSri(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAutoriSriActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAutoriSri(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAutoriSri=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAutoriSri.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAutoriSri) {				
					conSplash=true;//false;										
					
					//this.startProcessAutoriSri(conSplash);
				
					this.generarReporteAutoriSrisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAutoriSrisSeleccionados();
				//this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAutoriSrisSeleccionados(false);
				//this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAutoriSrisSeleccionados(true);
				//this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAutoriSri();
				
				this.exportarAutoriSrisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAutoriSris();
				//this.importarAutoriSris();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAutoriSri();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAutoriSrisSeleccionados();
				//this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Autorizaciones Sri", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAutoriSri();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAutoriSri)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAutoriSri(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Autorizaciones Sri",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.setSelectedIndex(0);					
				}	
			} 			
			else if(AutoriSriBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAutoriSri) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAutoriSri(conSplash);
					
						//this.actualizarParametrosGeneralAutoriSri();
						
						this.generarReporteProcesoAccionAutoriSrisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AutoriSriBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Autorizaciones SriS SELECCIONADOS?", "MANTENIMIENTO DE Autorizaciones Sri", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAutoriSri();
				
						this.actualizarParametrosGeneralAutoriSri();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.autorisriReturnGeneral=autorisriLogic.procesarAccionAutoriSrisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.autorisriLogic.getAutoriSris(),this.autorisriParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAutoriSriReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAutoriSri();
					
					AutoriSriBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAutoriSriReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAutoriSri.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAutoriSri.jComboBoxTiposAccionesFormularioAutoriSri.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAutoriSri(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAutoriSriActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAutoriSri();
			
			if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();		
			AutoriSri autorisri=new AutoriSri();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAutoriSri(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAutoriSri.getSelectedItem();
			
			
			
			
			autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
			//this.sTipoAccion;
			
			if(autorisrisSeleccionados.size()==1) {
				for(AutoriSri autorisriAux:autorisrisSeleccionados) {
					autorisri=autorisriAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAutoriSri();
			
      		//this.finishProcessAutoriSri(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAutoriSriReturnGeneral() throws Exception {
		if(this.autorisriReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.autorisriReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.autorisriReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.autorisriReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.autorisriReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.autorisriReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAutoriSri(false);
		}
		
		if(this.autorisriReturnGeneral.getConRetornoLista() || this.autorisriReturnGeneral.getConRetornoObjeto()) {
			if(this.autorisriReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.autorisriLogic.setAutoriSris(this.autorisriReturnGeneral.getAutoriSris());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.autorisriReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.autorisriLogic.setAutoriSri(this.autorisriReturnGeneral.getAutoriSri());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAutoriSri(false);
		}
	}
	
	public void actualizarParametrosGeneralAutoriSri() throws Exception {
		
		
	}
	
	public ArrayList<AutoriSri> getAutoriSrisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAutoriSri) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AutoriSri autorisriAux:autorisriLogic.getAutoriSris()) {
					if(autorisriAux.getIsSelected()) {
						autorisrisSeleccionados.add(autorisriAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriSri autorisriAux:this.autorisris) {
					if(autorisriAux.getIsSelected()) {
						autorisrisSeleccionados.add(autorisriAux);				
					}
				}
			}
			
			if(autorisrisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						autorisrisSeleccionados.addAll(this.autorisriLogic.getAutoriSris());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						autorisrisSeleccionados.addAll(this.autorisris);				
					}
				}
			}
		} else {
			autorisrisSeleccionados.add(this.autorisri);
		}
		
		return autorisrisSeleccionados;
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
	
	public void generarReporteAutoriSrisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAutoriSrisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAutoriSrisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAutoriSrisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAutoriSrisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Autorizaciones Sri",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAutoriSrisSeleccionados() throws Exception {
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();		
		
		autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAutoriSris("Todos",autorisrisSeleccionados);
		
	}	
	
	public void generarReporteNormalAutoriSrisSeleccionados() throws Exception {
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();		
		
		autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAutoriSris("Todos",autorisrisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAutoriSrisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();
		
		autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAutoriSris("Todos",autorisrisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAutoriSrisSeleccionados() throws Exception {
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAutoriSri();
		
		
		autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAutoriSri();
		
		
		//this.generarReporteAutoriSris("Todos",autorisrisSeleccionados ,autorisriImplementable,autorisriImplementableHome);
	}
	
	public void mostrarImportacionAutoriSris() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAutoriSri();
		
		this.abrirFrameImportacionAutoriSri();		
		
			
		//this.generarReporteAutoriSris("Todos",autorisrisSeleccionados ,autorisriImplementable,autorisriImplementableHome);
	}
	
	public void importarAutoriSris() throws Exception {		
	
	}
	
	public void exportarAutoriSrisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAutoriSrisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAutoriSrisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAutoriSrisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Autorizaciones Sri",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAutoriSrisSeleccionados() throws Exception {
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();		
		
		autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorisri."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAutoriSri(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AutoriSri autorisriAux:autorisrisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAutoriSri(autorisriAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//autorisriAux.setsDetalleGeneralEntityReporte(autorisriAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Sri",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAutoriSri(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AutoriSriConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriSriConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriSriConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriSriConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriSriConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriSriConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriSriConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAutoriSri(AutoriSri autorisri,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=autorisri.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=autorisri.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorisri.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorisri.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorisri.gettipodocumentogeneral_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorisri.getnumero_secuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorisri.getnumero_autor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorisri.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorisri.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorisri.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAutoriSrisSeleccionados() throws Exception {
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();		
		
		autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorisri.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AutoriSris");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAutoriSri(row);				
				iRow++;
			}				
			
			for(AutoriSri autorisriAux:autorisrisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAutoriSri(autorisriAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Sri",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAutoriSrisSeleccionados() throws Exception {
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();		
		
		autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorisri.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("autorisris");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("autorisri");
			//elementRoot.appendChild(element);
		
			for(AutoriSri autorisriAux:autorisrisSeleccionados) {
				element = document.createElement("autorisri");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAutoriSri(autorisriAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Sri",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAutoriSri(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriSriConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriSriConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AutoriSriConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriSriConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriSriConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriSriConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriSriConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAutoriSri(AutoriSri autorisri,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(autorisri.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(autorisri.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autorisri.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autorisri.gettipodocumentogeneral_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autorisri.getnumero_secuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(autorisri.getnumero_autor());
		cell = row.createCell(iColumn++);cell.setCellValue(autorisri.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(autorisri.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(autorisri.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlAutoriSri(AutoriSri autorisri,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AutoriSriConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(autorisri.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AutoriSriConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(autorisri.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AutoriSriConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(autorisri.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(AutoriSriConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(autorisri.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtipodocumentogeneral_descripcion = document.createElement(AutoriSriConstantesFunciones.IDTIPODOCUMENTOGENERAL);
		elementtipodocumentogeneral_descripcion.appendChild(document.createTextNode(autorisri.gettipodocumentogeneral_descripcion()));
		element.appendChild(elementtipodocumentogeneral_descripcion);

		Element elementnumero_secuencial = document.createElement(AutoriSriConstantesFunciones.NUMEROSECUENCIAL);
		elementnumero_secuencial.appendChild(document.createTextNode(autorisri.getnumero_secuencial().trim()));
		element.appendChild(elementnumero_secuencial);

		Element elementnumero_autor = document.createElement(AutoriSriConstantesFunciones.NUMEROAUTOR);
		elementnumero_autor.appendChild(document.createTextNode(autorisri.getnumero_autor().trim()));
		element.appendChild(elementnumero_autor);

		Element elementfecha_inicio = document.createElement(AutoriSriConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(autorisri.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(AutoriSriConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(autorisri.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementesta_activo = document.createElement(AutoriSriConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(autorisri.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoAutoriSrisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AutoriSri> autorisrisSeleccionados=new ArrayList<AutoriSri>();
		
		autorisrisSeleccionados=this.getAutoriSrisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAutoriSri(autorisrisSeleccionados);
		
		this.generarReporteAutoriSris("Todos",autorisrisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAutoriSri(ArrayList<AutoriSri> autorisrisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AutoriSri autorisriAux:autorisrisSeleccionados) {
				autorisriAux.setsDetalleGeneralEntityReporte(autorisriAux.toString());
			
				if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					autorisriAux.setsDescripcionGeneralEntityReporte1(autorisriAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					autorisriAux.setsDescripcionGeneralEntityReporte1(autorisriAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL)) {
					existe=true;
					autorisriAux.setsDescripcionGeneralEntityReporte1(autorisriAux.gettipodocumentogeneral_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
					existe=true;
					autorisriAux.setsDescripcionGeneralEntityReporte1(autorisriAux.getnumero_secuencial());
				}
				 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR)) {
					existe=true;
					autorisriAux.setsDescripcionGeneralEntityReporte1(autorisriAux.getnumero_autor());
				}
				 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					autorisriAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autorisriAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					autorisriAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autorisriAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(AutoriSriConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					autorisriAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(autorisriAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriSriConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAutoriSri(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAutoriSri=true;
				this.isVisibilidadCeldaNuevoRelacionesAutoriSri=true;
				this.isVisibilidadCeldaGuardarCambiosAutoriSri=true;
			}
			
			this.isVisibilidadCeldaModificarAutoriSri=false;
			this.isVisibilidadCeldaActualizarAutoriSri=false;
			this.isVisibilidadCeldaEliminarAutoriSri=false;
			this.isVisibilidadCeldaCancelarAutoriSri=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriSri=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriSri=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAutoriSri=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=false;
			this.isVisibilidadCeldaModificarAutoriSri=false;
			this.isVisibilidadCeldaActualizarAutoriSri=true;
			this.isVisibilidadCeldaEliminarAutoriSri=false;
			this.isVisibilidadCeldaCancelarAutoriSri=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriSri=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriSri=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAutoriSri=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=false;
			this.isVisibilidadCeldaModificarAutoriSri=false;
			this.isVisibilidadCeldaActualizarAutoriSri=true;
			this.isVisibilidadCeldaEliminarAutoriSri=true;
			this.isVisibilidadCeldaCancelarAutoriSri=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriSri=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriSri=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAutoriSri=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=false;
			this.isVisibilidadCeldaModificarAutoriSri=false;
			this.isVisibilidadCeldaActualizarAutoriSri=true;
			this.isVisibilidadCeldaEliminarAutoriSri=false;
			this.isVisibilidadCeldaCancelarAutoriSri=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriSri=false;
				} else {
					this.isVisibilidadCeldaGuardarAutoriSri=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAutoriSri=true;
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=true;
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=true;
			this.isVisibilidadCeldaModificarAutoriSri=false;
			this.isVisibilidadCeldaActualizarAutoriSri=false;
			this.isVisibilidadCeldaEliminarAutoriSri=false;
			this.isVisibilidadCeldaCancelarAutoriSri=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriSri=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriSri=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAutoriSri=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=false;
			this.isVisibilidadCeldaActualizarAutoriSri=false;
			this.isVisibilidadCeldaEliminarAutoriSri=false;
			this.isVisibilidadCeldaCancelarAutoriSri=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriSri=false;
				} else {
					this.isVisibilidadCeldaGuardarAutoriSri=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAutoriSri=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=false;
			this.isVisibilidadCeldaModificarAutoriSri=true;
			this.isVisibilidadCeldaActualizarAutoriSri=false;
			this.isVisibilidadCeldaEliminarAutoriSri=false;
			this.isVisibilidadCeldaCancelarAutoriSri=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriSri=false;
				} else {
					this.isVisibilidadCeldaGuardarAutoriSri=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AutoriSriJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAutoriSri=true;
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=true;
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=true;
		} else {
			this.actualizarEstadoPanelsAutoriSri(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAutoriSri=false;
			//this.isVisibilidadCeldaVerFormAutoriSri=false;
			this.isVisibilidadCeldaDuplicarAutoriSri=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!autorisriSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=false;
		} else {
			this.isVisibilidadCeldaNuevoAutoriSri=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriSri=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(autorisriSessionBean.getEsGuardarRelacionado()) {
			if(!autorisriSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAutoriSri=false;												
			}
			
			this.jButtonCerrarAutoriSri.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAutoriSri=false;
		}
		
		if(!this.permiteMantenimiento(this.autorisri)) {
			this.isVisibilidadCeldaActualizarAutoriSri=false;
			this.isVisibilidadCeldaEliminarAutoriSri=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAutoriSri() {
	}
	
	public void actualizarEstadoPanelsAutoriSri(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAutoriSri!=null) {
				this.jScrollPanelDatosEdicionAutoriSri.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriSri!=null) {
				this.jTabbedPaneBusquedasAutoriSri.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriSri!=null) {
				this.jScrollPanelDatosAutoriSri.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriSri!=null) {
				this.jPanelPaginacionAutoriSri.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriSri!=null) {
				this.jPanelParametrosReportesAutoriSri.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAutoriSri!=null) {
				this.jScrollPanelDatosEdicionAutoriSri.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriSri!=null) {
				this.jTabbedPaneBusquedasAutoriSri.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAutoriSri!=null) {
				this.jScrollPanelDatosAutoriSri.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutoriSri!=null) {
				this.jPanelPaginacionAutoriSri.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutoriSri!=null) {
				this.jPanelParametrosReportesAutoriSri.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAutoriSri!=null) {
				this.jScrollPanelDatosEdicionAutoriSri.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriSri!=null) {
				this.jTabbedPaneBusquedasAutoriSri.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAutoriSri!=null) {
				this.jScrollPanelDatosAutoriSri.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutoriSri!=null) {
				this.jPanelPaginacionAutoriSri.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutoriSri!=null) {
				this.jPanelParametrosReportesAutoriSri.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAutoriSri!=null) {
				this.jScrollPanelDatosEdicionAutoriSri.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriSri!=null) {
				this.jTabbedPaneBusquedasAutoriSri.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAutoriSri!=null) {
				this.jScrollPanelDatosAutoriSri.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutoriSri!=null) {
				this.jPanelPaginacionAutoriSri.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutoriSri!=null) {
				this.jPanelParametrosReportesAutoriSri.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAutoriSri!=null) {
				this.jScrollPanelDatosEdicionAutoriSri.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriSri!=null) {
				this.jTabbedPaneBusquedasAutoriSri.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriSri!=null) {
				this.jScrollPanelDatosAutoriSri.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriSri!=null) {
				this.jPanelPaginacionAutoriSri.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriSri!=null) {
				this.jPanelParametrosReportesAutoriSri.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAutoriSri!=null) {
				this.jScrollPanelDatosEdicionAutoriSri.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriSri!=null) {
				this.jTabbedPaneBusquedasAutoriSri.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriSri!=null) {
				this.jScrollPanelDatosAutoriSri.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriSri!=null) {
				this.jPanelPaginacionAutoriSri.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriSri!=null) {
				this.jPanelParametrosReportesAutoriSri.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAutoriSri!=null) {
				this.jScrollPanelDatosEdicionAutoriSri.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriSri!=null) {
				this.jTabbedPaneBusquedasAutoriSri.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriSri!=null) {
				this.jScrollPanelDatosAutoriSri.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriSri!=null) {
				this.jPanelPaginacionAutoriSri.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriSri!=null) {
				this.jPanelParametrosReportesAutoriSri.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.autorisriSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAutoriSri!=null) {
					this.jTabbedPaneBusquedasAutoriSri.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAutoriSri!=null) {
				this.jPanelParametrosReportesAutoriSri.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.autorisriSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriSri!=null) {
				this.jTabbedPaneBusquedasAutoriSri.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAutoriSri!=null) {
				this.jPanelParametrosReportesAutoriSri.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorFechaFin=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorFechaFin) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorFechaFinAutoriSri);}

			this.isVisibilidadBusquedaPorFechaInicio=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorFechaInicio) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorFechaInicioAutoriSri);}

			this.isVisibilidadBusquedaPorNumeroAutor=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNumeroAutor) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorNumeroAutorAutoriSri);}

			this.isVisibilidadBusquedaPorNumeroSecuencial=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNumeroSecuencial) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorNumeroSecuencialAutoriSri);}

			this.isVisibilidadFK_IdTipoDocumentoGeneral=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelFK_IdTipoDocumentoGeneralAutoriSri);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorFechaFin=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorFechaFin) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorFechaFinAutoriSri);}

			this.isVisibilidadBusquedaPorFechaInicio=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorFechaInicio) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorFechaInicioAutoriSri);}

			this.isVisibilidadBusquedaPorNumeroAutor=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNumeroAutor) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorNumeroAutorAutoriSri);}

			this.isVisibilidadBusquedaPorNumeroSecuencial=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNumeroSecuencial) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorNumeroSecuencialAutoriSri);}

			this.isVisibilidadFK_IdTipoDocumentoGeneral=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelFK_IdTipoDocumentoGeneralAutoriSri);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDocumentoGeneral(Boolean isParaTipoDocumentoGeneral){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDocumentoGeneralNegation=!isParaTipoDocumentoGeneral;

			this.isVisibilidadBusquedaPorFechaFin=isParaTipoDocumentoGeneralNegation;
			if(!this.isVisibilidadBusquedaPorFechaFin) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorFechaFinAutoriSri);}

			this.isVisibilidadBusquedaPorFechaInicio=isParaTipoDocumentoGeneralNegation;
			if(!this.isVisibilidadBusquedaPorFechaInicio) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorFechaInicioAutoriSri);}

			this.isVisibilidadBusquedaPorNumeroAutor=isParaTipoDocumentoGeneralNegation;
			if(!this.isVisibilidadBusquedaPorNumeroAutor) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorNumeroAutorAutoriSri);}

			this.isVisibilidadBusquedaPorNumeroSecuencial=isParaTipoDocumentoGeneralNegation;
			if(!this.isVisibilidadBusquedaPorNumeroSecuencial) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelBusquedaPorNumeroSecuencialAutoriSri);}

			this.isVisibilidadFK_IdTipoDocumentoGeneral=isParaTipoDocumentoGeneral;
			if(!this.isVisibilidadFK_IdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasAutoriSri.remove(jPanelFK_IdTipoDocumentoGeneralAutoriSri);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AutoriSriSessionBean autorisriSessionBean=new AutoriSriSessionBean();
		
		if(this.autorisriSessionBean==null) {
			this.autorisriSessionBean=new AutoriSriSessionBean();
		}
		
		this.autorisriSessionBean.setsUltimaBusquedaAutoriSri(this.getsAccionBusqueda());
		this.autorisriSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.autorisriSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorFechaFin")) {
			autorisriSessionBean.setfecha_fin(this.getfecha_finBusquedaPorFechaFin());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorFechaInicio")) {
			autorisriSessionBean.setfecha_inicio(this.getfecha_inicioBusquedaPorFechaInicio());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNumeroAutor")) {
			autorisriSessionBean.setnumero_autor(this.getnumero_autorBusquedaPorNumeroAutor());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNumeroSecuencial")) {
			autorisriSessionBean.setnumero_secuencial(this.getnumero_secuencialBusquedaPorNumeroSecuencial());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			autorisriSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			autorisriSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoDocumentoGeneral")) {
			autorisriSessionBean.setid_tipo_documento_general(this.getid_tipo_documento_generalFK_IdTipoDocumentoGeneral());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AutoriSriSessionBean autorisriSessionBean=new AutoriSriSessionBean();
		
		if(this.autorisriSessionBean==null) {
			this.autorisriSessionBean=new AutoriSriSessionBean();
		}
		
		if(this.autorisriSessionBean.getsUltimaBusquedaAutoriSri()!=null&&!this.autorisriSessionBean.getsUltimaBusquedaAutoriSri().equals("")) {
			this.setsAccionBusqueda(autorisriSessionBean.getsUltimaBusquedaAutoriSri());
			this.setiNumeroPaginacion(autorisriSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(autorisriSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorFechaFin")) {
				this.setfecha_finBusquedaPorFechaFin(autorisriSessionBean.getfecha_fin());
				autorisriSessionBean.setfecha_fin(new Date());
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorFechaInicio")) {
				this.setfecha_inicioBusquedaPorFechaInicio(autorisriSessionBean.getfecha_inicio());
				autorisriSessionBean.setfecha_inicio(new Date());
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNumeroAutor")) {
				this.setnumero_autorBusquedaPorNumeroAutor(autorisriSessionBean.getnumero_autor());
				autorisriSessionBean.setnumero_autor("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNumeroSecuencial")) {
				this.setnumero_secuencialBusquedaPorNumeroSecuencial(autorisriSessionBean.getnumero_secuencial());
				autorisriSessionBean.setnumero_secuencial("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(autorisriSessionBean.getid_empresa());
				autorisriSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(autorisriSessionBean.getid_sucursal());
				autorisriSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoDocumentoGeneral")) {
				this.setid_tipo_documento_generalFK_IdTipoDocumentoGeneral(autorisriSessionBean.getid_tipo_documento_general());
				autorisriSessionBean.setid_tipo_documento_general(-1L);
			}
		}
		
		this.autorisriSessionBean.setsUltimaBusquedaAutoriSri("");
		this.autorisriSessionBean.setiNumeroPaginacion(AutoriSriConstantesFunciones.INUMEROPAGINACION);
		this.autorisriSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAutoriSri(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAutoriSri() {
		this.updateBorderResaltarBusquedasFormularioAutoriSri();
		this.updateVisibilidadBusquedasFormularioAutoriSri();
		this.updateHabilitarBusquedasFormularioAutoriSri();
	}
	
	public void updateBorderResaltarBusquedasFormularioAutoriSri() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAutoriSri.getComponents().length>0) {
	

		if(this.autorisriConstantesFunciones.resaltarBusquedaPorFechaFinAutoriSri!=null) {
			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorFechaFinAutoriSri);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
				jPanel.setBorder(this.autorisriConstantesFunciones.resaltarBusquedaPorFechaFinAutoriSri);
			}
		}

		if(this.autorisriConstantesFunciones.resaltarBusquedaPorFechaInicioAutoriSri!=null) {
			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorFechaInicioAutoriSri);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
				jPanel.setBorder(this.autorisriConstantesFunciones.resaltarBusquedaPorFechaInicioAutoriSri);
			}
		}

		if(this.autorisriConstantesFunciones.resaltarBusquedaPorNumeroAutorAutoriSri!=null) {
			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorNumeroAutorAutoriSri);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
				jPanel.setBorder(this.autorisriConstantesFunciones.resaltarBusquedaPorNumeroAutorAutoriSri);
			}
		}

		if(this.autorisriConstantesFunciones.resaltarBusquedaPorNumeroSecuencialAutoriSri!=null) {
			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorNumeroSecuencialAutoriSri);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
				jPanel.setBorder(this.autorisriConstantesFunciones.resaltarBusquedaPorNumeroSecuencialAutoriSri);
			}
		}

		if(this.autorisriConstantesFunciones.resaltarFK_IdTipoDocumentoGeneralAutoriSri!=null) {
			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralAutoriSri);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
				jPanel.setBorder(this.autorisriConstantesFunciones.resaltarFK_IdTipoDocumentoGeneralAutoriSri);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAutoriSri() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAutoriSri.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorFechaFinAutoriSri);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.autorisriConstantesFunciones.mostrarBusquedaPorFechaFinAutoriSri);
			if(!this.autorisriConstantesFunciones.mostrarBusquedaPorFechaFinAutoriSri && index>-1) {
				this.jTabbedPaneBusquedasAutoriSri.remove(index);
			}

			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorFechaInicioAutoriSri);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.autorisriConstantesFunciones.mostrarBusquedaPorFechaInicioAutoriSri);
			if(!this.autorisriConstantesFunciones.mostrarBusquedaPorFechaInicioAutoriSri && index>-1) {
				this.jTabbedPaneBusquedasAutoriSri.remove(index);
			}

			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorNumeroAutorAutoriSri);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.autorisriConstantesFunciones.mostrarBusquedaPorNumeroAutorAutoriSri);
			if(!this.autorisriConstantesFunciones.mostrarBusquedaPorNumeroAutorAutoriSri && index>-1) {
				this.jTabbedPaneBusquedasAutoriSri.remove(index);
			}

			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorNumeroSecuencialAutoriSri);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.autorisriConstantesFunciones.mostrarBusquedaPorNumeroSecuencialAutoriSri);
			if(!this.autorisriConstantesFunciones.mostrarBusquedaPorNumeroSecuencialAutoriSri && index>-1) {
				this.jTabbedPaneBusquedasAutoriSri.remove(index);
			}

			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralAutoriSri);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.autorisriConstantesFunciones.mostrarFK_IdTipoDocumentoGeneralAutoriSri);
			if(!this.autorisriConstantesFunciones.mostrarFK_IdTipoDocumentoGeneralAutoriSri && index>-1) {
				this.jTabbedPaneBusquedasAutoriSri.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAutoriSri() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAutoriSri.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorFechaFinAutoriSri);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.autorisriConstantesFunciones.activarBusquedaPorFechaFinAutoriSri);
				this.jTabbedPaneBusquedasAutoriSri.setEnabledAt(index,this.autorisriConstantesFunciones.activarBusquedaPorFechaFinAutoriSri);
			}

			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorFechaInicioAutoriSri);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.autorisriConstantesFunciones.activarBusquedaPorFechaInicioAutoriSri);
				this.jTabbedPaneBusquedasAutoriSri.setEnabledAt(index,this.autorisriConstantesFunciones.activarBusquedaPorFechaInicioAutoriSri);
			}

			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorNumeroAutorAutoriSri);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.autorisriConstantesFunciones.activarBusquedaPorNumeroAutorAutoriSri);
				this.jTabbedPaneBusquedasAutoriSri.setEnabledAt(index,this.autorisriConstantesFunciones.activarBusquedaPorNumeroAutorAutoriSri);
			}

			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorNumeroSecuencialAutoriSri);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.autorisriConstantesFunciones.activarBusquedaPorNumeroSecuencialAutoriSri);
				this.jTabbedPaneBusquedasAutoriSri.setEnabledAt(index,this.autorisriConstantesFunciones.activarBusquedaPorNumeroSecuencialAutoriSri);
			}

			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralAutoriSri);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.autorisriConstantesFunciones.activarFK_IdTipoDocumentoGeneralAutoriSri);
				this.jTabbedPaneBusquedasAutoriSri.setEnabledAt(index,this.autorisriConstantesFunciones.activarFK_IdTipoDocumentoGeneralAutoriSri);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAutoriSri(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorFechaFin")) {
			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorFechaFinAutoriSri);

			this.jTabbedPaneBusquedasAutoriSri.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);

			this.autorisriConstantesFunciones.setResaltarBusquedaPorFechaFinAutoriSri(resaltar);

			jPanel.setBorder(this.autorisriConstantesFunciones.resaltarBusquedaPorFechaFinAutoriSri);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorFechaInicio")) {
			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorFechaInicioAutoriSri);

			this.jTabbedPaneBusquedasAutoriSri.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);

			this.autorisriConstantesFunciones.setResaltarBusquedaPorFechaInicioAutoriSri(resaltar);

			jPanel.setBorder(this.autorisriConstantesFunciones.resaltarBusquedaPorFechaInicioAutoriSri);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNumeroAutor")) {
			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorNumeroAutorAutoriSri);

			this.jTabbedPaneBusquedasAutoriSri.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);

			this.autorisriConstantesFunciones.setResaltarBusquedaPorNumeroAutorAutoriSri(resaltar);

			jPanel.setBorder(this.autorisriConstantesFunciones.resaltarBusquedaPorNumeroAutorAutoriSri);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNumeroSecuencial")) {
			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelBusquedaPorNumeroSecuencialAutoriSri);

			this.jTabbedPaneBusquedasAutoriSri.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);

			this.autorisriConstantesFunciones.setResaltarBusquedaPorNumeroSecuencialAutoriSri(resaltar);

			jPanel.setBorder(this.autorisriConstantesFunciones.resaltarBusquedaPorNumeroSecuencialAutoriSri);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoDocumentoGeneral")) {
			index= this.jTabbedPaneBusquedasAutoriSri.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralAutoriSri);

			this.jTabbedPaneBusquedasAutoriSri.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriSri.getComponent(index);

			this.autorisriConstantesFunciones.setResaltarFK_IdTipoDocumentoGeneralAutoriSri(resaltar);

			jPanel.setBorder(this.autorisriConstantesFunciones.resaltarFK_IdTipoDocumentoGeneralAutoriSri);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAutoriSri.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAutoriSri() throws Exception {

		if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAutoriSri();
		this.updateVisibilidadResaltarControlesFormularioAutoriSri();
		this.updateHabilitarResaltarControlesFormularioAutoriSri();
		
	}
	
	public void updateBorderResaltarControlesFormularioAutoriSri() throws Exception {
		if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.autorisriConstantesFunciones.resaltaridAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri!=null) {this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.setBorder(this.autorisriConstantesFunciones.resaltaridAutoriSri);}
		if(this.autorisriConstantesFunciones.resaltarid_empresaAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri!=null) {this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.setBorder(this.autorisriConstantesFunciones.resaltarid_empresaAutoriSri);}
		if(this.autorisriConstantesFunciones.resaltarid_sucursalAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri!=null) {this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.setBorder(this.autorisriConstantesFunciones.resaltarid_sucursalAutoriSri);}
		if(this.autorisriConstantesFunciones.resaltarid_tipo_documento_generalAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri!=null) {this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.setBorder(this.autorisriConstantesFunciones.resaltarid_tipo_documento_generalAutoriSri);}
		if(this.autorisriConstantesFunciones.resaltarnumero_secuencialAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri!=null) {this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_secuencialAutoriSri.setBorder(this.autorisriConstantesFunciones.resaltarnumero_secuencialAutoriSri);}
		if(this.autorisriConstantesFunciones.resaltarnumero_autorAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri!=null) {this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_autorAutoriSri.setBorder(this.autorisriConstantesFunciones.resaltarnumero_autorAutoriSri);}
		if(this.autorisriConstantesFunciones.resaltarfecha_inicioAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri!=null) {this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_inicioAutoriSri.setBorder(this.autorisriConstantesFunciones.resaltarfecha_inicioAutoriSri);}
		if(this.autorisriConstantesFunciones.resaltarfecha_finAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri!=null) {this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_finAutoriSri.setBorder(this.autorisriConstantesFunciones.resaltarfecha_finAutoriSri);}
		if(this.autorisriConstantesFunciones.resaltaresta_activoAutoriSri!=null && this.jInternalFrameDetalleFormAutoriSri!=null) {this.jInternalFrameDetalleFormAutoriSri.jCheckBoxesta_activoAutoriSri.setBorderPainted(true);this.jInternalFrameDetalleFormAutoriSri.jCheckBoxesta_activoAutoriSri.setBorder(this.autorisriConstantesFunciones.resaltaresta_activoAutoriSri);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAutoriSri() throws Exception {		
		if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) {
	
		//this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.setVisible(this.autorisriConstantesFunciones.mostraridAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jPanelidAutoriSri.setVisible(this.autorisriConstantesFunciones.mostraridAutoriSri);
		//this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarid_empresaAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jPanelid_empresaAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarid_empresaAutoriSri);
		//this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarid_sucursalAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jPanelid_sucursalAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarid_sucursalAutoriSri);
		//this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarid_tipo_documento_generalAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jPanelid_tipo_documento_generalAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarid_tipo_documento_generalAutoriSri);
		//this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_secuencialAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarnumero_secuencialAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jPanelnumero_secuencialAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarnumero_secuencialAutoriSri);
		//this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_autorAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarnumero_autorAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jPanelnumero_autorAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarnumero_autorAutoriSri);
		//this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_inicioAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarfecha_inicioAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jPanelfecha_inicioAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarfecha_inicioAutoriSri);
		//this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_finAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarfecha_finAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jPanelfecha_finAutoriSri.setVisible(this.autorisriConstantesFunciones.mostrarfecha_finAutoriSri);
		//this.jInternalFrameDetalleFormAutoriSri.jCheckBoxesta_activoAutoriSri.setVisible(this.autorisriConstantesFunciones.mostraresta_activoAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jPanelesta_activoAutoriSri.setVisible(this.autorisriConstantesFunciones.mostraresta_activoAutoriSri);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAutoriSri() throws Exception {
		if(this.jInternalFrameDetalleFormAutoriSri==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAutoriSri!=null) {
	
		this.jInternalFrameDetalleFormAutoriSri.jLabelidAutoriSri.setEnabled(this.autorisriConstantesFunciones.activaridAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_empresaAutoriSri.setEnabled(this.autorisriConstantesFunciones.activarid_empresaAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_sucursalAutoriSri.setEnabled(this.autorisriConstantesFunciones.activarid_sucursalAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jComboBoxid_tipo_documento_generalAutoriSri.setEnabled(this.autorisriConstantesFunciones.activarid_tipo_documento_generalAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_secuencialAutoriSri.setEnabled(this.autorisriConstantesFunciones.activarnumero_secuencialAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jTextFieldnumero_autorAutoriSri.setEnabled(this.autorisriConstantesFunciones.activarnumero_autorAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_inicioAutoriSri.setEnabled(this.autorisriConstantesFunciones.activarfecha_inicioAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jDateChooserfecha_finAutoriSri.setEnabled(this.autorisriConstantesFunciones.activarfecha_finAutoriSri);
		this.jInternalFrameDetalleFormAutoriSri.jCheckBoxesta_activoAutoriSri.setEnabled(this.autorisriConstantesFunciones.activaresta_activoAutoriSri);
		}
	}
	
		
}