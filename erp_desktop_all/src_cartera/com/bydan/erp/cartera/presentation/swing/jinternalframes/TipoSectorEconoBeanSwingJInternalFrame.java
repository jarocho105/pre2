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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoSectorEconoConstantesFunciones;
import com.bydan.erp.cartera.util.TipoSectorEconoParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoSectorEconoParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoSectorEconoBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class TipoSectorEconoBeanSwingJInternalFrame extends TipoSectorEconoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoSectorEconoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoSectorEcono> tiposectoreconoValidator = new ClassValidator<TipoSectorEcono>(TipoSectorEcono.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoSectorEcono tiposectorecono;	
	public TipoSectorEcono tiposectoreconoAux;
	public TipoSectorEcono tiposectoreconoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoSectorEcono tiposectoreconoTotales;
	public Long idTipoSectorEconoActual;
	public Long iIdNuevoTipoSectorEcono=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosReferenciaComercial=false;

	public Boolean getIsTienePermisosReferenciaComercial() {
		return isTienePermisosReferenciaComercial;
	}

	public void setIsTienePermisosReferenciaComercial(Boolean isTienePermisosReferenciaComercial) {
		this.isTienePermisosReferenciaComercial= isTienePermisosReferenciaComercial;
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
	
	public Boolean isPermisoTodoTipoSectorEcono;
	public Boolean isPermisoNuevoTipoSectorEcono;
	public Boolean isPermisoActualizarTipoSectorEcono;
	public Boolean isPermisoActualizarOriginalTipoSectorEcono;
	public Boolean isPermisoEliminarTipoSectorEcono;
	public Boolean isPermisoGuardarCambiosTipoSectorEcono;
	public Boolean isPermisoConsultaTipoSectorEcono;
	public Boolean isPermisoBusquedaTipoSectorEcono;
	public Boolean isPermisoReporteTipoSectorEcono;
	public Boolean isPermisoPaginacionMedioTipoSectorEcono;
	public Boolean isPermisoPaginacionAltoTipoSectorEcono;
	public Boolean isPermisoPaginacionTodoTipoSectorEcono;
	public Boolean isPermisoCopiarTipoSectorEcono;
	public Boolean isPermisoVerFormTipoSectorEcono;
	public Boolean isPermisoDuplicarTipoSectorEcono;
	public Boolean isPermisoOrdenTipoSectorEcono;
	
	
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
	
	public TipoSectorEconoParameterReturnGeneral tiposectoreconoReturnGeneral;
	public TipoSectorEconoParameterReturnGeneral tiposectoreconoParameterGeneral;
	
	

	public ReferenciaComercialLogic referenciacomercialLogic=null;

	public ReferenciaComercialLogic getReferenciaComercialLogic() {
		return referenciacomercialLogic;
	}

	public void setReferenciaComercialLogic(ReferenciaComercialLogic referenciacomercialLogic) {
		this.referenciacomercialLogic = referenciacomercialLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoSectorEcono=false;
	public Boolean esParaAccionDesdeFormularioTipoSectorEcono=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoSectorEconoSessionBeanAdditional tiposectoreconoSessionBeanAdditional=null;
	
	public TipoSectorEconoSessionBeanAdditional getTipoSectorEconoSessionBeanAdditional() {
		return this.tiposectoreconoSessionBeanAdditional;
	}
	
	public void setTipoSectorEconoSessionBeanAdditional(TipoSectorEconoSessionBeanAdditional tiposectoreconoSessionBeanAdditional) {
		try {
			this.tiposectoreconoSessionBeanAdditional=tiposectoreconoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoSectorEconoBeanSwingJInternalFrameAdditional tiposectoreconoBeanSwingJInternalFrameAdditional=null;
	//public class TipoSectorEconoBeanSwingJInternalFrame
	
	public TipoSectorEconoBeanSwingJInternalFrameAdditional getTipoSectorEconoBeanSwingJInternalFrameAdditional() {
		return this.tiposectoreconoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoSectorEconoBeanSwingJInternalFrameAdditional(TipoSectorEconoBeanSwingJInternalFrameAdditional tiposectoreconoBeanSwingJInternalFrameAdditional) {
		try {
			this.tiposectoreconoBeanSwingJInternalFrameAdditional=tiposectoreconoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoSectorEconoLogic tiposectoreconoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoSectorEcono tiposectoreconoBean;
	public TipoSectorEconoConstantesFunciones tiposectoreconoConstantesFunciones;
	//public TipoSectorEconoParameterReturnGeneral tiposectoreconoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoSectorEcono> tiposectoreconos;	
	//public List<TipoSectorEcono> tiposectoreconosEliminados;
	//public List<TipoSectorEcono> tiposectoreconosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoSectorEcono=false;
	public Boolean isVisibilidadCeldaDuplicarTipoSectorEcono=true;
	public Boolean isVisibilidadCeldaCopiarTipoSectorEcono=true;
	public Boolean isVisibilidadCeldaVerFormTipoSectorEcono=true;
	public Boolean isVisibilidadCeldaOrdenTipoSectorEcono=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=false;
	public Boolean isVisibilidadCeldaModificarTipoSectorEcono=false;
	public Boolean isVisibilidadCeldaActualizarTipoSectorEcono=false;
	public Boolean isVisibilidadCeldaEliminarTipoSectorEcono=false;
	public Boolean isVisibilidadCeldaCancelarTipoSectorEcono=false;
	public Boolean isVisibilidadCeldaGuardarTipoSectorEcono=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoSectorEcono=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoSectorEcono() {
		return this.iIdNuevoTipoSectorEcono;
	}

	public void setiIdNuevoTipoSectorEcono(Long iIdNuevoTipoSectorEcono) {
		this.iIdNuevoTipoSectorEcono = iIdNuevoTipoSectorEcono;
	}
	
	public Long getidTipoSectorEconoActual() {
		return this.idTipoSectorEconoActual;
	}

	public void setidTipoSectorEconoActual(Long idTipoSectorEconoActual) {
		this.idTipoSectorEconoActual = idTipoSectorEconoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoSectorEcono gettiposectorecono() {
		return this.tiposectorecono;
	}

	public void settiposectorecono(TipoSectorEcono tiposectorecono) {
		this.tiposectorecono = tiposectorecono;
	}
	
	public TipoSectorEcono gettiposectoreconoAux() {
		return this.tiposectoreconoAux;
	}

	public void settiposectoreconoAux(TipoSectorEcono tiposectoreconoAux) {
		this.tiposectoreconoAux = tiposectoreconoAux;
	}				
	
	public TipoSectorEcono gettiposectoreconoAnterior() {
		return this.tiposectoreconoAnterior;
	}

	public void settiposectoreconoAnterior(TipoSectorEcono tiposectoreconoAnterior) {
		this.tiposectoreconoAnterior = tiposectoreconoAnterior;
	}	
	
	public TipoSectorEcono gettiposectoreconoTotales() {
		return this.tiposectoreconoTotales;
	}

	public void settiposectoreconoTotales(TipoSectorEcono tiposectoreconoTotales) {
		this.tiposectoreconoTotales = tiposectoreconoTotales;
	}	
	
	public TipoSectorEcono gettiposectoreconoBean() {
		return this.tiposectoreconoBean;
	}

	public void settiposectoreconoBean(TipoSectorEcono tiposectoreconoBean) {
		this.tiposectoreconoBean = tiposectoreconoBean;
	}	
	
	public TipoSectorEconoParameterReturnGeneral gettiposectoreconoReturnGeneral() {
		return this.tiposectoreconoReturnGeneral;
	}

	public void settiposectoreconoReturnGeneral(TipoSectorEconoParameterReturnGeneral tiposectoreconoReturnGeneral) {
		this.tiposectoreconoReturnGeneral = tiposectoreconoReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
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
	
	
	public TipoSectorEconoLogic getTipoSectorEconoLogic()	{		
		return tiposectoreconoLogic;
	}

	public void setTipoSectorEconoLogic(TipoSectorEconoLogic tiposectoreconoLogic) {
		this.tiposectoreconoLogic = tiposectoreconoLogic;
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
	
	public Boolean getIsEsNuevoTipoSectorEcono() {
		return isEsNuevoTipoSectorEcono;
	}

	public void setIsEsNuevoTipoSectorEcono(Boolean isEsNuevoTipoSectorEcono) {
		this.isEsNuevoTipoSectorEcono = isEsNuevoTipoSectorEcono;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoSectorEcono() {
		return esParaAccionDesdeFormularioTipoSectorEcono;
	}
	
	public void setEsParaAccionDesdeFormularioTipoSectorEcono(Boolean esParaAccionDesdeFormularioTipoSectorEcono) {
		this.esParaAccionDesdeFormularioTipoSectorEcono = esParaAccionDesdeFormularioTipoSectorEcono;
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

			if(this.tiposectoreconoSessionBean==null) {
				this.tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
			}

			if(!this.tiposectoreconoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiposectoreconoSessionBean.getlidEmpresaActual());
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

					if(this.tiposectorecono!=null) {
						this.tiposectorecono.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
						this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoSectorEcono.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
						if(this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoSectorEconoGenerico)throws Exception
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
				jComboBoxid_empresaTipoSectorEconoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoSectorEconoGenerico!=null && jComboBoxid_empresaTipoSectorEconoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoSectorEconoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoSectorEcono tiposectorecono,JComboBox jComboBoxid_empresaTipoSectorEconoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoSectorEconoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoSectorEconoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiposectorecono.setid_empresa(empresaAux.getId());
				tiposectorecono.setempresa_descripcion(TipoSectorEconoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiposectorecono.setEmpresa(empresaAux);			}
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

					if(!TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { 
							this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { 
					}

					if(!TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
							this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
							this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoSectorEcono() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoSectorEconoConstantesFunciones.refrescarForeignKeysDescripcionesTipoSectorEcono(this.tiposectoreconoLogic.getTipoSectorEconos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoSectorEconoConstantesFunciones.refrescarForeignKeysDescripcionesTipoSectorEcono(this.tiposectoreconos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiposectoreconoLogic.setTipoSectorEconos(this.tiposectoreconos);
			tiposectoreconoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoSectorEconoParameterReturnGeneral getTipoSectorEconoParameterGeneral() {
		return this.tiposectoreconoParameterGeneral;
	}
	
	public void setTipoSectorEconoParameterGeneral(TipoSectorEconoParameterReturnGeneral tiposectoreconoParameterGeneral) {
		this.tiposectoreconoParameterGeneral = tiposectoreconoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoSectorEcono() {
		return isPermisoTodoTipoSectorEcono;
	}

	public void setIsPermisoTodoTipoSectorEcono(Boolean isPermisoTodoTipoSectorEcono) {
		this.isPermisoTodoTipoSectorEcono = isPermisoTodoTipoSectorEcono;
	}

	public Boolean getIsPermisoNuevoTipoSectorEcono() {
		return isPermisoNuevoTipoSectorEcono;
	}

	public void setIsPermisoNuevoTipoSectorEcono(Boolean isPermisoNuevoTipoSectorEcono) {
		this.isPermisoNuevoTipoSectorEcono = isPermisoNuevoTipoSectorEcono;
	}

	public Boolean getIsPermisoActualizarTipoSectorEcono() {
		return isPermisoActualizarTipoSectorEcono;
	}

	public void setIsPermisoActualizarTipoSectorEcono(Boolean isPermisoActualizarTipoSectorEcono) {
		this.isPermisoActualizarTipoSectorEcono = isPermisoActualizarTipoSectorEcono;
	}

	public Boolean getIsPermisoEliminarTipoSectorEcono() {
		return isPermisoEliminarTipoSectorEcono;
	}

	public void setIsPermisoEliminarTipoSectorEcono(Boolean isPermisoEliminarTipoSectorEcono) {
		this.isPermisoEliminarTipoSectorEcono = isPermisoEliminarTipoSectorEcono;
	}

	public Boolean getIsPermisoGuardarCambiosTipoSectorEcono() {
		return isPermisoGuardarCambiosTipoSectorEcono;
	}

	public void setIsPermisoGuardarCambiosTipoSectorEcono(Boolean isPermisoGuardarCambiosTipoSectorEcono) {
		this.isPermisoGuardarCambiosTipoSectorEcono = isPermisoGuardarCambiosTipoSectorEcono;
	}
	
	public Boolean getIsPermisoConsultaTipoSectorEcono() {
		return isPermisoConsultaTipoSectorEcono;
	}

	public void setIsPermisoConsultaTipoSectorEcono(Boolean isPermisoConsultaTipoSectorEcono) {
		this.isPermisoConsultaTipoSectorEcono = isPermisoConsultaTipoSectorEcono;
	}

	public Boolean getIsPermisoBusquedaTipoSectorEcono() {
		return isPermisoBusquedaTipoSectorEcono;
	}

	public void setIsPermisoBusquedaTipoSectorEcono(Boolean isPermisoBusquedaTipoSectorEcono) {
		this.isPermisoBusquedaTipoSectorEcono = isPermisoBusquedaTipoSectorEcono;
	}

	public Boolean getIsPermisoReporteTipoSectorEcono() {
		return isPermisoReporteTipoSectorEcono;
	}

	public void setIsPermisoReporteTipoSectorEcono(Boolean isPermisoReporteTipoSectorEcono) {
		this.isPermisoReporteTipoSectorEcono = isPermisoReporteTipoSectorEcono;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoSectorEcono() {
		return isPermisoPaginacionMedioTipoSectorEcono;
	}

	public void setIsPermisoPaginacionMedioTipoSectorEcono(Boolean isPermisoPaginacionMedioTipoSectorEcono) {
		this.isPermisoPaginacionMedioTipoSectorEcono = isPermisoPaginacionMedioTipoSectorEcono;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoSectorEcono() {
		return isPermisoPaginacionTodoTipoSectorEcono;
	}

	public void setIsPermisoPaginacionTodoTipoSectorEcono(Boolean isPermisoPaginacionTodoTipoSectorEcono) {
		this.isPermisoPaginacionTodoTipoSectorEcono = isPermisoPaginacionTodoTipoSectorEcono;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoSectorEcono() {
		return isPermisoPaginacionAltoTipoSectorEcono;
	}

	public void setIsPermisoPaginacionAltoTipoSectorEcono(Boolean isPermisoPaginacionAltoTipoSectorEcono) {
		this.isPermisoPaginacionAltoTipoSectorEcono = isPermisoPaginacionAltoTipoSectorEcono;
	}
	
	public Boolean getIsPermisoCopiarTipoSectorEcono() {
		return isPermisoCopiarTipoSectorEcono;
	}

	public void setIsPermisoCopiarTipoSectorEcono(Boolean isPermisoCopiarTipoSectorEcono) {
		this.isPermisoCopiarTipoSectorEcono = isPermisoCopiarTipoSectorEcono;
	}
	
	public Boolean getIsPermisoVerFormTipoSectorEcono() {
		return isPermisoVerFormTipoSectorEcono;
	}

	public void setIsPermisoVerFormTipoSectorEcono(Boolean isPermisoVerFormTipoSectorEcono) {
		this.isPermisoVerFormTipoSectorEcono = isPermisoVerFormTipoSectorEcono;
	}
	
	public Boolean getIsPermisoDuplicarTipoSectorEcono() {
		return isPermisoDuplicarTipoSectorEcono;
	}

	public void setIsPermisoDuplicarTipoSectorEcono(Boolean isPermisoDuplicarTipoSectorEcono) {
		this.isPermisoDuplicarTipoSectorEcono = isPermisoDuplicarTipoSectorEcono;
	}
	
	public Boolean getIsPermisoOrdenTipoSectorEcono() {
		return isPermisoOrdenTipoSectorEcono;
	}

	public void setIsPermisoOrdenTipoSectorEcono(Boolean isPermisoOrdenTipoSectorEcono) {
		this.isPermisoOrdenTipoSectorEcono = isPermisoOrdenTipoSectorEcono;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoSectorEcono() {
		return isVisibilidadCeldaNuevoTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaNuevoTipoSectorEcono(Boolean isVisibilidadCeldaNuevoTipoSectorEcono) {
		this.isVisibilidadCeldaNuevoTipoSectorEcono = isVisibilidadCeldaNuevoTipoSectorEcono;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoSectorEcono() {
		return isVisibilidadCeldaDuplicarTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaDuplicarTipoSectorEcono(Boolean isVisibilidadCeldaDuplicarTipoSectorEcono) {
		this.isVisibilidadCeldaDuplicarTipoSectorEcono = isVisibilidadCeldaDuplicarTipoSectorEcono;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoSectorEcono() {
		return isVisibilidadCeldaCopiarTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaCopiarTipoSectorEcono(Boolean isVisibilidadCeldaCopiarTipoSectorEcono) {
		this.isVisibilidadCeldaCopiarTipoSectorEcono = isVisibilidadCeldaCopiarTipoSectorEcono;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoSectorEcono() {
		return isVisibilidadCeldaVerFormTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaVerFormTipoSectorEcono(Boolean isVisibilidadCeldaVerFormTipoSectorEcono) {
		this.isVisibilidadCeldaVerFormTipoSectorEcono = isVisibilidadCeldaVerFormTipoSectorEcono;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoSectorEcono() {
		return isVisibilidadCeldaOrdenTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaOrdenTipoSectorEcono(Boolean isVisibilidadCeldaOrdenTipoSectorEcono) {
		this.isVisibilidadCeldaOrdenTipoSectorEcono = isVisibilidadCeldaOrdenTipoSectorEcono;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoSectorEcono() {
		return isVisibilidadCeldaNuevoRelacionesTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoSectorEcono(Boolean isVisibilidadCeldaNuevoRelacionesTipoSectorEcono) {
		this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono = isVisibilidadCeldaNuevoRelacionesTipoSectorEcono;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoSectorEcono() {
		return isVisibilidadCeldaModificarTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaModificarTipoSectorEcono(Boolean isVisibilidadCeldaModificarTipoSectorEcono) {
		this.isVisibilidadCeldaModificarTipoSectorEcono = isVisibilidadCeldaModificarTipoSectorEcono;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoSectorEcono() {
		return isVisibilidadCeldaActualizarTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaActualizarTipoSectorEcono(Boolean isVisibilidadCeldaActualizarTipoSectorEcono) {
		this.isVisibilidadCeldaActualizarTipoSectorEcono = isVisibilidadCeldaActualizarTipoSectorEcono;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoSectorEcono() {
		return isVisibilidadCeldaEliminarTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaEliminarTipoSectorEcono(Boolean isVisibilidadCeldaEliminarTipoSectorEcono) {
		this.isVisibilidadCeldaEliminarTipoSectorEcono = isVisibilidadCeldaEliminarTipoSectorEcono;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoSectorEcono() {
		return isVisibilidadCeldaCancelarTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaCancelarTipoSectorEcono(Boolean isVisibilidadCeldaCancelarTipoSectorEcono) {
		this.isVisibilidadCeldaCancelarTipoSectorEcono = isVisibilidadCeldaCancelarTipoSectorEcono;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoSectorEcono() {
		return isVisibilidadCeldaGuardarTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaGuardarTipoSectorEcono(Boolean isVisibilidadCeldaGuardarTipoSectorEcono) {
		this.isVisibilidadCeldaGuardarTipoSectorEcono = isVisibilidadCeldaGuardarTipoSectorEcono;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoSectorEcono() {
		return isVisibilidadCeldaGuardarCambiosTipoSectorEcono;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoSectorEcono(Boolean isVisibilidadCeldaGuardarCambiosTipoSectorEcono) {
		this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono = isVisibilidadCeldaGuardarCambiosTipoSectorEcono;
	}
		
	public TipoSectorEconoSessionBean gettiposectoreconoSessionBean() {
		return this.tiposectoreconoSessionBean;
	}
	
	public void settiposectoreconoSessionBean(TipoSectorEconoSessionBean tiposectoreconoSessionBean) {
		this.tiposectoreconoSessionBean=tiposectoreconoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(TipoSectorEcono tiposectorecono)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiposectorecono,null);
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
	
	public void bugActualizarReferenciaActual(TipoSectorEcono tiposectorecono,TipoSectorEcono tiposectoreconoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoSectorEcono(tiposectorecono);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiposectoreconoAux.setId(tiposectorecono.getId());
		tiposectoreconoAux.setVersionRow(tiposectorecono.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoSectorEcono();
		
			int intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.tiposectorecono,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiposectoreconoValidator.getInvalidValues(this.tiposectorecono);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiposectoreconoLogic.setDatosCliente(datosCliente);
			tiposectoreconoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiposectoreconoAux=new  TipoSectorEcono();
				
				tiposectoreconoAux.setIsNew(true);
				tiposectoreconoAux.setIsChanged(true);
				
				tiposectoreconoAux.setTipoSectorEconoOriginal(this.tiposectorecono);
				
				tiposectoreconoAux.setId(this.tiposectorecono.getId());	
				tiposectoreconoAux.setVersionRow(this.tiposectorecono.getVersionRow());	
				tiposectoreconoAux.setid_empresa(this.tiposectorecono.getid_empresa());	
				tiposectoreconoAux.setcodigo(this.tiposectorecono.getcodigo());	
				tiposectoreconoAux.setnombre(this.tiposectorecono.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposectoreconoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiposectoreconoAux,tiposectoreconoLogic.getTipoSectorEconos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposectoreconoAux,tiposectoreconos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposectoreconoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconoLogic.saveTipoSectorEconos();//WithConnection
						//tiposectoreconoLogic.getSetVersionRowTipoSectorEconos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposectorecono,tiposectoreconoAux);
					
					this.refrescarForeignKeysDescripcionesTipoSectorEcono();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials().addAll(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercials.addAll(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposectoreconoLogic.saveTipoSectorEconoRelaciones(tiposectoreconoAux,this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());//WithConnection
								//tiposectoreconoLogic.getSetVersionRowTipoSectorEconos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiposectorecono,tiposectoreconoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercials= new ArrayList<ReferenciaComercial>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.quitarFilaTotales();}
							tiposectoreconoAux.setReferenciaComercials(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiposectoreconoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiposectoreconoAux,tiposectoreconoLogic.getTipoSectorEconos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiposectoreconoAux,tiposectoreconos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiposectorecono,tiposectoreconoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiposectoreconoAux=new  TipoSectorEcono();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado() 
					|| (this.tiposectoreconoSessionBean.getEsGuardarRelacionado() && this.tiposectorecono.getId()>=0)) {
						
					tiposectoreconoAux.setIsNew(false);
				}
				
				tiposectoreconoAux.setIsDeleted(false);
			
				tiposectoreconoAux.setId(this.tiposectorecono.getId());	
				tiposectoreconoAux.setVersionRow(this.tiposectorecono.getVersionRow());	
				tiposectoreconoAux.setid_empresa(this.tiposectorecono.getid_empresa());	
				tiposectoreconoAux.setcodigo(this.tiposectorecono.getcodigo());	
				tiposectoreconoAux.setnombre(this.tiposectorecono.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposectoreconoAux,tiposectoreconoLogic.getTipoSectorEconos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposectoreconoAux,tiposectoreconos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposectoreconoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconoLogic.saveTipoSectorEconos();//WithConnection
						//tiposectoreconoLogic.getSetVersionRowTipoSectorEconos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposectorecono,tiposectoreconoAux);
					
					this.refrescarForeignKeysDescripcionesTipoSectorEcono();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials().addAll(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercials.addAll(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposectoreconoLogic.saveTipoSectorEconoRelaciones(tiposectoreconoAux,this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());//WithConnection
								//tiposectoreconoLogic.getSetVersionRowTipoSectorEconos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiposectorecono,tiposectoreconoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercials= new ArrayList<ReferenciaComercial>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.quitarFilaTotales();}
							tiposectoreconoAux.setReferenciaComercials(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiposectoreconoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiposectoreconoAux,tiposectoreconoLogic.getTipoSectorEconos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiposectoreconoAux,tiposectoreconos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiposectorecono,tiposectoreconoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiposectoreconoAux=new  TipoSectorEcono();
				
				tiposectoreconoAux.setIsNew(false);
				tiposectoreconoAux.setIsChanged(false);
				
				tiposectoreconoAux.setIsDeleted(true);
				
				tiposectoreconoAux.setId(this.tiposectorecono.getId());	
				tiposectoreconoAux.setVersionRow(this.tiposectorecono.getVersionRow());	
				tiposectoreconoAux.setid_empresa(this.tiposectorecono.getid_empresa());	
				tiposectoreconoAux.setcodigo(this.tiposectorecono.getcodigo());	
				tiposectoreconoAux.setnombre(this.tiposectorecono.getnombre());	
				
				if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiposectoreconoAux.getId()>=0) {	
						this.tiposectoreconosEliminados.add(tiposectoreconoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiposectoreconoAux,tiposectoreconoLogic.getTipoSectorEconos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposectoreconoAux,tiposectoreconos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposectoreconoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconoLogic.saveTipoSectorEconos();//WithConnection
						//tiposectoreconoLogic.getSetVersionRowTipoSectorEconos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials().addAll(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercials.addAll(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposectoreconoLogic.saveTipoSectorEconoRelaciones(tiposectoreconoAux,this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());//WithConnection
								//tiposectoreconoLogic.getSetVersionRowTipoSectorEconos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercials= new ArrayList<ReferenciaComercial>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.quitarFilaTotales();}
							tiposectoreconoAux.setReferenciaComercials(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiposectoreconoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiposectoreconoAux,tiposectoreconoLogic.getTipoSectorEconos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiposectoreconoAux,tiposectoreconos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.getTipoSectorEconos().addAll(this.tiposectoreconosEliminados);
					
					tiposectoreconoLogic.saveTipoSectorEconos();//WithConnection
					//tiposectoreconoLogic.getSetVersionRowTipoSectorEconos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoSectorEcono();
				
				this.tiposectoreconosEliminados= new ArrayList<TipoSectorEcono>();		
			}
			
			if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Sector Econo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Sector Econo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiposectorecono=tiposectoreconoAux;
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
      		//this.finishProcessTipoSectorEcono();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoSectorEcono tiposectoreconoLocal) throws Exception {
		
		if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiposectoreconoLocal.setReferenciaComercials(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());
			
			} else {
			
				tiposectoreconoLocal.setReferenciaComercials(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercials);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoSectorEcono tiposectoreconoLocal) throws Exception {	
		if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiposectoreconoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoSectorEconoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiposectoreconoValidator.getInvalidValues(this.tiposectorecono);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoSectorEcono tiposectorecono,List<TipoSectorEcono> tiposectoreconos) throws Exception {
		try	{		
			TipoSectorEconoConstantesFunciones.actualizarLista(tiposectorecono,tiposectoreconos,this.tiposectoreconoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoSectorEcono tiposectorecono,List<TipoSectorEcono> tiposectoreconos) throws Exception {
		try	{			
			TipoSectorEconoConstantesFunciones.actualizarSelectedLista(tiposectorecono,tiposectoreconos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoSectorEcono> tiposectoreconosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiposectoreconosLocal=this.tiposectoreconoLogic.getTipoSectorEconos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiposectoreconosLocal=this.tiposectoreconos;
			}
			//ARCHITECTURE
		
			for(TipoSectorEcono tiposectoreconoLocal:tiposectoreconosLocal) {
				if(this.permiteMantenimiento(tiposectoreconoLocal) && tiposectoreconoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoSectorEconoConstantesFunciones.getTipoSectorEconoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoSectorEconoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSectorEcono.jLabelid_empresaTipoSectorEcono,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoSectorEconoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSectorEcono.jLabelcodigoTipoSectorEcono,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoSectorEconoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSectorEcono.jLabelnombreTipoSectorEcono,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSectorEcono.jLabelid_empresaTipoSectorEcono,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSectorEcono.jLabelcodigoTipoSectorEcono,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSectorEcono.jLabelnombreTipoSectorEcono,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ReferenciaComercial")) {
			if(this.tiposectorecono==null) {
				this.tiposectorecono= new TipoSectorEcono();
			}

			if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoSectorEcono
				this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.tiposectorecono,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);

				this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.getreferenciacomercial().setTipoSectorEcono(this.tiposectorecono);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoSectorEcono--;	
		
		
		this.tiposectoreconoAux=new TipoSectorEcono();
		
		this.tiposectoreconoAux.setId(this.iIdNuevoTipoSectorEcono);
		this.tiposectoreconoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposectoreconoLogic.getTipoSectorEconos().add(this.tiposectoreconoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiposectoreconos.add(this.tiposectoreconoAux);
		}
		//ARCHITECTURE
		
		this.tiposectorecono=this.tiposectoreconoAux;
		
		if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoSectorEcono(this.tiposectorecono);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoSectorEcono(this.tiposectorecono);
		}
				
		//this.setDefaultControlesTipoSectorEcono();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoSectorEcono();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoSectorEcono();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSectorEcono();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoSectorEcono(this.tiposectoreconoBean,this.tiposectorecono,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoSectorEconoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
			classes=TipoSectorEconoConstantesFunciones.getClassesRelationshipsOfTipoSectorEcono(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiposectoreconoReturnGeneral=tiposectoreconoLogic.procesarEventosTipoSectorEconosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposectoreconoLogic.getTipoSectorEconos(),this.tiposectorecono,this.tiposectoreconoParameterGeneral,this.isEsNuevoTipoSectorEcono,classes);//this.tiposectoreconoLogic.getTipoSectorEcono()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoSectorEcono(this.tiposectoreconoReturnGeneral,this.tiposectoreconoBean,false);
		
		if(this.tiposectoreconoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoSectorEcono(this.tiposectoreconoReturnGeneral.getTipoSectorEcono());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoSectorEcono(this.tiposectoreconoReturnGeneral.getTipoSectorEcono());
		}
		
		if(this.tiposectoreconoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoSectorEcono(this.tiposectoreconoReturnGeneral.getTipoSectorEcono(),classes);//this.tiposectoreconoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.tiposectorecono,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoSectorEcono();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoSectorEcono();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.RecargarFormTipoSectorEcono(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoSectorEcono(false);
						
			if(tiposectoreconoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.getEsGuardarRelacionado() && ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaComercialActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSectorEcono();
			}
			
			this.actualizarVisualTableDatosTipoSectorEcono();
			
			this.jTableDatosTipoSectorEcono.setRowSelectionInterval(this.getIndiceNuevoTipoSectorEcono(), this.getIndiceNuevoTipoSectorEcono());
			
			this.seleccionarFilaTablaTipoSectorEconoActual();
						
			this.actualizarEstadoCeldasBotonesTipoSectorEcono("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoSectorEcono(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jTextFieldcodigoTipoSectorEcono.setEnabled(isHabilitar && this.tiposectoreconoConstantesFunciones.activarcodigoTipoSectorEcono);
		this.jInternalFrameDetalleFormTipoSectorEcono.jTextAreanombreTipoSectorEcono.setEnabled(isHabilitar && this.tiposectoreconoConstantesFunciones.activarnombreTipoSectorEcono);	
		//
		this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.setEnabled(isHabilitar && this.tiposectoreconoConstantesFunciones.activarid_empresaTipoSectorEcono);
	};
	
	public void setDefaultControlesTipoSectorEcono() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoSectorEcono(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiposectoreconoSessionBean.setConGuardarRelaciones(true);			
			this.tiposectoreconoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoSectorEcono.jTabbedPaneRelacionesTipoSectorEcono.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiposectoreconoSessionBean.setConGuardarRelaciones(false);			
			this.tiposectoreconoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoSectorEcono.jTabbedPaneRelacionesTipoSectorEcono.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoSectorEcono() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconoLogic.getTipoSectorEconos()) {
				if(tiposectoreconoAux.getId().equals(this.iIdNuevoTipoSectorEcono)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconos) {
				if(tiposectoreconoAux.getId().equals(this.iIdNuevoTipoSectorEcono)) {
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
	
	public int getIndiceActualTipoSectorEcono(TipoSectorEcono tiposectorecono,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconoLogic.getTipoSectorEconos()) {
				if(tiposectoreconoAux.getId().equals(tiposectorecono.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconos) {
				if(tiposectoreconoAux.getId().equals(tiposectorecono.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoSectorEcono(TipoSectorEcono tiposectoreconoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconoLogic.getTipoSectorEconos()) {
				if(tiposectoreconoAux.getTipoSectorEconoOriginal().getId().equals(tiposectoreconoOriginal.getId())) {
					existe=true;
					tiposectoreconoOriginal.setId(tiposectoreconoAux.getId());
					tiposectoreconoOriginal.setVersionRow(tiposectoreconoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconos) {
				if(tiposectoreconoAux.getTipoSectorEconoOriginal().getId().equals(tiposectoreconoOriginal.getId())) {
					existe=true;
					tiposectoreconoOriginal.setId(tiposectoreconoAux.getId());
					tiposectoreconoOriginal.setVersionRow(tiposectoreconoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoSectorEcono(Boolean esParaCancelar) throws Exception {
		tiposectoreconosAux=new ArrayList<TipoSectorEcono>();
		tiposectoreconoAux=new TipoSectorEcono();
		
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconoLogic.getTipoSectorEconos()) {
					if(tiposectoreconoAux.getId()<0) {
						tiposectoreconosAux.add(tiposectoreconoAux);
					}		
				}
				this.iIdNuevoTipoSectorEcono=0L;
				this.tiposectoreconoLogic.getTipoSectorEconos().removeAll(tiposectoreconosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconos) {
					if(tiposectoreconoAux.getId()<0) {
						tiposectoreconosAux.add(tiposectoreconoAux);
					}		
				}
				this.iIdNuevoTipoSectorEcono=0L;
				this.tiposectoreconos.removeAll(tiposectoreconosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoSectorEcono 
					&& this.tiposectoreconoLogic.getTipoSectorEconos().size()>0
					) {
					tiposectoreconoAux=this.tiposectoreconoLogic.getTipoSectorEconos().get(this.tiposectoreconoLogic.getTipoSectorEconos().size() - 1);
				
					if(tiposectoreconoAux.getId()<0) {
						this.tiposectoreconoLogic.getTipoSectorEconos().remove(tiposectoreconoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoSectorEcono && this.tiposectoreconos.size()>0) {
					tiposectoreconoAux=this.tiposectoreconos.get(this.tiposectoreconos.size() - 1);
				
					if(tiposectoreconoAux.getId()<0) {
						this.tiposectoreconos.remove(tiposectoreconoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoSectorEcono(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiposectorecono.getId()<0) {
				this.tiposectoreconoLogic.getTipoSectorEconos().remove(this.tiposectorecono);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiposectorecono.getId()<0) {
				this.tiposectoreconos.remove(this.tiposectorecono);
			}
		}			
	}
	
	public void setEstadosInicialesTipoSectorEcono(List<TipoSectorEcono> tiposectoreconosAux) throws Exception {
		TipoSectorEconoConstantesFunciones.setEstadosInicialesTipoSectorEcono(tiposectoreconosAux);
	}
	
	public void setEstadosInicialesTipoSectorEcono(TipoSectorEcono tiposectoreconoAux) throws Exception {
		TipoSectorEconoConstantesFunciones.setEstadosInicialesTipoSectorEcono(tiposectoreconoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoSectorEconoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoSectorEcono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoSectorEconoActual()) {
				if(!this.isEsNuevoTipoSectorEcono) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoSectorEcono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoSectorEcono=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoSectorEconoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Sector Econo ?", "MANTENIMIENTO DE Tipo Sector Econo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoSectorEcono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoSectorEcono tiposectorecono) throws Exception {
		TipoSectorEconoConstantesFunciones.seleccionarAsignar(this.tiposectorecono,tiposectorecono);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoSectorEcono=this.isPermisoActualizarOriginalTipoSectorEcono;
			
			
			this.seleccionarAsignar(tiposectorecono);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoSectorEconoConstantesFunciones.quitarEspaciosTipoSectorEcono(this.tiposectorecono,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoSectorEcono("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiposectoreconoSessionBean.setsFuncionBusquedaRapida(this.tiposectoreconoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoSectorEcono) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoSectorEcono(esParaCancelar);				
				this.cancelarNuevoTipoSectorEcono(esParaCancelar);								
			}
			
			this.tiposectorecono=new TipoSectorEcono();
			
			this.inicializarTipoSectorEcono();
			
			this.actualizarEstadoCeldasBotonesTipoSectorEcono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoSectorEcono() throws Exception {
		try {
			TipoSectorEconoConstantesFunciones.inicializarTipoSectorEcono(this.tiposectorecono);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiposectoreconoLogic.getTipoSectorEconos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoSectorEconos(String sAccionBusqueda,List<TipoSectorEcono> tiposectoreconosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoSectorEcono"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoSectorEconoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoSectorEconoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoSectorEcono"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Sector Econos");		
		parameters.put("busquedapor", TipoSectorEconoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ReferenciaComercial.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoSectorEconoLogic tiposectoreconoLogicAuxiliar=new TipoSectorEconoLogic();
					tiposectoreconoLogicAuxiliar.setDatosCliente(tiposectoreconoLogic.getDatosCliente());				
					tiposectoreconoLogicAuxiliar.setTipoSectorEconos(tiposectoreconosParaReportes);
					
					tiposectoreconoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoSectorEconoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiposectoreconosParaReportes=tiposectoreconoLogicAuxiliar.getTipoSectorEconos();
					
					//tiposectoreconoLogic.getNewConnexionToDeep();
					
					//for (TipoSectorEcono tiposectorecono:tiposectoreconosParaReportes) {
					//	tiposectoreconoLogic.deepLoad(tiposectorecono, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiposectoreconoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiposectoreconoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileReferenciaComercial = AuxiliarReportes.class.getResourceAsStream("ReferenciaComercialDetalleRelacionesDesign.jasper");
			parameters.put("subreport_referenciacomercial", reportFileReferenciaComercial);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoSectorEcono=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoSectorEconoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoSectorEconoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoSectorEcono=new JRBeanArrayDataSource(TipoSectorEconoJInternalFrame.TraerTipoSectorEconoBeans(tiposectoreconosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoSectorEcono);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoSectorEconoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoSectorEconoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoSectorEconoBean.TraerTipoSectorEconoBeans(tiposectoreconosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoSectorEconos(sAccionBusqueda,sTipoArchivoReporte,tiposectoreconosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoSectorEconos(sAccionBusqueda,sTipoArchivoReporte,tiposectoreconosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoSectorEconoActionPerformed(null);
					//this.generarExcelReporteTipoSectorEconos(sAccionBusqueda,sTipoArchivoReporte,tiposectoreconosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoSectorEconos(sAccionBusqueda,sTipoArchivoReporte,tiposectoreconosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoSectorEconos(sAccionBusqueda,sTipoArchivoReporte,tiposectoreconosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoSectorEconos(sAccionBusqueda,sTipoArchivoReporte,tiposectoreconosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoSectorEconos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSectorEcono> tiposectoreconosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposectorecono";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSectorEconos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoSectorEcono("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoSectorEcono tiposectorecono : tiposectoreconosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoSectorEconoConstantesFunciones.generarExcelReporteDataTipoSectorEcono("NORMAL",row,workbook,tiposectorecono,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sector Econo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoSectorEcono(String sTipo,Row row,Workbook workbook) {
		
		TipoSectorEconoConstantesFunciones.generarExcelReporteHeaderTipoSectorEcono(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoSectorEconos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSectorEcono> tiposectoreconosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposectorecono_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSectorEconos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoSectorEcono tiposectorecono : tiposectoreconosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoSectorEconoConstantesFunciones.getTipoSectorEconoDescripcion(tiposectorecono));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposectorecono.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSectorEconoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposectorecono.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSectorEconoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposectorecono.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sector Econo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoSectorEconos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSectorEcono> tiposectoreconosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoSectorEcono> tiposectoreconosRespaldo=null;
		
		classes=TipoSectorEconoConstantesFunciones.getClassesRelationshipsOfTipoSectorEcono(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiposectoreconoLogic.setDatosCliente(this.datosCliente);
		this.tiposectoreconoLogic.setDatosDeep(this.datosDeep);
		this.tiposectoreconoLogic.setIsConDeep(true);
		
		tiposectoreconosRespaldo=this.tiposectoreconoLogic.getTipoSectorEconos();
		
		this.tiposectoreconoLogic.setTipoSectorEconos(tiposectoreconosParaReportes);	
		this.tiposectoreconoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiposectoreconosParaReportes=this.tiposectoreconoLogic.getTipoSectorEconos();
		this.tiposectoreconoLogic.setTipoSectorEconos(tiposectoreconosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposectorecono_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSectorEconos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoSectorEcono("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoSectorEcono tiposectorecono : tiposectoreconosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoSectorEcono("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoSectorEconoConstantesFunciones.generarExcelReporteDataTipoSectorEcono("NORMAL",row,workbook,tiposectorecono,cellStyleDataAux);
		
			
			


				//ReferenciaComercial
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiposectorecono.getReferenciaComercials()!=null && tiposectorecono.getReferenciaComercials().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ReferenciaComercialConstantesFunciones.generarExcelReporteHeaderReferenciaComercial("RELACIONADO",row,workbook);
				}

				if(tiposectorecono.getReferenciaComercials()!=null) {
					i2=0;
					for(ReferenciaComercial referenciacomercial : tiposectorecono.getReferenciaComercials()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ReferenciaComercialConstantesFunciones.generarExcelReporteDataReferenciaComercial("RELACIONADO",row,workbook,referenciacomercial,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoSectorEconoConstantesFunciones.getTipoSectorEconoDescripcion(tiposectorecono));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sector Econo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoSectorEcono() throws Exception {		
		this.startProcessTipoSectorEcono(true);
	}
	
	public void startProcessTipoSectorEcono(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoSectorEcono ,this.jPanelParametrosReportesTipoSectorEcono, this.jScrollPanelDatosTipoSectorEcono,this.jPanelPaginacionTipoSectorEcono, this.jScrollPanelDatosEdicionTipoSectorEcono, this.jPanelAccionesTipoSectorEcono,this.jPanelAccionesFormularioTipoSectorEcono,this.jmenuBarTipoSectorEcono,this.jmenuBarDetalleTipoSectorEcono,this.jTtoolBarTipoSectorEcono,this.jTtoolBarDetalleTipoSectorEcono);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoSectorEcono=this.jTabbedPaneBusquedasTipoSectorEcono; 
		
		final JPanel jPanelParametrosReportesTipoSectorEcono=this.jPanelParametrosReportesTipoSectorEcono;
		//final JScrollPane jScrollPanelDatosTipoSectorEcono=this.jScrollPanelDatosTipoSectorEcono;
		final JTable jTableDatosTipoSectorEcono=this.jTableDatosTipoSectorEcono;		
		final JPanel jPanelPaginacionTipoSectorEcono=this.jPanelPaginacionTipoSectorEcono;
		//final JScrollPane jScrollPanelDatosEdicionTipoSectorEcono=this.jScrollPanelDatosEdicionTipoSectorEcono;
		final JPanel jPanelAccionesTipoSectorEcono=this.jPanelAccionesTipoSectorEcono;
		
		JPanel jPanelCamposAuxiliarTipoSectorEcono=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoSectorEcono=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			jPanelCamposAuxiliarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jPanelCamposTipoSectorEcono;
			jPanelAccionesFormularioAuxiliarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jPanelAccionesFormularioTipoSectorEcono;
		}
		
		final JPanel jPanelCamposTipoSectorEcono=jPanelCamposAuxiliarTipoSectorEcono;
		final JPanel jPanelAccionesFormularioTipoSectorEcono=jPanelAccionesFormularioAuxiliarTipoSectorEcono;
		
		
		final JMenuBar jmenuBarTipoSectorEcono=this.jmenuBarTipoSectorEcono;
		final JToolBar jTtoolBarTipoSectorEcono=this.jTtoolBarTipoSectorEcono;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoSectorEcono=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoSectorEcono=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			jmenuBarDetalleAuxiliarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jmenuBarDetalleTipoSectorEcono;
			jTtoolBarDetalleAuxiliarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jTtoolBarDetalleTipoSectorEcono;
		}
		
		final JMenuBar jmenuBarDetalleTipoSectorEcono=jmenuBarDetalleAuxiliarTipoSectorEcono;
		final JToolBar jTtoolBarDetalleTipoSectorEcono=jTtoolBarDetalleAuxiliarTipoSectorEcono;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoSectorEcono;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoSectorEcono;
			processRunnable.jTableDatos=jTableDatosTipoSectorEcono;
			processRunnable.jPanelCampos=jPanelCamposTipoSectorEcono;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoSectorEcono;
			processRunnable.jPanelAcciones=jPanelAccionesTipoSectorEcono;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoSectorEcono;
			
			
			processRunnable.jmenuBar=jmenuBarTipoSectorEcono;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoSectorEcono;
			processRunnable.jTtoolBar=jTtoolBarTipoSectorEcono;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoSectorEcono;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoSectorEcono ,jPanelParametrosReportesTipoSectorEcono,jTableDatosTipoSectorEcono, /*jScrollPanelDatosTipoSectorEcono,*/jPanelCamposTipoSectorEcono,jPanelPaginacionTipoSectorEcono, /*jScrollPanelDatosEdicionTipoSectorEcono,*/ jPanelAccionesTipoSectorEcono,jPanelAccionesFormularioTipoSectorEcono,jmenuBarTipoSectorEcono,jmenuBarDetalleTipoSectorEcono,jTtoolBarTipoSectorEcono,jTtoolBarDetalleTipoSectorEcono);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoSectorEcono ,jPanelParametrosReportesTipoSectorEcono, jScrollPanelDatosTipoSectorEcono,jPanelPaginacionTipoSectorEcono, jScrollPanelDatosEdicionTipoSectorEcono, jPanelAccionesTipoSectorEcono,jPanelAccionesFormularioTipoSectorEcono,jmenuBarTipoSectorEcono,jmenuBarDetalleTipoSectorEcono,jTtoolBarTipoSectorEcono,jTtoolBarDetalleTipoSectorEcono);
						
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
	
	public void finishProcessTipoSectorEcono() {// throws Exception 
		this.finishProcessTipoSectorEcono(true);
	}
	
	public void finishProcessTipoSectorEcono(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoSectorEcono ,this.jPanelParametrosReportesTipoSectorEcono, this.jScrollPanelDatosTipoSectorEcono,this.jPanelPaginacionTipoSectorEcono, this.jScrollPanelDatosEdicionTipoSectorEcono, this.jPanelAccionesTipoSectorEcono,this.jPanelAccionesFormularioTipoSectorEcono,this.jmenuBarTipoSectorEcono,this.jmenuBarDetalleTipoSectorEcono,this.jTtoolBarTipoSectorEcono,this.jTtoolBarDetalleTipoSectorEcono);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoSectorEcono=this.jTabbedPaneBusquedasTipoSectorEcono; 
		
		final JPanel jPanelParametrosReportesTipoSectorEcono=this.jPanelParametrosReportesTipoSectorEcono;
		//final JScrollPane jScrollPanelDatosTipoSectorEcono=this.jScrollPanelDatosTipoSectorEcono;
		final JTable jTableDatosTipoSectorEcono=this.jTableDatosTipoSectorEcono;		
		final JPanel jPanelPaginacionTipoSectorEcono=this.jPanelPaginacionTipoSectorEcono;
		//final JScrollPane jScrollPanelDatosEdicionTipoSectorEcono=this.jScrollPanelDatosEdicionTipoSectorEcono;
		final JPanel jPanelAccionesTipoSectorEcono=this.jPanelAccionesTipoSectorEcono;
		
		JPanel jPanelCamposAuxiliarTipoSectorEcono=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoSectorEcono=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			jPanelCamposAuxiliarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jPanelCamposTipoSectorEcono;
			jPanelAccionesFormularioAuxiliarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jPanelAccionesFormularioTipoSectorEcono;
		}
		
		final JPanel jPanelCamposTipoSectorEcono=jPanelCamposAuxiliarTipoSectorEcono;
		final JPanel jPanelAccionesFormularioTipoSectorEcono=jPanelAccionesFormularioAuxiliarTipoSectorEcono;
		
		
		final JMenuBar jmenuBarTipoSectorEcono=this.jmenuBarTipoSectorEcono;		
		final JToolBar jTtoolBarTipoSectorEcono=this.jTtoolBarTipoSectorEcono;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoSectorEcono=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoSectorEcono=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			jmenuBarDetalleAuxiliarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jmenuBarDetalleTipoSectorEcono;
			jTtoolBarDetalleAuxiliarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jTtoolBarDetalleTipoSectorEcono;		
		}
		
		final JMenuBar jmenuBarDetalleTipoSectorEcono=jmenuBarDetalleAuxiliarTipoSectorEcono;
		final JToolBar jTtoolBarDetalleTipoSectorEcono=jTtoolBarDetalleAuxiliarTipoSectorEcono;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoSectorEcono;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoSectorEcono;
			processRunnable.jTableDatos=jTableDatosTipoSectorEcono;
			processRunnable.jPanelCampos=jPanelCamposTipoSectorEcono;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoSectorEcono;
			processRunnable.jPanelAcciones=jPanelAccionesTipoSectorEcono;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoSectorEcono;
			
			
			processRunnable.jmenuBar=jmenuBarTipoSectorEcono;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoSectorEcono;
			processRunnable.jTtoolBar=jTtoolBarTipoSectorEcono;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoSectorEcono;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoSectorEcono ,jPanelParametrosReportesTipoSectorEcono, jTableDatosTipoSectorEcono,/*jScrollPanelDatosTipoSectorEcono,*/jPanelCamposTipoSectorEcono,jPanelPaginacionTipoSectorEcono, /*jScrollPanelDatosEdicionTipoSectorEcono,*/ jPanelAccionesTipoSectorEcono,jPanelAccionesFormularioTipoSectorEcono,jmenuBarTipoSectorEcono,jmenuBarDetalleTipoSectorEcono,jTtoolBarTipoSectorEcono,jTtoolBarDetalleTipoSectorEcono));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoSectorEcono(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoSectorEcono(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoSectorEcono(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoSectorEcono(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoSectorEcono,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoSectorEcono,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoSectorEcono(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoSectorEcono,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoSectorEcono,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiposectoreconoConstantesFunciones.getsFinalQueryTipoSectorEcono();
		String  finalQueryPaginacionTodos=this.tiposectoreconoConstantesFunciones.getsFinalQueryTipoSectorEcono();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoSectorEconoConstantesFunciones.getArrayColumnasGlobalesNoTipoSectorEcono(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoSectorEconoConstantesFunciones.getArrayColumnasGlobalesTipoSectorEcono(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoSectorEconoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiposectoreconosEliminados= new ArrayList<TipoSectorEcono>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoSectorEcono();
		
				///*TipoSectorEconoSessionBean*/this.tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
			
			if(this.tiposectoreconoSessionBean==null) {
				this.tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
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
					this.iNumeroPaginacion=TipoSectorEconoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoSectorEconoConstantesFunciones.getClassesForeignKeysOfTipoSectorEcono(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiposectorecono."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiposectoreconosAux= new ArrayList<TipoSectorEcono>();
			
				
			tiposectoreconoLogic.setDatosCliente(this.datosCliente);
			tiposectoreconoLogic.setDatosDeep(this.datosDeep);
			tiposectoreconoLogic.setIsConDeep(true);
			
			
			tiposectoreconoLogic.getTipoSectorEconoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiposectoreconoLogic.getTodosTipoSectorEconos(finalQueryGlobal,pagination);
					
					//tiposectoreconoLogic.getTodosTipoSectorEconosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiposectoreconoLogic.getTipoSectorEconos()==null|| tiposectoreconoLogic.getTipoSectorEconos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposectoreconosAux= new ArrayList<TipoSectorEcono>();
							tiposectoreconosAux.addAll(tiposectoreconoLogic.getTipoSectorEconos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposectoreconosAux= new ArrayList<TipoSectorEcono>();
							tiposectoreconosAux.addAll(tiposectoreconos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposectoreconoLogic.getTodosTipoSectorEconos(finalQueryGlobal+"",this.pagination);												
							
							//tiposectoreconoLogic.getTodosTipoSectorEconosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoSectorEconos("Todos",tiposectoreconoLogic.getTipoSectorEconos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposectoreconoLogic.setTipoSectorEconos(new ArrayList<TipoSectorEcono>());					
							tiposectoreconoLogic.getTipoSectorEconos().addAll(tiposectoreconosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposectoreconos=new ArrayList<TipoSectorEcono>();
							tiposectoreconos.addAll(tiposectoreconosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoSectorEcono=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoSectorEcono=this.idActual;
				
				} else if(this.idTipoSectorEconoActual!=null && this.idTipoSectorEconoActual!=0L) {
					idTipoSectorEcono=idTipoSectorEconoActual;
				}
				
					
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndicePorId(idTipoSectorEcono);
				
				this.tiposectoreconos=new ArrayList<TipoSectorEcono>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiposectoreconoLogic.getEntity(idTipoSectorEcono);
					
					//tiposectoreconoLogic.getEntityWithConnection(idTipoSectorEcono);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposectoreconoLogic.setTipoSectorEconos(new ArrayList<TipoSectorEcono>());
					tiposectoreconoLogic.getTipoSectorEconos().add(tiposectoreconoLogic.getTipoSectorEcono());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposectoreconos=new ArrayList<TipoSectorEcono>();
					this.tiposectoreconos.add(tiposectorecono);
				}
				
				if(tiposectoreconoLogic.getTipoSectorEcono()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiposectoreconoLogic.getTipoSectorEconosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiposectoreconoLogic.getTipoSectorEconos()==null||tiposectoreconoLogic.getTipoSectorEconos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiposectoreconos==null|| tiposectoreconos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconosAux=new ArrayList<TipoSectorEcono>();
						tiposectoreconosAux.addAll(tiposectoreconoLogic.getTipoSectorEconos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposectoreconosAux=new ArrayList<TipoSectorEcono>();
							tiposectoreconosAux.addAll(tiposectoreconos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiposectoreconoLogic.getTipoSectorEconosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoSectorEconos("BusquedaPorCodigo",tiposectoreconoLogic.getTipoSectorEconos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoSectorEconos("BusquedaPorCodigo",tiposectoreconos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconoLogic.setTipoSectorEconos(new ArrayList<TipoSectorEcono>());
						tiposectoreconoLogic.getTipoSectorEconos().addAll(tiposectoreconosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposectoreconos=new ArrayList<TipoSectorEcono>();
							tiposectoreconos.addAll(tiposectoreconosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiposectoreconoLogic.getTipoSectorEconosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiposectoreconoLogic.getTipoSectorEconos()==null||tiposectoreconoLogic.getTipoSectorEconos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiposectoreconos==null|| tiposectoreconos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconosAux=new ArrayList<TipoSectorEcono>();
						tiposectoreconosAux.addAll(tiposectoreconoLogic.getTipoSectorEconos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposectoreconosAux=new ArrayList<TipoSectorEcono>();
							tiposectoreconosAux.addAll(tiposectoreconos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiposectoreconoLogic.getTipoSectorEconosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoSectorEconos("BusquedaPorNombre",tiposectoreconoLogic.getTipoSectorEconos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoSectorEconos("BusquedaPorNombre",tiposectoreconos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconoLogic.setTipoSectorEconos(new ArrayList<TipoSectorEcono>());
						tiposectoreconoLogic.getTipoSectorEconos().addAll(tiposectoreconosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposectoreconos=new ArrayList<TipoSectorEcono>();
							tiposectoreconos.addAll(tiposectoreconosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiposectoreconoLogic.getTipoSectorEconosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiposectoreconoLogic.getTipoSectorEconos()==null||tiposectoreconoLogic.getTipoSectorEconos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiposectoreconos==null|| tiposectoreconos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconosAux=new ArrayList<TipoSectorEcono>();
						tiposectoreconosAux.addAll(tiposectoreconoLogic.getTipoSectorEconos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposectoreconosAux=new ArrayList<TipoSectorEcono>();
							tiposectoreconosAux.addAll(tiposectoreconos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiposectoreconoLogic.getTipoSectorEconosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSectorEconoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoSectorEconos("FK_IdEmpresa",tiposectoreconoLogic.getTipoSectorEconos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoSectorEconos("FK_IdEmpresa",tiposectoreconos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconoLogic.setTipoSectorEconos(new ArrayList<TipoSectorEcono>());
						tiposectoreconoLogic.getTipoSectorEconos().addAll(tiposectoreconosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposectoreconos=new ArrayList<TipoSectorEcono>();
							tiposectoreconos.addAll(tiposectoreconosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoSectorEcono();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoSectorEcono();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposectoreconoLogic.getTipoSectorEconos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposectoreconos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposectoreconoLogic.getTipoSectorEconos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposectoreconos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoSectorEcono tiposectorecono) {
		Boolean permite=true;
		
		if(this.tiposectorecono.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoSectorEconoConstantesFunciones.getOrderByListaTipoSectorEcono();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoSectorEconoConstantesFunciones.getOrderByListaTipoSectorEcono();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSectorEcono tiposectorecono:tiposectoreconoLogic.getTipoSectorEconos()) {
				if(tiposectorecono.getsType().equals(Constantes2.S_TOTALES)) {
					tiposectoreconoTotales=tiposectorecono;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSectorEcono tiposectorecono:this.tiposectoreconos) {
				if(tiposectorecono.getsType().equals(Constantes2.S_TOTALES)) {
					tiposectoreconoTotales=tiposectorecono;
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
			this.tiposectoreconoAux=new TipoSectorEcono();
			this.tiposectoreconoAux.setsType(Constantes2.S_TOTALES);
			this.tiposectoreconoAux.setIsNew(false);
			this.tiposectoreconoAux.setIsChanged(false);
			this.tiposectoreconoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoSectorEconoConstantesFunciones.TotalizarValoresFilaTipoSectorEcono(this.tiposectoreconoLogic.getTipoSectorEconos(),this.tiposectoreconoAux);
				
				this.tiposectoreconoLogic.getTipoSectorEconos().add(this.tiposectoreconoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoSectorEconoConstantesFunciones.TotalizarValoresFilaTipoSectorEcono(this.tiposectoreconos,this.tiposectoreconoAux);
				
				this.tiposectoreconos.add(this.tiposectoreconoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiposectoreconoTotales=new TipoSectorEcono();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposectoreconoLogic.getTipoSectorEconos().remove(tiposectoreconoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposectoreconos.remove(tiposectoreconoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiposectoreconoTotales=new TipoSectorEcono();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSectorEcono tiposectorecono:tiposectoreconoLogic.getTipoSectorEconos()) {
				if(tiposectorecono.getsType().equals(Constantes2.S_TOTALES)) {
					tiposectoreconoTotales=tiposectorecono;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoSectorEconoConstantesFunciones.TotalizarValoresFilaTipoSectorEcono(this.tiposectoreconoLogic.getTipoSectorEconos(),tiposectoreconoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSectorEcono tiposectorecono:this.tiposectoreconos) {
				if(tiposectorecono.getsType().equals(Constantes2.S_TOTALES)) {
					tiposectoreconoTotales=tiposectorecono;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoSectorEconoConstantesFunciones.TotalizarValoresFilaTipoSectorEcono(this.tiposectoreconos,tiposectoreconoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoSectorEconosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoSectorEconosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoSectorEconosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoSectorEconosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposectoreconoLogic.getTipoSectorEconosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoSectorEconosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposectoreconoLogic.getTipoSectorEconosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoSectorEconosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposectoreconoLogic.getTipoSectorEconosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoSectorEcono() {
		this.isPermisoTodoTipoSectorEcono=false;
		this.isPermisoNuevoTipoSectorEcono=false;
		this.isPermisoActualizarTipoSectorEcono=false;
		this.isPermisoActualizarOriginalTipoSectorEcono=false;
		this.isPermisoEliminarTipoSectorEcono=false;
		this.isPermisoGuardarCambiosTipoSectorEcono=false;
		this.isPermisoConsultaTipoSectorEcono=false;
		this.isPermisoBusquedaTipoSectorEcono=false;
		this.isPermisoReporteTipoSectorEcono=false;		
		this.isPermisoOrdenTipoSectorEcono=false;		
		this.isPermisoPaginacionMedioTipoSectorEcono=false;		
		this.isPermisoPaginacionAltoTipoSectorEcono=false;
		this.isPermisoPaginacionTodoTipoSectorEcono=false;
		this.isPermisoCopiarTipoSectorEcono=false;		
		this.isPermisoVerFormTipoSectorEcono=false;		
		this.isPermisoDuplicarTipoSectorEcono=false;		
		this.isPermisoOrdenTipoSectorEcono=false;		
	}
	
	public void setPermisosUsuarioTipoSectorEcono(Boolean isPermiso) {
		this.isPermisoTodoTipoSectorEcono=isPermiso;
		this.isPermisoNuevoTipoSectorEcono=isPermiso;
		this.isPermisoActualizarTipoSectorEcono=isPermiso;
		this.isPermisoActualizarOriginalTipoSectorEcono=isPermiso;
		this.isPermisoEliminarTipoSectorEcono=isPermiso;
		this.isPermisoGuardarCambiosTipoSectorEcono=isPermiso;
		this.isPermisoConsultaTipoSectorEcono=isPermiso;
		this.isPermisoBusquedaTipoSectorEcono=isPermiso;
		this.isPermisoReporteTipoSectorEcono=isPermiso;
		this.isPermisoOrdenTipoSectorEcono=isPermiso;		
		this.isPermisoPaginacionMedioTipoSectorEcono=isPermiso;		
		this.isPermisoPaginacionAltoTipoSectorEcono=isPermiso;		
		this.isPermisoPaginacionTodoTipoSectorEcono=isPermiso;		
		this.isPermisoCopiarTipoSectorEcono=isPermiso;		
		this.isPermisoVerFormTipoSectorEcono=isPermiso;		
		this.isPermisoDuplicarTipoSectorEcono=isPermiso;
		this.isPermisoOrdenTipoSectorEcono=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoSectorEcono(Boolean isPermiso) {
		//this.isPermisoTodoTipoSectorEcono=isPermiso;
		this.isPermisoNuevoTipoSectorEcono=isPermiso;
		this.isPermisoActualizarTipoSectorEcono=isPermiso;
		this.isPermisoActualizarOriginalTipoSectorEcono=isPermiso;
		this.isPermisoEliminarTipoSectorEcono=isPermiso;
		this.isPermisoGuardarCambiosTipoSectorEcono=isPermiso;
		//this.isPermisoConsultaTipoSectorEcono=isPermiso;
		//this.isPermisoBusquedaTipoSectorEcono=isPermiso;
		//this.isPermisoReporteTipoSectorEcono=isPermiso;
		//this.isPermisoOrdenTipoSectorEcono=isPermiso;		
		//this.isPermisoPaginacionMedioTipoSectorEcono=isPermiso;		
		//this.isPermisoPaginacionAltoTipoSectorEcono=isPermiso;		
		//this.isPermisoPaginacionTodoTipoSectorEcono=isPermiso;		
		//this.isPermisoCopiarTipoSectorEcono=isPermiso;		
		//this.isPermisoDuplicarTipoSectorEcono=isPermiso;
		//this.isPermisoOrdenTipoSectorEcono=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoSectorEconoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ReferenciaComercialConstantesFunciones.SNOMBREOPCION);
		
		if(TipoSectorEconoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosReferenciaComercial=false;
		this.isTienePermisosReferenciaComercial=this.verificarGetPermisosUsuarioOpcionTipoSectorEconoClaseRelacionada(this.opcionsRelacionadas,ReferenciaComercialConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoSectorEcono(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoSectorEconoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosReferenciaComercial=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoSectorEconoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoSectorEconoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoSectorEconoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosReferenciaComercial && this.jInternalFrameDetalleFormTipoSectorEcono!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jTabbedPaneRelacionesTipoSectorEcono.remove(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoSectorEcono() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoSectorEconoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoSectorEconoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoSectorEcono=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoSectorEcono=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoSectorEcono=this.isPermisoActualizarTipoSectorEcono;
			this.isPermisoEliminarTipoSectorEcono=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoSectorEcono=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoSectorEcono=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoSectorEcono=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoSectorEcono=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoSectorEcono=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoSectorEcono=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoSectorEcono=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoSectorEcono=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoSectorEcono=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoSectorEcono=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoSectorEcono=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoSectorEcono=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoSectorEcono=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoSectorEcono.setToolTipText(this.jTableDatosTipoSectorEcono.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoSectorEcono(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoSectorEcono(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoSectorEconoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoSectorEconoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoSectorEcono() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosReferenciaComercial && this.tiposectoreconoConstantesFunciones.mostrarReferenciaComercialTipoSectorEcono && !TipoSectorEconoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Referencia Comercial");
			reporte.setsDescripcion("Referencia Comercial");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyTipoSectorEconoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoSectorEconoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoSectorEconoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoSectorEconoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoSectorEconoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoSectorEconoParameterReturnGeneral tiposectoreconoReturnGeneral=new TipoSectorEconoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiposectoreconoConstantesFunciones.cargarid_empresaTipoSectorEcono)
					 || (this.esRecargarFks && this.tiposectoreconoConstantesFunciones.cargarid_empresaTipoSectorEcono)) {

					if(!this.tiposectoreconoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiposectoreconoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiposectoreconoReturnGeneral=tiposectoreconoLogic.cargarCombosLoteForeignKeyTipoSectorEcono(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiposectoreconoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoSectorEcono()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiposectoreconoSessionBean==null) {
				this.tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
			}

			if(!this.tiposectoreconoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoSectorEcono()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoSectorEcono(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoSectorEcono()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSectorEcono();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoSectorEcono(TipoSectorEcono tiposectorecono)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoSectorEcono(TipoSectorEcono tiposectorecono,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoSectorEcono()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSectorEcono()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoSectorEcono()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoSectorEcono()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoSectorEcono()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoSectorEcono()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoSectorEcono(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoSectorEcono()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono!=null && this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoSectorEconoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoSectorEconoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoSectorEconoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiposectoreconoSessionBean=new TipoSectorEconoSessionBean(); 
		this.tiposectoreconoConstantesFunciones=new TipoSectorEconoConstantesFunciones(); 
		this.tiposectoreconoBean=new TipoSectorEcono();//(this.tiposectoreconoConstantesFunciones); 		
		this.tiposectoreconoReturnGeneral=new TipoSectorEconoParameterReturnGeneral(); 
		
		this.tiposectoreconoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposectoreconoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoSectorEconoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoSectorEconoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoSectorEconoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoSectorEcono(true);
			
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
			
			this.tiposectoreconoConstantesFunciones=new TipoSectorEconoConstantesFunciones(); 
			this.tiposectoreconoBean=new TipoSectorEcono();//this.tiposectoreconoConstantesFunciones); 			
			this.tiposectoreconoReturnGeneral=new TipoSectorEconoParameterReturnGeneral(); 
		
			TipoSectorEconoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Sector Econo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiposectorecono=new TipoSectorEcono();
			this.tiposectoreconos = new ArrayList<TipoSectorEcono>();
			this.tiposectoreconosAux = new ArrayList<TipoSectorEcono>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic=new TipoSectorEconoLogic();
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}
			
			//this.tiposectoreconoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiposectoreconoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoSectorEcono);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoSectorEcono!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoSectorEcono);	
					}
					
					if(this.jInternalFrameImportacionTipoSectorEcono!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoSectorEcono);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoSectorEcono!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoSectorEcono);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoSectorEcono);
				this.jInternalFrameDetalleFormTipoSectorEcono.setVisible(false);
				this.jInternalFrameDetalleFormTipoSectorEcono.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoSectorEcono!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoSectorEcono);
					this.jInternalFrameReporteDinamicoTipoSectorEcono.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoSectorEcono.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoSectorEcono!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoSectorEcono);
					this.jInternalFrameImportacionTipoSectorEcono.setVisible(false);
					this.jInternalFrameImportacionTipoSectorEcono.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoSectorEcono!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoSectorEcono);
					this.jInternalFrameOrderByTipoSectorEcono.setVisible(false);
					this.jInternalFrameOrderByTipoSectorEcono.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoSectorEconoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoSectorEconoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiposectoreconoReturnGeneral=new TipoSectorEconoParameterReturnGeneral();
			
			this.tiposectoreconoParameterGeneral=new TipoSectorEconoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiposectoreconoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoSectorEconoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ReferenciaComercialConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoSectorEconoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposectoreconoSessionBean.getEsGuardarRelacionado(),this.tiposectoreconoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoSectorEconoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposectoreconoSessionBean.getEsGuardarRelacionado(),this.tiposectoreconoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoSectorEcono=false;
			this.isVisibilidadCeldaDuplicarTipoSectorEcono=true;
			this.isVisibilidadCeldaCopiarTipoSectorEcono=true;
			this.isVisibilidadCeldaVerFormTipoSectorEcono=true;
			this.isVisibilidadCeldaOrdenTipoSectorEcono=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=false;
			this.isVisibilidadCeldaModificarTipoSectorEcono=false;
			this.isVisibilidadCeldaActualizarTipoSectorEcono=false;
			this.isVisibilidadCeldaEliminarTipoSectorEcono=false;
			this.isVisibilidadCeldaCancelarTipoSectorEcono=false;
			this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoSectorEcono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoSectorEcono();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoSectorEcono(false);
			
			this.setPermisosUsuarioTipoSectorEcono();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado() 
				|| (this.tiposectoreconoSessionBean.getEsGuardarRelacionado() && this.tiposectoreconoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoSectorEconoClasesRelacionadas();
			}
			
			if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoSectorEconoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoSectorEcono();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoSectorEcono();
			}
			
			if(!this.isPermisoBusquedaTipoSectorEcono) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoSectorEcono,this.isPermisoPaginacionMedioTipoSectorEcono,this.isPermisoPaginacionTodoTipoSectorEcono);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoSectorEconoConstantesFunciones.getTiposSeleccionarTipoSectorEcono());
				
				this.tiposColumnasSelect=TipoSectorEconoConstantesFunciones.getTiposSeleccionarTipoSectorEcono(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoSectorEcono();				
				//this.tiposRelacionesSelect=TipoSectorEconoConstantesFunciones.getTiposRelacionesTipoSectorEcono(true);
				
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
			//if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoSectorEcono();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoSectorEcono(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoSectorEcono(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSectorEcono() ;
			
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
			
			
			this.referenciacomercialLogic=new ReferenciaComercialLogic(); 
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
				tiposectoreconoImplementable= (TipoSectorEconoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoSectorEconoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiposectoreconoImplementableHome= (TipoSectorEconoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoSectorEconoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiposectoreconos= new ArrayList<TipoSectorEcono>();
			this.tiposectoreconosEliminados= new ArrayList<TipoSectorEcono>();
						
			this.isEsNuevoTipoSectorEcono=false;
			this.esParaAccionDesdeFormularioTipoSectorEcono=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoSectorEcono(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoSectorEcono();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoSectorEconoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoSectorEconoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoSectorEcono("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoSectorEcono(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoSectorEcono();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoSectorEcono();
			}
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoSectorEcono.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoSectorEcono.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoSectorEcono.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoSectorEcono(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoSectorEcono: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoSectorEcono() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoSectorEcono")) {
				iIndex=this.jInternalFrameDetalleFormTipoSectorEcono.jTabbedPaneRelacionesTipoSectorEcono.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoSectorEcono.jTabbedPaneRelacionesTipoSectorEcono.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();	
				
				

				if(sTitle.equals("Referencia Comerciales")) {
					if(!ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoSectorEcono();

						this.cargarParteTabPanelRelacionadaReferenciaComercial(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoSectorEcono();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaReferenciaComercial(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoSectorEcono.cargarSessionConBeanSwingJInternalFrameReferenciaComercial(false,true,iIndex);
		this.jButtonReferenciaComercialActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaReferenciaComercial();

		//this.jTabbedPaneRelacionesTipoSectorEcono.updateUI();
		//this.jTabbedPaneRelacionesTipoSectorEcono.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoSectorEcono.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ReferenciaComercial")) {
				int row=this.jTableDatosTipoSectorEcono.getSelectedRow();
				jButtonReferenciaComercialActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Referencia Comercial")) {

					if(this.isTienePermisosReferenciaComercial && this.tiposectoreconoConstantesFunciones.mostrarReferenciaComercialTipoSectorEcono && !TipoSectorEconoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Referencia Comerciales"+"("+ReferenciaComercialConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Referencia Comerciales");

						if(tiposectoreconoConstantesFunciones.resaltarReferenciaComercialTipoSectorEcono!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiposectoreconoConstantesFunciones.resaltarReferenciaComercialTipoSectorEcono);
						}

						jmenuItem.setEnabled(this.tiposectoreconoConstantesFunciones.activarReferenciaComercialTipoSectorEcono);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ReferenciaComercial"));

						

						this.jInternalFrameDetalleFormTipoSectorEcono.jmenuDetalleTipoSectorEcono.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoSectorEcono(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoSectorEcono(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoSectorEcono(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoSectorEconoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoSectorEcono();
		
		this.cargarCombosFrameForeignKeyTipoSectorEcono();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoSectorEcono();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoSectorEcono();
		}
	}
	
	
	
	public void jButtonNuevoTipoSectorEconoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
			
			if(jTableDatosTipoSectorEcono.getRowCount()>=1) {
				jTableDatosTipoSectorEcono.removeRowSelectionInterval(0, jTableDatosTipoSectorEcono.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoSectorEcono=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoSectorEcono(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoSectorEcono(true);			
			//this.tiposectorecono=new TipoSectorEcono();
			//this.tiposectorecono.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSectorEcono(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSectorEcono() ;
			
			if(TipoSectorEconoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSectorEcono(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiposectorecono);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);				
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
			if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoSectorEcono: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoSectorEconoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoSectorEcono.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoSectorEcono.getSelectedRows().length;			
			}
			
			tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoSectorEcono--;			
				//TipoSectorEcono tiposectoreconoAux= new TipoSectorEcono();			
				//tiposectoreconoAux.setId(this.iIdNuevoTipoSectorEcono);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoSectorEcono tiposectoreconoOrigen=new TipoSectorEcono();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoSectorEcono tiposectoreconoOrigen : tiposectoreconosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiposectoreconoOrigen =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposectoreconoOrigen =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoSectorEcono();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiposectorecono.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoSectorEcono(tiposectoreconoOrigen,this.tiposectorecono,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposectoreconoLogic.getTipoSectorEconos().add(this.tiposectoreconoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposectoreconos.add(this.tiposectoreconoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoSectorEcono(false);
				
				this.jTableDatosTipoSectorEcono.setRowSelectionInterval(this.getIndiceNuevoTipoSectorEcono(), this.getIndiceNuevoTipoSectorEcono());
				
				int iLastRow =  this.jTableDatosTipoSectorEcono.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoSectorEcono.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoSectorEcono.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSectorEcono(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();									
		
			TipoSectorEcono tiposectoreconoOrigen=new TipoSectorEcono();
			TipoSectorEcono tiposectoreconoDestino=new TipoSectorEcono();
				
			tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoSectorEcono.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiposectoreconosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoSectorEcono.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconoOrigen =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposectoreconoOrigen =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposectoreconoDestino =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposectoreconoDestino =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiposectoreconoOrigen =tiposectoreconosSeleccionados.get(0);
				tiposectoreconoDestino =tiposectoreconosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoSectorEcono(tiposectoreconoOrigen,tiposectoreconoDestino,true,false);
				
				tiposectoreconoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposectoreconoDestino,tiposectoreconoLogic.getTipoSectorEconos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposectoreconoDestino,tiposectoreconos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoSectorEcono(false);
				
				//this.jTableDatosTipoSectorEcono.setRowSelectionInterval(this.getIndiceNuevoTipoSectorEcono(), this.getIndiceNuevoTipoSectorEcono());
				
				int iLastRow =  this.jTableDatosTipoSectorEcono.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoSectorEcono.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoSectorEcono.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSectorEcono(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoSectorEcono.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoSectorEcono.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoSectorEcono.setVisible(!isVisible);
			this.jPanelPaginacionTipoSectorEcono.setVisible(!isVisible);
			this.jPanelAccionesTipoSectorEcono.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoSectorEcono();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoSectorEcono();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoSectorEcono();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoSectorEcono();
			
			this.abrirFrameOrderByTipoSectorEcono();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoSectorEcono();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoSectorEcono(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoSectorEcono);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoSectorEcono.isMaximum()) {
					this.jInternalFrameDetalleFormTipoSectorEcono.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoSectorEcono.setSize(this.jInternalFrameDetalleFormTipoSectorEcono.iWidthFormulario,this.jInternalFrameDetalleFormTipoSectorEcono.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoSectorEcono.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoSectorEcono.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoSectorEcono.isMaximum()) {
						this.jInternalFrameDetalleFormTipoSectorEcono.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoSectorEcono.jContentPaneDetalleTipoSectorEcono.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoSectorEcono.jTabbedPaneRelacionesTipoSectorEcono.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoSectorEcono.jContentPaneDetalleTipoSectorEcono.getWidth(),TipoSectorEconoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoSectorEcono.jTabbedPaneRelacionesTipoSectorEcono.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoSectorEcono.jContentPaneDetalleTipoSectorEcono.getWidth(),TipoSectorEconoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoSectorEcono.jTabbedPaneRelacionesTipoSectorEcono.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoSectorEcono.jContentPaneDetalleTipoSectorEcono.getWidth(),TipoSectorEconoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaReferenciaComercial();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoSectorEcono.setVisible(true);
	        this.jInternalFrameDetalleFormTipoSectorEcono.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoSectorEcono() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoSectorEcono==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoSectorEcono=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSectorEcono,false,this);
				} else {
					this.jInternalFrameOrderByTipoSectorEcono=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSectorEcono,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoSectorEcono);
				this.jInternalFrameOrderByTipoSectorEcono.setVisible(false);
				this.jInternalFrameOrderByTipoSectorEcono.setSelected(false);
				
				this.jInternalFrameOrderByTipoSectorEcono.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoSectorEcono"));
				
				this.inicializarActualizarBindingTablaOrderByTipoSectorEcono();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoSectorEcono() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoSectorEcono==null) {
				
				this.jInternalFrameImportacionTipoSectorEcono=new ImportacionJInternalFrame(TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoSectorEcono);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoSectorEcono);
				this.jInternalFrameImportacionTipoSectorEcono.setVisible(false);
				this.jInternalFrameImportacionTipoSectorEcono.setSelected(false);


				this.jInternalFrameImportacionTipoSectorEcono.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoSectorEcono"));
				this.jInternalFrameImportacionTipoSectorEcono.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoSectorEcono"));
				this.jInternalFrameImportacionTipoSectorEcono.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoSectorEcono"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoSectorEcono() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoSectorEcono==null) {
				this.jInternalFrameReporteDinamicoTipoSectorEcono=new ReporteDinamicoJInternalFrame(TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoSectorEcono);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoSectorEcono);
				this.jInternalFrameReporteDinamicoTipoSectorEcono.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoSectorEcono.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoSectorEcono.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSectorEcono"));
				this.jInternalFrameReporteDinamicoTipoSectorEcono.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSectorEcono"));
				this.jInternalFrameReporteDinamicoTipoSectorEcono.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSectorEcono"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSectorEcono();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaReferenciaComercial() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.jScrollPanelDatosReferenciaComercial.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoSectorEcono.jContentPaneDetalleTipoSectorEcono.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.jScrollPanelDatosReferenciaComercial.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.jScrollPanelDatosReferenciaComercial.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.jScrollPanelDatosReferenciaComercial.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoSectorEcono() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoSectorEcono);
			
	       	this.jInternalFrameDetalleFormTipoSectorEcono.setVisible(false);
	        this.jInternalFrameDetalleFormTipoSectorEcono.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoSectorEcono.dispose();
			//this.jInternalFrameDetalleFormTipoSectorEcono=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoSectorEcono() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoSectorEcono.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoSectorEcono.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoSectorEcono() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoSectorEcono.setVisible(true);
	        this.jInternalFrameImportacionTipoSectorEcono.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoSectorEcono() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoSectorEcono.setVisible(true);
	        this.jInternalFrameOrderByTipoSectorEcono.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoSectorEcono() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoSectorEcono.setVisible(false);
	        this.jInternalFrameOrderByTipoSectorEcono.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoSectorEcono() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoSectorEcono.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoSectorEcono.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoSectorEcono() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoSectorEcono.setVisible(false);
	        this.jInternalFrameImportacionTipoSectorEcono.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoSectorEcono(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoSectorEcono(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoSectorEcono(true);
			//this.isEsNuevoTipoSectorEcono=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoSectorEcono("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSectorEcono(false) ;
			
			if(tiposectoreconoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.getEsGuardarRelacionado() && ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaComercialActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoSectorEconoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSectorEcono(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSectorEcono(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoSectorEconoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoSectorEcono(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoSectorEcono(true);
			//this.isEsNuevoTipoSectorEcono=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiposectorecono.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoSectorEcono("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoSectorEcono(false) ;
			
			if(TipoSectorEconoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSectorEcono(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSectorEcono(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoSectorEcono(false);
			
			//if(!this.isEsNuevoTipoSectorEcono) {								
				int intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.tiposectorecono,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
				
			}
			
			if(this.permiteMantenimiento(this.tiposectorecono)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoSectorEcono=true;
					this.inicializarActualizarBindingTablaTipoSectorEcono(false);
					this.isEsNuevoTipoSectorEcono=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoSectorEcono=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoSectorEcono=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoSectorEcono(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSectorEcono(false);
				
				this.habilitarDeshabilitarControlesTipoSectorEcono(false);
			
												
				
				if(TipoSectorEconoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoSectorEcono();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoSectorEconoActionPerformed(evt,tiposectoreconoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoSectorEcono(this.tiposectorecono,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoSectorEcono.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiposectoreconoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiposectorecono.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				this.tiposectorecono.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				this.tiposectorecono.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiposectorecono)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoSectorEconoModel) this.jTableDatosTipoSectorEcono.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoSectorEcono=true;
				this.inicializarActualizarBindingTablaTipoSectorEcono(false);
				this.isEsNuevoTipoSectorEcono=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoSectorEcono(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSectorEcono(false);
				
				this.habilitarDeshabilitarControlesTipoSectorEcono(false);
				
				
				
				if(TipoSectorEconoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoSectorEcono();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoSectorEcono.getRowCount()>=1) {
				jTableDatosTipoSectorEcono.removeRowSelectionInterval(0, jTableDatosTipoSectorEcono.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoSectorEcono(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoSectorEcono(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSectorEcono(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSectorEcono(false) ;
			
			this.isEsNuevoTipoSectorEcono=false;
			
			if(TipoSectorEconoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoSectorEcono();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoSectorEcono(false);
				
				//SI ES MANUAL
				if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoSectorEcono();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoSectorEcono--;			
			//TipoSectorEcono tiposectoreconoAux= new TipoSectorEcono();			
			//tiposectoreconoAux.setId(this.iIdNuevoTipoSectorEcono);
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoSectorEcono();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
			
			this.tiposectorecono.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiposectoreconoLogic.getTipoSectorEconos().add(this.tiposectoreconoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiposectoreconos.add(this.tiposectoreconoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoSectorEcono(false);
			
			this.jTableDatosTipoSectorEcono.setRowSelectionInterval(this.getIndiceNuevoTipoSectorEcono(), this.getIndiceNuevoTipoSectorEcono());
			
			int iLastRow =  this.jTableDatosTipoSectorEcono.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoSectorEcono.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoSectorEcono.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoSectorEcono(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoSectorEcono(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSectorEcono(false);
			
			//SI ES MANUAL
			if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSectorEcono();
			}
			
			//this.abrirFrameTreeTipoSectorEcono();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Sector EconoS ?", "MANTENIMIENTO DE Tipo Sector Econo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoSectorEcono.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoSectorEcono();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiposectoreconoReturnGeneral=tiposectoreconoLogic.procesarImportacionTipoSectorEconosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiposectoreconoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoSectorEconoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoSectorEcono.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoSectorEcono.setFileImportacion(this.jInternalFrameImportacionTipoSectorEcono.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoSectorEcono.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoSectorEcono.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoSectorEcono.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoSectorEcono.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();		

		tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoSectorEconoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoSectorEconoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoSectorEconos("Todos",tiposectoreconosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sector Econo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoSectorEconoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoSectorEconoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoSectorEcono.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoSectorEconoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoSectorEconoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoSectorEconoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoSectorEconoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoSectorEconoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoSectorEconoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();		
		
		tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposectorecono";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoSectorEconos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoSectorEcono tiposectorecono:tiposectoreconosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposectorecono.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoSectorEconoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoSectorEcono tiposectorecono:tiposectoreconosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposectorecono.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoSectorEconoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoSectorEcono tiposectorecono:tiposectoreconosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposectorecono.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoSectorEcono(row);				
			//	iRow++;
			//}				
			
			//for(TipoSectorEcono tiposectoreconoAux:tiposectoreconosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoSectorEcono(tiposectoreconoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sector Econo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSectorEcono(false);
			
			//SI ES MANUAL
			if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSectorEcono();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSectorEcono(false);
			
			//SI ES MANUAL
			if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoSectorEcono();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSectorEcono(false);
			
			//SI ES MANUAL
			if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoSectorEcono();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoSectorEcono() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoSectorEcono.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoSectorEcono.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoSectorEcono.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoSectorEcono.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoSectorEcono.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoSectorEcono.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoSectorEcono.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoSectorEcono(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoSectorEcono(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoSectorEcono(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoSectorEcono(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoSectorEcono(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoSectorEcono(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSectorEcono(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoSectorEcono(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoSectorEcono() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoSectorEcono();
		
		this.inicializarActualizarBindingBotonesManualTipoSectorEcono(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoSectorEcono();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSectorEcono() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSectorEcono(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSectorEcono(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoSectorEcono.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoSectorEcono.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoSectorEcono.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoSectorEcono.jCheckBoxPostAccionNuevoTipoSectorEcono.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoSectorEcono.jCheckBoxPostAccionSinCerrarTipoSectorEcono.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoSectorEcono.jCheckBoxPostAccionSinMensajeTipoSectorEcono.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoSectorEcono.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoSectorEcono.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoSectorEcono.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
				this.jInternalFrameDetalleFormTipoSectorEcono.jCheckBoxPostAccionNuevoTipoSectorEcono.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoSectorEcono.jCheckBoxPostAccionSinCerrarTipoSectorEcono.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoSectorEcono.jCheckBoxPostAccionSinMensajeTipoSectorEcono.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoSectorEcono.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoSectorEcono.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoSectorEcono.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoSectorEcono!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoSectorEcono.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoSectorEcono.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoSectorEcono.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoSectorEcono.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoSectorEcono!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoSectorEcono.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoSectorEcono.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoSectorEcono(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSectorEcono(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoSectorEcono() throws Exception {
		try	{
			if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoSectorEcono();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoSectorEcono() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoSectorEcono() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoSectorEcono.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoSectorEcono.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoSectorEcono.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoSectorEcono.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoSectorEcono.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoSectorEcono.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoSectorEcono.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoSectorEcono.addItem(reporte);
			}
			
			
			if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoSectorEcono.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoSectorEcono.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoSectorEcono.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoSectorEcono.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoSectorEcono.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoSectorEcono.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoSectorEcono.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoSectorEcono.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoSectorEcono.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSectorEcono();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSectorEcono() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoSectorEcono!=null) {
				this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoSectorEcono!=null) {
				this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoSectorEcono.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoSectorEcono!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoSectorEcono.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoSectorEcono()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoSectorEcono.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoSectorEcono.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoSectorEcono(Boolean esInicializar) throws Exception {				
		if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoSectorEcono();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoSectorEcono() throws Exception {
		this.inicializarActualizarBindingTablaTipoSectorEcono(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoSectorEcono() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoSectorEconoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoSectorEconoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoSectorEconoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSectorEconoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoSectorEconoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoSectorEconoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoSectorEcono(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiposectoreconoLogic.getTipoSectorEconos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiposectoreconos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoSectorEcono.setModel(new TipoSectorEconoModel(this.tiposectoreconoLogic.getTipoSectorEconos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoSectorEcono.setModel(new TipoSectorEconoModel(this.tiposectoreconos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoSectorEcono!=null && this.jInternalFrameOrderByTipoSectorEcono.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoSectorEcono();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoSectorEcono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSectorEcono,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoSectorEconoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO,tiposectoreconoConstantesFunciones.resaltarSeleccionarTipoSectorEcono,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO,tiposectoreconoConstantesFunciones.resaltarSeleccionarTipoSectorEcono,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoSectorEcono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSectorEcono,TipoSectorEconoConstantesFunciones.LABEL_ID));

		if(this.tiposectoreconoConstantesFunciones.mostraridTipoSectorEcono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSectorEconoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiposectoreconoConstantesFunciones.resaltaridTipoSectorEcono,this.tiposectoreconoConstantesFunciones.activaridTipoSectorEcono,this,true,"idTipoSectorEcono","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposectoreconoConstantesFunciones.resaltaridTipoSectorEcono,this.tiposectoreconoConstantesFunciones.activaridTipoSectorEcono,this,true,"idTipoSectorEcono","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSectorEcono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSectorEcono,TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiposectoreconoConstantesFunciones.mostrarid_empresaTipoSectorEcono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiposectoreconoConstantesFunciones.resaltarid_empresaTipoSectorEcono,this,this.tiposectoreconoConstantesFunciones.activarid_empresaTipoSectorEcono));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiposectoreconoConstantesFunciones.resaltarid_empresaTipoSectorEcono,this,this.tiposectoreconoConstantesFunciones.activarid_empresaTipoSectorEcono,false,"id_empresaTipoSectorEcono","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSectorEconoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSectorEcono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSectorEcono,TipoSectorEconoConstantesFunciones.LABEL_CODIGO));

		if(this.tiposectoreconoConstantesFunciones.mostrarcodigoTipoSectorEcono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSectorEconoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposectoreconoConstantesFunciones.resaltarcodigoTipoSectorEcono,this.tiposectoreconoConstantesFunciones.activarcodigoTipoSectorEcono,this,true,"codigoTipoSectorEcono","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposectoreconoConstantesFunciones.resaltarcodigoTipoSectorEcono,this.tiposectoreconoConstantesFunciones.activarcodigoTipoSectorEcono,this,true,"codigoTipoSectorEcono","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSectorEconoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSectorEcono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSectorEcono,TipoSectorEconoConstantesFunciones.LABEL_NOMBRE));

		if(this.tiposectoreconoConstantesFunciones.mostrarnombreTipoSectorEcono && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSectorEconoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposectoreconoConstantesFunciones.resaltarnombreTipoSectorEcono,this.tiposectoreconoConstantesFunciones.activarnombreTipoSectorEcono,this,true,"nombreTipoSectorEcono","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposectoreconoConstantesFunciones.resaltarnombreTipoSectorEcono,this.tiposectoreconoConstantesFunciones.activarnombreTipoSectorEcono,this,true,"nombreTipoSectorEcono","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSectorEconoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosReferenciaComercial && this.tiposectoreconoConstantesFunciones.mostrarReferenciaComercialTipoSectorEcono && !TipoSectorEconoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Referencia Comerciales");
				tableColumn.setHeaderValue("Referencia Comerciales");
				tableColumn.setCellRenderer(new ReferenciaComercialTableCell(tiposectoreconoConstantesFunciones.resaltarReferenciaComercialTipoSectorEcono,this,this.tiposectoreconoConstantesFunciones.activarReferenciaComercialTipoSectorEcono));
				tableColumn.setCellEditor(new ReferenciaComercialTableCell(tiposectoreconoConstantesFunciones.resaltarReferenciaComercialTipoSectorEcono,this,this.tiposectoreconoConstantesFunciones.activarReferenciaComercialTipoSectorEcono));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoSectorEcono.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposectoreconoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposectoreconoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoSectorEcono.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposectoreconoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposectoreconoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoSectorEcono.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiposectoreconoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiposectoreconoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoSectorEcono.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoSectorEcono.addColumn(tableColumn);
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
			
			this.jTableDatosTipoSectorEcono.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoSectorEcono.moveColumn(this.jTableDatosTipoSectorEcono.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoSectorEcono.moveColumn(this.jTableDatosTipoSectorEcono.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoSectorEcono.moveColumn(this.jTableDatosTipoSectorEcono.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoSectorEcono.moveColumn(this.jTableDatosTipoSectorEcono.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoSectorEcono.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoSectorEcono.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoSectorEcono,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoSectorEcono.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoSectorEcono.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoSectorEcono.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoSectorEcono.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoSectorEcono.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiposectoreconoLogic.getTipoSectorEconos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiposectoreconos.size()-1;
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
		//this.jTableDatosTipoSectorEcono.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoSectorEcono.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoSectorEcono();
			
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
				
				//this.isEsNuevoTipoSectorEcono=false;
					
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
				if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoSectorEcono==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoSectorEcono.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoSectorEcono.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiposectorecono.getsType().equals("DUPLICADO")
				   || this.tiposectorecono.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoSectorEcono=true;
				
				} else {
					this.isEsNuevoTipoSectorEcono=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
					if(this.tiposectorecono.getId()>=0 && !this.tiposectorecono.getIsNew()) {						
						this.isEsNuevoTipoSectorEcono=false;
						
					} else {
						this.isEsNuevoTipoSectorEcono=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoSectorEcono(esRelaciones);						
				
				this.seleccionarTipoSectorEcono(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiposectorecono.getId()<0) {
					this.isEsNuevoTipoSectorEcono=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoSectorEcono(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoSectorEcono(evt,rowIndex);
				}	
				
				if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoSectorEcono: " + this.dDif); 
					}
				}								
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoSectorEcono(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiposectorecono)) {
					if(this.tiposectorecono.getId()>0) {
						this.tiposectorecono.setIsDeleted(true);
						
						this.tiposectoreconosEliminados.add(this.tiposectorecono);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposectoreconoLogic.getTipoSectorEconos().remove(this.tiposectorecono);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposectoreconos.remove(this.tiposectorecono);				
					}
					
					
					((TipoSectorEconoModel) this.jTableDatosTipoSectorEcono.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSectorEcono(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoSectorEcono(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoSectorEcono) {
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoSectorEcono.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoSectorEcono.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoSectorEcono(this.tiposectorecono);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiposectoreconoConstantesFunciones.cargarid_empresaTipoSectorEcono || this.tiposectoreconoConstantesFunciones.event_dependid_empresaTipoSectorEcono) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiposectorecono.getid_empresa());
									//this.inicializarActualizarBindingTipoSectorEcono(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiposectorecono.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiposectorecono.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiposectorecono.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoSectorEcono("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoSectorEcono(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSectorEcono() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoSectorEcono(TipoSectorEcono tiposectorecono) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoSectorEcono(tiposectorecono,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoSectorEcono(TipoSectorEcono tiposectorecono,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoSectorEcono(tiposectorecono);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoSectorEcono(tiposectorecono,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoSectorEcono(tiposectorecono);
	}
	
	public void setVariablesObjetoActualToFormularioTipoSectorEcono(TipoSectorEcono tiposectorecono) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.setText(tiposectorecono.getId().toString());
			this.jInternalFrameDetalleFormTipoSectorEcono.jTextFieldcodigoTipoSectorEcono.setText(tiposectorecono.getcodigo());
			this.jInternalFrameDetalleFormTipoSectorEcono.jTextAreanombreTipoSectorEcono.setText(tiposectorecono.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoSectorEcono tiposectoreconoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiposectoreconoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoSectorEcono tiposectoreconoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiposectoreconoLocal=this.tiposectorecono;
			} else {
				tiposectoreconoLocal=this.tiposectoreconoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiposectoreconoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoSectorEcono(tiposectoreconoLocal,true);
					
					if(tiposectoreconoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiposectoreconoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiposectoreconoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoSectorEcono(TipoSectorEcono tiposectorecono,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoSectorEcono(tiposectorecono,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(tiposectorecono);
	}
	
	public void setVariablesFormularioToObjetoActualTipoSectorEcono(TipoSectorEcono tiposectorecono,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoSectorEcono(tiposectorecono,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoSectorEcono(TipoSectorEcono tiposectorecono,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.getText()==null || this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.getText()=="" || this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.setText("0");
			}

			if(conColumnasBase) {tiposectorecono.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSectorEconoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSectorEcono.jLabelIdTipoSectorEcono,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposectorecono.setcodigo(this.jInternalFrameDetalleFormTipoSectorEcono.jTextFieldcodigoTipoSectorEcono.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSectorEconoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSectorEcono.jLabelcodigoTipoSectorEcono,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposectorecono.setnombre(this.jInternalFrameDetalleFormTipoSectorEcono.jTextAreanombreTipoSectorEcono.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSectorEconoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSectorEcono.jLabelnombreTipoSectorEcono,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoSectorEcono(TipoSectorEcono tiposectoreconoBean,TipoSectorEcono tiposectorecono,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoSectorEcono(TipoSectorEcono tiposectoreconoOrigen,TipoSectorEcono tiposectorecono,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposectoreconoOrigen.getId()!=null && !tiposectoreconoOrigen.getId().equals(0L))) {tiposectorecono.setId(tiposectoreconoOrigen.getId());}}
			if(conDefault || (!conDefault && tiposectoreconoOrigen.getcodigo()!=null && !tiposectoreconoOrigen.getcodigo().equals(""))) {tiposectorecono.setcodigo(tiposectoreconoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiposectoreconoOrigen.getnombre()!=null && !tiposectoreconoOrigen.getnombre().equals(""))) {tiposectorecono.setnombre(tiposectoreconoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoSectorEcono(TipoSectorEcono tiposectorecono) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.setText(tiposectorecono.getId().toString());
			this.jInternalFrameDetalleFormTipoSectorEcono.jTextFieldcodigoTipoSectorEcono.setText(tiposectorecono.getcodigo());
			this.jInternalFrameDetalleFormTipoSectorEcono.jTextAreanombreTipoSectorEcono.setText(tiposectorecono.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoSectorEcono(TipoSectorEconoBean tiposectoreconoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.setText(tiposectoreconoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoSectorEcono.jTextFieldcodigoTipoSectorEcono.setText(tiposectoreconoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoSectorEcono.jTextAreanombreTipoSectorEcono.setText(tiposectoreconoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoSectorEcono(TipoSectorEconoParameterReturnGeneral tiposectoreconoReturnGeneral,TipoSectorEconoBean tiposectoreconoBean,Boolean conDefault) throws Exception { 
		try {
			TipoSectorEcono tiposectoreconoLocal=new TipoSectorEcono();
			
			tiposectoreconoLocal=tiposectoreconoReturnGeneral.getTipoSectorEcono();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposectoreconoLocal.getId()!=null && !tiposectoreconoLocal.getId().equals(0L))) {tiposectoreconoBean.setId(tiposectoreconoLocal.getId());}}
			if(conDefault || (!conDefault && tiposectoreconoLocal.getcodigo()!=null && !tiposectoreconoLocal.getcodigo().equals(""))) {tiposectoreconoBean.setcodigo(tiposectoreconoLocal.getcodigo());}
			if(conDefault || (!conDefault && tiposectoreconoLocal.getnombre()!=null && !tiposectoreconoLocal.getnombre().equals(""))) {tiposectoreconoBean.setnombre(tiposectoreconoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoSectorEconoGenerico(Long idTipoSectorEconoSeleccionado,JComboBox jComboBoxTipoSectorEcono,List<TipoSectorEcono> tiposectoreconosLocal)throws Exception {
		try {
			TipoSectorEcono  tiposectoreconoTemp=null;

			for(TipoSectorEcono tiposectoreconoAux:tiposectoreconosLocal) {
				if(tiposectoreconoAux.getId()!=null && tiposectoreconoAux.getId().equals(idTipoSectorEconoSeleccionado)) {
					tiposectoreconoTemp=tiposectoreconoAux;
					break;
				}
			}

			jComboBoxTipoSectorEcono.setSelectedItem(tiposectoreconoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoSectorEconoGenerico(JComboBox jComboBoxTipoSectorEcono,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoSectorEcono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoSectorEcono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoSectorEcono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoSectorEcono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoSectorEcono.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoSectorEcono.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoSectorEcono.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoSectorEcono.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoSectorEcono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoSectorEcono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ReferenciaComercial")) {
			jButtonReferenciaComercialActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposectorecono=(TipoSectorEcono) tiposectoreconoLogic.getTipoSectorEconos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposectorecono =(TipoSectorEcono) tiposectoreconos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiposectorecono.getIsNew() && !tiposectorecono.getIsChanged() && !tiposectorecono.getIsDeleted()) {
				sDescripcion=tiposectorecono.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiposectorecono.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoSectorEcono tiposectoreconoRow=new TipoSectorEcono();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposectoreconoRow=(TipoSectorEcono) tiposectoreconoLogic.getTipoSectorEconos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposectoreconoRow=(TipoSectorEcono) tiposectoreconos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonReferenciaComercialActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoSectorEcono tiposectorecono) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoSectorEcono==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposectorecono = (TipoSectorEcono)this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiposectorecono = (TipoSectorEcono)this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiposectorecono!=null) {
						this.tiposectorecono = tiposectorecono;
					} else {
						this.tiposectorecono = new TipoSectorEcono();
					}
				}

				if(this.isTienePermisosReferenciaComercial && this.permiteMantenimiento(this.tiposectorecono)) {
					ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFramePopup=new ReferenciaComercialBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						referenciacomercialBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFramePopup;
					} else {
						referenciacomercialBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame;
					}

					List<TipoSectorEcono> tiposectoreconos=new ArrayList<TipoSectorEcono>();
					tiposectoreconos.add(this.tiposectorecono);
					if(!esRelacionado) {
						//referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setConGuardarRelaciones(false);
						//referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					referenciacomercialBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoSectorEcono.cargarReferenciaComercialBeanSwingJInternalFrame(tiposectoreconos,this.tiposectorecono,referenciacomercialBeanSwingJInternalFrame,/*conInicializar,*/referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.getConGuardarRelaciones(),referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.getEsGuardarRelacionado());
					referenciacomercialBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						referenciacomercialBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaComercial("no_relacionado");

						referenciacomercialBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ReferenciaComercialConstantesFunciones.ITAMANIOFILATABLA + (ReferenciaComercialConstantesFunciones.ITAMANIOFILATABLA/2));

						referenciacomercialBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoSectorEcono=(TitledBorder)this.jScrollPanelDatosTipoSectorEcono.getBorder();
						TitledBorder titledBorderReferenciaComercial=(TitledBorder)referenciacomercialBeanSwingJInternalFrame.jScrollPanelDatosReferenciaComercial.getBorder();

						titledBorderReferenciaComercial.setTitle(titledBorderTipoSectorEcono.getTitle() + " -> Referencia Comercial");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,referenciacomercialBeanSwingJInternalFrame);
						}

						referenciacomercialBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(referenciacomercialBeanSwingJInternalFrame);

						referenciacomercialBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Referencia Comercial",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoSectorEcono(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoSectorEcono.setVisible((this.isVisibilidadCeldaNuevoTipoSectorEcono && this.isPermisoNuevoTipoSectorEcono));			
			this.jButtonDuplicarTipoSectorEcono.setVisible((this.isVisibilidadCeldaDuplicarTipoSectorEcono && this.isPermisoDuplicarTipoSectorEcono));			
			this.jButtonCopiarTipoSectorEcono.setVisible((this.isVisibilidadCeldaCopiarTipoSectorEcono && this.isPermisoCopiarTipoSectorEcono));
			this.jButtonVerFormTipoSectorEcono.setVisible((this.isVisibilidadCeldaVerFormTipoSectorEcono && this.isPermisoVerFormTipoSectorEcono));
			
			this.jButtonAbrirOrderByTipoSectorEcono.setVisible((this.isVisibilidadCeldaOrdenTipoSectorEcono && this.isPermisoOrdenTipoSectorEcono));			
			
			this.jButtonNuevoRelacionesTipoSectorEcono.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono && this.isPermisoNuevoTipoSectorEcono));			
			this.jButtonNuevoGuardarCambiosTipoSectorEcono.setVisible((this.isVisibilidadCeldaNuevoTipoSectorEcono && this.isPermisoNuevoTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono));
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonModificarTipoSectorEcono.setVisible((this.isVisibilidadCeldaModificarTipoSectorEcono && this.isPermisoActualizarTipoSectorEcono));	
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonActualizarTipoSectorEcono.setVisible((this.isVisibilidadCeldaActualizarTipoSectorEcono && this.isPermisoActualizarTipoSectorEcono));	
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonEliminarTipoSectorEcono.setVisible((this.isVisibilidadCeldaEliminarTipoSectorEcono && this.isPermisoEliminarTipoSectorEcono));
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonCancelarTipoSectorEcono.setVisible(this.isVisibilidadCeldaCancelarTipoSectorEcono);							
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosTipoSectorEcono.setVisible((this.isVisibilidadCeldaGuardarTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoSectorEcono.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaNuevoTipoSectorEcono && this.isPermisoNuevoTipoSectorEcono));						
			this.jButtonDuplicarToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaDuplicarTipoSectorEcono && this.isPermisoDuplicarTipoSectorEcono));						
			this.jButtonCopiarToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaCopiarTipoSectorEcono && this.isPermisoCopiarTipoSectorEcono));			
			this.jButtonVerFormToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaVerFormTipoSectorEcono && this.isPermisoVerFormTipoSectorEcono));			
			this.jButtonAbrirOrderByToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaOrdenTipoSectorEcono && this.isPermisoOrdenTipoSectorEcono));
			this.jButtonNuevoRelacionesToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono && this.isPermisoNuevoTipoSectorEcono));			
			this.jButtonNuevoGuardarCambiosToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaNuevoTipoSectorEcono && this.isPermisoNuevoTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono));			
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonModificarToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaModificarTipoSectorEcono && this.isPermisoActualizarTipoSectorEcono));	
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonActualizarToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaActualizarTipoSectorEcono  && this.isPermisoActualizarTipoSectorEcono));	
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonEliminarToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaEliminarTipoSectorEcono && this.isPermisoEliminarTipoSectorEcono));
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonCancelarToolBarTipoSectorEcono.setVisible(this.isVisibilidadCeldaCancelarTipoSectorEcono);				
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaGuardarTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoSectorEcono.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoSectorEcono.setVisible((this.isVisibilidadCeldaNuevoTipoSectorEcono && this.isPermisoNuevoTipoSectorEcono));			
			this.jMenuItemDuplicarTipoSectorEcono.setVisible((this.isVisibilidadCeldaDuplicarTipoSectorEcono && this.isPermisoDuplicarTipoSectorEcono));			
			this.jMenuItemCopiarTipoSectorEcono.setVisible((this.isVisibilidadCeldaCopiarTipoSectorEcono && this.isPermisoCopiarTipoSectorEcono));			
			this.jMenuItemVerFormTipoSectorEcono.setVisible((this.isVisibilidadCeldaVerFormTipoSectorEcono && this.isPermisoVerFormTipoSectorEcono));			
			this.jMenuItemAbrirOrderByTipoSectorEcono.setVisible((this.isVisibilidadCeldaOrdenTipoSectorEcono && this.isPermisoOrdenTipoSectorEcono));			
			//this.jMenuItemMostrarOcultarTipoSectorEcono.setVisible((this.isVisibilidadCeldaOrdenTipoSectorEcono && this.isPermisoOrdenTipoSectorEcono));
			this.jMenuItemDetalleAbrirOrderByTipoSectorEcono.setVisible((this.isVisibilidadCeldaOrdenTipoSectorEcono && this.isPermisoOrdenTipoSectorEcono));			
			//this.jMenuItemDetalleMostrarOcultarTipoSectorEcono.setVisible((this.isVisibilidadCeldaOrdenTipoSectorEcono && this.isPermisoOrdenTipoSectorEcono));			
			this.jMenuItemNuevoRelacionesTipoSectorEcono.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono && this.isPermisoNuevoTipoSectorEcono));			
			this.jMenuItemNuevoGuardarCambiosTipoSectorEcono.setVisible((this.isVisibilidadCeldaNuevoTipoSectorEcono && this.isPermisoNuevoTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono));									
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemModificarTipoSectorEcono.setVisible((this.isVisibilidadCeldaModificarTipoSectorEcono && this.isPermisoActualizarTipoSectorEcono));	
			this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemActualizarTipoSectorEcono.setVisible((this.isVisibilidadCeldaActualizarTipoSectorEcono && this.isPermisoActualizarTipoSectorEcono));	
			this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemEliminarTipoSectorEcono.setVisible((this.isVisibilidadCeldaEliminarTipoSectorEcono && this.isPermisoEliminarTipoSectorEcono));
			this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemCancelarTipoSectorEcono.setVisible(this.isVisibilidadCeldaCancelarTipoSectorEcono);				
			}
			
			this.jMenuItemGuardarCambiosTipoSectorEcono.setVisible((this.isVisibilidadCeldaGuardarTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono));						
			this.jMenuItemGuardarCambiosTablaTipoSectorEcono.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoSectorEcono=this.jButtonNuevoTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaDuplicarTipoSectorEcono=this.jButtonDuplicarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaCopiarTipoSectorEcono=this.jButtonCopiarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaVerFormTipoSectorEcono=this.jButtonVerFormTipoSectorEcono.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoSectorEcono=this.jButtonAbrirOrderByTipoSectorEcono.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=this.jButtonNuevoRelacionesTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaModificarTipoSectorEcono=this.jButtonModificarTipoSectorEcono.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			this.isVisibilidadCeldaActualizarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jButtonActualizarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaEliminarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jButtonEliminarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaCancelarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jButtonCancelarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaGuardarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosTipoSectorEcono.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=this.jButtonGuardarCambiosTablaTipoSectorEcono.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoSectorEcono=this.jButtonNuevoToolBarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=this.jButtonNuevoRelacionesToolBarTipoSectorEcono.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			this.isVisibilidadCeldaModificarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jButtonModificarToolBarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaActualizarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jButtonActualizarToolBarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaEliminarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jButtonEliminarToolBarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaCancelarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jButtonCancelarToolBarTipoSectorEcono.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoSectorEcono=this.jButtonGuardarCambiosToolBarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=this.jButtonGuardarCambiosTablaToolBarTipoSectorEcono.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoSectorEcono=this.jMenuItemNuevoTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=this.jMenuItemNuevoRelacionesTipoSectorEcono.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			this.isVisibilidadCeldaModificarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemModificarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaActualizarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemActualizarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaEliminarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemEliminarTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaCancelarTipoSectorEcono=this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemCancelarTipoSectorEcono.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoSectorEcono=this.jMenuItemGuardarCambiosTipoSectorEcono.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=this.jMenuItemGuardarCambiosTablaTipoSectorEcono.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoSectorEcono(Boolean esInicializar) {
		if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
				//if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoSectorEcono();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoSectorEcono(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoSectorEcono() {
		this.jButtonNuevoTipoSectorEcono.setVisible(this.isPermisoNuevoTipoSectorEcono);			
		this.jButtonDuplicarTipoSectorEcono.setVisible(this.isPermisoDuplicarTipoSectorEcono);			
		this.jButtonCopiarTipoSectorEcono.setVisible(this.isPermisoCopiarTipoSectorEcono);			
		this.jButtonVerFormTipoSectorEcono.setVisible(this.isPermisoVerFormTipoSectorEcono);			
		
		this.jButtonAbrirOrderByTipoSectorEcono.setVisible(this.isPermisoOrdenTipoSectorEcono);					
		
		this.jButtonNuevoRelacionesTipoSectorEcono.setVisible(this.isPermisoNuevoTipoSectorEcono);			
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonModificarTipoSectorEcono.setVisible(this.isPermisoActualizarTipoSectorEcono);	
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonActualizarTipoSectorEcono.setVisible(this.isPermisoActualizarTipoSectorEcono);	
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonEliminarTipoSectorEcono.setVisible(this.isPermisoEliminarTipoSectorEcono);
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonCancelarTipoSectorEcono.setVisible(this.isVisibilidadCeldaCancelarTipoSectorEcono);						
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosTipoSectorEcono.setVisible(this.isPermisoGuardarCambiosTipoSectorEcono);							
		}
		
		this.jButtonGuardarCambiosTablaTipoSectorEcono.setVisible(this.isPermisoActualizarTipoSectorEcono);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoSectorEcono() {
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonModificarTipoSectorEcono.setVisible(this.isPermisoActualizarTipoSectorEcono);	
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonActualizarTipoSectorEcono.setVisible(this.isPermisoActualizarTipoSectorEcono);	
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonEliminarTipoSectorEcono.setVisible(this.isPermisoEliminarTipoSectorEcono);
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonCancelarTipoSectorEcono.setVisible(this.isVisibilidadCeldaCancelarTipoSectorEcono);							
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosTipoSectorEcono.setVisible((this.isVisibilidadCeldaGuardarTipoSectorEcono && this.isPermisoGuardarCambiosTipoSectorEcono));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoSectorEcono() {
		if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoSectorEcono();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoSectorEcono() {
	}
	
	public void jTableDatosTipoSectorEconoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoSectorEcono(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoSectorEconoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.gettiposectorecono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposectorecono==null) {
						this.tiposectorecono = new TipoSectorEcono();
					}

					this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.tiposectorecono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
				}

				if(this.tiposectorecono.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiposectorecono.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSectorEcono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoSectorEconoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoSectorEcono(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoSectorEcono.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoSectorEcono.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.gettiposectorecono(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiposectoreconoLogic.getConnexion());

				if(this.tiposectorecono.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiposectorecono.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoSectorEcono=(TitledBorder)this.jScrollPanelDatosTipoSectorEcono.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoSectorEcono.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoSectorEconoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.gettiposectorecono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposectorecono==null) {
						this.tiposectorecono = new TipoSectorEcono();
					}

					this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.tiposectorecono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
				}

				if(this.tiposectorecono.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiposectorecono.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSectorEcono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoSectorEconoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.gettiposectorecono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposectorecono==null) {
						this.tiposectorecono = new TipoSectorEcono();
					}

					this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.tiposectorecono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
				}

				if(this.tiposectorecono.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiposectorecono.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSectorEcono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoSectorEconoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.gettiposectorecono(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposectorecono==null) {
						this.tiposectorecono = new TipoSectorEcono();
					}

					this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.tiposectorecono,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);
				}

				if(this.tiposectorecono.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiposectorecono.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSectorEcono(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoSectorEcono(false,false);

			this.getTipoSectorEconosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoSectorEcono(false);

			//if(TipoSectorEconoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoSectorEcono(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoSectorEcono(false,false);

			this.getTipoSectorEconosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoSectorEcono(false);

			//if(TipoSectorEconoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoSectorEcono(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoSectorEconoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoSectorEcono(false,false);

			this.getTipoSectorEconosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoSectorEcono(false);

			//if(TipoSectorEconoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoSectorEcono(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposectoreconoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoSectorEcono() {
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
		

		if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
			this.jInternalFrameDetalleFormTipoSectorEcono.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoSectorEcono.dispose();
			this.jInternalFrameDetalleFormTipoSectorEcono=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoSectorEcono!=null) {
			this.jInternalFrameReporteDinamicoTipoSectorEcono.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoSectorEcono.dispose();
			this.jInternalFrameReporteDinamicoTipoSectorEcono=null;
		}
		
		if(this.jInternalFrameImportacionTipoSectorEcono!=null) {
			this.jInternalFrameImportacionTipoSectorEcono.setVisible(false);	    			
			this.jInternalFrameImportacionTipoSectorEcono.dispose();
			this.jInternalFrameImportacionTipoSectorEcono=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoSectorEcono();
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoSectorEcono")) {
				jButtonNuevoTipoSectorEconoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoSectorEcono")) {
				jButtonDuplicarTipoSectorEconoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoSectorEcono")) {
				jButtonCopiarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoSectorEcono")) {
				jButtonVerFormTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoSectorEcono")) {
				jButtonNuevoTipoSectorEconoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoSectorEcono")) {
				jButtonDuplicarTipoSectorEconoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoSectorEcono")) {
				jButtonNuevoTipoSectorEconoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoSectorEcono")) {
				jButtonDuplicarTipoSectorEconoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoSectorEcono")) {
				jButtonNuevoTipoSectorEconoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoSectorEcono")) {
				jButtonNuevoTipoSectorEconoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoSectorEcono")) {
				jButtonNuevoTipoSectorEconoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoSectorEcono")) {
				jButtonModificarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoSectorEcono")) {
				jButtonModificarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoSectorEcono")) {
				jButtonModificarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoSectorEcono")) {
				jButtonActualizarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoSectorEcono")) {
				jButtonActualizarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoSectorEcono")) {
				jButtonActualizarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoSectorEcono")) {
				jButtonEliminarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoSectorEcono")) {
				jButtonEliminarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoSectorEcono")) {
				jButtonEliminarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoSectorEcono")) {
				jButtonCancelarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoSectorEcono")) {
				jButtonCancelarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoSectorEcono")) {
				jButtonCancelarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoSectorEcono")) {
				jButtonCerrarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoSectorEcono")) {
				jButtonCerrarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoSectorEcono")) {
				jButtonCerrarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoSectorEcono")) {
				jButtonMostrarOcultarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoSectorEcono")) {
				jButtonCancelarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoSectorEcono")) {
				jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoSectorEcono")) {
				jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoSectorEcono")) {
				jButtonCopiarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoSectorEcono")) {
				jButtonVerFormTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoSectorEcono")) {
				jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoSectorEcono")) {
				jButtonCopiarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoSectorEcono")) {
				jButtonVerFormTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoSectorEcono")) {
				jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoSectorEcono")) {
				jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoSectorEcono")) {
				jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoSectorEcono")) {
				jButtonRecargarInformacionTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoSectorEcono")) {
				jButtonRecargarInformacionTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoSectorEcono")) {
				jButtonRecargarInformacionTipoSectorEconoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoSectorEcono")) {
				jButtonAnterioresTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoSectorEcono")) {
				jButtonAnterioresTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoSectorEcono")) {
				jButtonAnterioresTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoSectorEcono")) {
				jButtonSiguientesTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoSectorEcono")) {
				jButtonSiguientesTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoSectorEcono")) {
				jButtonSiguientesTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoSectorEcono") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoSectorEcono")) {
				jButtonAbrirOrderByTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoSectorEcono") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoSectorEcono")) {
				jButtonMostrarOcultarTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoSectorEcono")) {
				jButtonNuevoGuardarCambiosTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoSectorEcono")) {
				jButtonNuevoGuardarCambiosTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoSectorEcono")) {
				jButtonNuevoGuardarCambiosTipoSectorEconoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoSectorEcono")) {
				jButtonCerrarReporteDinamicoTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoSectorEcono")) {
				jButtonGenerarReporteDinamicoTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoSectorEcono")) {
				
				jButtonGenerarExcelReporteDinamicoTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoSectorEcono")) {
				jButtonCerrarImportacionTipoSectorEconoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoSectorEcono")) {
				
				jButtonGenerarImportacionTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoSectorEcono")) {
				
				jButtonAbrirImportacionTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoSectorEcono")) {
				jComboBoxTiposAccionesTipoSectorEconoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoSectorEcono")) {
				jComboBoxTiposRelacionesTipoSectorEconoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoSectorEcono")) {
				jComboBoxTiposAccionesTipoSectorEconoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoSectorEcono")) {
				
				jComboBoxTiposSeleccionarTipoSectorEconoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoSectorEcono")) {
				jTextFieldValorCampoGeneralTipoSectorEconoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoSectorEcono")) {
				jButtonAbrirOrderByTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoSectorEcono")) {
				jButtonAbrirOrderByTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoSectorEcono")) {
				jButtonCerrarOrderByTipoSectorEconoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoSectorEconoBusqueda")) {
				this.jButtonidTipoSectorEconoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoSectorEconoUpdate")) {
				this.jButtonid_empresaTipoSectorEconoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoSectorEconoBusqueda")) {
				this.jButtonid_empresaTipoSectorEconoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoSectorEconoBusqueda")) {
				this.jButtoncodigoTipoSectorEconoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoSectorEconoBusqueda")) {
				this.jButtonnombreTipoSectorEconoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoSectorEcono")) {
				this.jButtonBusquedaPorCodigoTipoSectorEconoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoSectorEcono")) {
				this.jButtonBusquedaPorNombreTipoSectorEconoActionPerformed(evt);
			}
			
			;
			
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoSectorEcono();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSectorEconoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				


				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoSectorEcono tiposectoreconoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiposectoreconoLocal=this.tiposectorecono;
			} else {
				tiposectoreconoLocal=this.tiposectoreconoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
							
				
				


				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSectorEconoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
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
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
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
			
			


			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSectorEconoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
								
						
				


				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
								
				
				


				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSectorEconoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSectorEconoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSectorEconoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
							
				
				


				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSectorEconoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
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
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
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
			
			


			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSectorEconoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
								
				
				


				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSectorEconoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSectorEconoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSectorEconoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoSectorEcono")) {
					jCheckBoxSeleccionarTodosTipoSectorEconoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoSectorEcono")) {
					jCheckBoxSeleccionadosTipoSectorEconoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoSectorEcono")) {
					
				}
				
				


				
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
												
				
				


				
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSectorEconoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSectorEconoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
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
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
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
			
			


			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSectorEconoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposectorecono);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposectorecono);
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
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
				
				


				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSectorEcono.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSectorEcono.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSectorEconoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposectoreconoAnterior =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoSectorEcono")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoSectorEconoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoSectorEcono.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiposectorecono =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiposectorecono);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoSectorEcono")) {
				
				}
				
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoSectorEcono")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoSectorEcono.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoSectorEcono")) {
			
			}
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoSectorEcono();
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoSectorEcono")) {
				jButtonNuevoTipoSectorEconoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoSectorEcono")) {
				jButtonDuplicarTipoSectorEconoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoSectorEcono")) {
				jButtonCopiarTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoSectorEcono")) {
				jButtonVerFormTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoSectorEcono")) {
				jButtonNuevoTipoSectorEconoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoSectorEcono")) {
				jButtonModificarTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoSectorEcono")) {
				jButtonActualizarTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoSectorEcono")) {
				jButtonEliminarTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoSectorEcono")) {
				jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoSectorEcono")) {
				jButtonCancelarTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoSectorEcono")) {
				jButtonCerrarTipoSectorEconoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoSectorEcono")) {
				jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoSectorEcono")) {
				jButtonNuevoGuardarCambiosTipoSectorEconoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoSectorEcono")) {
				jButtonAbrirOrderByTipoSectorEconoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoSectorEcono")) {
				jButtonRecargarInformacionTipoSectorEconoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoSectorEcono")) {
				jButtonAnterioresTipoSectorEconoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoSectorEcono")) {
				jButtonSiguientesTipoSectorEconoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoSectorEconoBusqueda")) {
				this.jButtonidTipoSectorEconoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoSectorEconoUpdate")) {
				this.jButtonid_empresaTipoSectorEconoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoSectorEconoBusqueda")) {
				this.jButtonid_empresaTipoSectorEconoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoSectorEconoBusqueda")) {
				this.jButtoncodigoTipoSectorEconoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoSectorEconoBusqueda")) {
				this.jButtonnombreTipoSectorEconoBusquedaActionPerformed(evt);
			}
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoSectorEcono();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoSectorEcono")) {
				closingInternalFrameTipoSectorEcono();
				
			} else if(sTipo.equals("jButtonCancelarTipoSectorEcono")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoSectorEcono = (JInternalFrameBase)evt.getSource();
	            	
	            TipoSectorEconoBeanSwingJInternalFrame jInternalFrameParent=(TipoSectorEconoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoSectorEcono.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoSectorEconoActionPerformed(null);
			}
			
			TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposectorecono,new Object(),this.tiposectoreconoParameterGeneral,this.tiposectoreconoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoSectorEcono(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoSectorEcono(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoSectorEcono(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiposectorecono)) {
			if(!esControlTabla) {
				if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.tiposectorecono,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);			
				}
				
				if(this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoSectorEcono(this.tiposectorecono,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposectoreconoReturnGeneral=tiposectoreconoLogic.procesarEventosTipoSectorEconosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposectoreconoLogic.getTipoSectorEconos(),this.tiposectorecono,this.tiposectoreconoParameterGeneral,this.isEsNuevoTipoSectorEcono,classes);//this.tiposectoreconoLogic.getTipoSectorEcono()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoSectorEcono(this.tiposectoreconoReturnGeneral,this.tiposectoreconoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoSectorEcono(classes,this.tiposectoreconoReturnGeneral,this.tiposectoreconoBean,false);
					}
						
					if(this.tiposectoreconoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoSectorEcono(this.tiposectoreconoReturnGeneral.getTipoSectorEcono());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoSectorEcono(this.tiposectoreconoReturnGeneral.getTipoSectorEcono());	
					}
						
					if(this.tiposectoreconoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoSectorEcono(this.tiposectoreconoReturnGeneral.getTipoSectorEcono(),classes);//this.tiposectoreconoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoSectorEcono(this.tiposectorecono,classes);//this.tiposectoreconoBean);									
				}
			
				if(TipoSectorEconoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoSectorEcono(this.tiposectorecono,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSectorEcono(this.tiposectorecono);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiposectoreconoAnterior!=null) {
						this.tiposectorecono=this.tiposectoreconoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposectoreconoReturnGeneral=tiposectoreconoLogic.procesarEventosTipoSectorEconosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposectoreconoLogic.getTipoSectorEconos(),this.tiposectorecono,this.tiposectoreconoParameterGeneral,this.isEsNuevoTipoSectorEcono,classes);//this.tiposectoreconoLogic.getTipoSectorEcono()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposectoreconoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiposectoreconoReturnGeneral.getTipoSectorEcono(),tiposectoreconoLogic.getTipoSectorEconos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiposectoreconoReturnGeneral.getTipoSectorEcono(),this.tiposectoreconos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoSectorEcono.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoSectorEcono.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoSectorEcono();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoSectorEcono() throws Exception {
		
		TipoSectorEconoModel tiposectoreconoModel=(TipoSectorEconoModel)this.jTableDatosTipoSectorEcono.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposectoreconoModel.tiposectoreconos=this.tiposectoreconoLogic.getTipoSectorEconos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiposectoreconoModel.tiposectoreconos=this.tiposectoreconos;
		}
		
		
		((TipoSectorEconoModel) this.jTableDatosTipoSectorEcono.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoSectorEcono() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiposectoreconoAnterior(),this.tiposectoreconoLogic.getTipoSectorEconos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiposectoreconoAnterior(),this.tiposectoreconos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoSectorEcono();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoSectorEcono(TipoSectorEcono tiposectorecono,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaComercial.class)) {
					this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.setReferenciaComercials(tiposectorecono.getReferenciaComercials());
					this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaComercial(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
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
										
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposectorecono,new Object(),generalEntityParameterGeneral,this.tiposectoreconoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoSectorEconoConstantesFunciones.getClassesRelationshipsOfTipoSectorEcono(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoSectorEconoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoSectorEcono(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoSectorEcono(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoSectorEconoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposectorecono,new Object(),generalEntityParameterGeneral,this.tiposectoreconoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoSectorEcono(TipoSectorEconoBean tiposectoreconoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaComercial.class)) {
					this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.setReferenciaComercials(tiposectorecono.getReferenciaComercials());
					this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaComercial(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoSectorEcono(ArrayList<Classe> classes,TipoSectorEconoReturnGeneral tiposectoreconoReturnGeneral,TipoSectorEconoBean tiposectoreconoBean,Boolean conDefault) throws Exception {
		
			this.tiposectoreconoBean.setReferenciaComercials(tiposectoreconoReturnGeneral.getTipoSectorEcono().getReferenciaComercials());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoSectorEcono(TipoSectorEcono tiposectorecono,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaComercial.class)) {
					tiposectorecono.setReferenciaComercials(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialBeanSwingJInternalFrame.referenciacomercialLogic.getReferenciaComercials());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiposectorecono)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoSectorEcono = new TipoSectorEconoDetalleFormJInternalFrame(jDesktopPane,this.tiposectoreconoSessionBean.getConGuardarRelaciones(),this.tiposectoreconoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoSectorEcono);
		this.jInternalFrameDetalleFormTipoSectorEcono.setVisible(false);
		this.jInternalFrameDetalleFormTipoSectorEcono.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoSectorEcono.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoSectorEcono.tiposectoreconoLogic=this.tiposectoreconoLogic;
		
		this.cargarCombosFrameForeignKeyTipoSectorEcono("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoSectorEcono();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoSectorEcono();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoSectorEcono("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoSectorEcono();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoSectorEcono.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoSectorEcono"));
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonModificarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"ModificarTipoSectorEcono"));

		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonModificarToolBarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoSectorEcono"));
					
		this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemModificarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoSectorEcono"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonActualizarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"ActualizarTipoSectorEcono"));
		
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonActualizarToolBarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoSectorEcono"));
						
		this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemActualizarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoSectorEcono"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonEliminarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"EliminarTipoSectorEcono"));
		
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonEliminarToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoSectorEcono"));
								
		this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemEliminarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoSectorEcono"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonCancelarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"CancelarTipoSectorEcono"));
		
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonCancelarToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoSectorEcono"));
					
		this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemCancelarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoSectorEcono"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemDetalleCerrarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoSectorEcono"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSectorEcono"));
		
		
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSectorEcono"));
		
		
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoSectorEcono"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonidTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSectorEconoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonid_empresaTipoSectorEconoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSectorEconoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonid_empresaTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSectorEconoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtoncodigoTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSectorEconoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonnombreTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSectorEconoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoSectorEcono.jTabbedPaneRelacionesTipoSectorEcono.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoSectorEcono"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoSectorEcono"));
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoSectorEcono"));
		}
		
		this.jTableDatosTipoSectorEcono.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoSectorEcono"));
		
		this.jTableDatosTipoSectorEcono.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoSectorEcono"));
		
		this.jButtonNuevoTipoSectorEcono.addActionListener(new ButtonActionListener(this,"NuevoTipoSectorEcono"));
		
		this.jButtonDuplicarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"DuplicarTipoSectorEcono"));
		
		this.jButtonCopiarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"CopiarTipoSectorEcono"));
		
		this.jButtonVerFormTipoSectorEcono.addActionListener(new ButtonActionListener(this,"VerFormTipoSectorEcono"));
		
		
		this.jButtonNuevoToolBarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoSectorEcono"));
			
		this.jButtonDuplicarToolBarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoSectorEcono"));
			
		this.jMenuItemNuevoTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoSectorEcono"));
			
		this.jMenuItemDuplicarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoSectorEcono"));		
		
		
		this.jButtonNuevoRelacionesTipoSectorEcono.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoSectorEcono"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoSectorEcono"));
			
		this.jMenuItemNuevoRelacionesTipoSectorEcono.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoSectorEcono"));		
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonModificarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"ModificarTipoSectorEcono"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonModificarToolBarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoSectorEcono"));
			
			this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemModificarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoSectorEcono"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonActualizarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"ActualizarTipoSectorEcono"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonActualizarToolBarTipoSectorEcono.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoSectorEcono"));
				
			this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemActualizarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoSectorEcono"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonEliminarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"EliminarTipoSectorEcono"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonEliminarToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoSectorEcono"));
						
			this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemEliminarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoSectorEcono"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonCancelarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"CancelarTipoSectorEcono"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonCancelarToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoSectorEcono"));
			
			this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemCancelarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoSectorEcono"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoSectorEcono"));		
		
		
		this.jButtonCerrarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"CerrarTipoSectorEcono"));
		
		
		this.jButtonCerrarToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoSectorEcono"));
			
		this.jMenuItemCerrarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoSectorEcono"));
			
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jMenuItemDetalleCerrarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoSectorEcono"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosTipoSectorEcono.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoSectorEcono"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSectorEcono"));
		}
		
		this.jButtonCopiarToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoSectorEcono"));
			
		this.jButtonVerFormToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoSectorEcono"));
		
		this.jMenuItemGuardarCambiosTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoSectorEcono"));
			
		this.jMenuItemCopiarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoSectorEcono"));		
		
		this.jMenuItemVerFormTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoSectorEcono"));		
		
		
		this.jButtonGuardarCambiosTablaTipoSectorEcono.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoSectorEcono"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoSectorEcono"));
			
		this.jMenuItemGuardarCambiosTablaTipoSectorEcono.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoSectorEcono"));		
		
		
		
		this.jButtonRecargarInformacionTipoSectorEcono.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoSectorEcono"));
					
		this.jButtonRecargarInformacionToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoSectorEcono"));
		
		this.jMenuItemRecargarInformacionTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoSectorEcono"));		
		
		
		
		this.jButtonAnterioresTipoSectorEcono.addActionListener (new ButtonActionListener(this,"AnterioresTipoSectorEcono"));
		
		
		this.jButtonAnterioresToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoSectorEcono"));
		
		this.jMenuItemAnterioresTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoSectorEcono"));		
		
		
		this.jButtonSiguientesTipoSectorEcono.addActionListener (new ButtonActionListener(this,"SiguientesTipoSectorEcono"));
		
		
		this.jButtonSiguientesToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoSectorEcono"));
			
		this.jMenuItemSiguientesTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoSectorEcono"));
			
		this.jMenuItemAbrirOrderByTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoSectorEcono"));
			
		this.jMenuItemMostrarOcultarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoSectorEcono"));
			
		this.jMenuItemDetalleAbrirOrderByTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoSectorEcono"));
			
		this.jMenuItemDetalleMostarOcultarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoSectorEcono"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoSectorEcono.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoSectorEcono"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoSectorEcono"));
			
		this.jMenuItemNuevoGuardarCambiosTipoSectorEcono.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoSectorEcono"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoSectorEcono.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoSectorEcono"));

		this.jCheckBoxSeleccionadosTipoSectorEcono.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoSectorEcono"));
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoSectorEcono"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoSectorEcono.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoSectorEcono"));
			
		this.jComboBoxTiposAccionesTipoSectorEcono.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoSectorEcono"));
					
		this.jComboBoxTiposSeleccionarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoSectorEcono"));
			
		this.jTextFieldValorCampoGeneralTipoSectorEcono.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoSectorEcono"));		
		
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonidTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSectorEconoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonid_empresaTipoSectorEconoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSectorEconoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonid_empresaTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSectorEconoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtoncodigoTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSectorEconoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonnombreTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSectorEconoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoSectorEcono.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoSectorEcono"));

			this.jButtonBusquedaPorNombreTipoSectorEcono.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoSectorEcono"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoSectorEcono!=null) {
				this.jInternalFrameReporteDinamicoTipoSectorEcono.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSectorEcono"));
				this.jInternalFrameReporteDinamicoTipoSectorEcono.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSectorEcono"));
				this.jInternalFrameReporteDinamicoTipoSectorEcono.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSectorEcono"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoSectorEcono.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSectorEcono"));				
			//this.jButtonGenerarReporteDinamicoTipoSectorEcono.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSectorEcono"));
			//this.jButtonGenerarExcelReporteDinamicoTipoSectorEcono.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSectorEcono"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoSectorEcono!=null) {
				this.jInternalFrameImportacionTipoSectorEcono.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoSectorEcono"));
				this.jInternalFrameImportacionTipoSectorEcono.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoSectorEcono"));
				this.jInternalFrameImportacionTipoSectorEcono.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoSectorEcono"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoSectorEcono.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoSectorEcono"));
			
			this.jButtonAbrirOrderByToolBarTipoSectorEcono.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoSectorEcono"));			
			
			if(this.jInternalFrameOrderByTipoSectorEcono!=null) {
				this.jInternalFrameOrderByTipoSectorEcono.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoSectorEcono"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSectorEcono.jTabbedPaneRelacionesTipoSectorEcono.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoSectorEcono"));
		
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
            		closingInternalFrameTipoSectorEcono();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoSectorEcono.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoSectorEcono = (JInternalFrameBase)event.getSource();
	            	
	            TipoSectorEconoBeanSwingJInternalFrame jInternalFrameParent=(TipoSectorEconoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoSectorEcono.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoSectorEconoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoSectorEcono.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoSectorEconoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoSectorEcono.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoSectorEcono.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSectorEconoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSectorEconoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSectorEconoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoSectorEcono";
		inputMap = this.jButtonNuevoTipoSectorEcono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoSectorEcono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoSectorEconoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSectorEconoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSectorEconoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSectorEconoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoSectorEcono";
		inputMap = this.jButtonNuevoRelacionesTipoSectorEcono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoSectorEcono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoSectorEconoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoSectorEcono";
		inputMap = this.jButtonModificarTipoSectorEcono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoSectorEcono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoSectorEconoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoSectorEcono";
		inputMap = this.jButtonActualizarTipoSectorEcono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoSectorEcono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoSectorEconoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoSectorEcono";
		inputMap = this.jButtonEliminarTipoSectorEcono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoSectorEcono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoSectorEconoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoSectorEcono";
		inputMap = this.jButtonCancelarTipoSectorEcono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoSectorEcono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoSectorEconoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoSectorEcono";
		inputMap = this.jButtonCerrarTipoSectorEcono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoSectorEcono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoSectorEconoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoSectorEcono";
		inputMap = this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosTipoSectorEcono.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonGuardarCambiosTipoSectorEcono.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoSectorEconoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoSectorEcono.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoSectorEconoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoSectorEcono.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoSectorEconoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoSectorEcono.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoSectorEconoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoSectorEcono.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoSectorEconoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonidTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSectorEconoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonid_empresaTipoSectorEconoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSectorEconoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonid_empresaTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSectorEconoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtoncodigoTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSectorEconoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSectorEcono.jButtonnombreTipoSectorEconoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSectorEconoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoSectorEcono.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoSectorEcono"));

		this.jButtonBusquedaPorNombreTipoSectorEcono.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoSectorEcono"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoSectorEcono.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoSectorEconoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoSectorEconoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoSectorEcono.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoSectorEcono(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconoLogic.getTipoSectorEconos()) {
					tiposectoreconoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSectorEcono tiposectoreconoAux:tiposectoreconos) {
					tiposectoreconoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoSectorEconoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoSectorEcono(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconoLogic.getTipoSectorEconos()) {
						tiposectoreconoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSectorEcono tiposectoreconoAux:tiposectoreconos) {
						tiposectoreconoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconoLogic.getTipoSectorEconos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSectorEcono tiposectoreconoAux:tiposectoreconos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoSectorEcono(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoSectorEcono.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoSectorEcono.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoSectorEcono,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoSectorEconoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoSectorEcono(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoSectorEcono.getSelectedRows();
			
			TipoSectorEcono tiposectoreconoLocal=new TipoSectorEcono();
			
			//this.seleccionarTodosTipoSectorEcono(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposectoreconoLocal =(TipoSectorEcono) this.tiposectoreconoLogic.getTipoSectorEconos().toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiposectoreconoLocal =(TipoSectorEcono) this.tiposectoreconos.toArray()[this.jTableDatosTipoSectorEcono.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiposectoreconoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconoLogic.getTipoSectorEconos()) {
						tiposectoreconoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSectorEcono tiposectoreconoAux:tiposectoreconos) {
						tiposectoreconoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoSectorEcono(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoSectorEcono.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoSectorEcono.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoSectorEcono,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoSectorEconoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoSectorEconoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoSectorEconoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoSectorEcono(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoSectorEcono.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconoLogic.getTipoSectorEconos()) {
				
						if(sTipoSeleccionar.equals(TipoSectorEconoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiposectoreconoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoSectorEconoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposectoreconoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSectorEcono tiposectoreconoAux:tiposectoreconos) {
					
						if(sTipoSeleccionar.equals(TipoSectorEconoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiposectoreconoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoSectorEconoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposectoreconoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoSectorEcono(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoSectorEconoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoSectorEcono(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoSectorEcono=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoSectorEcono.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoSectorEcono) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoSectorEcono(conSplash);
				
					this.generarReporteTipoSectorEconosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoSectorEconosSeleccionados();
				//this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoSectorEconosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoSectorEconosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoSectorEcono();
				
				this.exportarTipoSectorEconosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoSectorEconos();
				//this.importarTipoSectorEconos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoSectorEcono();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoSectorEconosSeleccionados();
				//this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Sector Econo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoSectorEcono();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoSectorEcono)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoSectorEcono(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Sector Econo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoSectorEconoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoSectorEcono) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoSectorEcono(conSplash);
					
						//this.actualizarParametrosGeneralTipoSectorEcono();
						
						this.generarReporteProcesoAccionTipoSectorEconosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoSectorEconoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Sector EconoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Sector Econo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoSectorEcono();
				
						this.actualizarParametrosGeneralTipoSectorEcono();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiposectoreconoReturnGeneral=tiposectoreconoLogic.procesarAccionTipoSectorEconosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiposectoreconoLogic.getTipoSectorEconos(),this.tiposectoreconoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoSectorEconoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoSectorEcono();
					
					TipoSectorEconoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoSectorEconoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoSectorEcono.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxTiposAccionesFormularioTipoSectorEcono.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoSectorEcono(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoSectorEconoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoSectorEcono();
			
			if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();		
			TipoSectorEcono tiposectorecono=new TipoSectorEcono();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoSectorEcono(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoSectorEcono.getSelectedItem();
			
			
			
			
			tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiposectoreconosSeleccionados.size()==1) {
				for(TipoSectorEcono tiposectoreconoAux:tiposectoreconosSeleccionados) {
					tiposectorecono=tiposectoreconoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Referencia Comercial")) {
					jButtonReferenciaComercialActionPerformed(null,rowIndex,true,false,tiposectorecono);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoSectorEcono();
			
      		//this.finishProcessTipoSectorEcono(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoSectorEconoReturnGeneral() throws Exception {
		if(this.tiposectoreconoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiposectoreconoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiposectoreconoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiposectoreconoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiposectoreconoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiposectoreconoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoSectorEcono(false);
		}
		
		if(this.tiposectoreconoReturnGeneral.getConRetornoLista() || this.tiposectoreconoReturnGeneral.getConRetornoObjeto()) {
			if(this.tiposectoreconoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposectoreconoLogic.setTipoSectorEconos(this.tiposectoreconoReturnGeneral.getTipoSectorEconos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiposectoreconoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposectoreconoLogic.setTipoSectorEcono(this.tiposectoreconoReturnGeneral.getTipoSectorEcono());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoSectorEcono(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoSectorEcono() throws Exception {
		
		
	}
	
	public ArrayList<TipoSectorEcono> getTipoSectorEconosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoSectorEcono) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoSectorEcono tiposectoreconoAux:tiposectoreconoLogic.getTipoSectorEconos()) {
					if(tiposectoreconoAux.getIsSelected()) {
						tiposectoreconosSeleccionados.add(tiposectoreconoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSectorEcono tiposectoreconoAux:this.tiposectoreconos) {
					if(tiposectoreconoAux.getIsSelected()) {
						tiposectoreconosSeleccionados.add(tiposectoreconoAux);				
					}
				}
			}
			
			if(tiposectoreconosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiposectoreconosSeleccionados.addAll(this.tiposectoreconoLogic.getTipoSectorEconos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiposectoreconosSeleccionados.addAll(this.tiposectoreconos);				
					}
				}
			}
		} else {
			tiposectoreconosSeleccionados.add(this.tiposectorecono);
		}
		
		return tiposectoreconosSeleccionados;
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
	
	public void generarReporteTipoSectorEconosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoSectorEconosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoSectorEconosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoSectorEconosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoSectorEconosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoSectorEconosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Sector Econo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoSectorEconosSeleccionados() throws Exception {
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();		
		
		tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoSectorEconos("Todos",tiposectoreconosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoSectorEconosSeleccionados() throws Exception {
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();		
		
		tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoSectorEconos("Todos",tiposectoreconosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoSectorEconosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();
		
		tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoSectorEconos("Todos",tiposectoreconosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoSectorEconosSeleccionados() throws Exception {
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoSectorEcono();
		
		
		tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoSectorEcono();
		
		
		//this.generarReporteTipoSectorEconos("Todos",tiposectoreconosSeleccionados ,tiposectoreconoImplementable,tiposectoreconoImplementableHome);
	}
	
	public void mostrarImportacionTipoSectorEconos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoSectorEcono();
		
		this.abrirFrameImportacionTipoSectorEcono();		
		
			
		//this.generarReporteTipoSectorEconos("Todos",tiposectoreconosSeleccionados ,tiposectoreconoImplementable,tiposectoreconoImplementableHome);
	}
	
	public void importarTipoSectorEconos() throws Exception {		
	
	}
	
	public void exportarTipoSectorEconosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoSectorEconosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoSectorEconosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoSectorEconosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Sector Econo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoSectorEconosSeleccionados() throws Exception {
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();		
		
		tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposectorecono."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoSectorEcono(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoSectorEcono tiposectoreconoAux:tiposectoreconosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoSectorEcono(tiposectoreconoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiposectoreconoAux.setsDetalleGeneralEntityReporte(tiposectoreconoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sector Econo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoSectorEcono(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoSectorEconoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSectorEconoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSectorEconoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSectorEconoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoSectorEcono(TipoSectorEcono tiposectorecono,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiposectorecono.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposectorecono.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposectorecono.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposectorecono.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposectorecono.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoSectorEconosSeleccionados() throws Exception {
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();		
		
		tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposectorecono.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoSectorEconos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoSectorEcono(row);				
				iRow++;
			}				
			
			for(TipoSectorEcono tiposectoreconoAux:tiposectoreconosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoSectorEcono(tiposectoreconoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sector Econo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoSectorEconosSeleccionados() throws Exception {
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();		
		
		tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposectorecono.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiposectoreconos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiposectorecono");
			//elementRoot.appendChild(element);
		
			for(TipoSectorEcono tiposectoreconoAux:tiposectoreconosSeleccionados) {
				element = document.createElement("tiposectorecono");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoSectorEcono(tiposectoreconoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sector Econo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoSectorEcono(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSectorEconoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoSectorEcono(TipoSectorEcono tiposectorecono,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiposectorecono.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposectorecono.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposectorecono.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposectorecono.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoSectorEcono(TipoSectorEcono tiposectorecono,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoSectorEconoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiposectorecono.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoSectorEconoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiposectorecono.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoSectorEconoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiposectorecono.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoSectorEconoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiposectorecono.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoSectorEconoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiposectorecono.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoSectorEconosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados=new ArrayList<TipoSectorEcono>();
		
		tiposectoreconosSeleccionados=this.getTipoSectorEconosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoSectorEcono(tiposectoreconosSeleccionados);
		
		this.generarReporteTipoSectorEconos("Todos",tiposectoreconosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoSectorEcono(ArrayList<TipoSectorEcono> tiposectoreconosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoSectorEcono tiposectoreconoAux:tiposectoreconosSeleccionados) {
				tiposectoreconoAux.setsDetalleGeneralEntityReporte(tiposectoreconoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiposectoreconoAux.setsDescripcionGeneralEntityReporte1(tiposectoreconoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoSectorEconoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiposectoreconoAux.setsDescripcionGeneralEntityReporte1(tiposectoreconoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoSectorEconoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiposectoreconoAux.setsDescripcionGeneralEntityReporte1(tiposectoreconoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSectorEconoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoSectorEcono(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoSectorEcono=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=true;
				this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=true;
			}
			
			this.isVisibilidadCeldaModificarTipoSectorEcono=false;
			this.isVisibilidadCeldaActualizarTipoSectorEcono=false;
			this.isVisibilidadCeldaEliminarTipoSectorEcono=false;
			this.isVisibilidadCeldaCancelarTipoSectorEcono=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoSectorEcono=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=false;
			this.isVisibilidadCeldaModificarTipoSectorEcono=false;
			this.isVisibilidadCeldaActualizarTipoSectorEcono=true;
			this.isVisibilidadCeldaEliminarTipoSectorEcono=false;
			this.isVisibilidadCeldaCancelarTipoSectorEcono=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoSectorEcono=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=false;
			this.isVisibilidadCeldaModificarTipoSectorEcono=false;
			this.isVisibilidadCeldaActualizarTipoSectorEcono=true;
			this.isVisibilidadCeldaEliminarTipoSectorEcono=true;
			this.isVisibilidadCeldaCancelarTipoSectorEcono=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoSectorEcono=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=false;
			this.isVisibilidadCeldaModificarTipoSectorEcono=false;
			this.isVisibilidadCeldaActualizarTipoSectorEcono=true;
			this.isVisibilidadCeldaEliminarTipoSectorEcono=false;
			this.isVisibilidadCeldaCancelarTipoSectorEcono=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoSectorEcono=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=true;
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=true;
			this.isVisibilidadCeldaModificarTipoSectorEcono=false;
			this.isVisibilidadCeldaActualizarTipoSectorEcono=false;
			this.isVisibilidadCeldaEliminarTipoSectorEcono=false;
			this.isVisibilidadCeldaCancelarTipoSectorEcono=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoSectorEcono=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=false;
			this.isVisibilidadCeldaActualizarTipoSectorEcono=false;
			this.isVisibilidadCeldaEliminarTipoSectorEcono=false;
			this.isVisibilidadCeldaCancelarTipoSectorEcono=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoSectorEcono=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=false;
			this.isVisibilidadCeldaModificarTipoSectorEcono=true;
			this.isVisibilidadCeldaActualizarTipoSectorEcono=false;
			this.isVisibilidadCeldaEliminarTipoSectorEcono=false;
			this.isVisibilidadCeldaCancelarTipoSectorEcono=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSectorEcono=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoSectorEconoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoSectorEcono=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=true;
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=true;
		} else {
			this.actualizarEstadoPanelsTipoSectorEcono(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoSectorEcono=false;
			//this.isVisibilidadCeldaVerFormTipoSectorEcono=false;
			this.isVisibilidadCeldaDuplicarTipoSectorEcono=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiposectoreconoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoSectorEcono=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			if(!tiposectoreconoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=false;												
			}
			
			this.jButtonCerrarTipoSectorEcono.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoSectorEcono=false;
		}
		
		if(!this.permiteMantenimiento(this.tiposectorecono)) {
			this.isVisibilidadCeldaActualizarTipoSectorEcono=false;
			this.isVisibilidadCeldaEliminarTipoSectorEcono=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoSectorEcono() {
		this.isVisibilidadCeldaNuevoTipoSectorEcono=false;
		this.isVisibilidadCeldaGuardarCambiosTipoSectorEcono=false;
	}
	
	public void actualizarEstadoPanelsTipoSectorEcono(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoSectorEcono!=null) {
				this.jScrollPanelDatosEdicionTipoSectorEcono.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSectorEcono!=null) {
				this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSectorEcono!=null) {
				this.jScrollPanelDatosTipoSectorEcono.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSectorEcono!=null) {
				this.jPanelPaginacionTipoSectorEcono.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSectorEcono!=null) {
				this.jPanelParametrosReportesTipoSectorEcono.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoSectorEcono!=null) {
				this.jScrollPanelDatosEdicionTipoSectorEcono.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSectorEcono!=null) {
				this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoSectorEcono!=null) {
				this.jScrollPanelDatosTipoSectorEcono.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSectorEcono!=null) {
				this.jPanelPaginacionTipoSectorEcono.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSectorEcono!=null) {
				this.jPanelParametrosReportesTipoSectorEcono.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoSectorEcono!=null) {
				this.jScrollPanelDatosEdicionTipoSectorEcono.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSectorEcono!=null) {
				this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoSectorEcono!=null) {
				this.jScrollPanelDatosTipoSectorEcono.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSectorEcono!=null) {
				this.jPanelPaginacionTipoSectorEcono.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSectorEcono!=null) {
				this.jPanelParametrosReportesTipoSectorEcono.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoSectorEcono!=null) {
				this.jScrollPanelDatosEdicionTipoSectorEcono.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSectorEcono!=null) {
				this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoSectorEcono!=null) {
				this.jScrollPanelDatosTipoSectorEcono.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSectorEcono!=null) {
				this.jPanelPaginacionTipoSectorEcono.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSectorEcono!=null) {
				this.jPanelParametrosReportesTipoSectorEcono.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoSectorEcono!=null) {
				this.jScrollPanelDatosEdicionTipoSectorEcono.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSectorEcono!=null) {
				this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSectorEcono!=null) {
				this.jScrollPanelDatosTipoSectorEcono.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSectorEcono!=null) {
				this.jPanelPaginacionTipoSectorEcono.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSectorEcono!=null) {
				this.jPanelParametrosReportesTipoSectorEcono.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoSectorEcono!=null) {
				this.jScrollPanelDatosEdicionTipoSectorEcono.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSectorEcono!=null) {
				this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSectorEcono!=null) {
				this.jScrollPanelDatosTipoSectorEcono.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSectorEcono!=null) {
				this.jPanelPaginacionTipoSectorEcono.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSectorEcono!=null) {
				this.jPanelParametrosReportesTipoSectorEcono.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoSectorEcono!=null) {
				this.jScrollPanelDatosEdicionTipoSectorEcono.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSectorEcono!=null) {
				this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSectorEcono!=null) {
				this.jScrollPanelDatosTipoSectorEcono.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSectorEcono!=null) {
				this.jPanelPaginacionTipoSectorEcono.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSectorEcono!=null) {
				this.jPanelParametrosReportesTipoSectorEcono.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoSectorEcono!=null) {
					this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoSectorEcono!=null) {
				this.jPanelParametrosReportesTipoSectorEcono.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSectorEcono!=null) {
				this.jTabbedPaneBusquedasTipoSectorEcono.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoSectorEcono!=null) {
				this.jPanelParametrosReportesTipoSectorEcono.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoSectorEcono.remove(jPanelBusquedaPorCodigoTipoSectorEcono);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoSectorEcono.remove(jPanelBusquedaPorNombreTipoSectorEcono);}
		}
		
	}
	
	

	public String registrarSesionTipoSectorEconoParaReferenciaComerciales() throws Exception {
		Boolean isPaginaPopupReferenciaComercial=false;

		try {

			if(this.tiposectoreconoSessionBean==null) {
				this.tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialSessionBean==null) {
				this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			}

			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialSessionBean.setsPathNavegacionActual(tiposectoreconoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupReferenciaComercial=this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeReferenciaComercial(false);
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaComercial(TipoSectorEconoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialSessionBean.setisBusquedaDesdeForeignKeySesionTipoSectorEcono(true);
			this.jInternalFrameDetalleFormTipoSectorEcono.referenciacomercialSessionBean.setlidTipoSectorEconoActual(this.idTipoSectorEconoActual);

			tiposectoreconoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoSectorEcono(true);
			tiposectoreconoSessionBean.setlIdTipoSectorEconoActualForeignKey(this.idTipoSectorEconoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoSectorEconoSessionBean tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
		
		if(this.tiposectoreconoSessionBean==null) {
			this.tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
		}
		
		this.tiposectoreconoSessionBean.setsUltimaBusquedaTipoSectorEcono(this.getsAccionBusqueda());
		this.tiposectoreconoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiposectoreconoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tiposectoreconoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tiposectoreconoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiposectoreconoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoSectorEconoSessionBean tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
		
		if(this.tiposectoreconoSessionBean==null) {
			this.tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
		}
		
		if(this.tiposectoreconoSessionBean.getsUltimaBusquedaTipoSectorEcono()!=null&&!this.tiposectoreconoSessionBean.getsUltimaBusquedaTipoSectorEcono().equals("")) {
			this.setsAccionBusqueda(tiposectoreconoSessionBean.getsUltimaBusquedaTipoSectorEcono());
			this.setiNumeroPaginacion(tiposectoreconoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiposectoreconoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tiposectoreconoSessionBean.getcodigo());
				tiposectoreconoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tiposectoreconoSessionBean.getnombre());
				tiposectoreconoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiposectoreconoSessionBean.getid_empresa());
				tiposectoreconoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiposectoreconoSessionBean.setsUltimaBusquedaTipoSectorEcono("");
		this.tiposectoreconoSessionBean.setiNumeroPaginacion(TipoSectorEconoConstantesFunciones.INUMEROPAGINACION);
		this.tiposectoreconoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoSectorEcono(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoSectorEcono() {
		this.updateBorderResaltarBusquedasFormularioTipoSectorEcono();
		this.updateVisibilidadBusquedasFormularioTipoSectorEcono();
		this.updateHabilitarBusquedasFormularioTipoSectorEcono();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoSectorEcono() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoSectorEcono.getComponents().length>0) {
	

		if(this.tiposectoreconoConstantesFunciones.resaltarBusquedaPorCodigoTipoSectorEcono!=null) {
			index= this.jTabbedPaneBusquedasTipoSectorEcono.indexOfComponent(this.jPanelBusquedaPorCodigoTipoSectorEcono);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoSectorEcono.getComponent(index);
				jPanel.setBorder(this.tiposectoreconoConstantesFunciones.resaltarBusquedaPorCodigoTipoSectorEcono);
			}
		}

		if(this.tiposectoreconoConstantesFunciones.resaltarBusquedaPorNombreTipoSectorEcono!=null) {
			index= this.jTabbedPaneBusquedasTipoSectorEcono.indexOfComponent(this.jPanelBusquedaPorNombreTipoSectorEcono);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoSectorEcono.getComponent(index);
				jPanel.setBorder(this.tiposectoreconoConstantesFunciones.resaltarBusquedaPorNombreTipoSectorEcono);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoSectorEcono() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoSectorEcono.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoSectorEcono.indexOfComponent(this.jPanelBusquedaPorCodigoTipoSectorEcono);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoSectorEcono.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiposectoreconoConstantesFunciones.mostrarBusquedaPorCodigoTipoSectorEcono);
			if(!this.tiposectoreconoConstantesFunciones.mostrarBusquedaPorCodigoTipoSectorEcono && index>-1) {
				this.jTabbedPaneBusquedasTipoSectorEcono.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoSectorEcono.indexOfComponent(this.jPanelBusquedaPorNombreTipoSectorEcono);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoSectorEcono.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiposectoreconoConstantesFunciones.mostrarBusquedaPorNombreTipoSectorEcono);
			if(!this.tiposectoreconoConstantesFunciones.mostrarBusquedaPorNombreTipoSectorEcono && index>-1) {
				this.jTabbedPaneBusquedasTipoSectorEcono.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoSectorEcono() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoSectorEcono.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoSectorEcono.indexOfComponent(this.jPanelBusquedaPorCodigoTipoSectorEcono);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoSectorEcono.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiposectoreconoConstantesFunciones.activarBusquedaPorCodigoTipoSectorEcono);
				this.jTabbedPaneBusquedasTipoSectorEcono.setEnabledAt(index,this.tiposectoreconoConstantesFunciones.activarBusquedaPorCodigoTipoSectorEcono);
			}

			index= this.jTabbedPaneBusquedasTipoSectorEcono.indexOfComponent(this.jPanelBusquedaPorNombreTipoSectorEcono);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoSectorEcono.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiposectoreconoConstantesFunciones.activarBusquedaPorNombreTipoSectorEcono);
				this.jTabbedPaneBusquedasTipoSectorEcono.setEnabledAt(index,this.tiposectoreconoConstantesFunciones.activarBusquedaPorNombreTipoSectorEcono);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoSectorEcono(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoSectorEcono.indexOfComponent(this.jPanelBusquedaPorCodigoTipoSectorEcono);

			this.jTabbedPaneBusquedasTipoSectorEcono.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoSectorEcono.getComponent(index);

			this.tiposectoreconoConstantesFunciones.setResaltarBusquedaPorCodigoTipoSectorEcono(resaltar);

			jPanel.setBorder(this.tiposectoreconoConstantesFunciones.resaltarBusquedaPorCodigoTipoSectorEcono);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoSectorEcono.indexOfComponent(this.jPanelBusquedaPorNombreTipoSectorEcono);

			this.jTabbedPaneBusquedasTipoSectorEcono.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoSectorEcono.getComponent(index);

			this.tiposectoreconoConstantesFunciones.setResaltarBusquedaPorNombreTipoSectorEcono(resaltar);

			jPanel.setBorder(this.tiposectoreconoConstantesFunciones.resaltarBusquedaPorNombreTipoSectorEcono);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoSectorEcono.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoSectorEcono() throws Exception {

		if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoSectorEcono();
		this.updateVisibilidadResaltarControlesFormularioTipoSectorEcono();
		this.updateHabilitarResaltarControlesFormularioTipoSectorEcono();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoSectorEcono() throws Exception {
		if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiposectoreconoConstantesFunciones.resaltaridTipoSectorEcono!=null && this.jInternalFrameDetalleFormTipoSectorEcono!=null) {this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.setBorder(this.tiposectoreconoConstantesFunciones.resaltaridTipoSectorEcono);}
		if(this.tiposectoreconoConstantesFunciones.resaltarid_empresaTipoSectorEcono!=null && this.jInternalFrameDetalleFormTipoSectorEcono!=null) {this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.setBorder(this.tiposectoreconoConstantesFunciones.resaltarid_empresaTipoSectorEcono);}
		if(this.tiposectoreconoConstantesFunciones.resaltarcodigoTipoSectorEcono!=null && this.jInternalFrameDetalleFormTipoSectorEcono!=null) {this.jInternalFrameDetalleFormTipoSectorEcono.jTextFieldcodigoTipoSectorEcono.setBorder(this.tiposectoreconoConstantesFunciones.resaltarcodigoTipoSectorEcono);}
		if(this.tiposectoreconoConstantesFunciones.resaltarnombreTipoSectorEcono!=null && this.jInternalFrameDetalleFormTipoSectorEcono!=null) {this.jInternalFrameDetalleFormTipoSectorEcono.jTextAreanombreTipoSectorEcono.setBorder(this.tiposectoreconoConstantesFunciones.resaltarnombreTipoSectorEcono);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoSectorEcono() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
	
		//this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.setVisible(this.tiposectoreconoConstantesFunciones.mostraridTipoSectorEcono);
		this.jInternalFrameDetalleFormTipoSectorEcono.jPanelidTipoSectorEcono.setVisible(this.tiposectoreconoConstantesFunciones.mostraridTipoSectorEcono);
		//this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.setVisible(this.tiposectoreconoConstantesFunciones.mostrarid_empresaTipoSectorEcono);
		this.jInternalFrameDetalleFormTipoSectorEcono.jPanelid_empresaTipoSectorEcono.setVisible(this.tiposectoreconoConstantesFunciones.mostrarid_empresaTipoSectorEcono);
		//this.jInternalFrameDetalleFormTipoSectorEcono.jTextFieldcodigoTipoSectorEcono.setVisible(this.tiposectoreconoConstantesFunciones.mostrarcodigoTipoSectorEcono);
		this.jInternalFrameDetalleFormTipoSectorEcono.jPanelcodigoTipoSectorEcono.setVisible(this.tiposectoreconoConstantesFunciones.mostrarcodigoTipoSectorEcono);
		//this.jInternalFrameDetalleFormTipoSectorEcono.jTextAreanombreTipoSectorEcono.setVisible(this.tiposectoreconoConstantesFunciones.mostrarnombreTipoSectorEcono);
		this.jInternalFrameDetalleFormTipoSectorEcono.jPanelnombreTipoSectorEcono.setVisible(this.tiposectoreconoConstantesFunciones.mostrarnombreTipoSectorEcono);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoSectorEcono() throws Exception {
		if(this.jInternalFrameDetalleFormTipoSectorEcono==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoSectorEcono!=null) {
	
		this.jInternalFrameDetalleFormTipoSectorEcono.jLabelidTipoSectorEcono.setEnabled(this.tiposectoreconoConstantesFunciones.activaridTipoSectorEcono);
		this.jInternalFrameDetalleFormTipoSectorEcono.jComboBoxid_empresaTipoSectorEcono.setEnabled(this.tiposectoreconoConstantesFunciones.activarid_empresaTipoSectorEcono);
		this.jInternalFrameDetalleFormTipoSectorEcono.jTextFieldcodigoTipoSectorEcono.setEnabled(this.tiposectoreconoConstantesFunciones.activarcodigoTipoSectorEcono);
		this.jInternalFrameDetalleFormTipoSectorEcono.jTextAreanombreTipoSectorEcono.setEnabled(this.tiposectoreconoConstantesFunciones.activarnombreTipoSectorEcono);
		}
	}
	
		
}