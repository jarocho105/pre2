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

import com.bydan.erp.nomina.util.RubroEstructuraConstantesFunciones;
import com.bydan.erp.nomina.util.RubroEstructuraParameterReturnGeneral;
//import com.bydan.erp.nomina.util.RubroEstructuraParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.RubroEstructuraBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class RubroEstructuraBeanSwingJInternalFrame extends RubroEstructuraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RubroEstructuraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RubroEstructura> rubroestructuraValidator = new ClassValidator<RubroEstructura>(RubroEstructura.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RubroEstructura rubroestructura;	
	public RubroEstructura rubroestructuraAux;
	public RubroEstructura rubroestructuraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RubroEstructura rubroestructuraTotales;
	public Long idRubroEstructuraActual;
	public Long iIdNuevoRubroEstructura=0L;
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

	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
	}

	public String sFinalQueryComboRubroEmplea="";

	public List<RubroEmplea> rubroempleasForeignKey;

	public List<RubroEmplea> getrubroempleasForeignKey() {
		return rubroempleasForeignKey;
	}

	public void setrubroempleasForeignKey(List<RubroEmplea> rubroempleasForeignKey) {
		this.rubroempleasForeignKey = rubroempleasForeignKey;
	}

	//OBJETO FK ACTUAL
	public RubroEmplea rubroempleaForeignKey;

	public RubroEmplea getrubroempleaForeignKey() {
		return rubroempleaForeignKey;
	}

	public void setrubroempleaForeignKey(RubroEmplea rubroempleaForeignKey) {
		this.rubroempleaForeignKey = rubroempleaForeignKey;
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
	
	public Boolean isPermisoTodoRubroEstructura;
	public Boolean isPermisoNuevoRubroEstructura;
	public Boolean isPermisoActualizarRubroEstructura;
	public Boolean isPermisoActualizarOriginalRubroEstructura;
	public Boolean isPermisoEliminarRubroEstructura;
	public Boolean isPermisoGuardarCambiosRubroEstructura;
	public Boolean isPermisoConsultaRubroEstructura;
	public Boolean isPermisoBusquedaRubroEstructura;
	public Boolean isPermisoReporteRubroEstructura;
	public Boolean isPermisoPaginacionMedioRubroEstructura;
	public Boolean isPermisoPaginacionAltoRubroEstructura;
	public Boolean isPermisoPaginacionTodoRubroEstructura;
	public Boolean isPermisoCopiarRubroEstructura;
	public Boolean isPermisoVerFormRubroEstructura;
	public Boolean isPermisoDuplicarRubroEstructura;
	public Boolean isPermisoOrdenRubroEstructura;
	
	
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
	
	public RubroEstructuraParameterReturnGeneral rubroestructuraReturnGeneral;
	public RubroEstructuraParameterReturnGeneral rubroestructuraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRubroEstructura=false;
	public Boolean esParaAccionDesdeFormularioRubroEstructura=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RubroEstructuraSessionBeanAdditional rubroestructuraSessionBeanAdditional=null;
	
	public RubroEstructuraSessionBeanAdditional getRubroEstructuraSessionBeanAdditional() {
		return this.rubroestructuraSessionBeanAdditional;
	}
	
	public void setRubroEstructuraSessionBeanAdditional(RubroEstructuraSessionBeanAdditional rubroestructuraSessionBeanAdditional) {
		try {
			this.rubroestructuraSessionBeanAdditional=rubroestructuraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RubroEstructuraBeanSwingJInternalFrameAdditional rubroestructuraBeanSwingJInternalFrameAdditional=null;
	//public class RubroEstructuraBeanSwingJInternalFrame
	
	public RubroEstructuraBeanSwingJInternalFrameAdditional getRubroEstructuraBeanSwingJInternalFrameAdditional() {
		return this.rubroestructuraBeanSwingJInternalFrameAdditional;
	}
	
	public void setRubroEstructuraBeanSwingJInternalFrameAdditional(RubroEstructuraBeanSwingJInternalFrameAdditional rubroestructuraBeanSwingJInternalFrameAdditional) {
		try {
			this.rubroestructuraBeanSwingJInternalFrameAdditional=rubroestructuraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RubroEstructuraLogic rubroestructuraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RubroEstructura rubroestructuraBean;
	public RubroEstructuraConstantesFunciones rubroestructuraConstantesFunciones;
	//public RubroEstructuraParameterReturnGeneral rubroestructuraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EstructuraLogic estructuraLogic;
	public RubroEmpleaLogic rubroempleaLogic;
	
	//PARAMETROS
	
	
	//public List<RubroEstructura> rubroestructuras;	
	//public List<RubroEstructura> rubroestructurasEliminados;
	//public List<RubroEstructura> rubroestructurasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRubroEstructura=false;
	public Boolean isVisibilidadCeldaDuplicarRubroEstructura=true;
	public Boolean isVisibilidadCeldaCopiarRubroEstructura=true;
	public Boolean isVisibilidadCeldaVerFormRubroEstructura=true;
	public Boolean isVisibilidadCeldaOrdenRubroEstructura=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRubroEstructura=false;
	public Boolean isVisibilidadCeldaModificarRubroEstructura=false;
	public Boolean isVisibilidadCeldaActualizarRubroEstructura=false;
	public Boolean isVisibilidadCeldaEliminarRubroEstructura=false;
	public Boolean isVisibilidadCeldaCancelarRubroEstructura=false;
	public Boolean isVisibilidadCeldaGuardarRubroEstructura=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRubroEstructura=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdRubroEmplea=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoRubroEstructura() {
		return this.iIdNuevoRubroEstructura;
	}

	public void setiIdNuevoRubroEstructura(Long iIdNuevoRubroEstructura) {
		this.iIdNuevoRubroEstructura = iIdNuevoRubroEstructura;
	}
	
	public Long getidRubroEstructuraActual() {
		return this.idRubroEstructuraActual;
	}

	public void setidRubroEstructuraActual(Long idRubroEstructuraActual) {
		this.idRubroEstructuraActual = idRubroEstructuraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RubroEstructura getrubroestructura() {
		return this.rubroestructura;
	}

	public void setrubroestructura(RubroEstructura rubroestructura) {
		this.rubroestructura = rubroestructura;
	}
	
	public RubroEstructura getrubroestructuraAux() {
		return this.rubroestructuraAux;
	}

	public void setrubroestructuraAux(RubroEstructura rubroestructuraAux) {
		this.rubroestructuraAux = rubroestructuraAux;
	}				
	
	public RubroEstructura getrubroestructuraAnterior() {
		return this.rubroestructuraAnterior;
	}

	public void setrubroestructuraAnterior(RubroEstructura rubroestructuraAnterior) {
		this.rubroestructuraAnterior = rubroestructuraAnterior;
	}	
	
	public RubroEstructura getrubroestructuraTotales() {
		return this.rubroestructuraTotales;
	}

	public void setrubroestructuraTotales(RubroEstructura rubroestructuraTotales) {
		this.rubroestructuraTotales = rubroestructuraTotales;
	}	
	
	public RubroEstructura getrubroestructuraBean() {
		return this.rubroestructuraBean;
	}

	public void setrubroestructuraBean(RubroEstructura rubroestructuraBean) {
		this.rubroestructuraBean = rubroestructuraBean;
	}	
	
	public RubroEstructuraParameterReturnGeneral getrubroestructuraReturnGeneral() {
		return this.rubroestructuraReturnGeneral;
	}

	public void setrubroestructuraReturnGeneral(RubroEstructuraParameterReturnGeneral rubroestructuraReturnGeneral) {
		this.rubroestructuraReturnGeneral = rubroestructuraReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_rubro_empleaFK_IdRubroEmplea=-1L;

	public Long getid_rubro_empleaFK_IdRubroEmplea() {
		return this.id_rubro_empleaFK_IdRubroEmplea;
	}

	public void setid_rubro_empleaFK_IdRubroEmplea(Long id_rubro_empleaFK_IdRubroEmplea) {
		this.id_rubro_empleaFK_IdRubroEmplea = id_rubro_empleaFK_IdRubroEmplea;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RubroEstructuraLogic getRubroEstructuraLogic()	{		
		return rubroestructuraLogic;
	}

	public void setRubroEstructuraLogic(RubroEstructuraLogic rubroestructuraLogic) {
		this.rubroestructuraLogic = rubroestructuraLogic;
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
	
	public Boolean getIsEsNuevoRubroEstructura() {
		return isEsNuevoRubroEstructura;
	}

	public void setIsEsNuevoRubroEstructura(Boolean isEsNuevoRubroEstructura) {
		this.isEsNuevoRubroEstructura = isEsNuevoRubroEstructura;
	}

	public Boolean getEsParaAccionDesdeFormularioRubroEstructura() {
		return esParaAccionDesdeFormularioRubroEstructura;
	}
	
	public void setEsParaAccionDesdeFormularioRubroEstructura(Boolean esParaAccionDesdeFormularioRubroEstructura) {
		this.esParaAccionDesdeFormularioRubroEstructura = esParaAccionDesdeFormularioRubroEstructura;
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

			if(this.rubroestructuraSessionBean==null) {
				this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
			}

			if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(rubroestructuraSessionBean.getlidEmpresaActual());
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

			if(this.rubroestructuraSessionBean==null) {
				this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
			}

			if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(rubroestructuraSessionBean.getlidSucursalActual());
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

	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.rubroestructuraSessionBean==null) {
				this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
			}

			if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(rubroestructuraSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

	public void cargarCombosRubroEmpleasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RubroEmpleaLogic rubroempleaLogic=new RubroEmpleaLogic();

			//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

			if(this.rubroestructuraSessionBean==null) {
				this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
			}

			if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

					rubroempleaLogic.getTodosRubroEmpleasWithConnection(sFinalQuery,new Pagination());

					this.rubroempleasForeignKey=rubroempleaLogic.getRubroEmpleas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRubroEmplea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleaLogic.getEntityWithConnection(rubroestructuraSessionBean.getlidRubroEmpleaActual());
					this.rubroempleasForeignKey.add(rubroempleaLogic.getRubroEmplea());
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

					if(this.rubroestructura!=null) {
						this.rubroestructura.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
						this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRubroEstructura.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
						if(this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRubroEstructuraGenerico)throws Exception
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
				jComboBoxid_empresaRubroEstructuraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRubroEstructuraGenerico!=null && jComboBoxid_empresaRubroEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_empresaRubroEstructuraGenerico.setSelectedIndex(0);
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

					if(this.rubroestructura!=null) {
						this.rubroestructura.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
						this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalRubroEstructura.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
						if(this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalRubroEstructuraGenerico)throws Exception
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
				jComboBoxid_sucursalRubroEstructuraGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalRubroEstructuraGenerico!=null && jComboBoxid_sucursalRubroEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_sucursalRubroEstructuraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.rubroestructura!=null) {
						this.rubroestructura.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
						this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraRubroEstructura.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
						if(this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraRubroEstructura!=null) {
						jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraRubroEstructura!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraRubroEstructuraGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraRubroEstructuraGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraRubroEstructuraGenerico!=null && jComboBoxid_estructuraRubroEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_estructuraRubroEstructuraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRubroEmpleaForeignKey(Long idRubroEmpleaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(rubroempleaTemp!=null) {

					if(this.rubroestructura!=null) {
						this.rubroestructura.setRubroEmplea(rubroempleaTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
						this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.setSelectedItem(rubroempleaTemp);
					}
				} else {
					//jComboBoxid_rubro_empleaRubroEstructura.setSelectedItem(rubroempleaTemp);
					if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
						if(this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){
					if(rubroempleaTemp!=null && jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura!=null) {
						jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setSelectedItem(rubroempleaTemp);
					} else {
						if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura!=null) {
							//jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setSelectedItem(rubroempleaTemp);
							if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.getItemCount()>0) {
								jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setSelectedIndex(0);
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

	public String getActualRubroEmpleaForeignKeyDescripcion(Long idRubroEmpleaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}


			sDescripcion=RubroEmpleaConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRubroEmpleaForeignKeyGenerico(Long idRubroEmpleaSeleccionado,JComboBox jComboBoxid_rubro_empleaRubroEstructuraGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(rubroempleaTemp!=null) {
				jComboBoxid_rubro_empleaRubroEstructuraGenerico.setSelectedItem(rubroempleaTemp);
			} else {
				if(jComboBoxid_rubro_empleaRubroEstructuraGenerico!=null && jComboBoxid_rubro_empleaRubroEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_rubro_empleaRubroEstructuraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RubroEstructura rubroestructura,JComboBox jComboBoxid_empresaRubroEstructuraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRubroEstructuraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRubroEstructuraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				rubroestructura.setid_empresa(empresaAux.getId());
				rubroestructura.setempresa_descripcion(RubroEstructuraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				rubroestructura.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(RubroEstructura rubroestructura,JComboBox jComboBoxid_sucursalRubroEstructuraGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalRubroEstructuraGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalRubroEstructuraGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				rubroestructura.setid_sucursal(sucursalAux.getId());
				rubroestructura.setsucursal_descripcion(RubroEstructuraConstantesFunciones.getSucursalDescripcion(sucursalAux));
				rubroestructura.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(RubroEstructura rubroestructura,JComboBox jComboBoxid_estructuraRubroEstructuraGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraRubroEstructuraGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraRubroEstructuraGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				rubroestructura.setid_estructura(estructuraAux.getId());
				rubroestructura.setestructura_descripcion(RubroEstructuraConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				rubroestructura.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRubroEmpleaForeignKey(RubroEstructura rubroestructura,JComboBox jComboBoxid_rubro_empleaRubroEstructuraGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaAux=new RubroEmplea();

			if(jComboBoxid_rubro_empleaRubroEstructuraGenerico==null) {
				rubroempleaAux=(RubroEmplea)this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.getSelectedItem();
			} else {
				rubroempleaAux=(RubroEmplea)jComboBoxid_rubro_empleaRubroEstructuraGenerico.getSelectedItem();
			}

			if(rubroempleaAux!=null && rubroempleaAux.getId()!=null) {
				rubroestructura.setid_rubro_emplea(rubroempleaAux.getId());
				rubroestructura.setrubroemplea_descripcion(RubroEstructuraConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaAux));
				rubroestructura.setRubroEmplea(rubroempleaAux);			}
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

					if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) { 
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEstructura!=null) { 
					}

					if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) { 
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEstructura!=null) { 
					}

					if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) { 
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEstructura!=null) { 
					}

					if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.addItem(estructura);
							}
						}

						if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRubroEmpleasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRubroEmplea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) { 
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.addItem(rubroemplea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEstructura!=null) { 
					}

					if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.addItem(rubroemplea);
							}
						}

						if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameRubroEmpleaForeignKey(RubroEmplea rubroemplea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.setSelectedItem(rubroemplea);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setSelectedItem(rubroemplea);
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRubroEstructura() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RubroEstructuraConstantesFunciones.refrescarForeignKeysDescripcionesRubroEstructura(this.rubroestructuraLogic.getRubroEstructuras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RubroEstructuraConstantesFunciones.refrescarForeignKeysDescripcionesRubroEstructura(this.rubroestructuras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(RubroEmplea.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//rubroestructuraLogic.setRubroEstructuras(this.rubroestructuras);
			rubroestructuraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RubroEstructuraParameterReturnGeneral getRubroEstructuraParameterGeneral() {
		return this.rubroestructuraParameterGeneral;
	}
	
	public void setRubroEstructuraParameterGeneral(RubroEstructuraParameterReturnGeneral rubroestructuraParameterGeneral) {
		this.rubroestructuraParameterGeneral = rubroestructuraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRubroEstructura() {
		return isPermisoTodoRubroEstructura;
	}

	public void setIsPermisoTodoRubroEstructura(Boolean isPermisoTodoRubroEstructura) {
		this.isPermisoTodoRubroEstructura = isPermisoTodoRubroEstructura;
	}

	public Boolean getIsPermisoNuevoRubroEstructura() {
		return isPermisoNuevoRubroEstructura;
	}

	public void setIsPermisoNuevoRubroEstructura(Boolean isPermisoNuevoRubroEstructura) {
		this.isPermisoNuevoRubroEstructura = isPermisoNuevoRubroEstructura;
	}

	public Boolean getIsPermisoActualizarRubroEstructura() {
		return isPermisoActualizarRubroEstructura;
	}

	public void setIsPermisoActualizarRubroEstructura(Boolean isPermisoActualizarRubroEstructura) {
		this.isPermisoActualizarRubroEstructura = isPermisoActualizarRubroEstructura;
	}

	public Boolean getIsPermisoEliminarRubroEstructura() {
		return isPermisoEliminarRubroEstructura;
	}

	public void setIsPermisoEliminarRubroEstructura(Boolean isPermisoEliminarRubroEstructura) {
		this.isPermisoEliminarRubroEstructura = isPermisoEliminarRubroEstructura;
	}

	public Boolean getIsPermisoGuardarCambiosRubroEstructura() {
		return isPermisoGuardarCambiosRubroEstructura;
	}

	public void setIsPermisoGuardarCambiosRubroEstructura(Boolean isPermisoGuardarCambiosRubroEstructura) {
		this.isPermisoGuardarCambiosRubroEstructura = isPermisoGuardarCambiosRubroEstructura;
	}
	
	public Boolean getIsPermisoConsultaRubroEstructura() {
		return isPermisoConsultaRubroEstructura;
	}

	public void setIsPermisoConsultaRubroEstructura(Boolean isPermisoConsultaRubroEstructura) {
		this.isPermisoConsultaRubroEstructura = isPermisoConsultaRubroEstructura;
	}

	public Boolean getIsPermisoBusquedaRubroEstructura() {
		return isPermisoBusquedaRubroEstructura;
	}

	public void setIsPermisoBusquedaRubroEstructura(Boolean isPermisoBusquedaRubroEstructura) {
		this.isPermisoBusquedaRubroEstructura = isPermisoBusquedaRubroEstructura;
	}

	public Boolean getIsPermisoReporteRubroEstructura() {
		return isPermisoReporteRubroEstructura;
	}

	public void setIsPermisoReporteRubroEstructura(Boolean isPermisoReporteRubroEstructura) {
		this.isPermisoReporteRubroEstructura = isPermisoReporteRubroEstructura;
	}
	
	public Boolean getIsPermisoPaginacionMedioRubroEstructura() {
		return isPermisoPaginacionMedioRubroEstructura;
	}

	public void setIsPermisoPaginacionMedioRubroEstructura(Boolean isPermisoPaginacionMedioRubroEstructura) {
		this.isPermisoPaginacionMedioRubroEstructura = isPermisoPaginacionMedioRubroEstructura;
	}
	
	public Boolean getIsPermisoPaginacionTodoRubroEstructura() {
		return isPermisoPaginacionTodoRubroEstructura;
	}

	public void setIsPermisoPaginacionTodoRubroEstructura(Boolean isPermisoPaginacionTodoRubroEstructura) {
		this.isPermisoPaginacionTodoRubroEstructura = isPermisoPaginacionTodoRubroEstructura;
	}
	
	public Boolean getIsPermisoPaginacionAltoRubroEstructura() {
		return isPermisoPaginacionAltoRubroEstructura;
	}

	public void setIsPermisoPaginacionAltoRubroEstructura(Boolean isPermisoPaginacionAltoRubroEstructura) {
		this.isPermisoPaginacionAltoRubroEstructura = isPermisoPaginacionAltoRubroEstructura;
	}
	
	public Boolean getIsPermisoCopiarRubroEstructura() {
		return isPermisoCopiarRubroEstructura;
	}

	public void setIsPermisoCopiarRubroEstructura(Boolean isPermisoCopiarRubroEstructura) {
		this.isPermisoCopiarRubroEstructura = isPermisoCopiarRubroEstructura;
	}
	
	public Boolean getIsPermisoVerFormRubroEstructura() {
		return isPermisoVerFormRubroEstructura;
	}

	public void setIsPermisoVerFormRubroEstructura(Boolean isPermisoVerFormRubroEstructura) {
		this.isPermisoVerFormRubroEstructura = isPermisoVerFormRubroEstructura;
	}
	
	public Boolean getIsPermisoDuplicarRubroEstructura() {
		return isPermisoDuplicarRubroEstructura;
	}

	public void setIsPermisoDuplicarRubroEstructura(Boolean isPermisoDuplicarRubroEstructura) {
		this.isPermisoDuplicarRubroEstructura = isPermisoDuplicarRubroEstructura;
	}
	
	public Boolean getIsPermisoOrdenRubroEstructura() {
		return isPermisoOrdenRubroEstructura;
	}

	public void setIsPermisoOrdenRubroEstructura(Boolean isPermisoOrdenRubroEstructura) {
		this.isPermisoOrdenRubroEstructura = isPermisoOrdenRubroEstructura;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRubroEstructura() {
		return isVisibilidadCeldaNuevoRubroEstructura;
	}

	public void setIsVisibilidadCeldaNuevoRubroEstructura(Boolean isVisibilidadCeldaNuevoRubroEstructura) {
		this.isVisibilidadCeldaNuevoRubroEstructura = isVisibilidadCeldaNuevoRubroEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRubroEstructura() {
		return isVisibilidadCeldaDuplicarRubroEstructura;
	}

	public void setIsVisibilidadCeldaDuplicarRubroEstructura(Boolean isVisibilidadCeldaDuplicarRubroEstructura) {
		this.isVisibilidadCeldaDuplicarRubroEstructura = isVisibilidadCeldaDuplicarRubroEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRubroEstructura() {
		return isVisibilidadCeldaCopiarRubroEstructura;
	}

	public void setIsVisibilidadCeldaCopiarRubroEstructura(Boolean isVisibilidadCeldaCopiarRubroEstructura) {
		this.isVisibilidadCeldaCopiarRubroEstructura = isVisibilidadCeldaCopiarRubroEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRubroEstructura() {
		return isVisibilidadCeldaVerFormRubroEstructura;
	}

	public void setIsVisibilidadCeldaVerFormRubroEstructura(Boolean isVisibilidadCeldaVerFormRubroEstructura) {
		this.isVisibilidadCeldaVerFormRubroEstructura = isVisibilidadCeldaVerFormRubroEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRubroEstructura() {
		return isVisibilidadCeldaOrdenRubroEstructura;
	}

	public void setIsVisibilidadCeldaOrdenRubroEstructura(Boolean isVisibilidadCeldaOrdenRubroEstructura) {
		this.isVisibilidadCeldaOrdenRubroEstructura = isVisibilidadCeldaOrdenRubroEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRubroEstructura() {
		return isVisibilidadCeldaNuevoRelacionesRubroEstructura;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRubroEstructura(Boolean isVisibilidadCeldaNuevoRelacionesRubroEstructura) {
		this.isVisibilidadCeldaNuevoRelacionesRubroEstructura = isVisibilidadCeldaNuevoRelacionesRubroEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRubroEstructura() {
		return isVisibilidadCeldaModificarRubroEstructura;
	}

	public void setIsVisibilidadCeldaModificarRubroEstructura(Boolean isVisibilidadCeldaModificarRubroEstructura) {
		this.isVisibilidadCeldaModificarRubroEstructura = isVisibilidadCeldaModificarRubroEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRubroEstructura() {
		return isVisibilidadCeldaActualizarRubroEstructura;
	}

	public void setIsVisibilidadCeldaActualizarRubroEstructura(Boolean isVisibilidadCeldaActualizarRubroEstructura) {
		this.isVisibilidadCeldaActualizarRubroEstructura = isVisibilidadCeldaActualizarRubroEstructura;
	}

	public Boolean getIsVisibilidadCeldaEliminarRubroEstructura() {
		return isVisibilidadCeldaEliminarRubroEstructura;
	}

	public void setIsVisibilidadCeldaEliminarRubroEstructura(Boolean isVisibilidadCeldaEliminarRubroEstructura) {
		this.isVisibilidadCeldaEliminarRubroEstructura = isVisibilidadCeldaEliminarRubroEstructura;
	}

	public Boolean getIsVisibilidadCeldaCancelarRubroEstructura() {
		return isVisibilidadCeldaCancelarRubroEstructura;
	}

	public void setIsVisibilidadCeldaCancelarRubroEstructura(Boolean isVisibilidadCeldaCancelarRubroEstructura) {
		this.isVisibilidadCeldaCancelarRubroEstructura = isVisibilidadCeldaCancelarRubroEstructura;
	}

	public Boolean getIsVisibilidadCeldaGuardarRubroEstructura() {
		return isVisibilidadCeldaGuardarRubroEstructura;
	}

	public void setIsVisibilidadCeldaGuardarRubroEstructura(Boolean isVisibilidadCeldaGuardarRubroEstructura) {
		this.isVisibilidadCeldaGuardarRubroEstructura = isVisibilidadCeldaGuardarRubroEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRubroEstructura() {
		return isVisibilidadCeldaGuardarCambiosRubroEstructura;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRubroEstructura(Boolean isVisibilidadCeldaGuardarCambiosRubroEstructura) {
		this.isVisibilidadCeldaGuardarCambiosRubroEstructura = isVisibilidadCeldaGuardarCambiosRubroEstructura;
	}
		
	public RubroEstructuraSessionBean getrubroestructuraSessionBean() {
		return this.rubroestructuraSessionBean;
	}
	
	public void setrubroestructuraSessionBean(RubroEstructuraSessionBean rubroestructuraSessionBean) {
		this.rubroestructuraSessionBean=rubroestructuraSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdRubroEmplea() {
		return this.isVisibilidadFK_IdRubroEmplea;
	}

	public void setisVisibilidadFK_IdRubroEmplea(Boolean isVisibilidadFK_IdRubroEmplea) {
		this.isVisibilidadFK_IdRubroEmplea=isVisibilidadFK_IdRubroEmplea;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(RubroEstructura rubroestructura)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(rubroestructura,null);
				this.setActualParaGuardarSucursalForeignKey(rubroestructura,null);
				this.setActualParaGuardarEstructuraForeignKey(rubroestructura,null);
				this.setActualParaGuardarRubroEmpleaForeignKey(rubroestructura,null);
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
	
	public void bugActualizarReferenciaActual(RubroEstructura rubroestructura,RubroEstructura rubroestructuraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRubroEstructura(rubroestructura);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		rubroestructuraAux.setId(rubroestructura.getId());
		rubroestructuraAux.setVersionRow(rubroestructura.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRubroEstructura();
		
			int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = rubroestructuraValidator.getInvalidValues(this.rubroestructura);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			rubroestructuraLogic.setDatosCliente(datosCliente);
			rubroestructuraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				rubroestructuraAux=new  RubroEstructura();
				
				rubroestructuraAux.setIsNew(true);
				rubroestructuraAux.setIsChanged(true);
				
				rubroestructuraAux.setRubroEstructuraOriginal(this.rubroestructura);
				
				rubroestructuraAux.setId(this.rubroestructura.getId());	
				rubroestructuraAux.setVersionRow(this.rubroestructura.getVersionRow());	
				rubroestructuraAux.setid_empresa(this.rubroestructura.getid_empresa());	
				rubroestructuraAux.setid_sucursal(this.rubroestructura.getid_sucursal());	
				rubroestructuraAux.setid_estructura(this.rubroestructura.getid_estructura());	
				rubroestructuraAux.setid_rubro_emplea(this.rubroestructura.getid_rubro_emplea());	
				rubroestructuraAux.setesta_activo(this.rubroestructura.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rubroestructuraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(rubroestructuraAux,rubroestructuraLogic.getRubroEstructuras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroestructuraAux,rubroestructuras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rubroestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructuraLogic.saveRubroEstructuras();//WithConnection
						//rubroestructuraLogic.getSetVersionRowRubroEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rubroestructura,rubroestructuraAux);
					
					this.refrescarForeignKeysDescripcionesRubroEstructura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rubroestructuraLogic.saveRubroEstructuraRelaciones(rubroestructuraAux);//WithConnection
								//rubroestructuraLogic.getSetVersionRowRubroEstructuras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rubroestructura,rubroestructuraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rubroestructuraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rubroestructuraAux,rubroestructuraLogic.getRubroEstructuras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rubroestructuraAux,rubroestructuras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rubroestructura,rubroestructuraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				rubroestructuraAux=new  RubroEstructura();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado() 
					|| (this.rubroestructuraSessionBean.getEsGuardarRelacionado() && this.rubroestructura.getId()>=0)) {
						
					rubroestructuraAux.setIsNew(false);
				}
				
				rubroestructuraAux.setIsDeleted(false);
			
				rubroestructuraAux.setId(this.rubroestructura.getId());	
				rubroestructuraAux.setVersionRow(this.rubroestructura.getVersionRow());	
				rubroestructuraAux.setid_empresa(this.rubroestructura.getid_empresa());	
				rubroestructuraAux.setid_sucursal(this.rubroestructura.getid_sucursal());	
				rubroestructuraAux.setid_estructura(this.rubroestructura.getid_estructura());	
				rubroestructuraAux.setid_rubro_emplea(this.rubroestructura.getid_rubro_emplea());	
				rubroestructuraAux.setesta_activo(this.rubroestructura.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rubroestructuraAux,rubroestructuraLogic.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroestructuraAux,rubroestructuras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rubroestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructuraLogic.saveRubroEstructuras();//WithConnection
						//rubroestructuraLogic.getSetVersionRowRubroEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rubroestructura,rubroestructuraAux);
					
					this.refrescarForeignKeysDescripcionesRubroEstructura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rubroestructuraLogic.saveRubroEstructuraRelaciones(rubroestructuraAux);//WithConnection
								//rubroestructuraLogic.getSetVersionRowRubroEstructuras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rubroestructura,rubroestructuraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rubroestructuraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rubroestructuraAux,rubroestructuraLogic.getRubroEstructuras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rubroestructuraAux,rubroestructuras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rubroestructura,rubroestructuraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				rubroestructuraAux=new  RubroEstructura();
				
				rubroestructuraAux.setIsNew(false);
				rubroestructuraAux.setIsChanged(false);
				
				rubroestructuraAux.setIsDeleted(true);
				
				rubroestructuraAux.setId(this.rubroestructura.getId());	
				rubroestructuraAux.setVersionRow(this.rubroestructura.getVersionRow());	
				rubroestructuraAux.setid_empresa(this.rubroestructura.getid_empresa());	
				rubroestructuraAux.setid_sucursal(this.rubroestructura.getid_sucursal());	
				rubroestructuraAux.setid_estructura(this.rubroestructura.getid_estructura());	
				rubroestructuraAux.setid_rubro_emplea(this.rubroestructura.getid_rubro_emplea());	
				rubroestructuraAux.setesta_activo(this.rubroestructura.getesta_activo());	
				
				if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.rubroestructuraAux.getId()>=0) {	
						this.rubroestructurasEliminados.add(rubroestructuraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(rubroestructuraAux,rubroestructuraLogic.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroestructuraAux,rubroestructuras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rubroestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructuraLogic.saveRubroEstructuras();//WithConnection
						//rubroestructuraLogic.getSetVersionRowRubroEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rubroestructuraLogic.saveRubroEstructuraRelaciones(rubroestructuraAux);//WithConnection
								//rubroestructuraLogic.getSetVersionRowRubroEstructuras();//WithConnection
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
							if(this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.rubroestructuraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(rubroestructuraAux,rubroestructuraLogic.getRubroEstructuras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(rubroestructuraAux,rubroestructuras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.getRubroEstructuras().addAll(this.rubroestructurasEliminados);
					
					rubroestructuraLogic.saveRubroEstructuras();//WithConnection
					//rubroestructuraLogic.getSetVersionRowRubroEstructuras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRubroEstructura();
				
				this.rubroestructurasEliminados= new ArrayList<RubroEstructura>();		
			}
			
			if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Rubro Estructura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Rubro Estructura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.rubroestructura=rubroestructuraAux;
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
      		//this.finishProcessRubroEstructura();
      	}
		
	}	
	
	public void actualizarRelaciones(RubroEstructura rubroestructuraLocal) throws Exception {
		
		if(this.rubroestructuraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RubroEstructura rubroestructuraLocal) throws Exception {	
		if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				rubroestructuraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				rubroestructuraLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				rubroestructuraLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RubroEmpleaDetalleFormJInternalFrame.class)) {
				RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrameLocal=(RubroEmpleaBeanSwingJInternalFrame) ((RubroEmpleaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rubroempleaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.getrubroemplea(),true);
				rubroempleaBeanSwingJInternalFrameLocal.actualizarLista(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea,this.rubroempleasForeignKey);

				rubroempleaBeanSwingJInternalFrameLocal.actualizarRelaciones(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				rubroestructuraLocal.setRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey("Formulario");
				this.setActualRubroEmpleaForeignKey(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRubroEstructuraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = rubroestructuraValidator.getInvalidValues(this.rubroestructura);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RubroEstructura rubroestructura,List<RubroEstructura> rubroestructuras) throws Exception {
		try	{		
			RubroEstructuraConstantesFunciones.actualizarLista(rubroestructura,rubroestructuras,this.rubroestructuraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RubroEstructura rubroestructura,List<RubroEstructura> rubroestructuras) throws Exception {
		try	{			
			RubroEstructuraConstantesFunciones.actualizarSelectedLista(rubroestructura,rubroestructuras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RubroEstructura> rubroestructurasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				rubroestructurasLocal=this.rubroestructuraLogic.getRubroEstructuras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				rubroestructurasLocal=this.rubroestructuras;
			}
			//ARCHITECTURE
		
			for(RubroEstructura rubroestructuraLocal:rubroestructurasLocal) {
				if(this.permiteMantenimiento(rubroestructuraLocal) && rubroestructuraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RubroEstructuraConstantesFunciones.getRubroEstructuraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RubroEstructuraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEstructura.jLabelid_empresaRubroEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEstructuraConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEstructura.jLabelid_sucursalRubroEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEstructuraConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEstructura.jLabelid_estructuraRubroEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEstructuraConstantesFunciones.IDRUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEstructura.jLabelid_rubro_empleaRubroEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEstructuraConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEstructura.jLabelesta_activoRubroEstructura,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEstructura.jLabelid_empresaRubroEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEstructura.jLabelid_sucursalRubroEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEstructura.jLabelid_estructuraRubroEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEstructura.jLabelid_rubro_empleaRubroEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEstructura.jLabelesta_activoRubroEstructura,"");
		
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
		this.iIdNuevoRubroEstructura--;	
		
		
		this.rubroestructuraAux=new RubroEstructura();
		
		this.rubroestructuraAux.setId(this.iIdNuevoRubroEstructura);
		this.rubroestructuraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rubroestructuraLogic.getRubroEstructuras().add(this.rubroestructuraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.rubroestructuras.add(this.rubroestructuraAux);
		}
		//ARCHITECTURE
		
		this.rubroestructura=this.rubroestructuraAux;
		
		if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRubroEstructura(this.rubroestructura);
			this.setVariablesObjetoActualToFormularioForeignKeyRubroEstructura(this.rubroestructura);
		}
				
		//this.setDefaultControlesRubroEstructura();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRubroEstructura();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRubroEstructura();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRubroEstructura();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRubroEstructura(this.rubroestructuraBean,this.rubroestructura,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RubroEstructuraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.rubroestructuraSessionBean.getConGuardarRelaciones()) {
			classes=RubroEstructuraConstantesFunciones.getClassesRelationshipsOfRubroEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.rubroestructuraReturnGeneral=rubroestructuraLogic.procesarEventosRubroEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubroestructuraLogic.getRubroEstructuras(),this.rubroestructura,this.rubroestructuraParameterGeneral,this.isEsNuevoRubroEstructura,classes);//this.rubroestructuraLogic.getRubroEstructura()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRubroEstructura(this.rubroestructuraReturnGeneral,this.rubroestructuraBean,false);
		
		if(this.rubroestructuraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRubroEstructura(this.rubroestructuraReturnGeneral.getRubroEstructura());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRubroEstructura(this.rubroestructuraReturnGeneral.getRubroEstructura());
		}
		
		if(this.rubroestructuraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRubroEstructura(this.rubroestructuraReturnGeneral.getRubroEstructura(),classes);//this.rubroestructuraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRubroEstructura();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRubroEstructura();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.RecargarFormRubroEstructura(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRubroEstructura(false);
						
			if(rubroestructuraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubroEstructura();
			}
			
			this.actualizarVisualTableDatosRubroEstructura();
			
			this.jTableDatosRubroEstructura.setRowSelectionInterval(this.getIndiceNuevoRubroEstructura(), this.getIndiceNuevoRubroEstructura());
			
			this.seleccionarFilaTablaRubroEstructuraActual();
						
			this.actualizarEstadoCeldasBotonesRubroEstructura("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRubroEstructura(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxesta_activoRubroEstructura.setEnabled(isHabilitar && this.rubroestructuraConstantesFunciones.activaresta_activoRubroEstructura);	
		//
		this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.setEnabled(isHabilitar && this.rubroestructuraConstantesFunciones.activarid_empresaRubroEstructura);//
		this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.setEnabled(isHabilitar && this.rubroestructuraConstantesFunciones.activarid_sucursalRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.setEnabled(isHabilitar && this.rubroestructuraConstantesFunciones.activarid_estructuraRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.setEnabled(isHabilitar && this.rubroestructuraConstantesFunciones.activarid_rubro_empleaRubroEstructura);
	};
	
	public void setDefaultControlesRubroEstructura() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRubroEstructura(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.rubroestructuraSessionBean.setConGuardarRelaciones(true);			
			this.rubroestructuraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRubroEstructura.jTabbedPaneRelacionesRubroEstructura.setVisible(true);
			
					
		} else {
			//this.rubroestructuraSessionBean.setConGuardarRelaciones(false);			
			this.rubroestructuraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRubroEstructura.jTabbedPaneRelacionesRubroEstructura.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRubroEstructura() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEstructura rubroestructuraAux:this.rubroestructuraLogic.getRubroEstructuras()) {
				if(rubroestructuraAux.getId().equals(this.iIdNuevoRubroEstructura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEstructura rubroestructuraAux:this.rubroestructuras) {
				if(rubroestructuraAux.getId().equals(this.iIdNuevoRubroEstructura)) {
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
	
	public int getIndiceActualRubroEstructura(RubroEstructura rubroestructura,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEstructura rubroestructuraAux:this.rubroestructuraLogic.getRubroEstructuras()) {
				if(rubroestructuraAux.getId().equals(rubroestructura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEstructura rubroestructuraAux:this.rubroestructuras) {
				if(rubroestructuraAux.getId().equals(rubroestructura.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRubroEstructura(RubroEstructura rubroestructuraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEstructura rubroestructuraAux:this.rubroestructuraLogic.getRubroEstructuras()) {
				if(rubroestructuraAux.getRubroEstructuraOriginal().getId().equals(rubroestructuraOriginal.getId())) {
					existe=true;
					rubroestructuraOriginal.setId(rubroestructuraAux.getId());
					rubroestructuraOriginal.setVersionRow(rubroestructuraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEstructura rubroestructuraAux:this.rubroestructuras) {
				if(rubroestructuraAux.getRubroEstructuraOriginal().getId().equals(rubroestructuraOriginal.getId())) {
					existe=true;
					rubroestructuraOriginal.setId(rubroestructuraAux.getId());
					rubroestructuraOriginal.setVersionRow(rubroestructuraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRubroEstructura(Boolean esParaCancelar) throws Exception {
		rubroestructurasAux=new ArrayList<RubroEstructura>();
		rubroestructuraAux=new RubroEstructura();
		
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RubroEstructura rubroestructuraAux:this.rubroestructuraLogic.getRubroEstructuras()) {
					if(rubroestructuraAux.getId()<0) {
						rubroestructurasAux.add(rubroestructuraAux);
					}		
				}
				this.iIdNuevoRubroEstructura=0L;
				this.rubroestructuraLogic.getRubroEstructuras().removeAll(rubroestructurasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEstructura rubroestructuraAux:this.rubroestructuras) {
					if(rubroestructuraAux.getId()<0) {
						rubroestructurasAux.add(rubroestructuraAux);
					}		
				}
				this.iIdNuevoRubroEstructura=0L;
				this.rubroestructuras.removeAll(rubroestructurasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRubroEstructura 
					&& this.rubroestructuraLogic.getRubroEstructuras().size()>0
					) {
					rubroestructuraAux=this.rubroestructuraLogic.getRubroEstructuras().get(this.rubroestructuraLogic.getRubroEstructuras().size() - 1);
				
					if(rubroestructuraAux.getId()<0) {
						this.rubroestructuraLogic.getRubroEstructuras().remove(rubroestructuraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRubroEstructura && this.rubroestructuras.size()>0) {
					rubroestructuraAux=this.rubroestructuras.get(this.rubroestructuras.size() - 1);
				
					if(rubroestructuraAux.getId()<0) {
						this.rubroestructuras.remove(rubroestructuraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRubroEstructura(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(rubroestructura.getId()<0) {
				this.rubroestructuraLogic.getRubroEstructuras().remove(this.rubroestructura);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(rubroestructura.getId()<0) {
				this.rubroestructuras.remove(this.rubroestructura);
			}
		}			
	}
	
	public void setEstadosInicialesRubroEstructura(List<RubroEstructura> rubroestructurasAux) throws Exception {
		RubroEstructuraConstantesFunciones.setEstadosInicialesRubroEstructura(rubroestructurasAux);
	}
	
	public void setEstadosInicialesRubroEstructura(RubroEstructura rubroestructuraAux) throws Exception {
		RubroEstructuraConstantesFunciones.setEstadosInicialesRubroEstructura(rubroestructuraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRubroEstructuraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRubroEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRubroEstructuraActual()) {
				if(!this.isEsNuevoRubroEstructura) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRubroEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRubroEstructura=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRubroEstructuraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Rubro Estructura ?", "MANTENIMIENTO DE Rubro Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRubroEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RubroEstructura rubroestructura) throws Exception {
		RubroEstructuraConstantesFunciones.seleccionarAsignar(this.rubroestructura,rubroestructura);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRubroEstructura=this.isPermisoActualizarOriginalRubroEstructura;
			
			
			this.seleccionarAsignar(rubroestructura);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RubroEstructuraConstantesFunciones.quitarEspaciosRubroEstructura(this.rubroestructura,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRubroEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.rubroestructuraSessionBean.setsFuncionBusquedaRapida(this.rubroestructuraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRubroEstructura) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRubroEstructura(esParaCancelar);				
				this.cancelarNuevoRubroEstructura(esParaCancelar);								
			}
			
			this.rubroestructura=new RubroEstructura();
			
			this.inicializarRubroEstructura();
			
			this.actualizarEstadoCeldasBotonesRubroEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRubroEstructura() throws Exception {
		try {
			RubroEstructuraConstantesFunciones.inicializarRubroEstructura(this.rubroestructura);
			
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
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.rubroestructuraLogic.getRubroEstructuras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRubroEstructuras(String sAccionBusqueda,List<RubroEstructura> rubroestructurasParaReportes) throws Exception {
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
					sPathReporteFinal="RubroEstructura"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RubroEstructuraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RubroEstructuraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RubroEstructura"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Rubro Estructuras");		
		parameters.put("busquedapor", RubroEstructuraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRubroEstructura=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RubroEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RubroEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRubroEstructura=new JRBeanArrayDataSource(RubroEstructuraJInternalFrame.TraerRubroEstructuraBeans(rubroestructurasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRubroEstructura);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RubroEstructuraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RubroEstructuraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RubroEstructuraBean.TraerRubroEstructuraBeans(rubroestructurasParaReportes).toArray()));
							
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
				this.generarExcelReporteRubroEstructuras(sAccionBusqueda,sTipoArchivoReporte,rubroestructurasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRubroEstructuras(sAccionBusqueda,sTipoArchivoReporte,rubroestructurasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRubroEstructuraActionPerformed(null);
					//this.generarExcelReporteRubroEstructuras(sAccionBusqueda,sTipoArchivoReporte,rubroestructurasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRubroEstructuras(sAccionBusqueda,sTipoArchivoReporte,rubroestructurasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRubroEstructuras(sAccionBusqueda,sTipoArchivoReporte,rubroestructurasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRubroEstructuras(sAccionBusqueda,sTipoArchivoReporte,rubroestructurasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRubroEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<RubroEstructura> rubroestructurasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroestructura";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubroEstructuras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRubroEstructura("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RubroEstructura rubroestructura : rubroestructurasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RubroEstructuraConstantesFunciones.generarExcelReporteDataRubroEstructura("NORMAL",row,workbook,rubroestructura,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRubroEstructura(String sTipo,Row row,Workbook workbook) {
		
		RubroEstructuraConstantesFunciones.generarExcelReporteHeaderRubroEstructura(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRubroEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<RubroEstructura> rubroestructurasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroestructura_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubroEstructuras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RubroEstructura rubroestructura : rubroestructurasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RubroEstructuraConstantesFunciones.getRubroEstructuraDescripcion(rubroestructura));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroestructura.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroestructura.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroestructura.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroestructura.getrubroemplea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(rubroestructura.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRubroEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<RubroEstructura> rubroestructurasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RubroEstructura> rubroestructurasRespaldo=null;
		
		classes=RubroEstructuraConstantesFunciones.getClassesRelationshipsOfRubroEstructura(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.rubroestructuraLogic.setDatosCliente(this.datosCliente);
		this.rubroestructuraLogic.setDatosDeep(this.datosDeep);
		this.rubroestructuraLogic.setIsConDeep(true);
		
		rubroestructurasRespaldo=this.rubroestructuraLogic.getRubroEstructuras();
		
		this.rubroestructuraLogic.setRubroEstructuras(rubroestructurasParaReportes);	
		this.rubroestructuraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		rubroestructurasParaReportes=this.rubroestructuraLogic.getRubroEstructuras();
		this.rubroestructuraLogic.setRubroEstructuras(rubroestructurasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroestructura_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubroEstructuras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRubroEstructura("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RubroEstructura rubroestructura : rubroestructurasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRubroEstructura("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RubroEstructuraConstantesFunciones.generarExcelReporteDataRubroEstructura("NORMAL",row,workbook,rubroestructura,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RubroEstructuraConstantesFunciones.getRubroEstructuraDescripcion(rubroestructura));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRubroEstructura.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRubroEstructura() throws Exception {		
		this.startProcessRubroEstructura(true);
	}
	
	public void startProcessRubroEstructura(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRubroEstructura ,this.jPanelParametrosReportesRubroEstructura, this.jScrollPanelDatosRubroEstructura,this.jPanelPaginacionRubroEstructura, this.jScrollPanelDatosEdicionRubroEstructura, this.jPanelAccionesRubroEstructura,this.jPanelAccionesFormularioRubroEstructura,this.jmenuBarRubroEstructura,this.jmenuBarDetalleRubroEstructura,this.jTtoolBarRubroEstructura,this.jTtoolBarDetalleRubroEstructura);		
		
		final JTabbedPane jTabbedPaneBusquedasRubroEstructura=this.jTabbedPaneBusquedasRubroEstructura; 
		
		final JPanel jPanelParametrosReportesRubroEstructura=this.jPanelParametrosReportesRubroEstructura;
		//final JScrollPane jScrollPanelDatosRubroEstructura=this.jScrollPanelDatosRubroEstructura;
		final JTable jTableDatosRubroEstructura=this.jTableDatosRubroEstructura;		
		final JPanel jPanelPaginacionRubroEstructura=this.jPanelPaginacionRubroEstructura;
		//final JScrollPane jScrollPanelDatosEdicionRubroEstructura=this.jScrollPanelDatosEdicionRubroEstructura;
		final JPanel jPanelAccionesRubroEstructura=this.jPanelAccionesRubroEstructura;
		
		JPanel jPanelCamposAuxiliarRubroEstructura=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRubroEstructura=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			jPanelCamposAuxiliarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jPanelCamposRubroEstructura;
			jPanelAccionesFormularioAuxiliarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jPanelAccionesFormularioRubroEstructura;
		}
		
		final JPanel jPanelCamposRubroEstructura=jPanelCamposAuxiliarRubroEstructura;
		final JPanel jPanelAccionesFormularioRubroEstructura=jPanelAccionesFormularioAuxiliarRubroEstructura;
		
		
		final JMenuBar jmenuBarRubroEstructura=this.jmenuBarRubroEstructura;
		final JToolBar jTtoolBarRubroEstructura=this.jTtoolBarRubroEstructura;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRubroEstructura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRubroEstructura=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			jmenuBarDetalleAuxiliarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jmenuBarDetalleRubroEstructura;
			jTtoolBarDetalleAuxiliarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jTtoolBarDetalleRubroEstructura;
		}
		
		final JMenuBar jmenuBarDetalleRubroEstructura=jmenuBarDetalleAuxiliarRubroEstructura;
		final JToolBar jTtoolBarDetalleRubroEstructura=jTtoolBarDetalleAuxiliarRubroEstructura;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRubroEstructura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRubroEstructura;
			processRunnable.jTableDatos=jTableDatosRubroEstructura;
			processRunnable.jPanelCampos=jPanelCamposRubroEstructura;
			processRunnable.jPanelPaginacion=jPanelPaginacionRubroEstructura;
			processRunnable.jPanelAcciones=jPanelAccionesRubroEstructura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRubroEstructura;
			
			
			processRunnable.jmenuBar=jmenuBarRubroEstructura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRubroEstructura;
			processRunnable.jTtoolBar=jTtoolBarRubroEstructura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRubroEstructura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRubroEstructura ,jPanelParametrosReportesRubroEstructura,jTableDatosRubroEstructura, /*jScrollPanelDatosRubroEstructura,*/jPanelCamposRubroEstructura,jPanelPaginacionRubroEstructura, /*jScrollPanelDatosEdicionRubroEstructura,*/ jPanelAccionesRubroEstructura,jPanelAccionesFormularioRubroEstructura,jmenuBarRubroEstructura,jmenuBarDetalleRubroEstructura,jTtoolBarRubroEstructura,jTtoolBarDetalleRubroEstructura);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRubroEstructura ,jPanelParametrosReportesRubroEstructura, jScrollPanelDatosRubroEstructura,jPanelPaginacionRubroEstructura, jScrollPanelDatosEdicionRubroEstructura, jPanelAccionesRubroEstructura,jPanelAccionesFormularioRubroEstructura,jmenuBarRubroEstructura,jmenuBarDetalleRubroEstructura,jTtoolBarRubroEstructura,jTtoolBarDetalleRubroEstructura);
						
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
	
	public void finishProcessRubroEstructura() {// throws Exception 
		this.finishProcessRubroEstructura(true);
	}
	
	public void finishProcessRubroEstructura(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRubroEstructura ,this.jPanelParametrosReportesRubroEstructura, this.jScrollPanelDatosRubroEstructura,this.jPanelPaginacionRubroEstructura, this.jScrollPanelDatosEdicionRubroEstructura, this.jPanelAccionesRubroEstructura,this.jPanelAccionesFormularioRubroEstructura,this.jmenuBarRubroEstructura,this.jmenuBarDetalleRubroEstructura,this.jTtoolBarRubroEstructura,this.jTtoolBarDetalleRubroEstructura);		
		
		final JTabbedPane jTabbedPaneBusquedasRubroEstructura=this.jTabbedPaneBusquedasRubroEstructura; 
		
		final JPanel jPanelParametrosReportesRubroEstructura=this.jPanelParametrosReportesRubroEstructura;
		//final JScrollPane jScrollPanelDatosRubroEstructura=this.jScrollPanelDatosRubroEstructura;
		final JTable jTableDatosRubroEstructura=this.jTableDatosRubroEstructura;		
		final JPanel jPanelPaginacionRubroEstructura=this.jPanelPaginacionRubroEstructura;
		//final JScrollPane jScrollPanelDatosEdicionRubroEstructura=this.jScrollPanelDatosEdicionRubroEstructura;
		final JPanel jPanelAccionesRubroEstructura=this.jPanelAccionesRubroEstructura;
		
		JPanel jPanelCamposAuxiliarRubroEstructura=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRubroEstructura=new JPanel();
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			jPanelCamposAuxiliarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jPanelCamposRubroEstructura;
			jPanelAccionesFormularioAuxiliarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jPanelAccionesFormularioRubroEstructura;
		}
		
		final JPanel jPanelCamposRubroEstructura=jPanelCamposAuxiliarRubroEstructura;
		final JPanel jPanelAccionesFormularioRubroEstructura=jPanelAccionesFormularioAuxiliarRubroEstructura;
		
		
		final JMenuBar jmenuBarRubroEstructura=this.jmenuBarRubroEstructura;		
		final JToolBar jTtoolBarRubroEstructura=this.jTtoolBarRubroEstructura;
				
		JMenuBar jmenuBarDetalleAuxiliarRubroEstructura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRubroEstructura=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			jmenuBarDetalleAuxiliarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jmenuBarDetalleRubroEstructura;
			jTtoolBarDetalleAuxiliarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jTtoolBarDetalleRubroEstructura;		
		}
		
		final JMenuBar jmenuBarDetalleRubroEstructura=jmenuBarDetalleAuxiliarRubroEstructura;
		final JToolBar jTtoolBarDetalleRubroEstructura=jTtoolBarDetalleAuxiliarRubroEstructura;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRubroEstructura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRubroEstructura;
			processRunnable.jTableDatos=jTableDatosRubroEstructura;
			processRunnable.jPanelCampos=jPanelCamposRubroEstructura;
			processRunnable.jPanelPaginacion=jPanelPaginacionRubroEstructura;
			processRunnable.jPanelAcciones=jPanelAccionesRubroEstructura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRubroEstructura;
			
			
			processRunnable.jmenuBar=jmenuBarRubroEstructura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRubroEstructura;
			processRunnable.jTtoolBar=jTtoolBarRubroEstructura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRubroEstructura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRubroEstructura ,jPanelParametrosReportesRubroEstructura, jTableDatosRubroEstructura,/*jScrollPanelDatosRubroEstructura,*/jPanelCamposRubroEstructura,jPanelPaginacionRubroEstructura, /*jScrollPanelDatosEdicionRubroEstructura,*/ jPanelAccionesRubroEstructura,jPanelAccionesFormularioRubroEstructura,jmenuBarRubroEstructura,jmenuBarDetalleRubroEstructura,jTtoolBarRubroEstructura,jTtoolBarDetalleRubroEstructura));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRubroEstructura(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRubroEstructura(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRubroEstructura(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRubroEstructura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRubroEstructura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRubroEstructura,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRubroEstructura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRubroEstructura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRubroEstructura,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.rubroestructuraConstantesFunciones.getsFinalQueryRubroEstructura();
		String  finalQueryPaginacionTodos=this.rubroestructuraConstantesFunciones.getsFinalQueryRubroEstructura();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RubroEstructuraConstantesFunciones.getArrayColumnasGlobalesNoRubroEstructura(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RubroEstructuraConstantesFunciones.getArrayColumnasGlobalesRubroEstructura(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RubroEstructuraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.rubroestructurasEliminados= new ArrayList<RubroEstructura>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRubroEstructura();
		
				///*RubroEstructuraSessionBean*/this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
			
			if(this.rubroestructuraSessionBean==null) {
				this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
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
					this.iNumeroPaginacion=RubroEstructuraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RubroEstructuraConstantesFunciones.getClassesForeignKeysOfRubroEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/rubroestructura."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			rubroestructurasAux= new ArrayList<RubroEstructura>();
			
				
			rubroestructuraLogic.setDatosCliente(this.datosCliente);
			rubroestructuraLogic.setDatosDeep(this.datosDeep);
			rubroestructuraLogic.setIsConDeep(true);
			
			
			rubroestructuraLogic.getRubroEstructuraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					rubroestructuraLogic.getTodosRubroEstructuras(finalQueryGlobal,pagination);
					
					//rubroestructuraLogic.getTodosRubroEstructurasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(rubroestructuraLogic.getRubroEstructuras()==null|| rubroestructuraLogic.getRubroEstructuras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rubroestructurasAux= new ArrayList<RubroEstructura>();
							rubroestructurasAux.addAll(rubroestructuraLogic.getRubroEstructuras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructurasAux= new ArrayList<RubroEstructura>();
							rubroestructurasAux.addAll(rubroestructuras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rubroestructuraLogic.getTodosRubroEstructuras(finalQueryGlobal+"",this.pagination);												
							
							//rubroestructuraLogic.getTodosRubroEstructurasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRubroEstructuras("Todos",rubroestructuraLogic.getRubroEstructuras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rubroestructuraLogic.setRubroEstructuras(new ArrayList<RubroEstructura>());					
							rubroestructuraLogic.getRubroEstructuras().addAll(rubroestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructuras=new ArrayList<RubroEstructura>();
							rubroestructuras.addAll(rubroestructurasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRubroEstructura=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRubroEstructura=this.idActual;
				
				} else if(this.idRubroEstructuraActual!=null && this.idRubroEstructuraActual!=0L) {
					idRubroEstructura=idRubroEstructuraActual;
				}
				
					
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndicePorId(idRubroEstructura);
				
				this.rubroestructuras=new ArrayList<RubroEstructura>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					rubroestructuraLogic.getEntity(idRubroEstructura);
					
					//rubroestructuraLogic.getEntityWithConnection(idRubroEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroestructuraLogic.setRubroEstructuras(new ArrayList<RubroEstructura>());
					rubroestructuraLogic.getRubroEstructuras().add(rubroestructuraLogic.getRubroEstructura());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroestructuras=new ArrayList<RubroEstructura>();
					this.rubroestructuras.add(rubroestructura);
				}
				
				if(rubroestructuraLogic.getRubroEstructura()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroestructuraLogic.getRubroEstructurasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroestructuraLogic.getRubroEstructuras()==null||rubroestructuraLogic.getRubroEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroestructuras==null|| rubroestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructurasAux=new ArrayList<RubroEstructura>();
						rubroestructurasAux.addAll(rubroestructuraLogic.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructurasAux=new ArrayList<RubroEstructura>();
							rubroestructurasAux.addAll(rubroestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroestructuraLogic.getRubroEstructurasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEstructuras("FK_IdEmpresa",rubroestructuraLogic.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEstructuras("FK_IdEmpresa",rubroestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructuraLogic.setRubroEstructuras(new ArrayList<RubroEstructura>());
						rubroestructuraLogic.getRubroEstructuras().addAll(rubroestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructuras=new ArrayList<RubroEstructura>();
							rubroestructuras.addAll(rubroestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroestructuraLogic.getRubroEstructurasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroestructuraLogic.getRubroEstructuras()==null||rubroestructuraLogic.getRubroEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroestructuras==null|| rubroestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructurasAux=new ArrayList<RubroEstructura>();
						rubroestructurasAux.addAll(rubroestructuraLogic.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructurasAux=new ArrayList<RubroEstructura>();
							rubroestructurasAux.addAll(rubroestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroestructuraLogic.getRubroEstructurasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEstructuras("FK_IdEstructura",rubroestructuraLogic.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEstructuras("FK_IdEstructura",rubroestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructuraLogic.setRubroEstructuras(new ArrayList<RubroEstructura>());
						rubroestructuraLogic.getRubroEstructuras().addAll(rubroestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructuras=new ArrayList<RubroEstructura>();
							rubroestructuras.addAll(rubroestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRubroEmplea")) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroestructuraLogic.getRubroEstructurasFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroestructuraLogic.getRubroEstructuras()==null||rubroestructuraLogic.getRubroEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroestructuras==null|| rubroestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructurasAux=new ArrayList<RubroEstructura>();
						rubroestructurasAux.addAll(rubroestructuraLogic.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructurasAux=new ArrayList<RubroEstructura>();
							rubroestructurasAux.addAll(rubroestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroestructuraLogic.getRubroEstructurasFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEstructuras("FK_IdRubroEmplea",rubroestructuraLogic.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEstructuras("FK_IdRubroEmplea",rubroestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructuraLogic.setRubroEstructuras(new ArrayList<RubroEstructura>());
						rubroestructuraLogic.getRubroEstructuras().addAll(rubroestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructuras=new ArrayList<RubroEstructura>();
							rubroestructuras.addAll(rubroestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroestructuraLogic.getRubroEstructurasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroestructuraLogic.getRubroEstructuras()==null||rubroestructuraLogic.getRubroEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroestructuras==null|| rubroestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructurasAux=new ArrayList<RubroEstructura>();
						rubroestructurasAux.addAll(rubroestructuraLogic.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructurasAux=new ArrayList<RubroEstructura>();
							rubroestructurasAux.addAll(rubroestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroestructuraLogic.getRubroEstructurasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEstructuras("FK_IdSucursal",rubroestructuraLogic.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEstructuras("FK_IdSucursal",rubroestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructuraLogic.setRubroEstructuras(new ArrayList<RubroEstructura>());
						rubroestructuraLogic.getRubroEstructuras().addAll(rubroestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructuras=new ArrayList<RubroEstructura>();
							rubroestructuras.addAll(rubroestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRubroEstructura();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRubroEstructura();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rubroestructuraLogic.getRubroEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubroestructuras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rubroestructuraLogic.getRubroEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubroestructuras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RubroEstructura rubroestructura) {
		Boolean permite=true;
		
		if(this.rubroestructura.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RubroEstructuraConstantesFunciones.getOrderByListaRubroEstructura();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RubroEstructuraConstantesFunciones.getOrderByListaRubroEstructura();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEstructura rubroestructura:rubroestructuraLogic.getRubroEstructuras()) {
				if(rubroestructura.getsType().equals(Constantes2.S_TOTALES)) {
					rubroestructuraTotales=rubroestructura;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEstructura rubroestructura:this.rubroestructuras) {
				if(rubroestructura.getsType().equals(Constantes2.S_TOTALES)) {
					rubroestructuraTotales=rubroestructura;
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
			this.rubroestructuraAux=new RubroEstructura();
			this.rubroestructuraAux.setsType(Constantes2.S_TOTALES);
			this.rubroestructuraAux.setIsNew(false);
			this.rubroestructuraAux.setIsChanged(false);
			this.rubroestructuraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RubroEstructuraConstantesFunciones.TotalizarValoresFilaRubroEstructura(this.rubroestructuraLogic.getRubroEstructuras(),this.rubroestructuraAux);
				
				this.rubroestructuraLogic.getRubroEstructuras().add(this.rubroestructuraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RubroEstructuraConstantesFunciones.TotalizarValoresFilaRubroEstructura(this.rubroestructuras,this.rubroestructuraAux);
				
				this.rubroestructuras.add(this.rubroestructuraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		rubroestructuraTotales=new RubroEstructura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rubroestructuraLogic.getRubroEstructuras().remove(rubroestructuraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rubroestructuras.remove(rubroestructuraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		rubroestructuraTotales=new RubroEstructura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEstructura rubroestructura:rubroestructuraLogic.getRubroEstructuras()) {
				if(rubroestructura.getsType().equals(Constantes2.S_TOTALES)) {
					rubroestructuraTotales=rubroestructura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RubroEstructuraConstantesFunciones.TotalizarValoresFilaRubroEstructura(this.rubroestructuraLogic.getRubroEstructuras(),rubroestructuraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEstructura rubroestructura:this.rubroestructuras) {
				if(rubroestructura.getsType().equals(Constantes2.S_TOTALES)) {
					rubroestructuraTotales=rubroestructura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RubroEstructuraConstantesFunciones.TotalizarValoresFilaRubroEstructura(this.rubroestructuras,rubroestructuraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRubroEstructurasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubroEstructurasFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubroEstructurasFK_IdRubroEmplea()throws Exception {
		try {
			sAccionBusqueda="FK_IdRubroEmplea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubroEstructurasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRubroEstructurasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroestructuraLogic.getRubroEstructurasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubroEstructurasFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroestructuraLogic.getRubroEstructurasFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubroEstructurasFK_IdRubroEmplea(String sFinalQuery,Long id_rubro_emplea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroestructuraLogic.getRubroEstructurasFK_IdRubroEmplea(sFinalQuery,this.pagination,id_rubro_emplea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubroEstructurasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroestructuraLogic.getRubroEstructurasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosRubroEstructura() {
		this.isPermisoTodoRubroEstructura=false;
		this.isPermisoNuevoRubroEstructura=false;
		this.isPermisoActualizarRubroEstructura=false;
		this.isPermisoActualizarOriginalRubroEstructura=false;
		this.isPermisoEliminarRubroEstructura=false;
		this.isPermisoGuardarCambiosRubroEstructura=false;
		this.isPermisoConsultaRubroEstructura=false;
		this.isPermisoBusquedaRubroEstructura=false;
		this.isPermisoReporteRubroEstructura=false;		
		this.isPermisoOrdenRubroEstructura=false;		
		this.isPermisoPaginacionMedioRubroEstructura=false;		
		this.isPermisoPaginacionAltoRubroEstructura=false;
		this.isPermisoPaginacionTodoRubroEstructura=false;
		this.isPermisoCopiarRubroEstructura=false;		
		this.isPermisoVerFormRubroEstructura=false;		
		this.isPermisoDuplicarRubroEstructura=false;		
		this.isPermisoOrdenRubroEstructura=false;		
	}
	
	public void setPermisosUsuarioRubroEstructura(Boolean isPermiso) {
		this.isPermisoTodoRubroEstructura=isPermiso;
		this.isPermisoNuevoRubroEstructura=isPermiso;
		this.isPermisoActualizarRubroEstructura=isPermiso;
		this.isPermisoActualizarOriginalRubroEstructura=isPermiso;
		this.isPermisoEliminarRubroEstructura=isPermiso;
		this.isPermisoGuardarCambiosRubroEstructura=isPermiso;
		this.isPermisoConsultaRubroEstructura=isPermiso;
		this.isPermisoBusquedaRubroEstructura=isPermiso;
		this.isPermisoReporteRubroEstructura=isPermiso;
		this.isPermisoOrdenRubroEstructura=isPermiso;		
		this.isPermisoPaginacionMedioRubroEstructura=isPermiso;		
		this.isPermisoPaginacionAltoRubroEstructura=isPermiso;		
		this.isPermisoPaginacionTodoRubroEstructura=isPermiso;		
		this.isPermisoCopiarRubroEstructura=isPermiso;		
		this.isPermisoVerFormRubroEstructura=isPermiso;		
		this.isPermisoDuplicarRubroEstructura=isPermiso;
		this.isPermisoOrdenRubroEstructura=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRubroEstructura(Boolean isPermiso) {
		//this.isPermisoTodoRubroEstructura=isPermiso;
		this.isPermisoNuevoRubroEstructura=isPermiso;
		this.isPermisoActualizarRubroEstructura=isPermiso;
		this.isPermisoActualizarOriginalRubroEstructura=isPermiso;
		this.isPermisoEliminarRubroEstructura=isPermiso;
		this.isPermisoGuardarCambiosRubroEstructura=isPermiso;
		//this.isPermisoConsultaRubroEstructura=isPermiso;
		//this.isPermisoBusquedaRubroEstructura=isPermiso;
		//this.isPermisoReporteRubroEstructura=isPermiso;
		//this.isPermisoOrdenRubroEstructura=isPermiso;		
		//this.isPermisoPaginacionMedioRubroEstructura=isPermiso;		
		//this.isPermisoPaginacionAltoRubroEstructura=isPermiso;		
		//this.isPermisoPaginacionTodoRubroEstructura=isPermiso;		
		//this.isPermisoCopiarRubroEstructura=isPermiso;		
		//this.isPermisoDuplicarRubroEstructura=isPermiso;
		//this.isPermisoOrdenRubroEstructura=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRubroEstructuraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RubroEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRubroEstructura(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRubroEstructuraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRubroEstructuraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRubroEstructuraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRubroEstructuraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRubroEstructura() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RubroEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RubroEstructuraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRubroEstructura=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRubroEstructura=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRubroEstructura=this.isPermisoActualizarRubroEstructura;
			this.isPermisoEliminarRubroEstructura=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRubroEstructura=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRubroEstructura=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRubroEstructura=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRubroEstructura=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRubroEstructura=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRubroEstructura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRubroEstructura=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRubroEstructura=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRubroEstructura=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRubroEstructura=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRubroEstructura=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRubroEstructura=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRubroEstructura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRubroEstructura.setToolTipText(this.jTableDatosRubroEstructura.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRubroEstructura(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRubroEstructura(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RubroEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RubroEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRubroEstructura() throws Exception {
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
	public void inicializarCombosForeignKeyRubroEstructuraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.rubroempleasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRubroEstructuraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RubroEstructuraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRubroEstructuraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyRubroEmpleaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RubroEmpleaConstantesFunciones.SFINALQUERY;

				this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRubroEstructuraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RubroEstructuraParameterReturnGeneral rubroestructuraReturnGeneral=new RubroEstructuraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.rubroestructuraConstantesFunciones.cargarid_empresaRubroEstructura)
					 || (this.esRecargarFks && this.rubroestructuraConstantesFunciones.cargarid_empresaRubroEstructura)) {

					if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+rubroestructuraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.rubroestructuraConstantesFunciones.cargarid_sucursalRubroEstructura)
					 || (this.esRecargarFks && this.rubroestructuraConstantesFunciones.cargarid_sucursalRubroEstructura)) {

					if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+rubroestructuraSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.rubroestructuraConstantesFunciones.cargarid_estructuraRubroEstructura)
					 || (this.esRecargarFks && this.rubroestructuraConstantesFunciones.cargarid_estructuraRubroEstructura)) {

					if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+rubroestructuraSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalRubroEmplea="";

				if(((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0) && this.rubroestructuraConstantesFunciones.cargarid_rubro_empleaRubroEstructura)
					 || (this.esRecargarFks && this.rubroestructuraConstantesFunciones.cargarid_rubro_empleaRubroEstructura)) {

					if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRubroEmplea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

						finalQueryGlobalRubroEmplea=Funciones.GetFinalQueryAppend(finalQueryGlobalRubroEmplea, "");
						finalQueryGlobalRubroEmplea+=RubroEmpleaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRubroEmplea=" WHERE " + ConstantesSql.ID + "="+rubroestructuraSessionBean.getlidRubroEmpleaActual();
					}
				} else {
					finalQueryGlobalRubroEmplea="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				rubroestructuraReturnGeneral=rubroestructuraLogic.cargarCombosLoteForeignKeyRubroEstructura(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEstructura,finalQueryGlobalRubroEmplea);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=rubroestructuraReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=rubroestructuraReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=rubroestructuraReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalRubroEmplea.equals("NONE")) {
				this.rubroempleasForeignKey=rubroestructuraReturnGeneral.getrubroempleasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRubroEstructura()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyRubroEmplea();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.rubroestructuraSessionBean==null) {
				this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
			}

			if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyRubroEmplea()throws Exception {
		try {

			if(!this.rubroestructuraSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				RubroEmplea rubroemplea=new RubroEmplea();
				RubroEmpleaConstantesFunciones.setRubroEmpleaDescripcion(rubroemplea,Constantes.SMENSAJE_ESCOJA_OPCION);
				rubroemplea.setId(null);

				if(!RubroEmpleaConstantesFunciones.ExisteEnLista(this.rubroempleasForeignKey,rubroemplea,true)) {

					this.rubroempleasForeignKey.add(0,rubroemplea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRubroEstructura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRubroEstructura(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRubroEstructura()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRubroEstructura();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRubroEstructura(RubroEstructura rubroestructura)throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(rubroestructura.getid_estructura(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(rubroestructura.getid_rubro_emplea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRubroEstructura(RubroEstructura rubroestructura,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRubroEstructura()throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(this.rubroestructuraConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(this.rubroestructuraConstantesFunciones.getid_rubro_emplea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRubroEstructura()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRubroEstructura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRubroEstructura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRubroEstructura()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRubroEstructura()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameRubroEmpleasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRubroEstructura(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRubroEstructura()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura!=null && this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura!=null && this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura!=null && this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura!=null && this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public RubroEstructuraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RubroEstructuraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RubroEstructuraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.rubroestructuraSessionBean=new RubroEstructuraSessionBean(); 
		this.rubroestructuraConstantesFunciones=new RubroEstructuraConstantesFunciones(); 
		this.rubroestructuraBean=new RubroEstructura();//(this.rubroestructuraConstantesFunciones); 		
		this.rubroestructuraReturnGeneral=new RubroEstructuraParameterReturnGeneral(); 
		
		this.rubroestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RubroEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RubroEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RubroEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRubroEstructura(true);
			
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
			
			this.rubroestructuraConstantesFunciones=new RubroEstructuraConstantesFunciones(); 
			this.rubroestructuraBean=new RubroEstructura();//this.rubroestructuraConstantesFunciones); 			
			this.rubroestructuraReturnGeneral=new RubroEstructuraParameterReturnGeneral(); 
		
			RubroEstructuraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rubro Estructura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.rubroestructura=new RubroEstructura();
			this.rubroestructuras = new ArrayList<RubroEstructura>();
			this.rubroestructurasAux = new ArrayList<RubroEstructura>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic=new RubroEstructuraLogic();
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}
			
			//this.rubroestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.rubroestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRubroEstructura);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRubroEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRubroEstructura);	
					}
					
					if(this.jInternalFrameImportacionRubroEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRubroEstructura);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRubroEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRubroEstructura);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRubroEstructura);
				this.jInternalFrameDetalleFormRubroEstructura.setVisible(false);
				this.jInternalFrameDetalleFormRubroEstructura.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRubroEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRubroEstructura);
					this.jInternalFrameReporteDinamicoRubroEstructura.setVisible(false);
					this.jInternalFrameReporteDinamicoRubroEstructura.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRubroEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRubroEstructura);
					this.jInternalFrameImportacionRubroEstructura.setVisible(false);
					this.jInternalFrameImportacionRubroEstructura.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRubroEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRubroEstructura);
					this.jInternalFrameOrderByRubroEstructura.setVisible(false);
					this.jInternalFrameOrderByRubroEstructura.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRubroEstructuraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RubroEstructuraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.rubroestructuraReturnGeneral=new RubroEstructuraParameterReturnGeneral();
			
			this.rubroestructuraParameterGeneral=new RubroEstructuraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.rubroestructuraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RubroEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RubroEstructuraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rubroestructuraSessionBean.getEsGuardarRelacionado(),this.rubroestructuraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RubroEstructuraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rubroestructuraSessionBean.getEsGuardarRelacionado(),this.rubroestructuraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRubroEstructura=false;
			this.isVisibilidadCeldaDuplicarRubroEstructura=true;
			this.isVisibilidadCeldaCopiarRubroEstructura=true;
			this.isVisibilidadCeldaVerFormRubroEstructura=true;
			this.isVisibilidadCeldaOrdenRubroEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=false;
			this.isVisibilidadCeldaModificarRubroEstructura=false;
			this.isVisibilidadCeldaActualizarRubroEstructura=false;
			this.isVisibilidadCeldaEliminarRubroEstructura=false;
			this.isVisibilidadCeldaCancelarRubroEstructura=false;
			this.isVisibilidadCeldaGuardarRubroEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdRubroEmplea=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRubroEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRubroEstructura();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRubroEstructura(false);
			
			this.setPermisosUsuarioRubroEstructura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado() 
				|| (this.rubroestructuraSessionBean.getEsGuardarRelacionado() && this.rubroestructuraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRubroEstructuraClasesRelacionadas();
			}
			
			if(this.rubroestructuraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRubroEstructuraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRubroEstructura();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRubroEstructura();
			}
			
			if(!this.isPermisoBusquedaRubroEstructura) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRubroEstructura.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRubroEstructura,this.isPermisoPaginacionMedioRubroEstructura,this.isPermisoPaginacionTodoRubroEstructura);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RubroEstructuraConstantesFunciones.getTiposSeleccionarRubroEstructura());
				
				this.tiposColumnasSelect=RubroEstructuraConstantesFunciones.getTiposSeleccionarRubroEstructura(true);
				
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
			//if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRubroEstructura();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioRubroEstructura(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioRubroEstructura(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRubroEstructura() ;
			
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
			this.estructuraLogic=new EstructuraLogic();
			this.rubroempleaLogic=new RubroEmpleaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				rubroestructuraImplementable= (RubroEstructuraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RubroEstructuraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				rubroestructuraImplementableHome= (RubroEstructuraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RubroEstructuraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.rubroestructuras= new ArrayList<RubroEstructura>();
			this.rubroestructurasEliminados= new ArrayList<RubroEstructura>();
						
			this.isEsNuevoRubroEstructura=false;
			this.esParaAccionDesdeFormularioRubroEstructura=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRubroEstructura(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRubroEstructura();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RubroEstructuraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RubroEstructuraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRubroEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRubroEstructura(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRubroEstructura();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRubroEstructura();
			}
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRubroEstructura.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRubroEstructura.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRubroEstructura.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRubroEstructura(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RubroEstructura: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRubroEstructura() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRubroEstructura")) {
				iIndex=this.jInternalFrameDetalleFormRubroEstructura.jTabbedPaneRelacionesRubroEstructura.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRubroEstructura.jTabbedPaneRelacionesRubroEstructura.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRubroEstructura();	
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
	
	public void cargarCombosForeignKeyRubroEstructura(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRubroEstructura(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRubroEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRubroEstructuraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRubroEstructura();
		
		this.cargarCombosFrameForeignKeyRubroEstructura();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRubroEstructura();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRubroEstructura();
		}
	}
	
	

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyRubroEmplea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRubroEmplea(this.rubroempleasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRubroEstructuraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.rubroestructuraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
			
			if(jTableDatosRubroEstructura.getRowCount()>=1) {
				jTableDatosRubroEstructura.removeRowSelectionInterval(0, jTableDatosRubroEstructura.getRowCount()-1);						
			}
			
			this.isEsNuevoRubroEstructura=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRubroEstructura(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRubroEstructura(true);			
			//this.rubroestructura=new RubroEstructura();
			//this.rubroestructura.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubroEstructura(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEstructura() ;
			
			if(RubroEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubroEstructura(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.rubroestructura);	
			this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);				
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
			if(this.rubroestructuraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RubroEstructura: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRubroEstructuraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRubroEstructura.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRubroEstructura.getSelectedRows().length;			
			}
			
			rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRubroEstructura--;			
				//RubroEstructura rubroestructuraAux= new RubroEstructura();			
				//rubroestructuraAux.setId(this.iIdNuevoRubroEstructura);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RubroEstructura rubroestructuraOrigen=new RubroEstructura();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RubroEstructura rubroestructuraOrigen : rubroestructurasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							rubroestructuraOrigen =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroestructuraOrigen =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRubroEstructura();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.rubroestructura.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRubroEstructura(rubroestructuraOrigen,this.rubroestructura,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rubroestructuraLogic.getRubroEstructuras().add(this.rubroestructuraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rubroestructuras.add(this.rubroestructuraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRubroEstructura(false);
				
				this.jTableDatosRubroEstructura.setRowSelectionInterval(this.getIndiceNuevoRubroEstructura(), this.getIndiceNuevoRubroEstructura());
				
				int iLastRow =  this.jTableDatosRubroEstructura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRubroEstructura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRubroEstructura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRubroEstructura(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();									
		
			RubroEstructura rubroestructuraOrigen=new RubroEstructura();
			RubroEstructura rubroestructuraDestino=new RubroEstructura();
				
			rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRubroEstructura.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || rubroestructurasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRubroEstructura.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructuraOrigen =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rubroestructuraOrigen =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroestructuraDestino =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rubroestructuraDestino =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				rubroestructuraOrigen =rubroestructurasSeleccionados.get(0);
				rubroestructuraDestino =rubroestructurasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRubroEstructura(rubroestructuraOrigen,rubroestructuraDestino,true,false);
				
				rubroestructuraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rubroestructuraDestino,rubroestructuraLogic.getRubroEstructuras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroestructuraDestino,rubroestructuras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRubroEstructura(false);
				
				//this.jTableDatosRubroEstructura.setRowSelectionInterval(this.getIndiceNuevoRubroEstructura(), this.getIndiceNuevoRubroEstructura());
				
				int iLastRow =  this.jTableDatosRubroEstructura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRubroEstructura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRubroEstructura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRubroEstructura(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRubroEstructura.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRubroEstructura.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRubroEstructura.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRubroEstructura.setVisible(!isVisible);
			this.jPanelPaginacionRubroEstructura.setVisible(!isVisible);
			this.jPanelAccionesRubroEstructura.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRubroEstructura();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRubroEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRubroEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRubroEstructura();
			
			this.abrirFrameOrderByRubroEstructura();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRubroEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRubroEstructura(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRubroEstructura);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRubroEstructura.isMaximum()) {
					this.jInternalFrameDetalleFormRubroEstructura.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRubroEstructura.setSize(this.jInternalFrameDetalleFormRubroEstructura.iWidthFormulario,this.jInternalFrameDetalleFormRubroEstructura.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRubroEstructura.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRubroEstructura.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRubroEstructura.isMaximum()) {
						this.jInternalFrameDetalleFormRubroEstructura.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRubroEstructura.jContentPaneDetalleRubroEstructura.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRubroEstructura.jTabbedPaneRelacionesRubroEstructura.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRubroEstructura.jContentPaneDetalleRubroEstructura.getWidth(),RubroEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRubroEstructura.jTabbedPaneRelacionesRubroEstructura.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRubroEstructura.jContentPaneDetalleRubroEstructura.getWidth(),RubroEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRubroEstructura.jTabbedPaneRelacionesRubroEstructura.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRubroEstructura.jContentPaneDetalleRubroEstructura.getWidth(),RubroEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRubroEstructura.setVisible(true);
	        this.jInternalFrameDetalleFormRubroEstructura.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRubroEstructura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRubroEstructura==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRubroEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEstructura,false,this);
				} else {
					this.jInternalFrameOrderByRubroEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEstructura,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRubroEstructura);
				this.jInternalFrameOrderByRubroEstructura.setVisible(false);
				this.jInternalFrameOrderByRubroEstructura.setSelected(false);
				
				this.jInternalFrameOrderByRubroEstructura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRubroEstructura"));
				
				this.inicializarActualizarBindingTablaOrderByRubroEstructura();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRubroEstructura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRubroEstructura==null) {
				
				this.jInternalFrameImportacionRubroEstructura=new ImportacionJInternalFrame(RubroEstructuraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRubroEstructura);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRubroEstructura);
				this.jInternalFrameImportacionRubroEstructura.setVisible(false);
				this.jInternalFrameImportacionRubroEstructura.setSelected(false);


				this.jInternalFrameImportacionRubroEstructura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRubroEstructura"));
				this.jInternalFrameImportacionRubroEstructura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRubroEstructura"));
				this.jInternalFrameImportacionRubroEstructura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRubroEstructura"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRubroEstructura() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRubroEstructura==null) {
				this.jInternalFrameReporteDinamicoRubroEstructura=new ReporteDinamicoJInternalFrame(RubroEstructuraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRubroEstructura);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRubroEstructura);
				this.jInternalFrameReporteDinamicoRubroEstructura.setVisible(false);
				this.jInternalFrameReporteDinamicoRubroEstructura.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRubroEstructura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubroEstructura"));
				this.jInternalFrameReporteDinamicoRubroEstructura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubroEstructura"));
				this.jInternalFrameReporteDinamicoRubroEstructura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubroEstructura"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubroEstructura();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRubroEstructura() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRubroEstructura);
			
	       	this.jInternalFrameDetalleFormRubroEstructura.setVisible(false);
	        this.jInternalFrameDetalleFormRubroEstructura.setSelected(false);
			
			//this.jInternalFrameDetalleFormRubroEstructura.dispose();
			//this.jInternalFrameDetalleFormRubroEstructura=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRubroEstructura() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRubroEstructura.setVisible(true);
	        this.jInternalFrameReporteDinamicoRubroEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRubroEstructura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRubroEstructura.setVisible(true);
	        this.jInternalFrameImportacionRubroEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRubroEstructura() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRubroEstructura.setVisible(true);
	        this.jInternalFrameOrderByRubroEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRubroEstructura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRubroEstructura.setVisible(false);
	        this.jInternalFrameOrderByRubroEstructura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRubroEstructura() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRubroEstructura.setVisible(false);
	        this.jInternalFrameReporteDinamicoRubroEstructura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRubroEstructura() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRubroEstructura.setVisible(false);
	        this.jInternalFrameImportacionRubroEstructura.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeEstructura(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="Estructura";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderRubroEstructura=(TitledBorder)this.jScrollPanelDatosRubroEstructura.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderRubroEstructura.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructura(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeEstructura);
						jInternalFrameTreeEstructura.setVisible(false);
						jInternalFrameTreeEstructura.setSelected(false);
						//jInternalFrameTreeEstructura.dispose();
						//jInternalFrameTreeEstructura=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRubroEstructura(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRubroEstructura(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRubroEstructura(true);
			//this.isEsNuevoRubroEstructura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRubroEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubroEstructura(false) ;
			
			if(rubroestructuraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RubroEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubroEstructura(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEstructura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRubroEstructuraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRubroEstructura(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRubroEstructura(true);
			//this.isEsNuevoRubroEstructura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.rubroestructura.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRubroEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRubroEstructura(false) ;
			
			if(RubroEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubroEstructura(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEstructura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosRubroEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRubroEstructura.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaRubroEmplea(List<RubroEmplea> rubroempleasForeignKey)throws Exception{
		TableColumn tableColumnRubroEmplea=this.jTableDatosRubroEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA));
		TableCellEditor tableCellEditorRubroEmplea =tableColumnRubroEmplea.getCellEditor();

		RubroEmpleaTableCell rubroempleaTableCellFk=(RubroEmpleaTableCell)tableCellEditorRubroEmplea;

		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.setrubroempleasForeignKey(rubroempleasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRubroEstructura.getSelectedRow();

		//if(intSelectedRow<=0) {
			//rubroempleaTableCellFk.setRowActual(intSelectedRow);
			//rubroempleaTableCellFk.setrubroempleasForeignKeyActual(rubroempleasForeignKey);
		//}


		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.RecargarRubroEmpleasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRubroEstructura(false);
			
			//if(!this.isEsNuevoRubroEstructura) {								
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
				
			}
			
			if(this.permiteMantenimiento(this.rubroestructura)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRubroEstructura=true;
					this.inicializarActualizarBindingTablaRubroEstructura(false);
					this.isEsNuevoRubroEstructura=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRubroEstructura=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRubroEstructura=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRubroEstructura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubroEstructura(false);
				
				this.habilitarDeshabilitarControlesRubroEstructura(false);
			
												
				
				if(RubroEstructuraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRubroEstructura();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRubroEstructuraActionPerformed(evt,rubroestructuraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRubroEstructura(this.rubroestructura,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRubroEstructura.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,rubroestructuraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.rubroestructura.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				this.rubroestructura.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				this.rubroestructura.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.rubroestructura)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RubroEstructuraModel) this.jTableDatosRubroEstructura.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRubroEstructura=true;
				this.inicializarActualizarBindingTablaRubroEstructura(false);
				this.isEsNuevoRubroEstructura=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRubroEstructura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubroEstructura(false);
				
				this.habilitarDeshabilitarControlesRubroEstructura(false);
				
				
				
				if(RubroEstructuraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRubroEstructura();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRubroEstructura.getRowCount()>=1) {
				jTableDatosRubroEstructura.removeRowSelectionInterval(0, jTableDatosRubroEstructura.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRubroEstructura(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRubroEstructura(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubroEstructura(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEstructura(false) ;
			
			this.isEsNuevoRubroEstructura=false;
			
			if(RubroEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRubroEstructura();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRubroEstructura(false);
				
				//SI ES MANUAL
				if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRubroEstructura();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRubroEstructura--;			
			//RubroEstructura rubroestructuraAux= new RubroEstructura();			
			//rubroestructuraAux.setId(this.iIdNuevoRubroEstructura);
			
			if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRubroEstructura();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
			
			this.rubroestructura.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.rubroestructuraLogic.getRubroEstructuras().add(this.rubroestructuraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.rubroestructuras.add(this.rubroestructuraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRubroEstructura(false);
			
			this.jTableDatosRubroEstructura.setRowSelectionInterval(this.getIndiceNuevoRubroEstructura(), this.getIndiceNuevoRubroEstructura());
			
			int iLastRow =  this.jTableDatosRubroEstructura.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRubroEstructura.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRubroEstructura.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRubroEstructura(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRubroEstructura(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEstructura(false);
			
			//SI ES MANUAL
			if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubroEstructura();
			}
			
			//this.abrirFrameTreeRubroEstructura();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Rubro EstructuraS ?", "MANTENIMIENTO DE Rubro Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRubroEstructura.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRubroEstructura();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.rubroestructuraReturnGeneral=rubroestructuraLogic.procesarImportacionRubroEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.rubroestructuraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRubroEstructuraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRubroEstructura.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRubroEstructura.setFileImportacion(this.jInternalFrameImportacionRubroEstructura.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRubroEstructura.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRubroEstructura.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRubroEstructura.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRubroEstructura.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();		

		rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RubroEstructuraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RubroEstructuraBaseDesign.jrxml";
			
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
			
			this.generarReporteRubroEstructuras("Todos",rubroestructurasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RubroEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoRubroEstructura.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoria="id_rubro_emplea";
					break;

				case RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoriaValor="id_rubro_emplea";
					break;

				case RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_rubro_emplea");
					break;

				case RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();		
		
		rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroestructura";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RubroEstructuras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RubroEstructura rubroestructura:rubroestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroestructura.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(RubroEstructura rubroestructura:rubroestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroestructura.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(RubroEstructura rubroestructura:rubroestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroestructura.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA);
					iRow++;

					for(RubroEstructura rubroestructura:rubroestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroestructura.getrubroemplea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(RubroEstructura rubroestructura:rubroestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroestructura.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelRubroEstructura(row);				
			//	iRow++;
			//}				
			
			//for(RubroEstructura rubroestructuraAux:rubroestructurasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRubroEstructura(rubroestructuraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Estructura",JOptionPane.INFORMATION_MESSAGE);
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
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEstructura(false);
			
			//SI ES MANUAL
			if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubroEstructura();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEstructura(false);
			
			//SI ES MANUAL
			if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRubroEstructura();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEstructura(false);
			
			//SI ES MANUAL
			if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRubroEstructura();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRubroEstructura() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRubroEstructura.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRubroEstructura.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRubroEstructura.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRubroEstructura.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRubroEstructura.setMinimumSize(dimensionMinimum);
		this.jTableDatosRubroEstructura.setMaximumSize(dimensionMaximum);
		this.jTableDatosRubroEstructura.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRubroEstructura(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRubroEstructura(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRubroEstructura(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRubroEstructura(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRubroEstructura(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRubroEstructura(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRubroEstructura(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRubroEstructura(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRubroEstructura() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRubroEstructura();
		
		this.inicializarActualizarBindingBotonesManualRubroEstructura(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRubroEstructura();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRubroEstructura() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRubroEstructura(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRubroEstructura(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRubroEstructura.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRubroEstructura.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRubroEstructura.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxPostAccionNuevoRubroEstructura.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxPostAccionSinCerrarRubroEstructura.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxPostAccionSinMensajeRubroEstructura.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRubroEstructura.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRubroEstructura.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRubroEstructura.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
				this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxPostAccionNuevoRubroEstructura.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxPostAccionSinCerrarRubroEstructura.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxPostAccionSinMensajeRubroEstructura.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRubroEstructura.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRubroEstructura.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRubroEstructura.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRubroEstructura!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRubroEstructura.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRubroEstructura.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRubroEstructura.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRubroEstructura.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRubroEstructura!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRubroEstructura.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRubroEstructura.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRubroEstructura(Boolean esInicializar) throws Exception {
		try	{	
			if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRubroEstructura(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRubroEstructura() throws Exception {
		try	{
			if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRubroEstructura();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRubroEstructura() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRubroEstructura() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRubroEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRubroEstructura.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRubroEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRubroEstructura.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRubroEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRubroEstructura.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRubroEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRubroEstructura.addItem(reporte);
			}
			
			
			if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRubroEstructura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRubroEstructura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRubroEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRubroEstructura.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRubroEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRubroEstructura.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRubroEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRubroEstructura.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRubroEstructura.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubroEstructura();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubroEstructura() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRubroEstructura!=null) {
				this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRubroEstructura!=null) {
				this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRubroEstructura.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRubroEstructura!=null) {
				
				if(this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRubroEstructura.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRubroEstructura.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRubroEstructura.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRubroEstructura.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRubroEstructura()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraRubroEstructura.getSelectedItem()).getId();}
		if(this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.getSelectedItem()!=null){this.id_rubro_empleaFK_IdRubroEmplea=((RubroEmplea)this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEstructura.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRubroEstructura(Boolean esInicializar) throws Exception {				
		if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRubroEstructura();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRubroEstructura() throws Exception {
		this.inicializarActualizarBindingTablaRubroEstructura(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRubroEstructura() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RubroEstructuraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RubroEstructuraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRubroEstructuraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructuraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RubroEstructuraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RubroEstructuraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRubroEstructura(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=rubroestructuraLogic.getRubroEstructuras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=rubroestructuras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRubroEstructura.setModel(new RubroEstructuraModel(this.rubroestructuraLogic.getRubroEstructuras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRubroEstructura.setModel(new RubroEstructuraModel(this.rubroestructuras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRubroEstructura!=null && this.jInternalFrameOrderByRubroEstructura.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRubroEstructura();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRubroEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RubroEstructuraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO,rubroestructuraConstantesFunciones.resaltarSeleccionarRubroEstructura,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO,rubroestructuraConstantesFunciones.resaltarSeleccionarRubroEstructura,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRubroEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,RubroEstructuraConstantesFunciones.LABEL_ID));

		if(this.rubroestructuraConstantesFunciones.mostraridRubroEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEstructuraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rubroestructuraConstantesFunciones.resaltaridRubroEstructura,this.rubroestructuraConstantesFunciones.activaridRubroEstructura,this,true,"idRubroEstructura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rubroestructuraConstantesFunciones.resaltaridRubroEstructura,this.rubroestructuraConstantesFunciones.activaridRubroEstructura,this,true,"idRubroEstructura","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.rubroestructuraConstantesFunciones.mostrarid_empresaRubroEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.rubroestructuraConstantesFunciones.resaltarid_empresaRubroEstructura,this,this.rubroestructuraConstantesFunciones.activarid_empresaRubroEstructura));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.rubroestructuraConstantesFunciones.resaltarid_empresaRubroEstructura,this,this.rubroestructuraConstantesFunciones.activarid_empresaRubroEstructura,false,"id_empresaRubroEstructura","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.rubroestructuraConstantesFunciones.mostrarid_sucursalRubroEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.rubroestructuraConstantesFunciones.resaltarid_sucursalRubroEstructura,this,this.rubroestructuraConstantesFunciones.activarid_sucursalRubroEstructura));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.rubroestructuraConstantesFunciones.resaltarid_sucursalRubroEstructura,this,this.rubroestructuraConstantesFunciones.activarid_sucursalRubroEstructura,false,"id_sucursalRubroEstructura","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.rubroestructuraConstantesFunciones.mostrarid_estructuraRubroEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.rubroestructuraConstantesFunciones.resaltarid_estructuraRubroEstructura,this,this.rubroestructuraConstantesFunciones.activarid_estructuraRubroEstructura));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.rubroestructuraConstantesFunciones.resaltarid_estructuraRubroEstructura,this,this.rubroestructuraConstantesFunciones.activarid_estructuraRubroEstructura,true,"id_estructuraRubroEstructura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA));

		if(this.rubroestructuraConstantesFunciones.mostrarid_rubro_empleaRubroEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.rubroestructuraConstantesFunciones.resaltarid_rubro_empleaRubroEstructura,this,this.rubroestructuraConstantesFunciones.activarid_rubro_empleaRubroEstructura));
			tableColumn.setCellEditor(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.rubroestructuraConstantesFunciones.resaltarid_rubro_empleaRubroEstructura,this,this.rubroestructuraConstantesFunciones.activarid_rubro_empleaRubroEstructura,true,"id_rubro_empleaRubroEstructura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.rubroestructuraConstantesFunciones.mostraresta_activoRubroEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.rubroestructuraConstantesFunciones.resaltaresta_activoRubroEstructura,this.rubroestructuraConstantesFunciones.activaresta_activoRubroEstructura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.rubroestructuraConstantesFunciones.resaltaresta_activoRubroEstructura,this.rubroestructuraConstantesFunciones.activaresta_activoRubroEstructura,this,true,"esta_activoRubroEstructura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RubroEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rubroestructuraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rubroestructuraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRubroEstructura.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rubroestructuraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rubroestructuraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRubroEstructura.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.rubroestructuraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.rubroestructuraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRubroEstructura.addColumn(tableColumn);
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
			
			this.jTableDatosRubroEstructura.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRubroEstructura.moveColumn(this.jTableDatosRubroEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRubroEstructura.moveColumn(this.jTableDatosRubroEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRubroEstructura.moveColumn(this.jTableDatosRubroEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRubroEstructura.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRubroEstructura.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRubroEstructura,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRubroEstructura.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRubroEstructura.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRubroEstructura.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRubroEstructura.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRubroEstructura.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=rubroestructuraLogic.getRubroEstructuras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=rubroestructuras.size()-1;
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
		//this.jTableDatosRubroEstructura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRubroEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRubroEstructura();
			
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
				
				//this.isEsNuevoRubroEstructura=false;
					
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
				if(this.rubroestructuraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRubroEstructura==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRubroEstructura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRubroEstructura.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.rubroestructura.getsType().equals("DUPLICADO")
				   || this.rubroestructura.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRubroEstructura=true;
				
				} else {
					this.isEsNuevoRubroEstructura=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
					if(this.rubroestructura.getId()>=0 && !this.rubroestructura.getIsNew()) {						
						this.isEsNuevoRubroEstructura=false;
						
					} else {
						this.isEsNuevoRubroEstructura=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRubroEstructura(esRelaciones);						
				
				this.seleccionarRubroEstructura(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.rubroestructura.getId()<0) {
					this.isEsNuevoRubroEstructura=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRubroEstructura(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRubroEstructura(evt,rowIndex);
				}	
				
				if(this.rubroestructuraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RubroEstructura: " + this.dDif); 
					}
				}								
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRubroEstructura(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.rubroestructura)) {
					if(this.rubroestructura.getId()>0) {
						this.rubroestructura.setIsDeleted(true);
						
						this.rubroestructurasEliminados.add(this.rubroestructura);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rubroestructuraLogic.getRubroEstructuras().remove(this.rubroestructura);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rubroestructuras.remove(this.rubroestructura);				
					}
					
					
					((RubroEstructuraModel) this.jTableDatosRubroEstructura.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRubroEstructura(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRubroEstructura(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRubroEstructura) {
			
			if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRubroEstructura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRubroEstructura.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRubroEstructura(this.rubroestructura);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.rubroestructuraConstantesFunciones.cargarid_empresaRubroEstructura || this.rubroestructuraConstantesFunciones.event_dependid_empresaRubroEstructura) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.rubroestructura.getid_empresa());
									//this.inicializarActualizarBindingRubroEstructura(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(rubroestructura.getEmpresa()!=null) {
							this.empresasForeignKey.add(rubroestructura.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.rubroestructura.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.rubroestructuraConstantesFunciones.cargarid_sucursalRubroEstructura || this.rubroestructuraConstantesFunciones.event_dependid_sucursalRubroEstructura) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.rubroestructura.getid_sucursal());
									//this.inicializarActualizarBindingRubroEstructura(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(rubroestructura.getSucursal()!=null) {
							this.sucursalsForeignKey.add(rubroestructura.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.rubroestructura.getid_sucursal(),false,"Formulario");

					//Estructura
					if(!this.rubroestructuraConstantesFunciones.cargarid_estructuraRubroEstructura || this.rubroestructuraConstantesFunciones.event_dependid_estructuraRubroEstructura) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.rubroestructura.getid_estructura());
									//this.inicializarActualizarBindingRubroEstructura(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(rubroestructura.getEstructura()!=null) {
							this.estructurasForeignKey.add(rubroestructura.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.rubroestructura.getid_estructura(),false,"Formulario");

					//RubroEmplea
					if(!this.rubroestructuraConstantesFunciones.cargarid_rubro_empleaRubroEstructura || this.rubroestructuraConstantesFunciones.event_dependid_rubro_empleaRubroEstructura) {
						//this.cargarCombosRubroEmpleasForeignKeyLista(" where id="+this.rubroestructura.getid_rubro_emplea());
									//this.inicializarActualizarBindingRubroEstructura(false,false);
						this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

						if(rubroestructura.getRubroEmplea()!=null) {
							this.rubroempleasForeignKey.add(rubroestructura.getRubroEmplea());
						}

						this.addItemDefectoCombosForeignKeyRubroEmplea();
						this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
					}
					this.setActualRubroEmpleaForeignKey(this.rubroestructura.getid_rubro_emplea(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRubroEstructura("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRubroEstructura(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubroEstructura() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRubroEstructura(RubroEstructura rubroestructura) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRubroEstructura(rubroestructura,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRubroEstructura(RubroEstructura rubroestructura,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRubroEstructura(rubroestructura);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRubroEstructura(rubroestructura,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRubroEstructura(rubroestructura);
	}
	
	public void setVariablesObjetoActualToFormularioRubroEstructura(RubroEstructura rubroestructura) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.setText(rubroestructura.getId().toString());
			this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxesta_activoRubroEstructura.setSelected(rubroestructura.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RubroEstructura rubroestructuraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,rubroestructuraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RubroEstructura rubroestructuraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				rubroestructuraLocal=this.rubroestructura;
			} else {
				rubroestructuraLocal=this.rubroestructuraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(rubroestructuraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRubroEstructura(rubroestructuraLocal,true);
					
					if(rubroestructuraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(rubroestructuraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(rubroestructuraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRubroEstructura(RubroEstructura rubroestructura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRubroEstructura(rubroestructura,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(rubroestructura);
	}
	
	public void setVariablesFormularioToObjetoActualRubroEstructura(RubroEstructura rubroestructura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRubroEstructura(rubroestructura,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRubroEstructura(RubroEstructura rubroestructura,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.getText()==null || this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.getText()=="" || this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.getText()=="Id") {
				this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.setText("0");
			}

			if(conColumnasBase) {rubroestructura.setId(Long.parseLong(this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubroEstructuraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEstructura.jLabelIdRubroEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rubroestructura.setesta_activo(this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxesta_activoRubroEstructura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEstructura.jLabelesta_activoRubroEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRubroEstructura(RubroEstructura rubroestructuraBean,RubroEstructura rubroestructura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && rubroestructuraBean.getid_estructura()!=null && !rubroestructuraBean.getid_estructura().equals(-1L))) {rubroestructura.setid_estructura(rubroestructuraBean.getid_estructura());}
			if(conDefault || (!conDefault && rubroestructuraBean.getid_rubro_emplea()!=null && !rubroestructuraBean.getid_rubro_emplea().equals(-1L))) {rubroestructura.setid_rubro_emplea(rubroestructuraBean.getid_rubro_emplea());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRubroEstructura(RubroEstructura rubroestructuraOrigen,RubroEstructura rubroestructura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rubroestructuraOrigen.getId()!=null && !rubroestructuraOrigen.getId().equals(0L))) {rubroestructura.setId(rubroestructuraOrigen.getId());}}
			if(conDefault || (!conDefault && rubroestructuraOrigen.getid_estructura()!=null && !rubroestructuraOrigen.getid_estructura().equals(-1L))) {rubroestructura.setid_estructura(rubroestructuraOrigen.getid_estructura());}
			if(conDefault || (!conDefault && rubroestructuraOrigen.getid_rubro_emplea()!=null && !rubroestructuraOrigen.getid_rubro_emplea().equals(-1L))) {rubroestructura.setid_rubro_emplea(rubroestructuraOrigen.getid_rubro_emplea());}
			if(conDefault || (!conDefault && rubroestructuraOrigen.getesta_activo()!=null && !rubroestructuraOrigen.getesta_activo().equals(false))) {rubroestructura.setesta_activo(rubroestructuraOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRubroEstructura(RubroEstructura rubroestructura) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.setText(rubroestructura.getId().toString());
			this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxesta_activoRubroEstructura.setSelected(rubroestructura.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRubroEstructura(RubroEstructuraBean rubroestructuraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.setText(rubroestructuraBean.getId().toString());
			this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxesta_activoRubroEstructura.setSelected(rubroestructuraBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRubroEstructura(RubroEstructuraParameterReturnGeneral rubroestructuraReturnGeneral,RubroEstructuraBean rubroestructuraBean,Boolean conDefault) throws Exception { 
		try {
			RubroEstructura rubroestructuraLocal=new RubroEstructura();
			
			rubroestructuraLocal=rubroestructuraReturnGeneral.getRubroEstructura();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rubroestructuraLocal.getId()!=null && !rubroestructuraLocal.getId().equals(0L))) {rubroestructuraBean.setId(rubroestructuraLocal.getId());}}
			if(conDefault || (!conDefault && rubroestructuraLocal.getid_estructura()!=null && !rubroestructuraLocal.getid_estructura().equals(-1L))) {rubroestructuraBean.setid_estructura(rubroestructuraLocal.getid_estructura());}
			if(conDefault || (!conDefault && rubroestructuraLocal.getid_rubro_emplea()!=null && !rubroestructuraLocal.getid_rubro_emplea().equals(-1L))) {rubroestructuraBean.setid_rubro_emplea(rubroestructuraLocal.getid_rubro_emplea());}
			if(conDefault || (!conDefault && rubroestructuraLocal.getesta_activo()!=null && !rubroestructuraLocal.getesta_activo().equals(false))) {rubroestructuraBean.setesta_activo(rubroestructuraLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRubroEstructuraGenerico(Long idRubroEstructuraSeleccionado,JComboBox jComboBoxRubroEstructura,List<RubroEstructura> rubroestructurasLocal)throws Exception {
		try {
			RubroEstructura  rubroestructuraTemp=null;

			for(RubroEstructura rubroestructuraAux:rubroestructurasLocal) {
				if(rubroestructuraAux.getId()!=null && rubroestructuraAux.getId().equals(idRubroEstructuraSeleccionado)) {
					rubroestructuraTemp=rubroestructuraAux;
					break;
				}
			}

			jComboBoxRubroEstructura.setSelectedItem(rubroestructuraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRubroEstructuraGenerico(JComboBox jComboBoxRubroEstructura,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRubroEstructura.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRubroEstructura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRubroEstructura.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRubroEstructura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubroestructura=(RubroEstructura) rubroestructuraLogic.getRubroEstructuras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rubroestructura =(RubroEstructura) rubroestructuras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!rubroestructura.getIsNew() && !rubroestructura.getIsChanged() && !rubroestructura.getIsDeleted()) {
				sDescripcion=rubroestructura.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=rubroestructura.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!rubroestructura.getIsNew() && !rubroestructura.getIsChanged() && !rubroestructura.getIsDeleted()) {
				sDescripcion=rubroestructura.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=rubroestructura.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!rubroestructura.getIsNew() && !rubroestructura.getIsChanged() && !rubroestructura.getIsDeleted()) {
				sDescripcion=rubroestructura.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=rubroestructura.getestructura_descripcion();
			}
		}

		if(sTipo.equals("RubroEmplea")) {
			//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
			if(!rubroestructura.getIsNew() && !rubroestructura.getIsChanged() && !rubroestructura.getIsDeleted()) {
				sDescripcion=rubroestructura.getrubroemplea_descripcion();
			} else {
				//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
				sDescripcion=rubroestructura.getrubroemplea_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RubroEstructura rubroestructuraRow=new RubroEstructura();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubroestructuraRow=(RubroEstructura) rubroestructuraLogic.getRubroEstructuras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rubroestructuraRow=(RubroEstructura) rubroestructuras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRubroEstructura(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRubroEstructura.setVisible((this.isVisibilidadCeldaNuevoRubroEstructura && this.isPermisoNuevoRubroEstructura));			
			this.jButtonDuplicarRubroEstructura.setVisible((this.isVisibilidadCeldaDuplicarRubroEstructura && this.isPermisoDuplicarRubroEstructura));			
			this.jButtonCopiarRubroEstructura.setVisible((this.isVisibilidadCeldaCopiarRubroEstructura && this.isPermisoCopiarRubroEstructura));
			this.jButtonVerFormRubroEstructura.setVisible((this.isVisibilidadCeldaVerFormRubroEstructura && this.isPermisoVerFormRubroEstructura));
			
			this.jButtonAbrirOrderByRubroEstructura.setVisible((this.isVisibilidadCeldaOrdenRubroEstructura && this.isPermisoOrdenRubroEstructura));			
			
			this.jButtonNuevoRelacionesRubroEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubroEstructura && this.isPermisoNuevoRubroEstructura));			
			this.jButtonNuevoGuardarCambiosRubroEstructura.setVisible((this.isVisibilidadCeldaNuevoRubroEstructura && this.isPermisoNuevoRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura));
			
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonModificarRubroEstructura.setVisible((this.isVisibilidadCeldaModificarRubroEstructura && this.isPermisoActualizarRubroEstructura));	
			this.jInternalFrameDetalleFormRubroEstructura.jButtonActualizarRubroEstructura.setVisible((this.isVisibilidadCeldaActualizarRubroEstructura && this.isPermisoActualizarRubroEstructura));	
			this.jInternalFrameDetalleFormRubroEstructura.jButtonEliminarRubroEstructura.setVisible((this.isVisibilidadCeldaEliminarRubroEstructura && this.isPermisoEliminarRubroEstructura));
			this.jInternalFrameDetalleFormRubroEstructura.jButtonCancelarRubroEstructura.setVisible(this.isVisibilidadCeldaCancelarRubroEstructura);							
			this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosRubroEstructura.setVisible((this.isVisibilidadCeldaGuardarRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura));			
			
			}
						
			this.jButtonGuardarCambiosTablaRubroEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaNuevoRubroEstructura && this.isPermisoNuevoRubroEstructura));						
			this.jButtonDuplicarToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaDuplicarRubroEstructura && this.isPermisoDuplicarRubroEstructura));						
			this.jButtonCopiarToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaCopiarRubroEstructura && this.isPermisoCopiarRubroEstructura));			
			this.jButtonVerFormToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaVerFormRubroEstructura && this.isPermisoVerFormRubroEstructura));			
			this.jButtonAbrirOrderByToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaOrdenRubroEstructura && this.isPermisoOrdenRubroEstructura));
			this.jButtonNuevoRelacionesToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubroEstructura && this.isPermisoNuevoRubroEstructura));			
			this.jButtonNuevoGuardarCambiosToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaNuevoRubroEstructura && this.isPermisoNuevoRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura));			
			
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonModificarToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaModificarRubroEstructura && this.isPermisoActualizarRubroEstructura));	
			this.jInternalFrameDetalleFormRubroEstructura.jButtonActualizarToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaActualizarRubroEstructura  && this.isPermisoActualizarRubroEstructura));	
			this.jInternalFrameDetalleFormRubroEstructura.jButtonEliminarToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaEliminarRubroEstructura && this.isPermisoEliminarRubroEstructura));
			this.jInternalFrameDetalleFormRubroEstructura.jButtonCancelarToolBarRubroEstructura.setVisible(this.isVisibilidadCeldaCancelarRubroEstructura);				
			this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaGuardarRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRubroEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRubroEstructura.setVisible((this.isVisibilidadCeldaNuevoRubroEstructura && this.isPermisoNuevoRubroEstructura));			
			this.jMenuItemDuplicarRubroEstructura.setVisible((this.isVisibilidadCeldaDuplicarRubroEstructura && this.isPermisoDuplicarRubroEstructura));			
			this.jMenuItemCopiarRubroEstructura.setVisible((this.isVisibilidadCeldaCopiarRubroEstructura && this.isPermisoCopiarRubroEstructura));			
			this.jMenuItemVerFormRubroEstructura.setVisible((this.isVisibilidadCeldaVerFormRubroEstructura && this.isPermisoVerFormRubroEstructura));			
			this.jMenuItemAbrirOrderByRubroEstructura.setVisible((this.isVisibilidadCeldaOrdenRubroEstructura && this.isPermisoOrdenRubroEstructura));			
			//this.jMenuItemMostrarOcultarRubroEstructura.setVisible((this.isVisibilidadCeldaOrdenRubroEstructura && this.isPermisoOrdenRubroEstructura));
			this.jMenuItemDetalleAbrirOrderByRubroEstructura.setVisible((this.isVisibilidadCeldaOrdenRubroEstructura && this.isPermisoOrdenRubroEstructura));			
			//this.jMenuItemDetalleMostrarOcultarRubroEstructura.setVisible((this.isVisibilidadCeldaOrdenRubroEstructura && this.isPermisoOrdenRubroEstructura));			
			this.jMenuItemNuevoRelacionesRubroEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubroEstructura && this.isPermisoNuevoRubroEstructura));			
			this.jMenuItemNuevoGuardarCambiosRubroEstructura.setVisible((this.isVisibilidadCeldaNuevoRubroEstructura && this.isPermisoNuevoRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura));									
			
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			this.jInternalFrameDetalleFormRubroEstructura.jMenuItemModificarRubroEstructura.setVisible((this.isVisibilidadCeldaModificarRubroEstructura && this.isPermisoActualizarRubroEstructura));	
			this.jInternalFrameDetalleFormRubroEstructura.jMenuItemActualizarRubroEstructura.setVisible((this.isVisibilidadCeldaActualizarRubroEstructura && this.isPermisoActualizarRubroEstructura));	
			this.jInternalFrameDetalleFormRubroEstructura.jMenuItemEliminarRubroEstructura.setVisible((this.isVisibilidadCeldaEliminarRubroEstructura && this.isPermisoEliminarRubroEstructura));
			this.jInternalFrameDetalleFormRubroEstructura.jMenuItemCancelarRubroEstructura.setVisible(this.isVisibilidadCeldaCancelarRubroEstructura);				
			}
			
			this.jMenuItemGuardarCambiosRubroEstructura.setVisible((this.isVisibilidadCeldaGuardarRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura));						
			this.jMenuItemGuardarCambiosTablaRubroEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRubroEstructura=this.jButtonNuevoRubroEstructura.isVisible();
			this.isVisibilidadCeldaDuplicarRubroEstructura=this.jButtonDuplicarRubroEstructura.isVisible();
			this.isVisibilidadCeldaCopiarRubroEstructura=this.jButtonCopiarRubroEstructura.isVisible();
			this.isVisibilidadCeldaVerFormRubroEstructura=this.jButtonVerFormRubroEstructura.isVisible();
			
			this.isVisibilidadCeldaOrdenRubroEstructura=this.jButtonAbrirOrderByRubroEstructura.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=this.jButtonNuevoRelacionesRubroEstructura.isVisible();
			this.isVisibilidadCeldaModificarRubroEstructura=this.jButtonModificarRubroEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			this.isVisibilidadCeldaActualizarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jButtonActualizarRubroEstructura.isVisible();
			this.isVisibilidadCeldaEliminarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jButtonEliminarRubroEstructura.isVisible();
			this.isVisibilidadCeldaCancelarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jButtonCancelarRubroEstructura.isVisible();
			this.isVisibilidadCeldaGuardarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosRubroEstructura.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=this.jButtonGuardarCambiosTablaRubroEstructura.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRubroEstructura=this.jButtonNuevoToolBarRubroEstructura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=this.jButtonNuevoRelacionesToolBarRubroEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			this.isVisibilidadCeldaModificarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jButtonModificarToolBarRubroEstructura.isVisible();
			this.isVisibilidadCeldaActualizarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jButtonActualizarToolBarRubroEstructura.isVisible();
			this.isVisibilidadCeldaEliminarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jButtonEliminarToolBarRubroEstructura.isVisible();
			this.isVisibilidadCeldaCancelarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jButtonCancelarToolBarRubroEstructura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRubroEstructura=this.jButtonGuardarCambiosToolBarRubroEstructura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=this.jButtonGuardarCambiosTablaToolBarRubroEstructura.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRubroEstructura=this.jMenuItemNuevoRubroEstructura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=this.jMenuItemNuevoRelacionesRubroEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			this.isVisibilidadCeldaModificarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jMenuItemModificarRubroEstructura.isVisible();
			this.isVisibilidadCeldaActualizarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jMenuItemActualizarRubroEstructura.isVisible();
			this.isVisibilidadCeldaEliminarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jMenuItemEliminarRubroEstructura.isVisible();
			this.isVisibilidadCeldaCancelarRubroEstructura=this.jInternalFrameDetalleFormRubroEstructura.jMenuItemCancelarRubroEstructura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRubroEstructura=this.jMenuItemGuardarCambiosRubroEstructura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=this.jMenuItemGuardarCambiosTablaRubroEstructura.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRubroEstructura(Boolean esInicializar) {
		if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.rubroestructuraSessionBean.getConGuardarRelaciones()) {
				//if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRubroEstructura();
			}
			
			this.inicializarActualizarBindingBotonesManualRubroEstructura(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRubroEstructura() {
		this.jButtonNuevoRubroEstructura.setVisible(this.isPermisoNuevoRubroEstructura);			
		this.jButtonDuplicarRubroEstructura.setVisible(this.isPermisoDuplicarRubroEstructura);			
		this.jButtonCopiarRubroEstructura.setVisible(this.isPermisoCopiarRubroEstructura);			
		this.jButtonVerFormRubroEstructura.setVisible(this.isPermisoVerFormRubroEstructura);			
		
		this.jButtonAbrirOrderByRubroEstructura.setVisible(this.isPermisoOrdenRubroEstructura);					
		
		this.jButtonNuevoRelacionesRubroEstructura.setVisible(this.isPermisoNuevoRubroEstructura);			
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonModificarRubroEstructura.setVisible(this.isPermisoActualizarRubroEstructura);	
			this.jInternalFrameDetalleFormRubroEstructura.jButtonActualizarRubroEstructura.setVisible(this.isPermisoActualizarRubroEstructura);	
			this.jInternalFrameDetalleFormRubroEstructura.jButtonEliminarRubroEstructura.setVisible(this.isPermisoEliminarRubroEstructura);
			this.jInternalFrameDetalleFormRubroEstructura.jButtonCancelarRubroEstructura.setVisible(this.isVisibilidadCeldaCancelarRubroEstructura);						
			this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosRubroEstructura.setVisible(this.isPermisoGuardarCambiosRubroEstructura);							
		}
		
		this.jButtonGuardarCambiosTablaRubroEstructura.setVisible(this.isPermisoActualizarRubroEstructura);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRubroEstructura() {
		this.jInternalFrameDetalleFormRubroEstructura.jButtonModificarRubroEstructura.setVisible(this.isPermisoActualizarRubroEstructura);	
		this.jInternalFrameDetalleFormRubroEstructura.jButtonActualizarRubroEstructura.setVisible(this.isPermisoActualizarRubroEstructura);	
		this.jInternalFrameDetalleFormRubroEstructura.jButtonEliminarRubroEstructura.setVisible(this.isPermisoEliminarRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jButtonCancelarRubroEstructura.setVisible(this.isVisibilidadCeldaCancelarRubroEstructura);							
		this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosRubroEstructura.setVisible((this.isVisibilidadCeldaGuardarRubroEstructura && this.isPermisoGuardarCambiosRubroEstructura));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRubroEstructura() {
		if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRubroEstructura();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRubroEstructura() {
	}
	
	public void jTableDatosRubroEstructuraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRubroEstructura(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRubroEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEstructura(this.getrubroestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroestructura==null) {
						this.rubroestructura = new RubroEstructura();
					}

					this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
				}

				if(this.rubroestructura.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.rubroestructura.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRubroEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRubroEstructura(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEstructura(this.getrubroestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.rubroestructuraLogic.getConnexion());

				if(this.rubroestructura.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.rubroestructura.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEstructura=(TitledBorder)this.jScrollPanelDatosRubroEstructura.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRubroEstructura.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRubroEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEstructura(this.getrubroestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroestructura==null) {
						this.rubroestructura = new RubroEstructura();
					}

					this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
				}

				if(this.rubroestructura.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.rubroestructura.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalRubroEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebRubroEstructura(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEstructura(this.getrubroestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.rubroestructuraLogic.getConnexion());

				if(this.rubroestructura.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.rubroestructura.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEstructura=(TitledBorder)this.jScrollPanelDatosRubroEstructura.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderRubroEstructura.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalRubroEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEstructura(this.getrubroestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroestructura==null) {
						this.rubroestructura = new RubroEstructura();
					}

					this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
				}

				if(this.rubroestructura.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.rubroestructura.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraRubroEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebRubroEstructura(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEstructura(this.getrubroestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.rubroestructuraLogic.getConnexion());

				if(this.rubroestructura.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.rubroestructura.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEstructura=(TitledBorder)this.jScrollPanelDatosRubroEstructura.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderRubroEstructura.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraRubroEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEstructura(this.getrubroestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroestructura==null) {
						this.rubroestructura = new RubroEstructura();
					}

					this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
				}

				if(this.rubroestructura.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.rubroestructura.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rubro_empleaRubroEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorubroemplea=true;

			idTienePermisorubroemplea=this.tienePermisosUsuarioEnPaginaWebRubroEstructura(RubroEmpleaConstantesFunciones.CLASSNAME);

			if(idTienePermisorubroemplea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEstructura(this.getrubroestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.rubroestructuraLogic.getConnexion());

				if(this.rubroestructura.getid_rubro_emplea()!=null) {
					this.rubroempleaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rubroempleaBeanSwingJInternalFrame.setIdActual(this.rubroestructura.getid_rubro_emplea());
					this.rubroempleaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea();
				}

				JInternalFrameBase jinternalFrame =this.rubroempleaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEstructura=(TitledBorder)this.jScrollPanelDatosRubroEstructura.getBorder();
				TitledBorder titledBorderrubroemplea=(TitledBorder)this.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

				titledBorderrubroemplea.setTitle(titledBorderRubroEstructura.getTitle() + " -> Rubro Emplea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rubro_empleaRubroEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEstructura(this.getrubroestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroestructura==null) {
						this.rubroestructura = new RubroEstructura();
					}

					this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
				}

				if(this.rubroestructura.getid_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rubro_emplea = "+this.rubroestructura.getid_rubro_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoRubroEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEstructura(this.getrubroestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroestructura==null) {
						this.rubroestructura = new RubroEstructura();
					}

					this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);
				}

				if(this.rubroestructura.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.rubroestructura.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEstructura(false,false);

			this.getRubroEstructurasFK_IdEmpresa();

			this.inicializarActualizarBindingRubroEstructura(false);

			//if(RubroEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEstructura(false,false);

			this.getRubroEstructurasFK_IdEstructura();

			this.inicializarActualizarBindingRubroEstructura(false);

			//if(RubroEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRubroEmpleaRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEstructura(false,false);

			this.getRubroEstructurasFK_IdRubroEmplea();

			this.inicializarActualizarBindingRubroEstructura(false);

			//if(RubroEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalRubroEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEstructura(false,false);

			this.getRubroEstructurasFK_IdSucursal();

			this.inicializarActualizarBindingRubroEstructura(false);

			//if(RubroEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRubroEstructura() {
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
			this.jInternalFrameDetalleFormRubroEstructura.setVisible(false);	    			
			this.jInternalFrameDetalleFormRubroEstructura.dispose();
			this.jInternalFrameDetalleFormRubroEstructura=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRubroEstructura!=null) {
			this.jInternalFrameReporteDinamicoRubroEstructura.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRubroEstructura.dispose();
			this.jInternalFrameReporteDinamicoRubroEstructura=null;
		}
		
		if(this.jInternalFrameImportacionRubroEstructura!=null) {
			this.jInternalFrameImportacionRubroEstructura.setVisible(false);	    			
			this.jInternalFrameImportacionRubroEstructura.dispose();
			this.jInternalFrameImportacionRubroEstructura=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRubroEstructura();
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
			
			if(sTipo.equals("NuevoRubroEstructura")) {
				jButtonNuevoRubroEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRubroEstructura")) {
				jButtonDuplicarRubroEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRubroEstructura")) {
				jButtonCopiarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("VerFormRubroEstructura")) {
				jButtonVerFormRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRubroEstructura")) {
				jButtonNuevoRubroEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRubroEstructura")) {
				jButtonDuplicarRubroEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRubroEstructura")) {
				jButtonNuevoRubroEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRubroEstructura")) {
				jButtonDuplicarRubroEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRubroEstructura")) {
				jButtonNuevoRubroEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRubroEstructura")) {
				jButtonNuevoRubroEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRubroEstructura")) {
				jButtonNuevoRubroEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRubroEstructura")) {
				jButtonModificarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRubroEstructura")) {
				jButtonModificarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRubroEstructura")) {
				jButtonModificarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRubroEstructura")) {
				jButtonActualizarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRubroEstructura")) {
				jButtonActualizarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRubroEstructura")) {
				jButtonActualizarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("EliminarRubroEstructura")) {
				jButtonEliminarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRubroEstructura")) {
				jButtonEliminarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRubroEstructura")) {
				jButtonEliminarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CancelarRubroEstructura")) {
				jButtonCancelarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRubroEstructura")) {
				jButtonCancelarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRubroEstructura")) {
				jButtonCancelarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CerrarRubroEstructura")) {
				jButtonCerrarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRubroEstructura")) {
				jButtonCerrarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRubroEstructura")) {
				jButtonCerrarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRubroEstructura")) {
				jButtonMostrarOcultarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRubroEstructura")) {
				jButtonCancelarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRubroEstructura")) {
				jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRubroEstructura")) {
				jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRubroEstructura")) {
				jButtonCopiarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRubroEstructura")) {
				jButtonVerFormRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRubroEstructura")) {
				jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRubroEstructura")) {
				jButtonCopiarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRubroEstructura")) {
				jButtonVerFormRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRubroEstructura")) {
				jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRubroEstructura")) {
				jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRubroEstructura")) {
				jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRubroEstructura")) {
				jButtonRecargarInformacionRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRubroEstructura")) {
				jButtonRecargarInformacionRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRubroEstructura")) {
				jButtonRecargarInformacionRubroEstructuraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRubroEstructura")) {
				jButtonAnterioresRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRubroEstructura")) {
				jButtonAnterioresRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRubroEstructura")) {
				jButtonAnterioresRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRubroEstructura")) {
				jButtonSiguientesRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRubroEstructura")) {
				jButtonSiguientesRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRubroEstructura")) {
				jButtonSiguientesRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRubroEstructura") || sTipo.equals("MenuItemDetalleAbrirOrderByRubroEstructura")) {
				jButtonAbrirOrderByRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRubroEstructura") || sTipo.equals("MenuItemDetalleMostrarOcultarRubroEstructura")) {
				jButtonMostrarOcultarRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRubroEstructura")) {
				jButtonNuevoGuardarCambiosRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRubroEstructura")) {
				jButtonNuevoGuardarCambiosRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRubroEstructura")) {
				jButtonNuevoGuardarCambiosRubroEstructuraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRubroEstructura")) {
				jButtonCerrarReporteDinamicoRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRubroEstructura")) {
				jButtonGenerarReporteDinamicoRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRubroEstructura")) {
				
				jButtonGenerarExcelReporteDinamicoRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRubroEstructura")) {
				jButtonCerrarImportacionRubroEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRubroEstructura")) {
				
				jButtonGenerarImportacionRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRubroEstructura")) {
				
				jButtonAbrirImportacionRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRubroEstructura")) {
				jComboBoxTiposAccionesRubroEstructuraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRubroEstructura")) {
				jComboBoxTiposRelacionesRubroEstructuraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRubroEstructura")) {
				jComboBoxTiposAccionesRubroEstructuraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRubroEstructura")) {
				
				jComboBoxTiposSeleccionarRubroEstructuraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRubroEstructura")) {
				jTextFieldValorCampoGeneralRubroEstructuraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRubroEstructura")) {
				jButtonAbrirOrderByRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRubroEstructura")) {
				jButtonAbrirOrderByRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRubroEstructura")) {
				jButtonCerrarOrderByRubroEstructuraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRubroEstructuraBusqueda")) {
				this.jButtonidRubroEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRubroEstructuraUpdate")) {
				this.jButtonid_empresaRubroEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRubroEstructuraBusqueda")) {
				this.jButtonid_empresaRubroEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRubroEstructuraUpdate")) {
				this.jButtonid_sucursalRubroEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRubroEstructuraBusqueda")) {
				this.jButtonid_sucursalRubroEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraRubroEstructuraUpdate")) {
				this.jButtonid_estructuraRubroEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraRubroEstructuraBusqueda")) {
				this.jButtonid_estructuraRubroEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEstructuraUpdate")) {
				this.jButtonid_rubro_empleaRubroEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEstructuraBusqueda")) {
				this.jButtonid_rubro_empleaRubroEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoRubroEstructuraBusqueda")) {
				this.jButtonesta_activoRubroEstructuraBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEstructuraRubroEstructura")) {
				this.jButtonFK_IdEstructuraRubroEstructuraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRubroEmpleaRubroEstructura")) {
				this.jButtonFK_IdRubroEmpleaRubroEstructuraActionPerformed(evt);
			}
			
			;
			
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRubroEstructura();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEstructuraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				


				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RubroEstructura rubroestructuraLocal=null;
			
			if(!this.getEsControlTabla()) {
				rubroestructuraLocal=this.rubroestructura;
			} else {
				rubroestructuraLocal=this.rubroestructuraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
							
				
				


				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
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
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
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
			
			


			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEstructuraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
								
						
				


				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
								
				
				


				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEstructuraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
							
				
				


				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEstructuraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
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
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
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
			
			


			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEstructuraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
								
				
				


				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEstructuraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEstructuraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRubroEstructura")) {
					jCheckBoxSeleccionarTodosRubroEstructuraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRubroEstructura")) {
					jCheckBoxSeleccionadosRubroEstructuraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRubroEstructura")) {
					
				}
				
				


				
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
												
				
				


				
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEstructuraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEstructuraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
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
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
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
			
			


			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEstructuraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroestructura);
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
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
				
				


				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEstructura.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroestructuraAnterior =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRubroEstructura")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRubroEstructuraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRubroEstructura.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.rubroestructura =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.rubroestructura =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.rubroestructura);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRubroEstructura")) {
				
				}
				
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRubroEstructura")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRubroEstructura.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRubroEstructura")) {
			
			}
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRubroEstructura();
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
			if(sTipo.equals("NuevoRubroEstructura")) {
				jButtonNuevoRubroEstructuraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRubroEstructura")) {
				jButtonDuplicarRubroEstructuraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRubroEstructura")) {
				jButtonCopiarRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRubroEstructura")) {
				jButtonVerFormRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRubroEstructura")) {
				jButtonNuevoRubroEstructuraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRubroEstructura")) {
				jButtonModificarRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRubroEstructura")) {
				jButtonActualizarRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRubroEstructura")) {
				jButtonEliminarRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRubroEstructura")) {
				jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRubroEstructura")) {
				jButtonCancelarRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRubroEstructura")) {
				jButtonCerrarRubroEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRubroEstructura")) {
				jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRubroEstructura")) {
				jButtonNuevoGuardarCambiosRubroEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRubroEstructura")) {
				jButtonAbrirOrderByRubroEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRubroEstructura")) {
				jButtonRecargarInformacionRubroEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRubroEstructura")) {
				jButtonAnterioresRubroEstructuraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRubroEstructura")) {
				jButtonSiguientesRubroEstructuraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRubroEstructuraBusqueda")) {
				this.jButtonidRubroEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRubroEstructuraUpdate")) {
				this.jButtonid_empresaRubroEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRubroEstructuraBusqueda")) {
				this.jButtonid_empresaRubroEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRubroEstructuraUpdate")) {
				this.jButtonid_sucursalRubroEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRubroEstructuraBusqueda")) {
				this.jButtonid_sucursalRubroEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraRubroEstructuraUpdate")) {
				this.jButtonid_estructuraRubroEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraRubroEstructuraBusqueda")) {
				this.jButtonid_estructuraRubroEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEstructuraUpdate")) {
				this.jButtonid_rubro_empleaRubroEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEstructuraBusqueda")) {
				this.jButtonid_rubro_empleaRubroEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoRubroEstructuraBusqueda")) {
				this.jButtonesta_activoRubroEstructuraBusquedaActionPerformed(evt);
			}
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRubroEstructura();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRubroEstructura")) {
				closingInternalFrameRubroEstructura();
				
			} else if(sTipo.equals("jButtonCancelarRubroEstructura")) {
				JInternalFrameBase jInternalFrameDetalleFormRubroEstructura = (JInternalFrameBase)evt.getSource();
	            	
	            RubroEstructuraBeanSwingJInternalFrame jInternalFrameParent=(RubroEstructuraBeanSwingJInternalFrame)jInternalFrameDetalleFormRubroEstructura.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRubroEstructuraActionPerformed(null);
			}
			
			RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rubroestructura,new Object(),this.rubroestructuraParameterGeneral,this.rubroestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRubroEstructura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRubroEstructura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRubroEstructura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.rubroestructura)) {
			if(!esControlTabla) {
				if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);			
				}
				
				if(this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRubroEstructura(this.rubroestructura,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rubroestructuraReturnGeneral=rubroestructuraLogic.procesarEventosRubroEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroestructuraLogic.getRubroEstructuras(),this.rubroestructura,this.rubroestructuraParameterGeneral,this.isEsNuevoRubroEstructura,classes);//this.rubroestructuraLogic.getRubroEstructura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRubroEstructura(this.rubroestructuraReturnGeneral,this.rubroestructuraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRubroEstructura(classes,this.rubroestructuraReturnGeneral,this.rubroestructuraBean,false);
					}
						
					if(this.rubroestructuraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRubroEstructura(this.rubroestructuraReturnGeneral.getRubroEstructura());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRubroEstructura(this.rubroestructuraReturnGeneral.getRubroEstructura());	
					}
						
					if(this.rubroestructuraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRubroEstructura(this.rubroestructuraReturnGeneral.getRubroEstructura(),classes);//this.rubroestructuraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRubroEstructura(this.rubroestructura,classes);//this.rubroestructuraBean);									
				}
			
				if(RubroEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRubroEstructura(this.rubroestructura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEstructura(this.rubroestructura);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.rubroestructuraAnterior!=null) {
						this.rubroestructura=this.rubroestructuraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rubroestructuraReturnGeneral=rubroestructuraLogic.procesarEventosRubroEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroestructuraLogic.getRubroEstructuras(),this.rubroestructura,this.rubroestructuraParameterGeneral,this.isEsNuevoRubroEstructura,classes);//this.rubroestructuraLogic.getRubroEstructura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rubroestructuraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.rubroestructuraReturnGeneral.getRubroEstructura(),rubroestructuraLogic.getRubroEstructuras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.rubroestructuraReturnGeneral.getRubroEstructura(),this.rubroestructuras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRubroEstructura.repaint();
				
				//((AbstractTableModel) this.jTableDatosRubroEstructura.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRubroEstructura();
			}
		}
	}
	
	public void actualizarVisualTableDatosRubroEstructura() throws Exception {
		
		RubroEstructuraModel rubroestructuraModel=(RubroEstructuraModel)this.jTableDatosRubroEstructura.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubroestructuraModel.rubroestructuras=this.rubroestructuraLogic.getRubroEstructuras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			rubroestructuraModel.rubroestructuras=this.rubroestructuras;
		}
		
		
		((RubroEstructuraModel) this.jTableDatosRubroEstructura.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRubroEstructura() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrubroestructuraAnterior(),this.rubroestructuraLogic.getRubroEstructuras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrubroestructuraAnterior(),this.rubroestructuras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRubroEstructura();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRubroEstructura(RubroEstructura rubroestructura,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
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
										
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroestructura,new Object(),generalEntityParameterGeneral,this.rubroestructuraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.rubroestructuraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RubroEstructuraConstantesFunciones.getClassesRelationshipsOfRubroEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RubroEstructuraConstantesFunciones.getClassesRelationshipsFromStringsOfRubroEstructura(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRubroEstructura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RubroEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroestructura,new Object(),generalEntityParameterGeneral,this.rubroestructuraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRubroEstructura(RubroEstructuraBean rubroestructuraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRubroEstructura(ArrayList<Classe> classes,RubroEstructuraReturnGeneral rubroestructuraReturnGeneral,RubroEstructuraBean rubroestructuraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRubroEstructura(RubroEstructura rubroestructura,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.rubroestructura)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRubroEstructura = new RubroEstructuraDetalleFormJInternalFrame(jDesktopPane,this.rubroestructuraSessionBean.getConGuardarRelaciones(),this.rubroestructuraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.setVisible(false);
		this.jInternalFrameDetalleFormRubroEstructura.setSelected(false);						
		
		this.jInternalFrameDetalleFormRubroEstructura.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRubroEstructura.rubroestructuraLogic=this.rubroestructuraLogic;
		
		this.cargarCombosFrameForeignKeyRubroEstructura("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRubroEstructura();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRubroEstructura();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRubroEstructura("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRubroEstructura();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRubroEstructura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRubroEstructura"));
		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonModificarRubroEstructura.addActionListener(new ButtonActionListener(this,"ModificarRubroEstructura"));

		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonModificarToolBarRubroEstructura.addActionListener(new ButtonActionListener(this,"ModificarToolBarRubroEstructura"));
					
		this.jInternalFrameDetalleFormRubroEstructura.jMenuItemModificarRubroEstructura.addActionListener(new ButtonActionListener(this,"MenuItemModificarRubroEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonActualizarRubroEstructura.addActionListener (new ButtonActionListener(this,"ActualizarRubroEstructura"));
		
		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonActualizarToolBarRubroEstructura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRubroEstructura"));
						
		this.jInternalFrameDetalleFormRubroEstructura.jMenuItemActualizarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRubroEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonEliminarRubroEstructura.addActionListener (new ButtonActionListener(this,"EliminarRubroEstructura"));
		
		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonEliminarToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"EliminarToolBarRubroEstructura"));
								
		this.jInternalFrameDetalleFormRubroEstructura.jMenuItemEliminarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRubroEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonCancelarRubroEstructura.addActionListener (new ButtonActionListener(this,"CancelarRubroEstructura"));
		
		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonCancelarToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"CancelarToolBarRubroEstructura"));
					
		this.jInternalFrameDetalleFormRubroEstructura.jMenuItemCancelarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRubroEstructura"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRubroEstructura.jMenuItemDetalleCerrarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRubroEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubroEstructura"));
		
		
		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubroEstructura"));
		
		
		
		this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRubroEstructura"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonidRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_empresaRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_empresaRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_sucursalRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_sucursalRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_estructuraRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_estructuraRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_rubro_empleaRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_rubro_empleaRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonesta_activoRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoRubroEstructuraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRubroEstructura.jTabbedPaneRelacionesRubroEstructura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRubroEstructura"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRubroEstructura"));
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRubroEstructura"));
		}
		
		this.jTableDatosRubroEstructura.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRubroEstructura"));
		
		this.jTableDatosRubroEstructura.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRubroEstructura"));
		
		this.jButtonNuevoRubroEstructura.addActionListener(new ButtonActionListener(this,"NuevoRubroEstructura"));
		
		this.jButtonDuplicarRubroEstructura.addActionListener(new ButtonActionListener(this,"DuplicarRubroEstructura"));
		
		this.jButtonCopiarRubroEstructura.addActionListener(new ButtonActionListener(this,"CopiarRubroEstructura"));
		
		this.jButtonVerFormRubroEstructura.addActionListener(new ButtonActionListener(this,"VerFormRubroEstructura"));
		
		
		this.jButtonNuevoToolBarRubroEstructura.addActionListener(new ButtonActionListener(this,"NuevoToolBarRubroEstructura"));
			
		this.jButtonDuplicarToolBarRubroEstructura.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRubroEstructura"));
			
		this.jMenuItemNuevoRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRubroEstructura"));
			
		this.jMenuItemDuplicarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRubroEstructura"));		
		
		
		this.jButtonNuevoRelacionesRubroEstructura.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRubroEstructura"));
		
		
		this.jButtonNuevoRelacionesToolBarRubroEstructura.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRubroEstructura"));
			
		this.jMenuItemNuevoRelacionesRubroEstructura.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRubroEstructura"));		
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonModificarRubroEstructura.addActionListener(new ButtonActionListener(this,"ModificarRubroEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonModificarToolBarRubroEstructura.addActionListener(new ButtonActionListener(this,"ModificarToolBarRubroEstructura"));
			
			this.jInternalFrameDetalleFormRubroEstructura.jMenuItemModificarRubroEstructura.addActionListener(new ButtonActionListener(this,"MenuItemModificarRubroEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRubroEstructura.jButtonActualizarRubroEstructura.addActionListener (new ButtonActionListener(this,"ActualizarRubroEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonActualizarToolBarRubroEstructura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRubroEstructura"));
				
			this.jInternalFrameDetalleFormRubroEstructura.jMenuItemActualizarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRubroEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonEliminarRubroEstructura.addActionListener (new ButtonActionListener(this,"EliminarRubroEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonEliminarToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"EliminarToolBarRubroEstructura"));
						
			this.jInternalFrameDetalleFormRubroEstructura.jMenuItemEliminarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRubroEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonCancelarRubroEstructura.addActionListener (new ButtonActionListener(this,"CancelarRubroEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonCancelarToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"CancelarToolBarRubroEstructura"));
			
			this.jInternalFrameDetalleFormRubroEstructura.jMenuItemCancelarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRubroEstructura"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRubroEstructura"));		
		
		
		this.jButtonCerrarRubroEstructura.addActionListener (new ButtonActionListener(this,"CerrarRubroEstructura"));
		
		
		this.jButtonCerrarToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"CerrarToolBarRubroEstructura"));
			
		this.jMenuItemCerrarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRubroEstructura"));
			
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jMenuItemDetalleCerrarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRubroEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosRubroEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosRubroEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubroEstructura"));
		}
		
		this.jButtonCopiarToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"CopiarToolBarRubroEstructura"));
			
		this.jButtonVerFormToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"VerFormToolBarRubroEstructura"));
		
		this.jMenuItemGuardarCambiosRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRubroEstructura"));
			
		this.jMenuItemCopiarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRubroEstructura"));		
		
		this.jMenuItemVerFormRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRubroEstructura"));		
		
		
		this.jButtonGuardarCambiosTablaRubroEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRubroEstructura"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRubroEstructura"));
			
		this.jMenuItemGuardarCambiosTablaRubroEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRubroEstructura"));		
		
		
		
		this.jButtonRecargarInformacionRubroEstructura.addActionListener (new ButtonActionListener(this,"RecargarInformacionRubroEstructura"));
					
		this.jButtonRecargarInformacionToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRubroEstructura"));
		
		this.jMenuItemRecargarInformacionRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRubroEstructura"));		
		
		
		
		this.jButtonAnterioresRubroEstructura.addActionListener (new ButtonActionListener(this,"AnterioresRubroEstructura"));
		
		
		this.jButtonAnterioresToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRubroEstructura"));
		
		this.jMenuItemAnterioresRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRubroEstructura"));		
		
		
		this.jButtonSiguientesRubroEstructura.addActionListener (new ButtonActionListener(this,"SiguientesRubroEstructura"));
		
		
		this.jButtonSiguientesToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRubroEstructura"));
			
		this.jMenuItemSiguientesRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRubroEstructura"));
			
		this.jMenuItemAbrirOrderByRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRubroEstructura"));
			
		this.jMenuItemMostrarOcultarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRubroEstructura"));
			
		this.jMenuItemDetalleAbrirOrderByRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRubroEstructura"));
			
		this.jMenuItemDetalleMostarOcultarRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRubroEstructura"));		
		
		
		this.jButtonNuevoGuardarCambiosRubroEstructura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRubroEstructura"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRubroEstructura"));
			
		this.jMenuItemNuevoGuardarCambiosRubroEstructura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRubroEstructura"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRubroEstructura.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRubroEstructura"));

		this.jCheckBoxSeleccionadosRubroEstructura.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRubroEstructura"));
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRubroEstructura"));
		}
		
		
		this.jComboBoxTiposRelacionesRubroEstructura.addActionListener (new ButtonActionListener(this,"TiposRelacionesRubroEstructura"));
			
		this.jComboBoxTiposAccionesRubroEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesRubroEstructura"));
					
		this.jComboBoxTiposSeleccionarRubroEstructura.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRubroEstructura"));
			
		this.jTextFieldValorCampoGeneralRubroEstructura.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRubroEstructura"));		
		
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonidRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_empresaRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_empresaRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_sucursalRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_sucursalRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_estructuraRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_estructuraRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_rubro_empleaRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_rubro_empleaRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonesta_activoRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoRubroEstructuraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEstructuraRubroEstructura.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraRubroEstructura"));

			this.jButtonFK_IdRubroEmpleaRubroEstructura.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaRubroEstructura"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRubroEstructura!=null) {
				this.jInternalFrameReporteDinamicoRubroEstructura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubroEstructura"));
				this.jInternalFrameReporteDinamicoRubroEstructura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubroEstructura"));
				this.jInternalFrameReporteDinamicoRubroEstructura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubroEstructura"));
			}
			
			//this.jButtonCerrarReporteDinamicoRubroEstructura.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubroEstructura"));				
			//this.jButtonGenerarReporteDinamicoRubroEstructura.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubroEstructura"));
			//this.jButtonGenerarExcelReporteDinamicoRubroEstructura.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubroEstructura"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRubroEstructura!=null) {
				this.jInternalFrameImportacionRubroEstructura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRubroEstructura"));
				this.jInternalFrameImportacionRubroEstructura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRubroEstructura"));
				this.jInternalFrameImportacionRubroEstructura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRubroEstructura"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRubroEstructura.addActionListener (new ButtonActionListener(this,"AbrirOrderByRubroEstructura"));
			
			this.jButtonAbrirOrderByToolBarRubroEstructura.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRubroEstructura"));			
			
			if(this.jInternalFrameOrderByRubroEstructura!=null) {
				this.jInternalFrameOrderByRubroEstructura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRubroEstructura"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEstructura.jTabbedPaneRelacionesRubroEstructura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRubroEstructura"));
		
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
            		closingInternalFrameRubroEstructura();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRubroEstructura.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRubroEstructura = (JInternalFrameBase)event.getSource();
	            	
	            RubroEstructuraBeanSwingJInternalFrame jInternalFrameParent=(RubroEstructuraBeanSwingJInternalFrame)jInternalFrameDetalleFormRubroEstructura.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRubroEstructuraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRubroEstructura.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRubroEstructuraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRubroEstructura.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRubroEstructura.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRubroEstructura";
		inputMap = this.jButtonNuevoRubroEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRubroEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRubroEstructuraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRubroEstructura";
		inputMap = this.jButtonNuevoRelacionesRubroEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRubroEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRubroEstructuraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRubroEstructura";
		inputMap = this.jButtonModificarRubroEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRubroEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRubroEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRubroEstructura";
		inputMap = this.jButtonActualizarRubroEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRubroEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRubroEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRubroEstructura";
		inputMap = this.jButtonEliminarRubroEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRubroEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRubroEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRubroEstructura";
		inputMap = this.jButtonCancelarRubroEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRubroEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRubroEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRubroEstructura";
		inputMap = this.jButtonCerrarRubroEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRubroEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRubroEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRubroEstructura";
		inputMap = this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosRubroEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRubroEstructura.jButtonGuardarCambiosRubroEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRubroEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRubroEstructura.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRubroEstructuraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRubroEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRubroEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRubroEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRubroEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRubroEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRubroEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonidRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_empresaRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_empresaRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_sucursalRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_sucursalRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_estructuraRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_estructuraRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_rubro_empleaRubroEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonid_rubro_empleaRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEstructura.jButtonesta_activoRubroEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoRubroEstructuraBusqueda"));
		
		
		this.jButtonFK_IdEstructuraRubroEstructura.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraRubroEstructura"));

		this.jButtonFK_IdRubroEmpleaRubroEstructura.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaRubroEstructura"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRubroEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRubroEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRubroEstructuraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRubroEstructura.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRubroEstructura(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RubroEstructura rubroestructuraAux:this.rubroestructuraLogic.getRubroEstructuras()) {
					rubroestructuraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEstructura rubroestructuraAux:rubroestructuras) {
					rubroestructuraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRubroEstructuraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRubroEstructura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RubroEstructura rubroestructuraAux:this.rubroestructuraLogic.getRubroEstructuras()) {
						rubroestructuraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubroEstructura rubroestructuraAux:rubroestructuras) {
						rubroestructuraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RubroEstructura rubroestructuraAux:this.rubroestructuraLogic.getRubroEstructuras()) {
					
						if(sTipoSeleccionar.equals(RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							rubroestructuraAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubroEstructura rubroestructuraAux:rubroestructuras) {
						
						if(sTipoSeleccionar.equals(RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							rubroestructuraAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRubroEstructura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRubroEstructura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRubroEstructura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRubroEstructuraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRubroEstructura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRubroEstructura.getSelectedRows();
			
			RubroEstructura rubroestructuraLocal=new RubroEstructura();
			
			//this.seleccionarTodosRubroEstructura(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroestructuraLocal =(RubroEstructura) this.rubroestructuraLogic.getRubroEstructuras().toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					rubroestructuraLocal =(RubroEstructura) this.rubroestructuras.toArray()[this.jTableDatosRubroEstructura.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				rubroestructuraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RubroEstructura rubroestructuraAux:this.rubroestructuraLogic.getRubroEstructuras()) {
						rubroestructuraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubroEstructura rubroestructuraAux:rubroestructuras) {
						rubroestructuraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRubroEstructura(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRubroEstructura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRubroEstructura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRubroEstructura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRubroEstructuraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRubroEstructuraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRubroEstructuraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRubroEstructura(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRubroEstructura.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RubroEstructura rubroestructuraAux:this.rubroestructuraLogic.getRubroEstructuras()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEstructura rubroestructuraAux:rubroestructuras) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRubroEstructura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRubroEstructuraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRubroEstructura(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRubroEstructura=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRubroEstructura.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRubroEstructura) {				
					conSplash=true;//false;										
					
					//this.startProcessRubroEstructura(conSplash);
				
					this.generarReporteRubroEstructurasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRubroEstructurasSeleccionados();
				//this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRubroEstructurasSeleccionados(false);
				//this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRubroEstructurasSeleccionados(true);
				//this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRubroEstructura();
				
				this.exportarRubroEstructurasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRubroEstructuras();
				//this.importarRubroEstructuras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRubroEstructura();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRubroEstructurasSeleccionados();
				//this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Rubro Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRubroEstructura();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRubroEstructura)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRubroEstructura(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Rubro Estructura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.setSelectedIndex(0);					
				}	
			} 			
			else if(RubroEstructuraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRubroEstructura) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRubroEstructura(conSplash);
					
						//this.actualizarParametrosGeneralRubroEstructura();
						
						this.generarReporteProcesoAccionRubroEstructurasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RubroEstructuraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Rubro EstructuraS SELECCIONADOS?", "MANTENIMIENTO DE Rubro Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRubroEstructura();
				
						this.actualizarParametrosGeneralRubroEstructura();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.rubroestructuraReturnGeneral=rubroestructuraLogic.procesarAccionRubroEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.rubroestructuraLogic.getRubroEstructuras(),this.rubroestructuraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRubroEstructuraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRubroEstructura();
					
					RubroEstructuraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRubroEstructuraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRubroEstructura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRubroEstructura.jComboBoxTiposAccionesFormularioRubroEstructura.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRubroEstructura(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRubroEstructuraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRubroEstructura();
			
			if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();		
			RubroEstructura rubroestructura=new RubroEstructura();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRubroEstructura(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRubroEstructura.getSelectedItem();
			
			
			
			
			rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
			//this.sTipoAccion;
			
			if(rubroestructurasSeleccionados.size()==1) {
				for(RubroEstructura rubroestructuraAux:rubroestructurasSeleccionados) {
					rubroestructura=rubroestructuraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRubroEstructura();
			
      		//this.finishProcessRubroEstructura(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRubroEstructuraReturnGeneral() throws Exception {
		if(this.rubroestructuraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.rubroestructuraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.rubroestructuraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.rubroestructuraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.rubroestructuraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.rubroestructuraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRubroEstructura(false);
		}
		
		if(this.rubroestructuraReturnGeneral.getConRetornoLista() || this.rubroestructuraReturnGeneral.getConRetornoObjeto()) {
			if(this.rubroestructuraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rubroestructuraLogic.setRubroEstructuras(this.rubroestructuraReturnGeneral.getRubroEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.rubroestructuraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rubroestructuraLogic.setRubroEstructura(this.rubroestructuraReturnGeneral.getRubroEstructura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRubroEstructura(false);
		}
	}
	
	public void actualizarParametrosGeneralRubroEstructura() throws Exception {
		
		
	}
	
	public ArrayList<RubroEstructura> getRubroEstructurasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRubroEstructura) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RubroEstructura rubroestructuraAux:rubroestructuraLogic.getRubroEstructuras()) {
					if(rubroestructuraAux.getIsSelected()) {
						rubroestructurasSeleccionados.add(rubroestructuraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEstructura rubroestructuraAux:this.rubroestructuras) {
					if(rubroestructuraAux.getIsSelected()) {
						rubroestructurasSeleccionados.add(rubroestructuraAux);				
					}
				}
			}
			
			if(rubroestructurasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						rubroestructurasSeleccionados.addAll(this.rubroestructuraLogic.getRubroEstructuras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						rubroestructurasSeleccionados.addAll(this.rubroestructuras);				
					}
				}
			}
		} else {
			rubroestructurasSeleccionados.add(this.rubroestructura);
		}
		
		return rubroestructurasSeleccionados;
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
	
	public void generarReporteRubroEstructurasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRubroEstructurasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRubroEstructurasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRubroEstructurasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRubroEstructurasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Rubro Estructura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRubroEstructurasSeleccionados() throws Exception {
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();		
		
		rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRubroEstructuras("Todos",rubroestructurasSeleccionados);
		
	}	
	
	public void generarReporteNormalRubroEstructurasSeleccionados() throws Exception {
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();		
		
		rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRubroEstructuras("Todos",rubroestructurasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRubroEstructurasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();
		
		rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRubroEstructuras("Todos",rubroestructurasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRubroEstructurasSeleccionados() throws Exception {
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRubroEstructura();
		
		
		rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRubroEstructura();
		
		
		//this.generarReporteRubroEstructuras("Todos",rubroestructurasSeleccionados ,rubroestructuraImplementable,rubroestructuraImplementableHome);
	}
	
	public void mostrarImportacionRubroEstructuras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRubroEstructura();
		
		this.abrirFrameImportacionRubroEstructura();		
		
			
		//this.generarReporteRubroEstructuras("Todos",rubroestructurasSeleccionados ,rubroestructuraImplementable,rubroestructuraImplementableHome);
	}
	
	public void importarRubroEstructuras() throws Exception {		
	
	}
	
	public void exportarRubroEstructurasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRubroEstructurasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRubroEstructurasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRubroEstructurasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Rubro Estructura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRubroEstructurasSeleccionados() throws Exception {
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();		
		
		rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroestructura."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRubroEstructura(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RubroEstructura rubroestructuraAux:rubroestructurasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRubroEstructura(rubroestructuraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//rubroestructuraAux.setsDetalleGeneralEntityReporte(rubroestructuraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRubroEstructura(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RubroEstructuraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEstructuraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRubroEstructura(RubroEstructura rubroestructura,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=rubroestructura.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroestructura.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroestructura.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroestructura.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroestructura.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroestructura.getrubroemplea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroestructura.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRubroEstructurasSeleccionados() throws Exception {
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();		
		
		rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroestructura.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RubroEstructuras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRubroEstructura(row);				
				iRow++;
			}				
			
			for(RubroEstructura rubroestructuraAux:rubroestructurasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRubroEstructura(rubroestructuraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRubroEstructurasSeleccionados() throws Exception {
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();		
		
		rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroestructura.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("rubroestructuras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("rubroestructura");
			//elementRoot.appendChild(element);
		
			for(RubroEstructura rubroestructuraAux:rubroestructurasSeleccionados) {
				element = document.createElement("rubroestructura");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRubroEstructura(rubroestructuraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRubroEstructura(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRubroEstructura(RubroEstructura rubroestructura,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(rubroestructura.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroestructura.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroestructura.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroestructura.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroestructura.getrubroemplea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroestructura.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlRubroEstructura(RubroEstructura rubroestructura,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RubroEstructuraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(rubroestructura.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RubroEstructuraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(rubroestructura.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RubroEstructuraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(rubroestructura.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(RubroEstructuraConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(rubroestructura.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementestructura_descripcion = document.createElement(RubroEstructuraConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(rubroestructura.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementrubroemplea_descripcion = document.createElement(RubroEstructuraConstantesFunciones.IDRUBROEMPLEA);
		elementrubroemplea_descripcion.appendChild(document.createTextNode(rubroestructura.getrubroemplea_descripcion()));
		element.appendChild(elementrubroemplea_descripcion);

		Element elementesta_activo = document.createElement(RubroEstructuraConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(rubroestructura.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoRubroEstructurasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RubroEstructura> rubroestructurasSeleccionados=new ArrayList<RubroEstructura>();
		
		rubroestructurasSeleccionados=this.getRubroEstructurasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRubroEstructura(rubroestructurasSeleccionados);
		
		this.generarReporteRubroEstructuras("Todos",rubroestructurasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRubroEstructura(ArrayList<RubroEstructura> rubroestructurasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RubroEstructura rubroestructuraAux:rubroestructurasSeleccionados) {
				rubroestructuraAux.setsDetalleGeneralEntityReporte(rubroestructuraAux.toString());
			
				if(sTipoSeleccionar.equals(RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					rubroestructuraAux.setsDescripcionGeneralEntityReporte1(rubroestructuraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					rubroestructuraAux.setsDescripcionGeneralEntityReporte1(rubroestructuraAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					rubroestructuraAux.setsDescripcionGeneralEntityReporte1(rubroestructuraAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA)) {
					existe=true;
					rubroestructuraAux.setsDescripcionGeneralEntityReporte1(rubroestructuraAux.getrubroemplea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					rubroestructuraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(rubroestructuraAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRubroEstructura(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRubroEstructura=true;
				this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=true;
				this.isVisibilidadCeldaGuardarCambiosRubroEstructura=true;
			}
			
			this.isVisibilidadCeldaModificarRubroEstructura=false;
			this.isVisibilidadCeldaActualizarRubroEstructura=false;
			this.isVisibilidadCeldaEliminarRubroEstructura=false;
			this.isVisibilidadCeldaCancelarRubroEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEstructura=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRubroEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=false;
			this.isVisibilidadCeldaModificarRubroEstructura=false;
			this.isVisibilidadCeldaActualizarRubroEstructura=true;
			this.isVisibilidadCeldaEliminarRubroEstructura=false;
			this.isVisibilidadCeldaCancelarRubroEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEstructura=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRubroEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=false;
			this.isVisibilidadCeldaModificarRubroEstructura=false;
			this.isVisibilidadCeldaActualizarRubroEstructura=true;
			this.isVisibilidadCeldaEliminarRubroEstructura=true;
			this.isVisibilidadCeldaCancelarRubroEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEstructura=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRubroEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=false;
			this.isVisibilidadCeldaModificarRubroEstructura=false;
			this.isVisibilidadCeldaActualizarRubroEstructura=true;
			this.isVisibilidadCeldaEliminarRubroEstructura=false;
			this.isVisibilidadCeldaCancelarRubroEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarRubroEstructura=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRubroEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=true;
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=true;
			this.isVisibilidadCeldaModificarRubroEstructura=false;
			this.isVisibilidadCeldaActualizarRubroEstructura=false;
			this.isVisibilidadCeldaEliminarRubroEstructura=false;
			this.isVisibilidadCeldaCancelarRubroEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEstructura=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRubroEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=false;
			this.isVisibilidadCeldaActualizarRubroEstructura=false;
			this.isVisibilidadCeldaEliminarRubroEstructura=false;
			this.isVisibilidadCeldaCancelarRubroEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarRubroEstructura=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRubroEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=false;
			this.isVisibilidadCeldaModificarRubroEstructura=true;
			this.isVisibilidadCeldaActualizarRubroEstructura=false;
			this.isVisibilidadCeldaEliminarRubroEstructura=false;
			this.isVisibilidadCeldaCancelarRubroEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarRubroEstructura=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RubroEstructuraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRubroEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=true;
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=true;
		} else {
			this.actualizarEstadoPanelsRubroEstructura(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRubroEstructura=false;
			//this.isVisibilidadCeldaVerFormRubroEstructura=false;
			this.isVisibilidadCeldaDuplicarRubroEstructura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!rubroestructuraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=false;
		} else {
			this.isVisibilidadCeldaNuevoRubroEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEstructura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(rubroestructuraSessionBean.getEsGuardarRelacionado()) {
			if(!rubroestructuraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=false;												
			}
			
			this.jButtonCerrarRubroEstructura.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRubroEstructura=false;
		}
		
		if(!this.permiteMantenimiento(this.rubroestructura)) {
			this.isVisibilidadCeldaActualizarRubroEstructura=false;
			this.isVisibilidadCeldaEliminarRubroEstructura=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRubroEstructura() {
	}
	
	public void actualizarEstadoPanelsRubroEstructura(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRubroEstructura!=null) {
				this.jScrollPanelDatosEdicionRubroEstructura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEstructura!=null) {
				this.jTabbedPaneBusquedasRubroEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEstructura!=null) {
				this.jScrollPanelDatosRubroEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEstructura!=null) {
				this.jPanelPaginacionRubroEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEstructura!=null) {
				this.jPanelParametrosReportesRubroEstructura.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRubroEstructura!=null) {
				this.jScrollPanelDatosEdicionRubroEstructura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEstructura!=null) {
				this.jTabbedPaneBusquedasRubroEstructura.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRubroEstructura!=null) {
				this.jScrollPanelDatosRubroEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubroEstructura!=null) {
				this.jPanelPaginacionRubroEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubroEstructura!=null) {
				this.jPanelParametrosReportesRubroEstructura.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRubroEstructura!=null) {
				this.jScrollPanelDatosEdicionRubroEstructura.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEstructura!=null) {
				this.jTabbedPaneBusquedasRubroEstructura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRubroEstructura!=null) {
				this.jScrollPanelDatosRubroEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubroEstructura!=null) {
				this.jPanelPaginacionRubroEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubroEstructura!=null) {
				this.jPanelParametrosReportesRubroEstructura.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRubroEstructura!=null) {
				this.jScrollPanelDatosEdicionRubroEstructura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEstructura!=null) {
				this.jTabbedPaneBusquedasRubroEstructura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRubroEstructura!=null) {
				this.jScrollPanelDatosRubroEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubroEstructura!=null) {
				this.jPanelPaginacionRubroEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubroEstructura!=null) {
				this.jPanelParametrosReportesRubroEstructura.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRubroEstructura!=null) {
				this.jScrollPanelDatosEdicionRubroEstructura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEstructura!=null) {
				this.jTabbedPaneBusquedasRubroEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEstructura!=null) {
				this.jScrollPanelDatosRubroEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEstructura!=null) {
				this.jPanelPaginacionRubroEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEstructura!=null) {
				this.jPanelParametrosReportesRubroEstructura.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRubroEstructura!=null) {
				this.jScrollPanelDatosEdicionRubroEstructura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEstructura!=null) {
				this.jTabbedPaneBusquedasRubroEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEstructura!=null) {
				this.jScrollPanelDatosRubroEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEstructura!=null) {
				this.jPanelPaginacionRubroEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEstructura!=null) {
				this.jPanelParametrosReportesRubroEstructura.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRubroEstructura!=null) {
				this.jScrollPanelDatosEdicionRubroEstructura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEstructura!=null) {
				this.jTabbedPaneBusquedasRubroEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEstructura!=null) {
				this.jScrollPanelDatosRubroEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEstructura!=null) {
				this.jPanelPaginacionRubroEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEstructura!=null) {
				this.jPanelParametrosReportesRubroEstructura.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRubroEstructura!=null) {
					this.jTabbedPaneBusquedasRubroEstructura.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRubroEstructura!=null) {
				this.jPanelParametrosReportesRubroEstructura.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEstructura!=null) {
				this.jTabbedPaneBusquedasRubroEstructura.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRubroEstructura!=null) {
				this.jPanelParametrosReportesRubroEstructura.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasRubroEstructura.remove(jPanelFK_IdEstructuraRubroEstructura);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEstructura.remove(jPanelFK_IdRubroEmpleaRubroEstructura);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasRubroEstructura.remove(jPanelFK_IdEstructuraRubroEstructura);}

			this.isVisibilidadFK_IdRubroEmplea=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEstructura.remove(jPanelFK_IdRubroEmpleaRubroEstructura);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasRubroEstructura.remove(jPanelFK_IdEstructuraRubroEstructura);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEstructura.remove(jPanelFK_IdRubroEmpleaRubroEstructura);}
		}
		
	}

	public void setVisibilidadBusquedasParaRubroEmplea(Boolean isParaRubroEmplea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRubroEmpleaNegation=!isParaRubroEmplea;

			this.isVisibilidadFK_IdEstructura=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasRubroEstructura.remove(jPanelFK_IdEstructuraRubroEstructura);}

			this.isVisibilidadFK_IdRubroEmplea=isParaRubroEmplea;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEstructura.remove(jPanelFK_IdRubroEmpleaRubroEstructura);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RubroEstructuraSessionBean rubroestructuraSessionBean=new RubroEstructuraSessionBean();
		
		if(this.rubroestructuraSessionBean==null) {
			this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
		}
		
		this.rubroestructuraSessionBean.setsUltimaBusquedaRubroEstructura(this.getsAccionBusqueda());
		this.rubroestructuraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.rubroestructuraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			rubroestructuraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			rubroestructuraSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
			rubroestructuraSessionBean.setid_rubro_emplea(this.getid_rubro_empleaFK_IdRubroEmplea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			rubroestructuraSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RubroEstructuraSessionBean rubroestructuraSessionBean=new RubroEstructuraSessionBean();
		
		if(this.rubroestructuraSessionBean==null) {
			this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
		}
		
		if(this.rubroestructuraSessionBean.getsUltimaBusquedaRubroEstructura()!=null&&!this.rubroestructuraSessionBean.getsUltimaBusquedaRubroEstructura().equals("")) {
			this.setsAccionBusqueda(rubroestructuraSessionBean.getsUltimaBusquedaRubroEstructura());
			this.setiNumeroPaginacion(rubroestructuraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(rubroestructuraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(rubroestructuraSessionBean.getid_empresa());
				rubroestructuraSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(rubroestructuraSessionBean.getid_estructura());
				rubroestructuraSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
				this.setid_rubro_empleaFK_IdRubroEmplea(rubroestructuraSessionBean.getid_rubro_emplea());
				rubroestructuraSessionBean.setid_rubro_emplea(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(rubroestructuraSessionBean.getid_sucursal());
				rubroestructuraSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.rubroestructuraSessionBean.setsUltimaBusquedaRubroEstructura("");
		this.rubroestructuraSessionBean.setiNumeroPaginacion(RubroEstructuraConstantesFunciones.INUMEROPAGINACION);
		this.rubroestructuraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRubroEstructura(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRubroEstructura() {
		this.updateBorderResaltarBusquedasFormularioRubroEstructura();
		this.updateVisibilidadBusquedasFormularioRubroEstructura();
		this.updateHabilitarBusquedasFormularioRubroEstructura();
	}
	
	public void updateBorderResaltarBusquedasFormularioRubroEstructura() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRubroEstructura.getComponents().length>0) {
	

		if(this.rubroestructuraConstantesFunciones.resaltarFK_IdEstructuraRubroEstructura!=null) {
			index= this.jTabbedPaneBusquedasRubroEstructura.indexOfComponent(this.jPanelFK_IdEstructuraRubroEstructura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEstructura.getComponent(index);
				jPanel.setBorder(this.rubroestructuraConstantesFunciones.resaltarFK_IdEstructuraRubroEstructura);
			}
		}

		if(this.rubroestructuraConstantesFunciones.resaltarFK_IdRubroEmpleaRubroEstructura!=null) {
			index= this.jTabbedPaneBusquedasRubroEstructura.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEstructura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEstructura.getComponent(index);
				jPanel.setBorder(this.rubroestructuraConstantesFunciones.resaltarFK_IdRubroEmpleaRubroEstructura);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRubroEstructura() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRubroEstructura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRubroEstructura.indexOfComponent(this.jPanelFK_IdEstructuraRubroEstructura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEstructura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rubroestructuraConstantesFunciones.mostrarFK_IdEstructuraRubroEstructura);
			if(!this.rubroestructuraConstantesFunciones.mostrarFK_IdEstructuraRubroEstructura && index>-1) {
				this.jTabbedPaneBusquedasRubroEstructura.remove(index);
			}

			index= this.jTabbedPaneBusquedasRubroEstructura.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEstructura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEstructura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rubroestructuraConstantesFunciones.mostrarFK_IdRubroEmpleaRubroEstructura);
			if(!this.rubroestructuraConstantesFunciones.mostrarFK_IdRubroEmpleaRubroEstructura && index>-1) {
				this.jTabbedPaneBusquedasRubroEstructura.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRubroEstructura() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRubroEstructura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRubroEstructura.indexOfComponent(this.jPanelFK_IdEstructuraRubroEstructura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEstructura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rubroestructuraConstantesFunciones.activarFK_IdEstructuraRubroEstructura);
				this.jTabbedPaneBusquedasRubroEstructura.setEnabledAt(index,this.rubroestructuraConstantesFunciones.activarFK_IdEstructuraRubroEstructura);
			}

			index= this.jTabbedPaneBusquedasRubroEstructura.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEstructura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEstructura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rubroestructuraConstantesFunciones.activarFK_IdRubroEmpleaRubroEstructura);
				this.jTabbedPaneBusquedasRubroEstructura.setEnabledAt(index,this.rubroestructuraConstantesFunciones.activarFK_IdRubroEmpleaRubroEstructura);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRubroEstructura(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasRubroEstructura.indexOfComponent(this.jPanelFK_IdEstructuraRubroEstructura);

			this.jTabbedPaneBusquedasRubroEstructura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEstructura.getComponent(index);

			this.rubroestructuraConstantesFunciones.setResaltarFK_IdEstructuraRubroEstructura(resaltar);

			jPanel.setBorder(this.rubroestructuraConstantesFunciones.resaltarFK_IdEstructuraRubroEstructura);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRubroEmplea")) {
			index= this.jTabbedPaneBusquedasRubroEstructura.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEstructura);

			this.jTabbedPaneBusquedasRubroEstructura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEstructura.getComponent(index);

			this.rubroestructuraConstantesFunciones.setResaltarFK_IdRubroEmpleaRubroEstructura(resaltar);

			jPanel.setBorder(this.rubroestructuraConstantesFunciones.resaltarFK_IdRubroEmpleaRubroEstructura);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRubroEstructura.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRubroEstructura() throws Exception {

		if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRubroEstructura();
		this.updateVisibilidadResaltarControlesFormularioRubroEstructura();
		this.updateHabilitarResaltarControlesFormularioRubroEstructura();
		
	}
	
	public void updateBorderResaltarControlesFormularioRubroEstructura() throws Exception {
		if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.rubroestructuraConstantesFunciones.resaltaridRubroEstructura!=null && this.jInternalFrameDetalleFormRubroEstructura!=null) {this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.setBorder(this.rubroestructuraConstantesFunciones.resaltaridRubroEstructura);}
		if(this.rubroestructuraConstantesFunciones.resaltarid_empresaRubroEstructura!=null && this.jInternalFrameDetalleFormRubroEstructura!=null) {this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.setBorder(this.rubroestructuraConstantesFunciones.resaltarid_empresaRubroEstructura);}
		if(this.rubroestructuraConstantesFunciones.resaltarid_sucursalRubroEstructura!=null && this.jInternalFrameDetalleFormRubroEstructura!=null) {this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.setBorder(this.rubroestructuraConstantesFunciones.resaltarid_sucursalRubroEstructura);}
		if(this.rubroestructuraConstantesFunciones.resaltarid_estructuraRubroEstructura!=null && this.jInternalFrameDetalleFormRubroEstructura!=null) {this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.setBorder(this.rubroestructuraConstantesFunciones.resaltarid_estructuraRubroEstructura);}
		if(this.rubroestructuraConstantesFunciones.resaltarid_rubro_empleaRubroEstructura!=null && this.jInternalFrameDetalleFormRubroEstructura!=null) {this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.setBorder(this.rubroestructuraConstantesFunciones.resaltarid_rubro_empleaRubroEstructura);}
		if(this.rubroestructuraConstantesFunciones.resaltaresta_activoRubroEstructura!=null && this.jInternalFrameDetalleFormRubroEstructura!=null) {this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxesta_activoRubroEstructura.setBorderPainted(true);this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxesta_activoRubroEstructura.setBorder(this.rubroestructuraConstantesFunciones.resaltaresta_activoRubroEstructura);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRubroEstructura() throws Exception {		
		if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
	
		//this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostraridRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jPanelidRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostraridRubroEstructura);
		//this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostrarid_empresaRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jPanelid_empresaRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostrarid_empresaRubroEstructura);
		//this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostrarid_sucursalRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jPanelid_sucursalRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostrarid_sucursalRubroEstructura);
		//this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostrarid_estructuraRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jPanelid_estructuraRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostrarid_estructuraRubroEstructura);
		//this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostrarid_rubro_empleaRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jPanelid_rubro_empleaRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostrarid_rubro_empleaRubroEstructura);
		//this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxesta_activoRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostraresta_activoRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jPanelesta_activoRubroEstructura.setVisible(this.rubroestructuraConstantesFunciones.mostraresta_activoRubroEstructura);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRubroEstructura() throws Exception {
		if(this.jInternalFrameDetalleFormRubroEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRubroEstructura!=null) {
	
		this.jInternalFrameDetalleFormRubroEstructura.jLabelidRubroEstructura.setEnabled(this.rubroestructuraConstantesFunciones.activaridRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_empresaRubroEstructura.setEnabled(this.rubroestructuraConstantesFunciones.activarid_empresaRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_sucursalRubroEstructura.setEnabled(this.rubroestructuraConstantesFunciones.activarid_sucursalRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_estructuraRubroEstructura.setEnabled(this.rubroestructuraConstantesFunciones.activarid_estructuraRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jComboBoxid_rubro_empleaRubroEstructura.setEnabled(this.rubroestructuraConstantesFunciones.activarid_rubro_empleaRubroEstructura);
		this.jInternalFrameDetalleFormRubroEstructura.jCheckBoxesta_activoRubroEstructura.setEnabled(this.rubroestructuraConstantesFunciones.activaresta_activoRubroEstructura);
		}
	}
	
		
}