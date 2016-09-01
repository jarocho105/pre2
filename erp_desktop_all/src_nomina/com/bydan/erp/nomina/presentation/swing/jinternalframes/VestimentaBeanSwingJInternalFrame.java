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

import com.bydan.erp.nomina.util.VestimentaConstantesFunciones;
import com.bydan.erp.nomina.util.VestimentaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.VestimentaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.VestimentaBean;
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
public class VestimentaBeanSwingJInternalFrame extends VestimentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VestimentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Vestimenta> vestimentaValidator = new ClassValidator<Vestimenta>(Vestimenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Vestimenta vestimenta;	
	public Vestimenta vestimentaAux;
	public Vestimenta vestimentaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Vestimenta vestimentaTotales;
	public Long idVestimentaActual;
	public Long iIdNuevoVestimenta=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosTallaVestido=false;

	public Boolean getIsTienePermisosTallaVestido() {
		return isTienePermisosTallaVestido;
	}

	public void setIsTienePermisosTallaVestido(Boolean isTienePermisosTallaVestido) {
		this.isTienePermisosTallaVestido= isTienePermisosTallaVestido;
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
	
	public Boolean isPermisoTodoVestimenta;
	public Boolean isPermisoNuevoVestimenta;
	public Boolean isPermisoActualizarVestimenta;
	public Boolean isPermisoActualizarOriginalVestimenta;
	public Boolean isPermisoEliminarVestimenta;
	public Boolean isPermisoGuardarCambiosVestimenta;
	public Boolean isPermisoConsultaVestimenta;
	public Boolean isPermisoBusquedaVestimenta;
	public Boolean isPermisoReporteVestimenta;
	public Boolean isPermisoPaginacionMedioVestimenta;
	public Boolean isPermisoPaginacionAltoVestimenta;
	public Boolean isPermisoPaginacionTodoVestimenta;
	public Boolean isPermisoCopiarVestimenta;
	public Boolean isPermisoVerFormVestimenta;
	public Boolean isPermisoDuplicarVestimenta;
	public Boolean isPermisoOrdenVestimenta;
	
	
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
	
	public VestimentaParameterReturnGeneral vestimentaReturnGeneral;
	public VestimentaParameterReturnGeneral vestimentaParameterGeneral;
	
	

	public TallaVestidoLogic tallavestidoLogic=null;

	public TallaVestidoLogic getTallaVestidoLogic() {
		return tallavestidoLogic;
	}

	public void setTallaVestidoLogic(TallaVestidoLogic tallavestidoLogic) {
		this.tallavestidoLogic = tallavestidoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVestimenta=false;
	public Boolean esParaAccionDesdeFormularioVestimenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VestimentaSessionBeanAdditional vestimentaSessionBeanAdditional=null;
	
	public VestimentaSessionBeanAdditional getVestimentaSessionBeanAdditional() {
		return this.vestimentaSessionBeanAdditional;
	}
	
	public void setVestimentaSessionBeanAdditional(VestimentaSessionBeanAdditional vestimentaSessionBeanAdditional) {
		try {
			this.vestimentaSessionBeanAdditional=vestimentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VestimentaBeanSwingJInternalFrameAdditional vestimentaBeanSwingJInternalFrameAdditional=null;
	//public class VestimentaBeanSwingJInternalFrame
	
	public VestimentaBeanSwingJInternalFrameAdditional getVestimentaBeanSwingJInternalFrameAdditional() {
		return this.vestimentaBeanSwingJInternalFrameAdditional;
	}
	
	public void setVestimentaBeanSwingJInternalFrameAdditional(VestimentaBeanSwingJInternalFrameAdditional vestimentaBeanSwingJInternalFrameAdditional) {
		try {
			this.vestimentaBeanSwingJInternalFrameAdditional=vestimentaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VestimentaLogic vestimentaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Vestimenta vestimentaBean;
	public VestimentaConstantesFunciones vestimentaConstantesFunciones;
	//public VestimentaParameterReturnGeneral vestimentaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Vestimenta> vestimentas;	
	//public List<Vestimenta> vestimentasEliminados;
	//public List<Vestimenta> vestimentasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVestimenta=false;
	public Boolean isVisibilidadCeldaDuplicarVestimenta=true;
	public Boolean isVisibilidadCeldaCopiarVestimenta=true;
	public Boolean isVisibilidadCeldaVerFormVestimenta=true;
	public Boolean isVisibilidadCeldaOrdenVestimenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVestimenta=false;
	public Boolean isVisibilidadCeldaModificarVestimenta=false;
	public Boolean isVisibilidadCeldaActualizarVestimenta=false;
	public Boolean isVisibilidadCeldaEliminarVestimenta=false;
	public Boolean isVisibilidadCeldaCancelarVestimenta=false;
	public Boolean isVisibilidadCeldaGuardarVestimenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVestimenta=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoVestimenta() {
		return this.iIdNuevoVestimenta;
	}

	public void setiIdNuevoVestimenta(Long iIdNuevoVestimenta) {
		this.iIdNuevoVestimenta = iIdNuevoVestimenta;
	}
	
	public Long getidVestimentaActual() {
		return this.idVestimentaActual;
	}

	public void setidVestimentaActual(Long idVestimentaActual) {
		this.idVestimentaActual = idVestimentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Vestimenta getvestimenta() {
		return this.vestimenta;
	}

	public void setvestimenta(Vestimenta vestimenta) {
		this.vestimenta = vestimenta;
	}
	
	public Vestimenta getvestimentaAux() {
		return this.vestimentaAux;
	}

	public void setvestimentaAux(Vestimenta vestimentaAux) {
		this.vestimentaAux = vestimentaAux;
	}				
	
	public Vestimenta getvestimentaAnterior() {
		return this.vestimentaAnterior;
	}

	public void setvestimentaAnterior(Vestimenta vestimentaAnterior) {
		this.vestimentaAnterior = vestimentaAnterior;
	}	
	
	public Vestimenta getvestimentaTotales() {
		return this.vestimentaTotales;
	}

	public void setvestimentaTotales(Vestimenta vestimentaTotales) {
		this.vestimentaTotales = vestimentaTotales;
	}	
	
	public Vestimenta getvestimentaBean() {
		return this.vestimentaBean;
	}

	public void setvestimentaBean(Vestimenta vestimentaBean) {
		this.vestimentaBean = vestimentaBean;
	}	
	
	public VestimentaParameterReturnGeneral getvestimentaReturnGeneral() {
		return this.vestimentaReturnGeneral;
	}

	public void setvestimentaReturnGeneral(VestimentaParameterReturnGeneral vestimentaReturnGeneral) {
		this.vestimentaReturnGeneral = vestimentaReturnGeneral;
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
	
	
	public VestimentaLogic getVestimentaLogic()	{		
		return vestimentaLogic;
	}

	public void setVestimentaLogic(VestimentaLogic vestimentaLogic) {
		this.vestimentaLogic = vestimentaLogic;
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
	
	public Boolean getIsEsNuevoVestimenta() {
		return isEsNuevoVestimenta;
	}

	public void setIsEsNuevoVestimenta(Boolean isEsNuevoVestimenta) {
		this.isEsNuevoVestimenta = isEsNuevoVestimenta;
	}

	public Boolean getEsParaAccionDesdeFormularioVestimenta() {
		return esParaAccionDesdeFormularioVestimenta;
	}
	
	public void setEsParaAccionDesdeFormularioVestimenta(Boolean esParaAccionDesdeFormularioVestimenta) {
		this.esParaAccionDesdeFormularioVestimenta = esParaAccionDesdeFormularioVestimenta;
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

			if(this.vestimentaSessionBean==null) {
				this.vestimentaSessionBean=new VestimentaSessionBean();
			}

			if(!this.vestimentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(vestimentaSessionBean.getlidEmpresaActual());
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

					if(this.vestimenta!=null) {
						this.vestimenta.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVestimenta!=null) {
						this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVestimenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVestimenta!=null) {
						if(this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVestimentaGenerico)throws Exception
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
				jComboBoxid_empresaVestimentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVestimentaGenerico!=null && jComboBoxid_empresaVestimentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaVestimentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Vestimenta vestimenta,JComboBox jComboBoxid_empresaVestimentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVestimentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVestimentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				vestimenta.setid_empresa(empresaAux.getId());
				vestimenta.setempresa_descripcion(VestimentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				vestimenta.setEmpresa(empresaAux);			}
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

					if(!VestimentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVestimenta!=null) { 
							this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVestimenta!=null) { 
					}

					if(!VestimentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVestimenta!=null) {
							this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVestimenta!=null) {
							this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesVestimenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			VestimentaConstantesFunciones.refrescarForeignKeysDescripcionesVestimenta(this.vestimentaLogic.getVestimentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			VestimentaConstantesFunciones.refrescarForeignKeysDescripcionesVestimenta(this.vestimentas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//vestimentaLogic.setVestimentas(this.vestimentas);
			vestimentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public VestimentaParameterReturnGeneral getVestimentaParameterGeneral() {
		return this.vestimentaParameterGeneral;
	}
	
	public void setVestimentaParameterGeneral(VestimentaParameterReturnGeneral vestimentaParameterGeneral) {
		this.vestimentaParameterGeneral = vestimentaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVestimenta() {
		return isPermisoTodoVestimenta;
	}

	public void setIsPermisoTodoVestimenta(Boolean isPermisoTodoVestimenta) {
		this.isPermisoTodoVestimenta = isPermisoTodoVestimenta;
	}

	public Boolean getIsPermisoNuevoVestimenta() {
		return isPermisoNuevoVestimenta;
	}

	public void setIsPermisoNuevoVestimenta(Boolean isPermisoNuevoVestimenta) {
		this.isPermisoNuevoVestimenta = isPermisoNuevoVestimenta;
	}

	public Boolean getIsPermisoActualizarVestimenta() {
		return isPermisoActualizarVestimenta;
	}

	public void setIsPermisoActualizarVestimenta(Boolean isPermisoActualizarVestimenta) {
		this.isPermisoActualizarVestimenta = isPermisoActualizarVestimenta;
	}

	public Boolean getIsPermisoEliminarVestimenta() {
		return isPermisoEliminarVestimenta;
	}

	public void setIsPermisoEliminarVestimenta(Boolean isPermisoEliminarVestimenta) {
		this.isPermisoEliminarVestimenta = isPermisoEliminarVestimenta;
	}

	public Boolean getIsPermisoGuardarCambiosVestimenta() {
		return isPermisoGuardarCambiosVestimenta;
	}

	public void setIsPermisoGuardarCambiosVestimenta(Boolean isPermisoGuardarCambiosVestimenta) {
		this.isPermisoGuardarCambiosVestimenta = isPermisoGuardarCambiosVestimenta;
	}
	
	public Boolean getIsPermisoConsultaVestimenta() {
		return isPermisoConsultaVestimenta;
	}

	public void setIsPermisoConsultaVestimenta(Boolean isPermisoConsultaVestimenta) {
		this.isPermisoConsultaVestimenta = isPermisoConsultaVestimenta;
	}

	public Boolean getIsPermisoBusquedaVestimenta() {
		return isPermisoBusquedaVestimenta;
	}

	public void setIsPermisoBusquedaVestimenta(Boolean isPermisoBusquedaVestimenta) {
		this.isPermisoBusquedaVestimenta = isPermisoBusquedaVestimenta;
	}

	public Boolean getIsPermisoReporteVestimenta() {
		return isPermisoReporteVestimenta;
	}

	public void setIsPermisoReporteVestimenta(Boolean isPermisoReporteVestimenta) {
		this.isPermisoReporteVestimenta = isPermisoReporteVestimenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioVestimenta() {
		return isPermisoPaginacionMedioVestimenta;
	}

	public void setIsPermisoPaginacionMedioVestimenta(Boolean isPermisoPaginacionMedioVestimenta) {
		this.isPermisoPaginacionMedioVestimenta = isPermisoPaginacionMedioVestimenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoVestimenta() {
		return isPermisoPaginacionTodoVestimenta;
	}

	public void setIsPermisoPaginacionTodoVestimenta(Boolean isPermisoPaginacionTodoVestimenta) {
		this.isPermisoPaginacionTodoVestimenta = isPermisoPaginacionTodoVestimenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoVestimenta() {
		return isPermisoPaginacionAltoVestimenta;
	}

	public void setIsPermisoPaginacionAltoVestimenta(Boolean isPermisoPaginacionAltoVestimenta) {
		this.isPermisoPaginacionAltoVestimenta = isPermisoPaginacionAltoVestimenta;
	}
	
	public Boolean getIsPermisoCopiarVestimenta() {
		return isPermisoCopiarVestimenta;
	}

	public void setIsPermisoCopiarVestimenta(Boolean isPermisoCopiarVestimenta) {
		this.isPermisoCopiarVestimenta = isPermisoCopiarVestimenta;
	}
	
	public Boolean getIsPermisoVerFormVestimenta() {
		return isPermisoVerFormVestimenta;
	}

	public void setIsPermisoVerFormVestimenta(Boolean isPermisoVerFormVestimenta) {
		this.isPermisoVerFormVestimenta = isPermisoVerFormVestimenta;
	}
	
	public Boolean getIsPermisoDuplicarVestimenta() {
		return isPermisoDuplicarVestimenta;
	}

	public void setIsPermisoDuplicarVestimenta(Boolean isPermisoDuplicarVestimenta) {
		this.isPermisoDuplicarVestimenta = isPermisoDuplicarVestimenta;
	}
	
	public Boolean getIsPermisoOrdenVestimenta() {
		return isPermisoOrdenVestimenta;
	}

	public void setIsPermisoOrdenVestimenta(Boolean isPermisoOrdenVestimenta) {
		this.isPermisoOrdenVestimenta = isPermisoOrdenVestimenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVestimenta() {
		return isVisibilidadCeldaNuevoVestimenta;
	}

	public void setIsVisibilidadCeldaNuevoVestimenta(Boolean isVisibilidadCeldaNuevoVestimenta) {
		this.isVisibilidadCeldaNuevoVestimenta = isVisibilidadCeldaNuevoVestimenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVestimenta() {
		return isVisibilidadCeldaDuplicarVestimenta;
	}

	public void setIsVisibilidadCeldaDuplicarVestimenta(Boolean isVisibilidadCeldaDuplicarVestimenta) {
		this.isVisibilidadCeldaDuplicarVestimenta = isVisibilidadCeldaDuplicarVestimenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVestimenta() {
		return isVisibilidadCeldaCopiarVestimenta;
	}

	public void setIsVisibilidadCeldaCopiarVestimenta(Boolean isVisibilidadCeldaCopiarVestimenta) {
		this.isVisibilidadCeldaCopiarVestimenta = isVisibilidadCeldaCopiarVestimenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVestimenta() {
		return isVisibilidadCeldaVerFormVestimenta;
	}

	public void setIsVisibilidadCeldaVerFormVestimenta(Boolean isVisibilidadCeldaVerFormVestimenta) {
		this.isVisibilidadCeldaVerFormVestimenta = isVisibilidadCeldaVerFormVestimenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVestimenta() {
		return isVisibilidadCeldaOrdenVestimenta;
	}

	public void setIsVisibilidadCeldaOrdenVestimenta(Boolean isVisibilidadCeldaOrdenVestimenta) {
		this.isVisibilidadCeldaOrdenVestimenta = isVisibilidadCeldaOrdenVestimenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVestimenta() {
		return isVisibilidadCeldaNuevoRelacionesVestimenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVestimenta(Boolean isVisibilidadCeldaNuevoRelacionesVestimenta) {
		this.isVisibilidadCeldaNuevoRelacionesVestimenta = isVisibilidadCeldaNuevoRelacionesVestimenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVestimenta() {
		return isVisibilidadCeldaModificarVestimenta;
	}

	public void setIsVisibilidadCeldaModificarVestimenta(Boolean isVisibilidadCeldaModificarVestimenta) {
		this.isVisibilidadCeldaModificarVestimenta = isVisibilidadCeldaModificarVestimenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVestimenta() {
		return isVisibilidadCeldaActualizarVestimenta;
	}

	public void setIsVisibilidadCeldaActualizarVestimenta(Boolean isVisibilidadCeldaActualizarVestimenta) {
		this.isVisibilidadCeldaActualizarVestimenta = isVisibilidadCeldaActualizarVestimenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarVestimenta() {
		return isVisibilidadCeldaEliminarVestimenta;
	}

	public void setIsVisibilidadCeldaEliminarVestimenta(Boolean isVisibilidadCeldaEliminarVestimenta) {
		this.isVisibilidadCeldaEliminarVestimenta = isVisibilidadCeldaEliminarVestimenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarVestimenta() {
		return isVisibilidadCeldaCancelarVestimenta;
	}

	public void setIsVisibilidadCeldaCancelarVestimenta(Boolean isVisibilidadCeldaCancelarVestimenta) {
		this.isVisibilidadCeldaCancelarVestimenta = isVisibilidadCeldaCancelarVestimenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarVestimenta() {
		return isVisibilidadCeldaGuardarVestimenta;
	}

	public void setIsVisibilidadCeldaGuardarVestimenta(Boolean isVisibilidadCeldaGuardarVestimenta) {
		this.isVisibilidadCeldaGuardarVestimenta = isVisibilidadCeldaGuardarVestimenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVestimenta() {
		return isVisibilidadCeldaGuardarCambiosVestimenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVestimenta(Boolean isVisibilidadCeldaGuardarCambiosVestimenta) {
		this.isVisibilidadCeldaGuardarCambiosVestimenta = isVisibilidadCeldaGuardarCambiosVestimenta;
	}
		
	public VestimentaSessionBean getvestimentaSessionBean() {
		return this.vestimentaSessionBean;
	}
	
	public void setvestimentaSessionBean(VestimentaSessionBean vestimentaSessionBean) {
		this.vestimentaSessionBean=vestimentaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVestimenta(Vestimenta vestimenta)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(vestimenta,null);
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
	
	public void bugActualizarReferenciaActual(Vestimenta vestimenta,Vestimenta vestimentaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVestimenta(vestimenta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		vestimentaAux.setId(vestimenta.getId());
		vestimentaAux.setVersionRow(vestimenta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessVestimenta();
		
			int intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualVestimenta(this.vestimenta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = vestimentaValidator.getInvalidValues(this.vestimenta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			vestimentaLogic.setDatosCliente(datosCliente);
			vestimentaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				vestimentaAux=new  Vestimenta();
				
				vestimentaAux.setIsNew(true);
				vestimentaAux.setIsChanged(true);
				
				vestimentaAux.setVestimentaOriginal(this.vestimenta);
				
				vestimentaAux.setId(this.vestimenta.getId());	
				vestimentaAux.setVersionRow(this.vestimenta.getVersionRow());	
				vestimentaAux.setid_empresa(this.vestimenta.getid_empresa());	
				vestimentaAux.setnombre(this.vestimenta.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vestimentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vestimentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(vestimentaAux,vestimentaLogic.getVestimentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vestimentaAux,vestimentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.vestimentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vestimentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vestimentaLogic.saveVestimentas();//WithConnection
						//vestimentaLogic.getSetVersionRowVestimentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vestimenta,vestimentaAux);
					
					this.refrescarForeignKeysDescripcionesVestimenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vestimentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos().addAll(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidos.addAll(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vestimentaLogic.saveVestimentaRelaciones(vestimentaAux,this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos());//WithConnection
								//vestimentaLogic.getSetVersionRowVestimentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vestimenta,vestimentaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.setTallaVestidos(new ArrayList<TallaVestido>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidos= new ArrayList<TallaVestido>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.quitarFilaTotales();}
							vestimentaAux.setTallaVestidos(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vestimentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vestimentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vestimentaAux,vestimentaLogic.getVestimentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vestimentaAux,vestimentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vestimenta,vestimentaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				vestimentaAux=new  Vestimenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.vestimentaSessionBean.getEsGuardarRelacionado() 
					|| (this.vestimentaSessionBean.getEsGuardarRelacionado() && this.vestimenta.getId()>=0)) {
						
					vestimentaAux.setIsNew(false);
				}
				
				vestimentaAux.setIsDeleted(false);
			
				vestimentaAux.setId(this.vestimenta.getId());	
				vestimentaAux.setVersionRow(this.vestimenta.getVersionRow());	
				vestimentaAux.setid_empresa(this.vestimenta.getid_empresa());	
				vestimentaAux.setnombre(this.vestimenta.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vestimentaAux,vestimentaLogic.getVestimentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vestimentaAux,vestimentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.vestimentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vestimentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vestimentaLogic.saveVestimentas();//WithConnection
						//vestimentaLogic.getSetVersionRowVestimentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vestimenta,vestimentaAux);
					
					this.refrescarForeignKeysDescripcionesVestimenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vestimentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos().addAll(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidos.addAll(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vestimentaLogic.saveVestimentaRelaciones(vestimentaAux,this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos());//WithConnection
								//vestimentaLogic.getSetVersionRowVestimentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vestimenta,vestimentaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.setTallaVestidos(new ArrayList<TallaVestido>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidos= new ArrayList<TallaVestido>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.quitarFilaTotales();}
							vestimentaAux.setTallaVestidos(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vestimentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vestimentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vestimentaAux,vestimentaLogic.getVestimentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vestimentaAux,vestimentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vestimenta,vestimentaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				vestimentaAux=new  Vestimenta();
				
				vestimentaAux.setIsNew(false);
				vestimentaAux.setIsChanged(false);
				
				vestimentaAux.setIsDeleted(true);
				
				vestimentaAux.setId(this.vestimenta.getId());	
				vestimentaAux.setVersionRow(this.vestimenta.getVersionRow());	
				vestimentaAux.setid_empresa(this.vestimenta.getid_empresa());	
				vestimentaAux.setnombre(this.vestimenta.getnombre());	
				
				if(this.vestimentaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.vestimentaAux.getId()>=0) {	
						this.vestimentasEliminados.add(vestimentaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(vestimentaAux,vestimentaLogic.getVestimentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vestimentaAux,vestimentas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.vestimentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vestimentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vestimentaLogic.saveVestimentas();//WithConnection
						//vestimentaLogic.getSetVersionRowVestimentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vestimentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos().addAll(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidos.addAll(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vestimentaLogic.saveVestimentaRelaciones(vestimentaAux,this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos());//WithConnection
								//vestimentaLogic.getSetVersionRowVestimentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.setTallaVestidos(new ArrayList<TallaVestido>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidos= new ArrayList<TallaVestido>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.quitarFilaTotales();}
							vestimentaAux.setTallaVestidos(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.vestimentaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.vestimentaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(vestimentaAux,vestimentaLogic.getVestimentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(vestimentaAux,vestimentas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.getVestimentas().addAll(this.vestimentasEliminados);
					
					vestimentaLogic.saveVestimentas();//WithConnection
					//vestimentaLogic.getSetVersionRowVestimentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesVestimenta();
				
				this.vestimentasEliminados= new ArrayList<Vestimenta>();		
			}
			
			if(this.vestimentaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Vestimenta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Vestimenta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.vestimenta=vestimentaAux;
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
      		//this.finishProcessVestimenta();
      	}
		
	}	
	
	public void actualizarRelaciones(Vestimenta vestimentaLocal) throws Exception {
		
		if(this.vestimentaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				vestimentaLocal.setTallaVestidos(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos());
			
			} else {
			
				vestimentaLocal.setTallaVestidos(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Vestimenta vestimentaLocal) throws Exception {	
		if(this.vestimentaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				vestimentaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVestimentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = vestimentaValidator.getInvalidValues(this.vestimenta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Vestimenta vestimenta,List<Vestimenta> vestimentas) throws Exception {
		try	{		
			VestimentaConstantesFunciones.actualizarLista(vestimenta,vestimentas,this.vestimentaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Vestimenta vestimenta,List<Vestimenta> vestimentas) throws Exception {
		try	{			
			VestimentaConstantesFunciones.actualizarSelectedLista(vestimenta,vestimentas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Vestimenta> vestimentasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				vestimentasLocal=this.vestimentaLogic.getVestimentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				vestimentasLocal=this.vestimentas;
			}
			//ARCHITECTURE
		
			for(Vestimenta vestimentaLocal:vestimentasLocal) {
				if(this.permiteMantenimiento(vestimentaLocal) && vestimentaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VestimentaConstantesFunciones.getVestimentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VestimentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVestimenta.jLabelid_empresaVestimenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VestimentaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVestimenta.jLabelnombreVestimenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVestimenta.jLabelid_empresaVestimenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVestimenta.jLabelnombreVestimenta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TallaVestido")) {
			if(this.vestimenta==null) {
				this.vestimenta= new Vestimenta();
			}

			if(this.vestimentaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoVestimenta
				this.setVariablesFormularioToObjetoActualVestimenta(this.vestimenta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);

				this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.gettallavestido().setVestimenta(this.vestimenta);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoVestimenta--;	
		
		
		this.vestimentaAux=new Vestimenta();
		
		this.vestimentaAux.setId(this.iIdNuevoVestimenta);
		this.vestimentaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vestimentaLogic.getVestimentas().add(this.vestimentaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.vestimentas.add(this.vestimentaAux);
		}
		//ARCHITECTURE
		
		this.vestimenta=this.vestimentaAux;
		
		if(VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVestimenta(this.vestimenta);
			this.setVariablesObjetoActualToFormularioForeignKeyVestimenta(this.vestimenta);
		}
				
		//this.setDefaultControlesVestimenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVestimenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVestimenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVestimenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVestimenta(this.vestimentaBean,this.vestimenta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(VestimentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.vestimentaSessionBean.getConGuardarRelaciones()) {
			classes=VestimentaConstantesFunciones.getClassesRelationshipsOfVestimenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.vestimentaReturnGeneral=vestimentaLogic.procesarEventosVestimentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vestimentaLogic.getVestimentas(),this.vestimenta,this.vestimentaParameterGeneral,this.isEsNuevoVestimenta,classes);//this.vestimentaLogic.getVestimenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVestimenta(this.vestimentaReturnGeneral,this.vestimentaBean,false);
		
		if(this.vestimentaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVestimenta(this.vestimentaReturnGeneral.getVestimenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVestimenta(this.vestimentaReturnGeneral.getVestimenta());
		}
		
		if(this.vestimentaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVestimenta(this.vestimentaReturnGeneral.getVestimenta(),classes);//this.vestimentaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVestimenta(this.vestimenta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVestimenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVestimenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VestimentaBeanSwingJInternalFrameAdditional.RecargarFormVestimenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVestimenta(false);
						
			if(vestimentaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.getEsGuardarRelacionado() && TallaVestidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTallaVestidoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(VestimentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVestimenta();
			}
			
			this.actualizarVisualTableDatosVestimenta();
			
			this.jTableDatosVestimenta.setRowSelectionInterval(this.getIndiceNuevoVestimenta(), this.getIndiceNuevoVestimenta());
			
			this.seleccionarFilaTablaVestimentaActual();
						
			this.actualizarEstadoCeldasBotonesVestimenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVestimenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVestimenta.jTextAreanombreVestimenta.setEnabled(isHabilitar && this.vestimentaConstantesFunciones.activarnombreVestimenta);	
		//
		this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.setEnabled(isHabilitar && this.vestimentaConstantesFunciones.activarid_empresaVestimenta);
	};
	
	public void setDefaultControlesVestimenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVestimenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.vestimentaSessionBean.setConGuardarRelaciones(true);			
			this.vestimentaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVestimenta.jTabbedPaneRelacionesVestimenta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.vestimentaSessionBean.setConGuardarRelaciones(false);			
			this.vestimentaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVestimenta.jTabbedPaneRelacionesVestimenta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoVestimenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Vestimenta vestimentaAux:this.vestimentaLogic.getVestimentas()) {
				if(vestimentaAux.getId().equals(this.iIdNuevoVestimenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Vestimenta vestimentaAux:this.vestimentas) {
				if(vestimentaAux.getId().equals(this.iIdNuevoVestimenta)) {
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
	
	public int getIndiceActualVestimenta(Vestimenta vestimenta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Vestimenta vestimentaAux:this.vestimentaLogic.getVestimentas()) {
				if(vestimentaAux.getId().equals(vestimenta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Vestimenta vestimentaAux:this.vestimentas) {
				if(vestimentaAux.getId().equals(vestimenta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVestimenta(Vestimenta vestimentaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Vestimenta vestimentaAux:this.vestimentaLogic.getVestimentas()) {
				if(vestimentaAux.getVestimentaOriginal().getId().equals(vestimentaOriginal.getId())) {
					existe=true;
					vestimentaOriginal.setId(vestimentaAux.getId());
					vestimentaOriginal.setVersionRow(vestimentaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Vestimenta vestimentaAux:this.vestimentas) {
				if(vestimentaAux.getVestimentaOriginal().getId().equals(vestimentaOriginal.getId())) {
					existe=true;
					vestimentaOriginal.setId(vestimentaAux.getId());
					vestimentaOriginal.setVersionRow(vestimentaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVestimenta(Boolean esParaCancelar) throws Exception {
		vestimentasAux=new ArrayList<Vestimenta>();
		vestimentaAux=new Vestimenta();
		
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Vestimenta vestimentaAux:this.vestimentaLogic.getVestimentas()) {
					if(vestimentaAux.getId()<0) {
						vestimentasAux.add(vestimentaAux);
					}		
				}
				this.iIdNuevoVestimenta=0L;
				this.vestimentaLogic.getVestimentas().removeAll(vestimentasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Vestimenta vestimentaAux:this.vestimentas) {
					if(vestimentaAux.getId()<0) {
						vestimentasAux.add(vestimentaAux);
					}		
				}
				this.iIdNuevoVestimenta=0L;
				this.vestimentas.removeAll(vestimentasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVestimenta 
					&& this.vestimentaLogic.getVestimentas().size()>0
					) {
					vestimentaAux=this.vestimentaLogic.getVestimentas().get(this.vestimentaLogic.getVestimentas().size() - 1);
				
					if(vestimentaAux.getId()<0) {
						this.vestimentaLogic.getVestimentas().remove(vestimentaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVestimenta && this.vestimentas.size()>0) {
					vestimentaAux=this.vestimentas.get(this.vestimentas.size() - 1);
				
					if(vestimentaAux.getId()<0) {
						this.vestimentas.remove(vestimentaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVestimenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(vestimenta.getId()<0) {
				this.vestimentaLogic.getVestimentas().remove(this.vestimenta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(vestimenta.getId()<0) {
				this.vestimentas.remove(this.vestimenta);
			}
		}			
	}
	
	public void setEstadosInicialesVestimenta(List<Vestimenta> vestimentasAux) throws Exception {
		VestimentaConstantesFunciones.setEstadosInicialesVestimenta(vestimentasAux);
	}
	
	public void setEstadosInicialesVestimenta(Vestimenta vestimentaAux) throws Exception {
		VestimentaConstantesFunciones.setEstadosInicialesVestimenta(vestimentaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVestimentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVestimenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVestimentaActual()) {
				if(!this.isEsNuevoVestimenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVestimenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVestimenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVestimentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Vestimenta ?", "MANTENIMIENTO DE Vestimenta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVestimenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Vestimenta vestimenta) throws Exception {
		VestimentaConstantesFunciones.seleccionarAsignar(this.vestimenta,vestimenta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVestimenta=this.isPermisoActualizarOriginalVestimenta;
			
			
			this.seleccionarAsignar(vestimenta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VestimentaConstantesFunciones.quitarEspaciosVestimenta(this.vestimenta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesVestimenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.vestimentaSessionBean.setsFuncionBusquedaRapida(this.vestimentaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVestimenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVestimenta(esParaCancelar);				
				this.cancelarNuevoVestimenta(esParaCancelar);								
			}
			
			this.vestimenta=new Vestimenta();
			
			this.inicializarVestimenta();
			
			this.actualizarEstadoCeldasBotonesVestimenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVestimenta() throws Exception {
		try {
			VestimentaConstantesFunciones.inicializarVestimenta(this.vestimenta);
			
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
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.vestimentaLogic.getVestimentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVestimentas(String sAccionBusqueda,List<Vestimenta> vestimentasParaReportes) throws Exception {
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
					sPathReporteFinal="Vestimenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VestimentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VestimentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Vestimenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Vestimentas");		
		parameters.put("busquedapor", VestimentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TallaVestido.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					VestimentaLogic vestimentaLogicAuxiliar=new VestimentaLogic();
					vestimentaLogicAuxiliar.setDatosCliente(vestimentaLogic.getDatosCliente());				
					vestimentaLogicAuxiliar.setVestimentas(vestimentasParaReportes);
					
					vestimentaLogicAuxiliar.cargarRelacionesLoteForeignKeyVestimentaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					vestimentasParaReportes=vestimentaLogicAuxiliar.getVestimentas();
					
					//vestimentaLogic.getNewConnexionToDeep();
					
					//for (Vestimenta vestimenta:vestimentasParaReportes) {
					//	vestimentaLogic.deepLoad(vestimenta, false, DeepLoadType.INCLUDE, classes);
					//}						
					//vestimentaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//vestimentaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTallaVestido = AuxiliarReportes.class.getResourceAsStream("TallaVestidoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tallavestido", reportFileTallaVestido);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVestimenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VestimentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VestimentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVestimenta=new JRBeanArrayDataSource(VestimentaJInternalFrame.TraerVestimentaBeans(vestimentasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVestimenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VestimentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VestimentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VestimentaBean.TraerVestimentaBeans(vestimentasParaReportes).toArray()));
							
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
				this.generarExcelReporteVestimentas(sAccionBusqueda,sTipoArchivoReporte,vestimentasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVestimentas(sAccionBusqueda,sTipoArchivoReporte,vestimentasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVestimentaActionPerformed(null);
					//this.generarExcelReporteVestimentas(sAccionBusqueda,sTipoArchivoReporte,vestimentasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVestimentas(sAccionBusqueda,sTipoArchivoReporte,vestimentasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVestimentas(sAccionBusqueda,sTipoArchivoReporte,vestimentasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVestimentas(sAccionBusqueda,sTipoArchivoReporte,vestimentasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVestimentas(String sAccionBusqueda,String sTipoArchivoReporte,List<Vestimenta> vestimentasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vestimenta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Vestimentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVestimenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Vestimenta vestimenta : vestimentasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VestimentaConstantesFunciones.generarExcelReporteDataVestimenta("NORMAL",row,workbook,vestimenta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vestimenta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVestimenta(String sTipo,Row row,Workbook workbook) {
		
		VestimentaConstantesFunciones.generarExcelReporteHeaderVestimenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVestimentas(String sAccionBusqueda,String sTipoArchivoReporte,List<Vestimenta> vestimentasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vestimenta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Vestimentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Vestimenta vestimenta : vestimentasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VestimentaConstantesFunciones.getVestimentaDescripcion(vestimenta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VestimentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VestimentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vestimenta.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VestimentaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VestimentaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vestimenta.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vestimenta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVestimentas(String sAccionBusqueda,String sTipoArchivoReporte,List<Vestimenta> vestimentasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Vestimenta> vestimentasRespaldo=null;
		
		classes=VestimentaConstantesFunciones.getClassesRelationshipsOfVestimenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.vestimentaLogic.setDatosCliente(this.datosCliente);
		this.vestimentaLogic.setDatosDeep(this.datosDeep);
		this.vestimentaLogic.setIsConDeep(true);
		
		vestimentasRespaldo=this.vestimentaLogic.getVestimentas();
		
		this.vestimentaLogic.setVestimentas(vestimentasParaReportes);	
		this.vestimentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		vestimentasParaReportes=this.vestimentaLogic.getVestimentas();
		this.vestimentaLogic.setVestimentas(vestimentasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vestimenta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Vestimentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVestimenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Vestimenta vestimenta : vestimentasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVestimenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VestimentaConstantesFunciones.generarExcelReporteDataVestimenta("NORMAL",row,workbook,vestimenta,cellStyleDataAux);
		
			
			


				//TallaVestido
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TallaVestidoConstantesFunciones.SCLASSWEBTITULO))) {

				if(vestimenta.getTallaVestidos()!=null && vestimenta.getTallaVestidos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TallaVestidoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TallaVestidoConstantesFunciones.generarExcelReporteHeaderTallaVestido("RELACIONADO",row,workbook);
				}

				if(vestimenta.getTallaVestidos()!=null) {
					i2=0;
					for(TallaVestido tallavestido : vestimenta.getTallaVestidos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TallaVestidoConstantesFunciones.generarExcelReporteDataTallaVestido("RELACIONADO",row,workbook,tallavestido,cellStyleDataAuxHijo);
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
		cell.setCellValue(VestimentaConstantesFunciones.getVestimentaDescripcion(vestimenta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vestimenta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVestimenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVestimenta() throws Exception {		
		this.startProcessVestimenta(true);
	}
	
	public void startProcessVestimenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVestimenta ,this.jPanelParametrosReportesVestimenta, this.jScrollPanelDatosVestimenta,this.jPanelPaginacionVestimenta, this.jScrollPanelDatosEdicionVestimenta, this.jPanelAccionesVestimenta,this.jPanelAccionesFormularioVestimenta,this.jmenuBarVestimenta,this.jmenuBarDetalleVestimenta,this.jTtoolBarVestimenta,this.jTtoolBarDetalleVestimenta);		
		
		final JTabbedPane jTabbedPaneBusquedasVestimenta=this.jTabbedPaneBusquedasVestimenta; 
		
		final JPanel jPanelParametrosReportesVestimenta=this.jPanelParametrosReportesVestimenta;
		//final JScrollPane jScrollPanelDatosVestimenta=this.jScrollPanelDatosVestimenta;
		final JTable jTableDatosVestimenta=this.jTableDatosVestimenta;		
		final JPanel jPanelPaginacionVestimenta=this.jPanelPaginacionVestimenta;
		//final JScrollPane jScrollPanelDatosEdicionVestimenta=this.jScrollPanelDatosEdicionVestimenta;
		final JPanel jPanelAccionesVestimenta=this.jPanelAccionesVestimenta;
		
		JPanel jPanelCamposAuxiliarVestimenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVestimenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) {
			jPanelCamposAuxiliarVestimenta=this.jInternalFrameDetalleFormVestimenta.jPanelCamposVestimenta;
			jPanelAccionesFormularioAuxiliarVestimenta=this.jInternalFrameDetalleFormVestimenta.jPanelAccionesFormularioVestimenta;
		}
		
		final JPanel jPanelCamposVestimenta=jPanelCamposAuxiliarVestimenta;
		final JPanel jPanelAccionesFormularioVestimenta=jPanelAccionesFormularioAuxiliarVestimenta;
		
		
		final JMenuBar jmenuBarVestimenta=this.jmenuBarVestimenta;
		final JToolBar jTtoolBarVestimenta=this.jTtoolBarVestimenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVestimenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVestimenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) {
			jmenuBarDetalleAuxiliarVestimenta=this.jInternalFrameDetalleFormVestimenta.jmenuBarDetalleVestimenta;
			jTtoolBarDetalleAuxiliarVestimenta=this.jInternalFrameDetalleFormVestimenta.jTtoolBarDetalleVestimenta;
		}
		
		final JMenuBar jmenuBarDetalleVestimenta=jmenuBarDetalleAuxiliarVestimenta;
		final JToolBar jTtoolBarDetalleVestimenta=jTtoolBarDetalleAuxiliarVestimenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVestimenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVestimenta;
			processRunnable.jTableDatos=jTableDatosVestimenta;
			processRunnable.jPanelCampos=jPanelCamposVestimenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionVestimenta;
			processRunnable.jPanelAcciones=jPanelAccionesVestimenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVestimenta;
			
			
			processRunnable.jmenuBar=jmenuBarVestimenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVestimenta;
			processRunnable.jTtoolBar=jTtoolBarVestimenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVestimenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVestimenta ,jPanelParametrosReportesVestimenta,jTableDatosVestimenta, /*jScrollPanelDatosVestimenta,*/jPanelCamposVestimenta,jPanelPaginacionVestimenta, /*jScrollPanelDatosEdicionVestimenta,*/ jPanelAccionesVestimenta,jPanelAccionesFormularioVestimenta,jmenuBarVestimenta,jmenuBarDetalleVestimenta,jTtoolBarVestimenta,jTtoolBarDetalleVestimenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVestimenta ,jPanelParametrosReportesVestimenta, jScrollPanelDatosVestimenta,jPanelPaginacionVestimenta, jScrollPanelDatosEdicionVestimenta, jPanelAccionesVestimenta,jPanelAccionesFormularioVestimenta,jmenuBarVestimenta,jmenuBarDetalleVestimenta,jTtoolBarVestimenta,jTtoolBarDetalleVestimenta);
						
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
	
	public void finishProcessVestimenta() {// throws Exception 
		this.finishProcessVestimenta(true);
	}
	
	public void finishProcessVestimenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVestimenta ,this.jPanelParametrosReportesVestimenta, this.jScrollPanelDatosVestimenta,this.jPanelPaginacionVestimenta, this.jScrollPanelDatosEdicionVestimenta, this.jPanelAccionesVestimenta,this.jPanelAccionesFormularioVestimenta,this.jmenuBarVestimenta,this.jmenuBarDetalleVestimenta,this.jTtoolBarVestimenta,this.jTtoolBarDetalleVestimenta);		
		
		final JTabbedPane jTabbedPaneBusquedasVestimenta=this.jTabbedPaneBusquedasVestimenta; 
		
		final JPanel jPanelParametrosReportesVestimenta=this.jPanelParametrosReportesVestimenta;
		//final JScrollPane jScrollPanelDatosVestimenta=this.jScrollPanelDatosVestimenta;
		final JTable jTableDatosVestimenta=this.jTableDatosVestimenta;		
		final JPanel jPanelPaginacionVestimenta=this.jPanelPaginacionVestimenta;
		//final JScrollPane jScrollPanelDatosEdicionVestimenta=this.jScrollPanelDatosEdicionVestimenta;
		final JPanel jPanelAccionesVestimenta=this.jPanelAccionesVestimenta;
		
		JPanel jPanelCamposAuxiliarVestimenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVestimenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) {
			jPanelCamposAuxiliarVestimenta=this.jInternalFrameDetalleFormVestimenta.jPanelCamposVestimenta;
			jPanelAccionesFormularioAuxiliarVestimenta=this.jInternalFrameDetalleFormVestimenta.jPanelAccionesFormularioVestimenta;
		}
		
		final JPanel jPanelCamposVestimenta=jPanelCamposAuxiliarVestimenta;
		final JPanel jPanelAccionesFormularioVestimenta=jPanelAccionesFormularioAuxiliarVestimenta;
		
		
		final JMenuBar jmenuBarVestimenta=this.jmenuBarVestimenta;		
		final JToolBar jTtoolBarVestimenta=this.jTtoolBarVestimenta;
				
		JMenuBar jmenuBarDetalleAuxiliarVestimenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVestimenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) {
			jmenuBarDetalleAuxiliarVestimenta=this.jInternalFrameDetalleFormVestimenta.jmenuBarDetalleVestimenta;
			jTtoolBarDetalleAuxiliarVestimenta=this.jInternalFrameDetalleFormVestimenta.jTtoolBarDetalleVestimenta;		
		}
		
		final JMenuBar jmenuBarDetalleVestimenta=jmenuBarDetalleAuxiliarVestimenta;
		final JToolBar jTtoolBarDetalleVestimenta=jTtoolBarDetalleAuxiliarVestimenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVestimenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVestimenta;
			processRunnable.jTableDatos=jTableDatosVestimenta;
			processRunnable.jPanelCampos=jPanelCamposVestimenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionVestimenta;
			processRunnable.jPanelAcciones=jPanelAccionesVestimenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVestimenta;
			
			
			processRunnable.jmenuBar=jmenuBarVestimenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVestimenta;
			processRunnable.jTtoolBar=jTtoolBarVestimenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVestimenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVestimenta ,jPanelParametrosReportesVestimenta, jTableDatosVestimenta,/*jScrollPanelDatosVestimenta,*/jPanelCamposVestimenta,jPanelPaginacionVestimenta, /*jScrollPanelDatosEdicionVestimenta,*/ jPanelAccionesVestimenta,jPanelAccionesFormularioVestimenta,jmenuBarVestimenta,jmenuBarDetalleVestimenta,jTtoolBarVestimenta,jTtoolBarDetalleVestimenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVestimenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVestimenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVestimenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVestimenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVestimenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVestimenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVestimenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVestimenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVestimenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.vestimentaConstantesFunciones.getsFinalQueryVestimenta();
		String  finalQueryPaginacionTodos=this.vestimentaConstantesFunciones.getsFinalQueryVestimenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VestimentaConstantesFunciones.getArrayColumnasGlobalesNoVestimenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VestimentaConstantesFunciones.getArrayColumnasGlobalesVestimenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VestimentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.vestimentasEliminados= new ArrayList<Vestimenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVestimenta();
		
				///*VestimentaSessionBean*/this.vestimentaSessionBean=new VestimentaSessionBean();
			
			if(this.vestimentaSessionBean==null) {
				this.vestimentaSessionBean=new VestimentaSessionBean();
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
					this.iNumeroPaginacion=VestimentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VestimentaConstantesFunciones.getClassesForeignKeysOfVestimenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/vestimenta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			vestimentasAux= new ArrayList<Vestimenta>();
			
				
			vestimentaLogic.setDatosCliente(this.datosCliente);
			vestimentaLogic.setDatosDeep(this.datosDeep);
			vestimentaLogic.setIsConDeep(true);
			
			
			vestimentaLogic.getVestimentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					vestimentaLogic.getTodosVestimentas(finalQueryGlobal,pagination);
					
					//vestimentaLogic.getTodosVestimentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(vestimentaLogic.getVestimentas()==null|| vestimentaLogic.getVestimentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vestimentasAux= new ArrayList<Vestimenta>();
							vestimentasAux.addAll(vestimentaLogic.getVestimentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vestimentasAux= new ArrayList<Vestimenta>();
							vestimentasAux.addAll(vestimentas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vestimentaLogic.getTodosVestimentas(finalQueryGlobal+"",this.pagination);												
							
							//vestimentaLogic.getTodosVestimentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteVestimentas("Todos",vestimentaLogic.getVestimentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vestimentaLogic.setVestimentas(new ArrayList<Vestimenta>());					
							vestimentaLogic.getVestimentas().addAll(vestimentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vestimentas=new ArrayList<Vestimenta>();
							vestimentas.addAll(vestimentasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVestimenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVestimenta=this.idActual;
				
				} else if(this.idVestimentaActual!=null && this.idVestimentaActual!=0L) {
					idVestimenta=idVestimentaActual;
				}
				
					
				this.sDetalleReporte=VestimentaConstantesFunciones.getDetalleIndicePorId(idVestimenta);
				
				this.vestimentas=new ArrayList<Vestimenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					vestimentaLogic.getEntity(idVestimenta);
					
					//vestimentaLogic.getEntityWithConnection(idVestimenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vestimentaLogic.setVestimentas(new ArrayList<Vestimenta>());
					vestimentaLogic.getVestimentas().add(vestimentaLogic.getVestimenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vestimentas=new ArrayList<Vestimenta>();
					this.vestimentas.add(vestimenta);
				}
				
				if(vestimentaLogic.getVestimenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=VestimentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vestimentaLogic.getVestimentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VestimentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VestimentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vestimentaLogic.getVestimentas()==null||vestimentaLogic.getVestimentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vestimentas==null|| vestimentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vestimentasAux=new ArrayList<Vestimenta>();
						vestimentasAux.addAll(vestimentaLogic.getVestimentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vestimentasAux=new ArrayList<Vestimenta>();
							vestimentasAux.addAll(vestimentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vestimentaLogic.getVestimentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VestimentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VestimentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVestimentas("FK_IdEmpresa",vestimentaLogic.getVestimentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVestimentas("FK_IdEmpresa",vestimentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vestimentaLogic.setVestimentas(new ArrayList<Vestimenta>());
						vestimentaLogic.getVestimentas().addAll(vestimentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vestimentas=new ArrayList<Vestimenta>();
							vestimentas.addAll(vestimentasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVestimenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVestimenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vestimentaLogic.getVestimentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vestimentas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vestimentaLogic.getVestimentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vestimentas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Vestimenta vestimenta) {
		Boolean permite=true;
		
		if(this.vestimenta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VestimentaConstantesFunciones.getOrderByListaVestimenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VestimentaConstantesFunciones.getOrderByListaVestimenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Vestimenta vestimenta:vestimentaLogic.getVestimentas()) {
				if(vestimenta.getsType().equals(Constantes2.S_TOTALES)) {
					vestimentaTotales=vestimenta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Vestimenta vestimenta:this.vestimentas) {
				if(vestimenta.getsType().equals(Constantes2.S_TOTALES)) {
					vestimentaTotales=vestimenta;
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
			this.vestimentaAux=new Vestimenta();
			this.vestimentaAux.setsType(Constantes2.S_TOTALES);
			this.vestimentaAux.setIsNew(false);
			this.vestimentaAux.setIsChanged(false);
			this.vestimentaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				VestimentaConstantesFunciones.TotalizarValoresFilaVestimenta(this.vestimentaLogic.getVestimentas(),this.vestimentaAux);
				
				this.vestimentaLogic.getVestimentas().add(this.vestimentaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VestimentaConstantesFunciones.TotalizarValoresFilaVestimenta(this.vestimentas,this.vestimentaAux);
				
				this.vestimentas.add(this.vestimentaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		vestimentaTotales=new Vestimenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vestimentaLogic.getVestimentas().remove(vestimentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vestimentas.remove(vestimentaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		vestimentaTotales=new Vestimenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Vestimenta vestimenta:vestimentaLogic.getVestimentas()) {
				if(vestimenta.getsType().equals(Constantes2.S_TOTALES)) {
					vestimentaTotales=vestimenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VestimentaConstantesFunciones.TotalizarValoresFilaVestimenta(this.vestimentaLogic.getVestimentas(),vestimentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Vestimenta vestimenta:this.vestimentas) {
				if(vestimenta.getsType().equals(Constantes2.S_TOTALES)) {
					vestimentaTotales=vestimenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VestimentaConstantesFunciones.TotalizarValoresFilaVestimenta(this.vestimentas,vestimentaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVestimentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVestimentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vestimentaLogic.getVestimentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosVestimenta() {
		this.isPermisoTodoVestimenta=false;
		this.isPermisoNuevoVestimenta=false;
		this.isPermisoActualizarVestimenta=false;
		this.isPermisoActualizarOriginalVestimenta=false;
		this.isPermisoEliminarVestimenta=false;
		this.isPermisoGuardarCambiosVestimenta=false;
		this.isPermisoConsultaVestimenta=false;
		this.isPermisoBusquedaVestimenta=false;
		this.isPermisoReporteVestimenta=false;		
		this.isPermisoOrdenVestimenta=false;		
		this.isPermisoPaginacionMedioVestimenta=false;		
		this.isPermisoPaginacionAltoVestimenta=false;
		this.isPermisoPaginacionTodoVestimenta=false;
		this.isPermisoCopiarVestimenta=false;		
		this.isPermisoVerFormVestimenta=false;		
		this.isPermisoDuplicarVestimenta=false;		
		this.isPermisoOrdenVestimenta=false;		
	}
	
	public void setPermisosUsuarioVestimenta(Boolean isPermiso) {
		this.isPermisoTodoVestimenta=isPermiso;
		this.isPermisoNuevoVestimenta=isPermiso;
		this.isPermisoActualizarVestimenta=isPermiso;
		this.isPermisoActualizarOriginalVestimenta=isPermiso;
		this.isPermisoEliminarVestimenta=isPermiso;
		this.isPermisoGuardarCambiosVestimenta=isPermiso;
		this.isPermisoConsultaVestimenta=isPermiso;
		this.isPermisoBusquedaVestimenta=isPermiso;
		this.isPermisoReporteVestimenta=isPermiso;
		this.isPermisoOrdenVestimenta=isPermiso;		
		this.isPermisoPaginacionMedioVestimenta=isPermiso;		
		this.isPermisoPaginacionAltoVestimenta=isPermiso;		
		this.isPermisoPaginacionTodoVestimenta=isPermiso;		
		this.isPermisoCopiarVestimenta=isPermiso;		
		this.isPermisoVerFormVestimenta=isPermiso;		
		this.isPermisoDuplicarVestimenta=isPermiso;
		this.isPermisoOrdenVestimenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVestimenta(Boolean isPermiso) {
		//this.isPermisoTodoVestimenta=isPermiso;
		this.isPermisoNuevoVestimenta=isPermiso;
		this.isPermisoActualizarVestimenta=isPermiso;
		this.isPermisoActualizarOriginalVestimenta=isPermiso;
		this.isPermisoEliminarVestimenta=isPermiso;
		this.isPermisoGuardarCambiosVestimenta=isPermiso;
		//this.isPermisoConsultaVestimenta=isPermiso;
		//this.isPermisoBusquedaVestimenta=isPermiso;
		//this.isPermisoReporteVestimenta=isPermiso;
		//this.isPermisoOrdenVestimenta=isPermiso;		
		//this.isPermisoPaginacionMedioVestimenta=isPermiso;		
		//this.isPermisoPaginacionAltoVestimenta=isPermiso;		
		//this.isPermisoPaginacionTodoVestimenta=isPermiso;		
		//this.isPermisoCopiarVestimenta=isPermiso;		
		//this.isPermisoDuplicarVestimenta=isPermiso;
		//this.isPermisoOrdenVestimenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVestimentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TallaVestidoConstantesFunciones.SNOMBREOPCION);
		
		if(VestimentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTallaVestido=false;
		this.isTienePermisosTallaVestido=this.verificarGetPermisosUsuarioOpcionVestimentaClaseRelacionada(this.opcionsRelacionadas,TallaVestidoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebVestimenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVestimentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTallaVestido=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioVestimentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVestimentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVestimentaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTallaVestido && this.jInternalFrameDetalleFormVestimenta!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormVestimenta.jTabbedPaneRelacionesVestimenta.remove(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioVestimenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VestimentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.vestimentaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VestimentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVestimenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVestimenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVestimenta=this.isPermisoActualizarVestimenta;
			this.isPermisoEliminarVestimenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVestimenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVestimenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVestimenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVestimenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVestimenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVestimenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVestimenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVestimenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVestimenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVestimenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVestimenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVestimenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVestimenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.vestimentaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVestimenta.setToolTipText(this.jTableDatosVestimenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVestimenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVestimenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VestimentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VestimentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVestimenta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTallaVestido && this.vestimentaConstantesFunciones.mostrarTallaVestidoVestimenta && !VestimentaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Talla Vestido");
			reporte.setsDescripcion("Talla Vestido");
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
	public void inicializarCombosForeignKeyVestimentaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVestimentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VestimentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyVestimentaListas(false);
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
	
	public void cargarCombosLoteForeignKeyVestimentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			VestimentaParameterReturnGeneral vestimentaReturnGeneral=new VestimentaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.vestimentaConstantesFunciones.cargarid_empresaVestimenta)
					 || (this.esRecargarFks && this.vestimentaConstantesFunciones.cargarid_empresaVestimenta)) {

					if(!this.vestimentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+vestimentaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				vestimentaReturnGeneral=vestimentaLogic.cargarCombosLoteForeignKeyVestimenta(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=vestimentaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyVestimenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.vestimentaSessionBean==null) {
				this.vestimentaSessionBean=new VestimentaSessionBean();
			}

			if(!this.vestimentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyVestimenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVestimenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVestimenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVestimenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVestimenta(Vestimenta vestimenta)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVestimenta(Vestimenta vestimenta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVestimenta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVestimenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVestimenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVestimenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVestimenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVestimenta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVestimenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVestimenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta!=null && this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public VestimentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VestimentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VestimentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.vestimentaSessionBean=new VestimentaSessionBean(); 
		this.vestimentaConstantesFunciones=new VestimentaConstantesFunciones(); 
		this.vestimentaBean=new Vestimenta();//(this.vestimentaConstantesFunciones); 		
		this.vestimentaReturnGeneral=new VestimentaParameterReturnGeneral(); 
		
		this.vestimentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vestimentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VestimentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VestimentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VestimentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVestimenta(true);
			
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
			
			this.vestimentaConstantesFunciones=new VestimentaConstantesFunciones(); 
			this.vestimentaBean=new Vestimenta();//this.vestimentaConstantesFunciones); 			
			this.vestimentaReturnGeneral=new VestimentaParameterReturnGeneral(); 
		
			VestimentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vestimenta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.vestimenta=new Vestimenta();
			this.vestimentas = new ArrayList<Vestimenta>();
			this.vestimentasAux = new ArrayList<Vestimenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic=new VestimentaLogic();
				this.vestimentaLogic.getNewConnexionToDeep("");
			}
			
			//this.vestimentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.vestimentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVestimenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVestimenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVestimenta);	
					}
					
					if(this.jInternalFrameImportacionVestimenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVestimenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVestimenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVestimenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVestimenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVestimenta);
				this.jInternalFrameDetalleFormVestimenta.setVisible(false);
				this.jInternalFrameDetalleFormVestimenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVestimenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVestimenta);
					this.jInternalFrameReporteDinamicoVestimenta.setVisible(false);
					this.jInternalFrameReporteDinamicoVestimenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVestimenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVestimenta);
					this.jInternalFrameImportacionVestimenta.setVisible(false);
					this.jInternalFrameImportacionVestimenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVestimenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVestimenta);
					this.jInternalFrameOrderByVestimenta.setVisible(false);
					this.jInternalFrameOrderByVestimenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVestimentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VestimentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.vestimentaReturnGeneral=new VestimentaParameterReturnGeneral();
			
			this.vestimentaParameterGeneral=new VestimentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.vestimentaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VestimentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.vestimentaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TallaVestidoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VestimentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vestimentaSessionBean.getEsGuardarRelacionado(),this.vestimentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VestimentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vestimentaSessionBean.getEsGuardarRelacionado(),this.vestimentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVestimenta=false;
			this.isVisibilidadCeldaDuplicarVestimenta=true;
			this.isVisibilidadCeldaCopiarVestimenta=true;
			this.isVisibilidadCeldaVerFormVestimenta=true;
			this.isVisibilidadCeldaOrdenVestimenta=true;
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=false;
			this.isVisibilidadCeldaModificarVestimenta=false;
			this.isVisibilidadCeldaActualizarVestimenta=false;
			this.isVisibilidadCeldaEliminarVestimenta=false;
			this.isVisibilidadCeldaCancelarVestimenta=false;
			this.isVisibilidadCeldaGuardarVestimenta=false;
			this.isVisibilidadCeldaGuardarCambiosVestimenta=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVestimenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVestimenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVestimenta(false);
			
			this.setPermisosUsuarioVestimenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vestimentaSessionBean.getEsGuardarRelacionado() 
				|| (this.vestimentaSessionBean.getEsGuardarRelacionado() && this.vestimentaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVestimentaClasesRelacionadas();
			}
			
			if(this.vestimentaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVestimentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VestimentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVestimenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVestimenta();
			}
			
			if(!this.isPermisoBusquedaVestimenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVestimenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioVestimenta,this.isPermisoPaginacionMedioVestimenta,this.isPermisoPaginacionTodoVestimenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VestimentaConstantesFunciones.getTiposSeleccionarVestimenta());
				
				this.tiposColumnasSelect=VestimentaConstantesFunciones.getTiposSeleccionarVestimenta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectVestimenta();				
				//this.tiposRelacionesSelect=VestimentaConstantesFunciones.getTiposRelacionesVestimenta(true);
				
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
			//if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVestimenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioVestimenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioVestimenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVestimenta() ;
			
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
			
			
			this.tallavestidoLogic=new TallaVestidoLogic(); 
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
				vestimentaImplementable= (VestimentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VestimentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				vestimentaImplementableHome= (VestimentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VestimentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.vestimentas= new ArrayList<Vestimenta>();
			this.vestimentasEliminados= new ArrayList<Vestimenta>();
						
			this.isEsNuevoVestimenta=false;
			this.esParaAccionDesdeFormularioVestimenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVestimenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVestimenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VestimentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VestimentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVestimenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVestimenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVestimenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVestimenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVestimenta();
			}
			
			VestimentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVestimenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVestimenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVestimenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVestimenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Vestimenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVestimenta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVestimenta")) {
				iIndex=this.jInternalFrameDetalleFormVestimenta.jTabbedPaneRelacionesVestimenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVestimenta.jTabbedPaneRelacionesVestimenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();	
				
				

				if(sTitle.equals("Talla Vestidos")) {
					if(!TallaVestidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessVestimenta();

						this.cargarParteTabPanelRelacionadaTallaVestido(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVestimenta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaTallaVestido(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormVestimenta.cargarSessionConBeanSwingJInternalFrameTallaVestido(false,true,iIndex);
		this.jButtonTallaVestidoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTallaVestido();

		//this.jTabbedPaneRelacionesVestimenta.updateUI();
		//this.jTabbedPaneRelacionesVestimenta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesVestimenta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TallaVestido")) {
				int row=this.jTableDatosVestimenta.getSelectedRow();
				jButtonTallaVestidoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Talla Vestido")) {

					if(this.isTienePermisosTallaVestido && this.vestimentaConstantesFunciones.mostrarTallaVestidoVestimenta && !VestimentaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Talla Vestidos"+"("+TallaVestidoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Talla Vestidos");

						if(vestimentaConstantesFunciones.resaltarTallaVestidoVestimenta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(vestimentaConstantesFunciones.resaltarTallaVestidoVestimenta);
						}

						jmenuItem.setEnabled(this.vestimentaConstantesFunciones.activarTallaVestidoVestimenta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TallaVestido"));

						

						this.jInternalFrameDetalleFormVestimenta.jmenuDetalleVestimenta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyVestimenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVestimenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVestimenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVestimentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVestimenta();
		
		this.cargarCombosFrameForeignKeyVestimenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVestimenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVestimenta();
		}
	}
	
	
	
	public void jButtonNuevoVestimentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.vestimentaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
			
			if(jTableDatosVestimenta.getRowCount()>=1) {
				jTableDatosVestimenta.removeRowSelectionInterval(0, jTableDatosVestimenta.getRowCount()-1);						
			}
			
			this.isEsNuevoVestimenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVestimenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVestimenta(true);			
			//this.vestimenta=new Vestimenta();
			//this.vestimenta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVestimenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVestimenta() ;
			
			if(VestimentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVestimenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.vestimenta);	
			this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);				
			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
			if(this.vestimentaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Vestimenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVestimentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVestimenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVestimenta.getSelectedRows().length;			
			}
			
			vestimentasSeleccionados=this.getVestimentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVestimenta--;			
				//Vestimenta vestimentaAux= new Vestimenta();			
				//vestimentaAux.setId(this.iIdNuevoVestimenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Vestimenta vestimentaOrigen=new Vestimenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Vestimenta vestimentaOrigen : vestimentasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							vestimentaOrigen =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vestimentaOrigen =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVestimenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.vestimenta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVestimenta(vestimentaOrigen,this.vestimenta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vestimentaLogic.getVestimentas().add(this.vestimentaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vestimentas.add(this.vestimentaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVestimenta(false);
				
				this.jTableDatosVestimenta.setRowSelectionInterval(this.getIndiceNuevoVestimenta(), this.getIndiceNuevoVestimenta());
				
				int iLastRow =  this.jTableDatosVestimenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVestimenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVestimenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVestimenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();									
		
			Vestimenta vestimentaOrigen=new Vestimenta();
			Vestimenta vestimentaDestino=new Vestimenta();
				
			vestimentasSeleccionados=this.getVestimentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVestimenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || vestimentasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVestimenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vestimentaOrigen =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vestimentaOrigen =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vestimentaDestino =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vestimentaDestino =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				vestimentaOrigen =vestimentasSeleccionados.get(0);
				vestimentaDestino =vestimentasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVestimenta(vestimentaOrigen,vestimentaDestino,true,false);
				
				vestimentaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vestimentaDestino,vestimentaLogic.getVestimentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vestimentaDestino,vestimentas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVestimenta(false);
				
				//this.jTableDatosVestimenta.setRowSelectionInterval(this.getIndiceNuevoVestimenta(), this.getIndiceNuevoVestimenta());
				
				int iLastRow =  this.jTableDatosVestimenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVestimenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVestimenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVestimenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVestimenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVestimenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVestimenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVestimenta.setVisible(!isVisible);
			this.jPanelPaginacionVestimenta.setVisible(!isVisible);
			this.jPanelAccionesVestimenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVestimenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVestimenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVestimenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVestimenta();
			
			this.abrirFrameOrderByVestimenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVestimenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVestimenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVestimenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVestimenta.isMaximum()) {
					this.jInternalFrameDetalleFormVestimenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVestimenta.setSize(this.jInternalFrameDetalleFormVestimenta.iWidthFormulario,this.jInternalFrameDetalleFormVestimenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVestimenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVestimenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVestimenta.isMaximum()) {
						this.jInternalFrameDetalleFormVestimenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVestimenta.jContentPaneDetalleVestimenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVestimenta.jTabbedPaneRelacionesVestimenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVestimenta.jContentPaneDetalleVestimenta.getWidth(),VestimentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVestimenta.jTabbedPaneRelacionesVestimenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVestimenta.jContentPaneDetalleVestimenta.getWidth(),VestimentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVestimenta.jTabbedPaneRelacionesVestimenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVestimenta.jContentPaneDetalleVestimenta.getWidth(),VestimentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(TallaVestidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTallaVestido();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVestimenta.setVisible(true);
	        this.jInternalFrameDetalleFormVestimenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVestimenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVestimenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVestimenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVestimenta,false,this);
				} else {
					this.jInternalFrameOrderByVestimenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVestimenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVestimenta);
				this.jInternalFrameOrderByVestimenta.setVisible(false);
				this.jInternalFrameOrderByVestimenta.setSelected(false);
				
				this.jInternalFrameOrderByVestimenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVestimenta"));
				
				this.inicializarActualizarBindingTablaOrderByVestimenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVestimenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVestimenta==null) {
				
				this.jInternalFrameImportacionVestimenta=new ImportacionJInternalFrame(VestimentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVestimenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVestimenta);
				this.jInternalFrameImportacionVestimenta.setVisible(false);
				this.jInternalFrameImportacionVestimenta.setSelected(false);


				this.jInternalFrameImportacionVestimenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVestimenta"));
				this.jInternalFrameImportacionVestimenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVestimenta"));
				this.jInternalFrameImportacionVestimenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVestimenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVestimenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVestimenta==null) {
				this.jInternalFrameReporteDinamicoVestimenta=new ReporteDinamicoJInternalFrame(VestimentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVestimenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVestimenta);
				this.jInternalFrameReporteDinamicoVestimenta.setVisible(false);
				this.jInternalFrameReporteDinamicoVestimenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVestimenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVestimenta"));
				this.jInternalFrameReporteDinamicoVestimenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVestimenta"));
				this.jInternalFrameReporteDinamicoVestimenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVestimenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVestimenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaTallaVestido() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.jScrollPanelDatosTallaVestido.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormVestimenta.jContentPaneDetalleVestimenta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.jScrollPanelDatosTallaVestido.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.jScrollPanelDatosTallaVestido.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.jScrollPanelDatosTallaVestido.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleVestimenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVestimenta);
			
	       	this.jInternalFrameDetalleFormVestimenta.setVisible(false);
	        this.jInternalFrameDetalleFormVestimenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormVestimenta.dispose();
			//this.jInternalFrameDetalleFormVestimenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVestimenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVestimenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoVestimenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVestimenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVestimenta.setVisible(true);
	        this.jInternalFrameImportacionVestimenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVestimenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVestimenta.setVisible(true);
	        this.jInternalFrameOrderByVestimenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVestimenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVestimenta.setVisible(false);
	        this.jInternalFrameOrderByVestimenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVestimenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVestimenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoVestimenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVestimenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVestimenta.setVisible(false);
	        this.jInternalFrameImportacionVestimenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVestimenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVestimenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVestimenta(true);
			//this.isEsNuevoVestimenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVestimenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVestimenta(false) ;
			
			if(vestimentaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.getEsGuardarRelacionado() && TallaVestidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTallaVestidoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(VestimentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVestimenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVestimenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVestimentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVestimenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVestimenta(true);
			//this.isEsNuevoVestimenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.vestimenta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVestimenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVestimenta(false) ;
			
			if(VestimentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVestimenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVestimenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVestimenta(false);
			
			//if(!this.isEsNuevoVestimenta) {								
				int intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVestimenta(this.vestimenta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
				
			}
			
			if(this.permiteMantenimiento(this.vestimenta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVestimenta=true;
					this.inicializarActualizarBindingTablaVestimenta(false);
					this.isEsNuevoVestimenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVestimenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVestimenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVestimenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVestimenta(false);
				
				this.habilitarDeshabilitarControlesVestimenta(false);
			
												
				
				if(VestimentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVestimenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVestimentaActionPerformed(evt,vestimentaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVestimenta(this.vestimenta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVestimenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,vestimentaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.vestimenta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVestimentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				this.vestimenta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				this.vestimenta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.vestimenta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VestimentaModel) this.jTableDatosVestimenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVestimenta=true;
				this.inicializarActualizarBindingTablaVestimenta(false);
				this.isEsNuevoVestimenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVestimenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVestimenta(false);
				
				this.habilitarDeshabilitarControlesVestimenta(false);
				
				
				
				if(VestimentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVestimenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVestimentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVestimenta.getRowCount()>=1) {
				jTableDatosVestimenta.removeRowSelectionInterval(0, jTableDatosVestimenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVestimenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVestimenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVestimenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVestimenta(false) ;
			
			this.isEsNuevoVestimenta=false;
			
			if(VestimentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVestimenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVestimentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVestimenta(false);
				
				//SI ES MANUAL
				if(VestimentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVestimenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVestimentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVestimenta--;			
			//Vestimenta vestimentaAux= new Vestimenta();			
			//vestimentaAux.setId(this.iIdNuevoVestimenta);
			
			if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVestimenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
			
			this.vestimenta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.vestimentaLogic.getVestimentas().add(this.vestimentaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.vestimentas.add(this.vestimentaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVestimenta(false);
			
			this.jTableDatosVestimenta.setRowSelectionInterval(this.getIndiceNuevoVestimenta(), this.getIndiceNuevoVestimenta());
			
			int iLastRow =  this.jTableDatosVestimenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVestimenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVestimenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVestimenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVestimentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVestimenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVestimenta(false);
			
			//SI ES MANUAL
			if(VestimentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVestimenta();
			}
			
			//this.abrirFrameTreeVestimenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVestimentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE VestimentaS ?", "MANTENIMIENTO DE Vestimenta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionVestimenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralVestimenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.vestimentaReturnGeneral=vestimentaLogic.procesarImportacionVestimentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.vestimentaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarVestimentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVestimentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVestimenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVestimenta.setFileImportacion(this.jInternalFrameImportacionVestimenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVestimenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVestimenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVestimenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVestimenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVestimentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();		

		vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VestimentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VestimentaBaseDesign.jrxml";
			
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
			
			this.generarReporteVestimentas("Todos",vestimentasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vestimenta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VestimentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VestimentaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoVestimenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VestimentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case VestimentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VestimentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case VestimentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VestimentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case VestimentaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoVestimentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();		
		
		vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vestimenta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Vestimentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VestimentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VestimentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Vestimenta vestimenta:vestimentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vestimenta.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VestimentaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VestimentaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Vestimenta vestimenta:vestimentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vestimenta.getnombre());
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
			//	this.getFilaCabeceraExportarExcelVestimenta(row);				
			//	iRow++;
			//}				
			
			//for(Vestimenta vestimentaAux:vestimentasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVestimenta(vestimentaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vestimenta",JOptionPane.INFORMATION_MESSAGE);
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
				this.vestimentaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVestimenta(false);
			
			//SI ES MANUAL
			if(VestimentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVestimenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVestimentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVestimenta(false);
			
			//SI ES MANUAL
			if(VestimentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVestimenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVestimentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVestimenta(false);
			
			//SI ES MANUAL
			if(VestimentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVestimenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVestimenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVestimenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVestimenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVestimenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVestimenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVestimenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosVestimenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosVestimenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVestimenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVestimenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVestimenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVestimenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVestimenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVestimenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVestimenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVestimenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VestimentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVestimenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVestimenta();
		
		this.inicializarActualizarBindingBotonesManualVestimenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVestimenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVestimenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVestimenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVestimenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVestimenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVestimenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVestimenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVestimenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVestimenta.jCheckBoxPostAccionNuevoVestimenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVestimenta.jCheckBoxPostAccionSinCerrarVestimenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVestimenta.jCheckBoxPostAccionSinMensajeVestimenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVestimenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVestimenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVestimenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVestimenta!=null) {
				this.jInternalFrameDetalleFormVestimenta.jCheckBoxPostAccionNuevoVestimenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVestimenta.jCheckBoxPostAccionSinCerrarVestimenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVestimenta.jCheckBoxPostAccionSinMensajeVestimenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVestimenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVestimenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVestimenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVestimenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVestimenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVestimenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVestimenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVestimenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVestimenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVestimenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVestimenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVestimenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVestimenta(Boolean esInicializar) throws Exception {
		try	{	
			if(VestimentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVestimenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVestimenta() throws Exception {
		try	{
			if(VestimentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVestimenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVestimenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVestimenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVestimenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVestimenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVestimenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVestimenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVestimenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVestimenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVestimenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVestimenta.addItem(reporte);
			}
			
			
			if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVestimenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVestimenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVestimenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVestimenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVestimenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVestimenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVestimenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVestimenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVestimenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVestimenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVestimenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVestimenta!=null) {
				this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVestimenta!=null) {
				this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVestimenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVestimenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVestimenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVestimenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVestimenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVestimenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVestimenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVestimenta(Boolean esInicializar) throws Exception {				
		if(VestimentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVestimenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVestimenta() throws Exception {
		this.inicializarActualizarBindingTablaVestimenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVestimenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VestimentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VestimentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVestimentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVestimentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VestimentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VestimentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVestimenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=vestimentaLogic.getVestimentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=vestimentas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVestimenta.setModel(new VestimentaModel(this.vestimentaLogic.getVestimentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVestimenta.setModel(new VestimentaModel(this.vestimentas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVestimenta!=null && this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVestimenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVestimenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVestimenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VestimentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VestimentaConstantesFunciones.SCLASSWEBTITULO,vestimentaConstantesFunciones.resaltarSeleccionarVestimenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VestimentaConstantesFunciones.SCLASSWEBTITULO,vestimentaConstantesFunciones.resaltarSeleccionarVestimenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVestimenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVestimenta,VestimentaConstantesFunciones.LABEL_ID));

		if(this.vestimentaConstantesFunciones.mostraridVestimenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VestimentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vestimentaConstantesFunciones.resaltaridVestimenta,this.vestimentaConstantesFunciones.activaridVestimenta,this,true,"idVestimenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vestimentaConstantesFunciones.resaltaridVestimenta,this.vestimentaConstantesFunciones.activaridVestimenta,this,true,"idVestimenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVestimenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVestimenta,VestimentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.vestimentaConstantesFunciones.mostrarid_empresaVestimenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VestimentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.vestimentaConstantesFunciones.resaltarid_empresaVestimenta,this,this.vestimentaConstantesFunciones.activarid_empresaVestimenta));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.vestimentaConstantesFunciones.resaltarid_empresaVestimenta,this,this.vestimentaConstantesFunciones.activarid_empresaVestimenta,false,"id_empresaVestimenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VestimentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVestimenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVestimenta,VestimentaConstantesFunciones.LABEL_NOMBRE));

		if(this.vestimentaConstantesFunciones.mostrarnombreVestimenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VestimentaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vestimentaConstantesFunciones.resaltarnombreVestimenta,this.vestimentaConstantesFunciones.activarnombreVestimenta,this,true,"nombreVestimenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vestimentaConstantesFunciones.resaltarnombreVestimenta,this.vestimentaConstantesFunciones.activarnombreVestimenta,this,true,"nombreVestimenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VestimentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTallaVestido && this.vestimentaConstantesFunciones.mostrarTallaVestidoVestimenta && !VestimentaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Talla Vestidos");
				tableColumn.setHeaderValue("Talla Vestidos");
				tableColumn.setCellRenderer(new TallaVestidoTableCell(vestimentaConstantesFunciones.resaltarTallaVestidoVestimenta,this,this.vestimentaConstantesFunciones.activarTallaVestidoVestimenta));
				tableColumn.setCellEditor(new TallaVestidoTableCell(vestimentaConstantesFunciones.resaltarTallaVestidoVestimenta,this,this.vestimentaConstantesFunciones.activarTallaVestidoVestimenta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosVestimenta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vestimentaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vestimentaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVestimenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vestimentaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vestimentaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVestimenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVestimenta && this.isPermisoGuardarCambiosVestimenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.vestimentaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.vestimentaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVestimenta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.vestimentaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosVestimenta.addColumn(tableColumn);
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
			
			this.jTableDatosVestimenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVestimenta && this.isPermisoGuardarCambiosVestimenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.vestimentaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVestimenta && this.isPermisoGuardarCambiosVestimenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVestimenta.moveColumn(this.jTableDatosVestimenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVestimenta.moveColumn(this.jTableDatosVestimenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.vestimentaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosVestimenta.moveColumn(this.jTableDatosVestimenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVestimenta.moveColumn(this.jTableDatosVestimenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVestimenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVestimenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVestimenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVestimenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVestimenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVestimenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVestimenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVestimenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=vestimentaLogic.getVestimentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=vestimentas.size()-1;
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
		//this.jTableDatosVestimenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVestimenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVestimenta();
			
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
				
				//this.isEsNuevoVestimenta=false;
					
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
				if(this.vestimentaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVestimenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVestimenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVestimenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.vestimenta.getsType().equals("DUPLICADO")
				   || this.vestimenta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVestimenta=true;
				
				} else {
					this.isEsNuevoVestimenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
					if(this.vestimenta.getId()>=0 && !this.vestimenta.getIsNew()) {						
						this.isEsNuevoVestimenta=false;
						
					} else {
						this.isEsNuevoVestimenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVestimenta(esRelaciones);						
				
				this.seleccionarVestimenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.vestimenta.getId()<0) {
					this.isEsNuevoVestimenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVestimenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVestimenta(evt,rowIndex);
				}	
				
				if(this.vestimentaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Vestimenta: " + this.dDif); 
					}
				}								
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVestimenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.vestimenta)) {
					if(this.vestimenta.getId()>0) {
						this.vestimenta.setIsDeleted(true);
						
						this.vestimentasEliminados.add(this.vestimenta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vestimentaLogic.getVestimentas().remove(this.vestimenta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vestimentas.remove(this.vestimenta);				
					}
					
					
					((VestimentaModel) this.jTableDatosVestimenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVestimenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVestimenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVestimenta) {
			
			if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVestimenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVestimenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVestimenta(this.vestimenta);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.vestimentaConstantesFunciones.cargarid_empresaVestimenta || this.vestimentaConstantesFunciones.event_dependid_empresaVestimenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.vestimenta.getid_empresa());
									//this.inicializarActualizarBindingVestimenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(vestimenta.getEmpresa()!=null) {
							this.empresasForeignKey.add(vestimenta.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.vestimenta.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVestimenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVestimenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVestimenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVestimenta(Vestimenta vestimenta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVestimenta(vestimenta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVestimenta(Vestimenta vestimenta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVestimenta(vestimenta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVestimenta(vestimenta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVestimenta(vestimenta);
	}
	
	public void setVariablesObjetoActualToFormularioVestimenta(Vestimenta vestimenta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.setText(vestimenta.getId().toString());
			this.jInternalFrameDetalleFormVestimenta.jTextAreanombreVestimenta.setText(vestimenta.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Vestimenta vestimentaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,vestimentaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Vestimenta vestimentaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				vestimentaLocal=this.vestimenta;
			} else {
				vestimentaLocal=this.vestimentaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(vestimentaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVestimenta(vestimentaLocal,true);
					
					if(vestimentaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(vestimentaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.vestimentaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(vestimentaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVestimenta(Vestimenta vestimenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVestimenta(vestimenta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(vestimenta);
	}
	
	public void setVariablesFormularioToObjetoActualVestimenta(Vestimenta vestimenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVestimenta(vestimenta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVestimenta(Vestimenta vestimenta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.getText()==null || this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.getText()=="" || this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.getText()=="Id") {
				this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.setText("0");
			}

			if(conColumnasBase) {vestimenta.setId(Long.parseLong(this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VestimentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVestimenta.jLabelIdVestimenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vestimenta.setnombre(this.jInternalFrameDetalleFormVestimenta.jTextAreanombreVestimenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VestimentaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVestimenta.jLabelnombreVestimenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVestimenta(Vestimenta vestimentaBean,Vestimenta vestimenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVestimenta(Vestimenta vestimentaOrigen,Vestimenta vestimenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vestimentaOrigen.getId()!=null && !vestimentaOrigen.getId().equals(0L))) {vestimenta.setId(vestimentaOrigen.getId());}}
			if(conDefault || (!conDefault && vestimentaOrigen.getnombre()!=null && !vestimentaOrigen.getnombre().equals(""))) {vestimenta.setnombre(vestimentaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVestimenta(Vestimenta vestimenta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.setText(vestimenta.getId().toString());
			this.jInternalFrameDetalleFormVestimenta.jTextAreanombreVestimenta.setText(vestimenta.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVestimenta(VestimentaBean vestimentaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.setText(vestimentaBean.getId().toString());
			this.jInternalFrameDetalleFormVestimenta.jTextAreanombreVestimenta.setText(vestimentaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVestimenta(VestimentaParameterReturnGeneral vestimentaReturnGeneral,VestimentaBean vestimentaBean,Boolean conDefault) throws Exception { 
		try {
			Vestimenta vestimentaLocal=new Vestimenta();
			
			vestimentaLocal=vestimentaReturnGeneral.getVestimenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vestimentaLocal.getId()!=null && !vestimentaLocal.getId().equals(0L))) {vestimentaBean.setId(vestimentaLocal.getId());}}
			if(conDefault || (!conDefault && vestimentaLocal.getnombre()!=null && !vestimentaLocal.getnombre().equals(""))) {vestimentaBean.setnombre(vestimentaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVestimentaGenerico(Long idVestimentaSeleccionado,JComboBox jComboBoxVestimenta,List<Vestimenta> vestimentasLocal)throws Exception {
		try {
			Vestimenta  vestimentaTemp=null;

			for(Vestimenta vestimentaAux:vestimentasLocal) {
				if(vestimentaAux.getId()!=null && vestimentaAux.getId().equals(idVestimentaSeleccionado)) {
					vestimentaTemp=vestimentaAux;
					break;
				}
			}

			jComboBoxVestimenta.setSelectedItem(vestimentaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVestimentaGenerico(JComboBox jComboBoxVestimenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVestimenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVestimenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVestimenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVestimenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVestimenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVestimenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVestimenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVestimenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVestimenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVestimenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("TallaVestido")) {
			jButtonTallaVestidoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vestimenta=(Vestimenta) vestimentaLogic.getVestimentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vestimenta =(Vestimenta) vestimentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!vestimenta.getIsNew() && !vestimenta.getIsChanged() && !vestimenta.getIsDeleted()) {
				sDescripcion=vestimenta.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=vestimenta.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Vestimenta vestimentaRow=new Vestimenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vestimentaRow=(Vestimenta) vestimentaLogic.getVestimentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vestimentaRow=(Vestimenta) vestimentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTallaVestidoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Vestimenta vestimenta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormVestimenta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vestimenta = (Vestimenta)this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.vestimenta = (Vestimenta)this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(vestimenta!=null) {
						this.vestimenta = vestimenta;
					} else {
						this.vestimenta = new Vestimenta();
					}
				}

				if(this.isTienePermisosTallaVestido && this.permiteMantenimiento(this.vestimenta)) {
					TallaVestidoBeanSwingJInternalFrame tallavestidoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFramePopup=new TallaVestidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tallavestidoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFramePopup;
					} else {
						tallavestidoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame;
					}

					List<Vestimenta> vestimentas=new ArrayList<Vestimenta>();
					vestimentas.add(this.vestimenta);
					if(!esRelacionado) {
						//tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.setConGuardarRelaciones(false);
						//tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tallavestidoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormVestimenta.cargarTallaVestidoBeanSwingJInternalFrame(vestimentas,this.vestimenta,tallavestidoBeanSwingJInternalFrame,/*conInicializar,*/tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.getConGuardarRelaciones(),tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.getEsGuardarRelacionado());
					tallavestidoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tallavestidoBeanSwingJInternalFrame.actualizarEstadoPanelsTallaVestido("no_relacionado");

						tallavestidoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TallaVestidoConstantesFunciones.ITAMANIOFILATABLA + (TallaVestidoConstantesFunciones.ITAMANIOFILATABLA/2));

						tallavestidoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderVestimenta=(TitledBorder)this.jScrollPanelDatosVestimenta.getBorder();
						TitledBorder titledBorderTallaVestido=(TitledBorder)tallavestidoBeanSwingJInternalFrame.jScrollPanelDatosTallaVestido.getBorder();

						titledBorderTallaVestido.setTitle(titledBorderVestimenta.getTitle() + " -> Talla Vestido");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tallavestidoBeanSwingJInternalFrame);
						}

						tallavestidoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tallavestidoBeanSwingJInternalFrame);

						tallavestidoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.vestimentaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Talla Vestido",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVestimenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVestimenta.setVisible((this.isVisibilidadCeldaNuevoVestimenta && this.isPermisoNuevoVestimenta));			
			this.jButtonDuplicarVestimenta.setVisible((this.isVisibilidadCeldaDuplicarVestimenta && this.isPermisoDuplicarVestimenta));			
			this.jButtonCopiarVestimenta.setVisible((this.isVisibilidadCeldaCopiarVestimenta && this.isPermisoCopiarVestimenta));
			this.jButtonVerFormVestimenta.setVisible((this.isVisibilidadCeldaVerFormVestimenta && this.isPermisoVerFormVestimenta));
			
			this.jButtonAbrirOrderByVestimenta.setVisible((this.isVisibilidadCeldaOrdenVestimenta && this.isPermisoOrdenVestimenta));			
			
			this.jButtonNuevoRelacionesVestimenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesVestimenta && this.isPermisoNuevoVestimenta));			
			this.jButtonNuevoGuardarCambiosVestimenta.setVisible((this.isVisibilidadCeldaNuevoVestimenta && this.isPermisoNuevoVestimenta && this.isPermisoGuardarCambiosVestimenta));
			
			if(this.jInternalFrameDetalleFormVestimenta!=null) {
			this.jInternalFrameDetalleFormVestimenta.jButtonModificarVestimenta.setVisible((this.isVisibilidadCeldaModificarVestimenta && this.isPermisoActualizarVestimenta));	
			this.jInternalFrameDetalleFormVestimenta.jButtonActualizarVestimenta.setVisible((this.isVisibilidadCeldaActualizarVestimenta && this.isPermisoActualizarVestimenta));	
			this.jInternalFrameDetalleFormVestimenta.jButtonEliminarVestimenta.setVisible((this.isVisibilidadCeldaEliminarVestimenta && this.isPermisoEliminarVestimenta));
			this.jInternalFrameDetalleFormVestimenta.jButtonCancelarVestimenta.setVisible(this.isVisibilidadCeldaCancelarVestimenta);							
			this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosVestimenta.setVisible((this.isVisibilidadCeldaGuardarVestimenta && this.isPermisoGuardarCambiosVestimenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaVestimenta.setVisible((this.isVisibilidadCeldaGuardarCambiosVestimenta && this.isPermisoGuardarCambiosVestimenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVestimenta.setVisible((this.isVisibilidadCeldaNuevoVestimenta && this.isPermisoNuevoVestimenta));						
			this.jButtonDuplicarToolBarVestimenta.setVisible((this.isVisibilidadCeldaDuplicarVestimenta && this.isPermisoDuplicarVestimenta));						
			this.jButtonCopiarToolBarVestimenta.setVisible((this.isVisibilidadCeldaCopiarVestimenta && this.isPermisoCopiarVestimenta));			
			this.jButtonVerFormToolBarVestimenta.setVisible((this.isVisibilidadCeldaVerFormVestimenta && this.isPermisoVerFormVestimenta));			
			this.jButtonAbrirOrderByToolBarVestimenta.setVisible((this.isVisibilidadCeldaOrdenVestimenta && this.isPermisoOrdenVestimenta));
			this.jButtonNuevoRelacionesToolBarVestimenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesVestimenta && this.isPermisoNuevoVestimenta));			
			this.jButtonNuevoGuardarCambiosToolBarVestimenta.setVisible((this.isVisibilidadCeldaNuevoVestimenta && this.isPermisoNuevoVestimenta && this.isPermisoGuardarCambiosVestimenta));			
			
			if(this.jInternalFrameDetalleFormVestimenta!=null) {
			this.jInternalFrameDetalleFormVestimenta.jButtonModificarToolBarVestimenta.setVisible((this.isVisibilidadCeldaModificarVestimenta && this.isPermisoActualizarVestimenta));	
			this.jInternalFrameDetalleFormVestimenta.jButtonActualizarToolBarVestimenta.setVisible((this.isVisibilidadCeldaActualizarVestimenta  && this.isPermisoActualizarVestimenta));	
			this.jInternalFrameDetalleFormVestimenta.jButtonEliminarToolBarVestimenta.setVisible((this.isVisibilidadCeldaEliminarVestimenta && this.isPermisoEliminarVestimenta));
			this.jInternalFrameDetalleFormVestimenta.jButtonCancelarToolBarVestimenta.setVisible(this.isVisibilidadCeldaCancelarVestimenta);				
			this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosToolBarVestimenta.setVisible((this.isVisibilidadCeldaGuardarVestimenta && this.isPermisoGuardarCambiosVestimenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVestimenta.setVisible((this.isVisibilidadCeldaGuardarCambiosVestimenta && this.isPermisoGuardarCambiosVestimenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVestimenta.setVisible((this.isVisibilidadCeldaNuevoVestimenta && this.isPermisoNuevoVestimenta));			
			this.jMenuItemDuplicarVestimenta.setVisible((this.isVisibilidadCeldaDuplicarVestimenta && this.isPermisoDuplicarVestimenta));			
			this.jMenuItemCopiarVestimenta.setVisible((this.isVisibilidadCeldaCopiarVestimenta && this.isPermisoCopiarVestimenta));			
			this.jMenuItemVerFormVestimenta.setVisible((this.isVisibilidadCeldaVerFormVestimenta && this.isPermisoVerFormVestimenta));			
			this.jMenuItemAbrirOrderByVestimenta.setVisible((this.isVisibilidadCeldaOrdenVestimenta && this.isPermisoOrdenVestimenta));			
			//this.jMenuItemMostrarOcultarVestimenta.setVisible((this.isVisibilidadCeldaOrdenVestimenta && this.isPermisoOrdenVestimenta));
			this.jMenuItemDetalleAbrirOrderByVestimenta.setVisible((this.isVisibilidadCeldaOrdenVestimenta && this.isPermisoOrdenVestimenta));			
			//this.jMenuItemDetalleMostrarOcultarVestimenta.setVisible((this.isVisibilidadCeldaOrdenVestimenta && this.isPermisoOrdenVestimenta));			
			this.jMenuItemNuevoRelacionesVestimenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesVestimenta && this.isPermisoNuevoVestimenta));			
			this.jMenuItemNuevoGuardarCambiosVestimenta.setVisible((this.isVisibilidadCeldaNuevoVestimenta && this.isPermisoNuevoVestimenta && this.isPermisoGuardarCambiosVestimenta));									
			
			if(this.jInternalFrameDetalleFormVestimenta!=null) {
			this.jInternalFrameDetalleFormVestimenta.jMenuItemModificarVestimenta.setVisible((this.isVisibilidadCeldaModificarVestimenta && this.isPermisoActualizarVestimenta));	
			this.jInternalFrameDetalleFormVestimenta.jMenuItemActualizarVestimenta.setVisible((this.isVisibilidadCeldaActualizarVestimenta && this.isPermisoActualizarVestimenta));	
			this.jInternalFrameDetalleFormVestimenta.jMenuItemEliminarVestimenta.setVisible((this.isVisibilidadCeldaEliminarVestimenta && this.isPermisoEliminarVestimenta));
			this.jInternalFrameDetalleFormVestimenta.jMenuItemCancelarVestimenta.setVisible(this.isVisibilidadCeldaCancelarVestimenta);				
			}
			
			this.jMenuItemGuardarCambiosVestimenta.setVisible((this.isVisibilidadCeldaGuardarVestimenta && this.isPermisoGuardarCambiosVestimenta));						
			this.jMenuItemGuardarCambiosTablaVestimenta.setVisible((this.isVisibilidadCeldaGuardarCambiosVestimenta && this.isPermisoGuardarCambiosVestimenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVestimenta=this.jButtonNuevoVestimenta.isVisible();
			this.isVisibilidadCeldaDuplicarVestimenta=this.jButtonDuplicarVestimenta.isVisible();
			this.isVisibilidadCeldaCopiarVestimenta=this.jButtonCopiarVestimenta.isVisible();
			this.isVisibilidadCeldaVerFormVestimenta=this.jButtonVerFormVestimenta.isVisible();
			
			this.isVisibilidadCeldaOrdenVestimenta=this.jButtonAbrirOrderByVestimenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=this.jButtonNuevoRelacionesVestimenta.isVisible();
			this.isVisibilidadCeldaModificarVestimenta=this.jButtonModificarVestimenta.isVisible();
			
			if(this.jInternalFrameDetalleFormVestimenta!=null) {
			this.isVisibilidadCeldaActualizarVestimenta=this.jInternalFrameDetalleFormVestimenta.jButtonActualizarVestimenta.isVisible();
			this.isVisibilidadCeldaEliminarVestimenta=this.jInternalFrameDetalleFormVestimenta.jButtonEliminarVestimenta.isVisible();
			this.isVisibilidadCeldaCancelarVestimenta=this.jInternalFrameDetalleFormVestimenta.jButtonCancelarVestimenta.isVisible();
			this.isVisibilidadCeldaGuardarVestimenta=this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosVestimenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVestimenta=this.jButtonGuardarCambiosTablaVestimenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVestimenta=this.jButtonNuevoToolBarVestimenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=this.jButtonNuevoRelacionesToolBarVestimenta.isVisible();
			
			if(this.jInternalFrameDetalleFormVestimenta!=null) {
			this.isVisibilidadCeldaModificarVestimenta=this.jInternalFrameDetalleFormVestimenta.jButtonModificarToolBarVestimenta.isVisible();
			this.isVisibilidadCeldaActualizarVestimenta=this.jInternalFrameDetalleFormVestimenta.jButtonActualizarToolBarVestimenta.isVisible();
			this.isVisibilidadCeldaEliminarVestimenta=this.jInternalFrameDetalleFormVestimenta.jButtonEliminarToolBarVestimenta.isVisible();
			this.isVisibilidadCeldaCancelarVestimenta=this.jInternalFrameDetalleFormVestimenta.jButtonCancelarToolBarVestimenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVestimenta=this.jButtonGuardarCambiosToolBarVestimenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVestimenta=this.jButtonGuardarCambiosTablaToolBarVestimenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVestimenta=this.jMenuItemNuevoVestimenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=this.jMenuItemNuevoRelacionesVestimenta.isVisible();
			
			if(this.jInternalFrameDetalleFormVestimenta!=null) {
			this.isVisibilidadCeldaModificarVestimenta=this.jInternalFrameDetalleFormVestimenta.jMenuItemModificarVestimenta.isVisible();
			this.isVisibilidadCeldaActualizarVestimenta=this.jInternalFrameDetalleFormVestimenta.jMenuItemActualizarVestimenta.isVisible();
			this.isVisibilidadCeldaEliminarVestimenta=this.jInternalFrameDetalleFormVestimenta.jMenuItemEliminarVestimenta.isVisible();
			this.isVisibilidadCeldaCancelarVestimenta=this.jInternalFrameDetalleFormVestimenta.jMenuItemCancelarVestimenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVestimenta=this.jMenuItemGuardarCambiosVestimenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVestimenta=this.jMenuItemGuardarCambiosTablaVestimenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVestimenta(Boolean esInicializar) {
		if(VestimentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.vestimentaSessionBean.getConGuardarRelaciones()) {
				//if(this.vestimentaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVestimenta();
			}
			
			this.inicializarActualizarBindingBotonesManualVestimenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVestimenta() {
		this.jButtonNuevoVestimenta.setVisible(this.isPermisoNuevoVestimenta);			
		this.jButtonDuplicarVestimenta.setVisible(this.isPermisoDuplicarVestimenta);			
		this.jButtonCopiarVestimenta.setVisible(this.isPermisoCopiarVestimenta);			
		this.jButtonVerFormVestimenta.setVisible(this.isPermisoVerFormVestimenta);			
		
		this.jButtonAbrirOrderByVestimenta.setVisible(this.isPermisoOrdenVestimenta);					
		
		this.jButtonNuevoRelacionesVestimenta.setVisible(this.isPermisoNuevoVestimenta);			
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jButtonModificarVestimenta.setVisible(this.isPermisoActualizarVestimenta);	
			this.jInternalFrameDetalleFormVestimenta.jButtonActualizarVestimenta.setVisible(this.isPermisoActualizarVestimenta);	
			this.jInternalFrameDetalleFormVestimenta.jButtonEliminarVestimenta.setVisible(this.isPermisoEliminarVestimenta);
			this.jInternalFrameDetalleFormVestimenta.jButtonCancelarVestimenta.setVisible(this.isVisibilidadCeldaCancelarVestimenta);						
			this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosVestimenta.setVisible(this.isPermisoGuardarCambiosVestimenta);							
		}
		
		this.jButtonGuardarCambiosTablaVestimenta.setVisible(this.isPermisoActualizarVestimenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVestimenta() {
		this.jInternalFrameDetalleFormVestimenta.jButtonModificarVestimenta.setVisible(this.isPermisoActualizarVestimenta);	
		this.jInternalFrameDetalleFormVestimenta.jButtonActualizarVestimenta.setVisible(this.isPermisoActualizarVestimenta);	
		this.jInternalFrameDetalleFormVestimenta.jButtonEliminarVestimenta.setVisible(this.isPermisoEliminarVestimenta);
		this.jInternalFrameDetalleFormVestimenta.jButtonCancelarVestimenta.setVisible(this.isVisibilidadCeldaCancelarVestimenta);							
		this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosVestimenta.setVisible((this.isVisibilidadCeldaGuardarVestimenta && this.isPermisoGuardarCambiosVestimenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVestimenta() {
		if(VestimentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVestimenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVestimenta() {
	}
	
	public void jTableDatosVestimentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVestimenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVestimentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVestimenta(this.getvestimenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vestimenta==null) {
						this.vestimenta = new Vestimenta();
					}

					this.setVariablesFormularioToObjetoActualVestimenta(this.vestimenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
				}

				if(this.vestimenta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.vestimenta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVestimenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVestimentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVestimenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVestimenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVestimenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVestimenta(this.getvestimenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.vestimentaLogic.getConnexion());

				if(this.vestimenta.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.vestimenta.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVestimenta=(TitledBorder)this.jScrollPanelDatosVestimenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVestimenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVestimentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVestimenta(this.getvestimenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vestimenta==null) {
						this.vestimenta = new Vestimenta();
					}

					this.setVariablesFormularioToObjetoActualVestimenta(this.vestimenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
				}

				if(this.vestimenta.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.vestimenta.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVestimenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreVestimentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVestimenta(this.getvestimenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vestimenta==null) {
						this.vestimenta = new Vestimenta();
					}

					this.setVariablesFormularioToObjetoActualVestimenta(this.vestimenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);
				}

				if(this.vestimenta.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.vestimenta.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVestimenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaVestimentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVestimenta(false,false);

			this.getVestimentasFK_IdEmpresa();

			this.inicializarActualizarBindingVestimenta(false);

			//if(VestimentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVestimenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vestimentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVestimenta() {
		if(this.jInternalFrameDetalleFormVestimenta!=null) {
		

		if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) {
			this.jInternalFrameDetalleFormVestimenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormVestimenta.dispose();
			this.jInternalFrameDetalleFormVestimenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVestimenta!=null) {
			this.jInternalFrameReporteDinamicoVestimenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVestimenta.dispose();
			this.jInternalFrameReporteDinamicoVestimenta=null;
		}
		
		if(this.jInternalFrameImportacionVestimenta!=null) {
			this.jInternalFrameImportacionVestimenta.setVisible(false);	    			
			this.jInternalFrameImportacionVestimenta.dispose();
			this.jInternalFrameImportacionVestimenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVestimenta();
			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
			
			if(sTipo.equals("NuevoVestimenta")) {
				jButtonNuevoVestimentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVestimenta")) {
				jButtonDuplicarVestimentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVestimenta")) {
				jButtonCopiarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormVestimenta")) {
				jButtonVerFormVestimentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVestimenta")) {
				jButtonNuevoVestimentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVestimenta")) {
				jButtonDuplicarVestimentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVestimenta")) {
				jButtonNuevoVestimentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVestimenta")) {
				jButtonDuplicarVestimentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVestimenta")) {
				jButtonNuevoVestimentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVestimenta")) {
				jButtonNuevoVestimentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVestimenta")) {
				jButtonNuevoVestimentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVestimenta")) {
				jButtonModificarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVestimenta")) {
				jButtonModificarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVestimenta")) {
				jButtonModificarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVestimenta")) {
				jButtonActualizarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVestimenta")) {
				jButtonActualizarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVestimenta")) {
				jButtonActualizarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarVestimenta")) {
				jButtonEliminarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVestimenta")) {
				jButtonEliminarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVestimenta")) {
				jButtonEliminarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarVestimenta")) {
				jButtonCancelarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVestimenta")) {
				jButtonCancelarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVestimenta")) {
				jButtonCancelarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarVestimenta")) {
				jButtonCerrarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVestimenta")) {
				jButtonCerrarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVestimenta")) {
				jButtonCerrarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVestimenta")) {
				jButtonMostrarOcultarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVestimenta")) {
				jButtonCancelarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVestimenta")) {
				jButtonGuardarCambiosVestimentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVestimenta")) {
				jButtonGuardarCambiosVestimentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVestimenta")) {
				jButtonCopiarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVestimenta")) {
				jButtonVerFormVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVestimenta")) {
				jButtonGuardarCambiosVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVestimenta")) {
				jButtonCopiarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVestimenta")) {
				jButtonVerFormVestimentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVestimenta")) {
				jButtonGuardarCambiosVestimentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVestimenta")) {
				jButtonGuardarCambiosVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVestimenta")) {
				jButtonGuardarCambiosVestimentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVestimenta")) {
				jButtonRecargarInformacionVestimentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVestimenta")) {
				jButtonRecargarInformacionVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVestimenta")) {
				jButtonRecargarInformacionVestimentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVestimenta")) {
				jButtonAnterioresVestimentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVestimenta")) {
				jButtonAnterioresVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVestimenta")) {
				jButtonAnterioresVestimentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVestimenta")) {
				jButtonSiguientesVestimentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVestimenta")) {
				jButtonSiguientesVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVestimenta")) {
				jButtonSiguientesVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVestimenta") || sTipo.equals("MenuItemDetalleAbrirOrderByVestimenta")) {
				jButtonAbrirOrderByVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVestimenta") || sTipo.equals("MenuItemDetalleMostrarOcultarVestimenta")) {
				jButtonMostrarOcultarVestimentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVestimenta")) {
				jButtonNuevoGuardarCambiosVestimentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVestimenta")) {
				jButtonNuevoGuardarCambiosVestimentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVestimenta")) {
				jButtonNuevoGuardarCambiosVestimentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVestimenta")) {
				jButtonCerrarReporteDinamicoVestimentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVestimenta")) {
				jButtonGenerarReporteDinamicoVestimentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVestimenta")) {
				
				jButtonGenerarExcelReporteDinamicoVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVestimenta")) {
				jButtonCerrarImportacionVestimentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVestimenta")) {
				
				jButtonGenerarImportacionVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVestimenta")) {
				
				jButtonAbrirImportacionVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVestimenta")) {
				jComboBoxTiposAccionesVestimentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVestimenta")) {
				jComboBoxTiposRelacionesVestimentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVestimenta")) {
				jComboBoxTiposAccionesVestimentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVestimenta")) {
				
				jComboBoxTiposSeleccionarVestimentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVestimenta")) {
				jTextFieldValorCampoGeneralVestimentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVestimenta")) {
				jButtonAbrirOrderByVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVestimenta")) {
				jButtonAbrirOrderByVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVestimenta")) {
				jButtonCerrarOrderByVestimentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVestimentaBusqueda")) {
				this.jButtonidVestimentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVestimentaUpdate")) {
				this.jButtonid_empresaVestimentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVestimentaBusqueda")) {
				this.jButtonid_empresaVestimentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreVestimentaBusqueda")) {
				this.jButtonnombreVestimentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVestimenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVestimentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				


				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Vestimenta vestimentaLocal=null;
			
			if(!this.getEsControlTabla()) {
				vestimentaLocal=this.vestimenta;
			} else {
				vestimentaLocal=this.vestimentaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
							
				
				


				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVestimentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaAnterior =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vestimentaAnterior =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
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
			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
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
			
			


			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVestimentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
								
						
				


				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
								
				
				


				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVestimentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaAnterior =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vestimentaAnterior =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVestimentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaAnterior =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vestimentaAnterior =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVestimentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
							
				
				


				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVestimentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vestimentaAnterior =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vestimentaAnterior =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
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
			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
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
			
			


			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVestimentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
								
				
				


				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVestimentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaAnterior =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vestimentaAnterior =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVestimentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVestimentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVestimenta")) {
					jCheckBoxSeleccionarTodosVestimentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVestimenta")) {
					jCheckBoxSeleccionadosVestimentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVestimenta")) {
					
				}
				
				


				
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
												
				
				


				
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVestimentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vestimentaAnterior =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vestimentaAnterior =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVestimentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
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
			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
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
			
			


			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVestimentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vestimenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vestimenta);
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
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
				
				


				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vestimenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vestimenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVestimentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vestimentaAnterior =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vestimentaAnterior =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVestimenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVestimentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVestimenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.vestimenta =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.vestimenta =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.vestimenta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVestimenta")) {
				
				}
				
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVestimenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVestimenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVestimenta")) {
			
			}
			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVestimenta();
			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
			if(sTipo.equals("NuevoVestimenta")) {
				jButtonNuevoVestimentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVestimenta")) {
				jButtonDuplicarVestimentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVestimenta")) {
				jButtonCopiarVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVestimenta")) {
				jButtonVerFormVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVestimenta")) {
				jButtonNuevoVestimentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVestimenta")) {
				jButtonModificarVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVestimenta")) {
				jButtonActualizarVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVestimenta")) {
				jButtonEliminarVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVestimenta")) {
				jButtonGuardarCambiosVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVestimenta")) {
				jButtonCancelarVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVestimenta")) {
				jButtonCerrarVestimentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVestimenta")) {
				jButtonGuardarCambiosVestimentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVestimenta")) {
				jButtonNuevoGuardarCambiosVestimentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVestimenta")) {
				jButtonAbrirOrderByVestimentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVestimenta")) {
				jButtonRecargarInformacionVestimentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVestimenta")) {
				jButtonAnterioresVestimentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVestimenta")) {
				jButtonSiguientesVestimentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVestimentaBusqueda")) {
				this.jButtonidVestimentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVestimentaUpdate")) {
				this.jButtonid_empresaVestimentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVestimentaBusqueda")) {
				this.jButtonid_empresaVestimentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreVestimentaBusqueda")) {
				this.jButtonnombreVestimentaBusquedaActionPerformed(evt);
			}
			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVestimenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVestimenta")) {
				closingInternalFrameVestimenta();
				
			} else if(sTipo.equals("jButtonCancelarVestimenta")) {
				JInternalFrameBase jInternalFrameDetalleFormVestimenta = (JInternalFrameBase)evt.getSource();
	            	
	            VestimentaBeanSwingJInternalFrame jInternalFrameParent=(VestimentaBeanSwingJInternalFrame)jInternalFrameDetalleFormVestimenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVestimentaActionPerformed(null);
			}
			
			VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vestimenta,new Object(),this.vestimentaParameterGeneral,this.vestimentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVestimenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVestimenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVestimenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.vestimenta)) {
			if(!esControlTabla) {
				if(VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVestimenta(this.vestimenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);			
				}
				
				if(this.vestimentaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVestimenta(this.vestimenta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vestimentaReturnGeneral=vestimentaLogic.procesarEventosVestimentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vestimentaLogic.getVestimentas(),this.vestimenta,this.vestimentaParameterGeneral,this.isEsNuevoVestimenta,classes);//this.vestimentaLogic.getVestimenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVestimenta(this.vestimentaReturnGeneral,this.vestimentaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.vestimentaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVestimenta(classes,this.vestimentaReturnGeneral,this.vestimentaBean,false);
					}
						
					if(this.vestimentaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVestimenta(this.vestimentaReturnGeneral.getVestimenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVestimenta(this.vestimentaReturnGeneral.getVestimenta());	
					}
						
					if(this.vestimentaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVestimenta(this.vestimentaReturnGeneral.getVestimenta(),classes);//this.vestimentaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVestimenta(this.vestimenta,classes);//this.vestimentaBean);									
				}
			
				if(VestimentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVestimenta(this.vestimenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVestimenta(this.vestimenta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.vestimentaAnterior!=null) {
						this.vestimenta=this.vestimentaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vestimentaReturnGeneral=vestimentaLogic.procesarEventosVestimentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vestimentaLogic.getVestimentas(),this.vestimenta,this.vestimentaParameterGeneral,this.isEsNuevoVestimenta,classes);//this.vestimentaLogic.getVestimenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vestimentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vestimentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.vestimentaReturnGeneral.getVestimenta(),vestimentaLogic.getVestimentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.vestimentaReturnGeneral.getVestimenta(),this.vestimentas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVestimenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosVestimenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVestimenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosVestimenta() throws Exception {
		
		VestimentaModel vestimentaModel=(VestimentaModel)this.jTableDatosVestimenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vestimentaModel.vestimentas=this.vestimentaLogic.getVestimentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			vestimentaModel.vestimentas=this.vestimentas;
		}
		
		
		((VestimentaModel) this.jTableDatosVestimenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVestimenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvestimentaAnterior(),this.vestimentaLogic.getVestimentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvestimentaAnterior(),this.vestimentas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVestimenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVestimenta(Vestimenta vestimenta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TallaVestido.class)) {
					this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.setTallaVestidos(vestimenta.getTallaVestidos());
					this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTallaVestido(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
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
										
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vestimenta,new Object(),generalEntityParameterGeneral,this.vestimentaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.vestimentaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VestimentaConstantesFunciones.getClassesRelationshipsOfVestimenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VestimentaConstantesFunciones.getClassesRelationshipsFromStringsOfVestimenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVestimenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VestimentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vestimenta,new Object(),generalEntityParameterGeneral,this.vestimentaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVestimenta(VestimentaBean vestimentaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TallaVestido.class)) {
					this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.setTallaVestidos(vestimenta.getTallaVestidos());
					this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTallaVestido(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVestimenta(ArrayList<Classe> classes,VestimentaReturnGeneral vestimentaReturnGeneral,VestimentaBean vestimentaBean,Boolean conDefault) throws Exception {
		
			this.vestimentaBean.setTallaVestidos(vestimentaReturnGeneral.getVestimenta().getTallaVestidos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVestimenta(Vestimenta vestimenta,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TallaVestido.class)) {
					vestimenta.setTallaVestidos(this.jInternalFrameDetalleFormVestimenta.tallavestidoBeanSwingJInternalFrame.tallavestidoLogic.getTallaVestidos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.vestimenta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVestimenta = new VestimentaDetalleFormJInternalFrame(jDesktopPane,this.vestimentaSessionBean.getConGuardarRelaciones(),this.vestimentaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVestimenta);
		this.jInternalFrameDetalleFormVestimenta.setVisible(false);
		this.jInternalFrameDetalleFormVestimenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormVestimenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVestimenta.vestimentaLogic=this.vestimentaLogic;
		
		this.cargarCombosFrameForeignKeyVestimenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVestimenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVestimenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVestimenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVestimenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVestimenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVestimenta"));
		
		this.jInternalFrameDetalleFormVestimenta.jButtonModificarVestimenta.addActionListener(new ButtonActionListener(this,"ModificarVestimenta"));

		
		this.jInternalFrameDetalleFormVestimenta.jButtonModificarToolBarVestimenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarVestimenta"));
					
		this.jInternalFrameDetalleFormVestimenta.jMenuItemModificarVestimenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarVestimenta"));		
		
		
		
		this.jInternalFrameDetalleFormVestimenta.jButtonActualizarVestimenta.addActionListener (new ButtonActionListener(this,"ActualizarVestimenta"));
		
		
		this.jInternalFrameDetalleFormVestimenta.jButtonActualizarToolBarVestimenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVestimenta"));
						
		this.jInternalFrameDetalleFormVestimenta.jMenuItemActualizarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVestimenta"));		
		
		
		
		this.jInternalFrameDetalleFormVestimenta.jButtonEliminarVestimenta.addActionListener (new ButtonActionListener(this,"EliminarVestimenta"));
		
		
		this.jInternalFrameDetalleFormVestimenta.jButtonEliminarToolBarVestimenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarVestimenta"));
								
		this.jInternalFrameDetalleFormVestimenta.jMenuItemEliminarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVestimenta"));		
		
		
		
		this.jInternalFrameDetalleFormVestimenta.jButtonCancelarVestimenta.addActionListener (new ButtonActionListener(this,"CancelarVestimenta"));
		
		
		this.jInternalFrameDetalleFormVestimenta.jButtonCancelarToolBarVestimenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarVestimenta"));
					
		this.jInternalFrameDetalleFormVestimenta.jMenuItemCancelarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVestimenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVestimenta.jMenuItemDetalleCerrarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVestimenta"));		
		
		
		
		this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosToolBarVestimenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVestimenta"));
		
		
		
		this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosToolBarVestimenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVestimenta"));
		
		
		
		this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVestimenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVestimenta.jButtonidVestimentaBusqueda.addActionListener(new ButtonActionListener(this,"idVestimentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVestimenta.jButtonid_empresaVestimentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVestimentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVestimenta.jButtonid_empresaVestimentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVestimentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVestimenta.jButtonnombreVestimentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreVestimentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVestimenta.jTabbedPaneRelacionesVestimenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVestimenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVestimenta"));
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVestimenta"));
		}
		
		this.jTableDatosVestimenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVestimenta"));
		
		this.jTableDatosVestimenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVestimenta"));
		
		this.jButtonNuevoVestimenta.addActionListener(new ButtonActionListener(this,"NuevoVestimenta"));
		
		this.jButtonDuplicarVestimenta.addActionListener(new ButtonActionListener(this,"DuplicarVestimenta"));
		
		this.jButtonCopiarVestimenta.addActionListener(new ButtonActionListener(this,"CopiarVestimenta"));
		
		this.jButtonVerFormVestimenta.addActionListener(new ButtonActionListener(this,"VerFormVestimenta"));
		
		
		this.jButtonNuevoToolBarVestimenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarVestimenta"));
			
		this.jButtonDuplicarToolBarVestimenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVestimenta"));
			
		this.jMenuItemNuevoVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVestimenta"));
			
		this.jMenuItemDuplicarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVestimenta"));		
		
		
		this.jButtonNuevoRelacionesVestimenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVestimenta"));
		
		
		this.jButtonNuevoRelacionesToolBarVestimenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVestimenta"));
			
		this.jMenuItemNuevoRelacionesVestimenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVestimenta"));		
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jButtonModificarVestimenta.addActionListener(new ButtonActionListener(this,"ModificarVestimenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jButtonModificarToolBarVestimenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarVestimenta"));
			
			this.jInternalFrameDetalleFormVestimenta.jMenuItemModificarVestimenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarVestimenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVestimenta.jButtonActualizarVestimenta.addActionListener (new ButtonActionListener(this,"ActualizarVestimenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jButtonActualizarToolBarVestimenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVestimenta"));
				
			this.jInternalFrameDetalleFormVestimenta.jMenuItemActualizarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVestimenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jButtonEliminarVestimenta.addActionListener (new ButtonActionListener(this,"EliminarVestimenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jButtonEliminarToolBarVestimenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarVestimenta"));
						
			this.jInternalFrameDetalleFormVestimenta.jMenuItemEliminarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVestimenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jButtonCancelarVestimenta.addActionListener (new ButtonActionListener(this,"CancelarVestimenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jButtonCancelarToolBarVestimenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarVestimenta"));
			
			this.jInternalFrameDetalleFormVestimenta.jMenuItemCancelarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVestimenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVestimenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVestimenta"));		
		
		
		this.jButtonCerrarVestimenta.addActionListener (new ButtonActionListener(this,"CerrarVestimenta"));
		
		
		this.jButtonCerrarToolBarVestimenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarVestimenta"));
			
		this.jMenuItemCerrarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVestimenta"));
			
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jMenuItemDetalleCerrarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVestimenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosVestimenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosVestimenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosToolBarVestimenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVestimenta"));
		}
		
		this.jButtonCopiarToolBarVestimenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarVestimenta"));
			
		this.jButtonVerFormToolBarVestimenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarVestimenta"));
		
		this.jMenuItemGuardarCambiosVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVestimenta"));
			
		this.jMenuItemCopiarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVestimenta"));		
		
		this.jMenuItemVerFormVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVestimenta"));		
		
		
		this.jButtonGuardarCambiosTablaVestimenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVestimenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVestimenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVestimenta"));
			
		this.jMenuItemGuardarCambiosTablaVestimenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVestimenta"));		
		
		
		
		this.jButtonRecargarInformacionVestimenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionVestimenta"));
					
		this.jButtonRecargarInformacionToolBarVestimenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVestimenta"));
		
		this.jMenuItemRecargarInformacionVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVestimenta"));		
		
		
		
		this.jButtonAnterioresVestimenta.addActionListener (new ButtonActionListener(this,"AnterioresVestimenta"));
		
		
		this.jButtonAnterioresToolBarVestimenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVestimenta"));
		
		this.jMenuItemAnterioresVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVestimenta"));		
		
		
		this.jButtonSiguientesVestimenta.addActionListener (new ButtonActionListener(this,"SiguientesVestimenta"));
		
		
		this.jButtonSiguientesToolBarVestimenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVestimenta"));
			
		this.jMenuItemSiguientesVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVestimenta"));
			
		this.jMenuItemAbrirOrderByVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVestimenta"));
			
		this.jMenuItemMostrarOcultarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVestimenta"));
			
		this.jMenuItemDetalleAbrirOrderByVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVestimenta"));
			
		this.jMenuItemDetalleMostarOcultarVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVestimenta"));		
		
		
		this.jButtonNuevoGuardarCambiosVestimenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVestimenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVestimenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVestimenta"));
			
		this.jMenuItemNuevoGuardarCambiosVestimenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVestimenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVestimenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVestimenta"));

		this.jCheckBoxSeleccionadosVestimenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVestimenta"));
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVestimenta"));
		}
		
		
		this.jComboBoxTiposRelacionesVestimenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesVestimenta"));
			
		this.jComboBoxTiposAccionesVestimenta.addActionListener (new ButtonActionListener(this,"TiposAccionesVestimenta"));
					
		this.jComboBoxTiposSeleccionarVestimenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVestimenta"));
			
		this.jTextFieldValorCampoGeneralVestimenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVestimenta"));		
		
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVestimenta.jButtonidVestimentaBusqueda.addActionListener(new ButtonActionListener(this,"idVestimentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVestimenta.jButtonid_empresaVestimentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVestimentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVestimenta.jButtonid_empresaVestimentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVestimentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVestimenta.jButtonnombreVestimentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreVestimentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVestimenta!=null) {
				this.jInternalFrameReporteDinamicoVestimenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVestimenta"));
				this.jInternalFrameReporteDinamicoVestimenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVestimenta"));
				this.jInternalFrameReporteDinamicoVestimenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVestimenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoVestimenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVestimenta"));				
			//this.jButtonGenerarReporteDinamicoVestimenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVestimenta"));
			//this.jButtonGenerarExcelReporteDinamicoVestimenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVestimenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVestimenta!=null) {
				this.jInternalFrameImportacionVestimenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVestimenta"));
				this.jInternalFrameImportacionVestimenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVestimenta"));
				this.jInternalFrameImportacionVestimenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVestimenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVestimenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByVestimenta"));
			
			this.jButtonAbrirOrderByToolBarVestimenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVestimenta"));			
			
			if(this.jInternalFrameOrderByVestimenta!=null) {
				this.jInternalFrameOrderByVestimenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVestimenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVestimenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVestimenta.jTabbedPaneRelacionesVestimenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVestimenta"));
		
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
            		closingInternalFrameVestimenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVestimenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVestimenta = (JInternalFrameBase)event.getSource();
	            	
	            VestimentaBeanSwingJInternalFrame jInternalFrameParent=(VestimentaBeanSwingJInternalFrame)jInternalFrameDetalleFormVestimenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVestimentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVestimenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVestimentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVestimenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVestimenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVestimentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVestimentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVestimentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVestimenta";
		inputMap = this.jButtonNuevoVestimenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVestimenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVestimentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVestimentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVestimentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVestimentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVestimenta";
		inputMap = this.jButtonNuevoRelacionesVestimenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVestimenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVestimentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVestimenta";
		inputMap = this.jButtonModificarVestimenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVestimenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVestimentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVestimenta";
		inputMap = this.jButtonActualizarVestimenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVestimenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVestimentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVestimenta";
		inputMap = this.jButtonEliminarVestimenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVestimenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVestimentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVestimenta";
		inputMap = this.jButtonCancelarVestimenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVestimenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVestimentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVestimenta";
		inputMap = this.jButtonCerrarVestimenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVestimenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVestimentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVestimenta";
		inputMap = this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosVestimenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVestimenta.jButtonGuardarCambiosVestimenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVestimentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVestimenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVestimentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVestimenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVestimentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVestimenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVestimentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVestimenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVestimentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVestimenta.jButtonidVestimentaBusqueda.addActionListener(new ButtonActionListener(this,"idVestimentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVestimenta.jButtonid_empresaVestimentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVestimentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVestimenta.jButtonid_empresaVestimentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVestimentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVestimenta.jButtonnombreVestimentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreVestimentaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVestimenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVestimentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVestimentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVestimenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVestimenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Vestimenta vestimentaAux:this.vestimentaLogic.getVestimentas()) {
					vestimentaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Vestimenta vestimentaAux:vestimentas) {
					vestimentaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVestimentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVestimenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Vestimenta vestimentaAux:this.vestimentaLogic.getVestimentas()) {
						vestimentaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Vestimenta vestimentaAux:vestimentas) {
						vestimentaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Vestimenta vestimentaAux:this.vestimentaLogic.getVestimentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Vestimenta vestimentaAux:vestimentas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVestimenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVestimenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVestimenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVestimenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVestimentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVestimenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVestimenta.getSelectedRows();
			
			Vestimenta vestimentaLocal=new Vestimenta();
			
			//this.seleccionarTodosVestimenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vestimentaLocal =(Vestimenta) this.vestimentaLogic.getVestimentas().toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					vestimentaLocal =(Vestimenta) this.vestimentas.toArray()[this.jTableDatosVestimenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				vestimentaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Vestimenta vestimentaAux:this.vestimentaLogic.getVestimentas()) {
						vestimentaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Vestimenta vestimentaAux:vestimentas) {
						vestimentaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVestimenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVestimenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVestimenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVestimenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVestimentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVestimentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVestimentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVestimenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVestimenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Vestimenta vestimentaAux:this.vestimentaLogic.getVestimentas()) {
				
						if(sTipoSeleccionar.equals(VestimentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							vestimentaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Vestimenta vestimentaAux:vestimentas) {
					
						if(sTipoSeleccionar.equals(VestimentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							vestimentaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVestimenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVestimentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVestimenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVestimenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVestimenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVestimenta) {				
					conSplash=true;//false;										
					
					//this.startProcessVestimenta(conSplash);
				
					this.generarReporteVestimentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVestimentasSeleccionados();
				//this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVestimentasSeleccionados(false);
				//this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVestimentasSeleccionados(true);
				//this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVestimenta();
				
				this.exportarVestimentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVestimentas();
				//this.importarVestimentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVestimenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVestimentasSeleccionados();
				//this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Vestimenta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVestimenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVestimenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVestimenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Vestimenta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.setSelectedIndex(0);					
				}	
			} 			
			else if(VestimentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVestimenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVestimenta(conSplash);
					
						//this.actualizarParametrosGeneralVestimenta();
						
						this.generarReporteProcesoAccionVestimentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VestimentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO VestimentaS SELECCIONADOS?", "MANTENIMIENTO DE Vestimenta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVestimenta();
				
						this.actualizarParametrosGeneralVestimenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.vestimentaReturnGeneral=vestimentaLogic.procesarAccionVestimentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.vestimentaLogic.getVestimentas(),this.vestimentaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVestimentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVestimenta();
					
					VestimentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVestimentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVestimenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVestimenta.jComboBoxTiposAccionesFormularioVestimenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVestimenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVestimentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVestimenta();
			
			if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();		
			Vestimenta vestimenta=new Vestimenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVestimenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVestimenta.getSelectedItem();
			
			
			
			
			vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(vestimentasSeleccionados.size()==1) {
				for(Vestimenta vestimentaAux:vestimentasSeleccionados) {
					vestimenta=vestimentaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Talla Vestido")) {
					jButtonTallaVestidoActionPerformed(null,rowIndex,true,false,vestimenta);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVestimenta();
			
      		//this.finishProcessVestimenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVestimentaReturnGeneral() throws Exception {
		if(this.vestimentaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.vestimentaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.vestimentaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.vestimentaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.vestimentaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.vestimentaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVestimenta(false);
		}
		
		if(this.vestimentaReturnGeneral.getConRetornoLista() || this.vestimentaReturnGeneral.getConRetornoObjeto()) {
			if(this.vestimentaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vestimentaLogic.setVestimentas(this.vestimentaReturnGeneral.getVestimentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.vestimentaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vestimentaLogic.setVestimenta(this.vestimentaReturnGeneral.getVestimenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingVestimenta(false);
		}
	}
	
	public void actualizarParametrosGeneralVestimenta() throws Exception {
		
		
	}
	
	public ArrayList<Vestimenta> getVestimentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVestimenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Vestimenta vestimentaAux:vestimentaLogic.getVestimentas()) {
					if(vestimentaAux.getIsSelected()) {
						vestimentasSeleccionados.add(vestimentaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Vestimenta vestimentaAux:this.vestimentas) {
					if(vestimentaAux.getIsSelected()) {
						vestimentasSeleccionados.add(vestimentaAux);				
					}
				}
			}
			
			if(vestimentasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						vestimentasSeleccionados.addAll(this.vestimentaLogic.getVestimentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						vestimentasSeleccionados.addAll(this.vestimentas);				
					}
				}
			}
		} else {
			vestimentasSeleccionados.add(this.vestimenta);
		}
		
		return vestimentasSeleccionados;
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
	
	public void generarReporteVestimentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVestimentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVestimentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVestimentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVestimentasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesVestimentasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Vestimenta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVestimentasSeleccionados() throws Exception {
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();		
		
		vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVestimentas("Todos",vestimentasSeleccionados);
		
	}	
	
	public void generarReporteNormalVestimentasSeleccionados() throws Exception {
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();		
		
		vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVestimentas("Todos",vestimentasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVestimentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();
		
		vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVestimentas("Todos",vestimentasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVestimentasSeleccionados() throws Exception {
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVestimenta();
		
		
		vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVestimenta();
		
		
		//this.generarReporteVestimentas("Todos",vestimentasSeleccionados ,vestimentaImplementable,vestimentaImplementableHome);
	}
	
	public void mostrarImportacionVestimentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVestimenta();
		
		this.abrirFrameImportacionVestimenta();		
		
			
		//this.generarReporteVestimentas("Todos",vestimentasSeleccionados ,vestimentaImplementable,vestimentaImplementableHome);
	}
	
	public void importarVestimentas() throws Exception {		
	
	}
	
	public void exportarVestimentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVestimentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVestimentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVestimentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Vestimenta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVestimentasSeleccionados() throws Exception {
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();		
		
		vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vestimenta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVestimenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Vestimenta vestimentaAux:vestimentasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVestimenta(vestimentaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//vestimentaAux.setsDetalleGeneralEntityReporte(vestimentaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vestimenta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVestimenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VestimentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VestimentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VestimentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VestimentaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVestimenta(Vestimenta vestimenta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=vestimenta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=vestimenta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=vestimenta.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vestimenta.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVestimentasSeleccionados() throws Exception {
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();		
		
		vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vestimenta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Vestimentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVestimenta(row);				
				iRow++;
			}				
			
			for(Vestimenta vestimentaAux:vestimentasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVestimenta(vestimentaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vestimenta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVestimentasSeleccionados() throws Exception {
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();		
		
		vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vestimenta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("vestimentas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("vestimenta");
			//elementRoot.appendChild(element);
		
			for(Vestimenta vestimentaAux:vestimentasSeleccionados) {
				element = document.createElement("vestimenta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVestimenta(vestimentaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vestimenta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVestimenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VestimentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VestimentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VestimentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VestimentaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVestimenta(Vestimenta vestimenta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(vestimenta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(vestimenta.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vestimenta.getnombre());				
	}
	
	public void setFilaDatosExportarXmlVestimenta(Vestimenta vestimenta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VestimentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(vestimenta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VestimentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(vestimenta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VestimentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(vestimenta.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(VestimentaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(vestimenta.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoVestimentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Vestimenta> vestimentasSeleccionados=new ArrayList<Vestimenta>();
		
		vestimentasSeleccionados=this.getVestimentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVestimenta(vestimentasSeleccionados);
		
		this.generarReporteVestimentas("Todos",vestimentasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVestimenta(ArrayList<Vestimenta> vestimentasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Vestimenta vestimentaAux:vestimentasSeleccionados) {
				vestimentaAux.setsDetalleGeneralEntityReporte(vestimentaAux.toString());
			
				if(sTipoSeleccionar.equals(VestimentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					vestimentaAux.setsDescripcionGeneralEntityReporte1(vestimentaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VestimentaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					vestimentaAux.setsDescripcionGeneralEntityReporte1(vestimentaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VestimentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVestimenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVestimenta=true;
				this.isVisibilidadCeldaNuevoRelacionesVestimenta=true;
				this.isVisibilidadCeldaGuardarCambiosVestimenta=true;
			}
			
			this.isVisibilidadCeldaModificarVestimenta=false;
			this.isVisibilidadCeldaActualizarVestimenta=false;
			this.isVisibilidadCeldaEliminarVestimenta=false;
			this.isVisibilidadCeldaCancelarVestimenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVestimenta=true;
				} else {
					this.isVisibilidadCeldaGuardarVestimenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVestimenta=false;
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=false;
			this.isVisibilidadCeldaGuardarCambiosVestimenta=false;
			this.isVisibilidadCeldaModificarVestimenta=false;
			this.isVisibilidadCeldaActualizarVestimenta=true;
			this.isVisibilidadCeldaEliminarVestimenta=false;
			this.isVisibilidadCeldaCancelarVestimenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVestimenta=true;
				} else {
					this.isVisibilidadCeldaGuardarVestimenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVestimenta=false;
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=false;
			this.isVisibilidadCeldaGuardarCambiosVestimenta=false;
			this.isVisibilidadCeldaModificarVestimenta=false;
			this.isVisibilidadCeldaActualizarVestimenta=true;
			this.isVisibilidadCeldaEliminarVestimenta=true;
			this.isVisibilidadCeldaCancelarVestimenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVestimenta=true;
				} else {
					this.isVisibilidadCeldaGuardarVestimenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVestimenta=false;
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=false;
			this.isVisibilidadCeldaGuardarCambiosVestimenta=false;
			this.isVisibilidadCeldaModificarVestimenta=false;
			this.isVisibilidadCeldaActualizarVestimenta=true;
			this.isVisibilidadCeldaEliminarVestimenta=false;
			this.isVisibilidadCeldaCancelarVestimenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVestimenta=false;
				} else {
					this.isVisibilidadCeldaGuardarVestimenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVestimenta=true;
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=true;
			this.isVisibilidadCeldaGuardarCambiosVestimenta=true;
			this.isVisibilidadCeldaModificarVestimenta=false;
			this.isVisibilidadCeldaActualizarVestimenta=false;
			this.isVisibilidadCeldaEliminarVestimenta=false;
			this.isVisibilidadCeldaCancelarVestimenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVestimenta=true;
				} else {
					this.isVisibilidadCeldaGuardarVestimenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVestimenta=false;
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=false;
			this.isVisibilidadCeldaGuardarCambiosVestimenta=false;
			this.isVisibilidadCeldaActualizarVestimenta=false;
			this.isVisibilidadCeldaEliminarVestimenta=false;
			this.isVisibilidadCeldaCancelarVestimenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVestimenta=false;
				} else {
					this.isVisibilidadCeldaGuardarVestimenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVestimenta=false;
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=false;
			this.isVisibilidadCeldaGuardarCambiosVestimenta=false;
			this.isVisibilidadCeldaModificarVestimenta=true;
			this.isVisibilidadCeldaActualizarVestimenta=false;
			this.isVisibilidadCeldaEliminarVestimenta=false;
			this.isVisibilidadCeldaCancelarVestimenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVestimenta=false;
				} else {
					this.isVisibilidadCeldaGuardarVestimenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VestimentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVestimenta=true;
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=true;
			this.isVisibilidadCeldaGuardarCambiosVestimenta=true;
		} else {
			this.actualizarEstadoPanelsVestimenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVestimenta=false;
			//this.isVisibilidadCeldaVerFormVestimenta=false;
			this.isVisibilidadCeldaDuplicarVestimenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!vestimentaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=false;
		} else {
			this.isVisibilidadCeldaNuevoVestimenta=false;
			this.isVisibilidadCeldaGuardarCambiosVestimenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(vestimentaSessionBean.getEsGuardarRelacionado()) {
			if(!vestimentaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVestimenta=false;												
			}
			
			this.jButtonCerrarVestimenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVestimenta=false;
		}
		
		if(!this.permiteMantenimiento(this.vestimenta)) {
			this.isVisibilidadCeldaActualizarVestimenta=false;
			this.isVisibilidadCeldaEliminarVestimenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVestimenta() {
		this.isVisibilidadCeldaNuevoVestimenta=false;
		this.isVisibilidadCeldaGuardarCambiosVestimenta=false;
	}
	
	public void actualizarEstadoPanelsVestimenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVestimenta!=null) {
				this.jScrollPanelDatosEdicionVestimenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVestimenta!=null) {
				this.jTabbedPaneBusquedasVestimenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVestimenta!=null) {
				this.jScrollPanelDatosVestimenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionVestimenta!=null) {
				this.jPanelPaginacionVestimenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVestimenta!=null) {
				this.jPanelParametrosReportesVestimenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVestimenta!=null) {
				this.jScrollPanelDatosEdicionVestimenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVestimenta!=null) {
				this.jTabbedPaneBusquedasVestimenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVestimenta!=null) {
				this.jScrollPanelDatosVestimenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionVestimenta!=null) {
				this.jPanelPaginacionVestimenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVestimenta!=null) {
				this.jPanelParametrosReportesVestimenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVestimenta!=null) {
				this.jScrollPanelDatosEdicionVestimenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVestimenta!=null) {
				this.jTabbedPaneBusquedasVestimenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVestimenta!=null) {
				this.jScrollPanelDatosVestimenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionVestimenta!=null) {
				this.jPanelPaginacionVestimenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVestimenta!=null) {
				this.jPanelParametrosReportesVestimenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVestimenta!=null) {
				this.jScrollPanelDatosEdicionVestimenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVestimenta!=null) {
				this.jTabbedPaneBusquedasVestimenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVestimenta!=null) {
				this.jScrollPanelDatosVestimenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionVestimenta!=null) {
				this.jPanelPaginacionVestimenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVestimenta!=null) {
				this.jPanelParametrosReportesVestimenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVestimenta!=null) {
				this.jScrollPanelDatosEdicionVestimenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVestimenta!=null) {
				this.jTabbedPaneBusquedasVestimenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVestimenta!=null) {
				this.jScrollPanelDatosVestimenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionVestimenta!=null) {
				this.jPanelPaginacionVestimenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVestimenta!=null) {
				this.jPanelParametrosReportesVestimenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVestimenta!=null) {
				this.jScrollPanelDatosEdicionVestimenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVestimenta!=null) {
				this.jTabbedPaneBusquedasVestimenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVestimenta!=null) {
				this.jScrollPanelDatosVestimenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionVestimenta!=null) {
				this.jPanelPaginacionVestimenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVestimenta!=null) {
				this.jPanelParametrosReportesVestimenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVestimenta!=null) {
				this.jScrollPanelDatosEdicionVestimenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVestimenta!=null) {
				this.jTabbedPaneBusquedasVestimenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVestimenta!=null) {
				this.jScrollPanelDatosVestimenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionVestimenta!=null) {
				this.jPanelPaginacionVestimenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVestimenta!=null) {
				this.jPanelParametrosReportesVestimenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.vestimentaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVestimenta!=null) {
					this.jTabbedPaneBusquedasVestimenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVestimenta!=null) {
				this.jPanelParametrosReportesVestimenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVestimenta!=null) {
				this.jTabbedPaneBusquedasVestimenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVestimenta!=null) {
				this.jPanelParametrosReportesVestimenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionVestimentaParaTallaVestidos() throws Exception {
		Boolean isPaginaPopupTallaVestido=false;

		try {

			if(this.vestimentaSessionBean==null) {
				this.vestimentaSessionBean=new VestimentaSessionBean();
			}

			if(this.jInternalFrameDetalleFormVestimenta.tallavestidoSessionBean==null) {
				this.jInternalFrameDetalleFormVestimenta.tallavestidoSessionBean=new TallaVestidoSessionBean();
			}

			this.jInternalFrameDetalleFormVestimenta.tallavestidoSessionBean.setsPathNavegacionActual(vestimentaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormVestimenta.tallavestidoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTallaVestido=this.jInternalFrameDetalleFormVestimenta.tallavestidoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormVestimenta.tallavestidoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTallaVestido(true);
			this.jInternalFrameDetalleFormVestimenta.tallavestidoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTallaVestido(VestimentaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormVestimenta.tallavestidoSessionBean.setisBusquedaDesdeForeignKeySesionVestimenta(true);
			this.jInternalFrameDetalleFormVestimenta.tallavestidoSessionBean.setlidVestimentaActual(this.idVestimentaActual);

			vestimentaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyVestimenta(true);
			vestimentaSessionBean.setlIdVestimentaActualForeignKey(this.idVestimentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VestimentaSessionBean vestimentaSessionBean=new VestimentaSessionBean();
		
		if(this.vestimentaSessionBean==null) {
			this.vestimentaSessionBean=new VestimentaSessionBean();
		}
		
		this.vestimentaSessionBean.setsUltimaBusquedaVestimenta(this.getsAccionBusqueda());
		this.vestimentaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.vestimentaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			vestimentaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VestimentaSessionBean vestimentaSessionBean=new VestimentaSessionBean();
		
		if(this.vestimentaSessionBean==null) {
			this.vestimentaSessionBean=new VestimentaSessionBean();
		}
		
		if(this.vestimentaSessionBean.getsUltimaBusquedaVestimenta()!=null&&!this.vestimentaSessionBean.getsUltimaBusquedaVestimenta().equals("")) {
			this.setsAccionBusqueda(vestimentaSessionBean.getsUltimaBusquedaVestimenta());
			this.setiNumeroPaginacion(vestimentaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(vestimentaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(vestimentaSessionBean.getid_empresa());
				vestimentaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.vestimentaSessionBean.setsUltimaBusquedaVestimenta("");
		this.vestimentaSessionBean.setiNumeroPaginacion(VestimentaConstantesFunciones.INUMEROPAGINACION);
		this.vestimentaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaVestimenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVestimenta() {
		this.updateBorderResaltarBusquedasFormularioVestimenta();
		this.updateVisibilidadBusquedasFormularioVestimenta();
		this.updateHabilitarBusquedasFormularioVestimenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioVestimenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVestimenta.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVestimenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVestimenta.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVestimenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVestimenta.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVestimenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarVestimenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVestimenta() throws Exception {

		if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVestimenta();
		this.updateVisibilidadResaltarControlesFormularioVestimenta();
		this.updateHabilitarResaltarControlesFormularioVestimenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioVestimenta() throws Exception {
		if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.vestimentaConstantesFunciones.resaltaridVestimenta!=null && this.jInternalFrameDetalleFormVestimenta!=null) {this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.setBorder(this.vestimentaConstantesFunciones.resaltaridVestimenta);}
		if(this.vestimentaConstantesFunciones.resaltarid_empresaVestimenta!=null && this.jInternalFrameDetalleFormVestimenta!=null) {this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.setBorder(this.vestimentaConstantesFunciones.resaltarid_empresaVestimenta);}
		if(this.vestimentaConstantesFunciones.resaltarnombreVestimenta!=null && this.jInternalFrameDetalleFormVestimenta!=null) {this.jInternalFrameDetalleFormVestimenta.jTextAreanombreVestimenta.setBorder(this.vestimentaConstantesFunciones.resaltarnombreVestimenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVestimenta() throws Exception {		
		if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) {
	
		//this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.setVisible(this.vestimentaConstantesFunciones.mostraridVestimenta);
		this.jInternalFrameDetalleFormVestimenta.jPanelidVestimenta.setVisible(this.vestimentaConstantesFunciones.mostraridVestimenta);
		//this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.setVisible(this.vestimentaConstantesFunciones.mostrarid_empresaVestimenta);
		this.jInternalFrameDetalleFormVestimenta.jPanelid_empresaVestimenta.setVisible(this.vestimentaConstantesFunciones.mostrarid_empresaVestimenta);
		//this.jInternalFrameDetalleFormVestimenta.jTextAreanombreVestimenta.setVisible(this.vestimentaConstantesFunciones.mostrarnombreVestimenta);
		this.jInternalFrameDetalleFormVestimenta.jPanelnombreVestimenta.setVisible(this.vestimentaConstantesFunciones.mostrarnombreVestimenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVestimenta() throws Exception {
		if(this.jInternalFrameDetalleFormVestimenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVestimenta!=null) {
	
		this.jInternalFrameDetalleFormVestimenta.jLabelidVestimenta.setEnabled(this.vestimentaConstantesFunciones.activaridVestimenta);
		this.jInternalFrameDetalleFormVestimenta.jComboBoxid_empresaVestimenta.setEnabled(this.vestimentaConstantesFunciones.activarid_empresaVestimenta);
		this.jInternalFrameDetalleFormVestimenta.jTextAreanombreVestimenta.setEnabled(this.vestimentaConstantesFunciones.activarnombreVestimenta);
		}
	}
	
		
}