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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.nomina.util.AnticiposConstantesFunciones;
import com.bydan.erp.nomina.util.report.AnticiposParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.AnticiposParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.AnticiposBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class AnticiposBeanSwingJInternalFrame extends AnticiposJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AnticiposBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Anticipos> anticiposValidator = new ClassValidator<Anticipos>(Anticipos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Anticipos anticipos;	
	public Anticipos anticiposAux;
	public Anticipos anticiposAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Anticipos anticiposTotales;
	public Long idAnticiposActual;
	public Long iIdNuevoAnticipos=0L;
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

	public String sFinalQueryComboTipoContrato="";

	public List<TipoContrato> tipocontratosForeignKey;

	public List<TipoContrato> gettipocontratosForeignKey() {
		return tipocontratosForeignKey;
	}

	public void settipocontratosForeignKey(List<TipoContrato> tipocontratosForeignKey) {
		this.tipocontratosForeignKey = tipocontratosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoContrato tipocontratoForeignKey;

	public TipoContrato gettipocontratoForeignKey() {
		return tipocontratoForeignKey;
	}

	public void settipocontratoForeignKey(TipoContrato tipocontratoForeignKey) {
		this.tipocontratoForeignKey = tipocontratoForeignKey;
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
	
	public Boolean isPermisoTodoAnticipos;
	public Boolean isPermisoNuevoAnticipos;
	public Boolean isPermisoActualizarAnticipos;
	public Boolean isPermisoActualizarOriginalAnticipos;
	public Boolean isPermisoEliminarAnticipos;
	public Boolean isPermisoGuardarCambiosAnticipos;
	public Boolean isPermisoConsultaAnticipos;
	public Boolean isPermisoBusquedaAnticipos;
	public Boolean isPermisoReporteAnticipos;
	public Boolean isPermisoPaginacionMedioAnticipos;
	public Boolean isPermisoPaginacionAltoAnticipos;
	public Boolean isPermisoPaginacionTodoAnticipos;
	public Boolean isPermisoCopiarAnticipos;
	public Boolean isPermisoVerFormAnticipos;
	public Boolean isPermisoDuplicarAnticipos;
	public Boolean isPermisoOrdenAnticipos;
	
	
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
	
	public AnticiposParameterReturnGeneral anticiposReturnGeneral;
	public AnticiposParameterReturnGeneral anticiposParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAnticipos=false;
	public Boolean esParaAccionDesdeFormularioAnticipos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AnticiposSessionBeanAdditional anticiposSessionBeanAdditional=null;
	
	public AnticiposSessionBeanAdditional getAnticiposSessionBeanAdditional() {
		return this.anticiposSessionBeanAdditional;
	}
	
	public void setAnticiposSessionBeanAdditional(AnticiposSessionBeanAdditional anticiposSessionBeanAdditional) {
		try {
			this.anticiposSessionBeanAdditional=anticiposSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AnticiposBeanSwingJInternalFrameAdditional anticiposBeanSwingJInternalFrameAdditional=null;
	//public class AnticiposBeanSwingJInternalFrame
	
	public AnticiposBeanSwingJInternalFrameAdditional getAnticiposBeanSwingJInternalFrameAdditional() {
		return this.anticiposBeanSwingJInternalFrameAdditional;
	}
	
	public void setAnticiposBeanSwingJInternalFrameAdditional(AnticiposBeanSwingJInternalFrameAdditional anticiposBeanSwingJInternalFrameAdditional) {
		try {
			this.anticiposBeanSwingJInternalFrameAdditional=anticiposBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AnticiposLogic anticiposLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Anticipos anticiposBean;
	public AnticiposConstantesFunciones anticiposConstantesFunciones;
	//public AnticiposParameterReturnGeneral anticiposReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoContratoLogic tipocontratoLogic;
	
	//PARAMETROS
	
	
	//public List<Anticipos> anticiposs;	
	//public List<Anticipos> anticipossEliminados;
	//public List<Anticipos> anticipossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAnticipos=false;
	public Boolean isVisibilidadCeldaDuplicarAnticipos=true;
	public Boolean isVisibilidadCeldaCopiarAnticipos=true;
	public Boolean isVisibilidadCeldaVerFormAnticipos=true;
	public Boolean isVisibilidadCeldaOrdenAnticipos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAnticipos=false;
	public Boolean isVisibilidadCeldaModificarAnticipos=false;
	public Boolean isVisibilidadCeldaActualizarAnticipos=false;
	public Boolean isVisibilidadCeldaEliminarAnticipos=false;
	public Boolean isVisibilidadCeldaCancelarAnticipos=false;
	public Boolean isVisibilidadCeldaGuardarAnticipos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAnticipos=false;	
	
	
	public Boolean isVisibilidadBusquedaAnticipos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoContrato=false;
	
	public Long getiIdNuevoAnticipos() {
		return this.iIdNuevoAnticipos;
	}

	public void setiIdNuevoAnticipos(Long iIdNuevoAnticipos) {
		this.iIdNuevoAnticipos = iIdNuevoAnticipos;
	}
	
	public Long getidAnticiposActual() {
		return this.idAnticiposActual;
	}

	public void setidAnticiposActual(Long idAnticiposActual) {
		this.idAnticiposActual = idAnticiposActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Anticipos getanticipos() {
		return this.anticipos;
	}

	public void setanticipos(Anticipos anticipos) {
		this.anticipos = anticipos;
	}
	
	public Anticipos getanticiposAux() {
		return this.anticiposAux;
	}

	public void setanticiposAux(Anticipos anticiposAux) {
		this.anticiposAux = anticiposAux;
	}				
	
	public Anticipos getanticiposAnterior() {
		return this.anticiposAnterior;
	}

	public void setanticiposAnterior(Anticipos anticiposAnterior) {
		this.anticiposAnterior = anticiposAnterior;
	}	
	
	public Anticipos getanticiposTotales() {
		return this.anticiposTotales;
	}

	public void setanticiposTotales(Anticipos anticiposTotales) {
		this.anticiposTotales = anticiposTotales;
	}	
	
	public Anticipos getanticiposBean() {
		return this.anticiposBean;
	}

	public void setanticiposBean(Anticipos anticiposBean) {
		this.anticiposBean = anticiposBean;
	}	
	
	public AnticiposParameterReturnGeneral getanticiposReturnGeneral() {
		return this.anticiposReturnGeneral;
	}

	public void setanticiposReturnGeneral(AnticiposParameterReturnGeneral anticiposReturnGeneral) {
		this.anticiposReturnGeneral = anticiposReturnGeneral;
	}	
	
	
	public Long id_tipo_contratoBusquedaAnticipos=-1L;

	public Long getid_tipo_contratoBusquedaAnticipos() {
		return this.id_tipo_contratoBusquedaAnticipos;
	}

	public void setid_tipo_contratoBusquedaAnticipos(Long id_tipo_contratoBusquedaAnticipos) {
		this.id_tipo_contratoBusquedaAnticipos = id_tipo_contratoBusquedaAnticipos;
	}

;
	public String codigoBusquedaAnticipos="";

	public String getcodigoBusquedaAnticipos() {
		return this.codigoBusquedaAnticipos;
	}

	public void setcodigoBusquedaAnticipos(String codigoBusquedaAnticipos) {
		this.codigoBusquedaAnticipos = codigoBusquedaAnticipos;
	}

;
	public Date fecha_desdeBusquedaAnticipos=new Date();

	public Date getfecha_desdeBusquedaAnticipos() {
		return this.fecha_desdeBusquedaAnticipos;
	}

	public void setfecha_desdeBusquedaAnticipos(Date fecha_desdeBusquedaAnticipos) {
		this.fecha_desdeBusquedaAnticipos = fecha_desdeBusquedaAnticipos;
	}

;
	public Date fecha_hastaBusquedaAnticipos=new Date();

	public Date getfecha_hastaBusquedaAnticipos() {
		return this.fecha_hastaBusquedaAnticipos;
	}

	public void setfecha_hastaBusquedaAnticipos(Date fecha_hastaBusquedaAnticipos) {
		this.fecha_hastaBusquedaAnticipos = fecha_hastaBusquedaAnticipos;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_contratoFK_IdTipoContrato=-1L;

	public Long getid_tipo_contratoFK_IdTipoContrato() {
		return this.id_tipo_contratoFK_IdTipoContrato;
	}

	public void setid_tipo_contratoFK_IdTipoContrato(Long id_tipo_contratoFK_IdTipoContrato) {
		this.id_tipo_contratoFK_IdTipoContrato = id_tipo_contratoFK_IdTipoContrato;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AnticiposLogic getAnticiposLogic()	{		
		return anticiposLogic;
	}

	public void setAnticiposLogic(AnticiposLogic anticiposLogic) {
		this.anticiposLogic = anticiposLogic;
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
	
	public Boolean getIsEsNuevoAnticipos() {
		return isEsNuevoAnticipos;
	}

	public void setIsEsNuevoAnticipos(Boolean isEsNuevoAnticipos) {
		this.isEsNuevoAnticipos = isEsNuevoAnticipos;
	}

	public Boolean getEsParaAccionDesdeFormularioAnticipos() {
		return esParaAccionDesdeFormularioAnticipos;
	}
	
	public void setEsParaAccionDesdeFormularioAnticipos(Boolean esParaAccionDesdeFormularioAnticipos) {
		this.esParaAccionDesdeFormularioAnticipos = esParaAccionDesdeFormularioAnticipos;
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

			if(this.anticiposSessionBean==null) {
				this.anticiposSessionBean=new AnticiposSessionBean();
			}

			if(!this.anticiposSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(anticiposSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoContratosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocontratosForeignKey=new ArrayList<TipoContrato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoContratoLogic tipocontratoLogic=new TipoContratoLogic();

			//tipocontratoLogic.getTipoContratoDataAccess().setIsForForeingKeyData(true);

			if(this.anticiposSessionBean==null) {
				this.anticiposSessionBean=new AnticiposSessionBean();
			}

			if(!this.anticiposSessionBean.getisBusquedaDesdeForeignKeySesionTipoContrato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocontratoLogic.getTipoContratoDataAccess().setIsForForeingKeyData(true);

					tipocontratoLogic.getTodosTipoContratosWithConnection(sFinalQuery,new Pagination());

					this.tipocontratosForeignKey=tipocontratoLogic.getTipoContratos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoContrato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocontratoLogic.getEntityWithConnection(anticiposSessionBean.getlidTipoContratoActual());
					this.tipocontratosForeignKey.add(tipocontratoLogic.getTipoContrato());
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

					if(this.anticipos!=null) {
						this.anticipos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAnticipos!=null) {
						this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAnticipos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAnticipos!=null) {
						if(this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.getItemCount()>0) {
							this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAnticiposGenerico)throws Exception
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
				jComboBoxid_empresaAnticiposGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAnticiposGenerico!=null && jComboBoxid_empresaAnticiposGenerico.getItemCount()>0) {
					jComboBoxid_empresaAnticiposGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoContratoForeignKey(Long idTipoContratoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoContrato  tipocontratoTemp=null;

			for(TipoContrato tipocontratoAux:tipocontratosForeignKey) {
				if(tipocontratoAux.getId()!=null && tipocontratoAux.getId().equals(idTipoContratoSeleccionado)) {
					tipocontratoTemp=tipocontratoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocontratoTemp!=null) {

					if(this.anticipos!=null) {
						this.anticipos.setTipoContrato(tipocontratoTemp);
					}

					if(this.jInternalFrameDetalleFormAnticipos!=null) {
						this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.setSelectedItem(tipocontratoTemp);
					}
				} else {
					//jComboBoxid_tipo_contratoAnticipos.setSelectedItem(tipocontratoTemp);
					if(this.jInternalFrameDetalleFormAnticipos!=null) {
						if(this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.getItemCount()>0) {
							this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaAnticipos") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocontratoTemp!=null && jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos!=null) {
						jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.setSelectedItem(tipocontratoTemp);
					} else {
						if(jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos!=null) {
							//jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.setSelectedItem(tipocontratoTemp);
							if(jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.getItemCount()>0) {
								jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.setSelectedIndex(0);
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

	public String getActualTipoContratoForeignKeyDescripcion(Long idTipoContratoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoContrato  tipocontratoTemp=null;

			for(TipoContrato tipocontratoAux:tipocontratosForeignKey) {
				if(tipocontratoAux.getId()!=null && tipocontratoAux.getId().equals(idTipoContratoSeleccionado)) {
					tipocontratoTemp=tipocontratoAux;
					break;
				}
			}


			sDescripcion=TipoContratoConstantesFunciones.getTipoContratoDescripcion(tipocontratoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoContratoForeignKeyGenerico(Long idTipoContratoSeleccionado,JComboBox jComboBoxid_tipo_contratoAnticiposGenerico)throws Exception
	{
		try
		{
			TipoContrato  tipocontratoTemp=null;

			for(TipoContrato tipocontratoAux:tipocontratosForeignKey) {
				if(tipocontratoAux.getId()!=null && tipocontratoAux.getId().equals(idTipoContratoSeleccionado)) {
					tipocontratoTemp=tipocontratoAux;
					break;
				}
			}

			if(tipocontratoTemp!=null) {
				jComboBoxid_tipo_contratoAnticiposGenerico.setSelectedItem(tipocontratoTemp);
			} else {
				if(jComboBoxid_tipo_contratoAnticiposGenerico!=null && jComboBoxid_tipo_contratoAnticiposGenerico.getItemCount()>0) {
					jComboBoxid_tipo_contratoAnticiposGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Anticipos anticipos,JComboBox jComboBoxid_empresaAnticiposGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAnticiposGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAnticiposGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				anticipos.setid_empresa(empresaAux.getId());
				anticipos.setempresa_descripcion(AnticiposConstantesFunciones.getEmpresaDescripcion(empresaAux));
				anticipos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoContratoForeignKey(Anticipos anticipos,JComboBox jComboBoxid_tipo_contratoAnticiposGenerico)throws Exception
	{
		try
		{
			TipoContrato  tipocontratoAux=new TipoContrato();

			if(jComboBoxid_tipo_contratoAnticiposGenerico==null) {
				tipocontratoAux=(TipoContrato)this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.getSelectedItem();
			} else {
				tipocontratoAux=(TipoContrato)jComboBoxid_tipo_contratoAnticiposGenerico.getSelectedItem();
			}

			if(tipocontratoAux!=null && tipocontratoAux.getId()!=null) {
				anticipos.setid_tipo_contrato(tipocontratoAux.getId());
				anticipos.settipocontrato_descripcion(AnticiposConstantesFunciones.getTipoContratoDescripcion(tipocontratoAux));
				anticipos.setTipoContrato(tipocontratoAux);			}
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

					if(!AnticiposJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAnticipos!=null) { 
							this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAnticipos!=null) { 
					}

					if(!AnticiposJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoContratosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoContrato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AnticiposJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAnticipos!=null) { 
							this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.removeAllItems();

							for(TipoContrato tipocontrato:this.tipocontratosForeignKey) {
								this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.addItem(tipocontrato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAnticipos!=null) { 
					}

					if(!AnticiposJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaAnticipos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AnticiposJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.removeAllItems();

							for(TipoContrato tipocontrato:this.tipocontratosForeignKey) {
								this.jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.addItem(tipocontrato);
							}
						}

						if(!AnticiposJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAnticipos!=null) {
							this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAnticipos!=null) {
							this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoContratoForeignKey(TipoContrato tipocontrato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAnticipos!=null) {
							this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.setSelectedItem(tipocontrato);
						}
					} else {
						if(this.jInternalFrameDetalleFormAnticipos!=null) {
							this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.setSelectedItem(tipocontrato);
						} else {
							this.jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAnticipos() throws Exception {
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
		
	public AnticiposParameterReturnGeneral getAnticiposParameterGeneral() {
		return this.anticiposParameterGeneral;
	}
	
	public void setAnticiposParameterGeneral(AnticiposParameterReturnGeneral anticiposParameterGeneral) {
		this.anticiposParameterGeneral = anticiposParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAnticipos() {
		return isPermisoTodoAnticipos;
	}

	public void setIsPermisoTodoAnticipos(Boolean isPermisoTodoAnticipos) {
		this.isPermisoTodoAnticipos = isPermisoTodoAnticipos;
	}

	public Boolean getIsPermisoNuevoAnticipos() {
		return isPermisoNuevoAnticipos;
	}

	public void setIsPermisoNuevoAnticipos(Boolean isPermisoNuevoAnticipos) {
		this.isPermisoNuevoAnticipos = isPermisoNuevoAnticipos;
	}

	public Boolean getIsPermisoActualizarAnticipos() {
		return isPermisoActualizarAnticipos;
	}

	public void setIsPermisoActualizarAnticipos(Boolean isPermisoActualizarAnticipos) {
		this.isPermisoActualizarAnticipos = isPermisoActualizarAnticipos;
	}

	public Boolean getIsPermisoEliminarAnticipos() {
		return isPermisoEliminarAnticipos;
	}

	public void setIsPermisoEliminarAnticipos(Boolean isPermisoEliminarAnticipos) {
		this.isPermisoEliminarAnticipos = isPermisoEliminarAnticipos;
	}

	public Boolean getIsPermisoGuardarCambiosAnticipos() {
		return isPermisoGuardarCambiosAnticipos;
	}

	public void setIsPermisoGuardarCambiosAnticipos(Boolean isPermisoGuardarCambiosAnticipos) {
		this.isPermisoGuardarCambiosAnticipos = isPermisoGuardarCambiosAnticipos;
	}
	
	public Boolean getIsPermisoConsultaAnticipos() {
		return isPermisoConsultaAnticipos;
	}

	public void setIsPermisoConsultaAnticipos(Boolean isPermisoConsultaAnticipos) {
		this.isPermisoConsultaAnticipos = isPermisoConsultaAnticipos;
	}

	public Boolean getIsPermisoBusquedaAnticipos() {
		return isPermisoBusquedaAnticipos;
	}

	public void setIsPermisoBusquedaAnticipos(Boolean isPermisoBusquedaAnticipos) {
		this.isPermisoBusquedaAnticipos = isPermisoBusquedaAnticipos;
	}

	public Boolean getIsPermisoReporteAnticipos() {
		return isPermisoReporteAnticipos;
	}

	public void setIsPermisoReporteAnticipos(Boolean isPermisoReporteAnticipos) {
		this.isPermisoReporteAnticipos = isPermisoReporteAnticipos;
	}
	
	public Boolean getIsPermisoPaginacionMedioAnticipos() {
		return isPermisoPaginacionMedioAnticipos;
	}

	public void setIsPermisoPaginacionMedioAnticipos(Boolean isPermisoPaginacionMedioAnticipos) {
		this.isPermisoPaginacionMedioAnticipos = isPermisoPaginacionMedioAnticipos;
	}
	
	public Boolean getIsPermisoPaginacionTodoAnticipos() {
		return isPermisoPaginacionTodoAnticipos;
	}

	public void setIsPermisoPaginacionTodoAnticipos(Boolean isPermisoPaginacionTodoAnticipos) {
		this.isPermisoPaginacionTodoAnticipos = isPermisoPaginacionTodoAnticipos;
	}
	
	public Boolean getIsPermisoPaginacionAltoAnticipos() {
		return isPermisoPaginacionAltoAnticipos;
	}

	public void setIsPermisoPaginacionAltoAnticipos(Boolean isPermisoPaginacionAltoAnticipos) {
		this.isPermisoPaginacionAltoAnticipos = isPermisoPaginacionAltoAnticipos;
	}
	
	public Boolean getIsPermisoCopiarAnticipos() {
		return isPermisoCopiarAnticipos;
	}

	public void setIsPermisoCopiarAnticipos(Boolean isPermisoCopiarAnticipos) {
		this.isPermisoCopiarAnticipos = isPermisoCopiarAnticipos;
	}
	
	public Boolean getIsPermisoVerFormAnticipos() {
		return isPermisoVerFormAnticipos;
	}

	public void setIsPermisoVerFormAnticipos(Boolean isPermisoVerFormAnticipos) {
		this.isPermisoVerFormAnticipos = isPermisoVerFormAnticipos;
	}
	
	public Boolean getIsPermisoDuplicarAnticipos() {
		return isPermisoDuplicarAnticipos;
	}

	public void setIsPermisoDuplicarAnticipos(Boolean isPermisoDuplicarAnticipos) {
		this.isPermisoDuplicarAnticipos = isPermisoDuplicarAnticipos;
	}
	
	public Boolean getIsPermisoOrdenAnticipos() {
		return isPermisoOrdenAnticipos;
	}

	public void setIsPermisoOrdenAnticipos(Boolean isPermisoOrdenAnticipos) {
		this.isPermisoOrdenAnticipos = isPermisoOrdenAnticipos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAnticipos() {
		return isVisibilidadCeldaNuevoAnticipos;
	}

	public void setIsVisibilidadCeldaNuevoAnticipos(Boolean isVisibilidadCeldaNuevoAnticipos) {
		this.isVisibilidadCeldaNuevoAnticipos = isVisibilidadCeldaNuevoAnticipos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAnticipos() {
		return isVisibilidadCeldaDuplicarAnticipos;
	}

	public void setIsVisibilidadCeldaDuplicarAnticipos(Boolean isVisibilidadCeldaDuplicarAnticipos) {
		this.isVisibilidadCeldaDuplicarAnticipos = isVisibilidadCeldaDuplicarAnticipos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAnticipos() {
		return isVisibilidadCeldaCopiarAnticipos;
	}

	public void setIsVisibilidadCeldaCopiarAnticipos(Boolean isVisibilidadCeldaCopiarAnticipos) {
		this.isVisibilidadCeldaCopiarAnticipos = isVisibilidadCeldaCopiarAnticipos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAnticipos() {
		return isVisibilidadCeldaVerFormAnticipos;
	}

	public void setIsVisibilidadCeldaVerFormAnticipos(Boolean isVisibilidadCeldaVerFormAnticipos) {
		this.isVisibilidadCeldaVerFormAnticipos = isVisibilidadCeldaVerFormAnticipos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAnticipos() {
		return isVisibilidadCeldaOrdenAnticipos;
	}

	public void setIsVisibilidadCeldaOrdenAnticipos(Boolean isVisibilidadCeldaOrdenAnticipos) {
		this.isVisibilidadCeldaOrdenAnticipos = isVisibilidadCeldaOrdenAnticipos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAnticipos() {
		return isVisibilidadCeldaNuevoRelacionesAnticipos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAnticipos(Boolean isVisibilidadCeldaNuevoRelacionesAnticipos) {
		this.isVisibilidadCeldaNuevoRelacionesAnticipos = isVisibilidadCeldaNuevoRelacionesAnticipos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAnticipos() {
		return isVisibilidadCeldaModificarAnticipos;
	}

	public void setIsVisibilidadCeldaModificarAnticipos(Boolean isVisibilidadCeldaModificarAnticipos) {
		this.isVisibilidadCeldaModificarAnticipos = isVisibilidadCeldaModificarAnticipos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAnticipos() {
		return isVisibilidadCeldaActualizarAnticipos;
	}

	public void setIsVisibilidadCeldaActualizarAnticipos(Boolean isVisibilidadCeldaActualizarAnticipos) {
		this.isVisibilidadCeldaActualizarAnticipos = isVisibilidadCeldaActualizarAnticipos;
	}

	public Boolean getIsVisibilidadCeldaEliminarAnticipos() {
		return isVisibilidadCeldaEliminarAnticipos;
	}

	public void setIsVisibilidadCeldaEliminarAnticipos(Boolean isVisibilidadCeldaEliminarAnticipos) {
		this.isVisibilidadCeldaEliminarAnticipos = isVisibilidadCeldaEliminarAnticipos;
	}

	public Boolean getIsVisibilidadCeldaCancelarAnticipos() {
		return isVisibilidadCeldaCancelarAnticipos;
	}

	public void setIsVisibilidadCeldaCancelarAnticipos(Boolean isVisibilidadCeldaCancelarAnticipos) {
		this.isVisibilidadCeldaCancelarAnticipos = isVisibilidadCeldaCancelarAnticipos;
	}

	public Boolean getIsVisibilidadCeldaGuardarAnticipos() {
		return isVisibilidadCeldaGuardarAnticipos;
	}

	public void setIsVisibilidadCeldaGuardarAnticipos(Boolean isVisibilidadCeldaGuardarAnticipos) {
		this.isVisibilidadCeldaGuardarAnticipos = isVisibilidadCeldaGuardarAnticipos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAnticipos() {
		return isVisibilidadCeldaGuardarCambiosAnticipos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAnticipos(Boolean isVisibilidadCeldaGuardarCambiosAnticipos) {
		this.isVisibilidadCeldaGuardarCambiosAnticipos = isVisibilidadCeldaGuardarCambiosAnticipos;
	}
		
	public AnticiposSessionBean getanticiposSessionBean() {
		return this.anticiposSessionBean;
	}
	
	public void setanticiposSessionBean(AnticiposSessionBean anticiposSessionBean) {
		this.anticiposSessionBean=anticiposSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaAnticipos() {
		return this.isVisibilidadBusquedaAnticipos;
	}

	public void setisVisibilidadBusquedaAnticipos(Boolean isVisibilidadBusquedaAnticipos) {
		this.isVisibilidadBusquedaAnticipos=isVisibilidadBusquedaAnticipos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoContrato() {
		return this.isVisibilidadFK_IdTipoContrato;
	}

	public void setisVisibilidadFK_IdTipoContrato(Boolean isVisibilidadFK_IdTipoContrato) {
		this.isVisibilidadFK_IdTipoContrato=isVisibilidadFK_IdTipoContrato;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAnticipos(Anticipos anticipos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(anticipos,null);
				this.setActualParaGuardarTipoContratoForeignKey(anticipos,null);
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
	
	public void bugActualizarReferenciaActual(Anticipos anticipos,Anticipos anticiposAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAnticipos(anticipos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		anticiposAux.setId(anticipos.getId());
		anticiposAux.setVersionRow(anticipos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(Anticipos anticiposLocal) throws Exception {
		
		if(this.anticiposSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Anticipos anticiposLocal) throws Exception {	
		if(this.anticiposSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				anticiposLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoContratoDetalleFormJInternalFrame.class)) {
				TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrameLocal=(TipoContratoBeanSwingJInternalFrame) ((TipoContratoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocontratoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoContrato(tipocontratoBeanSwingJInternalFrameLocal.gettipocontrato(),true);
				tipocontratoBeanSwingJInternalFrameLocal.actualizarLista(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato,this.tipocontratosForeignKey);

				tipocontratoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato);

				anticiposLocal.setTipoContrato(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato);

				this.addItemDefectoCombosForeignKeyTipoContrato();
				this.cargarCombosFrameTipoContratosForeignKey("Formulario");
				this.setActualTipoContratoForeignKey(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAnticiposActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = anticiposValidator.getInvalidValues(this.anticipos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Anticipos anticipos,List<Anticipos> anticiposs) throws Exception {
	}		
	
	public void actualizarSelectedLista(Anticipos anticipos,List<Anticipos> anticiposs) throws Exception {
		try	{			
			AnticiposConstantesFunciones.actualizarSelectedLista(anticipos,anticiposs);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Anticipos> anticipossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				anticipossLocal=this.anticiposLogic.getAnticiposs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				anticipossLocal=this.anticiposs;
			}
			//ARCHITECTURE
		
			for(Anticipos anticiposLocal:anticipossLocal) {
				if(this.permiteMantenimiento(anticiposLocal) && anticiposLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AnticiposConstantesFunciones.getAnticiposLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AnticiposConstantesFunciones.CODIGOCARGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelcodigo_cargoAnticipos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticiposConstantesFunciones.NOMBREESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelnombre_estructuraAnticipos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticiposConstantesFunciones.CODIGODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelcodigo_datoAnticipos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticiposConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelnombre_completoAnticipos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticiposConstantesFunciones.SUELDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelsueldoAnticipos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticiposConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelfechaAnticipos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticiposConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelvalorAnticipos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticiposConstantesFunciones.VALORADICIONAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelvalor_adicionalAnticipos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticiposConstantesFunciones.VALORPRESTAMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelvalor_prestamoAnticipos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticiposConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabeltotalAnticipos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipos.jLabelcodigo_cargoAnticipos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipos.jLabelnombre_estructuraAnticipos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipos.jLabelcodigo_datoAnticipos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipos.jLabelnombre_completoAnticipos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipos.jLabelsueldoAnticipos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipos.jLabelfechaAnticipos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipos.jLabelvalorAnticipos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipos.jLabelvalor_adicionalAnticipos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipos.jLabelvalor_prestamoAnticipos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipos.jLabeltotalAnticipos,"");
		
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
		this.iIdNuevoAnticipos--;	
		
		
		this.anticiposAux=new Anticipos();
		
		this.anticiposAux.setId(this.iIdNuevoAnticipos);
		this.anticiposAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.anticiposLogic.getAnticiposs().add(this.anticiposAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.anticiposs.add(this.anticiposAux);
		}
		//ARCHITECTURE
		
		this.anticipos=this.anticiposAux;
		
		if(AnticiposJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAnticipos(this.anticipos);
			this.setVariablesObjetoActualToFormularioForeignKeyAnticipos(this.anticipos);
		}
				
		//this.setDefaultControlesAnticipos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAnticipos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAnticipos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAnticipos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAnticipos(this.anticiposBean,this.anticipos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAnticipos(this.anticiposReturnGeneral,this.anticiposBean,false);
		
		if(this.anticiposReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAnticipos(this.anticiposReturnGeneral.getAnticipos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAnticipos(this.anticiposReturnGeneral.getAnticipos());
		}
		
		if(this.anticiposReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAnticipos(this.anticiposReturnGeneral.getAnticipos(),classes);//this.anticiposBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAnticipos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAnticipos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AnticiposBeanSwingJInternalFrameAdditional.RecargarFormAnticipos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAnticipos(false);
						
			if(anticiposSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AnticiposJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAnticipos();
			}
			
			this.actualizarVisualTableDatosAnticipos();
			
			this.jTableDatosAnticipos.setRowSelectionInterval(this.getIndiceNuevoAnticipos(), this.getIndiceNuevoAnticipos());
			
			this.seleccionarFilaTablaAnticiposActual();
						
			this.actualizarEstadoCeldasBotonesAnticipos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAnticipos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigoAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarcodigoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jDateChooserfecha_desdeAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarfecha_desdeAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jDateChooserfecha_hastaAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarfecha_hastaAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_cargoAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarcodigo_cargoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_estructuraAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarnombre_estructuraAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_datoAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarcodigo_datoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_completoAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarnombre_completoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldsueldoAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarsueldoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jDateChooserfechaAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarfechaAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldvalorAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarvalorAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_adicionalAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarvalor_adicionalAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_prestamoAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarvalor_prestamoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldtotalAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activartotalAnticipos);	
		//
		this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarid_empresaAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.setEnabled(isHabilitar && this.anticiposConstantesFunciones.activarid_tipo_contratoAnticipos);
	};
	
	public void setDefaultControlesAnticipos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAnticipos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.anticiposSessionBean.setConGuardarRelaciones(true);			
			this.anticiposSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAnticipos.jTabbedPaneRelacionesAnticipos.setVisible(true);
			
					
		} else {
			//this.anticiposSessionBean.setConGuardarRelaciones(false);			
			this.anticiposSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAnticipos.jTabbedPaneRelacionesAnticipos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAnticipos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Anticipos anticiposAux:this.anticiposLogic.getAnticiposs()) {
				if(anticiposAux.getId().equals(this.iIdNuevoAnticipos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Anticipos anticiposAux:this.anticiposs) {
				if(anticiposAux.getId().equals(this.iIdNuevoAnticipos)) {
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
	
	public int getIndiceActualAnticipos(Anticipos anticipos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Anticipos anticiposAux:this.anticiposLogic.getAnticiposs()) {
				if(anticiposAux.getId().equals(anticipos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Anticipos anticiposAux:this.anticiposs) {
				if(anticiposAux.getId().equals(anticipos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAnticipos(Anticipos anticiposOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Anticipos anticiposAux:this.anticiposLogic.getAnticiposs()) {
				if(anticiposAux.getAnticiposOriginal().getId().equals(anticiposOriginal.getId())) {
					existe=true;
					anticiposOriginal.setId(anticiposAux.getId());
					anticiposOriginal.setVersionRow(anticiposAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Anticipos anticiposAux:this.anticiposs) {
				if(anticiposAux.getAnticiposOriginal().getId().equals(anticiposOriginal.getId())) {
					existe=true;
					anticiposOriginal.setId(anticiposAux.getId());
					anticiposOriginal.setVersionRow(anticiposAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAnticipos(Boolean esParaCancelar) throws Exception {
		anticipossAux=new ArrayList<Anticipos>();
		anticiposAux=new Anticipos();
		
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Anticipos anticiposAux:this.anticiposLogic.getAnticiposs()) {
					if(anticiposAux.getId()<0) {
						anticipossAux.add(anticiposAux);
					}		
				}
				this.iIdNuevoAnticipos=0L;
				this.anticiposLogic.getAnticiposs().removeAll(anticipossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Anticipos anticiposAux:this.anticiposs) {
					if(anticiposAux.getId()<0) {
						anticipossAux.add(anticiposAux);
					}		
				}
				this.iIdNuevoAnticipos=0L;
				this.anticiposs.removeAll(anticipossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAnticipos 
					&& this.anticiposLogic.getAnticiposs().size()>0
					) {
					anticiposAux=this.anticiposLogic.getAnticiposs().get(this.anticiposLogic.getAnticiposs().size() - 1);
				
					if(anticiposAux.getId()<0) {
						this.anticiposLogic.getAnticiposs().remove(anticiposAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAnticipos && this.anticiposs.size()>0) {
					anticiposAux=this.anticiposs.get(this.anticiposs.size() - 1);
				
					if(anticiposAux.getId()<0) {
						this.anticiposs.remove(anticiposAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAnticipos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(anticipos.getId()<0) {
				this.anticiposLogic.getAnticiposs().remove(this.anticipos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(anticipos.getId()<0) {
				this.anticiposs.remove(this.anticipos);
			}
		}			
	}
	
	public void setEstadosInicialesAnticipos(List<Anticipos> anticipossAux) throws Exception {
		AnticiposConstantesFunciones.setEstadosInicialesAnticipos(anticipossAux);
	}
	
	public void setEstadosInicialesAnticipos(Anticipos anticiposAux) throws Exception {
		AnticiposConstantesFunciones.setEstadosInicialesAnticipos(anticiposAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAnticiposActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAnticipos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAnticiposActual()) {
				if(!this.isEsNuevoAnticipos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAnticipos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAnticipos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAnticiposActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Anticipos ?", "MANTENIMIENTO DE Anticipos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAnticipos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Anticipos anticipos) throws Exception {
		AnticiposConstantesFunciones.seleccionarAsignar(this.anticipos,anticipos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAnticipos=this.isPermisoActualizarOriginalAnticipos;
			
			
			this.seleccionarAsignar(anticipos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesAnticipos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.anticiposSessionBean.setsFuncionBusquedaRapida(this.anticiposSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAnticipos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAnticipos(esParaCancelar);				
				this.cancelarNuevoAnticipos(esParaCancelar);								
			}
			
			this.anticipos=new Anticipos();
			
			this.inicializarAnticipos();
			
			this.actualizarEstadoCeldasBotonesAnticipos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAnticipos() throws Exception {
		try {
			AnticiposConstantesFunciones.inicializarAnticipos(this.anticipos);
			
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
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.anticiposLogic.getAnticiposs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAnticiposs(String sAccionBusqueda,List<Anticipos> anticipossParaReportes) throws Exception {
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
					sPathReporteFinal="Anticipos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AnticiposMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AnticiposMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Anticipos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Anticiposes");		
		parameters.put("busquedapor", AnticiposConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAnticipos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AnticiposConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AnticiposConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAnticipos=new JRBeanArrayDataSource(AnticiposJInternalFrame.TraerAnticiposBeans(anticipossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAnticipos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AnticiposConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AnticiposConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AnticiposBean.TraerAnticiposBeans(anticipossParaReportes).toArray()));
							
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
				this.generarExcelReporteAnticiposs(sAccionBusqueda,sTipoArchivoReporte,anticipossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAnticiposs(sAccionBusqueda,sTipoArchivoReporte,anticipossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAnticiposActionPerformed(null);
					//this.generarExcelReporteAnticiposs(sAccionBusqueda,sTipoArchivoReporte,anticipossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAnticiposs(sAccionBusqueda,sTipoArchivoReporte,anticipossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAnticiposs(sAccionBusqueda,sTipoArchivoReporte,anticipossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAnticiposs(sAccionBusqueda,sTipoArchivoReporte,anticipossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAnticiposs(String sAccionBusqueda,String sTipoArchivoReporte,List<Anticipos> anticipossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Anticiposs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAnticipos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Anticipos anticipos : anticipossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AnticiposConstantesFunciones.generarExcelReporteDataAnticipos("NORMAL",row,workbook,anticipos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticiposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAnticipos(String sTipo,Row row,Workbook workbook) {
		
		AnticiposConstantesFunciones.generarExcelReporteHeaderAnticipos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAnticiposs(String sAccionBusqueda,String sTipoArchivoReporte,List<Anticipos> anticipossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Anticiposs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Anticipos anticipos : anticipossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AnticiposConstantesFunciones.getAnticiposDescripcion(anticipos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_IDTIPOCONTRATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_IDTIPOCONTRATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.gettipocontrato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_CODIGOCARGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_CODIGOCARGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getcodigo_cargo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getnombre_estructura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_CODIGODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_CODIGODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getcodigo_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_SUELDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_SUELDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getsueldo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_VALORADICIONAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_VALORADICIONAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getvalor_adicional());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_VALORPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_VALORPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.getvalor_prestamo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticiposConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticiposConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipos.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticiposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAnticiposs(String sAccionBusqueda,String sTipoArchivoReporte,List<Anticipos> anticipossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Anticipos> anticipossRespaldo=null;
		
		classes=AnticiposConstantesFunciones.getClassesRelationshipsOfAnticipos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.anticiposLogic.setDatosCliente(this.datosCliente);
		this.anticiposLogic.setDatosDeep(this.datosDeep);
		this.anticiposLogic.setIsConDeep(true);
		
		anticipossRespaldo=this.anticiposLogic.getAnticiposs();
		
		this.anticiposLogic.setAnticiposs(anticipossParaReportes);	
		this.anticiposLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		anticipossParaReportes=this.anticiposLogic.getAnticiposs();
		this.anticiposLogic.setAnticiposs(anticipossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Anticiposs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAnticipos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Anticipos anticipos : anticipossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAnticipos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AnticiposConstantesFunciones.generarExcelReporteDataAnticipos("NORMAL",row,workbook,anticipos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AnticiposConstantesFunciones.getAnticiposDescripcion(anticipos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticiposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAnticipos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAnticipos() throws Exception {		
		this.startProcessAnticipos(true);
	}
	
	public void startProcessAnticipos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAnticipos ,this.jPanelParametrosReportesAnticipos, this.jScrollPanelDatosAnticipos,this.jPanelPaginacionAnticipos, this.jScrollPanelDatosEdicionAnticipos, this.jPanelAccionesAnticipos,this.jPanelAccionesFormularioAnticipos,this.jmenuBarAnticipos,this.jmenuBarDetalleAnticipos,this.jTtoolBarAnticipos,this.jTtoolBarDetalleAnticipos);		
		
		final JTabbedPane jTabbedPaneBusquedasAnticipos=this.jTabbedPaneBusquedasAnticipos; 
		
		final JPanel jPanelParametrosReportesAnticipos=this.jPanelParametrosReportesAnticipos;
		//final JScrollPane jScrollPanelDatosAnticipos=this.jScrollPanelDatosAnticipos;
		final JTable jTableDatosAnticipos=this.jTableDatosAnticipos;		
		final JPanel jPanelPaginacionAnticipos=this.jPanelPaginacionAnticipos;
		//final JScrollPane jScrollPanelDatosEdicionAnticipos=this.jScrollPanelDatosEdicionAnticipos;
		final JPanel jPanelAccionesAnticipos=this.jPanelAccionesAnticipos;
		
		JPanel jPanelCamposAuxiliarAnticipos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAnticipos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) {
			jPanelCamposAuxiliarAnticipos=this.jInternalFrameDetalleFormAnticipos.jPanelCamposAnticipos;
			jPanelAccionesFormularioAuxiliarAnticipos=this.jInternalFrameDetalleFormAnticipos.jPanelAccionesFormularioAnticipos;
		}
		
		final JPanel jPanelCamposAnticipos=jPanelCamposAuxiliarAnticipos;
		final JPanel jPanelAccionesFormularioAnticipos=jPanelAccionesFormularioAuxiliarAnticipos;
		
		
		final JMenuBar jmenuBarAnticipos=this.jmenuBarAnticipos;
		final JToolBar jTtoolBarAnticipos=this.jTtoolBarAnticipos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAnticipos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAnticipos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) {
			jmenuBarDetalleAuxiliarAnticipos=this.jInternalFrameDetalleFormAnticipos.jmenuBarDetalleAnticipos;
			jTtoolBarDetalleAuxiliarAnticipos=this.jInternalFrameDetalleFormAnticipos.jTtoolBarDetalleAnticipos;
		}
		
		final JMenuBar jmenuBarDetalleAnticipos=jmenuBarDetalleAuxiliarAnticipos;
		final JToolBar jTtoolBarDetalleAnticipos=jTtoolBarDetalleAuxiliarAnticipos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAnticipos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAnticipos;
			processRunnable.jTableDatos=jTableDatosAnticipos;
			processRunnable.jPanelCampos=jPanelCamposAnticipos;
			processRunnable.jPanelPaginacion=jPanelPaginacionAnticipos;
			processRunnable.jPanelAcciones=jPanelAccionesAnticipos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAnticipos;
			
			
			processRunnable.jmenuBar=jmenuBarAnticipos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAnticipos;
			processRunnable.jTtoolBar=jTtoolBarAnticipos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAnticipos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAnticipos ,jPanelParametrosReportesAnticipos,jTableDatosAnticipos, /*jScrollPanelDatosAnticipos,*/jPanelCamposAnticipos,jPanelPaginacionAnticipos, /*jScrollPanelDatosEdicionAnticipos,*/ jPanelAccionesAnticipos,jPanelAccionesFormularioAnticipos,jmenuBarAnticipos,jmenuBarDetalleAnticipos,jTtoolBarAnticipos,jTtoolBarDetalleAnticipos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAnticipos ,jPanelParametrosReportesAnticipos, jScrollPanelDatosAnticipos,jPanelPaginacionAnticipos, jScrollPanelDatosEdicionAnticipos, jPanelAccionesAnticipos,jPanelAccionesFormularioAnticipos,jmenuBarAnticipos,jmenuBarDetalleAnticipos,jTtoolBarAnticipos,jTtoolBarDetalleAnticipos);
						
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
	
	public void finishProcessAnticipos() {// throws Exception 
		this.finishProcessAnticipos(true);
	}
	
	public void finishProcessAnticipos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAnticipos ,this.jPanelParametrosReportesAnticipos, this.jScrollPanelDatosAnticipos,this.jPanelPaginacionAnticipos, this.jScrollPanelDatosEdicionAnticipos, this.jPanelAccionesAnticipos,this.jPanelAccionesFormularioAnticipos,this.jmenuBarAnticipos,this.jmenuBarDetalleAnticipos,this.jTtoolBarAnticipos,this.jTtoolBarDetalleAnticipos);		
		
		final JTabbedPane jTabbedPaneBusquedasAnticipos=this.jTabbedPaneBusquedasAnticipos; 
		
		final JPanel jPanelParametrosReportesAnticipos=this.jPanelParametrosReportesAnticipos;
		//final JScrollPane jScrollPanelDatosAnticipos=this.jScrollPanelDatosAnticipos;
		final JTable jTableDatosAnticipos=this.jTableDatosAnticipos;		
		final JPanel jPanelPaginacionAnticipos=this.jPanelPaginacionAnticipos;
		//final JScrollPane jScrollPanelDatosEdicionAnticipos=this.jScrollPanelDatosEdicionAnticipos;
		final JPanel jPanelAccionesAnticipos=this.jPanelAccionesAnticipos;
		
		JPanel jPanelCamposAuxiliarAnticipos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAnticipos=new JPanel();
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) {
			jPanelCamposAuxiliarAnticipos=this.jInternalFrameDetalleFormAnticipos.jPanelCamposAnticipos;
			jPanelAccionesFormularioAuxiliarAnticipos=this.jInternalFrameDetalleFormAnticipos.jPanelAccionesFormularioAnticipos;
		}
		
		final JPanel jPanelCamposAnticipos=jPanelCamposAuxiliarAnticipos;
		final JPanel jPanelAccionesFormularioAnticipos=jPanelAccionesFormularioAuxiliarAnticipos;
		
		
		final JMenuBar jmenuBarAnticipos=this.jmenuBarAnticipos;		
		final JToolBar jTtoolBarAnticipos=this.jTtoolBarAnticipos;
				
		JMenuBar jmenuBarDetalleAuxiliarAnticipos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAnticipos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) {
			jmenuBarDetalleAuxiliarAnticipos=this.jInternalFrameDetalleFormAnticipos.jmenuBarDetalleAnticipos;
			jTtoolBarDetalleAuxiliarAnticipos=this.jInternalFrameDetalleFormAnticipos.jTtoolBarDetalleAnticipos;		
		}
		
		final JMenuBar jmenuBarDetalleAnticipos=jmenuBarDetalleAuxiliarAnticipos;
		final JToolBar jTtoolBarDetalleAnticipos=jTtoolBarDetalleAuxiliarAnticipos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAnticipos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAnticipos;
			processRunnable.jTableDatos=jTableDatosAnticipos;
			processRunnable.jPanelCampos=jPanelCamposAnticipos;
			processRunnable.jPanelPaginacion=jPanelPaginacionAnticipos;
			processRunnable.jPanelAcciones=jPanelAccionesAnticipos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAnticipos;
			
			
			processRunnable.jmenuBar=jmenuBarAnticipos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAnticipos;
			processRunnable.jTtoolBar=jTtoolBarAnticipos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAnticipos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAnticipos ,jPanelParametrosReportesAnticipos, jTableDatosAnticipos,/*jScrollPanelDatosAnticipos,*/jPanelCamposAnticipos,jPanelPaginacionAnticipos, /*jScrollPanelDatosEdicionAnticipos,*/ jPanelAccionesAnticipos,jPanelAccionesFormularioAnticipos,jmenuBarAnticipos,jmenuBarDetalleAnticipos,jTtoolBarAnticipos,jTtoolBarDetalleAnticipos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAnticipos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAnticipos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAnticipos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAnticipos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAnticipos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAnticipos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAnticipos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAnticipos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAnticipos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.anticiposConstantesFunciones.getsFinalQueryAnticipos();
		String  finalQueryPaginacionTodos=this.anticiposConstantesFunciones.getsFinalQueryAnticipos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AnticiposConstantesFunciones.getArrayColumnasGlobalesNoAnticipos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AnticiposConstantesFunciones.getArrayColumnasGlobalesAnticipos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AnticiposConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.anticipossEliminados= new ArrayList<Anticipos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAnticipos();
		
				///*AnticiposSessionBean*/this.anticiposSessionBean=new AnticiposSessionBean();
			
			if(this.anticiposSessionBean==null) {
				this.anticiposSessionBean=new AnticiposSessionBean();
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
					this.iNumeroPaginacion=AnticiposConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AnticiposConstantesFunciones.getClassesForeignKeysOfAnticipos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/anticipos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			anticipossAux= new ArrayList<Anticipos>();
			
				
			anticiposLogic.setDatosCliente(this.datosCliente);
			anticiposLogic.setDatosDeep(this.datosDeep);
			anticiposLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaAnticipos")) {
				this.sDetalleReporte=AnticiposConstantesFunciones.getDetalleIndiceBusquedaAnticipos(id_tipo_contratoBusquedaAnticipos,codigoBusquedaAnticipos,fecha_desdeBusquedaAnticipos,fecha_hastaBusquedaAnticipos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					anticiposLogic.getAnticipossBusquedaAnticipos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_contratoBusquedaAnticipos,codigoBusquedaAnticipos,fecha_desdeBusquedaAnticipos,fecha_hastaBusquedaAnticipos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AnticiposConstantesFunciones.getDetalleIndiceBusquedaAnticipos(id_tipo_contratoBusquedaAnticipos,codigoBusquedaAnticipos,fecha_desdeBusquedaAnticipos,fecha_hastaBusquedaAnticipos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AnticiposConstantesFunciones.getDetalleIndiceBusquedaAnticipos(id_tipo_contratoBusquedaAnticipos,codigoBusquedaAnticipos,fecha_desdeBusquedaAnticipos,fecha_hastaBusquedaAnticipos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=anticiposLogic.getAnticiposs()==null||anticiposLogic.getAnticiposs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=anticiposs==null|| anticiposs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipossAux=new ArrayList<Anticipos>();
						anticipossAux.addAll(anticiposLogic.getAnticiposs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipossAux=new ArrayList<Anticipos>();
							anticipossAux.addAll(anticiposs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							anticiposLogic.getAnticipossBusquedaAnticipos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_contratoBusquedaAnticipos,codigoBusquedaAnticipos,fecha_desdeBusquedaAnticipos,fecha_hastaBusquedaAnticipos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AnticiposConstantesFunciones.getDetalleIndiceBusquedaAnticipos(id_tipo_contratoBusquedaAnticipos,codigoBusquedaAnticipos,fecha_desdeBusquedaAnticipos,fecha_hastaBusquedaAnticipos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AnticiposConstantesFunciones.getDetalleIndiceBusquedaAnticipos(id_tipo_contratoBusquedaAnticipos,codigoBusquedaAnticipos,fecha_desdeBusquedaAnticipos,fecha_hastaBusquedaAnticipos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAnticiposs("BusquedaAnticipos",anticiposLogic.getAnticiposs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAnticiposs("BusquedaAnticipos",anticiposs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						anticiposLogic.setAnticiposs(new ArrayList<Anticipos>());
						anticiposLogic.getAnticiposs().addAll(anticipossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticiposs=new ArrayList<Anticipos>();
							anticiposs.addAll(anticipossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAnticipos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAnticipos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=anticiposLogic.getAnticiposs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=anticiposs.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=anticiposLogic.getAnticiposs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=anticiposs.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Anticipos anticipos) {
		Boolean permite=true;
		
		if(this.anticipos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AnticiposConstantesFunciones.getOrderByListaAnticipos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AnticiposConstantesFunciones.getOrderByListaAnticipos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Anticipos anticipos:anticiposLogic.getAnticiposs()) {
				if(anticipos.getsType().equals(Constantes2.S_TOTALES)) {
					anticiposTotales=anticipos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Anticipos anticipos:this.anticiposs) {
				if(anticipos.getsType().equals(Constantes2.S_TOTALES)) {
					anticiposTotales=anticipos;
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
			this.anticiposAux=new Anticipos();
			this.anticiposAux.setsType(Constantes2.S_TOTALES);
			this.anticiposAux.setIsNew(false);
			this.anticiposAux.setIsChanged(false);
			this.anticiposAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//AnticiposConstantesFunciones.TotalizarValoresFilaAnticipos(this.anticiposLogic.getAnticiposs(),this.anticiposAux);
				
				//this.anticiposLogic.getAnticiposs().add(this.anticiposAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AnticiposConstantesFunciones.TotalizarValoresFilaAnticipos(this.anticiposs,this.anticiposAux);
				
				this.anticiposs.add(this.anticiposAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		anticiposTotales=new Anticipos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.anticiposLogic.getAnticiposs().remove(anticiposTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.anticiposs.remove(anticiposTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		anticiposTotales=new Anticipos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Anticipos anticipos:anticiposLogic.getAnticiposs()) {
				if(anticipos.getsType().equals(Constantes2.S_TOTALES)) {
					anticiposTotales=anticipos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AnticiposConstantesFunciones.TotalizarValoresFilaAnticipos(this.anticiposLogic.getAnticiposs(),anticiposTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Anticipos anticipos:this.anticiposs) {
				if(anticipos.getsType().equals(Constantes2.S_TOTALES)) {
					anticiposTotales=anticipos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AnticiposConstantesFunciones.TotalizarValoresFilaAnticipos(this.anticiposs,anticiposTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAnticipossBusquedaAnticipos()throws Exception {
		try {
			sAccionBusqueda="BusquedaAnticipos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAnticipossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAnticipossFK_IdTipoContrato()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoContrato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAnticipossBusquedaAnticipos(String sFinalQuery,Long id_tipo_contrato,String codigo,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anticiposLogic.getAnticipossBusquedaAnticipos(sFinalQuery,this.pagination,id_tipo_contrato,codigo,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAnticipossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anticiposLogic.getAnticipossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAnticipossFK_IdTipoContrato(String sFinalQuery,Long id_tipo_contrato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anticiposLogic.getAnticipossFK_IdTipoContrato(sFinalQuery,this.pagination,id_tipo_contrato);
				
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
	
	public void inicializarPermisosAnticipos() {
		this.isPermisoTodoAnticipos=false;
		this.isPermisoNuevoAnticipos=false;
		this.isPermisoActualizarAnticipos=false;
		this.isPermisoActualizarOriginalAnticipos=false;
		this.isPermisoEliminarAnticipos=false;
		this.isPermisoGuardarCambiosAnticipos=false;
		this.isPermisoConsultaAnticipos=true;
		this.isPermisoBusquedaAnticipos=true;
		this.isPermisoReporteAnticipos=true;
		this.isPermisoOrdenAnticipos=false;		
		this.isPermisoPaginacionMedioAnticipos=false;		
		this.isPermisoPaginacionAltoAnticipos=false;		
		this.isPermisoPaginacionTodoAnticipos=false;		
		this.isPermisoCopiarAnticipos=false;		
		this.isPermisoVerFormAnticipos=false;		
		this.isPermisoDuplicarAnticipos=false;
		this.isPermisoOrdenAnticipos=false;
	}
	
	public void setPermisosUsuarioAnticipos(Boolean isPermiso) {
		this.isPermisoTodoAnticipos=isPermiso;
		this.isPermisoNuevoAnticipos=isPermiso;
		this.isPermisoActualizarAnticipos=isPermiso;
		this.isPermisoActualizarOriginalAnticipos=isPermiso;
		this.isPermisoEliminarAnticipos=isPermiso;
		this.isPermisoGuardarCambiosAnticipos=isPermiso;
		this.isPermisoConsultaAnticipos=isPermiso;
		this.isPermisoBusquedaAnticipos=isPermiso;
		this.isPermisoReporteAnticipos=isPermiso;
		this.isPermisoOrdenAnticipos=isPermiso;		
		this.isPermisoPaginacionMedioAnticipos=isPermiso;		
		this.isPermisoPaginacionAltoAnticipos=isPermiso;		
		this.isPermisoPaginacionTodoAnticipos=isPermiso;		
		this.isPermisoCopiarAnticipos=isPermiso;		
		this.isPermisoVerFormAnticipos=isPermiso;		
		this.isPermisoDuplicarAnticipos=isPermiso;
		this.isPermisoOrdenAnticipos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAnticipos(Boolean isPermiso) {
		//this.isPermisoTodoAnticipos=isPermiso;
		this.isPermisoNuevoAnticipos=isPermiso;
		this.isPermisoActualizarAnticipos=isPermiso;
		this.isPermisoActualizarOriginalAnticipos=isPermiso;
		this.isPermisoEliminarAnticipos=isPermiso;
		this.isPermisoGuardarCambiosAnticipos=isPermiso;
		//this.isPermisoConsultaAnticipos=isPermiso;
		//this.isPermisoBusquedaAnticipos=isPermiso;
		//this.isPermisoReporteAnticipos=isPermiso;
		//this.isPermisoOrdenAnticipos=isPermiso;		
		//this.isPermisoPaginacionMedioAnticipos=isPermiso;		
		//this.isPermisoPaginacionAltoAnticipos=isPermiso;		
		//this.isPermisoPaginacionTodoAnticipos=isPermiso;		
		//this.isPermisoCopiarAnticipos=isPermiso;		
		//this.isPermisoDuplicarAnticipos=isPermiso;
		//this.isPermisoOrdenAnticipos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAnticiposClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AnticiposJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAnticipos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAnticiposClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAnticiposClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAnticiposClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAnticiposClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAnticipos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AnticiposJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.anticiposSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AnticiposConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAnticipos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAnticipos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAnticipos=this.isPermisoActualizarAnticipos;
			this.isPermisoEliminarAnticipos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAnticipos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAnticipos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAnticipos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAnticipos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAnticipos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAnticipos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAnticipos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAnticipos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAnticipos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAnticipos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAnticipos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAnticipos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAnticipos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.anticiposSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAnticipos.setToolTipText(this.jTableDatosAnticipos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAnticipos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAnticipos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AnticiposJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AnticiposJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAnticipos() throws Exception {
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
	public void inicializarCombosForeignKeyAnticiposListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipocontratosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAnticiposListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AnticiposJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoContratoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoContratoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocontratosForeignKey==null||this.tipocontratosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoContratoConstantesFunciones.getArrayColumnasGlobalesTipoContrato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoContratoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoContratoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoContratosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyAnticipos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoContrato();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.anticiposSessionBean==null) {
				this.anticiposSessionBean=new AnticiposSessionBean();
			}

			if(!this.anticiposSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoContrato()throws Exception {
		try {

			if(!this.anticiposSessionBean.getisBusquedaDesdeForeignKeySesionTipoContrato()) {
				TipoContrato tipocontrato=new TipoContrato();
				TipoContratoConstantesFunciones.setTipoContratoDescripcion(tipocontrato,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocontrato.setId(null);

				if(!TipoContratoConstantesFunciones.ExisteEnLista(this.tipocontratosForeignKey,tipocontrato,true)) {

					this.tipocontratosForeignKey.add(0,tipocontrato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyAnticipos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAnticipos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAnticipos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAnticipos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAnticipos(Anticipos anticipos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAnticipos(Anticipos anticipos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAnticipos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAnticipos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAnticipos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAnticipos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAnticipos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAnticipos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoContratosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAnticipos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoContratosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAnticipos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos!=null && this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.getItemCount()>0) {
				this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos!=null && this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.getItemCount()>0) {
				this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public AnticiposBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AnticiposBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AnticiposBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.anticiposSessionBean=new AnticiposSessionBean(); 
		this.anticiposConstantesFunciones=new AnticiposConstantesFunciones(); 
		this.anticiposBean=new Anticipos();//(this.anticiposConstantesFunciones); 		
		this.anticiposReturnGeneral=new AnticiposParameterReturnGeneral(); 
		
		this.anticiposSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.anticiposSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AnticiposBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AnticiposBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AnticiposBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAnticipos(true);
			
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
			
			this.anticiposConstantesFunciones=new AnticiposConstantesFunciones(); 
			this.anticiposBean=new Anticipos();//this.anticiposConstantesFunciones); 			
			this.anticiposReturnGeneral=new AnticiposParameterReturnGeneral(); 
		
			AnticiposBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Anticipos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.anticipos=new Anticipos();
			this.anticiposs = new ArrayList<Anticipos>();
			this.anticipossAux = new ArrayList<Anticipos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic=new AnticiposLogic();
				this.anticiposLogic.getNewConnexionToDeep("");
			}
			
			//this.anticiposSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.anticiposSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAnticipos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAnticipos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAnticipos);	
					}
					
					if(this.jInternalFrameImportacionAnticipos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAnticipos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAnticipos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAnticipos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAnticipos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAnticipos);
				this.jInternalFrameDetalleFormAnticipos.setVisible(false);
				this.jInternalFrameDetalleFormAnticipos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAnticipos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAnticipos);
					this.jInternalFrameReporteDinamicoAnticipos.setVisible(false);
					this.jInternalFrameReporteDinamicoAnticipos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAnticipos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAnticipos);
					this.jInternalFrameImportacionAnticipos.setVisible(false);
					this.jInternalFrameImportacionAnticipos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAnticipos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAnticipos);
					this.jInternalFrameOrderByAnticipos.setVisible(false);
					this.jInternalFrameOrderByAnticipos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAnticiposActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AnticiposConstantesFunciones.INUMEROPAGINACION;
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
			
			this.anticiposReturnGeneral=new AnticiposParameterReturnGeneral();
			
			this.anticiposParameterGeneral=new AnticiposParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.anticiposLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AnticiposJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.anticiposSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AnticiposConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.anticiposSessionBean.getEsGuardarRelacionado(),this.anticiposSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AnticiposConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.anticiposSessionBean.getEsGuardarRelacionado(),this.anticiposSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAnticipos=false;
			this.isVisibilidadCeldaDuplicarAnticipos=true;
			this.isVisibilidadCeldaCopiarAnticipos=true;
			this.isVisibilidadCeldaVerFormAnticipos=true;
			this.isVisibilidadCeldaOrdenAnticipos=true;
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=false;
			this.isVisibilidadCeldaModificarAnticipos=false;
			this.isVisibilidadCeldaActualizarAnticipos=false;
			this.isVisibilidadCeldaEliminarAnticipos=false;
			this.isVisibilidadCeldaCancelarAnticipos=false;
			this.isVisibilidadCeldaGuardarAnticipos=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipos=false;
			
			
			this.isVisibilidadBusquedaAnticipos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoContrato=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAnticipos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAnticipos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAnticipos(false);
			
			this.setPermisosUsuarioAnticipos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.anticiposSessionBean.getEsGuardarRelacionado() 
				|| (this.anticiposSessionBean.getEsGuardarRelacionado() && this.anticiposSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAnticiposClasesRelacionadas();
			}
			
			if(this.anticiposSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAnticiposClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AnticiposJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAnticipos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAnticipos();
			}
			
			if(!this.isPermisoBusquedaAnticipos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAnticipos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AnticiposConstantesFunciones.getTiposSeleccionarAnticipos());
				
				this.tiposColumnasSelect=AnticiposConstantesFunciones.getTiposSeleccionarAnticipos(true);
				
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
			//if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAnticipos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioAnticipos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioAnticipos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAnticipos() ;
			
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
			this.tipocontratoLogic=new TipoContratoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				anticiposImplementable= (AnticiposImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AnticiposConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				anticiposImplementableHome= (AnticiposImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AnticiposConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.anticiposs= new ArrayList<Anticipos>();
			this.anticipossEliminados= new ArrayList<Anticipos>();
						
			this.isEsNuevoAnticipos=false;
			this.esParaAccionDesdeFormularioAnticipos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipocontratosForeignKey=new ArrayList<TipoContrato>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAnticipos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAnticipos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AnticiposBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AnticiposConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAnticipos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAnticipos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAnticipos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAnticipos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAnticipos();
			}
			
			AnticiposBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAnticipos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAnticipos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAnticipos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAnticipos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Anticipos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAnticipos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAnticipos")) {
				iIndex=this.jInternalFrameDetalleFormAnticipos.jTabbedPaneRelacionesAnticipos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAnticipos.jTabbedPaneRelacionesAnticipos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAnticipos();	
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
	
	public void cargarCombosForeignKeyAnticipos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAnticipos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAnticipos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAnticiposListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAnticipos();
		
		this.cargarCombosFrameForeignKeyAnticipos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAnticipos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAnticipos();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoContrato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoContratoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoContrato();
				this.cargarCombosFrameTipoContratosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoContrato(this.tipocontratosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoAnticiposActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.anticiposSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
			
			if(jTableDatosAnticipos.getRowCount()>=1) {
				jTableDatosAnticipos.removeRowSelectionInterval(0, jTableDatosAnticipos.getRowCount()-1);						
			}
			
			this.isEsNuevoAnticipos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAnticipos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAnticipos(true);			
			//this.anticipos=new Anticipos();
			//this.anticipos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAnticipos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnticipos() ;
			
			if(AnticiposJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAnticipos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.anticipos);	
			this.actualizarInformacion("INFO_PADRE",false,this.anticipos);				
			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
			if(this.anticiposSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Anticipos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAnticiposActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAnticipos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAnticipos.getSelectedRows().length;			
			}
			
			anticipossSeleccionados=this.getAnticipossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAnticipos--;			
				//Anticipos anticiposAux= new Anticipos();			
				//anticiposAux.setId(this.iIdNuevoAnticipos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Anticipos anticiposOrigen=new Anticipos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Anticipos anticiposOrigen : anticipossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							anticiposOrigen =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticiposOrigen =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAnticipos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.anticipos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAnticipos(anticiposOrigen,this.anticipos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.anticiposLogic.getAnticiposs().add(this.anticiposAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.anticiposs.add(this.anticiposAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAnticipos(false);
				
				this.jTableDatosAnticipos.setRowSelectionInterval(this.getIndiceNuevoAnticipos(), this.getIndiceNuevoAnticipos());
				
				int iLastRow =  this.jTableDatosAnticipos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAnticipos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAnticipos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAnticipos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();									
		
			Anticipos anticiposOrigen=new Anticipos();
			Anticipos anticiposDestino=new Anticipos();
				
			anticipossSeleccionados=this.getAnticipossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAnticipos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || anticipossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAnticipos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anticiposOrigen =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						anticiposOrigen =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anticiposDestino =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						anticiposDestino =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				anticiposOrigen =anticipossSeleccionados.get(0);
				anticiposDestino =anticipossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAnticipos(anticiposOrigen,anticiposDestino,true,false);
				
				anticiposDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(anticiposDestino,anticiposLogic.getAnticiposs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(anticiposDestino,anticiposs);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAnticipos(false);
				
				//this.jTableDatosAnticipos.setRowSelectionInterval(this.getIndiceNuevoAnticipos(), this.getIndiceNuevoAnticipos());
				
				int iLastRow =  this.jTableDatosAnticipos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAnticipos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAnticipos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAnticipos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAnticipos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAnticipos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAnticipos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAnticipos.setVisible(!isVisible);
			this.jPanelPaginacionAnticipos.setVisible(!isVisible);
			this.jPanelAccionesAnticipos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAnticipos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAnticipos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAnticipos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAnticipos();
			
			this.abrirFrameOrderByAnticipos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAnticipos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAnticipos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAnticipos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAnticipos.isMaximum()) {
					this.jInternalFrameDetalleFormAnticipos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAnticipos.setSize(this.jInternalFrameDetalleFormAnticipos.iWidthFormulario,this.jInternalFrameDetalleFormAnticipos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAnticipos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAnticipos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAnticipos.isMaximum()) {
						this.jInternalFrameDetalleFormAnticipos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAnticipos.jContentPaneDetalleAnticipos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAnticipos.jTabbedPaneRelacionesAnticipos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAnticipos.jContentPaneDetalleAnticipos.getWidth(),AnticiposConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAnticipos.jTabbedPaneRelacionesAnticipos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAnticipos.jContentPaneDetalleAnticipos.getWidth(),AnticiposConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAnticipos.jTabbedPaneRelacionesAnticipos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAnticipos.jContentPaneDetalleAnticipos.getWidth(),AnticiposConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAnticipos.setVisible(true);
	        this.jInternalFrameDetalleFormAnticipos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAnticipos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAnticipos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAnticipos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnticipos,false,this);
				} else {
					this.jInternalFrameOrderByAnticipos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnticipos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAnticipos);
				this.jInternalFrameOrderByAnticipos.setVisible(false);
				this.jInternalFrameOrderByAnticipos.setSelected(false);
				
				this.jInternalFrameOrderByAnticipos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAnticipos"));
				
				this.inicializarActualizarBindingTablaOrderByAnticipos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAnticipos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAnticipos==null) {
				
				this.jInternalFrameImportacionAnticipos=new ImportacionJInternalFrame(AnticiposConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAnticipos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAnticipos);
				this.jInternalFrameImportacionAnticipos.setVisible(false);
				this.jInternalFrameImportacionAnticipos.setSelected(false);


				this.jInternalFrameImportacionAnticipos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAnticipos"));
				this.jInternalFrameImportacionAnticipos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAnticipos"));
				this.jInternalFrameImportacionAnticipos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAnticipos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAnticipos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAnticipos==null) {
				this.jInternalFrameReporteDinamicoAnticipos=new ReporteDinamicoJInternalFrame(AnticiposConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAnticipos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAnticipos);
				this.jInternalFrameReporteDinamicoAnticipos.setVisible(false);
				this.jInternalFrameReporteDinamicoAnticipos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAnticipos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAnticipos"));
				this.jInternalFrameReporteDinamicoAnticipos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAnticipos"));
				this.jInternalFrameReporteDinamicoAnticipos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAnticipos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAnticipos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAnticipos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAnticipos);
			
	       	this.jInternalFrameDetalleFormAnticipos.setVisible(false);
	        this.jInternalFrameDetalleFormAnticipos.setSelected(false);
			
			//this.jInternalFrameDetalleFormAnticipos.dispose();
			//this.jInternalFrameDetalleFormAnticipos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAnticipos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAnticipos.setVisible(true);
	        this.jInternalFrameReporteDinamicoAnticipos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAnticipos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAnticipos.setVisible(true);
	        this.jInternalFrameImportacionAnticipos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAnticipos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAnticipos.setVisible(true);
	        this.jInternalFrameOrderByAnticipos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAnticipos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAnticipos.setVisible(false);
	        this.jInternalFrameOrderByAnticipos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAnticipos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAnticipos.setVisible(false);
	        this.jInternalFrameReporteDinamicoAnticipos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAnticipos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAnticipos.setVisible(false);
	        this.jInternalFrameImportacionAnticipos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAnticipos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAnticipos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAnticipos(true);
			//this.isEsNuevoAnticipos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAnticipos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAnticipos(false) ;
			
			if(anticiposSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AnticiposJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAnticipos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnticipos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAnticiposActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAnticipos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAnticipos(true);
			//this.isEsNuevoAnticipos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.anticipos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAnticipos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAnticipos(false) ;
			
			if(AnticiposJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAnticipos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnticipos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoContrato(List<TipoContrato> tipocontratosForeignKey)throws Exception{
		TableColumn tableColumnTipoContrato=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_IDTIPOCONTRATO));
		TableCellEditor tableCellEditorTipoContrato =tableColumnTipoContrato.getCellEditor();

		TipoContratoTableCell tipocontratoTableCellFk=(TipoContratoTableCell)tableCellEditorTipoContrato;

		if(tipocontratoTableCellFk!=null) {
			tipocontratoTableCellFk.settipocontratosForeignKey(tipocontratosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAnticipos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocontratoTableCellFk.setRowActual(intSelectedRow);
			//tipocontratoTableCellFk.settipocontratosForeignKeyActual(tipocontratosForeignKey);
		//}


		if(tipocontratoTableCellFk!=null) {
			tipocontratoTableCellFk.RecargarTipoContratosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAnticipos(false);
			
			//if(!this.isEsNuevoAnticipos) {								
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AnticiposJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				
			}
			
			if(this.permiteMantenimiento(this.anticipos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.anticiposSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAnticipos=true;
					this.inicializarActualizarBindingTablaAnticipos(false);
					this.isEsNuevoAnticipos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAnticipos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAnticipos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAnticipos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAnticipos(false);
				
				this.habilitarDeshabilitarControlesAnticipos(false);
			
												
				
				if(AnticiposJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAnticipos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAnticiposActionPerformed(evt,anticiposSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAnticipos(this.anticipos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAnticipos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,anticiposSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.anticipos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAnticiposActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				this.anticipos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				this.anticipos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.anticipos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.anticiposSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AnticiposModel) this.jTableDatosAnticipos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAnticipos=true;
				this.inicializarActualizarBindingTablaAnticipos(false);
				this.isEsNuevoAnticipos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAnticipos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAnticipos(false);
				
				this.habilitarDeshabilitarControlesAnticipos(false);
				
				
				
				if(AnticiposJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAnticipos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAnticiposActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAnticipos.getRowCount()>=1) {
				jTableDatosAnticipos.removeRowSelectionInterval(0, jTableDatosAnticipos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAnticipos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAnticipos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAnticipos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnticipos(false) ;
			
			this.isEsNuevoAnticipos=false;
			
			if(AnticiposJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAnticipos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAnticiposActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAnticipos(false);
				
				//SI ES MANUAL
				if(AnticiposJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAnticipos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAnticiposActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAnticipos--;			
			//Anticipos anticiposAux= new Anticipos();			
			//anticiposAux.setId(this.iIdNuevoAnticipos);
			
			if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAnticipos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
			
			this.anticipos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.anticiposLogic.getAnticiposs().add(this.anticiposAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.anticiposs.add(this.anticiposAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAnticipos(false);
			
			this.jTableDatosAnticipos.setRowSelectionInterval(this.getIndiceNuevoAnticipos(), this.getIndiceNuevoAnticipos());
			
			int iLastRow =  this.jTableDatosAnticipos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAnticipos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAnticipos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAnticipos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAnticiposActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAnticipos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnticipos(false);
			
			//SI ES MANUAL
			if(AnticiposJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAnticipos();
			}
			
			//this.abrirFrameTreeAnticipos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAnticiposActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAnticiposActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAnticipos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAnticipos.setFileImportacion(this.jInternalFrameImportacionAnticipos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAnticipos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAnticipos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAnticipos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAnticipos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAnticiposActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();		

		anticipossSeleccionados=this.getAnticipossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AnticiposBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AnticiposBaseDesign.jrxml";
			
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
			
			this.generarReporteAnticiposs("Todos",anticipossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticiposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AnticiposConstantesFunciones.LABEL_CODIGOCARGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCargo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCargo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCargo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCargo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEstructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEstructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEstructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEstructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticiposConstantesFunciones.LABEL_CODIGODATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticiposConstantesFunciones.LABEL_SUELDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_eldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_eldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_eldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_eldo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticiposConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticiposConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticiposConstantesFunciones.LABEL_VALORADICIONAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorAdicional_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorAdicional_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorAdicional_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorAdicional_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticiposConstantesFunciones.LABEL_VALORPRESTAMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPrestamo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPrestamo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPrestamo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPrestamo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticiposConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAnticipos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AnticiposConstantesFunciones.LABEL_CODIGOCARGO:
					sNombreCampoCategoria="codigo_cargo";
					break;

				case AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA:
					sNombreCampoCategoria="nombre_estructura";
					break;

				case AnticiposConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoria="codigo_dato";
					break;

				case AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case AnticiposConstantesFunciones.LABEL_SUELDO:
					sNombreCampoCategoria="sueldo";
					break;

				case AnticiposConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case AnticiposConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case AnticiposConstantesFunciones.LABEL_VALORADICIONAL:
					sNombreCampoCategoria="valor_adicional";
					break;

				case AnticiposConstantesFunciones.LABEL_VALORPRESTAMO:
					sNombreCampoCategoria="valor_prestamo";
					break;

				case AnticiposConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AnticiposConstantesFunciones.LABEL_CODIGOCARGO:
					sNombreCampoCategoriaValor="codigo_cargo";
					break;

				case AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA:
					sNombreCampoCategoriaValor="nombre_estructura";
					break;

				case AnticiposConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoriaValor="codigo_dato";
					break;

				case AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case AnticiposConstantesFunciones.LABEL_SUELDO:
					sNombreCampoCategoriaValor="sueldo";
					break;

				case AnticiposConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case AnticiposConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case AnticiposConstantesFunciones.LABEL_VALORADICIONAL:
					sNombreCampoCategoriaValor="valor_adicional";
					break;

				case AnticiposConstantesFunciones.LABEL_VALORPRESTAMO:
					sNombreCampoCategoriaValor="valor_prestamo";
					break;

				case AnticiposConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AnticiposConstantesFunciones.LABEL_CODIGOCARGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cargo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cargo");
					break;

				case AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_estructura");
					break;

				case AnticiposConstantesFunciones.LABEL_CODIGODATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_dato");
					break;

				case AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case AnticiposConstantesFunciones.LABEL_SUELDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sueldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sueldo");
					break;

				case AnticiposConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case AnticiposConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case AnticiposConstantesFunciones.LABEL_VALORADICIONAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Adicional",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_adicional");
					break;

				case AnticiposConstantesFunciones.LABEL_VALORPRESTAMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Prestamo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_prestamo");
					break;

				case AnticiposConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoAnticiposActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();		
		
		anticipossSeleccionados=this.getAnticipossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Anticiposs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AnticiposConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_IDTIPOCONTRATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_IDTIPOCONTRATO);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.gettipocontrato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_CODIGOCARGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_CODIGOCARGO);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getcodigo_cargo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getnombre_estructura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_CODIGODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_CODIGODATO);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getcodigo_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_SUELDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_SUELDO);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getsueldo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_VALORADICIONAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_VALORADICIONAL);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getvalor_adicional());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_VALORPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_VALORPRESTAMO);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.getvalor_prestamo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticiposConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticiposConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(Anticipos anticipos:anticipossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipos.gettotal());
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
			//	this.getFilaCabeceraExportarExcelAnticipos(row);				
			//	iRow++;
			//}				
			
			//for(Anticipos anticiposAux:anticipossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAnticipos(anticiposAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticiposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipos",JOptionPane.INFORMATION_MESSAGE);
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
				this.anticiposLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnticipos(false);
			
			//SI ES MANUAL
			if(AnticiposJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAnticipos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAnticiposActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnticipos(false);
			
			//SI ES MANUAL
			if(AnticiposJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAnticipos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAnticiposActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnticipos(false);
			
			//SI ES MANUAL
			if(AnticiposJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAnticipos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAnticipos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAnticipos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAnticipos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAnticipos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAnticipos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAnticipos.setMinimumSize(dimensionMinimum);
		this.jTableDatosAnticipos.setMaximumSize(dimensionMaximum);
		this.jTableDatosAnticipos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAnticipos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAnticipos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAnticipos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAnticipos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAnticipos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAnticipos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAnticipos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAnticipos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AnticiposJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AnticiposJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAnticipos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAnticipos();
		
		this.inicializarActualizarBindingBotonesManualAnticipos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAnticipos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAnticipos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAnticipos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAnticipos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAnticipos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAnticipos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAnticipos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAnticipos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAnticipos.jCheckBoxPostAccionNuevoAnticipos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAnticipos.jCheckBoxPostAccionSinCerrarAnticipos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAnticipos.jCheckBoxPostAccionSinMensajeAnticipos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAnticipos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAnticipos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAnticipos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAnticipos!=null) {
				this.jInternalFrameDetalleFormAnticipos.jCheckBoxPostAccionNuevoAnticipos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAnticipos.jCheckBoxPostAccionSinCerrarAnticipos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAnticipos.jCheckBoxPostAccionSinMensajeAnticipos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAnticipos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAnticipos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAnticipos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAnticipos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAnticipos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAnticipos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAnticipos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAnticipos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAnticipos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAnticipos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAnticipos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAnticipos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAnticipos(Boolean esInicializar) throws Exception {
		try	{	
			if(AnticiposJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAnticipos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAnticipos() throws Exception {
		try	{
			if(AnticiposJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAnticipos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAnticipos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAnticipos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAnticipos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAnticipos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAnticipos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAnticipos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAnticipos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAnticipos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAnticipos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAnticipos.addItem(reporte);
			}
			
			
			if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAnticipos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAnticipos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAnticipos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAnticipos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAnticipos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAnticipos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAnticipos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAnticipos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAnticipos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAnticipos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAnticipos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAnticipos!=null) {
				this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAnticipos!=null) {
				this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAnticipos!=null) {
				
				if(this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAnticipos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAnticipos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAnticipos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=AnticiposConstantesFunciones.getTiposSeleccionarAnticipos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=AnticiposConstantesFunciones.getTiposSeleccionarAnticipos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=AnticiposConstantesFunciones.getTiposSeleccionarAnticipos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAnticipos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoAnticipos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAnticipos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.getSelectedItem()!=null){this.id_tipo_contratoBusquedaAnticipos=((TipoContrato)this.jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.getSelectedItem()).getId();}
		this.codigoBusquedaAnticipos=this.jTextFieldcodigoBusquedaAnticiposAnticipos.getText();
		this.fecha_desdeBusquedaAnticipos=new Date(this.jDateChooserfecha_desdeBusquedaAnticiposAnticipos.getDate().getTime());
		this.fecha_hastaBusquedaAnticipos=new Date(this.jDateChooserfecha_hastaBusquedaAnticiposAnticipos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAnticipos(Boolean esInicializar) throws Exception {				
		if(AnticiposJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAnticipos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAnticipos() throws Exception {
		this.inicializarActualizarBindingTablaAnticipos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAnticipos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAnticiposOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticiposOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAnticipos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=anticiposLogic.getAnticiposs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=anticiposs.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AnticiposJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAnticipos.setModel(new AnticiposModel(this.anticiposLogic.getAnticiposs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAnticipos.setModel(new AnticiposModel(this.anticiposs,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAnticipos!=null && this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAnticipos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AnticiposConstantesFunciones.SCLASSWEBTITULO,anticiposConstantesFunciones.resaltarSeleccionarAnticipos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AnticiposConstantesFunciones.SCLASSWEBTITULO,anticiposConstantesFunciones.resaltarSeleccionarAnticipos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_ID));

		if(this.anticiposConstantesFunciones.mostraridAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticiposConstantesFunciones.resaltaridAnticipos,this.anticiposConstantesFunciones.activaridAnticipos,iSizeTabla,this,true,"idAnticipos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticiposConstantesFunciones.resaltaridAnticipos,this.anticiposConstantesFunciones.activaridAnticipos,this,true,"idAnticipos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_CODIGOCARGO));

		if(this.anticiposConstantesFunciones.mostrarcodigo_cargoAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_CODIGOCARGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.anticiposConstantesFunciones.resaltarcodigo_cargoAnticipos,this.anticiposConstantesFunciones.activarcodigo_cargoAnticipos,iSizeTabla,this,true,"codigo_cargoAnticipos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticiposConstantesFunciones.resaltarcodigo_cargoAnticipos,this.anticiposConstantesFunciones.activarcodigo_cargoAnticipos,this,true,"codigo_cargoAnticipos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA));

		if(this.anticiposConstantesFunciones.mostrarnombre_estructuraAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.anticiposConstantesFunciones.resaltarnombre_estructuraAnticipos,this.anticiposConstantesFunciones.activarnombre_estructuraAnticipos,iSizeTabla,this,true,"nombre_estructuraAnticipos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticiposConstantesFunciones.resaltarnombre_estructuraAnticipos,this.anticiposConstantesFunciones.activarnombre_estructuraAnticipos,this,true,"nombre_estructuraAnticipos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_CODIGODATO));

		if(this.anticiposConstantesFunciones.mostrarcodigo_datoAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_CODIGODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.anticiposConstantesFunciones.resaltarcodigo_datoAnticipos,this.anticiposConstantesFunciones.activarcodigo_datoAnticipos,iSizeTabla,this,true,"codigo_datoAnticipos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticiposConstantesFunciones.resaltarcodigo_datoAnticipos,this.anticiposConstantesFunciones.activarcodigo_datoAnticipos,this,true,"codigo_datoAnticipos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.anticiposConstantesFunciones.mostrarnombre_completoAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.anticiposConstantesFunciones.resaltarnombre_completoAnticipos,this.anticiposConstantesFunciones.activarnombre_completoAnticipos,iSizeTabla,this,true,"nombre_completoAnticipos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticiposConstantesFunciones.resaltarnombre_completoAnticipos,this.anticiposConstantesFunciones.activarnombre_completoAnticipos,this,true,"nombre_completoAnticipos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_SUELDO));

		if(this.anticiposConstantesFunciones.mostrarsueldoAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_SUELDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticiposConstantesFunciones.resaltarsueldoAnticipos,this.anticiposConstantesFunciones.activarsueldoAnticipos,iSizeTabla,this,true,"sueldoAnticipos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticiposConstantesFunciones.resaltarsueldoAnticipos,this.anticiposConstantesFunciones.activarsueldoAnticipos,this,true,"sueldoAnticipos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_FECHA));

		if(this.anticiposConstantesFunciones.mostrarfechaAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.anticiposConstantesFunciones.resaltarfechaAnticipos,this.anticiposConstantesFunciones.activarfechaAnticipos,iSizeTabla,this,true,"fechaAnticipos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.anticiposConstantesFunciones.resaltarfechaAnticipos,this.anticiposConstantesFunciones.activarfechaAnticipos,this,true,"fechaAnticipos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_VALOR));

		if(this.anticiposConstantesFunciones.mostrarvalorAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticiposConstantesFunciones.resaltarvalorAnticipos,this.anticiposConstantesFunciones.activarvalorAnticipos,iSizeTabla,this,true,"valorAnticipos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticiposConstantesFunciones.resaltarvalorAnticipos,this.anticiposConstantesFunciones.activarvalorAnticipos,this,true,"valorAnticipos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_VALORADICIONAL));

		if(this.anticiposConstantesFunciones.mostrarvalor_adicionalAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_VALORADICIONAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticiposConstantesFunciones.resaltarvalor_adicionalAnticipos,this.anticiposConstantesFunciones.activarvalor_adicionalAnticipos,iSizeTabla,this,true,"valor_adicionalAnticipos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticiposConstantesFunciones.resaltarvalor_adicionalAnticipos,this.anticiposConstantesFunciones.activarvalor_adicionalAnticipos,this,true,"valor_adicionalAnticipos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_VALORPRESTAMO));

		if(this.anticiposConstantesFunciones.mostrarvalor_prestamoAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_VALORPRESTAMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticiposConstantesFunciones.resaltarvalor_prestamoAnticipos,this.anticiposConstantesFunciones.activarvalor_prestamoAnticipos,iSizeTabla,this,true,"valor_prestamoAnticipos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticiposConstantesFunciones.resaltarvalor_prestamoAnticipos,this.anticiposConstantesFunciones.activarvalor_prestamoAnticipos,this,true,"valor_prestamoAnticipos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,AnticiposConstantesFunciones.LABEL_TOTAL));

		if(this.anticiposConstantesFunciones.mostrartotalAnticipos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticiposConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticiposConstantesFunciones.resaltartotalAnticipos,this.anticiposConstantesFunciones.activartotalAnticipos,iSizeTabla,this,true,"totalAnticipos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticiposConstantesFunciones.resaltartotalAnticipos,this.anticiposConstantesFunciones.activartotalAnticipos,this,true,"totalAnticipos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticiposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.anticiposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.anticiposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAnticipos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.anticiposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.anticiposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAnticipos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAnticipos && this.isPermisoGuardarCambiosAnticipos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.anticiposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.anticiposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAnticipos.addColumn(tableColumn);
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
			
			this.jTableDatosAnticipos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAnticipos && this.isPermisoGuardarCambiosAnticipos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAnticipos && this.isPermisoGuardarCambiosAnticipos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAnticipos.moveColumn(this.jTableDatosAnticipos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAnticipos.moveColumn(this.jTableDatosAnticipos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAnticipos.moveColumn(this.jTableDatosAnticipos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAnticipos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAnticipos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAnticipos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AnticiposJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAnticipos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAnticipos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AnticiposJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AnticiposJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAnticipos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAnticipos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAnticipos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=anticiposLogic.getAnticiposs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=anticiposs.size()-1;
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
		//this.jTableDatosAnticipos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAnticipos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAnticipos();
			
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
				
				//this.isEsNuevoAnticipos=false;
					
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
				if(this.anticiposSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAnticipos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAnticipos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAnticipos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.anticipos.getsType().equals("DUPLICADO")
				   || this.anticipos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAnticipos=true;
				
				} else {
					this.isEsNuevoAnticipos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
					if(this.anticipos.getId()>=0 && !this.anticipos.getIsNew()) {						
						this.isEsNuevoAnticipos=false;
						
					} else {
						this.isEsNuevoAnticipos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAnticipos(esRelaciones);						
				
				this.seleccionarAnticipos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.anticipos.getId()<0) {
					this.isEsNuevoAnticipos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAnticipos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAnticipos(evt,rowIndex);
				}	
				
				if(this.anticiposSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Anticipos: " + this.dDif); 
					}
				}								
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAnticipos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.anticipos)) {
					if(this.anticipos.getId()>0) {
						this.anticipos.setIsDeleted(true);
						
						this.anticipossEliminados.add(this.anticipos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.anticiposLogic.getAnticiposs().remove(this.anticipos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.anticiposs.remove(this.anticipos);				
					}
					
					
					((AnticiposModel) this.jTableDatosAnticipos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAnticipos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAnticipos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAnticipos) {
			
			if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAnticipos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAnticipos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AnticiposJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAnticipos(this.anticipos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAnticipos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAnticipos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAnticipos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAnticipos(Anticipos anticipos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAnticipos(anticipos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAnticipos(Anticipos anticipos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAnticipos(anticipos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAnticipos(anticipos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAnticipos(anticipos);
	}
	
	public void setVariablesObjetoActualToFormularioAnticipos(Anticipos anticipos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.setText(anticipos.getId().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_cargoAnticipos.setText(anticipos.getcodigo_cargo());
			this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_estructuraAnticipos.setText(anticipos.getnombre_estructura());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_datoAnticipos.setText(anticipos.getcodigo_dato());
			this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_completoAnticipos.setText(anticipos.getnombre_completo());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldsueldoAnticipos.setText(anticipos.getsueldo().toString());
			this.jInternalFrameDetalleFormAnticipos.jDateChooserfechaAnticipos.setDate(anticipos.getfecha());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldvalorAnticipos.setText(anticipos.getvalor().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_adicionalAnticipos.setText(anticipos.getvalor_adicional().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_prestamoAnticipos.setText(anticipos.getvalor_prestamo().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldtotalAnticipos.setText(anticipos.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Anticipos anticiposLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,anticiposLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Anticipos anticiposLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				anticiposLocal=this.anticipos;
			} else {
				anticiposLocal=this.anticiposAnterior;
			}
		}
		
		if(this.permiteMantenimiento(anticiposLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAnticipos(anticiposLocal,true);
					
					if(anticiposSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(anticiposLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.anticiposSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(anticiposLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAnticipos(Anticipos anticipos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAnticipos(anticipos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(anticipos);
	}
	
	public void setVariablesFormularioToObjetoActualAnticipos(Anticipos anticipos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAnticipos(anticipos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAnticipos(Anticipos anticipos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.getText()==null || this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.getText()=="" || this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.getText()=="Id") {
				this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.setText("0");
			}

			if(conColumnasBase) {anticipos.setId(Long.parseLong(this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelIdAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipos.setcodigo_cargo(this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_cargoAnticipos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_CODIGOCARGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelcodigo_cargoAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipos.setnombre_estructura(this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_estructuraAnticipos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelnombre_estructuraAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipos.setcodigo_dato(this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_datoAnticipos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_CODIGODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelcodigo_datoAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipos.setnombre_completo(this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_completoAnticipos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelnombre_completoAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipos.setsueldo(Double.parseDouble(this.jInternalFrameDetalleFormAnticipos.jTextFieldsueldoAnticipos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_SUELDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelsueldoAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipos.setfecha(this.jInternalFrameDetalleFormAnticipos.jDateChooserfechaAnticipos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelfechaAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipos.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormAnticipos.jTextFieldvalorAnticipos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelvalorAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipos.setvalor_adicional(Double.parseDouble(this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_adicionalAnticipos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_VALORADICIONAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelvalor_adicionalAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipos.setvalor_prestamo(Double.parseDouble(this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_prestamoAnticipos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_VALORPRESTAMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabelvalor_prestamoAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormAnticipos.jTextFieldtotalAnticipos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticiposConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipos.jLabeltotalAnticipos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAnticipos(Anticipos anticiposBean,Anticipos anticipos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAnticipos(Anticipos anticiposOrigen,Anticipos anticipos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && anticiposOrigen.getId()!=null && !anticiposOrigen.getId().equals(0L))) {anticipos.setId(anticiposOrigen.getId());}}
			if(conDefault || (!conDefault && anticiposOrigen.getcodigo()!=null && !anticiposOrigen.getcodigo().equals(""))) {anticipos.setcodigo(anticiposOrigen.getcodigo());}
			if(conDefault || (!conDefault && anticiposOrigen.getfecha_desde()!=null && !anticiposOrigen.getfecha_desde().equals(new Date()))) {anticipos.setfecha_desde(anticiposOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && anticiposOrigen.getfecha_hasta()!=null && !anticiposOrigen.getfecha_hasta().equals(new Date()))) {anticipos.setfecha_hasta(anticiposOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && anticiposOrigen.getcodigo_cargo()!=null && !anticiposOrigen.getcodigo_cargo().equals(""))) {anticipos.setcodigo_cargo(anticiposOrigen.getcodigo_cargo());}
			if(conDefault || (!conDefault && anticiposOrigen.getnombre_estructura()!=null && !anticiposOrigen.getnombre_estructura().equals(""))) {anticipos.setnombre_estructura(anticiposOrigen.getnombre_estructura());}
			if(conDefault || (!conDefault && anticiposOrigen.getcodigo_dato()!=null && !anticiposOrigen.getcodigo_dato().equals(""))) {anticipos.setcodigo_dato(anticiposOrigen.getcodigo_dato());}
			if(conDefault || (!conDefault && anticiposOrigen.getnombre_completo()!=null && !anticiposOrigen.getnombre_completo().equals(""))) {anticipos.setnombre_completo(anticiposOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && anticiposOrigen.getsueldo()!=null && !anticiposOrigen.getsueldo().equals(0.0))) {anticipos.setsueldo(anticiposOrigen.getsueldo());}
			if(conDefault || (!conDefault && anticiposOrigen.getfecha()!=null && !anticiposOrigen.getfecha().equals(new Date()))) {anticipos.setfecha(anticiposOrigen.getfecha());}
			if(conDefault || (!conDefault && anticiposOrigen.getvalor()!=null && !anticiposOrigen.getvalor().equals(0.0))) {anticipos.setvalor(anticiposOrigen.getvalor());}
			if(conDefault || (!conDefault && anticiposOrigen.getvalor_adicional()!=null && !anticiposOrigen.getvalor_adicional().equals(0.0))) {anticipos.setvalor_adicional(anticiposOrigen.getvalor_adicional());}
			if(conDefault || (!conDefault && anticiposOrigen.getvalor_prestamo()!=null && !anticiposOrigen.getvalor_prestamo().equals(0.0))) {anticipos.setvalor_prestamo(anticiposOrigen.getvalor_prestamo());}
			if(conDefault || (!conDefault && anticiposOrigen.gettotal()!=null && !anticiposOrigen.gettotal().equals(0.0))) {anticipos.settotal(anticiposOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAnticipos(Anticipos anticipos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.setText(anticipos.getId().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_cargoAnticipos.setText(anticipos.getcodigo_cargo());
			this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_estructuraAnticipos.setText(anticipos.getnombre_estructura());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_datoAnticipos.setText(anticipos.getcodigo_dato());
			this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_completoAnticipos.setText(anticipos.getnombre_completo());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldsueldoAnticipos.setText(anticipos.getsueldo().toString());
			this.jInternalFrameDetalleFormAnticipos.jDateChooserfechaAnticipos.setDate(anticipos.getfecha());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldvalorAnticipos.setText(anticipos.getvalor().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_adicionalAnticipos.setText(anticipos.getvalor_adicional().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_prestamoAnticipos.setText(anticipos.getvalor_prestamo().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldtotalAnticipos.setText(anticipos.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAnticipos(AnticiposBean anticiposBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.setText(anticiposBean.getId().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_cargoAnticipos.setText(anticiposBean.getcodigo_cargo());
			this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_estructuraAnticipos.setText(anticiposBean.getnombre_estructura());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_datoAnticipos.setText(anticiposBean.getcodigo_dato());
			this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_completoAnticipos.setText(anticiposBean.getnombre_completo());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldsueldoAnticipos.setText(anticiposBean.getsueldo().toString());
			this.jInternalFrameDetalleFormAnticipos.jDateChooserfechaAnticipos.setDate(anticiposBean.getfecha());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldvalorAnticipos.setText(anticiposBean.getvalor().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_adicionalAnticipos.setText(anticiposBean.getvalor_adicional().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_prestamoAnticipos.setText(anticiposBean.getvalor_prestamo().toString());
			this.jInternalFrameDetalleFormAnticipos.jTextFieldtotalAnticipos.setText(anticiposBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAnticipos(AnticiposParameterReturnGeneral anticiposReturnGeneral,AnticiposBean anticiposBean,Boolean conDefault) throws Exception { 
		try {
			Anticipos anticiposLocal=new Anticipos();
			
			anticiposLocal=anticiposReturnGeneral.getAnticipos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && anticiposLocal.getId()!=null && !anticiposLocal.getId().equals(0L))) {anticiposBean.setId(anticiposLocal.getId());}}
			if(conDefault || (!conDefault && anticiposLocal.getcodigo_cargo()!=null && !anticiposLocal.getcodigo_cargo().equals(""))) {anticiposBean.setcodigo_cargo(anticiposLocal.getcodigo_cargo());}
			if(conDefault || (!conDefault && anticiposLocal.getnombre_estructura()!=null && !anticiposLocal.getnombre_estructura().equals(""))) {anticiposBean.setnombre_estructura(anticiposLocal.getnombre_estructura());}
			if(conDefault || (!conDefault && anticiposLocal.getcodigo_dato()!=null && !anticiposLocal.getcodigo_dato().equals(""))) {anticiposBean.setcodigo_dato(anticiposLocal.getcodigo_dato());}
			if(conDefault || (!conDefault && anticiposLocal.getnombre_completo()!=null && !anticiposLocal.getnombre_completo().equals(""))) {anticiposBean.setnombre_completo(anticiposLocal.getnombre_completo());}
			if(conDefault || (!conDefault && anticiposLocal.getsueldo()!=null && !anticiposLocal.getsueldo().equals(0.0))) {anticiposBean.setsueldo(anticiposLocal.getsueldo());}
			if(conDefault || (!conDefault && anticiposLocal.getfecha()!=null && !anticiposLocal.getfecha().equals(new Date()))) {anticiposBean.setfecha(anticiposLocal.getfecha());}
			if(conDefault || (!conDefault && anticiposLocal.getvalor()!=null && !anticiposLocal.getvalor().equals(0.0))) {anticiposBean.setvalor(anticiposLocal.getvalor());}
			if(conDefault || (!conDefault && anticiposLocal.getvalor_adicional()!=null && !anticiposLocal.getvalor_adicional().equals(0.0))) {anticiposBean.setvalor_adicional(anticiposLocal.getvalor_adicional());}
			if(conDefault || (!conDefault && anticiposLocal.getvalor_prestamo()!=null && !anticiposLocal.getvalor_prestamo().equals(0.0))) {anticiposBean.setvalor_prestamo(anticiposLocal.getvalor_prestamo());}
			if(conDefault || (!conDefault && anticiposLocal.gettotal()!=null && !anticiposLocal.gettotal().equals(0.0))) {anticiposBean.settotal(anticiposLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAnticiposGenerico(Long idAnticiposSeleccionado,JComboBox jComboBoxAnticipos,List<Anticipos> anticipossLocal)throws Exception {
		try {
			Anticipos  anticiposTemp=null;

			for(Anticipos anticiposAux:anticipossLocal) {
				if(anticiposAux.getId()!=null && anticiposAux.getId().equals(idAnticiposSeleccionado)) {
					anticiposTemp=anticiposAux;
					break;
				}
			}

			jComboBoxAnticipos.setSelectedItem(anticiposTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAnticiposGenerico(JComboBox jComboBoxAnticipos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAnticipos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAnticipos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAnticipos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAnticipos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			anticipos=(Anticipos) anticiposLogic.getAnticiposs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			anticipos =(Anticipos) anticiposs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!anticipos.getIsNew() && !anticipos.getIsChanged() && !anticipos.getIsDeleted()) {
				sDescripcion=anticipos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=anticipos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoContrato")) {
			//sDescripcion=this.getActualTipoContratoForeignKeyDescripcion((Long)value);
			if(!anticipos.getIsNew() && !anticipos.getIsChanged() && !anticipos.getIsDeleted()) {
				sDescripcion=anticipos.gettipocontrato_descripcion();
			} else {
				//sDescripcion=this.getActualTipoContratoForeignKeyDescripcion((Long)value);
				sDescripcion=anticipos.gettipocontrato_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Anticipos anticiposRow=new Anticipos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			anticiposRow=(Anticipos) anticiposLogic.getAnticiposs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			anticiposRow=(Anticipos) anticiposs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAnticipos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAnticipos.setVisible((this.isVisibilidadCeldaNuevoAnticipos && this.isPermisoNuevoAnticipos));			
			this.jButtonDuplicarAnticipos.setVisible((this.isVisibilidadCeldaDuplicarAnticipos && this.isPermisoDuplicarAnticipos));			
			this.jButtonCopiarAnticipos.setVisible((this.isVisibilidadCeldaCopiarAnticipos && this.isPermisoCopiarAnticipos));
			this.jButtonVerFormAnticipos.setVisible((this.isVisibilidadCeldaVerFormAnticipos && this.isPermisoVerFormAnticipos));
			
			this.jButtonAbrirOrderByAnticipos.setVisible((this.isVisibilidadCeldaOrdenAnticipos && this.isPermisoOrdenAnticipos));			
			
			this.jButtonNuevoRelacionesAnticipos.setVisible((this.isVisibilidadCeldaNuevoRelacionesAnticipos && this.isPermisoNuevoAnticipos));			
			this.jButtonNuevoGuardarCambiosAnticipos.setVisible((this.isVisibilidadCeldaNuevoAnticipos && this.isPermisoNuevoAnticipos && this.isPermisoGuardarCambiosAnticipos));
			
			if(this.jInternalFrameDetalleFormAnticipos!=null) {
			this.jInternalFrameDetalleFormAnticipos.jButtonModificarAnticipos.setVisible((this.isVisibilidadCeldaModificarAnticipos && this.isPermisoActualizarAnticipos));	
			this.jInternalFrameDetalleFormAnticipos.jButtonActualizarAnticipos.setVisible((this.isVisibilidadCeldaActualizarAnticipos && this.isPermisoActualizarAnticipos));	
			this.jInternalFrameDetalleFormAnticipos.jButtonEliminarAnticipos.setVisible((this.isVisibilidadCeldaEliminarAnticipos && this.isPermisoEliminarAnticipos));
			this.jInternalFrameDetalleFormAnticipos.jButtonCancelarAnticipos.setVisible(this.isVisibilidadCeldaCancelarAnticipos);							
			this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosAnticipos.setVisible((this.isVisibilidadCeldaGuardarAnticipos && this.isPermisoGuardarCambiosAnticipos));			
			
			}
						
			this.jButtonGuardarCambiosTablaAnticipos.setVisible((this.isVisibilidadCeldaGuardarCambiosAnticipos && this.isPermisoGuardarCambiosAnticipos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAnticipos.setVisible((this.isVisibilidadCeldaNuevoAnticipos && this.isPermisoNuevoAnticipos));						
			this.jButtonDuplicarToolBarAnticipos.setVisible((this.isVisibilidadCeldaDuplicarAnticipos && this.isPermisoDuplicarAnticipos));						
			this.jButtonCopiarToolBarAnticipos.setVisible((this.isVisibilidadCeldaCopiarAnticipos && this.isPermisoCopiarAnticipos));			
			this.jButtonVerFormToolBarAnticipos.setVisible((this.isVisibilidadCeldaVerFormAnticipos && this.isPermisoVerFormAnticipos));			
			this.jButtonAbrirOrderByToolBarAnticipos.setVisible((this.isVisibilidadCeldaOrdenAnticipos && this.isPermisoOrdenAnticipos));
			this.jButtonNuevoRelacionesToolBarAnticipos.setVisible((this.isVisibilidadCeldaNuevoRelacionesAnticipos && this.isPermisoNuevoAnticipos));			
			this.jButtonNuevoGuardarCambiosToolBarAnticipos.setVisible((this.isVisibilidadCeldaNuevoAnticipos && this.isPermisoNuevoAnticipos && this.isPermisoGuardarCambiosAnticipos));			
			
			if(this.jInternalFrameDetalleFormAnticipos!=null) {
			this.jInternalFrameDetalleFormAnticipos.jButtonModificarToolBarAnticipos.setVisible((this.isVisibilidadCeldaModificarAnticipos && this.isPermisoActualizarAnticipos));	
			this.jInternalFrameDetalleFormAnticipos.jButtonActualizarToolBarAnticipos.setVisible((this.isVisibilidadCeldaActualizarAnticipos  && this.isPermisoActualizarAnticipos));	
			this.jInternalFrameDetalleFormAnticipos.jButtonEliminarToolBarAnticipos.setVisible((this.isVisibilidadCeldaEliminarAnticipos && this.isPermisoEliminarAnticipos));
			this.jInternalFrameDetalleFormAnticipos.jButtonCancelarToolBarAnticipos.setVisible(this.isVisibilidadCeldaCancelarAnticipos);				
			this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosToolBarAnticipos.setVisible((this.isVisibilidadCeldaGuardarAnticipos && this.isPermisoGuardarCambiosAnticipos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAnticipos.setVisible((this.isVisibilidadCeldaGuardarCambiosAnticipos && this.isPermisoGuardarCambiosAnticipos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAnticipos.setVisible((this.isVisibilidadCeldaNuevoAnticipos && this.isPermisoNuevoAnticipos));			
			this.jMenuItemDuplicarAnticipos.setVisible((this.isVisibilidadCeldaDuplicarAnticipos && this.isPermisoDuplicarAnticipos));			
			this.jMenuItemCopiarAnticipos.setVisible((this.isVisibilidadCeldaCopiarAnticipos && this.isPermisoCopiarAnticipos));			
			this.jMenuItemVerFormAnticipos.setVisible((this.isVisibilidadCeldaVerFormAnticipos && this.isPermisoVerFormAnticipos));			
			this.jMenuItemAbrirOrderByAnticipos.setVisible((this.isVisibilidadCeldaOrdenAnticipos && this.isPermisoOrdenAnticipos));			
			//this.jMenuItemMostrarOcultarAnticipos.setVisible((this.isVisibilidadCeldaOrdenAnticipos && this.isPermisoOrdenAnticipos));
			this.jMenuItemDetalleAbrirOrderByAnticipos.setVisible((this.isVisibilidadCeldaOrdenAnticipos && this.isPermisoOrdenAnticipos));			
			//this.jMenuItemDetalleMostrarOcultarAnticipos.setVisible((this.isVisibilidadCeldaOrdenAnticipos && this.isPermisoOrdenAnticipos));			
			this.jMenuItemNuevoRelacionesAnticipos.setVisible((this.isVisibilidadCeldaNuevoRelacionesAnticipos && this.isPermisoNuevoAnticipos));			
			this.jMenuItemNuevoGuardarCambiosAnticipos.setVisible((this.isVisibilidadCeldaNuevoAnticipos && this.isPermisoNuevoAnticipos && this.isPermisoGuardarCambiosAnticipos));									
			
			if(this.jInternalFrameDetalleFormAnticipos!=null) {
			this.jInternalFrameDetalleFormAnticipos.jMenuItemModificarAnticipos.setVisible((this.isVisibilidadCeldaModificarAnticipos && this.isPermisoActualizarAnticipos));	
			this.jInternalFrameDetalleFormAnticipos.jMenuItemActualizarAnticipos.setVisible((this.isVisibilidadCeldaActualizarAnticipos && this.isPermisoActualizarAnticipos));	
			this.jInternalFrameDetalleFormAnticipos.jMenuItemEliminarAnticipos.setVisible((this.isVisibilidadCeldaEliminarAnticipos && this.isPermisoEliminarAnticipos));
			this.jInternalFrameDetalleFormAnticipos.jMenuItemCancelarAnticipos.setVisible(this.isVisibilidadCeldaCancelarAnticipos);				
			}
			
			this.jMenuItemGuardarCambiosAnticipos.setVisible((this.isVisibilidadCeldaGuardarAnticipos && this.isPermisoGuardarCambiosAnticipos));						
			this.jMenuItemGuardarCambiosTablaAnticipos.setVisible((this.isVisibilidadCeldaGuardarCambiosAnticipos && this.isPermisoGuardarCambiosAnticipos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAnticipos=this.jButtonNuevoAnticipos.isVisible();
			this.isVisibilidadCeldaDuplicarAnticipos=this.jButtonDuplicarAnticipos.isVisible();
			this.isVisibilidadCeldaCopiarAnticipos=this.jButtonCopiarAnticipos.isVisible();
			this.isVisibilidadCeldaVerFormAnticipos=this.jButtonVerFormAnticipos.isVisible();
			
			this.isVisibilidadCeldaOrdenAnticipos=this.jButtonAbrirOrderByAnticipos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=this.jButtonNuevoRelacionesAnticipos.isVisible();
			this.isVisibilidadCeldaModificarAnticipos=this.jButtonModificarAnticipos.isVisible();
			
			if(this.jInternalFrameDetalleFormAnticipos!=null) {
			this.isVisibilidadCeldaActualizarAnticipos=this.jInternalFrameDetalleFormAnticipos.jButtonActualizarAnticipos.isVisible();
			this.isVisibilidadCeldaEliminarAnticipos=this.jInternalFrameDetalleFormAnticipos.jButtonEliminarAnticipos.isVisible();
			this.isVisibilidadCeldaCancelarAnticipos=this.jInternalFrameDetalleFormAnticipos.jButtonCancelarAnticipos.isVisible();
			this.isVisibilidadCeldaGuardarAnticipos=this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosAnticipos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAnticipos=this.jButtonGuardarCambiosTablaAnticipos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAnticipos=this.jButtonNuevoToolBarAnticipos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=this.jButtonNuevoRelacionesToolBarAnticipos.isVisible();
			
			if(this.jInternalFrameDetalleFormAnticipos!=null) {
			this.isVisibilidadCeldaModificarAnticipos=this.jInternalFrameDetalleFormAnticipos.jButtonModificarToolBarAnticipos.isVisible();
			this.isVisibilidadCeldaActualizarAnticipos=this.jInternalFrameDetalleFormAnticipos.jButtonActualizarToolBarAnticipos.isVisible();
			this.isVisibilidadCeldaEliminarAnticipos=this.jInternalFrameDetalleFormAnticipos.jButtonEliminarToolBarAnticipos.isVisible();
			this.isVisibilidadCeldaCancelarAnticipos=this.jInternalFrameDetalleFormAnticipos.jButtonCancelarToolBarAnticipos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAnticipos=this.jButtonGuardarCambiosToolBarAnticipos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAnticipos=this.jButtonGuardarCambiosTablaToolBarAnticipos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAnticipos=this.jMenuItemNuevoAnticipos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=this.jMenuItemNuevoRelacionesAnticipos.isVisible();
			
			if(this.jInternalFrameDetalleFormAnticipos!=null) {
			this.isVisibilidadCeldaModificarAnticipos=this.jInternalFrameDetalleFormAnticipos.jMenuItemModificarAnticipos.isVisible();
			this.isVisibilidadCeldaActualizarAnticipos=this.jInternalFrameDetalleFormAnticipos.jMenuItemActualizarAnticipos.isVisible();
			this.isVisibilidadCeldaEliminarAnticipos=this.jInternalFrameDetalleFormAnticipos.jMenuItemEliminarAnticipos.isVisible();
			this.isVisibilidadCeldaCancelarAnticipos=this.jInternalFrameDetalleFormAnticipos.jMenuItemCancelarAnticipos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAnticipos=this.jMenuItemGuardarCambiosAnticipos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAnticipos=this.jMenuItemGuardarCambiosTablaAnticipos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAnticipos(Boolean esInicializar) {
		if(AnticiposJInternalFrame.ISBINDING_MANUAL) {			
			if(this.anticiposSessionBean.getConGuardarRelaciones()) {
				//if(this.anticiposSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAnticipos();
			}
			
			this.inicializarActualizarBindingBotonesManualAnticipos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAnticipos() {
		this.jButtonNuevoAnticipos.setVisible(this.isPermisoNuevoAnticipos);			
		this.jButtonDuplicarAnticipos.setVisible(this.isPermisoDuplicarAnticipos);			
		this.jButtonCopiarAnticipos.setVisible(this.isPermisoCopiarAnticipos);			
		this.jButtonVerFormAnticipos.setVisible(this.isPermisoVerFormAnticipos);			
		
		this.jButtonAbrirOrderByAnticipos.setVisible(this.isPermisoOrdenAnticipos);					
		
		this.jButtonNuevoRelacionesAnticipos.setVisible(this.isPermisoNuevoAnticipos);			
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jButtonModificarAnticipos.setVisible(this.isPermisoActualizarAnticipos);	
			this.jInternalFrameDetalleFormAnticipos.jButtonActualizarAnticipos.setVisible(this.isPermisoActualizarAnticipos);	
			this.jInternalFrameDetalleFormAnticipos.jButtonEliminarAnticipos.setVisible(this.isPermisoEliminarAnticipos);
			this.jInternalFrameDetalleFormAnticipos.jButtonCancelarAnticipos.setVisible(this.isVisibilidadCeldaCancelarAnticipos);						
			this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosAnticipos.setVisible(this.isPermisoGuardarCambiosAnticipos);							
		}
		
		this.jButtonGuardarCambiosTablaAnticipos.setVisible(this.isPermisoActualizarAnticipos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAnticipos() {
		this.jInternalFrameDetalleFormAnticipos.jButtonModificarAnticipos.setVisible(this.isPermisoActualizarAnticipos);	
		this.jInternalFrameDetalleFormAnticipos.jButtonActualizarAnticipos.setVisible(this.isPermisoActualizarAnticipos);	
		this.jInternalFrameDetalleFormAnticipos.jButtonEliminarAnticipos.setVisible(this.isPermisoEliminarAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jButtonCancelarAnticipos.setVisible(this.isVisibilidadCeldaCancelarAnticipos);							
		this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosAnticipos.setVisible((this.isVisibilidadCeldaGuardarAnticipos && this.isPermisoGuardarCambiosAnticipos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAnticipos() {
		if(AnticiposJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAnticipos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAnticipos() {
	}
	
	public void jTableDatosAnticiposListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAnticipos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.anticipos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAnticiposUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAnticipos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAnticipos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAnticipos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.anticiposLogic.getConnexion());

				if(this.anticipos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.anticipos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAnticipos=(TitledBorder)this.jScrollPanelDatosAnticipos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAnticipos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.anticipos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_contratoAnticiposUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocontrato=true;

			idTienePermisotipocontrato=this.tienePermisosUsuarioEnPaginaWebAnticipos(TipoContratoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocontrato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAnticipos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAnticipos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);

				this.tipocontratoBeanSwingJInternalFrame=new TipoContratoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocontratoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocontratoBeanSwingJInternalFrame.getTipoContratoLogic().setConnexion(this.anticiposLogic.getConnexion());

				if(this.anticipos.getid_tipo_contrato()!=null) {
					this.tipocontratoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocontratoBeanSwingJInternalFrame.setIdActual(this.anticipos.getid_tipo_contrato());
					this.tipocontratoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocontratoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocontratoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoContrato();
				}

				JInternalFrameBase jinternalFrame =this.tipocontratoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAnticipos=(TitledBorder)this.jScrollPanelDatosAnticipos.getBorder();
				TitledBorder titledBordertipocontrato=(TitledBorder)this.tipocontratoBeanSwingJInternalFrame.jScrollPanelDatosTipoContrato.getBorder();

				titledBordertipocontrato.setTitle(titledBorderAnticipos.getTitle() + " -> Tipo Contrato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_contratoAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getid_tipo_contrato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_contrato = "+this.anticipos.getid_tipo_contrato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.anticipos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.anticipos.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.anticipos.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cargoAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getcodigo_cargo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cargo like '%"+this.anticipos.getcodigo_cargo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_estructuraAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getnombre_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_estructura like '%"+this.anticipos.getnombre_estructura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_datoAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getcodigo_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_dato like '%"+this.anticipos.getcodigo_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.anticipos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsueldoAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getsueldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sueldo = "+this.anticipos.getsueldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.anticipos.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.anticipos.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_adicionalAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getvalor_adicional()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_adicional = "+this.anticipos.getvalor_adicional().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_prestamoAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.getvalor_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_prestamo = "+this.anticipos.getvalor_prestamo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalAnticiposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.getanticipos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipos==null) {
						this.anticipos = new Anticipos();
					}

					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);
				}

				if(this.anticipos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.anticipos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaAnticiposAnticiposActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAnticipos(false,false);

			this.getAnticipossBusquedaAnticipos();

			this.inicializarActualizarBindingAnticipos(false);

			//if(AnticiposBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAnticipos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAnticiposActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAnticipos(false,false);

			this.getAnticipossFK_IdEmpresa();

			this.inicializarActualizarBindingAnticipos(false);

			//if(AnticiposBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAnticipos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoContratoAnticiposActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAnticipos(false,false);

			this.getAnticipossFK_IdTipoContrato();

			this.inicializarActualizarBindingAnticipos(false);

			//if(AnticiposBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAnticipos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticiposLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAnticipos() {
		if(this.jInternalFrameDetalleFormAnticipos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) {
			this.jInternalFrameDetalleFormAnticipos.setVisible(false);	    			
			this.jInternalFrameDetalleFormAnticipos.dispose();
			this.jInternalFrameDetalleFormAnticipos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAnticipos!=null) {
			this.jInternalFrameReporteDinamicoAnticipos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAnticipos.dispose();
			this.jInternalFrameReporteDinamicoAnticipos=null;
		}
		
		if(this.jInternalFrameImportacionAnticipos!=null) {
			this.jInternalFrameImportacionAnticipos.setVisible(false);	    			
			this.jInternalFrameImportacionAnticipos.dispose();
			this.jInternalFrameImportacionAnticipos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAnticipos();
			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
			
			if(sTipo.equals("NuevoAnticipos")) {
				jButtonNuevoAnticiposActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAnticipos")) {
				jButtonDuplicarAnticiposActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAnticipos")) {
				jButtonCopiarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("VerFormAnticipos")) {
				jButtonVerFormAnticiposActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAnticipos")) {
				jButtonNuevoAnticiposActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAnticipos")) {
				jButtonDuplicarAnticiposActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAnticipos")) {
				jButtonNuevoAnticiposActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAnticipos")) {
				jButtonDuplicarAnticiposActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAnticipos")) {
				jButtonNuevoAnticiposActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAnticipos")) {
				jButtonNuevoAnticiposActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAnticipos")) {
				jButtonNuevoAnticiposActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAnticipos")) {
				jButtonModificarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAnticipos")) {
				jButtonModificarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAnticipos")) {
				jButtonModificarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAnticipos")) {
				jButtonActualizarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAnticipos")) {
				jButtonActualizarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAnticipos")) {
				jButtonActualizarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("EliminarAnticipos")) {
				jButtonEliminarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAnticipos")) {
				jButtonEliminarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAnticipos")) {
				jButtonEliminarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("CancelarAnticipos")) {
				jButtonCancelarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAnticipos")) {
				jButtonCancelarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAnticipos")) {
				jButtonCancelarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("CerrarAnticipos")) {
				jButtonCerrarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAnticipos")) {
				jButtonCerrarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAnticipos")) {
				jButtonCerrarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAnticipos")) {
				jButtonMostrarOcultarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAnticipos")) {
				jButtonCancelarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAnticipos")) {
				jButtonGuardarCambiosAnticiposActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAnticipos")) {
				jButtonGuardarCambiosAnticiposActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAnticipos")) {
				jButtonCopiarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAnticipos")) {
				jButtonVerFormAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAnticipos")) {
				jButtonGuardarCambiosAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAnticipos")) {
				jButtonCopiarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAnticipos")) {
				jButtonVerFormAnticiposActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAnticipos")) {
				jButtonGuardarCambiosAnticiposActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAnticipos")) {
				jButtonGuardarCambiosAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAnticipos")) {
				jButtonGuardarCambiosAnticiposActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAnticipos")) {
				jButtonRecargarInformacionAnticiposActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAnticipos")) {
				jButtonRecargarInformacionAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAnticipos")) {
				jButtonRecargarInformacionAnticiposActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAnticipos")) {
				jButtonAnterioresAnticiposActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAnticipos")) {
				jButtonAnterioresAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAnticipos")) {
				jButtonAnterioresAnticiposActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAnticipos")) {
				jButtonSiguientesAnticiposActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAnticipos")) {
				jButtonSiguientesAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAnticipos")) {
				jButtonSiguientesAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAnticipos") || sTipo.equals("MenuItemDetalleAbrirOrderByAnticipos")) {
				jButtonAbrirOrderByAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAnticipos") || sTipo.equals("MenuItemDetalleMostrarOcultarAnticipos")) {
				jButtonMostrarOcultarAnticiposActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAnticipos")) {
				jButtonNuevoGuardarCambiosAnticiposActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAnticipos")) {
				jButtonNuevoGuardarCambiosAnticiposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAnticipos")) {
				jButtonNuevoGuardarCambiosAnticiposActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAnticipos")) {
				jButtonCerrarReporteDinamicoAnticiposActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAnticipos")) {
				jButtonGenerarReporteDinamicoAnticiposActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAnticipos")) {
				
				jButtonGenerarExcelReporteDinamicoAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAnticipos")) {
				jButtonCerrarImportacionAnticiposActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAnticipos")) {
				
				jButtonGenerarImportacionAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAnticipos")) {
				
				jButtonAbrirImportacionAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAnticipos")) {
				jComboBoxTiposAccionesAnticiposActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAnticipos")) {
				jComboBoxTiposRelacionesAnticiposActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAnticipos")) {
				jComboBoxTiposAccionesAnticiposActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAnticipos")) {
				
				jComboBoxTiposSeleccionarAnticiposActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAnticipos")) {
				jTextFieldValorCampoGeneralAnticiposActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAnticipos")) {
				jButtonAbrirOrderByAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAnticipos")) {
				jButtonAbrirOrderByAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAnticipos")) {
				jButtonCerrarOrderByAnticiposActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAnticiposBusqueda")) {
				this.jButtonidAnticiposBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAnticiposUpdate")) {
				this.jButtonid_empresaAnticiposUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAnticiposBusqueda")) {
				this.jButtonid_empresaAnticiposBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_contratoAnticiposUpdate")) {
				this.jButtonid_tipo_contratoAnticiposUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_contratoAnticiposBusqueda")) {
				this.jButtonid_tipo_contratoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAnticiposBusqueda")) {
				this.jButtoncodigoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeAnticiposBusqueda")) {
				this.jButtonfecha_desdeAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaAnticiposBusqueda")) {
				this.jButtonfecha_hastaAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cargoAnticiposBusqueda")) {
				this.jButtoncodigo_cargoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_estructuraAnticiposBusqueda")) {
				this.jButtonnombre_estructuraAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoAnticiposBusqueda")) {
				this.jButtoncodigo_datoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoAnticiposBusqueda")) {
				this.jButtonnombre_completoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sueldoAnticiposBusqueda")) {
				this.jButtonsueldoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAnticiposBusqueda")) {
				this.jButtonfechaAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorAnticiposBusqueda")) {
				this.jButtonvalorAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_adicionalAnticiposBusqueda")) {
				this.jButtonvalor_adicionalAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_prestamoAnticiposBusqueda")) {
				this.jButtonvalor_prestamoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalAnticiposBusqueda")) {
				this.jButtontotalAnticiposBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaAnticiposAnticipos")) {
				this.jButtonBusquedaAnticiposAnticiposActionPerformed(evt);
			}
			
			;
			
			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAnticipos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticiposActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				


				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Anticipos anticiposLocal=null;
			
			if(!this.getEsControlTabla()) {
				anticiposLocal=this.anticipos;
			} else {
				anticiposLocal=this.anticiposAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
							
				
				


				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticiposActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposAnterior =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticiposAnterior =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
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
			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
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
			
			


			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticiposActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
								
						
				


				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
								
				
				


				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticiposActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposAnterior =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticiposAnterior =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticiposActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposAnterior =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticiposAnterior =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticiposActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
							
				
				


				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticiposActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticiposAnterior =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.anticiposAnterior =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
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
			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
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
			
			


			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticiposActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
								
				
				


				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticiposActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposAnterior =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticiposAnterior =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticiposActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticiposActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAnticipos")) {
					jCheckBoxSeleccionarTodosAnticiposItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAnticipos")) {
					jCheckBoxSeleccionadosAnticiposItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAnticipos")) {
					
				}
				
				


				
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
												
				
				


				
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticiposActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticiposAnterior =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.anticiposAnterior =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticiposActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
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
			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
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
			
			


			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticiposActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipos);
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
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
				
				


				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anticipos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anticipos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticiposActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticiposAnterior =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticiposAnterior =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAnticipos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAnticiposListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAnticipos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.anticipos =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.anticipos =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.anticipos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAnticipos")) {
				
				}
				
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAnticipos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAnticipos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAnticipos")) {
			
			}
			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAnticipos();
			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
			if(sTipo.equals("NuevoAnticipos")) {
				jButtonNuevoAnticiposActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAnticipos")) {
				jButtonDuplicarAnticiposActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAnticipos")) {
				jButtonCopiarAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAnticipos")) {
				jButtonVerFormAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAnticipos")) {
				jButtonNuevoAnticiposActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAnticipos")) {
				jButtonModificarAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAnticipos")) {
				jButtonActualizarAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAnticipos")) {
				jButtonEliminarAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAnticipos")) {
				jButtonGuardarCambiosAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAnticipos")) {
				jButtonCancelarAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAnticipos")) {
				jButtonCerrarAnticiposActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAnticipos")) {
				jButtonGuardarCambiosAnticiposActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAnticipos")) {
				jButtonNuevoGuardarCambiosAnticiposActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAnticipos")) {
				jButtonAbrirOrderByAnticiposActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAnticipos")) {
				jButtonRecargarInformacionAnticiposActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAnticipos")) {
				jButtonAnterioresAnticiposActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAnticipos")) {
				jButtonSiguientesAnticiposActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAnticiposBusqueda")) {
				this.jButtonidAnticiposBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAnticiposUpdate")) {
				this.jButtonid_empresaAnticiposUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAnticiposBusqueda")) {
				this.jButtonid_empresaAnticiposBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_contratoAnticiposUpdate")) {
				this.jButtonid_tipo_contratoAnticiposUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_contratoAnticiposBusqueda")) {
				this.jButtonid_tipo_contratoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAnticiposBusqueda")) {
				this.jButtoncodigoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeAnticiposBusqueda")) {
				this.jButtonfecha_desdeAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaAnticiposBusqueda")) {
				this.jButtonfecha_hastaAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cargoAnticiposBusqueda")) {
				this.jButtoncodigo_cargoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_estructuraAnticiposBusqueda")) {
				this.jButtonnombre_estructuraAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoAnticiposBusqueda")) {
				this.jButtoncodigo_datoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoAnticiposBusqueda")) {
				this.jButtonnombre_completoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sueldoAnticiposBusqueda")) {
				this.jButtonsueldoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAnticiposBusqueda")) {
				this.jButtonfechaAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorAnticiposBusqueda")) {
				this.jButtonvalorAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_adicionalAnticiposBusqueda")) {
				this.jButtonvalor_adicionalAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_prestamoAnticiposBusqueda")) {
				this.jButtonvalor_prestamoAnticiposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalAnticiposBusqueda")) {
				this.jButtontotalAnticiposBusquedaActionPerformed(evt);
			}
			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAnticipos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAnticipos")) {
				closingInternalFrameAnticipos();
				
			} else if(sTipo.equals("jButtonCancelarAnticipos")) {
				JInternalFrameBase jInternalFrameDetalleFormAnticipos = (JInternalFrameBase)evt.getSource();
	            	
	            AnticiposBeanSwingJInternalFrame jInternalFrameParent=(AnticiposBeanSwingJInternalFrame)jInternalFrameDetalleFormAnticipos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAnticiposActionPerformed(null);
			}
			
			AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.anticipos,new Object(),this.anticiposParameterGeneral,this.anticiposReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAnticipos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAnticipos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAnticipos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.anticipos)) {
			if(!esControlTabla) {
				if(AnticiposJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);			
				}
				
				if(this.anticiposSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAnticipos(this.anticipos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAnticipos(this.anticiposReturnGeneral,this.anticiposBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.anticiposSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAnticipos(classes,this.anticiposReturnGeneral,this.anticiposBean,false);
					}
						
					if(this.anticiposReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAnticipos(this.anticiposReturnGeneral.getAnticipos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAnticipos(this.anticiposReturnGeneral.getAnticipos());	
					}
						
					if(this.anticiposReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAnticipos(this.anticiposReturnGeneral.getAnticipos(),classes);//this.anticiposBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAnticipos(this.anticipos,classes);//this.anticiposBean);									
				}
			
				if(AnticiposJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAnticipos(this.anticipos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipos(this.anticipos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.anticiposAnterior!=null) {
						this.anticipos=this.anticiposAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.anticiposSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.anticiposSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.anticiposReturnGeneral.getAnticipos(),anticiposLogic.getAnticiposs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.anticiposReturnGeneral.getAnticipos(),this.anticiposs);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAnticipos.repaint();
				
				//((AbstractTableModel) this.jTableDatosAnticipos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAnticipos();
			}
		}
	}
	
	public void actualizarVisualTableDatosAnticipos() throws Exception {
		
		AnticiposModel anticiposModel=(AnticiposModel)this.jTableDatosAnticipos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			anticiposModel.anticiposs=this.anticiposLogic.getAnticiposs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			anticiposModel.anticiposs=this.anticiposs;
		}
		
		
		((AnticiposModel) this.jTableDatosAnticipos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAnticipos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getanticiposAnterior(),this.anticiposLogic.getAnticiposs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getanticiposAnterior(),this.anticiposs);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAnticipos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAnticipos(Anticipos anticipos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
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
										
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.anticipos,new Object(),generalEntityParameterGeneral,this.anticiposReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.anticiposSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AnticiposConstantesFunciones.getClassesRelationshipsOfAnticipos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AnticiposConstantesFunciones.getClassesRelationshipsFromStringsOfAnticipos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAnticipos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AnticiposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.anticipos,new Object(),generalEntityParameterGeneral,this.anticiposReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAnticipos(AnticiposBean anticiposBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAnticipos(ArrayList<Classe> classes,AnticiposReturnGeneral anticiposReturnGeneral,AnticiposBean anticiposBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAnticipos(Anticipos anticipos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.anticipos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAnticipos = new AnticiposDetalleFormJInternalFrame(jDesktopPane,this.anticiposSessionBean.getConGuardarRelaciones(),this.anticiposSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAnticipos);
		this.jInternalFrameDetalleFormAnticipos.setVisible(false);
		this.jInternalFrameDetalleFormAnticipos.setSelected(false);						
		
		this.jInternalFrameDetalleFormAnticipos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAnticipos.anticiposLogic=this.anticiposLogic;
		
		this.cargarCombosFrameForeignKeyAnticipos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAnticipos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAnticipos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAnticipos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAnticipos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAnticipos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAnticipos"));
		
		this.jInternalFrameDetalleFormAnticipos.jButtonModificarAnticipos.addActionListener(new ButtonActionListener(this,"ModificarAnticipos"));

		
		this.jInternalFrameDetalleFormAnticipos.jButtonModificarToolBarAnticipos.addActionListener(new ButtonActionListener(this,"ModificarToolBarAnticipos"));
					
		this.jInternalFrameDetalleFormAnticipos.jMenuItemModificarAnticipos.addActionListener(new ButtonActionListener(this,"MenuItemModificarAnticipos"));		
		
		
		
		this.jInternalFrameDetalleFormAnticipos.jButtonActualizarAnticipos.addActionListener (new ButtonActionListener(this,"ActualizarAnticipos"));
		
		
		this.jInternalFrameDetalleFormAnticipos.jButtonActualizarToolBarAnticipos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAnticipos"));
						
		this.jInternalFrameDetalleFormAnticipos.jMenuItemActualizarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAnticipos"));		
		
		
		
		this.jInternalFrameDetalleFormAnticipos.jButtonEliminarAnticipos.addActionListener (new ButtonActionListener(this,"EliminarAnticipos"));
		
		
		this.jInternalFrameDetalleFormAnticipos.jButtonEliminarToolBarAnticipos.addActionListener (new ButtonActionListener(this,"EliminarToolBarAnticipos"));
								
		this.jInternalFrameDetalleFormAnticipos.jMenuItemEliminarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAnticipos"));		
		
		
		
		this.jInternalFrameDetalleFormAnticipos.jButtonCancelarAnticipos.addActionListener (new ButtonActionListener(this,"CancelarAnticipos"));
		
		
		this.jInternalFrameDetalleFormAnticipos.jButtonCancelarToolBarAnticipos.addActionListener (new ButtonActionListener(this,"CancelarToolBarAnticipos"));
					
		this.jInternalFrameDetalleFormAnticipos.jMenuItemCancelarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAnticipos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAnticipos.jMenuItemDetalleCerrarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAnticipos"));		
		
		
		
		this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosToolBarAnticipos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAnticipos"));
		
		
		
		this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosToolBarAnticipos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAnticipos"));
		
		
		
		this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAnticipos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonidAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"idAnticiposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipos.jButtonid_empresaAnticiposUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAnticiposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonid_empresaAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAnticiposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipos.jButtonid_tipo_contratoAnticiposUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_contratoAnticiposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonid_tipo_contratoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_contratoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtoncodigoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"codigoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonfecha_desdeAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonfecha_hastaAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtoncodigo_cargoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cargoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonnombre_estructuraAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estructuraAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtoncodigo_datoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonnombre_completoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonsueldoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"sueldoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonfechaAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"fechaAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonvalorAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"valorAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonvalor_adicionalAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"valor_adicionalAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonvalor_prestamoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"valor_prestamoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtontotalAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"totalAnticiposBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAnticipos.jTabbedPaneRelacionesAnticipos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAnticipos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAnticipos"));
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAnticipos"));
		}
		
		this.jTableDatosAnticipos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAnticipos"));
		
		this.jTableDatosAnticipos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAnticipos"));
		
		this.jButtonNuevoAnticipos.addActionListener(new ButtonActionListener(this,"NuevoAnticipos"));
		
		this.jButtonDuplicarAnticipos.addActionListener(new ButtonActionListener(this,"DuplicarAnticipos"));
		
		this.jButtonCopiarAnticipos.addActionListener(new ButtonActionListener(this,"CopiarAnticipos"));
		
		this.jButtonVerFormAnticipos.addActionListener(new ButtonActionListener(this,"VerFormAnticipos"));
		
		
		this.jButtonNuevoToolBarAnticipos.addActionListener(new ButtonActionListener(this,"NuevoToolBarAnticipos"));
			
		this.jButtonDuplicarToolBarAnticipos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAnticipos"));
			
		this.jMenuItemNuevoAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAnticipos"));
			
		this.jMenuItemDuplicarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAnticipos"));		
		
		
		this.jButtonNuevoRelacionesAnticipos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAnticipos"));
		
		
		this.jButtonNuevoRelacionesToolBarAnticipos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAnticipos"));
			
		this.jMenuItemNuevoRelacionesAnticipos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAnticipos"));		
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jButtonModificarAnticipos.addActionListener(new ButtonActionListener(this,"ModificarAnticipos"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jButtonModificarToolBarAnticipos.addActionListener(new ButtonActionListener(this,"ModificarToolBarAnticipos"));
			
			this.jInternalFrameDetalleFormAnticipos.jMenuItemModificarAnticipos.addActionListener(new ButtonActionListener(this,"MenuItemModificarAnticipos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAnticipos.jButtonActualizarAnticipos.addActionListener (new ButtonActionListener(this,"ActualizarAnticipos"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jButtonActualizarToolBarAnticipos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAnticipos"));
				
			this.jInternalFrameDetalleFormAnticipos.jMenuItemActualizarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAnticipos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jButtonEliminarAnticipos.addActionListener (new ButtonActionListener(this,"EliminarAnticipos"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jButtonEliminarToolBarAnticipos.addActionListener (new ButtonActionListener(this,"EliminarToolBarAnticipos"));
						
			this.jInternalFrameDetalleFormAnticipos.jMenuItemEliminarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAnticipos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jButtonCancelarAnticipos.addActionListener (new ButtonActionListener(this,"CancelarAnticipos"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jButtonCancelarToolBarAnticipos.addActionListener (new ButtonActionListener(this,"CancelarToolBarAnticipos"));
			
			this.jInternalFrameDetalleFormAnticipos.jMenuItemCancelarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAnticipos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAnticipos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAnticipos"));		
		
		
		this.jButtonCerrarAnticipos.addActionListener (new ButtonActionListener(this,"CerrarAnticipos"));
		
		
		this.jButtonCerrarToolBarAnticipos.addActionListener (new ButtonActionListener(this,"CerrarToolBarAnticipos"));
			
		this.jMenuItemCerrarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAnticipos"));
			
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jMenuItemDetalleCerrarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAnticipos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosAnticipos.addActionListener (new ButtonActionListener(this,"GuardarCambiosAnticipos"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosToolBarAnticipos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAnticipos"));
		}
		
		this.jButtonCopiarToolBarAnticipos.addActionListener (new ButtonActionListener(this,"CopiarToolBarAnticipos"));
			
		this.jButtonVerFormToolBarAnticipos.addActionListener (new ButtonActionListener(this,"VerFormToolBarAnticipos"));
		
		this.jMenuItemGuardarCambiosAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAnticipos"));
			
		this.jMenuItemCopiarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAnticipos"));		
		
		this.jMenuItemVerFormAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAnticipos"));		
		
		
		this.jButtonGuardarCambiosTablaAnticipos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAnticipos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAnticipos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAnticipos"));
			
		this.jMenuItemGuardarCambiosTablaAnticipos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAnticipos"));		
		
		
		
		this.jButtonRecargarInformacionAnticipos.addActionListener (new ButtonActionListener(this,"RecargarInformacionAnticipos"));
					
		this.jButtonRecargarInformacionToolBarAnticipos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAnticipos"));
		
		this.jMenuItemRecargarInformacionAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAnticipos"));		
		
		
		
		this.jButtonAnterioresAnticipos.addActionListener (new ButtonActionListener(this,"AnterioresAnticipos"));
		
		
		this.jButtonAnterioresToolBarAnticipos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAnticipos"));
		
		this.jMenuItemAnterioresAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAnticipos"));		
		
		
		this.jButtonSiguientesAnticipos.addActionListener (new ButtonActionListener(this,"SiguientesAnticipos"));
		
		
		this.jButtonSiguientesToolBarAnticipos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAnticipos"));
			
		this.jMenuItemSiguientesAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAnticipos"));
			
		this.jMenuItemAbrirOrderByAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAnticipos"));
			
		this.jMenuItemMostrarOcultarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAnticipos"));
			
		this.jMenuItemDetalleAbrirOrderByAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAnticipos"));
			
		this.jMenuItemDetalleMostarOcultarAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAnticipos"));		
		
		
		this.jButtonNuevoGuardarCambiosAnticipos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAnticipos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAnticipos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAnticipos"));
			
		this.jMenuItemNuevoGuardarCambiosAnticipos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAnticipos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAnticipos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAnticipos"));

		this.jCheckBoxSeleccionadosAnticipos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAnticipos"));
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAnticipos"));
		}
		
		
		this.jComboBoxTiposRelacionesAnticipos.addActionListener (new ButtonActionListener(this,"TiposRelacionesAnticipos"));
			
		this.jComboBoxTiposAccionesAnticipos.addActionListener (new ButtonActionListener(this,"TiposAccionesAnticipos"));
					
		this.jComboBoxTiposSeleccionarAnticipos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAnticipos"));
			
		this.jTextFieldValorCampoGeneralAnticipos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAnticipos"));		
		
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonidAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"idAnticiposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipos.jButtonid_empresaAnticiposUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAnticiposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonid_empresaAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAnticiposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipos.jButtonid_tipo_contratoAnticiposUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_contratoAnticiposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonid_tipo_contratoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_contratoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtoncodigoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"codigoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonfecha_desdeAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonfecha_hastaAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtoncodigo_cargoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cargoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonnombre_estructuraAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estructuraAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtoncodigo_datoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonnombre_completoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonsueldoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"sueldoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonfechaAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"fechaAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonvalorAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"valorAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonvalor_adicionalAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"valor_adicionalAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonvalor_prestamoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"valor_prestamoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtontotalAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"totalAnticiposBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaAnticiposAnticipos.addActionListener(new ButtonActionListener(this,"BusquedaAnticiposAnticipos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAnticipos!=null) {
				this.jInternalFrameReporteDinamicoAnticipos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAnticipos"));
				this.jInternalFrameReporteDinamicoAnticipos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAnticipos"));
				this.jInternalFrameReporteDinamicoAnticipos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAnticipos"));
			}
			
			//this.jButtonCerrarReporteDinamicoAnticipos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAnticipos"));				
			//this.jButtonGenerarReporteDinamicoAnticipos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAnticipos"));
			//this.jButtonGenerarExcelReporteDinamicoAnticipos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAnticipos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAnticipos!=null) {
				this.jInternalFrameImportacionAnticipos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAnticipos"));
				this.jInternalFrameImportacionAnticipos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAnticipos"));
				this.jInternalFrameImportacionAnticipos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAnticipos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAnticipos.addActionListener (new ButtonActionListener(this,"AbrirOrderByAnticipos"));
			
			this.jButtonAbrirOrderByToolBarAnticipos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAnticipos"));			
			
			if(this.jInternalFrameOrderByAnticipos!=null) {
				this.jInternalFrameOrderByAnticipos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAnticipos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAnticipos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipos.jTabbedPaneRelacionesAnticipos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAnticipos"));
		
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
            		closingInternalFrameAnticipos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAnticipos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAnticipos = (JInternalFrameBase)event.getSource();
	            	
	            AnticiposBeanSwingJInternalFrame jInternalFrameParent=(AnticiposBeanSwingJInternalFrame)jInternalFrameDetalleFormAnticipos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAnticiposActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAnticipos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAnticiposListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAnticipos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAnticipos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticiposActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticiposActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticiposActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAnticipos";
		inputMap = this.jButtonNuevoAnticipos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAnticipos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAnticiposActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticiposActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticiposActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticiposActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAnticipos";
		inputMap = this.jButtonNuevoRelacionesAnticipos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAnticipos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAnticiposActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAnticipos";
		inputMap = this.jButtonModificarAnticipos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAnticipos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAnticiposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAnticipos";
		inputMap = this.jButtonActualizarAnticipos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAnticipos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAnticiposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAnticipos";
		inputMap = this.jButtonEliminarAnticipos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAnticipos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAnticiposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAnticipos";
		inputMap = this.jButtonCancelarAnticipos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAnticipos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAnticiposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAnticipos";
		inputMap = this.jButtonCerrarAnticipos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAnticipos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAnticiposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAnticipos";
		inputMap = this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosAnticipos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAnticipos.jButtonGuardarCambiosAnticipos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAnticiposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAnticipos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAnticiposItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAnticipos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAnticiposActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAnticipos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAnticiposActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAnticipos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAnticiposActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonidAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"idAnticiposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipos.jButtonid_empresaAnticiposUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAnticiposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonid_empresaAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAnticiposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipos.jButtonid_tipo_contratoAnticiposUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_contratoAnticiposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonid_tipo_contratoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_contratoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtoncodigoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"codigoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonfecha_desdeAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonfecha_hastaAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtoncodigo_cargoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cargoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonnombre_estructuraAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estructuraAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtoncodigo_datoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonnombre_completoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonsueldoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"sueldoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonfechaAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"fechaAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonvalorAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"valorAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonvalor_adicionalAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"valor_adicionalAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtonvalor_prestamoAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"valor_prestamoAnticiposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipos.jButtontotalAnticiposBusqueda.addActionListener(new ButtonActionListener(this,"totalAnticiposBusqueda"));
		
		
		this.jButtonBusquedaAnticiposAnticipos.addActionListener(new ButtonActionListener(this,"BusquedaAnticiposAnticipos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAnticipos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAnticiposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAnticiposActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAnticipos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAnticipos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Anticipos anticiposAux:this.anticiposLogic.getAnticiposs()) {
					anticiposAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Anticipos anticiposAux:anticiposs) {
					anticiposAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAnticiposItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAnticipos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Anticipos anticiposAux:this.anticiposLogic.getAnticiposs()) {
						anticiposAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Anticipos anticiposAux:anticiposs) {
						anticiposAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Anticipos anticiposAux:this.anticiposLogic.getAnticiposs()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Anticipos anticiposAux:anticiposs) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAnticipos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAnticipos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAnticipos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAnticiposItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAnticipos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAnticipos.getSelectedRows();
			
			Anticipos anticiposLocal=new Anticipos();
			
			//this.seleccionarTodosAnticipos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anticiposLocal =(Anticipos) this.anticiposLogic.getAnticiposs().toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					anticiposLocal =(Anticipos) this.anticiposs.toArray()[this.jTableDatosAnticipos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				anticiposLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Anticipos anticiposAux:this.anticiposLogic.getAnticiposs()) {
						anticiposAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Anticipos anticiposAux:anticiposs) {
						anticiposAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAnticipos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAnticipos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAnticipos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAnticipos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAnticiposItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAnticiposParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAnticiposActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAnticipos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAnticipos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Anticipos anticiposAux:this.anticiposLogic.getAnticiposs()) {
				
						if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							anticiposAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							anticiposAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							anticiposAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_CODIGOCARGO)) {
							existe=true;
							anticiposAux.setcodigo_cargo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA)) {
							existe=true;
							anticiposAux.setnombre_estructura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							anticiposAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							anticiposAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_SUELDO)) {
							existe=true;
							anticiposAux.setsueldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							anticiposAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							anticiposAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_VALORADICIONAL)) {
							existe=true;
							anticiposAux.setvalor_adicional(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_VALORPRESTAMO)) {
							existe=true;
							anticiposAux.setvalor_prestamo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							anticiposAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Anticipos anticiposAux:anticiposs) {
					
						if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							anticiposAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							anticiposAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							anticiposAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_CODIGOCARGO)) {
							existe=true;
							anticiposAux.setcodigo_cargo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA)) {
							existe=true;
							anticiposAux.setnombre_estructura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							anticiposAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							anticiposAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_SUELDO)) {
							existe=true;
							anticiposAux.setsueldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							anticiposAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							anticiposAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_VALORADICIONAL)) {
							existe=true;
							anticiposAux.setvalor_adicional(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_VALORPRESTAMO)) {
							existe=true;
							anticiposAux.setvalor_prestamo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							anticiposAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAnticipos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAnticiposActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAnticipos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAnticipos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAnticipos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAnticipos) {				
					conSplash=true;//false;										
					
					//this.startProcessAnticipos(conSplash);
				
					this.generarReporteAnticipossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAnticipossSeleccionados();
				//this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAnticipossSeleccionados(false);
				//this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAnticipossSeleccionados(true);
				//this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAnticipos();
				
				this.exportarAnticipossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAnticiposs();
				//this.importarAnticiposs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAnticipos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAnticipossSeleccionados();
				//this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Anticipos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAnticipos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAnticipos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAnticipos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Anticipos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.setSelectedIndex(0);					
				}	
			} 			
			else if(AnticiposBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAnticipos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAnticipos(conSplash);
					
						//this.actualizarParametrosGeneralAnticipos();
						
						this.generarReporteProcesoAccionAnticipossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AnticiposBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO AnticiposES SELECCIONADOS?", "MANTENIMIENTO DE Anticipos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAnticipos();
				
						this.actualizarParametrosGeneralAnticipos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.anticiposReturnGeneral=anticiposLogic.procesarAccionAnticipossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.anticiposLogic.getAnticiposs(),this.anticiposParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAnticiposReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAnticipos();
					
					AnticiposBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAnticiposReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAnticipos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAnticipos.jComboBoxTiposAccionesFormularioAnticipos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAnticipos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAnticiposActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAnticipos();
			
			if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();		
			Anticipos anticipos=new Anticipos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAnticipos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAnticipos.getSelectedItem();
			
			
			
			
			anticipossSeleccionados=this.getAnticipossSeleccionados(true);
			//this.sTipoAccion;
			
			if(anticipossSeleccionados.size()==1) {
				for(Anticipos anticiposAux:anticipossSeleccionados) {
					anticipos=anticiposAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAnticipos();
			
      		//this.finishProcessAnticipos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAnticiposReturnGeneral() throws Exception {
		if(this.anticiposReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.anticiposReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.anticiposReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.anticiposReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.anticiposReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.anticiposReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAnticipos(false);
		}
		
		if(this.anticiposReturnGeneral.getConRetornoLista() || this.anticiposReturnGeneral.getConRetornoObjeto()) {
			if(this.anticiposReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.anticiposLogic.setAnticiposs(this.anticiposReturnGeneral.getAnticiposs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingAnticipos(false);
		}
	}
	
	public void actualizarParametrosGeneralAnticipos() throws Exception {
		
		
	}
	
	public ArrayList<Anticipos> getAnticipossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAnticipos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Anticipos anticiposAux:anticiposLogic.getAnticiposs()) {
					if(anticiposAux.getIsSelected()) {
						anticipossSeleccionados.add(anticiposAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Anticipos anticiposAux:this.anticiposs) {
					if(anticiposAux.getIsSelected()) {
						anticipossSeleccionados.add(anticiposAux);				
					}
				}
			}
			
			if(anticipossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						anticipossSeleccionados.addAll(this.anticiposLogic.getAnticiposs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						anticipossSeleccionados.addAll(this.anticiposs);				
					}
				}
			}
		} else {
			anticipossSeleccionados.add(this.anticipos);
		}
		
		return anticipossSeleccionados;
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
	
	public void generarReporteAnticipossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAnticipossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAnticipossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAnticipossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAnticipossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Anticipos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAnticipossSeleccionados() throws Exception {
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();		
		
		anticipossSeleccionados=this.getAnticipossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAnticiposs("Todos",anticipossSeleccionados);
		
	}	
	
	public void generarReporteNormalAnticipossSeleccionados() throws Exception {
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();		
		
		anticipossSeleccionados=this.getAnticipossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAnticiposs("Todos",anticipossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAnticipossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();
		
		anticipossSeleccionados=this.getAnticipossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAnticiposs("Todos",anticipossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAnticipossSeleccionados() throws Exception {
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAnticipos();
		
		
		anticipossSeleccionados=this.getAnticipossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAnticipos();
		
		
		//this.generarReporteAnticiposs("Todos",anticipossSeleccionados ,anticiposImplementable,anticiposImplementableHome);
	}
	
	public void mostrarImportacionAnticiposs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAnticipos();
		
		this.abrirFrameImportacionAnticipos();		
		
			
		//this.generarReporteAnticiposs("Todos",anticipossSeleccionados ,anticiposImplementable,anticiposImplementableHome);
	}
	
	public void importarAnticiposs() throws Exception {		
	
	}
	
	public void exportarAnticipossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAnticipossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAnticipossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAnticipossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Anticipos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAnticipossSeleccionados() throws Exception {
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();		
		
		anticipossSeleccionados=this.getAnticipossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAnticipos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Anticipos anticiposAux:anticipossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAnticipos(anticiposAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//anticiposAux.setsDetalleGeneralEntityReporte(anticiposAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticiposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAnticipos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_IDTIPOCONTRATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_CODIGOCARGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_CODIGODATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_SUELDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_VALORADICIONAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_VALORPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticiposConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAnticipos(Anticipos anticipos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=anticipos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.gettipocontrato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getcodigo_cargo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getnombre_estructura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getcodigo_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getsueldo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getvalor_adicional().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.getvalor_prestamo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipos.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAnticipossSeleccionados() throws Exception {
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();		
		
		anticipossSeleccionados=this.getAnticipossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Anticiposs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAnticipos(row);				
				iRow++;
			}				
			
			for(Anticipos anticiposAux:anticipossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAnticipos(anticiposAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticiposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAnticipossSeleccionados() throws Exception {
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();		
		
		anticipossSeleccionados=this.getAnticipossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("anticiposs");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("anticipos");
			//elementRoot.appendChild(element);
		
			for(Anticipos anticiposAux:anticipossSeleccionados) {
				element = document.createElement("anticipos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAnticipos(anticiposAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticiposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAnticipos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_IDTIPOCONTRATO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_CODIGOCARGO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_CODIGODATO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_SUELDO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_VALORADICIONAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_VALORPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticiposConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAnticipos(Anticipos anticipos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.gettipocontrato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getcodigo_cargo());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getnombre_estructura());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getcodigo_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getsueldo());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getvalor_adicional());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.getvalor_prestamo());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipos.gettotal());				
	}
	
	public void setFilaDatosExportarXmlAnticipos(Anticipos anticipos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AnticiposConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(anticipos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AnticiposConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(anticipos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AnticiposConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(anticipos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipocontrato_descripcion = document.createElement(AnticiposConstantesFunciones.IDTIPOCONTRATO);
		elementtipocontrato_descripcion.appendChild(document.createTextNode(anticipos.gettipocontrato_descripcion()));
		element.appendChild(elementtipocontrato_descripcion);

		Element elementcodigo = document.createElement(AnticiposConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(anticipos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementfecha_desde = document.createElement(AnticiposConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(anticipos.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(AnticiposConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(anticipos.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementcodigo_cargo = document.createElement(AnticiposConstantesFunciones.CODIGOCARGO);
		elementcodigo_cargo.appendChild(document.createTextNode(anticipos.getcodigo_cargo().trim()));
		element.appendChild(elementcodigo_cargo);

		Element elementnombre_estructura = document.createElement(AnticiposConstantesFunciones.NOMBREESTRUCTURA);
		elementnombre_estructura.appendChild(document.createTextNode(anticipos.getnombre_estructura().trim()));
		element.appendChild(elementnombre_estructura);

		Element elementcodigo_dato = document.createElement(AnticiposConstantesFunciones.CODIGODATO);
		elementcodigo_dato.appendChild(document.createTextNode(anticipos.getcodigo_dato().trim()));
		element.appendChild(elementcodigo_dato);

		Element elementnombre_completo = document.createElement(AnticiposConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(anticipos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementsueldo = document.createElement(AnticiposConstantesFunciones.SUELDO);
		elementsueldo.appendChild(document.createTextNode(anticipos.getsueldo().toString().trim()));
		element.appendChild(elementsueldo);

		Element elementfecha = document.createElement(AnticiposConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(anticipos.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementvalor = document.createElement(AnticiposConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(anticipos.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementvalor_adicional = document.createElement(AnticiposConstantesFunciones.VALORADICIONAL);
		elementvalor_adicional.appendChild(document.createTextNode(anticipos.getvalor_adicional().toString().trim()));
		element.appendChild(elementvalor_adicional);

		Element elementvalor_prestamo = document.createElement(AnticiposConstantesFunciones.VALORPRESTAMO);
		elementvalor_prestamo.appendChild(document.createTextNode(anticipos.getvalor_prestamo().toString().trim()));
		element.appendChild(elementvalor_prestamo);

		Element elementtotal = document.createElement(AnticiposConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(anticipos.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoAnticipossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Anticipos> anticipossSeleccionados=new ArrayList<Anticipos>();
		
		anticipossSeleccionados=this.getAnticipossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAnticipos(anticipossSeleccionados);
		
		this.generarReporteAnticiposs("Todos",anticipossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAnticipos(ArrayList<Anticipos> anticipossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Anticipos anticiposAux:anticipossSeleccionados) {
				anticiposAux.setsDetalleGeneralEntityReporte(anticiposAux.toString());
			
				if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					anticiposAux.setsDescripcionGeneralEntityReporte1(anticiposAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_IDTIPOCONTRATO)) {
					existe=true;
					anticiposAux.setsDescripcionGeneralEntityReporte1(anticiposAux.gettipocontrato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					anticiposAux.setsDescripcionGeneralEntityReporte1(anticiposAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					anticiposAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(anticiposAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					anticiposAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(anticiposAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_CODIGOCARGO)) {
					existe=true;
					anticiposAux.setsDescripcionGeneralEntityReporte1(anticiposAux.getcodigo_cargo());
				}
				 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA)) {
					existe=true;
					anticiposAux.setsDescripcionGeneralEntityReporte1(anticiposAux.getnombre_estructura());
				}
				 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_CODIGODATO)) {
					existe=true;
					anticiposAux.setsDescripcionGeneralEntityReporte1(anticiposAux.getcodigo_dato());
				}
				 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					anticiposAux.setsDescripcionGeneralEntityReporte1(anticiposAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(AnticiposConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					anticiposAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(anticiposAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticiposConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAnticipos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAnticipos=true;
				this.isVisibilidadCeldaNuevoRelacionesAnticipos=true;
				this.isVisibilidadCeldaGuardarCambiosAnticipos=true;
			}
			
			this.isVisibilidadCeldaModificarAnticipos=false;
			this.isVisibilidadCeldaActualizarAnticipos=false;
			this.isVisibilidadCeldaEliminarAnticipos=false;
			this.isVisibilidadCeldaCancelarAnticipos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipos=true;
				} else {
					this.isVisibilidadCeldaGuardarAnticipos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAnticipos=false;
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipos=false;
			this.isVisibilidadCeldaModificarAnticipos=false;
			this.isVisibilidadCeldaActualizarAnticipos=true;
			this.isVisibilidadCeldaEliminarAnticipos=false;
			this.isVisibilidadCeldaCancelarAnticipos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipos=true;
				} else {
					this.isVisibilidadCeldaGuardarAnticipos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAnticipos=false;
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipos=false;
			this.isVisibilidadCeldaModificarAnticipos=false;
			this.isVisibilidadCeldaActualizarAnticipos=true;
			this.isVisibilidadCeldaEliminarAnticipos=true;
			this.isVisibilidadCeldaCancelarAnticipos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipos=true;
				} else {
					this.isVisibilidadCeldaGuardarAnticipos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAnticipos=false;
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipos=false;
			this.isVisibilidadCeldaModificarAnticipos=false;
			this.isVisibilidadCeldaActualizarAnticipos=true;
			this.isVisibilidadCeldaEliminarAnticipos=false;
			this.isVisibilidadCeldaCancelarAnticipos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipos=false;
				} else {
					this.isVisibilidadCeldaGuardarAnticipos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAnticipos=true;
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=true;
			this.isVisibilidadCeldaGuardarCambiosAnticipos=true;
			this.isVisibilidadCeldaModificarAnticipos=false;
			this.isVisibilidadCeldaActualizarAnticipos=false;
			this.isVisibilidadCeldaEliminarAnticipos=false;
			this.isVisibilidadCeldaCancelarAnticipos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipos=true;
				} else {
					this.isVisibilidadCeldaGuardarAnticipos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAnticipos=false;
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipos=false;
			this.isVisibilidadCeldaActualizarAnticipos=false;
			this.isVisibilidadCeldaEliminarAnticipos=false;
			this.isVisibilidadCeldaCancelarAnticipos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipos=false;
				} else {
					this.isVisibilidadCeldaGuardarAnticipos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAnticipos=false;
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipos=false;
			this.isVisibilidadCeldaModificarAnticipos=true;
			this.isVisibilidadCeldaActualizarAnticipos=false;
			this.isVisibilidadCeldaEliminarAnticipos=false;
			this.isVisibilidadCeldaCancelarAnticipos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipos=false;
				} else {
					this.isVisibilidadCeldaGuardarAnticipos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AnticiposJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAnticipos=true;
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=true;
			this.isVisibilidadCeldaGuardarCambiosAnticipos=true;
		} else {
			this.actualizarEstadoPanelsAnticipos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAnticipos=false;
			//this.isVisibilidadCeldaVerFormAnticipos=false;
			this.isVisibilidadCeldaDuplicarAnticipos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!anticiposSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=false;
		} else {
			this.isVisibilidadCeldaNuevoAnticipos=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(anticiposSessionBean.getEsGuardarRelacionado()) {
			if(!anticiposSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAnticipos=false;												
			}
			
			this.jButtonCerrarAnticipos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAnticipos=false;
		}
		
		if(!this.permiteMantenimiento(this.anticipos)) {
			this.isVisibilidadCeldaActualizarAnticipos=false;
			this.isVisibilidadCeldaEliminarAnticipos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoAnticipos=false;
		this.isVisibilidadCeldaNuevoRelacionesAnticipos=false;
		this.isVisibilidadCeldaGuardarCambiosAnticipos=false;
		//this.isVisibilidadCeldaModificarAnticipos=true;
		this.isVisibilidadCeldaActualizarAnticipos=false;
		this.isVisibilidadCeldaEliminarAnticipos=false;
		//this.isVisibilidadCeldaCancelarAnticipos=true;			
		this.isVisibilidadCeldaGuardarAnticipos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAnticipos() {
	}
	
	public void actualizarEstadoPanelsAnticipos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAnticipos!=null) {
				this.jScrollPanelDatosEdicionAnticipos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipos!=null) {
				this.jTabbedPaneBusquedasAnticipos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAnticipos!=null) {
				this.jScrollPanelDatosAnticipos.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnticipos!=null) {
				this.jPanelPaginacionAnticipos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnticipos!=null) {
				this.jPanelParametrosReportesAnticipos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAnticipos!=null) {
				this.jScrollPanelDatosEdicionAnticipos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipos!=null) {
				this.jTabbedPaneBusquedasAnticipos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAnticipos!=null) {
				this.jScrollPanelDatosAnticipos.setVisible(false);
			}
			
			if(this.jPanelPaginacionAnticipos!=null) {
				this.jPanelPaginacionAnticipos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAnticipos!=null) {
				this.jPanelParametrosReportesAnticipos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAnticipos!=null) {
				this.jScrollPanelDatosEdicionAnticipos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipos!=null) {
				this.jTabbedPaneBusquedasAnticipos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAnticipos!=null) {
				this.jScrollPanelDatosAnticipos.setVisible(false);
			}
			
			if(this.jPanelPaginacionAnticipos!=null) {
				this.jPanelPaginacionAnticipos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAnticipos!=null) {
				this.jPanelParametrosReportesAnticipos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAnticipos!=null) {
				this.jScrollPanelDatosEdicionAnticipos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipos!=null) {
				this.jTabbedPaneBusquedasAnticipos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAnticipos!=null) {
				this.jScrollPanelDatosAnticipos.setVisible(false);
			}
			
			if(this.jPanelPaginacionAnticipos!=null) {
				this.jPanelPaginacionAnticipos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAnticipos!=null) {
				this.jPanelParametrosReportesAnticipos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAnticipos!=null) {
				this.jScrollPanelDatosEdicionAnticipos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipos!=null) {
				this.jTabbedPaneBusquedasAnticipos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAnticipos!=null) {
				this.jScrollPanelDatosAnticipos.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnticipos!=null) {
				this.jPanelPaginacionAnticipos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnticipos!=null) {
				this.jPanelParametrosReportesAnticipos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAnticipos!=null) {
				this.jScrollPanelDatosEdicionAnticipos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipos!=null) {
				this.jTabbedPaneBusquedasAnticipos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAnticipos!=null) {
				this.jScrollPanelDatosAnticipos.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnticipos!=null) {
				this.jPanelPaginacionAnticipos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnticipos!=null) {
				this.jPanelParametrosReportesAnticipos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAnticipos!=null) {
				this.jScrollPanelDatosEdicionAnticipos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipos!=null) {
				this.jTabbedPaneBusquedasAnticipos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAnticipos!=null) {
				this.jScrollPanelDatosAnticipos.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnticipos!=null) {
				this.jPanelPaginacionAnticipos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnticipos!=null) {
				this.jPanelParametrosReportesAnticipos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.anticiposSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAnticipos!=null) {
					this.jTabbedPaneBusquedasAnticipos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAnticipos!=null) {
				this.jPanelParametrosReportesAnticipos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.anticiposSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipos!=null) {
				this.jTabbedPaneBusquedasAnticipos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAnticipos!=null) {
				this.jPanelParametrosReportesAnticipos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaAnticipos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaAnticipos) {this.jTabbedPaneBusquedasAnticipos.remove(jPanelBusquedaAnticiposAnticipos);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoContrato(Boolean isParaTipoContrato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoContratoNegation=!isParaTipoContrato;

			this.isVisibilidadBusquedaAnticipos=isParaTipoContrato;
			if(!this.isVisibilidadBusquedaAnticipos) {this.jTabbedPaneBusquedasAnticipos.remove(jPanelBusquedaAnticiposAnticipos);}
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
			
			this.inicializarActualizarBindingTablaAnticipos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAnticipos() {
		this.updateBorderResaltarBusquedasFormularioAnticipos();
		this.updateVisibilidadBusquedasFormularioAnticipos();
		this.updateHabilitarBusquedasFormularioAnticipos();
	}
	
	public void updateBorderResaltarBusquedasFormularioAnticipos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAnticipos.getComponents().length>0) {
	

		if(this.anticiposConstantesFunciones.resaltarBusquedaAnticiposAnticipos!=null) {
			index= this.jTabbedPaneBusquedasAnticipos.indexOfComponent(this.jPanelBusquedaAnticiposAnticipos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipos.getComponent(index);
				jPanel.setBorder(this.anticiposConstantesFunciones.resaltarBusquedaAnticiposAnticipos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAnticipos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAnticipos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAnticipos.indexOfComponent(this.jPanelBusquedaAnticiposAnticipos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.anticiposConstantesFunciones.mostrarBusquedaAnticiposAnticipos);
			if(!this.anticiposConstantesFunciones.mostrarBusquedaAnticiposAnticipos && index>-1) {
				this.jTabbedPaneBusquedasAnticipos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAnticipos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAnticipos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAnticipos.indexOfComponent(this.jPanelBusquedaAnticiposAnticipos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.anticiposConstantesFunciones.activarBusquedaAnticiposAnticipos);
				this.jTabbedPaneBusquedasAnticipos.setEnabledAt(index,this.anticiposConstantesFunciones.activarBusquedaAnticiposAnticipos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAnticipos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaAnticipos")) {
			index= this.jTabbedPaneBusquedasAnticipos.indexOfComponent(this.jPanelBusquedaAnticiposAnticipos);

			this.jTabbedPaneBusquedasAnticipos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipos.getComponent(index);

			this.anticiposConstantesFunciones.setResaltarBusquedaAnticiposAnticipos(resaltar);

			jPanel.setBorder(this.anticiposConstantesFunciones.resaltarBusquedaAnticiposAnticipos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAnticipos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAnticipos() throws Exception {

		if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAnticipos();
		this.updateVisibilidadResaltarControlesFormularioAnticipos();
		this.updateHabilitarResaltarControlesFormularioAnticipos();
		
	}
	
	public void updateBorderResaltarControlesFormularioAnticipos() throws Exception {
		if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.anticiposConstantesFunciones.resaltaridAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.setBorder(this.anticiposConstantesFunciones.resaltaridAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarid_empresaAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarid_empresaAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarid_tipo_contratoAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarid_tipo_contratoAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarcodigoAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigoAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarcodigoAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarfecha_desdeAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jDateChooserfecha_desdeAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarfecha_desdeAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarfecha_hastaAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jDateChooserfecha_hastaAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarfecha_hastaAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarcodigo_cargoAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_cargoAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarcodigo_cargoAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarnombre_estructuraAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_estructuraAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarnombre_estructuraAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarcodigo_datoAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_datoAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarcodigo_datoAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarnombre_completoAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_completoAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarnombre_completoAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarsueldoAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jTextFieldsueldoAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarsueldoAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarfechaAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jDateChooserfechaAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarfechaAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarvalorAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jTextFieldvalorAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarvalorAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarvalor_adicionalAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_adicionalAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarvalor_adicionalAnticipos);}
		if(this.anticiposConstantesFunciones.resaltarvalor_prestamoAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_prestamoAnticipos.setBorder(this.anticiposConstantesFunciones.resaltarvalor_prestamoAnticipos);}
		if(this.anticiposConstantesFunciones.resaltartotalAnticipos!=null && this.jInternalFrameDetalleFormAnticipos!=null) {this.jInternalFrameDetalleFormAnticipos.jTextFieldtotalAnticipos.setBorder(this.anticiposConstantesFunciones.resaltartotalAnticipos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAnticipos() throws Exception {		
		if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) {
	
		//this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.setVisible(this.anticiposConstantesFunciones.mostraridAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelidAnticipos.setVisible(this.anticiposConstantesFunciones.mostraridAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarid_empresaAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelid_empresaAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarid_empresaAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarid_tipo_contratoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelid_tipo_contratoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarid_tipo_contratoAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarcodigoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelcodigoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarcodigoAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jDateChooserfecha_desdeAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarfecha_desdeAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelfecha_desdeAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarfecha_desdeAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jDateChooserfecha_hastaAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarfecha_hastaAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelfecha_hastaAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarfecha_hastaAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_cargoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarcodigo_cargoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelcodigo_cargoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarcodigo_cargoAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_estructuraAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarnombre_estructuraAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelnombre_estructuraAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarnombre_estructuraAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_datoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarcodigo_datoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelcodigo_datoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarcodigo_datoAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_completoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarnombre_completoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelnombre_completoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarnombre_completoAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jTextFieldsueldoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarsueldoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelsueldoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarsueldoAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jDateChooserfechaAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarfechaAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelfechaAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarfechaAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jTextFieldvalorAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarvalorAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelvalorAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarvalorAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_adicionalAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarvalor_adicionalAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelvalor_adicionalAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarvalor_adicionalAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_prestamoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarvalor_prestamoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPanelvalor_prestamoAnticipos.setVisible(this.anticiposConstantesFunciones.mostrarvalor_prestamoAnticipos);
		//this.jInternalFrameDetalleFormAnticipos.jTextFieldtotalAnticipos.setVisible(this.anticiposConstantesFunciones.mostrartotalAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jPaneltotalAnticipos.setVisible(this.anticiposConstantesFunciones.mostrartotalAnticipos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAnticipos() throws Exception {
		if(this.jInternalFrameDetalleFormAnticipos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAnticipos!=null) {
	
		this.jInternalFrameDetalleFormAnticipos.jLabelidAnticipos.setEnabled(this.anticiposConstantesFunciones.activaridAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jComboBoxid_empresaAnticipos.setEnabled(this.anticiposConstantesFunciones.activarid_empresaAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jComboBoxid_tipo_contratoAnticipos.setEnabled(this.anticiposConstantesFunciones.activarid_tipo_contratoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigoAnticipos.setEnabled(this.anticiposConstantesFunciones.activarcodigoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jDateChooserfecha_desdeAnticipos.setEnabled(this.anticiposConstantesFunciones.activarfecha_desdeAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jDateChooserfecha_hastaAnticipos.setEnabled(this.anticiposConstantesFunciones.activarfecha_hastaAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_cargoAnticipos.setEnabled(this.anticiposConstantesFunciones.activarcodigo_cargoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_estructuraAnticipos.setEnabled(this.anticiposConstantesFunciones.activarnombre_estructuraAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldcodigo_datoAnticipos.setEnabled(this.anticiposConstantesFunciones.activarcodigo_datoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextAreanombre_completoAnticipos.setEnabled(this.anticiposConstantesFunciones.activarnombre_completoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldsueldoAnticipos.setEnabled(this.anticiposConstantesFunciones.activarsueldoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jDateChooserfechaAnticipos.setEnabled(this.anticiposConstantesFunciones.activarfechaAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldvalorAnticipos.setEnabled(this.anticiposConstantesFunciones.activarvalorAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_adicionalAnticipos.setEnabled(this.anticiposConstantesFunciones.activarvalor_adicionalAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldvalor_prestamoAnticipos.setEnabled(this.anticiposConstantesFunciones.activarvalor_prestamoAnticipos);
		this.jInternalFrameDetalleFormAnticipos.jTextFieldtotalAnticipos.setEnabled(this.anticiposConstantesFunciones.activartotalAnticipos);
		}
	}
	
		
}